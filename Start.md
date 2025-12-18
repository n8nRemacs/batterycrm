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
**18 December 2025, 14:25 (MSK, UTC+3)**

---

## Проект: Android Messager — Омниканальный мессенджер

### Что это
Мобильное приложение для операторов сервисных центров. Общение с клиентами через разные мессенджеры (Telegram, WhatsApp, Avito, MAX) из одного интерфейса.

### Текущий статус
- ✅ **Login + Roles** — работает (client/server/both)
- ✅ **Auth API** — `ELO_API_Android_Auth` в n8n
- ✅ **Dialogs API** — `ELO_API_Android_Dialogs` в n8n
- ✅ **Messages API** — `ELO_API_Android_Messages` в n8n
- ✅ **ChatActivity** — новый экран чата (открывается, загружает сообщения)
- ✅ **tunnel-server** — работает на 155.212.221.189:8800
- ⬜ **Тестовые сообщения** — нужно добавить в elo_t_messages
- 🔄 **Channel Setup** — UI готов, backend частично

---

## Что сделано в текущей сессии (18.12.2025)

### 1. Auth API ✅
- Импортирован `API_Android_Auth_ELO.json` в n8n
- Создан тестовый оператор: `admin@test.local` / `test123`
- Протестирован логин — работает

### 2. Dialogs API ✅
- Создан workflow `ELO_API_Android_Dialogs`
- Endpoint: `GET /android/dialogs?session_token=...`
- Возвращает список диалогов оператора
- Тестовые данные: 3 диалога (Telegram, WhatsApp, Avito)

### 3. Messages API ✅
- Создан workflow `ELO_API_Android_Messages`
- Endpoint: `GET /android-messages/android/dialogs/:dialog_id/messages`
- Возвращает сообщения диалога

### 4. ChatActivity ✅
- Новый экран для просмотра чата
- Заменил старый AppealDetailActivity
- Загружает сообщения с сервера
- Layout: header + messages list + input

### 5. Android App Updates
- `ApiService.kt` — добавлены endpoints для dialogs и messages
- `MainActivity.kt` — загружает диалоги с API (не mock)
- `ChatActivity.kt` — новый экран чата
- `ChatMessagesAdapter.kt` — адаптер для сообщений
- Layouts: `activity_chat.xml`, `item_chat_message.xml`

---

## Архитектура (актуальная)

```
┌─────────────────────────────────────────────────────────────────┐
│                    n8n SERVER (185.221.214.83)                   │
│  Webhooks:                                                       │
│  - android/auth/login     → ELO_API_Android_Auth                │
│  - android/dialogs        → ELO_API_Android_Dialogs             │
│  - android-messages/...   → ELO_API_Android_Messages            │
└─────────────────────────────────────────────────────────────────┘
                              │ HTTPS
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                    ANDROID APP (Eldoleado)                       │
│  ┌──────────────────────────────────────────────────────────┐   │
│  │  LoginActivity → MainActivity → ChatActivity              │   │
│  │  - Dialogs list from API                                  │   │
│  │  - Messages from API                                      │   │
│  │  - TunnelService for server/both modes                    │   │
│  └──────────────────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────────────────┘
```

---

## NEXT STEPS

### Priority 1: Add Test Messages
```sql
-- Добавить тестовые сообщения в elo_t_messages
INSERT INTO elo_t_messages (tenant_id, dialog_id, client_id, direction_id, actor_type, content, timestamp)
VALUES (...);
```

### Priority 2: Send Message API
- Создать endpoint для отправки сообщений
- `POST /android/dialogs/:dialog_id/messages`

### Priority 3: Channel Setup Backend
- Telegram Bot verification
- Avito sessid validation
- WhatsApp integration

---

## Тестовые данные

### Оператор
- Email: `admin@test.local`
- Password: `test123`
- Tenant: `Test Repair Shop`

### Диалоги (в БД)
| Клиент | Канал | Chat ID |
|--------|-------|---------|
| Иван Петров | Telegram | 123456789 |
| Алексей Козлов | Avito | avito_chat_555 |
| Мария Сидорова | WhatsApp | 79007654321 |

---

## Серверы

| Server | IP | Что там | Статус |
|--------|-----|---------|--------|
| **n8n** | 185.221.214.83 | n8n, postgresql | ✅ Ready |
| **Tunnel** | 155.212.221.189 | tunnel-server:8800 | ✅ Running |
| **Finnish** | 217.145.79.27 | mcp-telegram, mcp-whatsapp | ✅ Ready |
| **RU** | 45.144.177.128 | mcp-avito, mcp-max, neo4j | ✅ Ready |

---

## Quick Commands

```bash
# Build Android app
export JAVA_HOME="/c/Program Files/Android/Android Studio/jbr"
cd /c/Users/User/Documents/Eldoleado && ./gradlew.bat assembleDebug

# Install on emulator
adb install -r app/build/outputs/apk/debug/app-debug.apk

# Test login
curl -X POST https://n8n.n8nsrv.ru/webhook/android/auth/login \
  -H "Content-Type: application/json" \
  -d '{"login":"admin@test.local","password":"test123","app_mode":"both"}'

# Test dialogs
curl "https://n8n.n8nsrv.ru/webhook/android/dialogs?session_token=YOUR_TOKEN"

# Database access
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c 'SELECT * FROM elo_t_dialogs;'"
```

---

## Ключевые файлы

| Файл | Описание |
|------|----------|
| `NEW/MVP/Android Messager/ROADMAP.md` | Полная документация |
| `NEW/workflows/API/API_Android_Auth_ELO.json` | Auth workflow |
| `NEW/workflows/API/API_Android_Dialogs.json` | Dialogs workflow |
| `NEW/workflows/API/API_Android_Messages.json` | Messages workflow |
| `app/src/main/java/.../ChatActivity.kt` | Экран чата |
| `app/src/main/java/.../MainActivity.kt` | Главный экран |
| `app/src/main/java/.../api/ApiService.kt` | API endpoints |

---

**Before ending session:** update Start.md, Stop.md, git push
