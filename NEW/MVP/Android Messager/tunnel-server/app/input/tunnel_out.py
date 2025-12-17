"""
Tunnel OUT - Sends messages to clients via tunnel (phones)

Flow:
  Router (approved) → Tunnel OUT → WebSocket → Phone → Messenger API → Client
"""

import logging
from typing import Optional, Dict

from app.input.websocket_manager import manager

logger = logging.getLogger("TunnelOUT")


class TunnelOUT:
    """
    Sends messages to clients via tunnel.

    Uses WebSocket manager to route messages to correct phone tunnel.
    """

    def __init__(self):
        pass

    async def send_message(self, payload: dict) -> dict:
        """
        Send message to client via tunnel.

        Args:
            payload: {
                action: "send_message",
                channel: "telegram" | "avito" | "max" | "whatsapp",
                chat_id: str,
                text: str,
                server_id: str (target tunnel),
                message_id: str (for tracking)
            }

        Returns:
            {success: bool, message_id: str, error: str}
        """
        channel = payload.get("channel")
        chat_id = payload.get("chat_id")
        text = payload.get("text")
        server_id = payload.get("server_id")
        message_id = payload.get("message_id")

        if not all([channel, chat_id, text]):
            return {
                "success": False,
                "message_id": message_id,
                "error": "Missing required fields: channel, chat_id, text"
            }

        logger.info(f"OUT: {channel}/{chat_id} via {server_id or 'auto'}")

        # Get tunnel connection
        server_id = await self._resolve_server(server_id, channel)
        if not server_id:
            return {
                "success": False,
                "message_id": message_id,
                "error": "No tunnel available for this channel"
            }

        # Send via tunnel
        try:
            response = await manager.send_to_tunnel(
                server_id=server_id,
                service=channel,
                method="POST",
                path="/send",
                body={
                    "chat_id": chat_id,
                    "text": text
                },
                timeout=30.0
            )

            if response.error:
                logger.error(f"Tunnel send error: {response.error}")
                return {
                    "success": False,
                    "message_id": message_id,
                    "error": response.error
                }

            # Extract message ID from response
            body = response.body or {}
            external_message_id = body.get("message_id") or body.get("id")

            logger.info(f"Sent successfully: {message_id} -> {external_message_id}")

            return {
                "success": True,
                "message_id": message_id,
                "external_message_id": external_message_id
            }

        except TimeoutError:
            logger.error(f"Tunnel timeout: {server_id}")
            return {
                "success": False,
                "message_id": message_id,
                "error": "Tunnel timeout"
            }

        except Exception as e:
            logger.error(f"Send error: {e}")
            return {
                "success": False,
                "message_id": message_id,
                "error": str(e)
            }

    async def send_media(self, payload: dict) -> dict:
        """
        Send media (photo, video, document) to client.

        Args:
            payload: {
                channel: str,
                chat_id: str,
                media_type: "photo" | "video" | "document",
                media_url: str,
                caption: str (optional),
                server_id: str
            }
        """
        channel = payload.get("channel")
        chat_id = payload.get("chat_id")
        media_type = payload.get("media_type", "document")
        media_url = payload.get("media_url")
        caption = payload.get("caption", "")
        server_id = payload.get("server_id")

        if not all([channel, chat_id, media_url]):
            return {"success": False, "error": "Missing required fields"}

        logger.info(f"OUT media: {media_type} to {channel}/{chat_id}")

        server_id = await self._resolve_server(server_id, channel)
        if not server_id:
            return {"success": False, "error": "No tunnel available"}

        # Map media type to endpoint
        endpoint_map = {
            "photo": "/send/photo",
            "image": "/send/photo",
            "video": "/send/video",
            "voice": "/send/voice",
            "audio": "/send/voice",
            "document": "/send/document",
            "file": "/send/document"
        }
        path = endpoint_map.get(media_type, "/send/document")

        try:
            response = await manager.send_to_tunnel(
                server_id=server_id,
                service=channel,
                method="POST",
                path=path,
                body={
                    "chat_id": chat_id,
                    "url": media_url,
                    "caption": caption
                },
                timeout=60.0
            )

            if response.error:
                return {"success": False, "error": response.error}

            return {"success": True}

        except Exception as e:
            logger.error(f"Send media error: {e}")
            return {"success": False, "error": str(e)}

    async def _resolve_server(self, server_id: Optional[str], channel: str) -> Optional[str]:
        """
        Resolve which tunnel server to use.

        If server_id provided, use it.
        Otherwise, find first available tunnel that supports this channel.
        """
        if server_id:
            conn = manager.get_connection(server_id)
            if conn:
                return server_id
            logger.warning(f"Specified server {server_id} not connected")

        # Find any tunnel with this channel
        for sid, conn in manager.connections.items():
            if channel in conn.services:
                logger.debug(f"Auto-selected tunnel: {sid} for {channel}")
                return sid

        # Fallback: first available tunnel
        if manager.connections:
            sid = next(iter(manager.connections.keys()))
            logger.warning(f"Using fallback tunnel: {sid}")
            return sid

        logger.error("No tunnels available")
        return None


# Global instance
tunnel_out = TunnelOUT()
