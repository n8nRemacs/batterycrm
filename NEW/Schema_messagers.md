# Eldoleado Messaging System — Complete Architecture

> Полная схема работы омниканальной системы сообщений

**Version:** 1.0
**Date:** 2025-12-17

---

## Table of Contents

1. [Overview](#overview)
2. [Components](#components)
3. [Server Infrastructure](#server-infrastructure)
4. [Message Flow](#message-flow)
5. [API Endpoints](#api-endpoints)
6. [WebSocket Protocol](#websocket-protocol)
7. [n8n Workflows](#n8n-workflows)
8. [Android App Architecture](#android-app-architecture)
9. [Data Models](#data-models)
10. [Security](#security)

---

## Overview

### System Purpose

Омниканальная система для обработки сообщений из различных мессенджеров (Telegram, WhatsApp, Avito, MAX) с:
- Автоматической транскрипцией аудио (Whisper)
- Нормализацией текста оператора (OpenRouter/Gemini)
- Утверждением сообщений перед отправкой

### High-Level Architecture

```
┌─────────────────────────────────────────────────────────────────────────┐
│                              CLIENTS                                     │
│  Telegram │ WhatsApp │ Avito │ MAX (VK Teams)                           │
└─────────────────────────────┬───────────────────────────────────────────┘
                              │ Messages
                              ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                         MCP SERVERS                                      │
│  ┌──────────────┐ ┌──────────────┐ ┌──────────────┐ ┌──────────────┐   │
│  │ mcp-telegram │ │ mcp-whatsapp │ │  mcp-avito   │ │   mcp-max    │   │
│  │   (Finnish)  │ │   (Finnish)  │ │    (RU)      │ │    (RU)      │   │
│  │   :8767      │ │    :8766     │ │    :8765     │ │    :8768     │   │
│  └──────┬───────┘ └──────┬───────┘ └──────┬───────┘ └──────┬───────┘   │
└─────────┼────────────────┼────────────────┼────────────────┼────────────┘
          │                │                │                │
          └────────────────┴────────┬───────┴────────────────┘
                                    │ HTTP POST
                                    ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                    PHONE (Android, Server Mode)                          │
│  ┌─────────────────────────────────────────────────────────────────┐   │
│  │                      TunnelService                               │   │
│  │  - Receives messages from MCP servers                            │   │
│  │  - HTTP server on dynamic port                                   │   │
│  │  - Forwards to tunnel-server via WebSocket                       │   │
│  └─────────────────────────────────┬───────────────────────────────┘   │
└────────────────────────────────────┼────────────────────────────────────┘
                                     │ WebSocket (wss://)
                                     ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                    TUNNEL-SERVER (Finnish: 217.145.79.27)               │
│                    https://tunnel-server.eldoleado.ru                    │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────┐  ┌─────────────┐    │
│  │  tunnel_in  │  │   router    │  │ tunnel_out  │  │  operator   │    │
│  │  (Whisper)  │──│   (n8n)     │──│  (to phone) │  │  connector  │    │
│  └─────────────┘  └─────────────┘  └─────────────┘  └──────┬──────┘    │
└────────────────────────────────────────────────────────────┼────────────┘
                                                             │ WebSocket
                                                             ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                    OPERATOR APP (Android, Client Mode)                   │
│  ┌─────────────────────────────────────────────────────────────────┐   │
│  │                 OperatorWebSocketService                         │   │
│  │  - Connects to /ws/operator                                      │   │
│  │  - Receives new_message, show_draft                              │   │
│  │  - Sends: send, approve                                          │   │
│  └─────────────────────────────────┬───────────────────────────────┘   │
│  ┌─────────────────────────────────▼───────────────────────────────┐   │
│  │                      Operator UI                                 │   │
│  │  ChatsListFragment → ChatFragment → DraftApprovalDialog          │   │
│  └─────────────────────────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────────────────────────┘
                                     │
                                     ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                         n8n (185.221.214.83)                            │
│                         https://n8n.n8nsrv.ru                            │
│  ┌─────────────────────────────────────────────────────────────────┐   │
│  │  ELO_In_App          │  ELO_Message_Router                       │   │
│  │  - Whisper API       │  - Message routing                        │   │
│  │  - Media download    │  - Text normalization (OpenRouter)        │   │
│  └─────────────────────────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## Components

### 1. MCP Servers (Message Channel Processors)

Принимают сообщения от мессенджеров и пересылают на телефоны.

| Server | Location | Port | API |
|--------|----------|------|-----|
| mcp-telegram | Finnish (217.145.79.27) | 8767 | Telegram Bot API |
| mcp-whatsapp | Finnish (217.145.79.27) | 8766 | Wappi.pro API |
| mcp-avito | RU (45.144.177.128) | 8765 | Avito Messenger API |
| mcp-max | RU (45.144.177.128) | 8768 | MAX (VK Teams) API |

### 2. Phone (TunnelService)

Android-устройство в режиме "Server" — принимает сообщения от MCP и пересылает в tunnel-server.

**Responsibilities:**
- HTTP сервер для приема сообщений от MCP
- WebSocket клиент для tunnel-server
- Пересылка сообщений в обе стороны
- Отправка исходящих сообщений в мессенджеры

### 3. Tunnel-Server

Центральный хаб для маршрутизации сообщений.

**Location:** `https://tunnel-server.eldoleado.ru` (Finnish: 217.145.79.27)

**Modules:**
- `tunnel_in.py` — прием сообщений от телефонов, транскрипция аудио
- `message_router.py` — маршрутизация через n8n
- `tunnel_out.py` — отправка сообщений на телефоны
- `operator_connector.py` — WebSocket для операторов

### 4. Operator App

Android-приложение в режиме "Client" — UI для операторов.

**Components:**
- `OperatorWebSocketService` — WebSocket подключение
- `ChatsListFragment` — список чатов
- `ChatFragment` — переписка
- `DraftApprovalDialog` — утверждение нормализованного текста

### 5. n8n Workflows

Обработка сообщений с AI.

**Workflows:**
- `ELO_In_App` — транскрипция аудио (Whisper)
- `ELO_Message_Router` — маршрутизация + нормализация текста

---

## Server Infrastructure

### Finnish Server (217.145.79.27)

```
┌─────────────────────────────────────────────┐
│  Services:                                   │
│  ├── tunnel-server     :443 (nginx proxy)   │
│  ├── mcp-telegram      :8767                │
│  └── mcp-whatsapp      :8766                │
│                                              │
│  Docker containers:                          │
│  ├── tunnel-server                          │
│  ├── mcp-telegram                           │
│  └── mcp-whatsapp                           │
└─────────────────────────────────────────────┘
```

### RU Server (45.144.177.128)

```
┌─────────────────────────────────────────────┐
│  Services:                                   │
│  ├── mcp-avito         :8765                │
│  ├── mcp-max           :8768                │
│  ├── api-android       :8780                │
│  ├── Neo4j             :7474/7687           │
│  └── Redis             :6379                │
└─────────────────────────────────────────────┘
```

### n8n Server (185.221.214.83)

```
┌─────────────────────────────────────────────┐
│  Services:                                   │
│  ├── n8n               :5678                │
│  │   https://n8n.n8nsrv.ru                  │
│  ├── PostgreSQL        :6544                │
│  └── Redis             :6379                │
└─────────────────────────────────────────────┘
```

---

## Message Flow

### Flow 1: Incoming Message (Client → Operator)

```
1. Client sends message in Telegram
         │
         ▼
2. Telegram API → mcp-telegram (Finnish:8767)
         │
         ▼
3. mcp-telegram POST → Phone HTTP server
   POST http://{phone_ip}:{port}/message
   Body: {
     "channel": "telegram",
     "chat_id": "123456",
     "sender_id": "user_123",
     "sender_name": "Иван",
     "text": "Привет!",
     "has_audio": false
   }
         │
         ▼
4. Phone TunnelService → tunnel-server WebSocket
   WS: wss://tunnel-server.eldoleado.ru/ws/phone?server_id=xxx
   Message: {
     "action": "message",
     "direction": "in",
     "channel": "telegram",
     "chat_id": "123456",
     "text": "Привет!",
     ...
   }
         │
         ▼
5. tunnel-server tunnel_in.py
   - If has_audio: call n8n ELO_In_App for transcription
   - Batch messages (debounce 2s)
         │
         ▼
6. tunnel-server message_router.py → n8n
   POST https://n8n.n8nsrv.ru/webhook/router
   Body: {
     "direction": "in",
     "channel": "telegram",
     "chat_id": "123456",
     "text": "Привет!",
     ...
   }
         │
         ▼
7. n8n ELO_Message_Router
   - Determines type: from_client
   - Returns: { "route_action": "push_to_operator", "payload": {...} }
         │
         ▼
8. tunnel-server operator_connector.py
   - Finds operator WebSocket by tenant_id
   - Sends to operator app
   WS message: {
     "action": "new_message",
     "message": {
       "channel": "telegram",
       "chat_id": "123456",
       "sender_name": "Иван",
       "text": "Привет!"
     }
   }
         │
         ▼
9. Operator App receives message
   - OperatorWebSocketService broadcasts BROADCAST_NEW_MESSAGE
   - ChatsRepository.addIncomingMessage()
   - UI updates via LiveData
```

### Flow 2: Outgoing Message (Operator → Client)

```
1. Operator types message in ChatFragment
   - Clicks Send button
         │
         ▼
2. OperatorWebSocketService.sendMessage()
   WS message: {
     "action": "send",
     "channel": "telegram",
     "chat_id": "123456",
     "text": "Здраствуйте, чем могу помочь?",
     "server_id": "phone_xxx"
   }
         │
         ▼
3. tunnel-server operator_connector.py
   - Receives message
   - Forwards to message_router
         │
         ▼
4. message_router.py → n8n
   POST https://n8n.n8nsrv.ru/webhook/router
   Body: {
     "direction": "out",
     "status": "",  // not approved yet
     "text": "Здраствуйте, чем могу помочь?",
     ...
   }
         │
         ▼
5. n8n ELO_Message_Router
   - Determines type: from_operator (needs normalization)
   - Calls OpenRouter API for text normalization:
     POST https://openrouter.ai/api/v1/chat/completions
     Body: {
       "model": "google/gemini-2.0-flash-001",
       "messages": [
         {"role": "system", "content": "Fix grammar..."},
         {"role": "user", "content": "Здраствуйте, чем могу помочь?"}
       ]
     }
   - Returns normalized: "Здравствуйте, чем могу помочь?"
   - Returns: {
       "route_action": "push_to_operator",
       "payload": {
         "action": "show_draft",
         "message": {
           "original_text": "Здраствуйте, чем могу помочь?",
           "normalized_text": "Здравствуйте, чем могу помочь?"
         }
       }
     }
         │
         ▼
6. tunnel-server operator_connector.py
   - Sends draft to operator
   WS message: {
     "action": "show_draft",
     "message": {
       "original_text": "Здраствуйте...",
       "normalized_text": "Здравствуйте..."
     }
   }
         │
         ▼
7. Operator App shows DraftApprovalDialog
   - Shows original vs normalized
   - Operator can edit or approve
         │
         ▼
8. Operator clicks "Отправить" (Approve)
   OperatorWebSocketService.approveMessage()
   WS message: {
     "action": "approve",
     "channel": "telegram",
     "chat_id": "123456",
     "final_text": "Здравствуйте, чем могу помочь?",
     "server_id": "phone_xxx"
   }
         │
         ▼
9. tunnel-server → n8n router
   Body: {
     "direction": "out",
     "status": "approved",
     "text": "Здравствуйте, чем могу помочь?"
   }
         │
         ▼
10. n8n returns: {
      "route_action": "send_to_client",
      "payload": {
        "action": "send_message",
        "channel": "telegram",
        "chat_id": "123456",
        "text": "Здравствуйте, чем могу помочь?"
      }
    }
         │
         ▼
11. tunnel-server tunnel_out.py
    - Finds phone WebSocket by server_id
    - Sends message to phone
    WS message: {
      "action": "send_message",
      "channel": "telegram",
      "chat_id": "123456",
      "text": "Здравствуйте, чем могу помочь?"
    }
         │
         ▼
12. Phone TunnelService receives
    - Calls appropriate MCP server
    POST http://mcp-telegram:8767/send
    Body: {
      "chat_id": "123456",
      "text": "Здравствуйте, чем могу помочь?"
    }
         │
         ▼
13. mcp-telegram → Telegram API
    - Message delivered to client
```

### Flow 3: Audio Message Transcription

```
1. Client sends voice message
         │
         ▼
2. mcp-whatsapp → Phone
   POST /message
   Body: {
     "has_audio": true,
     "media_url": "https://...",
     "media_local_path": "/storage/audio.ogg"
   }
         │
         ▼
3. Phone → tunnel-server
   WS: { "action": "message", "has_audio": true, ... }
         │
         ▼
4. tunnel-server tunnel_in.py
   - Detects has_audio: true
   - Calls n8n for transcription:
     POST https://n8n.n8nsrv.ru/webhook/in-app
     Body: {
       "has_audio": true,
       "media_url": "https://...",
       "server_id": "phone_xxx"
     }
         │
         ▼
5. n8n ELO_In_App workflow
   - Downloads audio via proxy_fetch (through phone)
   - Sends to Whisper API:
     POST https://api.openai.com/v1/audio/transcriptions
     Headers: Authorization: Bearer sk-...
     Body: multipart/form-data with audio file
   - Returns transcription
         │
         ▼
6. tunnel_in.py adds transcription to message
   message["transcription"] = "Текст из аудио..."
         │
         ▼
7. Message continues normal flow with transcription
```

---

## API Endpoints

### Tunnel-Server HTTP Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/health` | Health check |
| GET | `/ws/phone` | WebSocket for phones |
| GET | `/ws/operator` | WebSocket for operators |
| POST | `/proxy/fetch` | Proxy fetch for media download |

### Tunnel-Server WebSocket: /ws/phone

**Query Parameters:**
- `server_id` — unique phone identifier
- `tenant_id` — tenant identifier
- `token` — auth token (optional)

**Client → Server Messages:**

```json
// Message from messenger
{
  "action": "message",
  "direction": "in",
  "channel": "telegram|whatsapp|avito|max",
  "chat_id": "string",
  "sender_id": "string",
  "sender_name": "string",
  "sender_phone": "string",
  "text": "string",
  "has_audio": false,
  "transcription": "string",
  "has_media": false,
  "media_type": "image|video|document",
  "media_url": "string",
  "media_local_path": "string",
  "timestamp": 1702800000000
}

// Pong response
{
  "action": "pong",
  "timestamp": 1702800000000
}
```

**Server → Client Messages:**

```json
// Send message to client
{
  "action": "send_message",
  "channel": "telegram",
  "chat_id": "123456",
  "text": "Message text",
  "message_id": "msg_123"
}

// Ping
{
  "action": "ping",
  "timestamp": 1702800000000
}
```

### Tunnel-Server WebSocket: /ws/operator

**Query Parameters:**
- `operator_id` — operator identifier
- `tenant_id` — tenant identifier
- `token` — auth token

**Server → Client Messages:**

```json
// New message from client
{
  "action": "new_message",
  "message": {
    "id": "msg_123",
    "channel": "telegram",
    "chat_id": "123456",
    "sender_id": "user_123",
    "sender_name": "Иван",
    "sender_phone": "+79001234567",
    "text": "Привет!",
    "has_audio": false,
    "transcription": null,
    "has_media": false,
    "timestamp": 1702800000000,
    "server_id": "phone_xxx"
  }
}

// Show draft for approval
{
  "action": "show_draft",
  "message": {
    "id": "draft_123",
    "channel": "telegram",
    "chat_id": "123456",
    "original_text": "Здраствуйте",
    "normalized_text": "Здравствуйте",
    "timestamp": 1702800000000,
    "server_id": "phone_xxx"
  }
}

// Ping
{
  "action": "ping",
  "timestamp": 1702800000000
}
```

**Client → Server Messages:**

```json
// Send new message (needs normalization)
{
  "action": "send",
  "id": "msg_123",
  "channel": "telegram",
  "chat_id": "123456",
  "text": "Здраствуйте, чем могу помочь?",
  "server_id": "phone_xxx"
}

// Approve normalized message
{
  "action": "approve",
  "id": "draft_123",
  "channel": "telegram",
  "chat_id": "123456",
  "final_text": "Здравствуйте, чем могу помочь?",
  "server_id": "phone_xxx"
}

// Pong response
{
  "action": "pong",
  "timestamp": 1702800000000
}
```

### n8n Webhook Endpoints

| Endpoint | Description |
|----------|-------------|
| `POST /webhook/in-app` | Audio transcription + media download |
| `POST /webhook/router` | Message routing + normalization |

#### POST /webhook/in-app

**Request:**
```json
{
  "id": "msg_123",
  "channel": "whatsapp",
  "chat_id": "123456",
  "has_audio": true,
  "media_url": "https://...",
  "server_id": "phone_xxx"
}
```

**Response:**
```json
{
  "id": "msg_123",
  "transcription": "Текст из аудио сообщения",
  "media_local_path": "/tmp/downloaded_file.ogg"
}
```

#### POST /webhook/router

**Request:**
```json
{
  "direction": "in|out",
  "status": "|approved",
  "channel": "telegram",
  "chat_id": "123456",
  "text": "Message text",
  "server_id": "phone_xxx"
}
```

**Response:**
```json
{
  "route_action": "push_to_operator|send_to_client",
  "payload": {
    "action": "new_message|show_draft|send_message",
    "message": { ... }
  }
}
```

### MCP Server Endpoints

#### POST /message (receive from messenger)

```json
{
  "channel": "telegram",
  "chat_id": "123456",
  "sender_id": "user_123",
  "sender_name": "Иван",
  "text": "Привет!"
}
```

#### POST /send (send to messenger)

```json
{
  "chat_id": "123456",
  "text": "Ответ оператора"
}
```

---

## WebSocket Protocol

### Connection Lifecycle

```
1. Client connects with query parameters
   ws://host/ws/phone?server_id=xxx&tenant_id=yyy

2. Server accepts, adds to connection pool

3. Heartbeat (every 30s):
   Server: {"action": "ping", "timestamp": ...}
   Client: {"action": "pong", "timestamp": ...}

4. On disconnect:
   - Server removes from pool
   - Client attempts reconnect with exponential backoff
```

### Reconnection Strategy

```kotlin
// Android implementation
private fun scheduleReconnect(delayMs: Long = 5000) {
    reconnectJob = serviceScope.launch {
        delay(delayMs)
        if (!isConnected) {
            connect()
        }
    }
}

// On failure: reconnect with 10s delay
// On close: reconnect with 5s delay
```

---

## n8n Workflows

### ELO_In_App

**Purpose:** Audio transcription and media download

```
┌─────────┐    ┌─────────────┐    ┌─────────────┐    ┌─────────┐
│ Webhook │───▶│ Check Audio │───▶│  Whisper    │───▶│ Respond │
│  /in-app│    │             │    │ Transcribe  │    │         │
└─────────┘    └──────┬──────┘    └─────────────┘    └─────────┘
                      │ no audio
                      ▼
               ┌─────────────┐
               │ Proxy Fetch │
               │ (media DL)  │
               └─────────────┘
```

**Nodes:**
1. Webhook — receives POST /webhook/in-app
2. Check Audio — if has_audio: true
3. Whisper Transcribe — OpenAI Whisper API
4. Proxy Fetch — download media through phone proxy
5. Respond — return result

### ELO_Message_Router

**Purpose:** Route messages + normalize operator text

```
┌─────────┐    ┌──────────────┐    ┌──────────────┐
│ Webhook │───▶│ Determine    │───▶│ Is From      │
│ /router │    │ Type         │    │ Client?      │
└─────────┘    └──────────────┘    └───────┬──────┘
                                           │
                    ┌──────────────────────┼──────────────────────┐
                    │ yes                  │ no                   │
                    ▼                      ▼                      │
             ┌─────────────┐        ┌─────────────┐              │
             │ From Client │        │ Is Approved?│              │
             │ (push to op)│        └──────┬──────┘              │
             └─────────────┘               │                     │
                    │           ┌──────────┼──────────┐          │
                    │           │ yes      │ no       │          │
                    │           ▼          ▼          │          │
                    │    ┌──────────┐ ┌──────────┐   │          │
                    │    │ Approved │ │ Normalize│   │          │
                    │    │(send out)│ │ (OpenR.) │   │          │
                    │    └──────────┘ └────┬─────┘   │          │
                    │           │          │         │          │
                    │           │          ▼         │          │
                    │           │   ┌──────────┐    │          │
                    │           │   │Build Draft│    │          │
                    │           │   └──────────┘    │          │
                    │           │          │         │          │
                    └───────────┴──────────┴─────────┴──────────┘
                                           │
                                           ▼
                                    ┌─────────────┐
                                    │   Respond   │
                                    └─────────────┘
```

**Message Types:**
- `from_client` — direction=in → push to operator
- `from_operator` — direction=out, status="" → normalize → show_draft
- `approved` — direction=out, status=approved → send to client

**OpenRouter Integration:**
```json
{
  "model": "google/gemini-2.0-flash-001",
  "messages": [
    {
      "role": "system",
      "content": "You are a Russian text editor. Fix grammar, spelling, and punctuation errors. Keep the meaning intact. Output ONLY the corrected text."
    },
    {
      "role": "user",
      "content": "Original operator text"
    }
  ],
  "max_tokens": 1000,
  "temperature": 0.1
}
```

---

## Android App Architecture

### Package Structure

```
com.eldoleado.app/
├── operator/
│   ├── OperatorActivity.kt          # Main activity
│   ├── OperatorWebSocketService.kt  # WebSocket service
│   ├── ChatsListFragment.kt         # Chats list UI
│   ├── ChatFragment.kt              # Chat messages UI
│   ├── ChatsRepository.kt           # State management
│   ├── DraftApprovalDialog.kt       # Draft approval UI
│   └── models/
│       └── ChatModels.kt            # Data classes
├── tunnel/
│   └── TunnelService.kt             # Phone tunnel service
└── SessionManager.kt                # Session/auth storage
```

### Component Diagram

```
┌─────────────────────────────────────────────────────────────────┐
│                        OperatorActivity                          │
│  ┌──────────────────────────────────────────────────────────┐  │
│  │                    FragmentContainer                       │  │
│  │  ┌────────────────────┐  ┌────────────────────────────┐  │  │
│  │  │ ChatsListFragment  │  │      ChatFragment          │  │  │
│  │  │  ┌──────────────┐  │  │  ┌──────────────────────┐  │  │  │
│  │  │  │ ChatsAdapter │  │  │  │  MessagesAdapter     │  │  │  │
│  │  │  └──────────────┘  │  │  └──────────────────────┘  │  │  │
│  │  │                    │  │  ┌──────────────────────┐  │  │  │
│  │  │                    │  │  │DraftApprovalDialog   │  │  │  │
│  │  │                    │  │  └──────────────────────┘  │  │  │
│  │  └────────────────────┘  └────────────────────────────┘  │  │
│  └──────────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────────┘
         │                              │
         │ observes                     │ observes
         ▼                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                      ChatsRepository (Singleton)                 │
│  ┌─────────────────┐  ┌─────────────────┐  ┌────────────────┐  │
│  │ _chats: Map     │  │ _messages: Map  │  │ _currentDraft  │  │
│  │ _chatsLiveData  │  │ _messagesLD     │  │ LiveData       │  │
│  └─────────────────┘  └─────────────────┘  └────────────────┘  │
└─────────────────────────────────────────────────────────────────┘
         ▲
         │ updates via LocalBroadcast
         │
┌─────────────────────────────────────────────────────────────────┐
│              OperatorWebSocketService (Foreground)               │
│  ┌─────────────────┐  ┌─────────────────┐  ┌────────────────┐  │
│  │ OkHttp WebSocket│  │ LocalBroadcast  │  │ Notification   │  │
│  │ Client          │  │ Manager         │  │ Manager        │  │
│  └─────────────────┘  └─────────────────┘  └────────────────┘  │
└─────────────────────────────────────────────────────────────────┘
         │
         │ WebSocket
         ▼
    tunnel-server
```

### Data Flow

```
1. WebSocket message received
         │
         ▼
2. OperatorWebSocketService.handleMessage()
   - Parses JSON
   - Determines action (new_message/show_draft)
         │
         ▼
3. LocalBroadcastManager.sendBroadcast()
   - BROADCAST_NEW_MESSAGE
   - BROADCAST_SHOW_DRAFT
         │
         ▼
4. Fragment BroadcastReceiver
   - ChatsListFragment receives NEW_MESSAGE
   - ChatFragment receives SHOW_DRAFT
         │
         ▼
5. ChatsRepository update
   - addIncomingMessage() / setDraft()
         │
         ▼
6. LiveData notifies observers
   - UI automatically updates
```

---

## Data Models

### Kotlin (Android)

```kotlin
enum class Channel(val id: String, val displayName: String, val icon: String) {
    TELEGRAM("telegram", "Telegram", "TG"),
    WHATSAPP("whatsapp", "WhatsApp", "WA"),
    AVITO("avito", "Avito", "AV"),
    MAX("max", "MAX", "MX"),
    UNKNOWN("unknown", "Unknown", "?")
}

data class Chat(
    val chatId: String,
    val channel: Channel,
    val clientName: String,
    val clientPhone: String?,
    val lastMessage: String,
    val lastMessageTime: Long,
    val unreadCount: Int = 0,
    val serverId: String
)

data class ChatMessage(
    val id: String,
    val chatId: String,
    val channel: Channel,
    val text: String,
    val senderId: String?,
    val senderName: String?,
    val senderPhone: String?,
    val isIncoming: Boolean,
    val timestamp: Long,
    val hasAudio: Boolean = false,
    val transcription: String? = null,
    val hasMedia: Boolean = false,
    val mediaType: String? = null,
    val mediaUrl: String? = null,
    val serverId: String
)

data class DraftMessage(
    val id: String,
    val chatId: String,
    val channel: Channel,
    val originalText: String,
    val normalizedText: String,
    val timestamp: Long,
    val serverId: String
)
```

### Python (tunnel-server)

```python
from pydantic import BaseModel
from typing import Optional
from enum import Enum

class Channel(str, Enum):
    TELEGRAM = "telegram"
    WHATSAPP = "whatsapp"
    AVITO = "avito"
    MAX = "max"

class IncomingMessage(BaseModel):
    id: str
    channel: Channel
    chat_id: str
    sender_id: Optional[str]
    sender_name: Optional[str]
    sender_phone: Optional[str]
    text: str
    has_audio: bool = False
    transcription: Optional[str]
    has_media: bool = False
    media_type: Optional[str]
    media_url: Optional[str]
    timestamp: int
    server_id: str

class OutgoingMessage(BaseModel):
    action: str  # "send_message"
    channel: Channel
    chat_id: str
    text: str
    message_id: Optional[str]
```

---

## Security

### Authentication

1. **Phone → tunnel-server:**
   - Query param: `token` (session token)
   - Header: `X-Server-Secret` (shared secret)

2. **Operator → tunnel-server:**
   - Query param: `token` (session token from login)
   - Query param: `operator_id`, `tenant_id`

3. **tunnel-server → n8n:**
   - Internal network, no auth required
   - n8n webhooks are public but obscure URLs

4. **n8n → OpenRouter:**
   - HTTP Header Auth: `Authorization: Bearer sk-or-...`

### Data Protection

- All WebSocket connections use WSS (TLS)
- No sensitive data stored on tunnel-server (stateless)
- Messages not persisted, only routed
- Phone stores only session credentials

### Network Security

```
┌─────────────────────────────────────────────────────────┐
│                    Public Internet                       │
│  ┌─────────────┐                    ┌─────────────────┐ │
│  │ Operator App│◄──── WSS/443 ────►│ tunnel-server   │ │
│  └─────────────┘                    │ (nginx proxy)   │ │
│                                     └────────┬────────┘ │
│  ┌─────────────┐                             │          │
│  │ Phone       │◄──── WSS/443 ───────────────┘          │
│  └─────────────┘                                        │
└─────────────────────────────────────────────────────────┘
                              │
                              │ Internal (Docker network)
                              ▼
┌─────────────────────────────────────────────────────────┐
│                    Internal Network                      │
│  tunnel-server ◄──── HTTP ────► n8n (webhook)           │
│  n8n ◄──── HTTPS ────► OpenRouter API                   │
│  n8n ◄──── HTTPS ────► OpenAI Whisper API               │
└─────────────────────────────────────────────────────────┘
```

---

## File Locations

### Android App

```
NEW/MVP/Android Messager/app_original/src/main/
├── java/com/eldoleado/app/
│   ├── operator/
│   │   ├── OperatorActivity.kt
│   │   ├── OperatorWebSocketService.kt
│   │   ├── ChatsListFragment.kt
│   │   ├── ChatFragment.kt
│   │   ├── ChatsRepository.kt
│   │   ├── DraftApprovalDialog.kt
│   │   └── models/ChatModels.kt
│   ├── tunnel/TunnelService.kt
│   └── SessionManager.kt
├── res/
│   ├── layout/
│   │   ├── activity_operator.xml
│   │   ├── fragment_chats_list.xml
│   │   ├── fragment_chat.xml
│   │   ├── item_chat.xml
│   │   ├── item_message_incoming.xml
│   │   ├── item_message_outgoing.xml
│   │   └── dialog_draft_approval.xml
│   ├── drawable/
│   │   ├── bg_channel_*.xml
│   │   ├── bg_message_*.xml
│   │   └── bg_unread_badge.xml
│   └── values/
│       ├── colors.xml
│       └── themes.xml
└── AndroidManifest.xml
```

### Tunnel-Server

```
NEW/MVP/Android Messager/tunnel-server/
├── main.py                    # FastAPI app entry point
├── app/
│   ├── config.py              # Settings (n8n URLs, etc.)
│   └── input/
│       ├── __init__.py
│       ├── tunnel_in.py       # Phone message receiver
│       ├── tunnel_out.py      # Phone message sender
│       ├── message_router.py  # n8n router client
│       └── operator_connector.py  # Operator WebSocket
├── n8n/
│   ├── ELO_In_App.json        # Transcription workflow
│   └── ELO_Message_Router.json # Router workflow
├── Dockerfile
├── docker-compose.yml
└── requirements.txt
```

### n8n Workflows (import manually)

```
NEW/MVP/Android Messager/tunnel-server/n8n/
├── ELO_In_App.json
└── ELO_Message_Router.json
```

---

## Quick Reference

### URLs

| Service | URL |
|---------|-----|
| Tunnel Server | `https://tunnel-server.eldoleado.ru` |
| Tunnel WS (phone) | `wss://tunnel-server.eldoleado.ru/ws/phone` |
| Tunnel WS (operator) | `wss://tunnel-server.eldoleado.ru/ws/operator` |
| n8n | `https://n8n.n8nsrv.ru` |
| n8n In-App webhook | `https://n8n.n8nsrv.ru/webhook/in-app` |
| n8n Router webhook | `https://n8n.n8nsrv.ru/webhook/router` |

### Ports

| Service | Port |
|---------|------|
| tunnel-server | 8000 (internal), 443 (nginx) |
| mcp-telegram | 8767 |
| mcp-whatsapp | 8766 |
| mcp-avito | 8765 |
| mcp-max | 8768 |
| n8n | 5678 |

### Environment Variables (tunnel-server)

```env
# n8n Integration
AI_CORE_ENABLED=true
AI_CORE_IN_APP_URL=https://n8n.n8nsrv.ru/webhook/in-app
AI_CORE_ROUTER_URL=https://n8n.n8nsrv.ru/webhook/router

# OpenAI (for Whisper in n8n)
OPENAI_API_KEY=sk-...

# OpenRouter (for normalization in n8n)
OPENROUTER_API_KEY=sk-or-...
```

---

## Troubleshooting

### Phone not connecting

1. Check tunnel URL in SessionManager
2. Verify server_id is unique
3. Check WebSocket logs on tunnel-server

### Messages not appearing in operator app

1. Verify operator WebSocket connected
2. Check tenant_id matches
3. Check n8n workflow is active

### Audio not transcribing

1. Verify OpenAI API key in n8n credentials
2. Check audio file is accessible via proxy_fetch
3. Check Whisper API quota

### Normalization not working

1. Verify OpenRouter API key in n8n credentials
2. Check n8n workflow ELO_Message_Router is active
3. Check model availability (gemini-2.0-flash-001)

---

*Document generated: 2025-12-17*
