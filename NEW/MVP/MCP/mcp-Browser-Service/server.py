"""
Browser Service - Multi-tenant headless browser microservice.

Provides isolated browser contexts for each tenant.
Each tenant gets unique fingerprint and isolated session.

Endpoints:
- POST /session/{tenant_id}/create - Create session
- POST /session/{tenant_id}/channel/{channel}/open - Open channel page
- GET /session/{tenant_id}/channel/{channel}/chats - Get chats
- POST /session/{tenant_id}/channel/{channel}/send - Send message
- DELETE /session/{tenant_id} - Close session
"""

import asyncio
import logging
import os
from contextlib import asynccontextmanager
from typing import Optional, Dict, Any
from pathlib import Path

from fastapi import FastAPI, HTTPException, BackgroundTasks
from fastapi.responses import Response
from pydantic import BaseModel

from browser_manager import BrowserManager, TenantSession
from channels import get_channel_handler, CHANNELS

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(name)s: %(message)s"
)
logger = logging.getLogger("browser-service")

# Configuration
DATA_DIR = Path(os.getenv("DATA_DIR", "/data/browser-service"))
PORT = int(os.getenv("PORT", "8792"))
N8N_WEBHOOK = os.getenv("N8N_WEBHOOK", "https://n8n.n8nsrv.ru/webhook/browser/incoming")

# Global browser manager
manager: Optional[BrowserManager] = None


@asynccontextmanager
async def lifespan(app: FastAPI):
    """Start/stop browser manager."""
    global manager
    manager = BrowserManager(data_dir=DATA_DIR)
    await manager.start()
    logger.info(f"Browser Service started on port {PORT}")

    yield

    await manager.stop()
    logger.info("Browser Service stopped")


app = FastAPI(
    title="Browser Service",
    description="Multi-tenant headless browser for Avito, WhatsApp, MAX",
    version="1.0.0",
    lifespan=lifespan,
)


# === Models ===

class SendMessageRequest(BaseModel):
    chat_id: str
    text: str


class ChannelLoginRequest(BaseModel):
    wait_timeout: int = 300  # seconds to wait for login


# === Endpoints ===

@app.get("/health")
async def health():
    """Health check."""
    stats = await manager.get_stats() if manager else {}
    return {
        "service": "browser-service",
        "status": "ok" if manager else "not_started",
        "port": PORT,
        **stats,
    }


@app.get("/channels")
async def list_channels():
    """List available channels."""
    return {
        "channels": list(CHANNELS.keys()),
    }


# === Session Management ===

@app.post("/session/{tenant_id}/create")
async def create_session(tenant_id: str):
    """Create or get session for tenant."""
    session = await manager.get_session(tenant_id)
    return {
        "tenant_id": tenant_id,
        "status": "created",
        "pages": list(session.pages.keys()),
    }


@app.delete("/session/{tenant_id}")
async def close_session(tenant_id: str):
    """Close session for tenant."""
    await manager.close_session(tenant_id)
    return {"tenant_id": tenant_id, "status": "closed"}


@app.get("/session/{tenant_id}/status")
async def session_status(tenant_id: str):
    """Get session status."""
    if tenant_id not in manager._sessions:
        raise HTTPException(404, f"Session not found: {tenant_id}")

    session = manager._sessions[tenant_id]
    return {
        "tenant_id": tenant_id,
        "pages": list(session.pages.keys()),
    }


# === Channel Operations ===

@app.post("/session/{tenant_id}/channel/{channel}/open")
async def open_channel(tenant_id: str, channel: str):
    """Open channel page for tenant."""
    if channel not in CHANNELS:
        raise HTTPException(400, f"Unknown channel: {channel}")

    session = await manager.get_session(tenant_id)
    handler_class = CHANNELS[channel]

    # Get or create page
    page = await session.get_page(channel, handler_class.main_url)

    # Create handler
    handler = get_channel_handler(channel, page)

    # Check login status
    logged_in = await handler.is_logged_in()

    return {
        "tenant_id": tenant_id,
        "channel": channel,
        "logged_in": logged_in,
        "url": page.url,
    }


