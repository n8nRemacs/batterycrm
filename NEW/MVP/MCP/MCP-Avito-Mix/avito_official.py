"""
Avito Official API Client
"""
import time
import logging
from typing import Optional, Dict, Any, List
from dataclasses import dataclass
import httpx

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

    async def _request(self, method: str, endpoint: str, **kwargs) -> Dict[str, Any]:
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

    async def get_self(self) -> Dict[str, Any]:
        return await self._request("GET", "/core/v1/accounts/self")

    async def get_chats(self, limit: int = 100, offset: int = 0, unread_only: bool = False) -> Dict[str, Any]:
        return await self._request(
            "GET",
            f"/messenger/v2/accounts/{self.user_id}/chats",
            params={"limit": limit, "offset": offset, "unread_only": str(unread_only).lower()}
        )

    async def get_chat(self, chat_id: str) -> Dict[str, Any]:
        return await self._request("GET", f"/messenger/v2/accounts/{self.user_id}/chats/{chat_id}")

    async def get_messages(self, chat_id: str, limit: int = 100, offset: int = 0) -> List[Dict[str, Any]]:
        return await self._request(
            "GET",
            f"/messenger/v3/accounts/{self.user_id}/chats/{chat_id}/messages/",
            params={"limit": limit, "offset": offset}
        )

    async def send_message(self, chat_id: str, text: str) -> Dict[str, Any]:
        return await self._request(
            "POST",
            f"/messenger/v1/accounts/{self.user_id}/chats/{chat_id}/messages",
            json={"type": "text", "message": {"text": text}}
        )

    async def send_image(self, chat_id: str, image_id: str) -> Dict[str, Any]:
        return await self._request(
            "POST",
            f"/messenger/v1/accounts/{self.user_id}/chats/{chat_id}/messages/image",
            json={"image_id": image_id}
        )

    async def mark_chat_read(self, chat_id: str) -> Dict[str, Any]:
        return await self._request("POST", f"/messenger/v1/accounts/{self.user_id}/chats/{chat_id}/read")

    async def upload_image(self, image_data: bytes, filename: str = "image.jpg") -> Dict[str, Any]:
        token = await self.get_token()
        response = await self._client.post(
            f"{self.api_base}/messenger/v1/accounts/{self.user_id}/uploadImages",
            headers={"Authorization": f"Bearer {token}"},
            files={"uploadfile[]": (filename, image_data)}
        )
        response.raise_for_status()
        return response.json()

    async def subscribe_webhook(self, url: str) -> Dict[str, Any]:
        return await self._request("POST", "/messenger/v3/webhook", json={"url": url})

    async def unsubscribe_webhook(self, url: str) -> Dict[str, Any]:
        return await self._request("POST", "/messenger/v1/webhook/unsubscribe", json={"url": url})

    async def get_subscriptions(self) -> Dict[str, Any]:
        return await self._request("POST", "/messenger/v1/subscriptions")
