# MVP Messenger - Inventory

## Каналы и их статус

| Канал | Тип API | Клиент | Готовность | Read | Write | Realtime |
|-------|---------|--------|------------|------|-------|----------|
| **Telegram Bot** | Official Bot API | `mcp-telegram/telegram_client.py` | ✅ Ready | ✅ | ✅ | ✅ webhook |
| **Telegram User** | Pyrogram | ❌ нужно создать | 🔨 TODO | - | - | - |
| **WhatsApp** | Baileys (free) | `mcp-whatsapp-baileys/` (Node.js) | ✅ Ready | ✅ | ✅ | ✅ webhook |
| **WhatsApp** | Wappi.pro (paid) | `mcp-whatsapp/wappi_client.py` | ✅ Ready | ✅ | ✅ | ✅ webhook |
| **Авито Business** | Official API | `mcp-avito/avito_client.py` | ✅ Ready | ✅ | ✅ | ✅ webhook |
| **Авито User** | Reverse (sessid) | `mcp-avito-user/avito_user_client.py` | ⚠️ Partial | ✅ | ❌ | ❌ |
| **MAX Bot** | Official Bot API | `mcp-max/max_client.py` | ✅ Ready | ✅ | ✅ | ✅ long-poll |
| **MAX** | Wappi.pro (paid) | `mcp-max-wappi/max_client.py` | ✅ Ready | ✅ | ✅ | ✅ webhook |
| **MAX User** | Reverse | ❌ нужно создать | 🔨 TODO | - | - | - |
| **VK Community** | Official API | `mcp-vk/vk_client.py` | ✅ Ready | ✅ | ✅ | ✅ callback |
| **VK** | Wappi.pro (paid) | `mcp-vk-wappi/vk_client.py` | ✅ Ready | ✅ | ✅ | ✅ webhook |
| **VK User** | User API | ❌ нужно создать | 🔨 TODO | - | - | - |
| **Instagram** | Graph API | `mcp-instagram/instagram_client.py` | ⚠️ Limited | ✅ | ✅ | ✅ webhook |

---

## Готовые компоненты (можно использовать)

### 1. Telegram Bot (`mcp-telegram/`)
- **API**: `https://api.telegram.org/bot{token}/`
- **Auth**: Bot Token
- **Features**: text, photo, video, document, voice, location, buttons, webhooks
- **Realtime**: Webhook to n8n

### 2. WhatsApp Baileys (`mcp-whatsapp-baileys/`)
- **Type**: Node.js REST API
- **Auth**: QR code scan
- **Features**: text, image, video, audio, document, sticker, location, contact, reaction
- **Realtime**: Webhook to n8n
- **Note**: Free, runs on Android in Termux

### 3. Авито Business (`mcp-avito/`)
- **API**: `https://api.avito.ru/`
- **Auth**: client_id + client_secret (OAuth2)
- **Features**: read/send messages, webhooks
- **Limitation**: Only for business accounts with API access

### 4. Авито User (`mcp-avito-user/`)
- **API**: `https://m.avito.ru/web/1/messenger/`
- **Auth**: sessid cookie from browser
- **Features**:
  - ✅ getChannels - list chats
  - ✅ getUserVisibleMessages - read messages
  - ❌ sendMessage - TODO (need reverse)
  - ❌ sendImage - TODO
  - ❌ realtime updates - TODO

### 5. MAX Bot (`mcp-max/`)
- **API**: `https://platform-api.max.ru/`
- **Auth**: access_token from MasterBot
- **Features**: text, attachments, keyboards, webhooks/long-poll
- **Docs**: https://dev.max.ru/docs-api

### 6. VK Community (`mcp-vk/`)
- **API**: `https://api.vk.com/method/`
- **Auth**: access_token for community
- **Features**: messages.*, photos.*, Callback API
- **Note**: For communities/groups only

---

## API Endpoints (готовые)

### Telegram Bot API (`mcp-telegram/`)

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | getMe | Bot info |
| POST | setWebhook | Set webhook URL |
| POST | deleteWebhook | Delete webhook |
| POST | sendMessage | Send text |
| POST | sendPhoto | Send photo |
| POST | sendDocument | Send file |
| POST | sendVoice | Send voice |
| POST | sendVideo | Send video |
| POST | editMessageText | Edit message |
| POST | deleteMessage | Delete message |
| POST | sendChatAction | Typing indicator |
| POST | answerCallbackQuery | Answer button click |
| GET | getFile | Get file info |
| GET | getChat | Get chat info |
| GET | getChatMember | Get member info |

### VK Community API (`mcp-vk/`)

| Method | VK API | Description |
|--------|--------|-------------|
| messages.send | POST | Send message |
| messages.edit | POST | Edit message |
| messages.delete | POST | Delete messages |
| messages.getConversations | POST | List chats |
| messages.getHistory | POST | Chat history |
| messages.markAsRead | POST | Mark as read |
| messages.sendMessageEventAnswer | POST | Answer callback |
| users.get | POST | Get user info |
| groups.getById | POST | Community info |
| groups.getLongPollServer | POST | Long poll server |
| groups.getCallbackServers | POST | List webhooks |
| groups.addCallbackServer | POST | Add webhook |
| groups.setCallbackSettings | POST | Configure webhook |
| photos.getMessagesUploadServer | POST | Photo upload URL |
| docs.getMessagesUploadServer | POST | Doc upload URL |

