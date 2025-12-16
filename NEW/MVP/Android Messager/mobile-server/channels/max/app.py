"""
MAX (VK Teams / OneMe) User Channel - WebSocket API
Port: 3004

Uses WebSocket API via vkmax library.
Based on reverse engineering: wss://ws-api.oneme.ru/websocket

Authentication:
1. First time: phone + SMS code -> save token
2. Next times: login by saved token

Protocol: JSON packets with opcodes (ver=11)
- opcode 64: send message
- opcode 48: get chats
- opcode 49: get history
- opcode 51: typing indicator
- opcode 66: delete message
- opcode 67: edit message
"""

import asyncio
import itertools
import json
import logging
import os
import uuid
import base64
from typing import Optional, Dict, Any, List
from datetime import datetime
from random import randint
from pathlib import Path

from fastapi import FastAPI, HTTPException, UploadFile, File, Form
from pydantic import BaseModel
import aiohttp
import websockets
from dotenv import load_dotenv

load_dotenv()

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger("MAXChannel")

# Config
PORT = int(os.getenv("PORT", 3004))
HOST = os.getenv("HOST", "0.0.0.0")
WEBHOOK_URL = os.getenv("WEBHOOK_URL", "http://localhost:8000/webhook")

# MAX API
WS_URL = "wss://ws-api.oneme.ru/websocket"
RPC_VERSION = 11
APP_VERSION = "25.11.2"
USER_AGENT = "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 Chrome/120.0.0.0 Mobile Safari/537.36"

# Session file
SESSION_FILE = Path(os.getenv("MAX_SESSION_FILE", "max_session.json"))


# === Pydantic Models ===

class SendMessageRequest(BaseModel):
    chat_id: int
    text: str
    reply_to: Optional[str] = None


class SendPhotoRequest(BaseModel):
    chat_id: int
    image_url: Optional[str] = None
    image_base64: Optional[str] = None
    caption: Optional[str] = ""


class SendVoiceRequest(BaseModel):
    chat_id: int
    voice_url: Optional[str] = None
    voice_base64: Optional[str] = None
    duration_ms: int = 0


class SendFileRequest(BaseModel):
    chat_id: int
    file_url: Optional[str] = None
    file_base64: Optional[str] = None
    filename: str = "file.bin"
    caption: Optional[str] = ""


class SendStickerRequest(BaseModel):
    chat_id: int
    sticker_id: int


class SendLocationRequest(BaseModel):
    chat_id: int
    latitude: float
    longitude: float
    text: Optional[str] = ""


class TypingRequest(BaseModel):
    chat_id: int


class DeleteMessageRequest(BaseModel):
    chat_id: int
    message_ids: List[str]
    for_me: bool = False


class EditMessageRequest(BaseModel):
    chat_id: int
    message_id: str
    text: str


class ReadMessageRequest(BaseModel):
    chat_id: int
    message_id: str


class AuthStartRequest(BaseModel):
    phone: str


class AuthVerifyRequest(BaseModel):
    sms_code: str


class AuthTokenRequest(BaseModel):
    token: str
    device_id: Optional[str] = None


# === MAX Client ===

