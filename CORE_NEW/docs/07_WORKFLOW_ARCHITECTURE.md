# ELO Workflow Architecture

> Полная схема n8n workflows системы Eldoleado
> Версия: 2.0 (CORE_NEW)
> Дата: 2025-12-10

---

## Обзор архитектуры

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                              MCP CHANNELS                                    │
│   mcp-telegram │ mcp-whatsapp │ mcp-avito │ mcp-vk │ mcp-max │ mcp-form    │
└────────┬───────┴──────┬───────┴─────┬─────┴────┬───┴────┬────┴─────┬───────┘
         │              │             │          │        │          │
         ▼              ▼             ▼          ▼        ▼          ▼
┌─────────────────────────────────────────────────────────────────────────────┐
│                            ELO_In_* WORKFLOWS                                │
│   [Webhook] → Normalize → Push to Redis "queue:incoming"                    │
└─────────────────────────────────────┬───────────────────────────────────────┘
                                      │
                                      ▼ Redis List: "queue:incoming"

┌─────────────────────────────────────────────────────────────────────────────┐
│                         ELO_Queue_Processor                                  │
│   [Schedule 5s] → Pop → Tenant Resolve → Group by chat → Execute Batcher    │
└─────────────────────────────────────┬───────────────────────────────────────┘
                                      │
                                      ▼ Execute Workflow

┌─────────────────────────────────────────────────────────────────────────────┐
│                           ELO_Core_Batcher                                   │
│   [Execute Trigger] → Push batch queue → Wait/Debounce → Combine → DialogE  │
└─────────────────────────────────────┬───────────────────────────────────────┘
                                      │
                                      ▼ Execute Workflow

┌─────────────────────────────────────────────────────────────────────────────┐
│                        ELO_Core_Dialog_Engine                                │
│   [Execute Trigger] → Find/Create Client → Find/Create Dialog → Save Event  │
│                     → AI Router                                              │
└─────────────────────────────────────┬───────────────────────────────────────┘
                                      │
                                      ▼ Execute Workflow

┌─────────────────────────────────────────────────────────────────────────────┐
│                         ELO_Core_AI_Router                                   │
│   [Execute Trigger] → Build Context → Call AI → Process Response            │
└─────────────────────────────────────┬───────────────────────────────────────┘
                                      │
                                      ▼ Execute Workflow

┌─────────────────────────────────────────────────────────────────────────────┐
│                           ELO_Out_* WORKFLOWS                                │
│   [Execute Trigger] → Format for channel → Send via MCP                     │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## Каталог Workflows

### 1. Входные (ELO_In_*)

| Workflow | Триггер | Входные данные | Выходные данные | Связь |
|----------|---------|----------------|-----------------|-------|
| ELO_In_Telegram | Webhook POST `/telegram-in` | MCP event (chat_id, text, attachments) | Normalized message | Redis PUSH `queue:incoming` |
| ELO_In_WhatsApp | Webhook POST `/whatsapp-in` | Wappi event | Normalized message | Redis PUSH `queue:incoming` |
| ELO_In_Avito | Webhook POST `/avito-in` | Avito event | Normalized message | Redis PUSH `queue:incoming` |
| ELO_In_VK | Webhook POST `/vk-in` | VK Callback event | Normalized message | Redis PUSH `queue:incoming` |
| ELO_In_MAX | Webhook POST `/max-in` | VK Teams event | Normalized message | Redis PUSH `queue:incoming` |
| ELO_In_Form | Webhook POST `/form-in` | Web form data | Normalized message | Redis PUSH `queue:incoming` |
| ELO_In_Phone | Webhook POST `/phone-in` | Telephony event | Normalized message | Redis PUSH `queue:incoming` |

### 2. Core (обработка)

| Workflow | Триггер | Входные данные | Выходные данные | Связь |
|----------|---------|----------------|-----------------|-------|
| ELO_Queue_Processor | Schedule (5 сек) | Redis queue | Messages with tenant | Execute → ELO_Core_Batcher |
| ELO_Core_Batcher | Execute Trigger | Message with tenant | Batched message | Execute → ELO_Core_Dialog_Engine |
| ELO_Core_Dialog_Engine | Execute Trigger | Batched message | Dialog context | Execute → ELO_Core_AI_Router |
| ELO_Core_AI_Router | Execute Trigger | Dialog context | AI response | Execute → ELO_Out_* |

