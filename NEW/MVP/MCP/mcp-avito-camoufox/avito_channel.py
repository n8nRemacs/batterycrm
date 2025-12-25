"""
Avito Channel - Avito operations via Camoufox browser.

Features:
- Login with phone/password + SMS
- Real-time WebSocket with heartbeat
- Get chats, messages
- Send messages
- All through real browser (no TLS fingerprint issues)
"""

import asyncio
import json
import logging
import random
from typing import Dict, Any, Optional, Callable, List
from datetime import datetime

import httpx

logger = logging.getLogger(__name__)

# Configuration
HEARTBEAT_INTERVAL = 25  # seconds
HEARTBEAT_JITTER = 5     # ± seconds
RECONNECT_DELAYS = [5, 10, 20, 40, 80, 160, 300]
N8N_WEBHOOK = "https://n8n.n8nsrv.ru/webhook/avito-camoufox/incoming"


class AvitoChannel:
    """
    Avito channel handler using Camoufox browser.

    All API calls go through browser's fetch() = correct TLS fingerprint.
    WebSocket injected into page = browser's WebSocket implementation.
    """

    def __init__(
        self,
        page: Any,  # Playwright/Camoufox page
        account_id: str,
        on_message: Optional[Callable[[Dict], None]] = None,
        n8n_webhook: str = N8N_WEBHOOK,
    ):
        self.page = page
        self.account_id = account_id
        self.on_message = on_message
        self.n8n_webhook = n8n_webhook

        self._listening = False
        self._reconnect_attempt = 0
        self._seq = 0
        self._hash_id = None
        self._ws_connected = False

    # === Login ===

    async def is_logged_in(self) -> bool:
        """Check if logged in by looking for ft/f/sessid cookie."""
        try:
            cookies = await self.page.context.cookies()
            for cookie in cookies:
                if cookie["name"] in ("ft", "f", "sessid") and cookie["value"]:
                    return True
        except Exception as e:
            logger.warning(f"Error checking login: {e}")
        return False

    async def login_with_credentials(self, phone: str, password: str) -> Dict[str, Any]:
        """
        Login with phone and password.

        Returns:
            {"status": "success"} - logged in
            {"status": "sms_required"} - need SMS code
            {"status": "error", "message": "..."} - error
        """
        try:
            # Go to desktop version (mobile blocked)
            await self.page.goto("https://www.avito.ru/", wait_until="domcontentloaded", timeout=30000)
            await asyncio.sleep(3)

            # Check for CAPTCHA/IP block
            text = await self.page.evaluate("() => document.body.innerText.substring(0, 300)")
            if "captcha" in text.lower() or "Доступ ограничен" in text:
                return {"status": "error", "message": "IP blocked by Avito (CAPTCHA)"}

            # Click login button
            login_btn = await self.page.wait_for_selector(
                '[data-marker="header/login-button"]',
                timeout=10000
            )
            await login_btn.click()
            await asyncio.sleep(2)

            # Enter phone
            phone_input = await self.page.wait_for_selector(
                'input[name="login"]',
                timeout=10000
            )
            await phone_input.fill(phone)
            await asyncio.sleep(0.5)

            # Enter password
            password_input = await self.page.wait_for_selector(
                'input[name="password"]',
                timeout=5000
            )
            await password_input.fill(password)
            await asyncio.sleep(0.5)

            # Click submit button
            buttons = await self.page.query_selector_all('button')
            for btn in buttons:
                btn_text = await btn.text_content()
                if btn_text and "Войти" in btn_text:
                    await btn.click()
                    break

            await asyncio.sleep(5)

            # Check for SMS input
            sms_input = await self.page.query_selector(
                'input[inputmode="numeric"], input[autocomplete="one-time-code"], input[maxlength="5"], input[maxlength="6"]'
            )
            if sms_input:
                logger.info(f"[{self.account_id}] SMS code required")
                return {"status": "sms_required"}

            # Check if logged in
            if await self.is_logged_in():
                logger.info(f"[{self.account_id}] Login successful")
                return {"status": "success"}

            # Check for error
            page_text = await self.page.evaluate("() => document.body.innerText")
            if "неверн" in page_text.lower() or "ошибка" in page_text.lower():
                return {"status": "error", "message": "Invalid credentials"}

            return {"status": "unknown"}

        except Exception as e:
            logger.error(f"[{self.account_id}] Login error: {e}")
            return {"status": "error", "message": str(e)}

    async def request_sms_code(self) -> Dict[str, Any]:
        """Request SMS code instead of push notification."""
        try:
            # Look for "получить в смс" or similar link
            links = await self.page.query_selector_all('a, button, span[role="button"]')
            for link in links:
                text = await link.text_content()
                if text and ("смс" in text.lower() or "sms" in text.lower()):
                    logger.info(f"[{self.account_id}] Clicking SMS request: {text}")
                    await link.click()
                    await asyncio.sleep(3)
                    return {"status": "sms_requested", "message": "SMS code requested"}

            return {"status": "not_found", "message": "SMS request link not found"}
        except Exception as e:
            logger.error(f"[{self.account_id}] Request SMS error: {e}")
            return {"status": "error", "message": str(e)}

    async def get_page_content(self) -> Dict[str, Any]:
        """Get current page content for debugging."""
        try:
            url = self.page.url
            text = await self.page.evaluate("() => document.body.innerText.substring(0, 1000)")

            # Find buttons
            buttons = await self.page.query_selector_all('button, a')
            button_texts = []
            for btn in buttons[:10]:
                btn_text = await btn.text_content()
                if btn_text and btn_text.strip():
                    button_texts.append(btn_text.strip()[:50])

            return {
                "url": url,
                "text": text,
                "buttons": button_texts
            }
        except Exception as e:
            return {"error": str(e)}

    async def navigate_to_messenger(self) -> Dict[str, Any]:
        """Navigate to messenger page and get chats from DOM."""
        try:
            await self.page.goto("https://www.avito.ru/profile/messenger", wait_until="domcontentloaded", timeout=30000)
            await asyncio.sleep(3)

            url = self.page.url
            text = await self.page.evaluate("() => document.body.innerText")

            # Try to extract hash_id from page
            hash_id = await self.page.evaluate("""
                () => {
                    // Try various ways to get user ID
                    if (window.__initialData__) return window.__initialData__.user?.id;
                    if (window.dataLayer) {
                        for (let d of window.dataLayer) {
                            if (d.userId) return d.userId;
                        }
                    }
                    return null;
                }
            """)

            if hash_id:
                self._hash_id = str(hash_id)
                logger.info(f"[{self.account_id}] Got hash_id: {hash_id}")

            # Get chat list from page
            chats = []
            chat_elements = await self.page.query_selector_all('[data-marker*="channel"], [class*="channel-item"], [class*="chat-item"]')
            for el in chat_elements[:20]:
                chat_text = await el.text_content()
                if chat_text:
                    chats.append(chat_text.strip()[:100])

            return {
                "url": url,
                "hash_id": hash_id,
                "chats_count": len(chats),
                "chats": chats,
                "page_preview": text[:500]
            }
        except Exception as e:
            logger.error(f"[{self.account_id}] Navigate to messenger error: {e}")
            return {"error": str(e)}

    async def submit_sms_code(self, code: str) -> Dict[str, Any]:
        """Submit SMS verification code."""
        try:
            # Find SMS input with various selectors
            sms_input = await self.page.query_selector(
                'input[inputmode="numeric"], input[autocomplete="one-time-code"], input[maxlength="5"], input[maxlength="6"]'
            )
            if not sms_input:
                # Try any input that's not login/password/remember
                inputs = await self.page.query_selector_all('input:not([type="hidden"])')
                for inp in inputs:
                    name = await inp.get_attribute("name")
                    if name not in ["login", "password", "remember", None]:
                        sms_input = inp
                        break

            if not sms_input:
                return {"status": "error", "message": "SMS input not found"}

            await sms_input.fill(code)
            await asyncio.sleep(2)

            # Try to find and click submit button
            submit = await self.page.query_selector('button[type="submit"]')
            if submit:
                await submit.click()

            await asyncio.sleep(5)

            if await self.is_logged_in():
                logger.info(f"[{self.account_id}] SMS login successful")
                return {"status": "success"}

            # Check for errors in page text
            page_text = await self.page.evaluate("() => document.body.innerText")
            if "неверн" in page_text.lower() or "ошибка" in page_text.lower() or "истек" in page_text.lower():
                return {"status": "error", "message": "Invalid or expired code"}

            return {"status": "unknown"}

        except Exception as e:
            logger.error(f"[{self.account_id}] SMS submit error: {e}")
            return {"status": "error", "message": str(e)}

    # === API Calls (through browser) ===

    async def _api_call(self, endpoint: str, method: str = "GET", data: Dict = None) -> Dict:
        """Make API call through browser's fetch()."""
        url = f"https://www.avito.ru{endpoint}"

        if method == "GET":
            result = await self.page.evaluate(f"""
                async () => {{
                    try {{
                        const res = await fetch("{url}");
                        return await res.json();
                    }} catch (e) {{
                        return {{"error": e.message}};
                    }}
                }}
            """)
        else:
            result = await self.page.evaluate(f"""
                async () => {{
                    try {{
                        const res = await fetch("{url}", {{
                            method: "POST",
                            headers: {{"Content-Type": "application/json"}},
                            body: JSON.stringify({json.dumps(data)})
                        }});
                        return await res.json();
                    }} catch (e) {{
                        return {{"error": e.message}};
                    }}
                }}
            """)

        return result

    async def get_profile(self) -> Dict[str, Any]:
        """Get current user profile."""
        result = await self._api_call("/api/1/profile/short")
        if result and not result.get("error"):
            self._hash_id = result.get("public_id")
        return result

    async def _extract_hash_id(self) -> Optional[str]:
        """
        Extract hash_id (public_id) from multiple sources.
        Returns the first found hash_id or None.
        """
        # 1. Try API profile
        try:
            profile = await self.get_profile()
            if profile.get("public_id"):
                self._hash_id = profile["public_id"]
                logger.info(f"[{self.account_id}] hash_id from API: {self._hash_id}")
                return self._hash_id
        except Exception as e:
            logger.debug(f"[{self.account_id}] API profile failed: {e}")

        # 2. Navigate to messenger if not there
        current_url = self.page.url
        if "messenger" not in current_url:
            await self.page.goto("https://www.avito.ru/profile/messenger", wait_until="domcontentloaded")
            await asyncio.sleep(3)

        # 3. Try to extract from page JavaScript
        hash_id = await self.page.evaluate("""
            () => {
                // Try window.__initialData__ (main source)
                if (window.__initialData__) {
                    if (window.__initialData__.user?.publicId) return window.__initialData__.user.publicId;
                    if (window.__initialData__.user?.id) return window.__initialData__.user.id;
                    if (window.__initialData__.userId) return window.__initialData__.userId;
                }

                // Try window.__PRELOADED_STATE__
                if (window.__PRELOADED_STATE__) {
                    const state = window.__PRELOADED_STATE__;
                    if (state.user?.publicId) return state.user.publicId;
                    if (state.user?.id) return state.user.id;
                }

                // Try dataLayer
                if (window.dataLayer) {
                    for (let item of window.dataLayer) {
                        if (item.userId) return item.userId;
                        if (item.user_id) return item.user_id;
                        if (item.userPublicId) return item.userPublicId;
                    }
                }

                // Try localStorage
                try {
                    const storedUser = localStorage.getItem('user');
                    if (storedUser) {
                        const user = JSON.parse(storedUser);
                        if (user.publicId) return user.publicId;
                        if (user.id) return user.id;
                    }
                } catch {}

                // Try to find in window object
                for (let key of Object.keys(window)) {
                    if (key.startsWith('__') && window[key]?.user?.publicId) {
                        return window[key].user.publicId;
                    }
                }

                return null;
            }
        """)

        if hash_id:
            self._hash_id = str(hash_id)
            logger.info(f"[{self.account_id}] hash_id from JS: {self._hash_id}")
            return self._hash_id

        # 4. Try to extract from script tags (multiple patterns)
        hash_id = await self.page.evaluate("""
            () => {
                const scripts = document.querySelectorAll('script');
                for (let script of scripts) {
                    const text = script.textContent || '';

                    // Pattern 1: "publicId":"abc123" or publicId:"abc123"
                    let match = text.match(/["']?publicId["']?\s*[:\=]\s*["']([a-zA-Z0-9_-]+)["']/);
                    if (match) return match[1];

                    // Pattern 2: public_id
                    match = text.match(/["']?public_id["']?\s*[:\=]\s*["']([a-zA-Z0-9_-]+)["']/);
                    if (match) return match[1];

                    // Pattern 3: "userId":123456 or userId:123456
                    match = text.match(/["']?userId["']?\s*[:\=]\s*["']?(\d{5,12})["']?/);
                    if (match) return match[1];

                    // Pattern 4: user_id
                    match = text.match(/["']?user_id["']?\s*[:\=]\s*["']?(\d{5,12})["']?/);
                    if (match) return match[1];

                    // Pattern 5: my_hash_id in WebSocket URL
                    match = text.match(/my_hash_id[=:]([a-zA-Z0-9_-]+)/);
                    if (match) return match[1];

                    // Pattern 6: "id":123456 in user context
                    if (text.includes('user') || text.includes('profile')) {
                        match = text.match(/"id"\s*:\s*(\d{5,12})/);
                        if (match) return match[1];
                    }
                }
                return null;
            }
        """)

        if hash_id:
            self._hash_id = str(hash_id)
            logger.info(f"[{self.account_id}] hash_id from script: {self._hash_id}")
            return self._hash_id

        # 5. Try to find in messenger channel links (a2u-USER_ID-OTHER_ID pattern)
        hash_id = await self.page.evaluate("""
            () => {
                // Look for a2u- pattern in messenger channel links
                // Pattern: /profile/messenger/channel/a2u-191717891-157920214
                // First number is current user ID
                const a2uLinks = document.querySelectorAll('a[href*="/messenger/channel/a2u-"]');
                for (let link of a2uLinks) {
                    const href = link.getAttribute('href');
                    const match = href.match(/a2u-(\\d+)-/);
                    if (match && match[1]) return match[1];
                }

                // Check data attributes
                const elements = document.querySelectorAll('[data-user-id], [data-userid], [data-hash-id]');
                for (let el of elements) {
                    const id = el.getAttribute('data-user-id') || el.getAttribute('data-userid') || el.getAttribute('data-hash-id');
                    if (id && id.length > 4) return id;
                }

                // Check links that might contain user ID
                const links = document.querySelectorAll('a[href*="/user/"], a[href*="/profile/"]');
                for (let link of links) {
                    const href = link.getAttribute('href');
                    const match = href.match(/\\/(?:user|profile)\\/([a-zA-Z0-9_-]+)/);
                    if (match && match[1].length > 4) return match[1];
                }

                // Check for messenger URL patterns
                const messengerLinks = document.querySelectorAll('a[href*="messenger"]');
                for (let link of messengerLinks) {
                    const href = link.getAttribute('href');
                    const match = href.match(/[?&](?:user|id)=([a-zA-Z0-9_-]+)/);
                    if (match) return match[1];
                }

                // Check meta tags
                const metas = document.querySelectorAll('meta[name*="user"], meta[property*="user"]');
                for (let meta of metas) {
                    const content = meta.getAttribute('content');
                    if (content && /^[a-zA-Z0-9_-]{5,20}$/.test(content)) return content;
                }

                return null;
            }
        """)

        if hash_id:
            self._hash_id = str(hash_id)
            logger.info(f"[{self.account_id}] hash_id from HTML: {self._hash_id}")
            return self._hash_id

        # 6. Try to intercept from page's WebSocket URL if already connected
        ws_url = await self.page.evaluate("""
            () => {
                if (window.__avitoWS && window.__avitoWS.url) {
                    const match = window.__avitoWS.url.match(/my_hash_id=([a-zA-Z0-9_-]+)/);
                    if (match) return match[1];
                }
                return null;
            }
        """)

        if ws_url:
            self._hash_id = str(ws_url)
            logger.info(f"[{self.account_id}] hash_id from WS URL: {self._hash_id}")
            return self._hash_id

        logger.warning(f"[{self.account_id}] Could not extract hash_id from any source")
        return None

    async def get_chats(self, limit: int = 50) -> List[Dict]:
        """Get list of chats."""
        result = await self._api_call(
            "/web/1/messenger/getChannels",
            method="POST",
            data={"limit": limit, "offset": 0}
        )
        return result.get("result", {}).get("channels", [])

    async def get_messages(self, chat_id: str, limit: int = 50) -> List[Dict]:
        """Get messages from chat."""
        result = await self._api_call(
            "/web/1/messenger/getUserVisibleMessages",
            method="POST",
            data={"channelId": chat_id, "limit": limit}
        )
        return result.get("result", {}).get("messages", [])

    async def send_message(self, chat_id: str, text: str) -> Dict:
        """Send message to chat."""
        result = await self._api_call(
            "/web/1/messenger/postMessage",
            method="POST",
            data={
                "channelId": chat_id,
                "body": {"text": text},
                "type": "text"
            }
        )
        logger.info(f"[{self.account_id}] Sent message to {chat_id}")
        return result

    # === WebSocket ===

    async def _forward_to_n8n(self, message: Dict):
        """Forward message to n8n webhook."""
        try:
            value = message.get("value", {})
            payload = {
                "source": "avito_camoufox",
                "account_id": self.account_id,
                "channel_type": "avito",
                "external_chat_id": value.get("channelId"),
                "external_message_id": value.get("id"),
                "message_type": value.get("type", "text"),
                "message_text": value.get("body", {}).get("text"),
                "sender_id": value.get("fromUid"),
                "timestamp": value.get("created"),
                "raw": message,
            }
            async with httpx.AsyncClient() as client:
                await client.post(self.n8n_webhook, json=payload, timeout=10)
                logger.debug(f"[{self.account_id}] Forwarded to n8n")
        except Exception as e:
            logger.warning(f"[{self.account_id}] Failed to forward to n8n: {e}")

    def _get_reconnect_delay(self) -> float:
        """Get delay with exponential backoff and jitter."""
        idx = min(self._reconnect_attempt, len(RECONNECT_DELAYS) - 1)
        base_delay = RECONNECT_DELAYS[idx]
        jitter = random.uniform(-base_delay * 0.2, base_delay * 0.2)
        return base_delay + jitter

    async def start_listening(self):
        """Start WebSocket listener with heartbeat and reconnect."""
        self._listening = True

        while self._listening:
            try:
                await self._connect_websocket()
            except Exception as e:
                logger.error(f"[{self.account_id}] WebSocket error: {e}")

            if not self._listening:
                break

            delay = self._get_reconnect_delay()
            self._reconnect_attempt += 1
            logger.info(f"[{self.account_id}] Reconnecting in {delay:.1f}s (attempt {self._reconnect_attempt})")
            await asyncio.sleep(delay)

    async def _connect_websocket(self):
        """Connect WebSocket and handle messages."""
        # Get hash_id if not set
        if not self._hash_id:
            hash_id = await self._extract_hash_id()
            if not hash_id:
                logger.error(f"[{self.account_id}] No hash_id found from any source")
                return

        # Navigate to messenger page (required for WebSocket)
        current_url = self.page.url
        if "messenger" not in current_url:
            await self.page.goto("https://www.avito.ru/profile/messenger", wait_until="domcontentloaded")
            await asyncio.sleep(2)

        # Inject WebSocket with heartbeat
        heartbeat_ms = HEARTBEAT_INTERVAL * 1000
        jitter_ms = HEARTBEAT_JITTER * 1000

        await self.page.evaluate(f"""
            () => {{
                // Close existing
                if (window.__avitoWS) {{
                    window.__avitoWS.close();
                }}

                const ws = new WebSocket(
                    "wss://socket.avito.ru/?use_seq=true&seq={self._seq}&id_version=v2&my_hash_id={self._hash_id}&app_name=web&app_version=7.456.1"
                );

                window.__avitoMessages = [];
                window.__avitoWsStatus = 'connecting';
                window.__avitoLastSeq = {self._seq};

                ws.onopen = () => {{
                    console.log('[avito] WS connected');
                    window.__avitoWsStatus = 'connected';

                    // Heartbeat with jitter
                    const interval = {heartbeat_ms} + (Math.random() * {jitter_ms * 2} - {jitter_ms});
                    window.__avitoHeartbeat = setInterval(() => {{
                        if (ws.readyState === WebSocket.OPEN) {{
                            ws.send(JSON.stringify({{type: 'ping'}}));
                        }}
                    }}, interval);
                }};

                ws.onmessage = (event) => {{
                    try {{
                        const data = JSON.parse(event.data);
                        if (data.seq) window.__avitoLastSeq = data.seq;
                        if (data.type === 'Message' || data.type === 'message') {{
                            window.__avitoMessages.push(data);
                        }}
                    }} catch (e) {{}}
                }};

                ws.onerror = () => {{ window.__avitoWsStatus = 'error'; }};
                ws.onclose = () => {{
                    window.__avitoWsStatus = 'closed';
                    if (window.__avitoHeartbeat) clearInterval(window.__avitoHeartbeat);
                }};

                window.__avitoWS = ws;
            }}
        """)

        logger.info(f"[{self.account_id}] WebSocket connecting (seq={self._seq})")
        self._ws_connected = True
        self._reconnect_attempt = 0

        # Poll for messages
        while self._listening:
            try:
                status = await self.page.evaluate("() => window.__avitoWsStatus")

                if status in ('closed', 'error'):
                    logger.warning(f"[{self.account_id}] WebSocket {status}")
                    self._ws_connected = False
                    break

                # Get messages
                messages = await self.page.evaluate("""
                    () => {
                        const msgs = window.__avitoMessages || [];
                        window.__avitoMessages = [];
                        return msgs;
                    }
                """)

                for msg in messages:
                    if msg.get("seq"):
                        self._seq = msg["seq"]

                    if self.on_message:
                        self.on_message({
                            "account_id": self.account_id,
                            "channel": "avito",
                            "data": msg
                        })

                    await self._forward_to_n8n(msg)

                # Update seq
                last_seq = await self.page.evaluate("() => window.__avitoLastSeq || 0")
                if last_seq > self._seq:
                    self._seq = last_seq

            except Exception as e:
                logger.error(f"[{self.account_id}] Poll error: {e}")
                break

            await asyncio.sleep(0.5)

    async def stop_listening(self):
        """Stop WebSocket listener."""
        self._listening = False
        try:
            await self.page.evaluate("""
                () => {
                    if (window.__avitoWS) {
                        window.__avitoWS.close();
                    }
                    if (window.__avitoHeartbeat) {
                        clearInterval(window.__avitoHeartbeat);
                    }
                }
            """)
        except:
            pass
        logger.info(f"[{self.account_id}] WebSocket stopped")

    async def get_ws_status(self) -> Dict:
        """Get WebSocket status."""
        try:
            status = await self.page.evaluate("() => window.__avitoWsStatus || 'unknown'")
            seq = await self.page.evaluate("() => window.__avitoLastSeq || 0")
            return {
                "status": status,
                "seq": seq,
                "hash_id": self._hash_id,
                "connected": self._ws_connected,
            }
        except:
            return {"status": "error", "connected": False}
