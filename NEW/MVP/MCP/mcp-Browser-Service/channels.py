"""
Channel handlers for Avito, WhatsApp, MAX.

Each channel has specific logic for:
- Login/authentication
- Message listening (with heartbeat, reconnect)
- Message sending

Stability features:
- Heartbeat with jitter
- Exponential backoff on reconnect
- Seq number persistence
- ft/f cookies (new Avito auth)
"""

import asyncio
import json
import logging
import random
import httpx
from pathlib import Path
from typing import Dict, Any, Optional, Callable
from playwright.async_api import Page

logger = logging.getLogger(__name__)

# === Configuration ===
HEARTBEAT_INTERVAL = 25  # seconds
HEARTBEAT_JITTER = 5     # ± seconds
RECONNECT_DELAYS = [5, 10, 20, 40, 80, 160, 300]  # exponential backoff
COOKIE_CHECK_INTERVAL = 7200  # 2 hours
N8N_WEBHOOK = "https://n8n.n8nsrv.ru/webhook/browser/incoming"


class BaseChannel:
    """Base class for channel handlers."""

    name: str = "base"
    login_url: str = ""
    main_url: str = ""

    def __init__(self, page: Page, on_message: Callable[[Dict], None] = None, data_dir: Path = None):
        self.page = page
        self.on_message = on_message
        self.data_dir = data_dir or Path("/data/browser-service")
        self._listening = False
        self._reconnect_attempt = 0

    async def is_logged_in(self) -> bool:
        """Check if logged in."""
        raise NotImplementedError

    async def wait_for_login(self, timeout: int = 300):
        """Wait for user to login (for QR/manual auth)."""
        raise NotImplementedError

    async def get_chats(self) -> list:
        """Get list of chats."""
        raise NotImplementedError

    async def get_messages(self, chat_id: str, limit: int = 50) -> list:
        """Get messages from chat."""
        raise NotImplementedError

    async def send_message(self, chat_id: str, text: str) -> Dict:
        """Send message to chat."""
        raise NotImplementedError

    async def start_listening(self):
        """Start listening for new messages."""
        raise NotImplementedError

    async def stop_listening(self):
        """Stop listening."""
        self._listening = False

    def _get_reconnect_delay(self) -> float:
        """Get delay with exponential backoff and jitter."""
        idx = min(self._reconnect_attempt, len(RECONNECT_DELAYS) - 1)
        base_delay = RECONNECT_DELAYS[idx]
        jitter = random.uniform(-base_delay * 0.2, base_delay * 0.2)
        return base_delay + jitter

    def _reset_reconnect(self):
        """Reset reconnect counter on successful connection."""
        self._reconnect_attempt = 0