### 3. Выходные (ELO_Out_*)

| Workflow | Триггер | Входные данные | Выходные данные | Связь |
|----------|---------|----------------|-----------------|-------|
| ELO_Out_Telegram | Execute Trigger | Response + chat_id | — | HTTP → mcp-telegram |
| ELO_Out_WhatsApp | Execute Trigger | Response + chat_id | — | HTTP → mcp-whatsapp |
| ELO_Out_Avito | Execute Trigger | Response + chat_id | — | HTTP → mcp-avito |
| ELO_Out_VK | Execute Trigger | Response + chat_id | — | HTTP → mcp-vk |
| ELO_Out_MAX | Execute Trigger | Response + chat_id | — | HTTP → mcp-max |

---

## Детальное описание каждого Workflow

### ELO_In_Telegram

**Назначение:** Приём сообщений из Telegram через mcp-telegram

**Триггер:** Webhook POST `/telegram-in`

**Входные данные (от MCP):**
```json
{
  "chat_id": "123456789",
  "user_id": "987654321",
  "text": "Здравствуйте",
  "bot_token": "123:ABC...",
  "first_name": "Иван",
  "username": "ivan",
  "attachments": [
    {"type": "voice", "file_id": "..."}
  ],
  "timestamp": "2024-12-10T10:30:00Z"
}
```

**Логика:**
1. Webhook получает POST от mcp-telegram
2. Extract Data: парсинг, извлечение полей
3. Has Voice? → если да:
   - Get Voice File Path (Telegram API)
   - Download Voice (Telegram API)
   - Transcribe Voice (OpenAI Whisper)
4. Normalize: формирование ELO Core Contract
5. Push to Redis `queue:incoming`
6. Respond 200 OK

**Выходные данные (в Redis):**
```json
{
  "channel": "telegram",
  "bot_token": "123:ABC...",
  "external_user_id": "tg_987654321",
  "external_chat_id": "tg_123456789",
  "text": "Здравствуйте",
  "timestamp": "2024-12-10T10:30:00Z",
  "client_name": "Иван",
  "client_username": "ivan",
  "media": {
    "has_voice": false,
    "has_images": false
  },
  "meta": {
    "external_message_id": "...",
    "provider": "mcp-telegram",
    "raw": {...}
  }
}
```

**Связи:**
- ← HTTP от mcp-telegram
- → Redis PUSH `queue:incoming`

---

### ELO_Queue_Processor

**Назначение:** Чтение очереди входящих сообщений, резолвинг tenant, группировка

**Триггер:** Schedule каждые 5 секунд

**Входные данные:** Redis list `queue:incoming`

**Логика:**
1. Check Processor Lock (Redis GET)
2. Если занят → exit
3. Acquire Lock (Redis SET с TTL 60s)
4. Pop до 5-10 сообщений из `queue:incoming`
5. Group by external_chat_id
6. Для каждой группы:
   - Prepare Tenant Lookup (extract bot_token/credentials)
   - Find Tenant (PostgreSQL: elo_channel_accounts + elo_tenants)
   - Attach Tenant (добавить tenant_id, settings к сообщениям)
   - Execute Batcher (вызов ELO_Core_Batcher)
7. Release Lock

**Выходные данные (в ELO_Core_Batcher):**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Здравствуйте",
  "tenant_id": "uuid-...",
  "tenant_name": "Ремонт телефонов",
  "tenant_settings": {
    "batch_timeout_sec": 10,
    "ai_mode": "assist"
  },
  "batch_messages": [...]
}
```

**Связи:**
- ← Redis POP `queue:incoming`
- ← PostgreSQL (elo_channel_accounts, elo_tenants)
- → Execute Workflow: ELO_Core_Batcher

---

### ELO_Core_Batcher

**Назначение:** Debounce/батчинг сообщений от одного пользователя

**Триггер:** Execute Workflow Trigger (вызывается из ELO_Queue_Processor)

**Входные данные:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Сообщение 1",
  "tenant_id": "uuid-...",
  "tenant_settings": {"batch_timeout_sec": 10},
  "batch_messages": [msg1, msg2, ...]
}
```

