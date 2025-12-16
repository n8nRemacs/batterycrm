"""
Avito User Channel - HTTP + WebSocket
Port: 3003

Uses session cookies (sessid) from logged-in Avito account.
Based on reverse engineering of Avito APK.

HTTP REST API (m.avito.ru/web/1/messenger):
- POST /getChannels, /getChannelById, /getUserVisibleMessages
- POST /sendTextMessage, /readChats, /createItemChannel, /getUsers

WebSocket JSON-RPC (socket.avito.ru):
- avito.sendImageMessage.v2
- messenger.sendVoice
- messenger.sendVideo.v2
- messenger.sendFile.v2
- messenger.createFile.v1, messenger.createVoiceFile, messenger.createVideo.v1

Token Refresh (api.avito.ru):
- POST /3/refresh - обновление accessToken по refreshToken
"""

import asyncio
import logging
import os
import uuid
import json
import base64
import hashlib
from typing import Optional, Dict, Any, List
from datetime import datetime
from pathlib import Path

from fastapi import FastAPI, HTTPException, UploadFile, File, Form
from pydantic import BaseModel
import httpx
import websockets
from dotenv import load_dotenv

load_dotenv()

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger("AvitoChannel")

# Config
PORT = int(os.getenv("PORT", 3003))
HOST = os.getenv("HOST", "0.0.0.0")
WEBHOOK_URL = os.getenv("WEBHOOK_URL", "http://localhost:8000/webhook")

# Avito API
AVITO_HTTP_URL = "https://m.avito.ru/web/1/messenger"
AVITO_API_URL = "https://api.avito.ru"
AVITO_WS_URL = "wss://socket.avito.ru/wss"
AVITO_UPLOAD_URL = "https://socket.avito.ru"
AVITO_API_KEY = "Aewei8yaf0deeGho4eetos6cohQuoodooy2Ohmie"

# Session file for persistence
SESSION_FILE = Path(os.getenv("AVITO_SESSION_FILE", "avito_session.json"))


# === Pydantic Models ===

class SendMessageRequest(BaseModel):
    chat_id: str
    text: str
    quote_message_id: Optional[str] = None


class SendPhotoRequest(BaseModel):
    chat_id: str
    image_url: Optional[str] = None
    image_base64: Optional[str] = None
    caption: Optional[str] = None


class SendVoiceRequest(BaseModel):
    chat_id: str
    voice_url: Optional[str] = None
    voice_base64: Optional[str] = None
    duration: int = 0


class SendVideoRequest(BaseModel):
    chat_id: str
    video_url: Optional[str] = None
    video_base64: Optional[str] = None


class SendDocumentRequest(BaseModel):
    chat_id: str
    document_url: Optional[str] = None
    document_base64: Optional[str] = None
    filename: Optional[str] = "document"


class CreateChatRequest(BaseModel):
    item_id: str
    user_id: Optional[str] = None


class TypingRequest(BaseModel):
    chat_id: str


class DeleteMessageRequest(BaseModel):
    chat_id: str
    message_id: str


class SetTokensRequest(BaseModel):
    """Request to set OAuth tokens"""
    access_token: str
    refresh_token: str


# === Avito Client ===

