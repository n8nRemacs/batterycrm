# ELO_Out_Telegram

> Исходящий workflow для Telegram

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Название** | ELO_Out_Telegram |
| **Триггер** | Execute Workflow Trigger |
| **Вызывается из** | ELO_Core_AI_Router (Execute Workflow) |
| **Вызывает** | — (HTTP к mcp-telegram) |
| **Выход** | HTTP POST к mcp-telegram `/send` |

---

## Назначение

Отправляет ответы в Telegram через mcp-telegram:
- Получает текст ответа и chat_id
- Загружает credentials канала
- Форматирует сообщение (разбиение на чанки если нужно)
- Отправляет через MCP

---

## Входные данные

**Источник:** Execute Workflow от ELO_Core_AI_Router

```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "response_text": "Понял, iPhone 13 с разбитым экраном. Стоимость замены...",
  "tenant_id": "a1b2c3d4-...",
  "dialog_id": "dialog-uuid-...",
  "client_id": "client-uuid-...",
  "meta": {
    "ai_model": "gpt-4",
    "extraction_id": "uuid-..."
  }
}
```

---

## Ноды workflow

### 1. Execute Workflow Trigger

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.executeWorkflowTrigger |
| **Input Source** | passthrough |

**Принимает:** Данные от ELO_Core_AI_Router

**Логика:** Точка входа

**Передаёт:** Входные данные без изменений

---

### 2. Get Channel Config

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |

**SQL запрос:**
```sql
SELECT
  ca.credentials,
  ca.account_id,
  ca.webhook_hash
FROM elo_channel_accounts ca
WHERE ca.tenant_id = '{{ tenant_id }}'
  AND ca.channel = 'telegram'
  AND ca.is_active = true
LIMIT 1;
```

**Принимает:** tenant_id

**Логика:** Загружает credentials Telegram бота для этого tenant

**Передаёт:**
```json
{
  "credentials": {
    "bot_token": "123456:ABC-DEF..."
  },
  "account_id": "bat_repair_bot",
  "webhook_hash": "abc123..."
}
```

---

### 3. Merge Config

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Входные данные + channel config

**Логика:** Объединяет данные, извлекает bot_token

**Передаёт:**
```json
{
  "...all input fields...",
  "bot_token": "123456:ABC-DEF...",
  "chat_id": "123456789"
}
```

---

### 4. Format Message

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** response_text

**Логика:**
1. Проверяет длину текста
2. Если > 4096 символов — разбивает на чанки
3. Форматирует для Telegram (escaping если нужно)

**Передаёт:**
```json
{
  "chunks": [
    "Понял, iPhone 13 с разбитым экраном...",
    "...продолжение если было разбиение..."
  ],
  "chunk_count": 1
}
```

---

### 5. Loop Over Chunks (если несколько)

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.splitInBatches |
| **Batch Size** | 1 |

**Принимает:** Массив chunks

**Логика:** Отправляет чанки по одному (если их несколько)

**Передаёт:** Один chunk за раз

---

### 6. Send via MCP

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.httpRequest |
| **Method** | POST |
| **URL** | `http://217.145.79.27:8767/send` |

**Body:**
```json
{
  "bot_token": "123456:ABC-DEF...",
  "chat_id": "123456789",
  "text": "Понял, iPhone 13 с разбитым экраном..."
}
```

**Принимает:** bot_token, chat_id, текст чанка

**Логика:** Отправляет сообщение через mcp-telegram

**Передаёт:**
```json
{
  "success": true,
  "message_id": "98765"
}
```

---

### 7. Save Outgoing Event

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |

**SQL запрос:**
```sql
UPDATE elo_events
SET data = data || '{"sent": true, "sent_at": "{{ now }}"}'::jsonb
WHERE id = '{{ response_event_id }}';
```

**Принимает:** response_event_id (если передан)

**Логика:** Помечает событие как отправленное

**Передаёт:** Результат UPDATE

---

## Выходные данные

**Куда:** HTTP POST к mcp-telegram

**Формат запроса:**
```json
{
  "bot_token": "123456:ABC-DEF...",
  "chat_id": "123456789",
  "text": "Текст сообщения"
}
```

---

## MCP Endpoint

| Параметр | Значение |
|----------|----------|
| **Host** | 217.145.79.27 (Finnish server) |
| **Port** | 8767 |
| **Endpoint** | `/send` |
| **Method** | POST |

---

## Зависимости

| Тип | Название | Назначение |
|-----|----------|------------|
| Credentials | Postgres account | Для загрузки channel config |
| External Service | mcp-telegram | Отправка сообщений |

---

## Ошибки и обработка

| Ошибка | Причина | Обработка |
|--------|---------|-----------|
| MCP недоступен | Сетевая ошибка | Retry, log error |
| Bot token invalid | Неверные credentials | Log error, notify admin |
| Chat not found | Пользователь заблокировал бота | Log, mark dialog as blocked |
| Message too long | > 4096 символов | Разбиение на chunks |
| Rate limit | Telegram API limit | Retry с backoff |

---

## Telegram Limitations

| Параметр | Значение |
|----------|----------|
| Максимальная длина сообщения | 4096 символов |
| Rate limit | 30 сообщений/сек (для бота) |
| Rate limit (в группы) | 20 сообщений/мин в одну группу |