class AvitoChannel(BaseChannel):
    """
    Avito channel handler with stability features.

    Features:
    - Uses ft/f cookies (new Avito auth) instead of old sessid
    - Heartbeat every 25s with ±5s jitter
    - Exponential backoff on reconnect
    - Seq number persistence
    - Automatic n8n webhook forwarding
    """

    name = "avito"
    login_url = "https://m.avito.ru/login"
    main_url = "https://m.avito.ru/profile/messenger"
    api_base = "https://m.avito.ru"

    def __init__(self, page: Page, on_message: Callable[[Dict], None] = None,
                 data_dir: Path = None, tenant_id: str = None):
        super().__init__(page, on_message, data_dir)
        self.tenant_id = tenant_id
        self._seq = 0
        self._hash_id = None
        self._ws_connected = False

    async def is_logged_in(self) -> bool:
        """Check if logged in by looking for ft or f cookie (new Avito auth)."""
        cookies = await self.page.context.cookies()
        for cookie in cookies:
            # New Avito uses ft (encrypted token) or f (main auth)
            if cookie["name"] in ("ft", "f") and cookie["value"]:
                return True
            # Fallback to old sessid
            if cookie["name"] == "sessid" and cookie["value"]:
                return True
        return False

    # === Seq Persistence ===

    def _get_seq_path(self) -> Path:
        """Get path for seq file."""
        if self.tenant_id:
            return self.data_dir / self.tenant_id / "avito_seq.json"
        return self.data_dir / "avito_seq.json"

    async def _load_seq(self):
        """Load seq number from disk."""
        try:
            seq_path = self._get_seq_path()
            if seq_path.exists():
                data = json.loads(seq_path.read_text())
                self._seq = data.get("seq", 0)
                self._hash_id = data.get("hash_id")
                logger.info(f"[avito] Loaded seq={self._seq}, hash_id={self._hash_id}")
        except Exception as e:
            logger.warning(f"[avito] Failed to load seq: {e}")

    async def _save_seq(self):
        """Save seq number to disk."""
        try:
            seq_path = self._get_seq_path()
            seq_path.parent.mkdir(parents=True, exist_ok=True)
            seq_path.write_text(json.dumps({
                "seq": self._seq,
                "hash_id": self._hash_id,
            }))
        except Exception as e:
            logger.warning(f"[avito] Failed to save seq: {e}")

    # === Login with credentials ===

    async def wait_for_login(self, timeout: int = 300):
        """Navigate to login and wait for ft/f cookie (manual login)."""
        await self.page.goto(self.login_url)

        for _ in range(timeout):
            if await self.is_logged_in():
                logger.info("[avito] Login successful")
                return True
            await asyncio.sleep(1)

        return False

    async def login_with_credentials(self, phone: str, password: str) -> Dict[str, Any]:
        """
        Login with phone and password (programmatic login).

        Returns:
            {"status": "success"} - logged in
            {"status": "sms_required"} - need SMS code
            {"status": "error", "message": "..."} - error
        """
        try:
            await self.page.goto(self.login_url)
            await asyncio.sleep(2)  # Wait for page load

            # Click "Login with password" if visible
            try:
                login_btn = await self.page.query_selector('text=Войти с паролем')
                if login_btn:
                    await login_btn.click()
                    await asyncio.sleep(1)
            except:
                pass

            # Enter phone number
            phone_input = await self.page.wait_for_selector('input[name="login"], input[type="tel"]', timeout=10000)
            await phone_input.fill(phone)
            await asyncio.sleep(0.5)

            # Click continue/next
            try:
                continue_btn = await self.page.query_selector('button[type="submit"], text=Продолжить')
                if continue_btn:
                    await continue_btn.click()
                    await asyncio.sleep(2)
            except:
                pass

            # Enter password
            try:
                password_input = await self.page.wait_for_selector('input[type="password"]', timeout=5000)
                await password_input.fill(password)
                await asyncio.sleep(0.5)

                # Submit
                submit_btn = await self.page.query_selector('button[type="submit"]')
                if submit_btn:
                    await submit_btn.click()
                    await asyncio.sleep(3)
            except:
                pass

            # Check if SMS code is required
            sms_input = await self.page.query_selector('input[name="code"], input[autocomplete="one-time-code"]')
            if sms_input:
                logger.info("[avito] SMS code required")
                return {"status": "sms_required"}

            # Check if logged in
            if await self.is_logged_in():
                logger.info("[avito] Login successful")
                return {"status": "success"}

            # Check for error message
            error = await self.page.query_selector('.error-message, .form-error')
            if error:
                error_text = await error.text_content()
                return {"status": "error", "message": error_text}

            return {"status": "unknown"}

        except Exception as e:
            logger.error(f"[avito] Login error: {e}")
            return {"status": "error", "message": str(e)}

    async def submit_sms_code(self, code: str) -> Dict[str, Any]:
        """Submit SMS verification code."""
        try:
            sms_input = await self.page.query_selector('input[name="code"], input[autocomplete="one-time-code"]')
            if not sms_input:
                return {"status": "error", "message": "SMS input not found"}

            await sms_input.fill(code)
            await asyncio.sleep(1)

            # Submit
            submit_btn = await self.page.query_selector('button[type="submit"]')
            if submit_btn:
                await submit_btn.click()
                await asyncio.sleep(3)

            # Check if logged in
            if await self.is_logged_in():
                logger.info("[avito] Login with SMS successful")
                return {"status": "success"}

            # Check for error
            error = await self.page.query_selector('.error-message, .form-error')
            if error:
                error_text = await error.text_content()
                return {"status": "error", "message": error_text}

            return {"status": "unknown"}

        except Exception as e:
            logger.error(f"[avito] SMS submit error: {e}")
            return {"status": "error", "message": str(e)}

    # === API Calls ===

    async def _api_call(self, endpoint: str, method: str = "GET", data: Dict = None) -> Dict:
        """Make API call through browser context."""
        url = f"{self.api_base}{endpoint}"

        if method == "GET":
            response = await self.page.evaluate(f"""
                async () => {{
                    const res = await fetch("{url}");
                    return await res.json();
                }}
            """)
        else:
            response = await self.page.evaluate(f"""
                async () => {{
                    const res = await fetch("{url}", {{
                        method: "POST",
                        headers: {{"Content-Type": "application/json"}},
                        body: JSON.stringify({json.dumps(data)})
                    }});
                    return await res.json();
                }}
            """)

        return response

    async def get_profile(self) -> Dict:
        """Get current user profile."""
        return await self._api_call("/api/1/profile/short")

    async def get_chats(self, limit: int = 50) -> list:
        """Get list of chats."""
        result = await self._api_call(
            "/web/1/messenger/getChannels",
            method="POST",
            data={"limit": limit, "offset": 0}
        )
        return result.get("result", {}).get("channels", [])

    async def get_messages(self, chat_id: str, limit: int = 50) -> list:
        """Get messages from chat."""
        result = await self._api_call(
            "/web/1/messenger/getUserVisibleMessages",
            method="POST",
            data={"channelId": chat_id, "limit": limit}
        )
        return result.get("result", {}).get("messages", [])

    async def send_message(self, chat_id: str, text: str) -> Dict:
        """Send message to chat."""
        return await self._api_call(
            "/web/1/messenger/postMessage",
            method="POST",
            data={
                "channelId": chat_id,
                "body": {"text": text},
                "type": "text"
            }
        )

    # === WebSocket with Heartbeat ===

    async def _forward_to_n8n(self, message: Dict):
        """Forward message to n8n webhook."""
        try:
            payload = {
                "source": "browser_service",
                "tenant_id": self.tenant_id,
                "channel_type": "avito",
                "data": message,
            }
            async with httpx.AsyncClient() as client:
                await client.post(N8N_WEBHOOK, json=payload, timeout=10)
                logger.debug(f"[avito] Forwarded to n8n")
        except Exception as e:
            logger.warning(f"[avito] Failed to forward to n8n: {e}")

    async def start_listening(self):
        """
        Start WebSocket listener for new messages.

        Features:
        - Heartbeat every 25s with jitter
        - Exponential backoff on reconnect
        - Seq number persistence
        - Auto-forward to n8n webhook
        """
        self._listening = True
        await self._load_seq()

        while self._listening:
            try:
                await self._connect_websocket()
            except Exception as e:
                logger.error(f"[avito] WebSocket error: {e}")

            if not self._listening:
                break

            # Exponential backoff
            delay = self._get_reconnect_delay()
            self._reconnect_attempt += 1
            logger.info(f"[avito] Reconnecting in {delay:.1f}s (attempt {self._reconnect_attempt})")
            await asyncio.sleep(delay)

    async def _connect_websocket(self):
        """Connect to WebSocket and handle messages."""
        # Get hash_id
        if not self._hash_id:
            profile = await self.get_profile()
            self._hash_id = profile.get("public_id", "")
            if not self._hash_id:
                logger.error("[avito] No hash_id found")
                return

        # Inject WebSocket with heartbeat
        await self.page.evaluate(f"""
            () => {{
                // Close existing connection
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

                    // Start heartbeat with jitter
                    window.__avitoHeartbeat = setInterval(() => {{
                        if (ws.readyState === WebSocket.OPEN) {{
                            ws.send(JSON.stringify({{type: 'ping'}}));
                            console.log('[avito] Heartbeat sent');
                        }}
                    }}, {HEARTBEAT_INTERVAL * 1000} + (Math.random() * {HEARTBEAT_JITTER * 2000} - {HEARTBEAT_JITTER * 1000}));
                }};

                ws.onmessage = (event) => {{
                    try {{
                        const data = JSON.parse(event.data);

                        // Update seq
                        if (data.seq) {{
                            window.__avitoLastSeq = data.seq;
                        }}

                        // Store message
                        if (data.type === 'Message' || data.type === 'message') {{
                            window.__avitoMessages.push(data);
                        }}

                        console.log('[avito] WS message:', data.type);
                    }} catch (e) {{
                        console.error('[avito] Parse error:', e);
                    }}
                }};

                ws.onerror = (e) => {{
                    console.error('[avito] WS error:', e);
                    window.__avitoWsStatus = 'error';
                }};

                ws.onclose = (e) => {{
                    console.log('[avito] WS closed:', e.code, e.reason);
                    window.__avitoWsStatus = 'closed';
                    if (window.__avitoHeartbeat) {{
                        clearInterval(window.__avitoHeartbeat);
                    }}
                }};

                window.__avitoWS = ws;
            }}
        """)

        logger.info(f"[avito] WebSocket connecting (seq={self._seq})")
        self._ws_connected = True
        self._reset_reconnect()

        # Poll for messages and status
        while self._listening:
            try:
                status = await self.page.evaluate("() => window.__avitoWsStatus")

                if status in ('closed', 'error'):
                    logger.warning(f"[avito] WebSocket {status}")
                    self._ws_connected = False
                    break

                # Get new messages
                messages = await self.page.evaluate("""
                    () => {
                        const msgs = window.__avitoMessages || [];
                        window.__avitoMessages = [];
                        return msgs;
                    }
                """)

                for msg in messages:
                    # Update seq
                    if msg.get("seq"):
                        self._seq = msg["seq"]
                        await self._save_seq()

                    # Callback
                    if self.on_message:
                        self.on_message({"channel": "avito", "tenant_id": self.tenant_id, "data": msg})

                    # Forward to n8n
                    await self._forward_to_n8n(msg)

                # Update seq from page
                last_seq = await self.page.evaluate("() => window.__avitoLastSeq")
                if last_seq and last_seq > self._seq:
                    self._seq = last_seq
                    await self._save_seq()

            except Exception as e:
                logger.error(f"[avito] Poll error: {e}")
                break

            await asyncio.sleep(0.5)

    async def get_ws_status(self) -> Dict:
        """Get WebSocket connection status."""
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