class MAXChannel:
    def __init__(self):
        self.ws: Optional[websockets.WebSocketClientProtocol] = None
        self.http_session: Optional[aiohttp.ClientSession] = None
        self.is_authorized = False
        self.user_id: Optional[int] = None
        self.phone: Optional[str] = None
        self.device_id: Optional[str] = None
        self.login_token: Optional[str] = None
        self.sms_token: Optional[str] = None  # temporary token for SMS verification

        self._seq = itertools.count(1)
        self._pending: Dict[int, asyncio.Future] = {}
        self._recv_task: Optional[asyncio.Task] = None
        self._keepalive_task: Optional[asyncio.Task] = None
        self._incoming_callback = None

    async def start(self):
        """Initialize and try to restore session"""
        self.http_session = aiohttp.ClientSession()

        # Try to load saved session
        if SESSION_FILE.exists():
            try:
                data = json.loads(SESSION_FILE.read_text())
                self.device_id = data.get("device_id")
                self.login_token = data.get("login_token")

                if self.login_token and self.device_id:
                    logger.info("Found saved session, attempting login...")
                    await self._connect()
                    await self.login_by_token(self.login_token, self.device_id)
            except Exception as e:
                logger.error(f"Failed to restore session: {e}")

        # Try env token
        if not self.is_authorized:
            token = os.getenv("MAX_LOGIN_TOKEN")
            device_id = os.getenv("MAX_DEVICE_ID")
            if token and device_id:
                logger.info("Using token from env...")
                await self._connect()
                await self.login_by_token(token, device_id)

    async def stop(self):
        """Cleanup"""
        if self._keepalive_task:
            self._keepalive_task.cancel()
        if self._recv_task:
            self._recv_task.cancel()
        if self.ws:
            await self.ws.close()
        if self.http_session:
            await self.http_session.close()

    def _save_session(self):
        """Save session to file"""
        if self.device_id and self.login_token:
            SESSION_FILE.write_text(json.dumps({
                "device_id": self.device_id,
                "login_token": self.login_token,
                "user_id": self.user_id,
                "phone": self.phone,
                "saved_at": datetime.now().isoformat()
            }, indent=2))
            logger.info(f"Session saved to {SESSION_FILE}")

    # === WebSocket Connection ===

    async def _connect(self):
        """Connect to WebSocket"""
        if self.ws:
            return

        logger.info(f"Connecting to {WS_URL}...")
        self.ws = await websockets.connect(
            WS_URL,
            origin="https://web.max.ru",
            user_agent=USER_AGENT,
            ping_interval=None  # We handle keepalive manually
        )

        self._recv_task = asyncio.create_task(self._recv_loop())
        logger.info("WebSocket connected")

    async def _recv_loop(self):
        """Receive messages from WebSocket"""
        try:
            async for message in self.ws:
                packet = json.loads(message)
                seq = packet.get("seq")

                # Response to our request
                if seq in self._pending:
                    self._pending[seq].set_result(packet)
                    continue

                # Incoming event
                opcode = packet.get("opcode")
                if opcode == 128:  # New message
                    if self._incoming_callback:
                        asyncio.create_task(self._incoming_callback(packet))
                elif opcode == 136:  # Upload complete
                    pass  # Handle upload completion if needed

        except websockets.ConnectionClosed:
            logger.warning("WebSocket disconnected")
            self.ws = None
            self.is_authorized = False
        except asyncio.CancelledError:
            pass
        except Exception as e:
            logger.error(f"Recv loop error: {e}")

    async def _keepalive_loop(self):
        """Send keepalive every 30 seconds"""
        try:
            while True:
                await asyncio.sleep(30)
                await self.invoke_method(1, {"interactive": False})
        except asyncio.CancelledError:
            pass
        except Exception as e:
            logger.error(f"Keepalive error: {e}")

    async def invoke_method(self, opcode: int, payload: Dict) -> Dict:
        """Send request and wait for response"""
        if not self.ws:
            raise HTTPException(503, "Not connected")

        seq = next(self._seq)

        request = {
            "ver": RPC_VERSION,
            "cmd": 0,
            "seq": seq,
            "opcode": opcode,
            "payload": payload
        }

        future = asyncio.get_event_loop().create_future()
        self._pending[seq] = future

        await self.ws.send(json.dumps(request))

        try:
            response = await asyncio.wait_for(future, timeout=30)
            del self._pending[seq]

            if "error" in response.get("payload", {}):
                raise HTTPException(500, f"MAX Error: {response['payload']['error']}")

            return response
        except asyncio.TimeoutError:
            del self._pending[seq]
            raise HTTPException(504, "Request timeout")

    # === Authentication ===

    async def _send_hello(self, device_id: str = None):
        """Send hello packet (opcode 6)"""
        self.device_id = device_id or str(uuid.uuid4())

        return await self.invoke_method(6, {
            "userAgent": {
                "deviceType": "WEB",
                "locale": "ru_RU",
                "osVersion": "Android",
                "deviceName": "Mobile Server",
                "headerUserAgent": USER_AGENT,
                "deviceLocale": "ru-RU",
                "appVersion": APP_VERSION,
                "screen": "1080x1920",
                "timezone": "Europe/Moscow"
            },
            "deviceId": self.device_id
        })

    async def send_code(self, phone: str) -> str:
        """Request SMS code (opcode 17)"""
        if not self.ws:
            await self._connect()

        await self._send_hello()

        response = await self.invoke_method(17, {
            "phone": phone,
            "type": "START_AUTH",
            "language": "ru"
        })

        self.sms_token = response["payload"]["token"]
        self.phone = phone
        logger.info(f"SMS sent to {phone}")

        return self.sms_token

    async def verify_code(self, sms_code: str) -> Dict:
        """Verify SMS code (opcode 18)"""
        if not self.sms_token:
            raise HTTPException(400, "Call send_code first")

        response = await self.invoke_method(18, {
            "token": self.sms_token,
            "verifyCode": str(sms_code),
            "authTokenType": "CHECK_CODE"
        })

        payload = response.get("payload", {})

        if "error" in payload:
            raise HTTPException(401, f"Verification failed: {payload['error']}")

        # Extract login token for future sessions
        self.login_token = payload.get("tokenAttrs", {}).get("LOGIN", {}).get("token")
        self.user_id = payload.get("profile", {}).get("id")
        self.phone = payload.get("profile", {}).get("contact", {}).get("phone")
        self.is_authorized = True

        # Save session
        self._save_session()

        # Start keepalive
        self._keepalive_task = asyncio.create_task(self._keepalive_loop())

        logger.info(f"Logged in as {self.phone} (user_id={self.user_id})")

        return {
            "success": True,
            "user_id": self.user_id,
            "phone": self.phone,
            "token": self.login_token,
            "device_id": self.device_id
        }

    async def login_by_token(self, token: str, device_id: str = None) -> Dict:
        """Login by saved token (opcode 19)"""
        if not self.ws:
            await self._connect()

        await self._send_hello(device_id)

        response = await self.invoke_method(19, {
            "interactive": True,
            "token": token,
            "chatsSync": 0,
            "contactsSync": 0,
            "presenceSync": 0,
            "draftsSync": 0,
            "chatsCount": 40
        })

        payload = response.get("payload", {})

        if "error" in payload:
            raise HTTPException(401, f"Token login failed: {payload['error']}")

        self.login_token = token
        self.user_id = payload.get("profile", {}).get("id")
        self.phone = payload.get("profile", {}).get("contact", {}).get("phone")
        self.is_authorized = True

        # Save session
        self._save_session()

        # Start keepalive
        self._keepalive_task = asyncio.create_task(self._keepalive_loop())

        logger.info(f"Logged in by token as {self.phone} (user_id={self.user_id})")

        return {
            "success": True,
            "user_id": self.user_id,
            "phone": self.phone
        }

    # === Messaging Methods ===

    async def get_chats(self, count: int = 40, offset: int = 0) -> List[Dict]:
        """Get list of chats (opcode 48)"""
        response = await self.invoke_method(48, {
            "chatIds": [],
            "count": count,
            "offset": offset
        })

        chats = response.get("payload", {}).get("chats", [])
        return [self._extract_chat(ch) for ch in chats]

    async def get_chat_history(self, chat_id: int, count: int = 30, from_message_id: int = None) -> List[Dict]:
        """Get chat messages (opcode 49)"""
        payload = {
            "chatId": chat_id,
            "backward": count,
            "forward": 0,
            "getMessages": True
        }

        if from_message_id:
            payload["from"] = from_message_id

        response = await self.invoke_method(49, payload)

        messages = response.get("payload", {}).get("messages", [])
        return [self._extract_message(msg) for msg in messages]

    async def send_message(self, chat_id: int, text: str, reply_to: str = None, attaches: List = None) -> Dict:
        """Send message (opcode 64)"""
        payload = {
            "chatId": chat_id,
            "message": {
                "text": text,
                "cid": randint(1750000000000, 2000000000000),
                "elements": [],
                "attaches": attaches or []
            },
            "notify": True
        }

        if reply_to:
            payload["message"]["link"] = {
                "type": "REPLY",
                "messageId": str(reply_to)
            }

        response = await self.invoke_method(64, payload)

        return {
            "success": True,
            "message_id": response.get("payload", {}).get("message", {}).get("id")
        }

    async def edit_message(self, chat_id: int, message_id: str, text: str) -> Dict:
        """Edit message (opcode 67)"""
        response = await self.invoke_method(67, {
            "chatId": chat_id,
            "messageId": str(message_id),
            "text": text,
            "elements": [],
            "attachments": []
        })

        return {"success": True}

    async def delete_message(self, chat_id: int, message_ids: List[str], for_me: bool = False) -> Dict:
        """Delete messages (opcode 66)"""
        response = await self.invoke_method(66, {
            "chatId": chat_id,
            "messageIds": [str(mid) for mid in message_ids],
            "forMe": for_me
        })

        return {"success": True}

    async def read_message(self, chat_id: int, message_id: str) -> Dict:
        """Mark message as read (opcode 50)"""
        response = await self.invoke_method(50, {
            "type": "READ_MESSAGE",
            "chatId": chat_id,
            "messageId": str(message_id),
            "mark": randint(1750000000000, 2000000000000)
        })

        return {"success": True}

    async def set_typing(self, chat_id: int, typing: bool = True) -> Dict:
        """Send typing indicator (opcode 51)"""
        response = await self.invoke_method(51, {
            "chatId": chat_id,
            "typing": typing
        })

        return {"success": True}

    async def send_sticker(self, chat_id: int, sticker_id: int) -> Dict:
        """Send sticker (opcode 64)"""
        return await self.send_message(
            chat_id, "",
            attaches=[{"_type": "STICKER", "stickerId": sticker_id}]
        )

    async def send_location(self, chat_id: int, lat: float, lon: float, text: str = "") -> Dict:
        """Send location (opcode 64)"""
        return await self.send_message(
            chat_id, text,
            attaches=[{"_type": "LOCATION", "lat": lat, "lon": lon}]
        )

    # === Upload Methods ===

    async def _get_upload_url(self, opcode: int) -> Dict:
        """Get upload URL"""
        response = await self.invoke_method(opcode, {"count": 1})
        return response.get("payload", {})

    async def _upload_notify(self, chat_id: int, attach_type: str):
        """Notify about upload start (opcode 65)"""
        await self.invoke_method(65, {
            "chatId": chat_id,
            "type": attach_type
        })

    async def _upload_file(self, url: str, data: bytes, filename: str, mimetype: str) -> aiohttp.ClientResponse:
        """Upload file to URL"""
        headers = {
            "Accept": "*/*",
            "Origin": "https://web.max.ru",
            "Referer": "https://web.max.ru/",
            "User-Agent": USER_AGENT
        }

        form = aiohttp.FormData()
        form.add_field("file", data, filename=filename, content_type=mimetype)

        async with self.http_session.post(url, headers=headers, data=form) as resp:
            resp.raise_for_status()
            return await resp.json()

    async def send_photo(self, chat_id: int, image_data: bytes, caption: str = "") -> Dict:
        """Upload and send photo"""
        # Get upload URL (opcode 80)
        upload_info = await self._get_upload_url(80)
        upload_url = upload_info.get("url")

        # Notify
        await self._upload_notify(chat_id, "PHOTO")

        # Upload
        result = await self._upload_file(upload_url, image_data, "image.jpg", "image/jpeg")
        token = list(result.get("photos", {}).values())[0]["token"]

        # Send message with photo
        return await self.send_message(
            chat_id, caption,
            attaches=[{"_type": "PHOTO", "photoToken": token}]
        )

    async def send_voice(self, chat_id: int, voice_data: bytes, duration_ms: int = 0) -> Dict:
        """Upload and send voice message"""
        # Get upload URL (opcode 84)
        upload_info = await self._get_upload_url(84)
        info = upload_info.get("info", [{}])[0]
        upload_url = info.get("url")
        voice_id = info.get("voiceId") or info.get("fileId")

        # Notify
        await self._upload_notify(chat_id, "VOICE")

        # Upload
        await self._upload_file(upload_url, voice_data, "voice.ogg", "audio/ogg")

        # Send message with voice
        return await self.send_message(
            chat_id, "",
            attaches=[{"_type": "VOICE", "voiceId": voice_id, "duration": duration_ms}]
        )

    async def send_file(self, chat_id: int, file_data: bytes, filename: str, caption: str = "") -> Dict:
        """Upload and send file"""
        # Get upload URL (opcode 87)
        upload_info = await self._get_upload_url(87)
        info = upload_info.get("info", [{}])[0]
        upload_url = info.get("url")
        file_id = info.get("fileId")

        # Notify
        await self._upload_notify(chat_id, "FILE")

        # Upload
        await self._upload_file(upload_url, file_data, filename, "application/octet-stream")

        # Send message with file
        return await self.send_message(
            chat_id, caption,
            attaches=[{"_type": "FILE", "fileId": file_id}]
        )

    # === Helpers ===

    def _extract_chat(self, chat: Dict) -> Dict:
        """Extract chat info"""
        return {
            "id": chat.get("chatId"),
            "type": chat.get("chatType"),  # CHAT, CHANNEL, etc.
            "title": chat.get("title"),
            "icon": chat.get("icon"),
            "last_message": chat.get("lastMessage", {}).get("text"),
            "last_message_time": chat.get("lastMessage", {}).get("timestamp"),
            "unread_count": chat.get("unreadCount", 0),
            "is_muted": chat.get("isMuted", False),
        }

    def _extract_message(self, msg: Dict) -> Dict:
        """Extract message info"""
        attaches = msg.get("attaches", [])
        msg_type = "text"
        media_info = {}

        for attach in attaches:
            atype = attach.get("_type")
            if atype == "PHOTO":
                msg_type = "photo"
                media_info = {"photo_token": attach.get("photoToken")}
            elif atype == "VIDEO":
                msg_type = "video"
                media_info = {"video_id": attach.get("videoId")}
            elif atype == "VOICE":
                msg_type = "voice"
                media_info = {"voice_id": attach.get("voiceId"), "duration": attach.get("duration")}
            elif atype == "FILE":
                msg_type = "file"
                media_info = {"file_id": attach.get("fileId")}
            elif atype == "STICKER":
                msg_type = "sticker"
                media_info = {"sticker_id": attach.get("stickerId")}
            elif atype == "LOCATION":
                msg_type = "location"
                media_info = {"lat": attach.get("lat"), "lon": attach.get("lon")}

        return {
            "id": msg.get("id"),
            "cid": msg.get("cid"),
            "text": msg.get("text"),
            "type": msg_type,
            "media_info": media_info if media_info else None,
            "sender_id": msg.get("senderId"),
            "timestamp": msg.get("timestamp"),
            "is_edited": msg.get("isEdited", False),
        }