**Логика:**
1. Prepare Keys (генерация Redis ключей: queue, lock, last_seen)
2. Push to batch Queue (Redis PUSH)
3. Update Last Seen (Redis SET с TTL)
4. Get Lock → Lock Exists?
   - Если lock существует → это не первое сообщение, просто добавили в очередь
   - Если lock нет:
     a. Acquire Lock (Redis SET с TTL 300s)
     b. Wait Batch Timeout (n8n Wait node, timeout из tenant_settings)
     c. Get Last Seen → Check Quiet
     d. Если тишина >= timeout:
        - Pop All Queue
        - Combine Messages (объединить тексты)
        - Delete Queue
        - Release Lock
        - Execute Dialog Engine
     e. Если активность продолжается → Wait снова

**Выходные данные (в ELO_Core_Dialog_Engine):**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Сообщение 1\n\nСообщение 2\n\n[Голосовое]: транскрипция",
  "tenant_id": "uuid-...",
  "meta": {
    "batched": true,
    "batch_size": 3,
    "combined_at": "2024-12-10T10:30:15Z"
  }
}
```

**Связи:**
- ← Execute Workflow от ELO_Queue_Processor
- ↔ Redis (batch queue, locks, last_seen)
- → Execute Workflow: ELO_Core_Dialog_Engine

---

### ELO_Core_Dialog_Engine

**Назначение:** Управление диалогами и клиентами

**Триггер:** Execute Workflow Trigger (вызывается из ELO_Core_Batcher)

**Входные данные:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Объединённый текст",
  "tenant_id": "uuid-...",
  "client_name": "Иван",
  "client_username": "ivan"
}
```

**Логика:**
1. Find or Create Client (PostgreSQL: elo_clients)
   - Поиск по external_user_id + tenant_id
   - Если не найден → INSERT
2. Find Active Dialog (PostgreSQL: elo_dialogs)
   - Поиск открытого диалога для client_id + channel
   - Если не найден или закрыт → CREATE
3. Save Message Event (PostgreSQL: elo_events)
   - INSERT event_type='message.incoming'
4. Update Dialog Timestamp (PostgreSQL: UPDATE elo_dialogs)
5. Prepare for AI Router

**Выходные данные (в ELO_Core_AI_Router):**
```json
{
  "tenant_id": "uuid-...",
  "client_id": "uuid-...",
  "dialog_id": "uuid-...",
  "event_id": "uuid-...",
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Объединённый текст",
  "client_found": true,
  "dialog_found": false,
  "dialog_created": true
}
```

**Связи:**
- ← Execute Workflow от ELO_Core_Batcher
- ↔ PostgreSQL (elo_clients, elo_dialogs, elo_events)
- → Execute Workflow: ELO_Core_AI_Router

---

### ELO_Core_AI_Router

**Назначение:** Маршрутизация к AI, обработка ответов

**Триггер:** Execute Workflow Trigger (вызывается из ELO_Core_Dialog_Engine)

**Входные данные:**
```json
{
  "tenant_id": "uuid-...",
  "client_id": "uuid-...",
  "dialog_id": "uuid-...",
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Нужен ремонт iPhone",
  "tenant_settings": {"ai_mode": "assist"}
}
```

**Логика:**
1. Load Context
   - История сообщений (elo_events)
   - Профиль клиента (elo_clients)
   - Контекст диалога (elo_dialogs.context)
2. Build AI Request
   - System prompt из tenant_settings
   - Context + history
3. Call AI (OpenAI/Claude)
4. Process Response
   - Extract entities (device, issue, intent)
   - Save extraction (elo_ai_extractions)
   - Generate suggestions (elo_ai_suggestions)
5. Save Response Event (elo_events)
6. Select Output Channel → Execute ELO_Out_*

