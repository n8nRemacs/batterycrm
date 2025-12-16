"""
API Gateway - REST API for operators and Android app
"""

import logging
from typing import Optional, List

from fastapi import APIRouter, HTTPException, Depends, Query
from pydantic import BaseModel

from app.models import (
    SendMessageRequest, SendMediaRequest, ChannelType, TunnelStatus,
    ProxyFetchRequest, ProxyFetchResponse, ProxyStats, ProxyNodeType,
    ProxyConsentRequest
)
from app.input.websocket_manager import manager
from app.input.proxy_manager import proxy_manager

logger = logging.getLogger("API")

router = APIRouter(prefix="/api", tags=["API"])


# === Request/Response Models ===

class SendResponse(BaseModel):
    success: bool
    message_id: Optional[str] = None
    error: Optional[str] = None


class NormalizeRequest(BaseModel):
    """Request to normalize operator message (voice transcription)"""
    tenant_id: str
    channel: ChannelType
    chat_id: str
    text: str  # Already transcribed by Android
    is_voice: bool = False  # Flag that it was voice input
    operator_id: Optional[str] = None


class NormalizeResponse(BaseModel):
    """Response with normalized text for approval"""
    success: bool
    message_id: str
    original_text: str
    normalized_text: str
    error: Optional[str] = None


class ApproveRequest(BaseModel):
    """Request to approve and send normalized message"""
    message_id: str
    final_text: Optional[str] = None  # If operator edited the text


class TunnelListResponse(BaseModel):
    tunnels: dict[str, TunnelStatus]


class HealthResponse(BaseModel):
    status: str
    tunnels_connected: int
    version: str = "1.0.0"


# === Routes ===

@router.get("/health", response_model=HealthResponse)
async def health():
    """Health check"""
    return HealthResponse(
        status="ok",
        tunnels_connected=len(manager.connections)
    )


@router.get("/tunnels", response_model=TunnelListResponse)
async def list_tunnels():
    """List all connected tunnels"""
    return TunnelListResponse(tunnels=manager.get_all_connections())


@router.get("/tunnels/{server_id}")
async def get_tunnel(server_id: str):
    """Get specific tunnel status"""
    conn = manager.get_connection(server_id)
    if not conn:
        raise HTTPException(404, f"Tunnel {server_id} not found")
    return conn.status


@router.post("/send", response_model=SendResponse)
async def send_message(request: SendMessageRequest):
    """
    Send message through tunnel.

    This is the main endpoint for sending messages.
    Routes to the correct tunnel based on tenant/channel configuration.
    """
    # TODO: Look up which tunnel handles this tenant/channel
    # For now, use first available tunnel

    if not manager.connections:
        raise HTTPException(503, "No tunnels connected")

    # Get first connection (TODO: proper routing)
    server_id = next(iter(manager.connections.keys()))

    try:
        response = await manager.send_to_tunnel(
            server_id=server_id,
            service=request.channel.value,
            method="POST",
            path="/send",
            body={
                "chat_id": request.chat_id,
                "text": request.text
            }
        )

        if response.error:
            return SendResponse(success=False, error=response.error)

        body = response.body or {}
        return SendResponse(
            success=True,
            message_id=body.get("message_id") or body.get("id")
        )

    except TimeoutError:
        return SendResponse(success=False, error="Request timeout")
    except Exception as e:
        logger.error(f"Send error: {e}")
        return SendResponse(success=False, error=str(e))


@router.post("/send/media", response_model=SendResponse)
async def send_media(request: SendMediaRequest):
    """
    Send media (photo, video, voice, document) through tunnel.

    Supports both URL and base64 encoded media.
    """
    if not manager.connections:
        raise HTTPException(503, "No tunnels connected")

    # Get first connection (TODO: proper routing by tenant)
    server_id = next(iter(manager.connections.keys()))

    # Map media_type to endpoint
    endpoint_map = {
        "photo": "/send/photo",
        "image": "/send/photo",
        "video": "/send/video",
        "voice": "/send/voice",
        "audio": "/send/voice",
        "document": "/send/document",
        "file": "/send/document",
    }

    path = endpoint_map.get(request.media_type, "/send/document")

    body = {"chat_id": request.chat_id}

    if request.media_url:
        body["url"] = request.media_url
    elif request.media_base64:
        body["base64"] = request.media_base64

    if request.caption:
        body["caption"] = request.caption
    if request.filename:
        body["filename"] = request.filename

    try:
        response = await manager.send_to_tunnel(
            server_id=server_id,
            service=request.channel.value,
            method="POST",
            path=path,
            body=body
        )

        if response.error:
            return SendResponse(success=False, error=response.error)

        body_resp = response.body or {}
        return SendResponse(
            success=True,
            message_id=body_resp.get("message_id") or body_resp.get("id")
        )

    except TimeoutError:
        return SendResponse(success=False, error="Request timeout")
    except Exception as e:
        logger.error(f"Send media error: {e}")
        return SendResponse(success=False, error=str(e))


