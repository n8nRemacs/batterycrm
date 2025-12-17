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
**17 December 2025, 13:20 (UTC+4)**

---

## Проект: Android Messager — Омниканальный мессенджер

### Что это
Мобильное приложение для операторов сервисных центров. Общение с клиентами через разные мессенджеры (Telegram, WhatsApp, Avito, MAX) из одного интерфейса.

### Текущий статус
- ✅ tunnel-server ЗАДЕПЛОЕН на Finnish (217.145.79.27)
- ✅ WebSocket протокол реализован (phones + operators)
- ✅ n8n workflows созданы (ELO_In_App, ELO_Message_Router)
- ✅ Android Operator UI полностью готов
- ✅ Schema_messagers.md — полная документация
- ⏳ **NEXT: Интеграция с MainActivity, тестирование**

---

## Что сделано в текущей сессии

### 1. tunnel-server: IN/OUT коннекторы ✅
- `tunnel_in.py` — приём сообщений от телефонов, Whisper транскрипция
- `tunnel_out.py` — отправка сообщений на телефоны
- `message_router.py` — маршрутизация через n8n
- `operator_connector.py` — WebSocket для операторов

### 2. n8n Workflows ✅
- `ELO_In_App` — транскрипция аудио (Whisper) + media download
- `ELO_Message_Router` — роутинг + нормализация текста (OpenRouter/Gemini)
- JSON файлы в `tunnel-server/n8n/` для импорта

### 3. Android Operator UI ✅
- `OperatorWebSocketService` — WebSocket подключение к `/ws/operator`
- `ChatsListFragment` + `ChatsAdapter` — список чатов
- `ChatFragment` + `MessagesAdapter` — переписка
- `DraftApprovalDialog` — утверждение нормализованного текста
- `ChatsRepository` — singleton для состояния
- `ChatModels.kt` — Channel, Chat, ChatMessage, DraftMessage

### 4. Документация ✅
- `NEW/Schema_messagers.md` — полная схема системы (1200+ строк)
- Все API endpoints, WebSocket протоколы, data models
- Message flow диаграммы

---

## Архитектура (актуальная)

```
ТЕЛЕФОНЫ (Server mode)
    │ WebSocket
    ▼
TUNNEL-SERVER (Finnish: 217.145.79.27)
├── tunnel_in.py ──► n8n ELO_In_App (Whisper)
├── message_router.py ──► n8n ELO_Message_Router (OpenRouter)
├── tunnel_out.py ──► отправка на телефоны
└── operator_connector.py ──► WebSocket для операторов
    │
    ▼
OPERATOR APP (Client mode)
├── OperatorWebSocketService
├── ChatsListFragment → ChatFragment
└── DraftApprovalDialog
```

---

## NEXT STEPS

### 1. Интеграция с MainActivity
- [ ] Добавить кнопку перехода в OperatorActivity
- [ ] Условие: показывать только в Client mode

### 2. Тестирование
- [ ] Подключить телефон в Server mode
- [ ] Подключить оператора в Client mode
- [ ] Проверить полный flow сообщений

### 3. Доработки (опционально)
- [ ] Push notifications для новых сообщений
- [ ] Индикация "печатает..."
- [ ] История сообщений (persistence)

---

## Серверы

| Server | IP | Что там | Статус |
|--------|-----|---------|--------|
| **Finnish** | 217.145.79.27 | tunnel-server, mcp-telegram, mcp-whatsapp | ✅ Ready |
| **RU** | 45.144.177.128 | mcp-avito, mcp-max, neo4j, redis | ✅ Ready |
| **n8n** | 185.221.214.83 | n8n, postgresql | ✅ Ready |

---

## Quick Commands

```bash
# Проверить tunnel-server
curl https://tunnel-server.eldoleado.ru/health

# Логи Finnish
ssh root@217.145.79.27 "docker logs tunnel-server --tail 50"

# Импорт n8n workflows
# Открыть https://n8n.n8nsrv.ru
# Import → From File → tunnel-server/n8n/*.json
```

---

## Ключевые файлы

| Файл | Описание |
|------|----------|
| `NEW/Schema_messagers.md` | **Полная документация системы** |
| `NEW/MVP/Android Messager/tunnel-server/` | Бэкенд (DEPLOYED) |
| `NEW/MVP/Android Messager/tunnel-server/n8n/` | n8n workflows JSON |
| `NEW/MVP/Android Messager/app_original/` | Android App |
| `NEW/MVP/Android Messager/app_original/.../operator/` | Operator UI |

---

**Before ending session:** update Start.md, Stop.md, git push