**Выходные данные (в ELO_Out_*):**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "response_text": "Здравствуйте! Какая модель iPhone?",
  "tenant_id": "uuid-...",
  "dialog_id": "uuid-...",
  "meta": {
    "ai_model": "gpt-4",
    "extraction": {...}
  }
}
```

**Связи:**
- ← Execute Workflow от ELO_Core_Dialog_Engine
- ↔ PostgreSQL (elo_events, elo_ai_extractions, elo_ai_suggestions)
- → HTTP к OpenAI/Claude API
- → Execute Workflow: ELO_Out_* (по каналу)

---

### ELO_Out_Telegram

**Назначение:** Отправка ответов в Telegram через mcp-telegram

**Триггер:** Execute Workflow Trigger (вызывается из ELO_Core_AI_Router)

**Входные данные:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "response_text": "Здравствуйте!",
  "tenant_id": "uuid-..."
}
```

**Логика:**
1. Get Channel Config (PostgreSQL: elo_channel_accounts)
2. Format Message (разбиение на чанки если > 4096 символов)
3. Send via MCP (HTTP POST к mcp-telegram)
4. Save Outgoing Event (elo_events)

**Связи:**
- ← Execute Workflow от ELO_Core_AI_Router
- ↔ PostgreSQL (elo_channel_accounts, elo_events)
- → HTTP POST к mcp-telegram `/send`

---

## Redis Keys

| Ключ | Тип | TTL | Назначение |
|------|-----|-----|------------|
| `queue:incoming` | List | — | Входящие сообщения от всех каналов |
| `elo:processor:lock` | String | 60s | Lock для Queue Processor |
| `queue:elo:{channel}:{chat_id}` | List | — | Batch queue для конкретного чата |
| `lock:elo:{channel}:{chat_id}` | String | 300s | Lock для debounce |
| `last_seen:elo:{channel}:{chat_id}` | String | 600s | Timestamp последнего сообщения |

---

## PostgreSQL Tables (elo_*)

| Таблица | Используется в | Операции |
|---------|----------------|----------|
| elo_tenants | Queue Processor | SELECT |
| elo_channel_accounts | Queue Processor, Out_* | SELECT |
| elo_clients | Dialog Engine | SELECT, INSERT, UPDATE |
| elo_dialogs | Dialog Engine | SELECT, INSERT, UPDATE |
| elo_events | Dialog Engine, AI Router, Out_* | INSERT |
| elo_ai_extractions | AI Router | INSERT |
| elo_ai_suggestions | AI Router | INSERT |

---

## Data Contract

Минимальный набор полей, передаваемый между workflows:

```typescript
interface ELOCoreContract {
  // Обязательные (после Queue Processor)
  tenant_id: UUID;
  channel: 'telegram' | 'whatsapp' | 'vk' | 'avito' | 'max' | 'phone' | 'web';
  external_chat_id: string;  // Формат: {channel_prefix}_{id}
  text: string;

  // Опциональные (заполняются по мере прохождения)
  client_id?: UUID;          // После Dialog Engine
  dialog_id?: UUID;          // После Dialog Engine
  event_id?: UUID;           // После сохранения события

  // Метаданные
  meta?: {
    external_message_id?: string;
    batched?: boolean;
    batch_size?: number;
    provider?: string;
    raw?: object;
  };
}
```

---

## Порядок активации

1. **ELO_Queue_Processor** — активировать первым (он запускает цепочку)
2. **ELO_Core_Batcher** — активировать (ждёт вызова)
3. **ELO_Core_Dialog_Engine** — активировать (ждёт вызова)
4. **ELO_Core_AI_Router** — активировать (ждёт вызова)
5. **ELO_Out_*** — активировать нужные выходные каналы
6. **ELO_In_*** — активировать входные каналы в последнюю очередь

---

## Мониторинг и отладка

### Redis Insight
URL: http://185.221.214.83:5540

### Проверка очереди
```bash
ssh root@185.221.214.83 "docker exec redis redis-cli -a Mi31415926pSss! LRANGE queue:incoming 0 -1"
```

### Проверка locks
```bash
ssh root@185.221.214.83 "docker exec redis redis-cli -a Mi31415926pSss! KEYS '*lock*'"
```

### Логи n8n
https://n8n.n8nsrv.ru → Executions
