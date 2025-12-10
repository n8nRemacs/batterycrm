# ELO_Core_AI_Router

> Маршрутизация к AI и обработка ответов

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Название** | ELO_Core_AI_Router |
| **Триггер** | Execute Workflow Trigger |
| **Вызывается из** | ELO_Core_Dialog_Engine (Execute Workflow) |
| **Вызывает** | ELO_Out_* (Execute Workflow, по каналу) |
| **Выход** | Вызов выходного workflow с ответом |

---

## Назначение

Центральный AI-компонент системы:
- Загружает контекст диалога и историю
- Строит prompt для AI
- Вызывает AI (OpenAI/Claude)
- Обрабатывает ответ (extraction, suggestions)
- Маршрутизирует ответ в нужный выходной канал

---

## Входные данные

**Источник:** Execute Workflow от ELO_Core_Dialog_Engine

```json
{
  "tenant_id": "a1b2c3d4-...",
  "client_id": "client-uuid-...",
  "dialog_id": "dialog-uuid-...",
  "event_id": "event-uuid-...",
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Нужен ремонт iPhone, разбился экран",
  "tenant_settings": {
    "ai_mode": "assist",
    "ai_freedom_level": 50,
    "system_prompt": "Ты помощник сервиса ремонта..."
  },
  "client_name": "Иван Петров"
}
```

---

## Ноды workflow

### 1. Execute Workflow Trigger

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.executeWorkflowTrigger |
| **Input Source** | passthrough |

**Принимает:** Данные от ELO_Core_Dialog_Engine

**Логика:** Точка входа

**Передаёт:** Входные данные без изменений

---

### 2. Load Dialog Context

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |

**SQL запрос:**
```sql
SELECT
  d.context,
  d.status,
  c.name as client_name,
  c.phone as client_phone,
  c.profile as client_profile
FROM elo_dialogs d
JOIN elo_clients c ON c.id = d.client_id
WHERE d.id = '{{ dialog_id }}';
```

**Принимает:** dialog_id

**Логика:** Загружает текущий контекст диалога и профиль клиента

**Передаёт:**
```json
{
  "context": {
    "device": "iPhone",
    "issue": "разбит экран",
    "stage": "problem"
  },
  "status": "active",
  "client_name": "Иван Петров",
  "client_phone": "+79001234567",
  "client_profile": {...}
}
```

---

### 3. Load Message History

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |

**SQL запрос:**
```sql
SELECT
  event_type,
  actor_type,
  data->>'text' as text,
  created_at
FROM elo_events
WHERE dialog_id = '{{ dialog_id }}'
  AND event_type LIKE 'message.%'
ORDER BY created_at DESC
LIMIT 20;
```

**Принимает:** dialog_id

**Логика:** Загружает последние 20 сообщений диалога

**Передаёт:**
```json
[
  {
    "event_type": "message.incoming",
    "actor_type": "client",
    "text": "Нужен ремонт iPhone",
    "created_at": "2024-12-10T10:30:00Z"
  },
  {
    "event_type": "message.outgoing",
    "actor_type": "ai",
    "text": "Какая модель iPhone?",
    "created_at": "2024-12-10T10:30:05Z"
  }
]
```

---

### 4. Merge Context

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Входные данные + context + history

**Логика:** Объединяет все данные для построения промпта

**Передаёт:**
```json
{
  "...all input fields...",
  "dialog_context": {...},
  "message_history": [...],
  "client_profile": {...}
}
```

---

