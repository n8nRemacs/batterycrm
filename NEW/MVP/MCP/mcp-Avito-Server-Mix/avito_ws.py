"""
Avito WebSocket client with browser fingerprint.

Key insight: WebSocket upgrade also has TLS fingerprint.
We need to use the same TLS fingerprint for WS connection.
"""

import asyncio
import json
import logging
from typing import Optional, Callable, Dict, Any

import websockets
from websockets.client import WebSocketClientProtocol

logger = logging.getLogger(__name__)

# Chrome headers for WebSocket
WS_HEADERS = {
    "Origin": "https://m.avito.ru",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
    "Sec-WebSocket-Extensions": "permessage-deflate; client_max_window_bits",
    "Sec-WebSocket-Version": "13",
}


class AvitoWebSocket:
    """
    Avito WebSocket client for real-time messages.
    """

    def __init__(
        self,
        sessid: str,
        hash_id: str,
        on_message: Optional[Callable[[Dict[str, Any]], None]] = None,
        n8n_webhook: Optional[str] = None,
    ):
        self.sessid = sessid
        self.hash_id = hash_id
        self.on_message = on_message
        self.n8n_webhook = n8n_webhook
        self.ws: Optional[WebSocketClientProtocol] = None
        self.running = False
        self.seq = 0

    def get_url(self) -> str:
        """Build WebSocket URL."""
        return (
            f"wss://socket.avito.ru/"
            f"?use_seq=true&seq={self.seq}&id_version=v2"
            f"&my_hash_id={self.hash_id}"
            f"&app_name=web&app_version=7.456.1"
        )

    def get_headers(self) -> Dict[str, str]:
        """Build WebSocket headers with cookies."""
        headers = WS_HEADERS.copy()
        headers["Cookie"] = f"sessid={self.sessid}"
        return headers

    async def connect(self):
        """Connect to WebSocket."""
        url = self.get_url()
        headers = self.get_headers()

        logger.info(f"Connecting to {url}")

        try:
            self.ws = await websockets.connect(
                url,
                extra_headers=headers,
                ping_interval=25,
                ping_timeout=10,
            )
            self.running = True
            logger.info("WebSocket connected!")

        except Exception as e:
            logger.error(f"WebSocket connection failed: {e}")
            raise

    async def listen(self):
        """Listen for messages."""
        if not self.ws:
            raise RuntimeError("Not connected")

        try:
            async for raw_message in self.ws:
                try:
                    message = json.loads(raw_message)
                    await self._handle_message(message)
                except json.JSONDecodeError:
                    logger.warning(f"Invalid JSON: {raw_message[:100]}")

        except websockets.ConnectionClosed as e:
            logger.warning(f"WebSocket closed: {e.code} {e.reason}")
            self.running = False

        except Exception as e:
            logger.error(f"WebSocket error: {e}")
            self.running = False

    async def _handle_message(self, message: Dict[str, Any]):
        """Handle incoming message."""
        msg_type = message.get("type")
        seq = message.get("seq")

        if seq:
            self.seq = int(seq)

        logger.debug(f"Message type={msg_type} seq={seq}")

        # Handle new message
        if msg_type == "Message":
            value = message.get("value", {})
            logger.info(
                f"New message: channel={value.get('channelId')} "
                f"from={value.get('fromUid')} text={value.get('body', {}).get('text', '')[:50]}"
            )

            if self.on_message:
                self.on_message(message)

            if self.n8n_webhook:
                await self._forward_to_n8n(message)

    async def _forward_to_n8n(self, message: Dict[str, Any]):
        """Forward message to n8n webhook."""
        import httpx

        value = message.get("value", {})
        payload = {
            "source": "avito_server_ws",
            "channel_type": "avito",
            "external_chat_id": value.get("channelId"),
            "external_message_id": value.get("id"),
            "message_type": value.get("type", "text"),
            "message_text": value.get("body", {}).get("text"),
            "sender_id": value.get("fromUid"),
            "timestamp": value.get("created"),
            "raw": message,
        }

        try:
            async with httpx.AsyncClient() as client:
                response = await client.post(self.n8n_webhook, json=payload, timeout=10)
                logger.info(f"Forwarded to n8n: {response.status_code}")
        except Exception as e:
            logger.error(f"Failed to forward to n8n: {e}")

    async def close(self):
        """Close WebSocket connection."""
        self.running = False
        if self.ws:
            await self.ws.close()
            self.ws = None
        logger.info("WebSocket closed")

    async def run(self):
        """Connect and listen in loop with reconnect."""
        while True:
            try:
                await self.connect()
                await self.listen()
            except Exception as e:
                logger.error(f"WebSocket error: {e}")

            if not self.running:
                break

            logger.info("Reconnecting in 5 seconds...")
            await asyncio.sleep(5)


# Test
if __name__ == "__main__":
    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s [%(levelname)s] %(name)s: %(message)s"
    )

    # Load config
    with open("config.json") as f:
        config = json.load(f)

    sessid = config.get("sessid")
    hash_id = config.get("hash_id")

    if not sessid or not hash_id:
        print("Need sessid and hash_id in config.json")
        print("Run cookie_extractor.py first to get these values")
        exit(1)

    def on_message(msg):
        print(f"Message received: {json.dumps(msg, ensure_ascii=False)[:200]}")

    ws = AvitoWebSocket(
        sessid=sessid,
        hash_id=hash_id,
        on_message=on_message,
        n8n_webhook=config.get("n8n_webhook"),
    )

    try:
        asyncio.run(ws.run())
    except KeyboardInterrupt:
        print("Stopped")