class AvitoChannel:
    def __init__(self):
        self.http_client: Optional[httpx.AsyncClient] = None
        self.ws: Optional[websockets.WebSocketClientProtocol] = None
        self.sessid: Optional[str] = None
        self.access_token: Optional[str] = None
        self.refresh_token: Optional[str] = None
        self.is_authorized = False
        self.user_id: Optional[str] = None
        self._ws_request_id = 0
        self._ws_pending: Dict[int, asyncio.Future] = {}
        self._ws_task: Optional[asyncio.Task] = None
        self._refresh_lock = asyncio.Lock()

    async def start(self):
        """Initialize clients"""
        self.http_client = httpx.AsyncClient(timeout=30, follow_redirects=True)

        # Try to load saved session
        if SESSION_FILE.exists():
            try:
                data = json.loads(SESSION_FILE.read_text())
                self.sessid = data.get("sessid")
                self.access_token = data.get("access_token")
                self.refresh_token = data.get("refresh_token")
                self.user_id = data.get("user_id")

                if self.sessid:
                    logger.info("Loaded saved session, verifying...")
                    await self._verify_session()
            except Exception as e:
                logger.error(f"Failed to load session: {e}")

        # Fallback to env
        if not self.is_authorized:
            sessid = os.getenv("AVITO_SESSID") or os.getenv("AVITO_SESSION_COOKIE")
            if sessid:
                await self.set_session(sessid)

            # Also check for OAuth tokens in env
            access_token = os.getenv("AVITO_ACCESS_TOKEN")
            refresh_token = os.getenv("AVITO_REFRESH_TOKEN")
            if access_token and refresh_token:
                await self.set_tokens(access_token, refresh_token)

    def _save_session(self):
        """Save session to file"""
        try:
            SESSION_FILE.write_text(json.dumps({
                "sessid": self.sessid,
                "access_token": self.access_token,
                "refresh_token": self.refresh_token,
                "user_id": self.user_id,
                "saved_at": datetime.now().isoformat()
            }, indent=2))
            logger.info(f"Session saved to {SESSION_FILE}")
        except Exception as e:
            logger.error(f"Failed to save session: {e}")

    async def _verify_session(self):
        """Verify current session is valid"""
        try:
            result = await self._http_request("POST", "/getChannels", json={
                "limit": 1, "category": 1, "filters": {"anyTags": [], "excludeTags": []}
            })
            if result.get("success"):
                self.is_authorized = True
                channels = result.get("success", {}).get("channels", [])
                if channels:
                    self.user_id = channels[0].get("userId")
                logger.info(f"Session verified: user_id={self.user_id}")
                await self._connect_ws()
                return True
        except HTTPException as e:
            if e.status_code == 401:
                # Try to refresh token
                if self.refresh_token and self.access_token:
                    logger.info("Session expired, attempting refresh...")
                    if await self.refresh_tokens():
                        return await self._verify_session()
            logger.error(f"Session verification failed: {e}")
        except Exception as e:
            logger.error(f"Session verification failed: {e}")

        self.is_authorized = False
        return False

    async def stop(self):
        """Close clients"""
        if self._ws_task:
            self._ws_task.cancel()
        if self.ws:
            await self.ws.close()
        if self.http_client:
            await self.http_client.aclose()

    async def set_session(self, sessid: str):
        """Set session cookie and verify"""
        self.sessid = sessid
        await self._verify_session()
        if self.is_authorized:
            self._save_session()

    async def set_tokens(self, access_token: str, refresh_token: str):
        """Set OAuth tokens"""
        self.access_token = access_token
        self.refresh_token = refresh_token
        self._save_session()
        logger.info("OAuth tokens set")

    async def refresh_tokens(self) -> bool:
        """
        Refresh access token using refresh token.
        POST /3/refresh to api.avito.ru
        """
        async with self._refresh_lock:
            if not self.refresh_token or not self.access_token:
                logger.error("No tokens to refresh")
                return False

            try:
                # Build form data as in APK
                form_data = {
                    "refreshToken": self.refresh_token,
                    "accessToken": self.access_token,
                    "key": AVITO_API_KEY
                }

                response = await self.http_client.post(
                    f"{AVITO_API_URL}/3/refresh",
                    data=form_data,
                    headers={
                        "User-Agent": "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 Chrome/120.0.0.0 Mobile Safari/537.36",
                        "Content-Type": "application/x-www-form-urlencoded",
                    },
                    cookies={"sessid": self.sessid} if self.sessid else None
                )

                if response.status_code == 200:
                    data = response.json()
                    result = data.get("result", {})

                    new_access = result.get("accessToken") or result.get("access_token")
                    new_refresh = result.get("refreshToken") or result.get("refresh_token")

                    if new_access:
                        self.access_token = new_access
                        logger.info("Access token refreshed")

                    if new_refresh:
                        self.refresh_token = new_refresh
                        logger.info("Refresh token updated")

                    self._save_session()
                    return True

                elif response.status_code in (401, 403):
                    logger.error(f"Refresh failed: {response.status_code} - tokens invalid")
                    # Tokens are invalid, need to re-login
                    self.is_authorized = False
                    return False

                else:
                    logger.error(f"Refresh failed: {response.status_code} - {response.text}")
                    return False

            except Exception as e:
                logger.error(f"Token refresh error: {e}")
                return False

    async def _http_request_with_retry(self, method: str, path: str, json: Dict = None, retry_on_401: bool = True) -> Dict:
        """HTTP request with automatic token refresh on 401"""
        try:
            return await self._http_request(method, path, json)
        except HTTPException as e:
            if e.status_code == 401 and retry_on_401 and self.refresh_token:
                logger.info("Got 401, attempting token refresh...")
                if await self.refresh_tokens():
                    # Retry request after refresh
                    return await self._http_request(method, path, json)
            raise

    # === HTTP Methods ===

    async def _http_request(self, method: str, path: str, json: Dict = None) -> Dict:
        """HTTP request to m.avito.ru"""
        if not self.sessid:
            raise HTTPException(401, "Not authorized")

        response = await self.http_client.request(
            method=method,
            url=f"{AVITO_HTTP_URL}{path}",
            headers={
                "User-Agent": "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 Chrome/120.0.0.0 Mobile Safari/537.36",
                "Accept": "application/json",
                "Content-Type": "application/json",
                "Origin": "https://m.avito.ru",
                "Referer": "https://m.avito.ru/profile/messenger",
            },
            cookies={"sessid": self.sessid, "auth": "1"},
            json=json
        )

        if response.status_code == 401:
            self.is_authorized = False
            raise HTTPException(401, "Session expired")
        response.raise_for_status()
        return response.json()

    # === WebSocket Methods ===

    async def _connect_ws(self):
        """Connect to WebSocket"""
        try:
            headers = {
                "Cookie": f"sessid={self.sessid}; auth=1",
                "Origin": "https://m.avito.ru",
            }
            self.ws = await websockets.connect(
                AVITO_WS_URL,
                extra_headers=headers,
                ping_interval=30,
                ping_timeout=10
            )
            self._ws_task = asyncio.create_task(self._ws_listener())
            logger.info("WebSocket connected")
        except Exception as e:
            logger.error(f"WebSocket connection failed: {e}")
            self.ws = None

    async def _ws_listener(self):
        """Listen for WebSocket messages"""
        try:
            async for message in self.ws:
                data = json.loads(message)
                request_id = data.get("id")
                if request_id and request_id in self._ws_pending:
                    self._ws_pending[request_id].set_result(data)
        except websockets.ConnectionClosed:
            logger.warning("WebSocket disconnected")
            self.ws = None
        except Exception as e:
            logger.error(f"WebSocket error: {e}")

    async def _ws_call(self, method: str, params: Dict) -> Dict:
        """JSON-RPC call via WebSocket"""
        if not self.ws:
            await self._connect_ws()
        if not self.ws:
            raise HTTPException(503, "WebSocket not connected")

        self._ws_request_id += 1
        request_id = self._ws_request_id

        request = {
            "jsonrpc": "2.0",
            "id": request_id,
            "method": method,
            "params": params
        }

        future = asyncio.get_event_loop().create_future()
        self._ws_pending[request_id] = future

        await self.ws.send(json.dumps(request))

        try:
            result = await asyncio.wait_for(future, timeout=30)
            del self._ws_pending[request_id]

            if "error" in result:
                raise HTTPException(500, f"RPC Error: {result['error']}")
            return result.get("result", {})
        except asyncio.TimeoutError:
            del self._ws_pending[request_id]
            raise HTTPException(504, "WebSocket timeout")

    # === Upload Methods ===

    async def _upload_file(self, channel_id: str, file_data: bytes, content_type: str = "image/jpeg") -> str:
        """Upload file and get fileId/imageId"""
        # Create file slot
        create_result = await self._ws_call("messenger.createFile.v1", {
            "channelId": channel_id
        })

        file_id = create_result.get("fileId")
        upload_url = create_result.get("uploadUrl")

        if not upload_url:
            raise HTTPException(500, "No upload URL returned")

        # Upload file
        response = await self.http_client.put(
            upload_url,
            content=file_data,
            headers={
                "Content-Type": content_type,
                "Cookie": f"sessid={self.sessid}; auth=1",
            }
        )
        response.raise_for_status()

        return file_id

    async def _upload_image(self, channel_id: str, image_data: bytes) -> str:
        """Upload image and get imageId"""
        file_id = await self._upload_file(channel_id, image_data, "image/jpeg")
        return file_id

    async def _upload_voice(self, channel_id: str, voice_data: bytes, duration: int) -> tuple:
        """Upload voice and get voiceId, fileId"""
        create_result = await self._ws_call("messenger.createVoiceFile", {
            "channelId": channel_id,
            "duration": duration
        })

        voice_id = create_result.get("voiceId")
        file_id = create_result.get("fileId")
        upload_url = create_result.get("uploadUrl")

        if upload_url:
            response = await self.http_client.put(
                upload_url,
                content=voice_data,
                headers={
                    "Content-Type": "audio/ogg",
                    "Cookie": f"sessid={self.sessid}; auth=1",
                }
            )
            response.raise_for_status()

        return voice_id, file_id

    # === Helper Methods ===

    def _parse_timestamp(self, ns_timestamp: int) -> Optional[str]:
        if not ns_timestamp:
            return None
        return datetime.fromtimestamp(ns_timestamp / 1_000_000_000).isoformat()

    def _extract_message(self, message: dict) -> dict:
        body = message.get("body", {})
        text_obj = body.get("text", {})

        msg_type = "text"
        media_url = None
        media_info = {}

        if body.get("image"):
            msg_type = "image"
            img = body["image"]
            media_url = img.get("url") or img.get("imageUrl")
            media_info = {"image_id": img.get("imageId"), "width": img.get("width"), "height": img.get("height")}
        elif body.get("voice"):
            msg_type = "voice"
            media_info = {"voice_id": body["voice"].get("voiceId"), "duration": body["voice"].get("duration")}
        elif body.get("video"):
            msg_type = "video"
            media_info = {"video_id": body["video"].get("videoId"), "file_id": body["video"].get("fileId")}
        elif body.get("file"):
            msg_type = "file"
            media_info = {"file_id": body["file"].get("fileId"), "file_name": body["file"].get("name")}
        elif body.get("location"):
            msg_type = "location"
            media_info = {"lat": body["location"].get("lat"), "lon": body["location"].get("lon")}

        return {
            "id": message.get("id"),
            "date": self._parse_timestamp(message.get("createdAt")),
            "author_id": message.get("authorId"),
            "is_mine": message.get("authorId") == self.user_id,
            "type": msg_type,
            "text": text_obj.get("text") if isinstance(text_obj, dict) else str(text_obj) if text_obj else None,
            "media_url": media_url,
            "media_info": media_info if media_info else None,
            "read_at": self._parse_timestamp(message.get("readAt")),
            "is_read": message.get("readAt") is not None,
        }

    def _extract_dialog(self, channel: dict) -> dict:
        info = channel.get("info", {})
        details = info.get("details", {})
        last_msg = channel.get("lastMessage", {})
        users = channel.get("users", [])

        other_user = next((u for u in users if u.get("id") != channel.get("userId")), None)

        return {
            "id": channel.get("id"),
            "type": "item" if channel.get("id", "").startswith("u2i-") else "support",
            "created": self._parse_timestamp(channel.get("created")),
            "updated": self._parse_timestamp(channel.get("updated")),
            "is_read": channel.get("isRead", False),
            "item_id": details.get("itemId"),
            "item_title": details.get("title"),
            "item_price": details.get("price"),
            "contact_name": other_user.get("name") if other_user else info.get("name"),
            "contact_id": other_user.get("id") if other_user else None,
            "last_message": last_msg.get("body", {}).get("text", {}).get("text") if last_msg else None,
            "unread_count": channel.get("unreadCount", 0),
        }

    # === API Methods ===

    async def get_dialogs(self, limit: int = 30, category: int = 1) -> List[Dict]:
        data = await self._http_request("POST", "/getChannels", json={
            "limit": limit, "category": category, "filters": {"anyTags": [], "excludeTags": []}
        })
        return [self._extract_dialog(ch) for ch in data.get("success", {}).get("channels", [])]

    async def get_history(self, chat_id: str, limit: int = 100) -> List[Dict]:
        data = await self._http_request("POST", "/getUserVisibleMessages", json={
            "channelId": chat_id, "limit": limit, "order": 0
        })
        return [self._extract_message(msg) for msg in data.get("success", {}).get("messages", [])]

    async def send_message(self, chat_id: str, text: str, quote_id: str = None) -> Dict:
        """Send text message via HTTP"""
        payload = {"channelId": chat_id, "text": text, "idempotencyKey": str(uuid.uuid4())}
        if quote_id:
            payload["quoteMessageId"] = quote_id
        data = await self._http_request("POST", "/sendTextMessage", json=payload)
        return {"success": True, "message_id": data.get("success", {}).get("messageId")}

    async def send_image(self, chat_id: str, image_data: bytes) -> Dict:
        """Send image via WebSocket"""
        image_id = await self._upload_image(chat_id, image_data)

        result = await self._ws_call("avito.sendImageMessage.v2", {
            "channelId": chat_id,
            "imageId": image_id,
            "randomId": str(uuid.uuid4())
        })

        return {"success": True, "message_id": result.get("id")}

    async def send_voice(self, chat_id: str, voice_data: bytes, duration: int) -> Dict:
        """Send voice via WebSocket"""
        voice_id, file_id = await self._upload_voice(chat_id, voice_data, duration)

        result = await self._ws_call("messenger.sendVoice", {
            "channelId": chat_id,
            "voiceId": voice_id,
            "fileId": file_id,
            "randomId": str(uuid.uuid4())
        })

        return {"success": True, "message_id": result.get("id")}

    async def send_video(self, chat_id: str, video_data: bytes) -> Dict:
        """Send video via WebSocket"""
        # Create video slot
        create_result = await self._ws_call("messenger.createVideo.v1", {
            "channelId": chat_id
        })

        video_id = create_result.get("videoId")
        file_id = create_result.get("fileId")
        upload_url = create_result.get("uploadUrl")

        if upload_url:
            response = await self.http_client.put(
                upload_url,
                content=video_data,
                headers={
                    "Content-Type": "video/mp4",
                    "Cookie": f"sessid={self.sessid}; auth=1",
                }
            )
            response.raise_for_status()

        result = await self._ws_call("messenger.sendVideo.v2", {
            "channelId": chat_id,
            "videoId": video_id,
            "fileId": file_id,
            "randomId": str(uuid.uuid4())
        })

        return {"success": True, "message_id": result.get("id")}

    async def send_document(self, chat_id: str, doc_data: bytes, filename: str) -> Dict:
        """Send document via WebSocket"""
        file_id = await self._upload_file(chat_id, doc_data, "application/octet-stream")

        result = await self._ws_call("messenger.sendFile.v2", {
            "channelId": chat_id,
            "fileId": file_id,
            "fileName": filename,
            "randomId": str(uuid.uuid4())
        })

        return {"success": True, "message_id": result.get("id")}

    async def mark_as_read(self, chat_ids: List[str]) -> Dict:
        await self._http_request("POST", "/readChats", json={"channelIds": chat_ids, "category": 1})
        return {"success": True}

    async def send_typing(self, chat_id: str) -> Dict:
        """Send typing indicator via WebSocket"""
        await self._ws_call("messenger.typing", {
            "channelId": chat_id
        })
        return {"success": True}

    async def delete_message(self, chat_id: str, message_id: str) -> Dict:
        """Delete message via WebSocket"""
        result = await self._ws_call("messenger.deleteMessage", {
            "channelId": chat_id,
            "messageId": message_id
        })
        return {"success": True, "deleted": result.get("deleted", True)}

    async def create_chat(self, item_id: str) -> Dict:
        data = await self._http_request("POST", "/createItemChannel", json={"itemId": item_id})
        channel = data.get("success", {}).get("channel")
        return self._extract_dialog(channel) if channel else {}


