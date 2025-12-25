"""
Avito Mix MCP Server
Combines Official API + Reverse-engineered features

Official API:
- OAuth authentication
- Send/receive messages via webhooks
- Upload images
- Blacklist management

Reverse-engineered:
- Real-time WebSocket (faster than webhooks)
- User profiles with extended info
- Item extended details
- Typing indicators
"""
import asyncio
import json
import logging
from pathlib import Path
from typing import Optional, Dict, Any
from contextlib import asynccontextmanager

from fastapi import FastAPI, HTTPException, Request, BackgroundTasks
from pydantic import BaseModel
import httpx

from avito_official import AvitoOfficialAPI
from avito_reverse import AvitoReverseAPI, AvitoMixAPI

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(name)s: %(message)s"
)
logger = logging.getLogger("avito_mix")

# Config
CONFIG_PATH = Path(__file__).parent / "config.json"


def load_config() -> Dict[str, Any]:
    if CONFIG_PATH.exists():
        return json.loads(CONFIG_PATH.read_text(encoding="utf-8"))
    return {}


config = load_config()

# Global clients
mix_api: Optional[AvitoMixAPI] = None


async def forward_to_n8n(payload: Dict[str, Any]):
    """Forward message to n8n webhook"""
    n8n_url = config.get("webhook", {}).get("n8n_url")
    if not n8n_url:
        return

    try:
        async with httpx.AsyncClient(timeout=10.0) as client:
            response = await client.post(n8n_url, json=payload)
            logger.info("Forwarded to n8n: %s", response.status_code)
    except Exception as e:
        logger.error("Failed to forward to n8n: %s", e)


async def on_ws_message(data: Dict[str, Any]):
    """Handle WebSocket message (real-time)"""
    logger.info("WS Message: %s", json.dumps(data, ensure_ascii=False)[:200])

    value = data.get("value", {})
    normalized = {
        "source": "websocket_realtime",
        "channel_type": "avito_mix",
        "external_chat_id": value.get("channelId"),
        "external_message_id": value.get("id"),
        "message_type": value.get("type", "text"),
        "message_text": value.get("body", {}).get("text"),
        "sender_id": value.get("fromUid"),
        "timestamp": value.get("created"),
        "raw": data
    }
    await forward_to_n8n(normalized)


@asynccontextmanager
async def lifespan(app: FastAPI):
    global mix_api
    logger.info("Starting Avito Mix MCP Server...")

    # Create Official API client
    official_cfg = config.get("official_api", {})
    official = AvitoOfficialAPI(
        client_id=official_cfg["client_id"],
        client_secret=official_cfg["client_secret"],
        user_id=official_cfg["user_id"],
        api_base=official_cfg.get("api_base", "https://api.avito.ru"),
        token_url=official_cfg.get("token_url", "https://api.avito.ru/token")
    )

    # Create Reverse API client (if sessid provided)
    reverse_cfg = config.get("reverse_api", {})
    reverse = None
    if reverse_cfg.get("sessid"):
        reverse = AvitoReverseAPI(
            sessid=reverse_cfg["sessid"],
            user_hash=reverse_cfg.get("user_hash")
        )
        logger.info("Reverse API enabled with sessid")

    mix_api = AvitoMixAPI(official, reverse)
    logger.info("Mix API initialized for user_id=%s", official.user_id)

    # Start WebSocket if enabled
    if config.get("features", {}).get("use_reverse_for_realtime") and reverse:
        try:
            await mix_api.start_realtime(on_ws_message)
            logger.info("WebSocket real-time started")
        except Exception as e:
            logger.error("WebSocket start failed: %s", e)

    yield

    await mix_api.close()
    logger.info("Server shutdown")


app = FastAPI(
    title="Avito Mix MCP",
    description="Official API + Reverse-engineered features",
    version="1.0.0",
    lifespan=lifespan
)


# === Models ===

class SendMessageRequest(BaseModel):
    text: str


class WebhookSubscribeRequest(BaseModel):
    url: str


# === Health ===

@app.get("/health")
async def health():
    return {
        "service": "avito-mix-mcp",
        "status": "ok",
        "user_id": mix_api.official.user_id if mix_api else None,
        "features": {
            "official_api": True,
            "reverse_api": mix_api.reverse is not None if mix_api else False,
            "websocket_connected": mix_api.is_realtime_connected() if mix_api else False
        },
        "config": {
            "mode": config.get("mode", "hybrid"),
            "use_official_for_send": config.get("features", {}).get("use_official_for_send", True),
            "use_reverse_for_realtime": config.get("features", {}).get("use_reverse_for_realtime", False)
        }
    }