@app.post("/session/{tenant_id}/channel/{channel}/login")
async def login_channel(tenant_id: str, channel: str, req: ChannelLoginRequest):
    """
    Start login flow for channel.

    For QR-based channels (WhatsApp, MAX):
    - Call this endpoint
    - GET /session/{tenant_id}/channel/{channel}/qr to get QR code
    - Scan QR with phone
    - Wait for this endpoint to return success
    """
    if channel not in CHANNELS:
        raise HTTPException(400, f"Unknown channel: {channel}")

    session = await manager.get_session(tenant_id)
    handler_class = CHANNELS[channel]

    # Get or create page
    page = await session.get_page(channel, handler_class.login_url)
    handler = get_channel_handler(channel, page)

    # Check if already logged in
    if await handler.is_logged_in():
        return {
            "tenant_id": tenant_id,
            "channel": channel,
            "status": "already_logged_in",
        }

    # Wait for login
    success = await handler.wait_for_login(timeout=req.wait_timeout)

    if success:
        # Save session
        await session.save_storage()

    return {
        "tenant_id": tenant_id,
        "channel": channel,
        "status": "logged_in" if success else "timeout",
    }


@app.get("/session/{tenant_id}/channel/{channel}/qr")
async def get_qr_code(tenant_id: str, channel: str):
    """Get QR code for WhatsApp/MAX login."""
    if channel not in ["whatsapp", "max"]:
        raise HTTPException(400, f"QR not supported for: {channel}")

    if tenant_id not in manager._sessions:
        raise HTTPException(404, f"Session not found: {tenant_id}")

    session = manager._sessions[tenant_id]
    if channel not in session.pages:
        raise HTTPException(400, f"Channel not opened: {channel}")

    page = session.pages[channel]
    handler = get_channel_handler(channel, page)

    if hasattr(handler, "get_qr_code"):
        qr_bytes = await handler.get_qr_code()
        if qr_bytes:
            return Response(content=qr_bytes, media_type="image/png")

    raise HTTPException(404, "QR code not available")


@app.get("/session/{tenant_id}/channel/{channel}/chats")
async def get_chats(tenant_id: str, channel: str, limit: int = 50):
    """Get list of chats."""
    session = await manager.get_session(tenant_id)

    if channel not in session.pages:
        raise HTTPException(400, f"Channel not opened: {channel}")

    page = session.pages[channel]
    handler = get_channel_handler(channel, page)

    chats = await handler.get_chats()
    return {
        "tenant_id": tenant_id,
        "channel": channel,
        "chats": chats[:limit],
        "count": len(chats),
    }


@app.get("/session/{tenant_id}/channel/{channel}/messages/{chat_id}")
async def get_messages(tenant_id: str, channel: str, chat_id: str, limit: int = 50):
    """Get messages from chat."""
    session = await manager.get_session(tenant_id)

    if channel not in session.pages:
        raise HTTPException(400, f"Channel not opened: {channel}")

    page = session.pages[channel]
    handler = get_channel_handler(channel, page)

    messages = await handler.get_messages(chat_id, limit)
    return {
        "tenant_id": tenant_id,
        "channel": channel,
        "chat_id": chat_id,
        "messages": messages,
        "count": len(messages),
    }


@app.post("/session/{tenant_id}/channel/{channel}/send")
async def send_message(tenant_id: str, channel: str, req: SendMessageRequest):
    """Send message."""
    session = await manager.get_session(tenant_id)

    if channel not in session.pages:
        raise HTTPException(400, f"Channel not opened: {channel}")

    page = session.pages[channel]
    handler = get_channel_handler(channel, page)

    result = await handler.send_message(req.chat_id, req.text)
    return {
        "tenant_id": tenant_id,
        "channel": channel,
        "chat_id": req.chat_id,
        "result": result,
    }


@app.post("/session/{tenant_id}/channel/{channel}/listen/start")
async def start_listening(tenant_id: str, channel: str, background_tasks: BackgroundTasks):
    """Start listening for new messages (WebSocket)."""
    session = await manager.get_session(tenant_id)

    if channel not in session.pages:
        raise HTTPException(400, f"Channel not opened: {channel}")

    page = session.pages[channel]

    def on_message(msg):
        logger.info(f"[{tenant_id}/{channel}] New message: {msg}")
        # TODO: Forward to n8n webhook

    handler = get_channel_handler(channel, page, on_message)
    background_tasks.add_task(handler.start_listening)

    return {
        "tenant_id": tenant_id,
        "channel": channel,
        "status": "listening_started",
    }


# === Avito Specific ===

@app.get("/session/{tenant_id}/avito/profile")
async def avito_profile(tenant_id: str):
    """Get Avito profile."""
    session = await manager.get_session(tenant_id)

    if "avito" not in session.pages:
        raise HTTPException(400, "Avito channel not opened")

    page = session.pages["avito"]
    handler = get_channel_handler("avito", page)

    profile = await handler.get_profile()
    return {
        "tenant_id": tenant_id,
        "profile": profile,
    }


# === Main ===

if __name__ == "__main__":
    import uvicorn

    uvicorn.run(
        "server:app",
        host="0.0.0.0",
        port=PORT,
        reload=True,
    )