# === FastAPI ===

channel = MAXChannel()
app = FastAPI(
    title="MAX User Channel",
    version="2.0.0",
    description="MAX (VK Teams) Messenger via WebSocket User API"
)


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
        "service": "max",
        "authorized": channel.is_authorized,
        "websocket": channel.ws is not None,
        "user_id": channel.user_id,
        "phone": channel.phone,
        "capabilities": {
            "send_text": True,
            "send_photo": True,
            "send_voice": True,
            "send_file": True,
            "send_sticker": True,
            "send_location": True,
            "typing": True,
            "edit_message": True,
            "delete_message": True,
            "read_message": True,
        }
    }


# === Auth Endpoints ===

@app.post("/auth/send_code")
async def auth_send_code(req: AuthStartRequest):
    """Step 1: Request SMS code"""
    token = await channel.send_code(req.phone)
    return {"success": True, "message": f"SMS sent to {req.phone}"}


@app.post("/auth/verify_code")
async def auth_verify_code(req: AuthVerifyRequest):
    """Step 2: Verify SMS code"""
    result = await channel.verify_code(req.sms_code)
    return result


@app.post("/auth/token")
async def auth_by_token(req: AuthTokenRequest):
    """Login by saved token"""
    result = await channel.login_by_token(req.token, req.device_id)
    return result