class WhatsAppChannel(BaseChannel):
    """WhatsApp Web channel handler."""

    name = "whatsapp"
    login_url = "https://web.whatsapp.com"
    main_url = "https://web.whatsapp.com"

    async def is_logged_in(self) -> bool:
        """Check if logged in by looking for main chat element."""
        try:
            # Look for side panel which appears after login
            element = await self.page.query_selector('[data-testid="chat-list"]')
            return element is not None
        except:
            return False

    async def wait_for_login(self, timeout: int = 300):
        """Navigate to WhatsApp and wait for QR scan."""
        await self.page.goto(self.login_url)

        # Wait for QR code to appear
        await self.page.wait_for_selector('[data-testid="qrcode"]', timeout=30000)
        logger.info("[whatsapp] QR code displayed, waiting for scan...")

        # Wait for login (QR disappears, chat list appears)
        for _ in range(timeout):
            if await self.is_logged_in():
                logger.info("[whatsapp] Login successful")
                return True
            await asyncio.sleep(1)

        return False

    async def get_qr_code(self) -> Optional[str]:
        """Get QR code as base64 image."""
        try:
            qr = await self.page.query_selector('[data-testid="qrcode"]')
            if qr:
                return await qr.screenshot(type="png")
        except:
            pass
        return None

    async def get_chats(self) -> list:
        """Get list of chats."""
        # This is more complex - needs to parse DOM
        # Simplified version
        chats = await self.page.evaluate("""
            () => {
                const chatElements = document.querySelectorAll('[data-testid="cell-frame-container"]');
                return Array.from(chatElements).slice(0, 50).map(el => ({
                    id: el.getAttribute('data-id') || '',
                    name: el.querySelector('[data-testid="cell-frame-title"]')?.textContent || ''
                }));
            }
        """)
        return chats

    async def send_message(self, chat_id: str, text: str) -> Dict:
        """Send message - click on chat, type, send."""
        # This is simplified - real implementation needs more logic
        # Navigate to chat, type in input, click send
        return {"status": "not_implemented"}


class MAXChannel(BaseChannel):
    """MAX (VK Teams) channel handler."""

    name = "max"
    login_url = "https://web.max.ru"
    main_url = "https://web.max.ru"

    async def is_logged_in(self) -> bool:
        """Check if logged in."""
        try:
            # Look for main content after login
            element = await self.page.query_selector('.messenger-container')
            return element is not None
        except:
            return False

    async def wait_for_login(self, timeout: int = 300):
        """Wait for QR scan."""
        await self.page.goto(self.login_url)
        logger.info("[max] Waiting for QR scan...")

        for _ in range(timeout):
            if await self.is_logged_in():
                logger.info("[max] Login successful")
                return True
            await asyncio.sleep(1)

        return False


# Channel registry
CHANNELS = {
    "avito": AvitoChannel,
    "whatsapp": WhatsAppChannel,
    "max": MAXChannel,
}


def get_channel_handler(name: str, page: Page, on_message: Callable = None) -> BaseChannel:
    """Get channel handler by name."""
    if name not in CHANNELS:
        raise ValueError(f"Unknown channel: {name}")
    return CHANNELS[name](page, on_message)
