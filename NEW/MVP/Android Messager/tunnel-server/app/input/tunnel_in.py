"""
Tunnel IN - Receives messages from tunnel (phones)

Flow:
  WebSocket → n8n ELO_In_App (transcribe if audio) → Batching (3s) → Router

Note: Normalization is done ONLY for operator messages (in router)
"""

import asyncio
import logging
from typing import Optional, Dict, Callable, Awaitable
from datetime import datetime
import uuid

import httpx

from app.config import settings

logger = logging.getLogger("TunnelIN")


class TunnelIN:
    """
    Incoming message processor from tunnel.

    1. Receives raw message from WebSocket
    2. Sends to n8n ELO_In_App (transcribes audio if present)
    3. Batches messages (3 sec debounce per chat)
    4. Forwards to router

    Note: Normalization is done ONLY for operator messages (in router)
    """

    def __init__(
        self,
        in_app_url: str = None,
        batch_delay: float = 3.0
    ):
        self.in_app_url = in_app_url or settings.ai_core.in_app_url
        self.batch_delay = batch_delay

        # Batching: chat_id -> {messages: [], timer: Task}
        self._batches: Dict[str, dict] = {}

        # Router callback
        self._router: Optional[Callable[[dict], Awaitable[None]]] = None

        # HTTP client
        self._client: Optional[httpx.AsyncClient] = None

    def set_router(self, router: Callable[[dict], Awaitable[None]]):
        """Set router callback for processed messages"""
        self._router = router

    async def _get_client(self) -> httpx.AsyncClient:
        if self._client is None or self._client.is_closed:
            self._client = httpx.AsyncClient(timeout=60.0)
        return self._client

    async def close(self):
        if self._client and not self._client.is_closed:
            await self._client.aclose()

    # === Main Entry Point ===

    async def process(self, server_id: str, data: dict):
        """
        Process incoming message from tunnel.

        Args:
            server_id: Phone tunnel ID
            data: {
                action: "incoming",
                service: "telegram" | "avito" | "max" | "whatsapp",
                data: {
                    chat_id, sender_id, sender_name, text,
                    has_audio, audio_url, audio_duration, ...
                }
            }
        """
        service = data.get("service", "unknown")
        msg_data = data.get("data", {})

        chat_id = msg_data.get("chat_id")
        if not chat_id:
            logger.warning(f"No chat_id in incoming message from {server_id}")
            return

        # Build message object
        message = {
            "id": str(uuid.uuid4()),
            "server_id": server_id,
            "channel": service,
            "chat_id": chat_id,
            "external_id": msg_data.get("external_id"),
            "sender_id": msg_data.get("sender_id"),
            "sender_name": msg_data.get("sender_name"),
            "sender_phone": msg_data.get("sender_phone"),
            "text": msg_data.get("text", ""),
            "has_audio": msg_data.get("has_audio", False),
            "audio_url": msg_data.get("audio_url"),
            "audio_duration": msg_data.get("audio_duration"),
            "has_media": msg_data.get("has_media", False),
            "media_type": msg_data.get("media_type"),
            "media_url": msg_data.get("media_url"),
            "timestamp": datetime.utcnow().isoformat(),
            "direction": "in",  # from client
            "raw": msg_data
        }

        logger.info(f"IN: {service}/{chat_id} from {server_id}")

        # Step 1: Process via n8n (transcription if audio)
        message = await self._process_via_n8n(message)

        # Step 2: Add to batch
        await self._add_to_batch(message)

    # === n8n Processing ===

    async def _process_via_n8n(self, message: dict) -> dict:
        """
        Send message to n8n ELO_In_App workflow.

        n8n handles:
        - Audio transcription via Whisper (if has_audio)
        - Returns processed message
        """
        try:
            client = await self._get_client()
            response = await client.post(
                self.in_app_url,
                json=message,
                timeout=90.0  # Allow time for audio download + transcription
            )

            if response.status_code == 200:
                result = response.json()
                logger.info(f"n8n processed: {message['channel']}/{message['chat_id']}")

                # Merge n8n result with original message
                message.update(result)

                if result.get("transcription"):
                    logger.info(f"Transcribed: {result['transcription'][:50]}...")

            else:
                logger.error(f"n8n error: {response.status_code} - {response.text}")
                message["n8n_error"] = response.text

        except Exception as e:
            logger.error(f"n8n processing failed: {e}")
            message["n8n_error"] = str(e)

        return message

    # === Batching ===

    async def _add_to_batch(self, message: dict):
        """Add message to batch, debounce by chat_id"""
        chat_id = message["chat_id"]
        batch_key = f"{message['channel']}:{chat_id}"

        if batch_key not in self._batches:
            self._batches[batch_key] = {
                "messages": [],
                "timer": None
            }

        batch = self._batches[batch_key]
        batch["messages"].append(message)

        # Cancel existing timer
        if batch["timer"] and not batch["timer"].done():
            batch["timer"].cancel()

        # Start new timer
        batch["timer"] = asyncio.create_task(
            self._batch_timer(batch_key)
        )

    async def _batch_timer(self, batch_key: str):
        """Wait for batch delay, then process batch"""
        await asyncio.sleep(self.batch_delay)
        await self._process_batch(batch_key)

    async def _process_batch(self, batch_key: str):
        """Process accumulated batch"""
        if batch_key not in self._batches:
            return

        batch = self._batches.pop(batch_key)
        messages = batch["messages"]

        if not messages:
            return

        # Merge messages into one
        merged = self._merge_messages(messages)

        logger.info(f"Batch processed: {batch_key}, {len(messages)} messages merged")

        # Forward to router (no normalization here)
        if self._router:
            await self._router(merged)

    def _merge_messages(self, messages: list) -> dict:
        """Merge multiple messages into one"""
        if len(messages) == 1:
            return messages[0]

        # Take first message as base
        merged = messages[0].copy()

        # Merge texts
        texts = [m.get("text", "") for m in messages if m.get("text")]
        merged["text"] = "\n".join(texts)

        # Collect all media
        media_urls = [m.get("media_url") for m in messages if m.get("media_url")]
        if media_urls:
            merged["media_urls"] = media_urls
            merged["has_media"] = True

        # Update metadata
        merged["batch_count"] = len(messages)
        merged["batch_ids"] = [m["id"] for m in messages]

        return merged


# Global instance
tunnel_in = TunnelIN()