@router.get("/dialogs/{server_id}/{channel}")
async def get_dialogs(
    server_id: str,
    channel: ChannelType,
    limit: int = Query(default=50, le=100)
):
    """Get dialogs from specific channel"""
    conn = manager.get_connection(server_id)
    if not conn:
        raise HTTPException(404, f"Tunnel {server_id} not found")

    try:
        response = await manager.send_to_tunnel(
            server_id=server_id,
            service=channel.value,
            method="GET",
            path=f"/dialogs?limit={limit}"
        )

        if response.error:
            raise HTTPException(500, response.error)

        return response.body

    except TimeoutError:
        raise HTTPException(504, "Request timeout")


@router.get("/history/{server_id}/{channel}/{chat_id}")
async def get_history(
    server_id: str,
    channel: ChannelType,
    chat_id: str,
    limit: int = Query(default=50, le=100)
):
    """Get message history from specific chat"""
    conn = manager.get_connection(server_id)
    if not conn:
        raise HTTPException(404, f"Tunnel {server_id} not found")

    try:
        response = await manager.send_to_tunnel(
            server_id=server_id,
            service=channel.value,
            method="GET",
            path=f"/history/{chat_id}?limit={limit}"
        )

        if response.error:
            raise HTTPException(500, response.error)

        return response.body

    except TimeoutError:
        raise HTTPException(504, "Request timeout")


@router.post("/tunnels/{server_id}/ping")
async def ping_tunnel(server_id: str):
    """Ping specific tunnel"""
    conn = manager.get_connection(server_id)
    if not conn:
        raise HTTPException(404, f"Tunnel {server_id} not found")

    try:
        from app.models import TunnelCommand
        import uuid

        command = TunnelCommand(id=str(uuid.uuid4()), action="ping")
        response = await conn.send_command(command, timeout=10.0)
        return {"success": True, "response": response.model_dump()}

    except TimeoutError:
        return {"success": False, "error": "Timeout"}


# === Operator Messages with Normalization ===

# Global orchestrator reference (set by main.py)
_orchestrator = None


def set_orchestrator(orchestrator):
    """Set orchestrator instance for API routes"""
    global _orchestrator
    _orchestrator = orchestrator


@router.post("/operator/normalize", response_model=NormalizeResponse)
async def normalize_operator_message(request: NormalizeRequest):
    """
    Normalize operator message text.

    Flow:
    1. Android transcribes voice → sends text here
    2. Server normalizes (fixes grammar)
    3. Returns normalized text for operator approval
    4. Operator approves → call /operator/approve to send

    Also used for text messages that need normalization.
    """
    if not _orchestrator:
        raise HTTPException(500, "Orchestrator not initialized")

    try:
        result = await _orchestrator.process_outgoing(
            tenant_id=request.tenant_id,
            channel=request.channel.value,
            chat_id=request.chat_id,
            text=request.text,
            is_voice=request.is_voice,
            operator_id=request.operator_id
        )

        if not result.message:
            return NormalizeResponse(
                success=False,
                message_id="",
                original_text=request.text,
                normalized_text="",
                error="Processing failed"
            )

        return NormalizeResponse(
            success=True,
            message_id=result.message.id,
            original_text=request.text,
            normalized_text=result.message.normalized_text or request.text
        )

    except Exception as e:
        logger.error(f"Normalization error: {e}")
        return NormalizeResponse(
            success=False,
            message_id="",
            original_text=request.text,
            normalized_text="",
            error=str(e)
        )


