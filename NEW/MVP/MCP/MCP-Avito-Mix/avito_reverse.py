"""
Avito Reverse-Engineered API Client
Features not available in official API:
- Real-time WebSocket messages
- User profile details
- Item extended info
- Typing indicators
- Read receipts
"""
import asyncio
import json
import logging
from typing import Optional, Dict, Any, Callable, Awaitable
import httpx
import websockets

logger = logging.getLogger("avito_reverse")


class AvitoReverseAPI:
    """Reverse-engineered Avito API using sessid cookie"""

    MOBILE_API = "https://m.avito.ru/api"
    WS_URL = "wss://socket.avito.ru/"
    USER_AGENT = "Mozilla/5.0 (Linux; Android 13; Pixel 6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"

    def __init__(self, sessid: str, user_hash: Optional[str] = None):
        self.sessid = sessid
        self.user_hash = user_hash
        self._client = httpx.AsyncClient(
            timeout=30.0,
            cookies={"sessid": sessid},
            headers={"User-Agent": self.USER_AGENT}
        )
        self._ws: Optional[websockets.WebSocketClientProtocol] = None
        self._ws_task: Optional[asyncio.Task] = None
        self._message_callback: Optional[Callable[[Dict[str, Any]], Awaitable[None]]] = None

    async def close(self):
        if self._ws_task:
            self._ws_task.cancel()
        if self._ws:
            await self._ws.close()
        await self._client.aclose()

    # === Profile API ===

    async def get_profile_short(self) -> Optional[Dict[str, Any]]:
        """Get current user short profile (to get user_hash)"""
        try:
            response = await self._client.get(f"{self.MOBILE_API}/1/profile/short")
            if response.status_code == 200:
                data = response.json()
                self.user_hash = data.get("id")
                return data
        except Exception as e:
            logger.error("Failed to get profile: %s", e)
        return None

    async def get_user_profile(self, user_hash: str) -> Optional[Dict[str, Any]]:
        """Get user profile by hash"""
        try:
            response = await self._client.get(f"{self.MOBILE_API}/1/profile/{user_hash}")
            if response.status_code == 200:
                return response.json()
        except Exception as e:
            logger.error("Failed to get user profile: %s", e)
        return None

    # === Item API ===

    async def get_item(self, item_id: int) -> Optional[Dict[str, Any]]:
        """Get item/ad details"""
        try:
            response = await self._client.get(f"{self.MOBILE_API}/1/items/{item_id}")
            if response.status_code == 200:
                return response.json()
        except Exception as e:
            logger.error("Failed to get item: %s", e)
        return None

    # === Channels/Chats API ===

    async def get_channels(self, limit: int = 50) -> Optional[Dict[str, Any]]:
        """Get messenger channels (chats)"""
        try:
            response = await self._client.get(
                f"{self.MOBILE_API}/6/messenger/channels",
                params={"limit": limit}
            )
            if response.status_code == 200:
                return response.json()
        except Exception as e:
            logger.error("Failed to get channels: %s", e)
        return None

    async def get_channel_by_id(self, channel_id: str) -> Optional[Dict[str, Any]]:
        """Get channel details by ID"""
        try:
            response = await self._client.get(
                f"{self.MOBILE_API}/6/messenger/channels/{channel_id}"
            )
            if response.status_code == 200:
                return response.json()
        except Exception as e:
            logger.error("Failed to get channel: %s", e)
        return None

    # === WebSocket Real-time ===

    async def connect_websocket(
        self,
        on_message: Callable[[Dict[str, Any]], Awaitable[None]],
        seq: int = 0
    ):
        """
        Connect to WebSocket for real-time messages

        Message format:
        {
            "seq": "123",
            "type": "Message",
            "type_v2": "messenger.Message",
            "value": {
                "id": "message_id",
                "channelId": "u2i-xxx",
                "fromUid": "user_hash",
                "body": {"text": "Hello"},
                "type": "text",
                "created": 1234567890
            }
        }
        """
        self._message_callback = on_message

        if not self.user_hash:
            profile = await self.get_profile_short()
            if not profile:
                raise ValueError("Cannot get user_hash for WebSocket")

        ws_url = (
            f"{self.WS_URL}?use_seq=true&seq={seq}&id_version=v2"
            f"&my_hash_id={self.user_hash}"
            f"&app_name=android&app_version=100.0.0"
        )

        self._ws_task = asyncio.create_task(self._ws_loop(ws_url))
        logger.info("WebSocket connecting to %s", ws_url[:80])

    async def _ws_loop(self, url: str):
        """WebSocket message loop"""
        retry_count = 0
        max_retries = 10

        while retry_count < max_retries:
            try:
                async with websockets.connect(
                    url,
                    extra_headers={
                        "Cookie": f"sessid={self.sessid}",
                        "User-Agent": self.USER_AGENT
                    }
                ) as ws:
                    self._ws = ws
                    retry_count = 0
                    logger.info("WebSocket connected")

                    async for message in ws:
                        try:
                            data = json.loads(message)
                            msg_type = data.get("type")

                            if msg_type == "Message" and self._message_callback:
                                await self._message_callback(data)

                        except json.JSONDecodeError:
                            logger.warning("Invalid JSON: %s", message[:100])
                        except Exception as e:
                            logger.error("Message handler error: %s", e)

            except websockets.ConnectionClosed as e:
                logger.warning("WebSocket closed: %s", e)
                retry_count += 1
                await asyncio.sleep(min(2 ** retry_count, 60))

            except Exception as e:
                logger.error("WebSocket error: %s", e)
                retry_count += 1
                await asyncio.sleep(min(2 ** retry_count, 60))

        logger.error("WebSocket max retries reached")

    def is_connected(self) -> bool:
        return self._ws is not None and self._ws.open


class AvitoMixAPI:
    """
    Hybrid API combining Official + Reverse-engineered

    Use cases:
    - Official API: Send messages, webhooks, auth
    - Reverse API: Real-time WebSocket, user profiles, extended item info
    """

    def __init__(
        self,
        official_api,  # AvitoOfficialAPI
        reverse_api: Optional[AvitoReverseAPI] = None
    ):
        self.official = official_api
        self.reverse = reverse_api

    async def close(self):
        await self.official.close()
        if self.reverse:
            await self.reverse.close()

    # === Delegated to Official API ===

    async def send_message(self, chat_id: str, text: str):
        return await self.official.send_message(chat_id, text)

    async def send_image(self, chat_id: str, image_id: str):
        return await self.official.send_image(chat_id, image_id)

    async def get_chats(self, **kwargs):
        return await self.official.get_chats(**kwargs)

    async def get_messages(self, chat_id: str, **kwargs):
        return await self.official.get_messages(chat_id, **kwargs)

    # === Enhanced with Reverse API ===

    async def get_user_profile(self, user_hash: str) -> Optional[Dict[str, Any]]:
        """Get user profile (reverse API)"""
        if self.reverse:
            return await self.reverse.get_user_profile(user_hash)
        return None

    async def get_item_extended(self, item_id: int) -> Optional[Dict[str, Any]]:
        """Get extended item info (reverse API)"""
        if self.reverse:
            return await self.reverse.get_item(item_id)
        return None

    async def start_realtime(
        self,
        on_message: Callable[[Dict[str, Any]], Awaitable[None]]
    ):
        """Start real-time WebSocket (reverse API)"""
        if self.reverse:
            await self.reverse.connect_websocket(on_message)

    def is_realtime_connected(self) -> bool:
        return self.reverse.is_connected() if self.reverse else False
