# START - Context for Continuing Work

## FIRST — Sync

**If reading this file SECOND time after git pull — SKIP this block and go to next section!**

```bash
cd "C:/Users/User/Documents/Eldoleado"
git pull
```

After git pull — REREAD this file from the beginning (Start.md), starting from the next section (skipping this sync block to avoid loops).

---

## Last update date and time
**15 December 2025, 23:30 (UTC+4)**

---

## MVP Messenger - План на 16 декабря

### Контекст

Создаём омниканальный мессенджер для сервисных центров.
Архитектура: Android туннель → Server → n8n backend.

### Каналы для MVP

| Канал | Статус | Что делать |
|-------|--------|------------|
| Telegram Bot | ✅ Ready | - |
| Telegram User | 🔨 TODO | Pyrogram wrapper |
| WhatsApp Baileys | ✅ Ready | - |
| Авито User | ⚠️ Partial | Найти sendMessage |
| MAX User | 🔨 TODO | Реверс через DevTools |
| VK Community | ✅ Ready | - |
| VK User | 🔨 TODO | User API wrapper |

### НЕ используем
- Wappi.pro (платный)
- MAX Bot API (только боты)
- Авито Business API (только бизнес)

---

## Задачи на День 1 (16 декабря)

### 1. Telegram User - Pyrogram wrapper
```python
# mcp-telegram-user/telegram_user_client.py
from pyrogram import Client

# Методы:
# - get_dialogs()
# - get_chat_history()
# - send_message()
# - send_photo/video/document/voice()
# - on_message handler
```

### 2. Авито User - найти sendMessage
- Открыть m.avito.ru в браузере
- DevTools → Network
- Отправить сообщение
- Записать endpoint и payload

### 3. Tunnel Server skeleton
```
NEW/MVP/tunnel-server/
├── app.py          # FastAPI + WebSocket
├── config.py
├── requirements.txt
└── Dockerfile
```

Endpoints:
- `WS /tunnel/{client_id}` — WebSocket с туннелем
- `POST /tunnel/{client_id}/send` — отправить через туннель
- `GET /tunnel/{client_id}/status` — статус туннеля

---

## Ключевые файлы

| Файл | Описание |
|------|----------|
| `NEW/MVP/INVENTORY.md` | Инвентарь каналов и API |
| `NEW/MVP/PLAN_DAY1.md` | План первого дня |
| `NEW/MVP/REVERSE_API_REQUIREMENTS.md` | Список endpoints для реверса |
| `NEW/MVP/MCP/mcp-avito-user/` | Авито reverse client (partial) |
| `NEW/MVP/MCP/mcp-whatsapp-baileys/` | WhatsApp Baileys (ready) |
| `NEW/MVP/MCP/mcp-telegram/` | Telegram Bot (ready) |
| `NEW/MVP/MCP/mcp-vk/` | VK Community (ready) |

---

## Архитектура туннеля

```
┌─────────────────────────────────────────────────────────┐
│                       SERVER                             │
│  ┌─────────────┐     ┌─────────────────────────────┐   │
│  │ Tunnel      │────►│           n8n               │   │
│  │ Server      │     │    (Message Hub Backend)    │   │
│  │ FastAPI+WS  │     └─────────────────────────────┘   │
│  └──────┬──────┘                                        │
└─────────┼───────────────────────────────────────────────┘
          │ WebSocket (WSS)
┌─────────┼───────────────────────────────────────────────┐
│         │          ANDROID (Tunnel Client)              │
│  ┌──────┴──────┐                                        │
│  │ Tunnel      │  ← Foreground Service                  │
│  │ Service     │  ← WebSocket to Server                 │
│  └──────┬──────┘                                        │
│         │ HTTP localhost                                │
│  ┌──────┴──────────────────────────────────────────┐   │
│  │  Local services (Termux):                        │   │
│  │  - Baileys (WhatsApp) :3001                      │   │
│  │  - Pyrogram (Telegram User) :3002                │   │
│  │  - Avito Reverse :3003                           │   │
│  │  - MAX Reverse :3004                             │   │
│  │  - VK User :3005                                 │   │
│  └──────────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────────┘
```

---

## SERVERS

| Server | IP/URL | Port | Purpose |
|--------|--------|------|---------|
| n8n | n8n.n8nsrv.ru | 443 | Workflow automation |
| Neo4j | 45.144.177.128 | 7474/7687 | Graph database |
| PostgreSQL | 185.221.214.83 | 6544 | Main database |
| Redis (RU) | 45.144.177.128 | 6379 | Queues |
| **Tunnel** | TBD | TBD | New dedicated server |

---

## QUICK START

```bash
# 1. Sync
git pull

# 2. Read inventory
cat NEW/MVP/INVENTORY.md

# 3. Start with Telegram User wrapper
# Create: NEW/MVP/MCP/mcp-telegram-user/
```

---

**Before ending session:** update Start.md, Stop.md, git push