@router.post("/operator/approve", response_model=SendResponse)
async def approve_and_send(request: ApproveRequest):
    """
    Approve normalized text and send to client.

    Called after operator confirms the normalized text is correct.
    Optionally pass final_text if operator edited it.
    """
    if not _orchestrator:
        raise HTTPException(500, "Orchestrator not initialized")

    try:
        result = await _orchestrator.approve_and_send(
            message_id=request.message_id,
            final_text=request.final_text
        )

        if "send_approved" in result.actions_executed:
            return SendResponse(success=True, message_id=request.message_id)
        else:
            return SendResponse(success=False, error="Send failed")

    except Exception as e:
        logger.error(f"Approval error: {e}")
        return SendResponse(success=False, error=str(e))


# === Client Proxy Endpoints ===

@router.post("/proxy/register")
async def register_proxy_node(
    server_id: str,
    tenant_id: str,
    node_type: str = "operator",
    wifi_only: bool = True,
    max_requests_per_hour: int = 5
):
    """
    Register device as proxy node.

    Called by mobile app when user consents to proxy usage.

    Args:
        server_id: Tunnel connection ID
        tenant_id: Tenant ID
        node_type: "operator" or "client"
        wifi_only: Only use on WiFi
        max_requests_per_hour: Rate limit
    """
    try:
        nt = ProxyNodeType.CLIENT if node_type == "client" else ProxyNodeType.OPERATOR

        node = proxy_manager.register_node(
            server_id=server_id,
            node_type=nt,
            tenant_id=tenant_id,
            wifi_only=wifi_only,
            max_requests_per_hour=max_requests_per_hour
        )

        return {
            "success": True,
            "node_id": node.node_id,
            "message": "Proxy node registered successfully"
        }

    except Exception as e:
        logger.error(f"Proxy registration error: {e}")
        raise HTTPException(500, str(e))


@router.post("/proxy/consent")
async def register_client_consent(request: ProxyConsentRequest):
    """
    Register client consent for proxy usage.

    Called when customer agrees to share internet in exchange for bonuses.
    """
    # Find the tunnel connection for this client
    # For now, we expect the app to call /proxy/register separately

    return {
        "success": True,
        "message": "Consent recorded. Call /proxy/register with server_id when connected."
    }


@router.delete("/proxy/unregister/{server_id}")
async def unregister_proxy_node(server_id: str):
    """Unregister proxy node"""
    proxy_manager.unregister_node(server_id)
    return {"success": True}


@router.post("/proxy/status")
async def update_proxy_status(
    server_id: str,
    is_wifi: bool,
    battery_level: int
):
    """
    Update proxy node status.

    Called periodically by mobile app to report network/battery status.
    """
    proxy_manager.update_node_status(server_id, is_wifi, battery_level)
    return {"success": True}


@router.post("/proxy/fetch", response_model=ProxyFetchResponse)
async def proxy_fetch(request: ProxyFetchRequest):
    """
    Fetch URL via client proxy network.

    Distributes request to available proxy node and returns result.
    Used for price scraping from competitor websites.

    Args:
        request: Fetch request with URL and options

    Returns:
        ProxyFetchResponse with result or error
    """
    try:
        response = await proxy_manager.fetch(request)
        return response

    except Exception as e:
        logger.error(f"Proxy fetch error: {e}")
        return ProxyFetchResponse(
            request_id="",
            success=False,
            error=str(e)
        )


@router.get("/proxy/stats", response_model=ProxyStats)
async def get_proxy_stats(tenant_id: str = None):
    """Get proxy network statistics"""
    return proxy_manager.get_stats(tenant_id)


@router.get("/proxy/nodes")
async def list_proxy_nodes(tenant_id: str = None):
    """List all proxy nodes"""
    nodes = list(proxy_manager.nodes.values())

    if tenant_id:
        nodes = [n for n in nodes if n.tenant_id == tenant_id]

    return [n.model_dump() for n in nodes]


@router.get("/proxy/bonuses/{tenant_id}")
async def get_client_bonuses(tenant_id: str):
    """Get bonus balances for all client nodes in tenant"""
    return proxy_manager.get_client_bonuses(tenant_id)