### Авито Business API (`mcp-avito/`)

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /token | Get access token (OAuth2) |
| GET | /messenger/v3/accounts/{user}/chats | List chats |
| GET | /messenger/v2/accounts/{user}/chats/{id} | Chat info |
| GET | /messenger/v3/accounts/{user}/chats/{id}/messages | Messages |
| POST | /messenger/v1/accounts/{user}/chats/{id}/messages | Send text |
| POST | /messenger/v1/accounts/{user}/chats/{id}/images | Send image |
| POST | /messenger/v1/accounts/{user}/chats/{id}/read | Mark read |
| POST | /messenger/v1/accounts/{user}/chats/{id}/links | Send link |
| DELETE | /messenger/v1/accounts/{user}/messages/{id} | Delete message |
| POST | /api/v1/webhook/subscribe | Subscribe webhook |
| DELETE | /api/v1/webhook/unsubscribe | Unsubscribe |

### WhatsApp Baileys (`mcp-whatsapp-baileys/`)

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /health | Health check |
| GET | /sessions | List sessions |
| POST | /sessions | Create session (QR) |
| GET | /sessions/:id | Session info |
| GET | /sessions/:id/qr | Get QR code |
| GET | /sessions/:id/status | Session status |
| POST | /sessions/:id/disconnect | Disconnect |
| POST | /sessions/:id/reconnect | Reconnect |
| DELETE | /sessions/:id | Delete session |
| **Messages** | | |
| POST | /messages/text | Send text |
| POST | /messages/image | Send image |
| POST | /messages/video | Send video |
| POST | /messages/audio | Send audio |
| POST | /messages/document | Send document |
| POST | /messages/sticker | Send sticker |
| POST | /messages/location | Send location |
| POST | /messages/contact | Send contact |
| POST | /messages/reaction | Send reaction |
| POST | /messages/upload | Upload media |
| **Actions** | | |
| POST | /actions/read | Mark as read |
| POST | /actions/typing | Typing indicator |
| POST | /actions/reject-call | Reject call |
| POST | /actions/check-number | Check number exists |
| GET | /actions/profile-picture | Get profile pic |
| **Groups** | | |
| GET | /groups/:id | Group info |

### MAX Bot API (`mcp-max/`)

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /me | Bot info |
| POST | /messages | Send message |
| PUT | /messages/{id} | Edit message |
| DELETE | /messages/{id} | Delete message |
| GET | /messages/{id} | Get message |
| GET | /chats | List chats |
| GET | /chats/{id} | Chat info |
| POST | /chats/{id}/actions | Typing indicator |
| GET | /chats/{id}/members | Chat members |
| DELETE | /chats/{id}/members/me | Leave chat |
| POST | /subscriptions | Subscribe webhook |
| DELETE | /subscriptions | Unsubscribe |
| GET | /subscriptions | List subscriptions |
| GET | /updates | Long polling |
| POST | /uploads | Get upload URL |
| POST | /answers | Answer callback |

### Авито User API (Reverse) - PARTIAL

| Method | Endpoint | Description | Status |
|--------|----------|-------------|--------|
| POST | /getChannels | List chats | ✅ |
| POST | /getUserVisibleMessages | Get messages | ✅ |
| POST | /sendMessage | Send text | ❌ TODO |
| POST | /sendImage | Send image | ❌ TODO |
| POST | /markAsRead | Mark read | ❌ TODO |
| WS | /realtime | Real-time | ❌ TODO |

---

## Нужно создать

### 1. Telegram User (Pyrogram)
```python
# pip install pyrogram tgcrypto
from pyrogram import Client

# Уже всё готово в библиотеке:
# - get_dialogs()
# - get_chat_history()
# - send_message()
# - send_photo/video/document/voice()
# - on_message handler
```

### 2. MAX User (Reverse)
- Нужно: Browser DevTools на max.ru
- Найти: endpoints для личных сообщений
- Auth: скорее всего cookies

### 3. VK User
```python
# VK User API документирован
# https://dev.vk.com/ru/method/messages

# Требуется:
# - Standalone app с scope=messages
# - OAuth implicit flow
# - access_token пользователя
```

### 4. Авито User (дополнить)
- sendMessage endpoint
- sendMedia endpoint
- realtime/polling

---

## Вспомогательные компоненты

| Компонент | Путь | Описание |
|-----------|------|----------|
| api-android | `MCP/api-android/` | API Gateway для Android приложения |
| graph-tool | `MCP/graph-tool/` | Neo4j клиент |
| client-contour | `MCP/client-contour/` | Client resolver |
| shared | `MCP/shared/` | Общие модули |
| ai-tool | `MCP/ai-tool/` | AI инструменты |

---

## Серверы

| Сервер | IP | Сервисы |
|--------|----|---------|
| RU Server | 45.144.177.128 | mcp-avito, mcp-vk, mcp-max, mcp-form, Neo4j |
| Finnish Server | 217.145.79.27 | mcp-telegram, mcp-whatsapp |
| n8n Server | 185.221.214.83 | n8n, PostgreSQL, Redis |

---

## Приоритет для MVP Demo

1. **P0 - Must Have**
   - Telegram Bot ✅
   - WhatsApp Baileys ✅
   - Авито Business ✅

2. **P1 - Should Have**
   - Telegram User (Pyrogram wrapper)
   - VK Community ✅
   - MAX Bot ✅

3. **P2 - Nice to Have**
   - Авито User (reverse send)
   - MAX User (reverse)
   - VK User
