# MAX API Documentation

## User API (WebSocket) - COMPLETE

**Source:** https://github.com/nsdkinx/vkmax

**WebSocket URL:** `wss://ws-api.oneme.ru/websocket`
**Protocol Version:** 11

### Packet Structure
```json
{"ver": 11, "cmd": 0, "seq": 1, "opcode": 64, "payload": {}}
```

### Authentication

1. Connect to WebSocket
2. Hello (opcode 6): `{"userAgent": {...}, "deviceId": "uuid"}`
3. Start auth (opcode 17): `{"phone": "+7xxx", "type": "START_AUTH"}`
4. Verify SMS (opcode 18): `{"token": "sms_token", "verifyCode": "123456"}`
5. Login by token (opcode 19) - for next sessions

### All Opcodes

| Opcode | Method | Description |
|--------|--------|-------------|
| 1 | KEEPALIVE | Ping every 30s |
| 6 | HELLO | Device identification |
| 16 | CHANGE_PROFILE | Update name, bio |
| 17 | START_AUTH | Begin phone auth |
| 18 | VERIFY_CODE | Confirm SMS code |
| 19 | LOGIN_BY_TOKEN | Auth with saved token |
| 22 | SETTINGS | Profile/chat settings |
| 32 | GET_CONTACTS | Get user info by IDs |
| 34 | CONTACT_ACTION | Add/block contact |
| 48 | RESOLVE_CHAT_BY_ID | Get chat by ID |
| 49 | GET_CHAT | Get chat + messages |
| 50 | READ_MESSAGE | Mark as read/unread |
| 55 | CHAT_SETTINGS | Pin msg, change group |
| 57 | JOIN_BY_LINK | Subscribe to channel |
| 59 | GET_MEMBERS | Get chat members |
| 64 | SEND_MESSAGE | Send text/sticker |
| 65 | UPLOAD_START | Begin file upload |
| 66 | DELETE_MESSAGE | Delete messages |
| 67 | EDIT_MESSAGE | Edit message |
| 75 | LEAVE_CHAT | Leave group/channel |
| 77 | MANAGE_MEMBERS | Add/remove/admin |
| 80 | GET_PHOTO_UPLOAD_URL | Photo upload URL |
| 82 | GET_VIDEO_UPLOAD_URL | Video upload URL |
| 83 | GET_VIDEO_DOWNLOAD_URL | Video download |
| 87 | GET_FILE_UPLOAD_URL | File upload URL |
| 88 | GET_FILE_DOWNLOAD_URL | File download |
| 89 | RESOLVE_BY_LINK | Resolve channel/group |
| 136 | UPLOAD_COMPLETE | Upload finished (incoming) |
| 178 | REACTION | React to message |
| 181 | GET_REACTIONS | Get message reactions |

### Examples

**Send Message (opcode 64):**
```json
{
  "chatId": 123456,
  "message": {
    "text": "Hello!",
    "cid": 1750000000000,
    "attaches": []
  },
  "notify": true
}
```

**Send Photo:** `{"attaches": [{"_type": "PHOTO", "photoToken": "token"}]}`

**Send File:** `{"attaches": [{"_type": "FILE", "fileId": 12345}]}`

**Send Sticker:** `{"attaches": [{"_type": "STICKER", "stickerId": 598965}]}`

**Reply:** `{"message": {"link": {"type": "REPLY", "messageId": "id"}}}`

---

## Bot API (REST HTTP)

**URL:** `https://platform-api.max.ru`
**Docs:** https://dev.max.ru/docs-api
**Auth:** `access_token` param

| Endpoint | Method | Description |
|----------|--------|-------------|
| /me | GET | Bot info |
| /messages | POST | Send message |
| /messages/{id} | PUT/DELETE | Edit/Delete |
| /chats | GET | List chats |
| /updates | GET | Long polling |
| /uploads | POST | Upload URL |

---

## Comparison

| Feature | Bot API | User API |
|---------|---------|----------|
| Protocol | REST | WebSocket |
| URL | platform-api.max.ru | wss://ws-api.oneme.ru |
| Auth | access_token | Phone+SMS |
| Send | POST /messages | opcode 64 |
| Events | Long poll/webhook | WebSocket push |
| Upload | POST /uploads | opcode 80/82/87 |
| Reactions | No | opcode 178 |
| Groups | Limited | Full |

---

## Usage

```python
from vkmax import MaxClient
from vkmax.functions.messages import send_message

client = MaxClient()
await client.connect()
token = await client.send_code("+79001234567")
await client.sign_in(token, 123456)
await send_message(client, chat_id=123, text="Hello!")
```
