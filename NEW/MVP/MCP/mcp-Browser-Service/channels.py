"""
Channel handlers for Avito, WhatsApp, MAX.

Each channel has specific logic for:
- Login/authentication
- Message listening
- Message sending
"""

import asyncio
import json
import logging
from typing import Dict, Any, Optional, Callable
from playwright.async_api import Page

logger = logging.getLogger(__name__)


class BaseChannel:
    """Base class for channel handlers."""

    name: str = "base"
    login_url: str = ""
    main_url: str = ""

    def __init__(self, page: Page, on_message: Callable[[Dict], None] = None):
        self.page = page
        self.on_message = on_message
        self._listening = False

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


class AvitoChannel(BaseChannel):
    """Avito channel handler."""

    name = "avito"
    login_url = "https://m.avito.ru/login"
    main_url = "https://m.avito.ru/profile"
    api_base = "https://m.avito.ru"

    async def is_logged_in(self) -> bool:
        """Check if logged in by looking for sessid cookie."""
        cookies = await self.page.context.cookies()
        for cookie in cookies:
            if cookie["name"] == "sessid" and cookie["value"]:
                return True
        return False

    async def wait_for_login(self, timeout: int = 300):
        """Navigate to login and wait for sessid cookie."""
        await self.page.goto(self.login_url)

        # Wait for successful login (redirect to profile or sessid appears)
        for _ in range(timeout):
            if await self.is_logged_in():
                logger.info("[avito] Login successful")
                return True
            await asyncio.sleep(1)

        return False

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

    async def start_listening(self):
        """Start WebSocket listener for new messages."""
        self._listening = True

        # Get hash_id for WebSocket
        profile = await self.get_profile()
        hash_id = profile.get("public_id", "")

        if not hash_id:
            logger.error("[avito] No hash_id found")
            return

        # Inject WebSocket listener
        await self.page.evaluate(f"""
            () => {{
                const ws = new WebSocket(
                    "wss://socket.avito.ru/?use_seq=true&seq=0&id_version=v2&my_hash_id={hash_id}&app_name=web&app_version=7.456.1"
                );

                ws.onmessage = (event) => {{
                    const data = JSON.parse(event.data);
                    if (data.type === "Message") {{
                        window.__avitoNewMessage = data;
                        console.log("New message:", data);
                    }}
                }};

                ws.onerror = (e) => console.error("WS error:", e);
                ws.onclose = () => console.log("WS closed");

                window.__avitoWS = ws;
            }}
        """)

        logger.info("[avito] WebSocket listener started")

        # Poll for new messages
        while self._listening:
            try:
                msg = await self.page.evaluate("() => { const m = window.__avitoNewMessage; window.__avitoNewMessage = null; return m; }")
                if msg and self.on_message:
                    self.on_message({"channel": "avito", "data": msg})
            except:
                pass
            await asyncio.sleep(0.5)


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