# === Chat Endpoints ===

@app.get("/dialogs")
async def get_dialogs(limit: int = 40, offset: int = 0):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.get_chats(limit, offset)


@app.get("/history/{chat_id}")
async def get_history(chat_id: int, limit: int = 30):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.get_chat_history(chat_id, limit)


# === Message Endpoints ===

@app.post("/send")
async def send_message(req: SendMessageRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.send_message(req.chat_id, req.text, req.reply_to)


@app.post("/send/photo")
async def send_photo(req: SendPhotoRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")

    if req.image_base64:
        image_data = base64.b64decode(req.image_base64)
    elif req.image_url:
        async with aiohttp.ClientSession() as session:
            async with session.get(req.image_url) as resp:
                image_data = await resp.read()
    else:
        raise HTTPException(400, "image_url or image_base64 required")

    return await channel.send_photo(req.chat_id, image_data, req.caption)


@app.post("/send/voice")
async def send_voice(req: SendVoiceRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")

    if req.voice_base64:
        voice_data = base64.b64decode(req.voice_base64)
    elif req.voice_url:
        async with aiohttp.ClientSession() as session:
            async with session.get(req.voice_url) as resp:
                voice_data = await resp.read()
    else:
        raise HTTPException(400, "voice_url or voice_base64 required")

    return await channel.send_voice(req.chat_id, voice_data, req.duration_ms)


@app.post("/send/file")
async def send_file(req: SendFileRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")

    if req.file_base64:
        file_data = base64.b64decode(req.file_base64)
    elif req.file_url:
        async with aiohttp.ClientSession() as session:
            async with session.get(req.file_url) as resp:
                file_data = await resp.read()
    else:
        raise HTTPException(400, "file_url or file_base64 required")

    return await channel.send_file(req.chat_id, file_data, req.filename, req.caption)


@app.post("/send/sticker")
async def send_sticker(req: SendStickerRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.send_sticker(req.chat_id, req.sticker_id)


@app.post("/send/location")
async def send_location(req: SendLocationRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.send_location(req.chat_id, req.latitude, req.longitude, req.text)


@app.post("/send/photo/upload")
async def send_photo_upload(chat_id: int = Form(...), file: UploadFile = File(...), caption: str = Form("")):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    image_data = await file.read()
    return await channel.send_photo(chat_id, image_data, caption)


@app.post("/send/file/upload")
async def send_file_upload(chat_id: int = Form(...), file: UploadFile = File(...), caption: str = Form("")):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    file_data = await file.read()
    filename = file.filename or "file.bin"
    return await channel.send_file(chat_id, file_data, filename, caption)


# === Actions ===

@app.post("/typing")
async def send_typing(req: TypingRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.set_typing(req.chat_id)


@app.post("/read")
async def read_message(req: ReadMessageRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.read_message(req.chat_id, req.message_id)


@app.put("/message")
async def edit_message(req: EditMessageRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.edit_message(req.chat_id, req.message_id, req.text)


@app.delete("/message")
async def delete_message(req: DeleteMessageRequest):
    if not channel.is_authorized:
        raise HTTPException(503, "Not authorized")
    return await channel.delete_message(req.chat_id, req.message_ids, req.for_me)


if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host=HOST, port=PORT)