### 5. Check AI Mode

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.tenant_settings.ai_mode === 'auto'` |

**Принимает:** tenant_settings.ai_mode

**Логика:** Определяет режим AI:
- `auto` — AI отвечает автоматически
- `assist` — AI только предлагает варианты (оператор выбирает)
- `off` — AI выключен

**Передаёт:**
- **auto** → Build AI Request
- **assist** → Build Suggestion Request
- **off** → Skip AI (notify operator)

---

### 6. Build AI Request

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Все контекстные данные

**Логика:** Строит промпт для AI:
1. System prompt из tenant_settings
2. Контекст диалога (device, issue, stage)
3. История сообщений
4. Текущее сообщение пользователя

**Передаёт:**
```json
{
  "messages": [
    {
      "role": "system",
      "content": "Ты помощник сервиса ремонта телефонов..."
    },
    {
      "role": "user",
      "content": "Нужен ремонт iPhone"
    },
    {
      "role": "assistant",
      "content": "Какая модель iPhone?"
    },
    {
      "role": "user",
      "content": "iPhone 13, разбился экран"
    }
  ],
  "model": "gpt-4",
  "temperature": 0.7
}
```

---

### 7. Call AI (OpenAI)

| Параметр | Значение |
|----------|----------|
| **Тип** | @n8n/n8n-nodes-langchain.openAi |
| **Resource** | chat |
| **Operation** | message |

**Принимает:** messages, model, temperature

**Логика:** Отправляет запрос в OpenAI API

**Передаёт:**
```json
{
  "text": "Понял, iPhone 13 с разбитым экраном. Стоимость замены экрана составляет от 8000 до 12000 рублей в зависимости от типа дисплея. Хотите записаться на диагностику?",
  "usage": {
    "prompt_tokens": 150,
    "completion_tokens": 45
  }
}
```

---

### 8. Process AI Response

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** AI response

**Логика:**
1. Извлекает текст ответа
2. Пытается распарсить structured output (если есть)
3. Подготавливает данные для extraction

**Передаёт:**
```json
{
  "response_text": "Понял, iPhone 13...",
  "ai_model": "gpt-4",
  "tokens_used": 195,
  "structured_data": {
    "device_brand": "Apple",
    "device_model": "iPhone 13",
    "issue_category": "display",
    "price_quoted": true
  }
}
```

---

### 9. Save AI Extraction

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |

**SQL запрос:**
```sql
INSERT INTO elo_ai_extractions (
  tenant_id,
  dialog_id,
  event_id,
  extraction_type,
  data,
  confidence
)
VALUES (
  '{{ tenant_id }}',
  '{{ dialog_id }}',
  '{{ event_id }}',
  'auto',
  '{{ structured_data as JSON }}'::jsonb,
  0.95
)
RETURNING id;
```

**Принимает:** tenant_id, dialog_id, event_id, structured_data

**Логика:** Сохраняет извлечённые данные (device, issue, intent)

**Передаёт:**
```json
{
  "extraction_id": "extraction-uuid-..."
}
```

---

### 10. Update Dialog Context

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |

**SQL запрос:**
```sql
UPDATE elo_dialogs
SET context = context || '{{ new_context }}'::jsonb
WHERE id = '{{ dialog_id }}';
```

**Принимает:** dialog_id, новые данные контекста

**Логика:** Обновляет context диалога новыми извлечёнными данными

**Передаёт:** Результат UPDATE

---

### 11. Save Response Event

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |

**SQL запрос:**
```sql
INSERT INTO elo_events (
  tenant_id,
  dialog_id,
  client_id,
  event_type,
  actor_type,
  data
)
VALUES (
  '{{ tenant_id }}',
  '{{ dialog_id }}',
  '{{ client_id }}',
  'message.outgoing',
  'ai',
  '{
    "text": "{{ response_text }}",
    "model": "{{ ai_model }}",
    "extraction_id": "{{ extraction_id }}"
  }'::jsonb
)
RETURNING id;
```

**Принимает:** tenant_id, dialog_id, client_id, response_text

**Логика:** Сохраняет ответ AI как событие

**Передаёт:**
```json
{
  "response_event_id": "event-uuid-..."
}
```

---

### 12. Select Output Channel

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.switch |
| **Условие** | По значению `$json.channel` |

**Принимает:** channel (telegram, whatsapp, vk, avito, max)

**Логика:** Маршрутизация к нужному выходному workflow

**Передаёт:**
- `telegram` → Execute ELO_Out_Telegram
- `whatsapp` → Execute ELO_Out_WhatsApp
- `vk` → Execute ELO_Out_VK
- `avito` → Execute ELO_Out_Avito
- `max` → Execute ELO_Out_MAX

---

### 13. Execute ELO_Out_*

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.executeWorkflow |
| **Workflow ID** | ID соответствующего ELO_Out_* |

**Принимает:** Данные для отправки

**Логика:** Синхронно вызывает выходной workflow

**Передаёт:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "response_text": "Понял, iPhone 13...",
  "tenant_id": "uuid-...",
  "dialog_id": "uuid-...",
  "meta": {
    "ai_model": "gpt-4",
    "extraction_id": "uuid-..."
  }
}
```

---

## Выходные данные

**Куда:** Execute Workflow в ELO_Out_* (по каналу)

**Формат:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "response_text": "Текст ответа для пользователя",
  "tenant_id": "uuid-...",
  "dialog_id": "uuid-...",
  "client_id": "uuid-...",
  "meta": {
    "ai_model": "gpt-4",
    "tokens_used": 195,
    "extraction_id": "uuid-...",
    "response_event_id": "uuid-..."
  }
}
```

---

## AI Modes

| Режим | Описание | Поведение |
|-------|----------|-----------|
| `auto` | Автоматический | AI отвечает напрямую |
| `assist` | Помощник | AI предлагает варианты, оператор выбирает |
| `off` | Выключен | Уведомление оператору без AI |

---

## PostgreSQL Tables

| Таблица | Операции | Описание |
|---------|----------|----------|
| elo_dialogs | SELECT, UPDATE | Контекст диалога |
| elo_clients | SELECT | Профиль клиента |
| elo_events | SELECT, INSERT | История и новые события |
| elo_ai_extractions | INSERT | Извлечённые данные |
| elo_ai_suggestions | INSERT | Предложения (для assist mode) |

---

## Зависимости

| Тип | Название | Назначение |
|-----|----------|------------|
| Credentials | Postgres account | Для работы с БД |
| Credentials | OpenAi account | Для вызова AI |
| Workflow | ELO_Out_Telegram | Выход в Telegram |
| Workflow | ELO_Out_WhatsApp | Выход в WhatsApp |
| Workflow | ELO_Out_VK | Выход в VK |
| Workflow | ELO_Out_Avito | Выход в Avito |
| Workflow | ELO_Out_MAX | Выход в MAX |

---

## Ошибки и обработка

| Ошибка | Причина | Обработка |
|--------|---------|-----------|
| OpenAI API error | Rate limit / timeout | Retry с backoff |
| PostgreSQL error | Недоступна БД | Workflow fail |
| Invalid channel | Неизвестный канал | Log error, skip send |
| Token limit exceeded | Слишком длинный контекст | Truncate history |