# === FastAPI ===

channel = AvitoChannel()
app = FastAPI(title="Avito User Channel", version="3.1.0", description="Avito Messenger with WebSocket and Token Refresh support")


@app.on_event("startup")
async def startup():
    await channel.start()


@app.on_event("shutdown")
async def shutdown():
    await channel.stop()


@app.get("/health")
async def health():
    return {
        "status": "ok",
        "service": "avito",
        "authorized": channel.is_authorized,
        "websocket": channel.ws is not None,
        "user_id": channel.user_id,
        "has_refresh_token": channel.refresh_token is not None,
        "capabilities": {
            "send_text": True,
            "send_image": True,
            "send_voice": True,
            "send_video": True,
            "send_document": True,
            "receive_media": True,
            "typing": True,
            "delete_message": True,
            "token_refresh": True,
        }
    }


@app.post("/session")
async def set_session(sessid: str = Form(...)):
    """Set session cookie (sessid from browser)"""
    await channel.set_session(sessid)
    return {"success": channel.is_authorized, "user_id": channel.user_id}


@app.post("/tokens")
async def set_tokens(req: SetTokensRequest):
    """Set OAuth tokens (access_token + refresh_token)"""
    await channel.set_tokens(req.access_token, req.refresh_token)
    return {
        "success": True,
        "message": "Tokens saved. Use /refresh to refresh when expired."
    }


