"""
Avito Official API MCP Server
Stable server-side component for Avito integration

Features:
- Receive incoming messages via Avito webhook
- Get chats with read status (polling)
- Forward messages to n8n for processing

Requires: Free Avito API tier
"""
import json
import logging
from pathlib import Path
from typing import Optional, Dict, Any
from contextlib import asynccontextmanager

from fastapi import FastAPI, HTTPException, Request, BackgroundTasks
from fastapi.responses import JSONResponse
from pydantic import BaseModel
import httpx

from avito_api import AvitoOfficialAPI, create_client

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(name)s: %(message)s"
)
logger = logging.getLogger("avito_official")

# Config
CONFIG_PATH = Path(__file__).parent / "config.json"


def load_config() -> Dict[str, Any]:
    if CONFIG_PATH.exists():
        return json.loads(CONFIG_PATH.read_text(encoding="utf-8"))
    return {}


config = load_config()
avito: Optional[AvitoOfficialAPI] = None


@asynccontextmanager
async def lifespan(app: FastAPI):
    global avito
    logger.info("Starting Avito Official MCP Server...")
    avito = await create_client(config)
    logger.info("Avito client initialized for user_id=%s", avito.user_id)
    yield
    if avito:
        await avito.close()
    logger.info("Server shutdown")


app = FastAPI(
    title="Avito Official MCP",
    description="Server-side Avito integration via Official API",
    version="1.0.0",
    lifespan=lifespan
)


# === Models ===

class WebhookSubscribeRequest(BaseModel):
    url: str


# === Helpers ===

async def forward_to_n8n(payload: Dict[str, Any]):
    """Forward incoming message to n8n"""
    n8n_url = config.get("webhook", {}).get("n8n_url")
    if not n8n_url:
        logger.warning("n8n_url not configured")
        return

    try:
        async with httpx.AsyncClient(timeout=10.0) as client:
            response = await client.post(n8n_url, json=payload)
            logger.info("Forwarded to n8n: %s", response.status_code)
    except Exception as e:
        logger.error("Failed to forward to n8n: %s", e)


# === Health ===

@app.get("/health")
async def health():
    return {
        "service": "mcp-avito-official",
        "status": "ok",
        "user_id": avito.user_id if avito else None,
        "version": "1.0.0"
    }


# === Account ===

@app.get("/account")
async def get_account():
    """Get current account info"""
    if not avito:
        raise HTTPException(500, "Not initialized")
    try:
        return await avito.get_self()
    except Exception as e:
        raise HTTPException(500, str(e))


# === Chats (with read status) ===

@app.get("/chats")
async def get_chats(
    unread_only: bool = False,
    limit: int = 100,
    offset: int = 0
):
    """
    Get list of chats with last_message containing read status

    Response includes:
    - last_message.read: timestamp when read by customer (2 checkmarks)
    - last_message.delivered: timestamp when delivered (1 checkmark)
    """
    if not avito:
        raise HTTPException(500, "Not initialized")
    try:
        return await avito.get_chats(
            unread_only=unread_only,
            limit=limit,
            offset=offset
        )
    except Exception as e:
        raise HTTPException(500, str(e))


@app.get("/chats/{chat_id}")
async def get_chat(chat_id: str):
    """Get single chat details"""
    if not avito:
        raise HTTPException(500, "Not initialized")
    try:
        return await avito.get_chat(chat_id)
    except Exception as e:
        raise HTTPException(500, str(e))


# === Webhooks Management ===

@app.post("/webhook/subscribe")
async def webhook_subscribe(req: WebhookSubscribeRequest):
    """Subscribe to Avito webhook notifications"""
    if not avito:
        raise HTTPException(500, "Not initialized")
    try:
        result = await avito.subscribe_webhook(req.url)
        logger.info("Subscribed webhook: %s", req.url)
        return result
    except Exception as e:
        raise HTTPException(500, str(e))


@app.post("/webhook/unsubscribe")
async def webhook_unsubscribe(req: WebhookSubscribeRequest):
    """Unsubscribe from webhooks"""
    if not avito:
        raise HTTPException(500, "Not initialized")
    try:
        result = await avito.unsubscribe_webhook(req.url)
        logger.info("Unsubscribed webhook: %s", req.url)
        return result
    except Exception as e:
        raise HTTPException(500, str(e))


@app.get("/webhook/list")
async def webhook_list():
    """List all webhook subscriptions"""
    if not avito:
        raise HTTPException(500, "Not initialized")
    try:
        return await avito.get_subscriptions()
    except Exception as e:
        raise HTTPException(500, str(e))


# === Incoming Webhook Receiver ===

@app.post("/incoming")
async def incoming_webhook(request: Request, background_tasks: BackgroundTasks):
    """
    Receive webhook from Avito Official API

    This endpoint should be registered with Avito:
    POST /webhook/subscribe {"url": "https://your-server/incoming"}

    Avito sends:
    {
        "id": "webhook_id",
        "timestamp": 1234567890,
        "version": "v1.1",
        "payload": {
            "type": "message",
            "value": {
                "chat_id": "u2i-xxx",
                "author_id": 12345,
                "content": {"text": "Hello"},
                ...
            }
        }
    }
    """
    try:
        body = await request.json()
        logger.info("Webhook received: %s", json.dumps(body, ensure_ascii=False)[:300])

        payload = body.get("payload", {})
        msg_type = payload.get("type")
        value = payload.get("value", {})

        if msg_type == "message":
            # Normalize for ELO format
            normalized = {
                "source": "avito_official_webhook",
                "channel_type": "avito",
                "external_chat_id": value.get("chat_id"),
                "external_message_id": value.get("id"),
                "message_type": value.get("type", "text"),
                "message_text": value.get("content", {}).get("text"),
                "sender_id": str(value.get("author_id")),
                "user_id": str(value.get("user_id")),
                "item_id": value.get("item_id"),
                "chat_type": value.get("chat_type"),
                "timestamp": value.get("created"),
                "published_at": value.get("published_at"),
                "raw": body
            }

            # Forward to n8n in background
            background_tasks.add_task(forward_to_n8n, normalized)
            logger.info("Message from %s: %s", value.get("author_id"), value.get("content", {}).get("text", "")[:50])

        return {"ok": True}

    except Exception as e:
        logger.error("Webhook error: %s", e)
        # Return 200 to prevent Avito from retrying
        return {"ok": False, "error": str(e)}


# === Read Status Polling ===

@app.get("/read-status")
async def get_read_status(limit: int = 50):
    """
    Get read status for recent chats

    Returns list of chats with read status:
    - chat_id
    - last_message_read: timestamp or null
    - last_message_delivered: timestamp
    """
    if not avito:
        raise HTTPException(500, "Not initialized")

    try:
        chats_response = await avito.get_chats(limit=limit)
        chats = chats_response.get("chats", [])

        result = []
        for chat in chats:
            last_msg = chat.get("last_message", {})
            result.append({
                "chat_id": chat.get("id"),
                "last_message_id": last_msg.get("id"),
                "last_message_direction": last_msg.get("direction"),
                "last_message_read": last_msg.get("read"),  # null = not read, timestamp = read
                "last_message_delivered": last_msg.get("delivered"),
                "updated": chat.get("updated")
            })

        return {"chats": result}

    except Exception as e:
        raise HTTPException(500, str(e))


# === Main ===

if __name__ == "__main__":
    import uvicorn
    server_config = config.get("server", {})
    uvicorn.run(
        "server:app",
        host=server_config.get("host", "0.0.0.0"),
        port=server_config.get("port", 8790),
        reload=True
    )
