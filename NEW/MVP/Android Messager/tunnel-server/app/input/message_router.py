"""
Message Router - Routes messages via n8n workflow

Sends messages to n8n ELO_Message_Router which:
  - Determines type (from_client, from_operator, approved)
  - Normalizes text for operator messages
  - Returns action (push_to_operator | send_to_client) + payload
"""

import logging
from typing import Optional, Callable, Awaitable

import httpx

from app.config import settings

logger = logging.getLogger("MessageRouter")


class MessageRouter:
    """
    Routes messages via n8n workflow.

    All routing logic is in n8n (ELO_Message_Router) for easy modification.
    Python just executes the returned action.
    """

    def __init__(self, router_url: str = None):
        self.router_url = router_url or settings.ai_core.router_url
        self._client: Optional[httpx.AsyncClient] = None

        # Output handlers
        self._to_operator: Optional[Callable[[dict], Awaitable[None]]] = None
        self._to_client: Optional[Callable[[dict], Awaitable[None]]] = None

    async def _get_client(self) -> httpx.AsyncClient:
        if self._client is None or self._client.is_closed:
            self._client = httpx.AsyncClient(timeout=60.0)
        return self._client

    async def close(self):
        if self._client and not self._client.is_closed:
            await self._client.aclose()

    def set_to_operator_handler(self, handler: Callable[[dict], Awaitable[None]]):
        """Set handler for messages going to operator"""
        self._to_operator = handler

    def set_to_client_handler(self, handler: Callable[[dict], Awaitable[None]]):
        """Set handler for messages going to client"""
        self._to_client = handler

    async def route(self, message: dict):
        """
        Route message via n8n.

        1. Send to n8n ELO_Message_Router
        2. n8n returns: {route_action, payload}
        3. Execute action locally
        """
        logger.info(f"Routing: {message.get('channel')}/{message.get('chat_id')}")

        try:
            client = await self._get_client()
            response = await client.post(
                self.router_url,
                json=message,
                timeout=60.0
            )

            if response.status_code != 200:
                logger.error(f"Router error: {response.status_code} - {response.text}")
                return

            result = response.json()
            route_action = result.get("route_action")
            payload = result.get("payload", {})

            logger.info(f"Route action: {route_action}")

            # Execute action
            if route_action == "push_to_operator":
                if self._to_operator:
                    await self._to_operator(payload)
                else:
                    logger.warning("No to_operator handler set")

            elif route_action == "send_to_client":
                if self._to_client:
                    await self._to_client(payload)
                else:
                    logger.warning("No to_client handler set")

            else:
                logger.warning(f"Unknown route action: {route_action}")

        except Exception as e:
            logger.error(f"Routing failed: {e}")


# Global instance
message_router = MessageRouter()