@app.post("/refresh")
async def refresh_tokens():
    """Manually refresh access token using refresh token"""
    if not channel.refresh_token:
        raise HTTPException(400, "No refresh token set. Use /tokens first.")

    success = await channel.refresh_tokens()
    if success:
        return {
            "success": True,
            "message": "Tokens refreshed successfully"
        }
    else:
        raise HTTPException(401, "Token refresh failed. Re-login required.")


@app.get("/dialogs")
async def get_dialogs(limit: int = 30, category: int = 1):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.get_dialogs(limit, category)


@app.get("/history/{chat_id}")
async def get_history(chat_id: str, limit: int = 100):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.get_history(chat_id, limit)


@app.post("/send")
async def send_message(req: SendMessageRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.send_message(req.chat_id, req.text, req.quote_message_id)


@app.post("/send/photo")
async def send_photo(req: SendPhotoRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")

    if req.image_base64:
        image_data = base64.b64decode(req.image_base64)
    elif req.image_url:
        async with httpx.AsyncClient() as client:
            resp = await client.get(req.image_url)
            image_data = resp.content
    else:
        raise HTTPException(400, "image_url or image_base64 required")

    return await channel.send_image(req.chat_id, image_data)


@app.post("/send/photo/upload")
async def send_photo_upload(chat_id: str = Form(...), file: UploadFile = File(...)):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    image_data = await file.read()
    return await channel.send_image(chat_id, image_data)


@app.post("/send/voice")
async def send_voice(req: SendVoiceRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")

    if req.voice_base64:
        voice_data = base64.b64decode(req.voice_base64)
    elif req.voice_url:
        async with httpx.AsyncClient() as client:
            resp = await client.get(req.voice_url)
            voice_data = resp.content
    else:
        raise HTTPException(400, "voice_url or voice_base64 required")

    return await channel.send_voice(req.chat_id, voice_data, req.duration)


@app.post("/send/video")
async def send_video(req: SendVideoRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")

    if req.video_base64:
        video_data = base64.b64decode(req.video_base64)
    elif req.video_url:
        async with httpx.AsyncClient() as client:
            resp = await client.get(req.video_url)
            video_data = resp.content
    else:
        raise HTTPException(400, "video_url or video_base64 required")

    return await channel.send_video(req.chat_id, video_data)


@app.post("/send/document")
async def send_document(req: SendDocumentRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")

    if req.document_base64:
        doc_data = base64.b64decode(req.document_base64)
    elif req.document_url:
        async with httpx.AsyncClient() as client:
            resp = await client.get(req.document_url)
            doc_data = resp.content
    else:
        raise HTTPException(400, "document_url or document_base64 required")

    return await channel.send_document(req.chat_id, doc_data, req.filename)


@app.post("/send/video/upload")
async def send_video_upload(chat_id: str = Form(...), file: UploadFile = File(...)):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    video_data = await file.read()
    return await channel.send_video(chat_id, video_data)


@app.post("/send/document/upload")
async def send_document_upload(chat_id: str = Form(...), file: UploadFile = File(...)):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    doc_data = await file.read()
    filename = file.filename or "document"
    return await channel.send_document(chat_id, doc_data, filename)


@app.post("/mark_read")
async def mark_read(chat_ids: List[str]):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.mark_as_read(chat_ids)


@app.post("/create_chat")
async def create_chat(req: CreateChatRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.create_chat(req.item_id)


@app.post("/typing")
async def send_typing(req: TypingRequest):
    """Send typing indicator (user is typing...)"""
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.send_typing(req.chat_id)


@app.delete("/message")
async def delete_message(req: DeleteMessageRequest):
    """Delete a message"""
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.delete_message(req.chat_id, req.message_id)


if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host=HOST, port=PORT)
