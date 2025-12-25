"""
Avito Official API Client
Pure official API implementation
"""
import asyncio
import time
import logging
from typing import Optional, Dict, Any, List
from dataclasses import dataclass
import httpx

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger("avito_official")


@dataclass
class TokenInfo:
    access_token: str
    expires_at: float
    token_type: str = "Bearer"


class AvitoOfficialAPI:
    """Official Avito API Client"""

    def __init__(
        self,
        client_id: str,
        client_secret: str,
        user_id: int,
        api_base: str = "https://api.avito.ru",
        token_url: str = "https://api.avito.ru/token"
    ):
        self.client_id = client_id
        self.client_secret = client_secret
        self.user_id = user_id
        self.api_base = api_base
        self.token_url = token_url
        self._token: Optional[TokenInfo] = None
        self._client = httpx.AsyncClient(timeout=30.0)

    async def close(self):
        await self._client.aclose()

    async def get_token(self) -> str:
        """Get or refresh access token"""
        if self._token and time.time() < self._token.expires_at - 60:
            return self._token.access_token

        response = await self._client.post(
            self.token_url,
            data={
                "grant_type": "client_credentials",
                "client_id": self.client_id,
                "client_secret": self.client_secret
            },
            headers={"Content-Type": "application/x-www-form-urlencoded"}
        )
        response.raise_for_status()
        data = response.json()

        self._token = TokenInfo(
            access_token=data["access_token"],
            expires_at=time.time() + data.get("expires_in", 86400),
            token_type=data.get("token_type", "Bearer")
        )
        logger.info("Token refreshed, expires in %d seconds", data.get("expires_in", 86400))
        return self._token.access_token

    async def _request(
        self,
        method: str,
        endpoint: str,
        **kwargs
    ) -> Dict[str, Any]:
        """Make authenticated API request"""
        token = await self.get_token()
        headers = kwargs.pop("headers", {})
        headers["Authorization"] = f"Bearer {token}"

        url = f"{self.api_base}{endpoint}"
        response = await self._client.request(method, url, headers=headers, **kwargs)
        response.raise_for_status()

        if response.content:
            return response.json()
        return {}

    # === Account ===

    async def get_self(self) -> Dict[str, Any]:
        """Get current user info"""
        return await self._request("GET", "/core/v1/accounts/self")

    # === Chats ===

    async def get_chats(
        self,
        item_ids: Optional[List[int]] = None,
        unread_only: bool = False,
        chat_types: str = "u2i",
        limit: int = 100,
        offset: int = 0
    ) -> Dict[str, Any]:
        """Get list of chats"""
        params = {
            "unread_only": str(unread_only).lower(),
            "chat_types": chat_types,
            "limit": limit,
            "offset": offset
        }
        if item_ids:
            params["item_ids"] = ",".join(map(str, item_ids))

        return await self._request(
            "GET",
            f"/messenger/v2/accounts/{self.user_id}/chats",
            params=params
        )

    async def get_chat(self, chat_id: str) -> Dict[str, Any]:
        """Get chat by ID"""
        return await self._request(
            "GET",
            f"/messenger/v2/accounts/{self.user_id}/chats/{chat_id}"
        )

    async def mark_chat_read(self, chat_id: str) -> Dict[str, Any]:
        """Mark chat as read"""
        return await self._request(
            "POST",
            f"/messenger/v1/accounts/{self.user_id}/chats/{chat_id}/read"
        )

    # === Messages ===

    async def get_messages(
        self,
        chat_id: str,
        limit: int = 100,
        offset: int = 0
    ) -> List[Dict[str, Any]]:
        """Get messages from chat (v3)"""
        return await self._request(
            "GET",
            f"/messenger/v3/accounts/{self.user_id}/chats/{chat_id}/messages/",
            params={"limit": limit, "offset": offset}
        )

    async def send_message(
        self,
        chat_id: str,
        text: str
    ) -> Dict[str, Any]:
        """Send text message to chat"""
        return await self._request(
            "POST",
            f"/messenger/v1/accounts/{self.user_id}/chats/{chat_id}/messages",
            json={
                "type": "text",
                "message": {"text": text}
            }
        )

    async def send_image(
        self,
        chat_id: str,
        image_id: str
    ) -> Dict[str, Any]:
        """Send image message to chat"""
        return await self._request(
            "POST",
            f"/messenger/v1/accounts/{self.user_id}/chats/{chat_id}/messages/image",
            json={"image_id": image_id}
        )

    async def delete_message(
        self,
        chat_id: str,
        message_id: str
    ) -> Dict[str, Any]:
        """Delete message (within 1 hour)"""
        return await self._request(
            "POST",
            f"/messenger/v1/accounts/{self.user_id}/chats/{chat_id}/messages/{message_id}"
        )

    # === Images ===

    async def upload_image(self, image_data: bytes, filename: str = "image.jpg") -> Dict[str, Any]:
        """Upload image for sending"""
        token = await self.get_token()

        response = await self._client.post(
            f"{self.api_base}/messenger/v1/accounts/{self.user_id}/uploadImages",
            headers={"Authorization": f"Bearer {token}"},
            files={"uploadfile[]": (filename, image_data)}
        )
        response.raise_for_status()
        return response.json()

    # === Voice ===

    async def get_voice_files(self, voice_ids: List[str]) -> Dict[str, Any]:
        """Get voice message URLs"""
        return await self._request(
            "GET",
            f"/messenger/v1/accounts/{self.user_id}/getVoiceFiles",
            params={"voice_ids": ",".join(voice_ids)}
        )

    # === Webhooks ===

    async def subscribe_webhook(self, url: str) -> Dict[str, Any]:
        """Subscribe to webhook notifications (v3)"""
        return await self._request(
            "POST",
            "/messenger/v3/webhook",
            json={"url": url}
        )

    async def unsubscribe_webhook(self, url: str) -> Dict[str, Any]:
        """Unsubscribe from webhook"""
        return await self._request(
            "POST",
            "/messenger/v1/webhook/unsubscribe",
            json={"url": url}
        )

    async def get_subscriptions(self) -> Dict[str, Any]:
        """Get list of webhook subscriptions"""
        return await self._request(
            "POST",
            "/messenger/v1/subscriptions"
        )

    # === Blacklist ===

    async def add_to_blacklist(
        self,
        user_id: int,
        reason_id: int = 4,
        item_id: Optional[int] = None
    ) -> Dict[str, Any]:
        """
        Add user to blacklist
        reason_id: 1=spam, 2=fraud, 3=insults, 4=other
        """
        payload = {
            "users": [{
                "user_id": user_id,
                "context": {"reason_id": reason_id}
            }]
        }
        if item_id:
            payload["users"][0]["context"]["item_id"] = item_id

        return await self._request(
            "POST",
            f"/messenger/v2/accounts/{self.user_id}/blacklist",
            json=payload
        )


async def create_client(config: Dict[str, Any]) -> AvitoOfficialAPI:
    """Create Avito client from config"""
    official = config.get("official_api", {})
    return AvitoOfficialAPI(
        client_id=official["client_id"],
        client_secret=official["client_secret"],
        user_id=official["user_id"],
        api_base=official.get("api_base", "https://api.avito.ru"),
        token_url=official.get("token_url", "https://api.avito.ru/token")
    )
