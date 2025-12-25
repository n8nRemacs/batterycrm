# MVP Messenger - Inventory

> **Updated:** 15 December 2025

## Каналы для MVP

| Канал | Тип API | Клиент | Статус | Read | Write | Realtime |
|-------|---------|--------|--------|------|-------|----------|
| **Telegram Bot** | Official Bot API | `mcp-telegram/` | ✅ Ready | ✅ | ✅ | ✅ webhook |
| **Telegram User** | Pyrogram | TODO | 🔨 Create | - | - | - |
| **WhatsApp** | Baileys (free) | `mcp-whatsapp-baileys/` | ✅ Ready | ✅ | ✅ | ✅ webhook |
| **Авито User** | Reverse (sessid) | `mcp-avito-user/` | ⚠️ Partial | ✅ | ❌ | ❌ |
| **MAX User** | Reverse | TODO | 🔨 Create | - | - | - |
| **VK Community** | Official API | `mcp-vk/` | ✅ Ready | ✅ | ✅ | ✅ callback |
| **VK User** | User API | TODO | 🔨 Create | - | - | - |

---

## НЕ используем (архив)

| Канал | Причина |
|-------|---------|
| WhatsApp Wappi.pro | Платный сервис |
| MAX Bot API | Только для ботов, не для user accounts |
| Авито Business API | Только для бизнес-аккаунтов с API |
| VK Wappi.pro | Платный сервис |
| MAX Wappi.pro | Платный сервис |
| Instagram | Не нужен для MVP |

---

## Готовые компоненты

### 1. Telegram Bot (`mcp-telegram/`)
- **API**: `https://api.telegram.org/bot{token}/`
- **Auth**: Bot Token
- **Features**: text, photo, video, document, voice, location, buttons
- **Realtime**: Webhook to n8n

### 2. WhatsApp Baileys (`mcp-whatsapp-baileys/`)
- **Type**: Node.js REST API
- **Auth**: QR code scan
- **Features**: text, image, video, audio, document, sticker, location, contact, reaction
- **Realtime**: Webhook to n8n
- **Note**: Free, runs on Android in Termux

### 3. VK Community (`mcp-vk/`)
- **API**: `https://api.vk.com/method/`
- **Auth**: access_token for community
- **Features**: messages.*, photos.*, Callback API

### 4. Авито User (`mcp-avito-user/`) - PARTIAL
- **API**: `https://m.avito.ru/web/1/messenger/`
- **Auth**: sessid cookie from browser
- **Ready**:
  - ✅ getChannels - list chats
  - ✅ getUserVisibleMessages - read messages
- **TODO**:
  - ❌ sendMessage
  - ❌ sendImage
  - ❌ realtime updates

---

## API Endpoints (готовые)

### Telegram Bot API

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | sendMessage | Send text |
| POST | sendPhoto | Send photo |
| POST | sendDocument | Send file |
| POST | sendVoice | Send voice |
| POST | sendVideo | Send video |
| POST | editMessageText | Edit message |
| POST | deleteMessage | Delete message |
| POST | sendChatAction | Typing indicator |
| POST | setWebhook | Set webhook URL |

### WhatsApp Baileys

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /sessions | Create session (QR) |
| GET | /sessions/:id/qr | Get QR code |
| POST | /messages/text | Send text |
| POST | /messages/image | Send image |
| POST | /messages/video | Send video |
| POST | /messages/audio | Send audio |
| POST | /messages/document | Send document |
| POST | /actions/read | Mark as read |
| POST | /actions/typing | Typing indicator |

### VK Community API

| VK Method | Description |
|-----------|-------------|
| messages.send | Send message |
| messages.getConversations | List chats |
| messages.getHistory | Chat history |
| messages.markAsRead | Mark as read |
| groups.addCallbackServer | Add webhook |

### Авито User (Reverse)

| Method | Endpoint | Status |
|--------|----------|--------|
| POST | /getChannels | ✅ Ready |
| POST | /getUserVisibleMessages | ✅ Ready |
| POST | /sendMessage | ❌ TODO |
| POST | /sendImage | ❌ TODO |

---

## Нужно создать

### 1. Telegram User (Pyrogram)
```python
# pip install pyrogram tgcrypto
from pyrogram import Client

# Библиотека готова, нужен wrapper:
# - get_dialogs()
# - get_chat_history()
# - send_message()
# - send_photo/video/document/voice()
# - on_message handler
```

### 2. MAX User (Reverse)
- Browser DevTools на max.ru
- Найти endpoints для личных сообщений
- Auth: cookies

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
- sendMessage endpoint (reverse через DevTools)
- sendMedia endpoint
- realtime/polling

---

## Приоритет задач

### День 1 (16 декабря)

1. **Telegram User** - создать Pyrogram wrapper
2. **Авито User** - найти sendMessage через DevTools
3. **Tunnel Server** - FastAPI skeleton

### День 2-3

4. **MAX User** - реверс через DevTools
5. **VK User** - wrapper для User API
6. **Android Tunnel Client** - Kotlin skeleton

---

## Серверы

| Сервер | IP | Сервисы |
|--------|-----|---------|
| Messenger Server | 155.212.221.189 (alt: 217.114.14.17) | Все MCP, Redis (для MCP) |
| n8n Server | 185.221.214.83 | n8n, PostgreSQL, Redis (для n8n) |
