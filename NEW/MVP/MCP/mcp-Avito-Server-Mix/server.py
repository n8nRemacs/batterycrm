"""
Avito Server Mix - Server-side Avito with browser fingerprint.

Architecture:
1. cookie_extractor.py → get sessid, hash_id from real browser
2. avito_browser.py → HTTP API with curl_cffi (Chrome TLS)
3. avito_ws.py → WebSocket with browser headers
4. server.py (this) → FastAPI orchestration

Key insight:
- People use Avito from offices all the time
- Problem is NOT IP, it's TLS fingerprint
- curl_cffi mimics Chrome's TLS fingerprint
"""

import asyncio
import json
import logging
from pathlib import Path
from typing import Optional, Dict, Any
from contextlib import asynccontextmanager

from fastapi import FastAPI, HTTPException, BackgroundTasks
from pydantic import BaseModel

# Local imports
from avito_browser import AvitoBrowserClient
from avito_ws import AvitoWebSocket

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(name)s: %(message)s"
)
logger = logging.getLogger("avito_server_mix")

# Config
CONFIG_PATH = Path(__file__).parent / "config.json"


def load_config() -> Dict[str, Any]:
    if CONFIG_PATH.exists():
        return json.loads(CONFIG_PATH.read_text(encoding="utf-8"))
    return {}


config = load_config()

# Global state
api_client: Optional[AvitoBrowserClient] = None
ws_client: Optional[AvitoWebSocket] = None
ws_task: Optional[asyncio.Task] = None


@asynccontextmanager
async def lifespan(app: FastAPI):
    """Initialize clients on startup."""
    global api_client, ws_client, ws_task

    sessid = config.get("sessid")
    hash_id = config.get("hash_id")

    if not sessid:
        logger.warning("No sessid in config. Run cookie_extractor.py first!")
    else:
        # Initialize API client
        api_client = AvitoBrowserClient(sessid)
        logger.info("API client initialized with curl_cffi (Chrome TLS)")

        # Try to get profile
        try:
            profile = await api_client.get_profile()
            logger.info(f"Logged in as: {profile.get('name')} (id={profile.get('id')})")

            # If no hash_id in config, try to get from profile
            if not hash_id:
                hash_id = profile.get("public_id")
                if hash_id:
                    config["hash_id"] = hash_id
                    logger.info(f"Got hash_id from profile: {hash_id}")

        except Exception as e:
            logger.error(f"Failed to get profile: {e}")
            logger.warning("Session might be expired. Run cookie_extractor.py again.")

        # Initialize WebSocket if we have hash_id
        if hash_id:
            ws_client = AvitoWebSocket(
                sessid=sessid,
                hash_id=hash_id,
                on_message=on_ws_message,
                n8n_webhook=config.get("n8n_webhook"),
            )
            # Start WebSocket in background
            ws_task = asyncio.create_task(ws_client.run())
            logger.info("WebSocket client started")

    yield

    # Cleanup
    if ws_client:
        await ws_client.close()
    if ws_task:
        ws_task.cancel()


app = FastAPI(
    title="Avito Server Mix",
    description="Server-side Avito with browser TLS fingerprint",
    version="1.0.0",
    lifespan=lifespan,
)


def on_ws_message(message: Dict[str, Any]):
    """Handle incoming WebSocket message."""
    msg_type = message.get("type")
    if msg_type == "Message":
        value = message.get("value", {})
        logger.info(
            f"WS Message: {value.get('channelId')} -> {value.get('body', {}).get('text', '')[:50]}"
        )


# === Models ===

class SendMessageRequest(BaseModel):
    channel_id: str
    text: str


class RefreshSessionRequest(BaseModel):
    sessid: str
    hash_id: Optional[str] = None


# === Endpoints ===

@app.get("/health")
async def health():
    """Health check."""
    return {
        "service": "avito-server-mix",
        "status": "ok",
        "api_client": api_client is not None,
        "ws_connected": ws_client.running if ws_client else False,
        "version": "1.0.0",
    }


@app.get("/profile")
async def get_profile():
    """Get current Avito profile."""
    if not api_client:
        raise HTTPException(500, "API client not initialized")

    try:
        return await api_client.get_profile()
    except Exception as e:
        raise HTTPException(500, f"Failed to get profile: {e}")


@app.get("/channels")
async def get_channels(limit: int = 50):
    """Get list of chat channels."""
    if not api_client:
        raise HTTPException(500, "API client not initialized")

    try:
        channels = await api_client.get_channels(limit)
        return {"channels": channels, "count": len(channels)}
    except Exception as e:
        raise HTTPException(500, f"Failed to get channels: {e}")


@app.get("/messages/{channel_id}")
async def get_messages(channel_id: str, limit: int = 50):
    """Get messages from a channel."""
    if not api_client:
        raise HTTPException(500, "API client not initialized")

    try:
        messages = await api_client.get_messages(channel_id, limit)
        return {"messages": messages, "count": len(messages)}
    except Exception as e:
        raise HTTPException(500, f"Failed to get messages: {e}")


@app.post("/send")
async def send_message(req: SendMessageRequest):
    """Send a message."""
    if not api_client:
        raise HTTPException(500, "API client not initialized")

    try:
        result = await api_client.send_message(req.channel_id, req.text)
        return {"success": True, "result": result}
    except Exception as e:
        raise HTTPException(500, f"Failed to send message: {e}")


@app.post("/session/refresh")
async def refresh_session(req: RefreshSessionRequest):
    """Refresh session with new sessid."""
    global api_client, ws_client, ws_task, config

    # Update config
    config["sessid"] = req.sessid
    if req.hash_id:
        config["hash_id"] = req.hash_id

    # Save to file
    CONFIG_PATH.write_text(json.dumps(config, indent=2, ensure_ascii=False))

    # Recreate clients
    api_client = AvitoBrowserClient(req.sessid)

    # Get profile to verify and get hash_id
    try:
        profile = await api_client.get_profile()
        hash_id = req.hash_id or profile.get("public_id")

        if hash_id:
            config["hash_id"] = hash_id

            # Restart WebSocket
            if ws_client:
                await ws_client.close()
            if ws_task:
                ws_task.cancel()

            ws_client = AvitoWebSocket(
                sessid=req.sessid,
                hash_id=hash_id,
                on_message=on_ws_message,
                n8n_webhook=config.get("n8n_webhook"),
            )
            ws_task = asyncio.create_task(ws_client.run())

        return {
            "success": True,
            "profile": profile,
            "ws_started": hash_id is not None,
        }

    except Exception as e:
        raise HTTPException(500, f"Failed to refresh session: {e}")


@app.get("/ws/status")
async def ws_status():
    """Get WebSocket status."""
    if not ws_client:
        return {"connected": False, "reason": "Not initialized"}

    return {
        "connected": ws_client.running,
        "seq": ws_client.seq,
    }


# === Main ===

if __name__ == "__main__":
    import uvicorn

    port = config.get("port", 8791)
    uvicorn.run(
        "server:app",
        host="0.0.0.0",
        port=port,
        reload=True,
    )
