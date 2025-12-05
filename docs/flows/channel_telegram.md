---
doc_key: telegram
doc_type: channel
entry_workflow: BAT IN Telegram
participating_workflows:
  - MCP Telegram (tg.eldoleado.ru)
  - BAT IN Telegram
  - BAT_Tenant_Resolver
  - BAT Queue Processor
  - BAT Batch Debouncer
  - BAT Client Resolver
  - BAT Appeal Manager
  - BAT AI Appeal Router
  - BAT OUT Telegram
generated: 2025-12-05 15:01:39
updated: 2025-12-05 15:02:57
---

# Поток: Входящее сообщение из Telegram

**Полный цикл обработки сообщений Telegram**

*Обновлено: 2025-12-05 15:02:57*

---

## Архитектура

```
+-------------------+    +------------------------+    +---------------------+
|  Telegram API     |--->|  MCP Telegram          |--->|  n8n                |
|  (пользователь)   |    |  tg.eldoleado.ru       |    |  BAT IN Telegram    |
+-------------------+    +------------------------+    +---------------------+
                                                                |
                                                                v
+-------------------+    +------------------------+    +---------------------+
|  BAT OUT          |<---|  BAT AI Appeal         |<---|  Redis Queue        |
|  Telegram         |    |  Router                |    |  queue:incoming     |
+-------------------+    +------------------------+    +---------------------+
        |
        v
+-------------------+
|  MCP Telegram     |---> Telegram API (ответ клиенту)
|  /api/send        |
+-------------------+
```

## Сводка

- **Точка входа:** MCP Telegram -> BAT IN Telegram
- **Workflows в цепочке:** 9+
- **Операций с БД:** 10+
- **Операций Redis:** 5+
- **Вызовов AI:** 2+ (транскрибация + роутинг)
- **Затронуто таблиц:** 8+

## Компоненты

### MCP Telegram (tg.eldoleado.ru)
- **Сервер:** 217.145.79.27 (Finland)
- **Порт:** 8000 (через nginx -> SSL)
- **Функции:**
  - Прием webhook от Telegram Bot API
  - Нормализация данных (chat_id, user_id, attachments)
  - Маршрутизация по bot_token -> tenant
  - Отправка сообщений через /api/send

### Цепочка Workflows (Inbound)

```
MCP Telegram (webhook)
  -> BAT IN Telegram (/telegram-in)
     -> Transcribe Voice (если голосовое)
     -> BAT_Tenant_Resolver (определение tenant)
     -> Redis: queue:incoming
        -> BAT Queue Processor (каждые 5 сек)
           -> BAT Batch Debouncer (группировка по chat_id)
              -> BAT Client Resolver
                 -> BAT Appeal Manager
                    -> BAT AI Appeal Router
```

### Цепочка Workflows (Outbound)

```
BAT AI Appeal Router
  -> BAT Client Response Sender
     -> BAT OUT Telegram
        -> MCP Telegram /api/send
           -> Telegram Bot API
```

---

## Затронутые таблицы

| Таблица | Операции |
|---------|----------|
| tenants | чтение (resolve tenant) |
| tenant_configs | чтение (bot_token lookup) |
| clients | чтение/запись (client resolver) |
| appeals | чтение/запись (appeal manager) |
| messages_history | запись (save message) |
| appeal_devices | чтение/запись |
| appeal_repairs | чтение/запись |
| touchpoints | запись (Neo4j sync) |

## Операции с базой данных

### Find Tenant (BAT_Tenant_Resolver)

```sql
SELECT
  t.id as tenant_id,
  t.name as tenant_name,
  t.is_active,
  tc.value as config
FROM tenants t
LEFT JOIN tenant_configs tc ON tc.tenant_id = t.id
WHERE tc.key = 'telegram_bot'
  AND tc.value->>'token' = '{{ bot_token }}'
  AND t.is_active = true
LIMIT 1;
```

### Save Message History (BAT OUT Telegram)

```sql
INSERT INTO messages_history (
  tenant_id, appeal_id, message_type, message_text,
  channel, channel_id, external_message_id, external_chat_id
)
SELECT
  tenant_id::uuid,
  appeal_id::uuid,
  'agent',
  message_text,
  'telegram',
  (SELECT id FROM channels WHERE code = 'telegram' LIMIT 1),
  message_id,
  'tg_' || chat_id
RETURNING *;
```

## Операции Redis

| Workflow | Операция | Ключ |
|----------|----------|------|
| BAT IN Telegram | RPUSH | queue:incoming |
| BAT Queue Processor | LPOP | queue:incoming |
| BAT Queue Processor | SET/GET | processor:lock |
| BAT Batch Debouncer | SET/GET | batch:lock:* |
| BAT Batch Debouncer | RPUSH/LPOP | batch:queue:* |

## AI Операции

| Workflow | Операция | Модель |
|----------|----------|--------|
| BAT IN Telegram | Transcribe Voice | OpenAI Whisper |
| BAT AI Appeal Router | Process Message | GPT-4 |

## Внешние API вызовы

| Workflow | API | Метод | Endpoint |
|----------|-----|-------|----------|
| BAT IN Telegram | Telegram | GET | api.telegram.org/bot.../getFile |
| BAT IN Telegram | Telegram | GET | api.telegram.org/file/bot.../... |
| BAT OUT Telegram | MCP | POST | tg.eldoleado.ru/api/send |
| BAT OUT Telegram | Neo4j | POST | /webhook/neo4j/touchpoint/register |

## Формат данных

### Входящее сообщение (MCP -> n8n)

```json
{
  "chat_id": "123456789",
  "user_id": "123456789",
  "text": "Здравствуйте, нужен ремонт iPhone",
  "message_id": "42",
  "timestamp": "2025-12-05T12:00:00Z",
  "bot_token": "123456:ABC...",
  "first_name": "Иван",
  "last_name": "Петров",
  "username": "ivanpetrov",
  "attachments": [
    {"type": "photo", "file_id": "..."},
    {"type": "voice", "file_id": "...", "duration": 15}
  ]
}
```

### Исходящее сообщение (n8n -> MCP)

```json
{
  "token": "123456:ABC...",
  "chat_id": "123456789",
  "text": "Добрый день! Какая модель iPhone?",
  "parse_mode": "Markdown"
}
```

## Настройка бота

1. Зарегистрировать бота через POST /setup:
```json
{
  "bot_token": "123456:ABC...",
  "n8n_webhook_url": "https://n8n.n8nsrv.ru/webhook/telegram-in"
}
```

2. Добавить tenant_config:
```sql
INSERT INTO tenant_configs (tenant_id, key, value)
VALUES (
  'tenant-uuid',
  'telegram_bot',
  '{"token": "123456:ABC...", "bot_username": "@mybotname"}'
);
```