# === Account ===

@app.get("/account")
async def get_account():
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    return await mix_api.official.get_self()


# === Chats ===

@app.get("/chats")
async def get_chats(limit: int = 100, offset: int = 0, unread_only: bool = False):
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    return await mix_api.get_chats(limit=limit, offset=offset, unread_only=unread_only)


@app.get("/chats/{chat_id}")
async def get_chat(chat_id: str):
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    return await mix_api.official.get_chat(chat_id)


@app.get("/chats/{chat_id}/messages")
async def get_messages(chat_id: str, limit: int = 100, offset: int = 0):
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    return await mix_api.get_messages(chat_id, limit=limit, offset=offset)


@app.post("/chats/{chat_id}/send")
async def send_message(chat_id: str, req: SendMessageRequest):
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    result = await mix_api.send_message(chat_id, req.text)
    logger.info("Sent to %s: %s", chat_id, req.text[:50])
    return result


@app.post("/chats/{chat_id}/read")
async def mark_read(chat_id: str):
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    return await mix_api.official.mark_chat_read(chat_id)


# === Extended Info (Reverse API) ===

@app.get("/users/{user_hash}")
async def get_user_profile(user_hash: str):
    """Get user profile (reverse API)"""
    if not mix_api or not mix_api.reverse:
        raise HTTPException(400, "Reverse API not enabled")
    result = await mix_api.get_user_profile(user_hash)
    if not result:
        raise HTTPException(404, "User not found")
    return result


@app.get("/items/{item_id}")
async def get_item(item_id: int):
    """Get item extended info (reverse API)"""
    if not mix_api or not mix_api.reverse:
        raise HTTPException(400, "Reverse API not enabled")
    result = await mix_api.get_item_extended(item_id)
    if not result:
        raise HTTPException(404, "Item not found")
    return result


# === Webhooks ===

@app.post("/webhook/subscribe")
async def webhook_subscribe(req: WebhookSubscribeRequest):
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    return await mix_api.official.subscribe_webhook(req.url)


@app.post("/webhook/unsubscribe")
async def webhook_unsubscribe(req: WebhookSubscribeRequest):
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    return await mix_api.official.unsubscribe_webhook(req.url)


@app.get("/webhook/list")
async def webhook_list():
    if not mix_api:
        raise HTTPException(500, "Not initialized")
    return await mix_api.official.get_subscriptions()


# === Incoming Webhook Receiver ===

@app.post("/incoming")
async def incoming_webhook(request: Request, background_tasks: BackgroundTasks):
    """Receive webhook from Avito (official API)"""
    try:
        body = await request.json()
        logger.info("Webhook: %s", json.dumps(body, ensure_ascii=False)[:200])

        payload = body.get("payload", {})
        msg_type = payload.get("type")
        value = payload.get("value", {})

        if msg_type == "message":
            normalized = {
                "source": "webhook_official",
                "channel_type": "avito_mix",
                "external_chat_id": value.get("chat_id"),
                "external_message_id": value.get("id"),
                "message_type": value.get("type", "text"),
                "message_text": value.get("content", {}).get("text"),
                "sender_id": str(value.get("author_id")),
                "user_id": str(value.get("user_id")),
                "item_id": value.get("item_id"),
                "chat_type": value.get("chat_type"),
                "timestamp": value.get("created"),
                "raw": body
            }
            background_tasks.add_task(forward_to_n8n, normalized)

        return {"ok": True}

    except Exception as e:
        logger.error("Webhook error: %s", e)
        return {"ok": False, "error": str(e)}


# === WebSocket Control ===

@app.post("/websocket/start")
async def start_websocket():
    """Start WebSocket real-time connection"""
    if not mix_api or not mix_api.reverse:
        raise HTTPException(400, "Reverse API not enabled")

    if mix_api.is_realtime_connected():
        return {"status": "already_connected"}

    try:
        await mix_api.start_realtime(on_ws_message)
        return {"status": "connecting"}
    except Exception as e:
        raise HTTPException(500, str(e))


@app.get("/websocket/status")
async def websocket_status():
    """Get WebSocket connection status"""
    return {
        "enabled": mix_api.reverse is not None if mix_api else False,
        "connected": mix_api.is_realtime_connected() if mix_api else False
    }


# === Main ===

if __name__ == "__main__":
    import uvicorn
    server_config = config.get("server", {})
    uvicorn.run(
        "server:app",
        host=server_config.get("host", "0.0.0.0"),
        port=server_config.get("port", 8791),
        reload=True
    )
