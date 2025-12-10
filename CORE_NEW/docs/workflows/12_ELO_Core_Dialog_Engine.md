# ELO_Core_Dialog_Engine

> Управление клиентами и диалогами

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Название** | ELO_Core_Dialog_Engine |
| **Триггер** | Execute Workflow Trigger |
| **Вызывается из** | ELO_Core_Batcher (Execute Workflow) |
| **Вызывает** | ELO_Core_AI_Router (Execute Workflow) |
| **Выход** | Вызов ELO_Core_AI_Router с контекстом диалога |

---

## Назначение

Управляет сущностями Client и Dialog в PostgreSQL:
- Находит или создаёт клиента по external_user_id
- Находит открытый диалог или создаёт новый
- Сохраняет входящее сообщение как событие
- Передаёт контекст в AI Router

---

## Входные данные

**Источник:** Execute Workflow от ELO_Core_Batcher

```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "external_user_id": "tg_987654321",
  "text": "Объединённый текст сообщений",
  "timestamp": "2024-12-10T10:30:15Z",
  "tenant_id": "a1b2c3d4-...",
  "tenant_settings": {...},
  "client_name": "Иван Петров",
  "client_username": "ivanpetrov",
  "client_phone": null,
  "meta": {
    "batched": true,
    "batch_size": 2
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

**Принимает:** Данные от ELO_Core_Batcher

**Логика:** Точка входа при вызове из другого workflow

**Передаёт:** Входные данные без изменений

---

### 2. Attach Base

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Входные данные

**Логика:** Подготавливает базовые данные для SQL запросов

**Передаёт:**
```json
{
  "tenant_id": "uuid-...",
  "channel": "telegram",
  "external_user_id": "tg_987654321",
  "external_chat_id": "tg_123456789",
  "text": "...",
  "client_name": "Иван Петров",
  "client_phone": null,
  "timestamp": "..."
}
```

---

### 3. Find or Create Client

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |
| **Query** | см. ниже |

**SQL запрос (UPSERT):**
```sql
INSERT INTO elo_clients (
  tenant_id,
  external_id,
  channel,
  name,
  phone,
  profile
)
VALUES (
  '{{ tenant_id }}',
  '{{ external_user_id }}',
  '{{ channel }}',
  '{{ client_name }}',
  {{ client_phone or NULL }},
  '{}'::jsonb
)
ON CONFLICT (tenant_id, external_id, channel)
DO UPDATE SET
  name = COALESCE(EXCLUDED.name, elo_clients.name),
  phone = COALESCE(EXCLUDED.phone, elo_clients.phone),
  updated_at = NOW()
RETURNING id, name, phone, profile, created_at;
```

**Принимает:** tenant_id, external_user_id, channel, client_name, client_phone

**Логика:**
- Ищет клиента по (tenant_id, external_id, channel)
- Если не найден — создаёт
- Если найден — обновляет name/phone если переданы

**Передаёт:**
```json
{
  "id": "client-uuid-...",
  "name": "Иван Петров",
  "phone": null,
  "profile": {},
  "created_at": "2024-12-10T10:30:00Z"
}
```

---

### 4. Merge After Client

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Исходные данные + результат Find Client

**Логика:** Объединяет client_id с исходными данными

**Передаёт:**
```json
{
  "...all original fields...",
  "client_id": "client-uuid-...",
  "client_found": true,
  "client_created": false
}
```

---

### 5. Find Active Dialog

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |
| **Query** | см. ниже |

**SQL запрос:**
```sql
SELECT
  id,
  status,
  context,
  assigned_operator_id,
  created_at,
  updated_at
FROM elo_dialogs
WHERE tenant_id = '{{ tenant_id }}'
  AND client_id = '{{ client_id }}'
  AND channel = '{{ channel }}'
  AND status IN ('new', 'active', 'waiting')
ORDER BY updated_at DESC
LIMIT 1;
```

**Принимает:** tenant_id, client_id, channel

**Логика:** Ищет открытый диалог для этого клиента в этом канале

**Передаёт:**
```json
{
  "id": "dialog-uuid-...",
  "status": "active",
  "context": {...},
  "assigned_operator_id": null,
  "created_at": "...",
  "updated_at": "..."
}
```

Или пустой результат если диалога нет.

---

### 6. Merge After Dialog

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Данные + результат Find Dialog

**Логика:** Проверяет найден ли диалог

**Передаёт:**
```json
{
  "...all fields...",
  "dialog_id": "dialog-uuid-..." or null,
  "dialog_found": true or false
}
```

---

### 7. Dialog Exists?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.dialog_found === true` |

**Принимает:** Результат проверки

**Логика:** Разветвление: использовать существующий или создать новый

**Передаёт:**
- **TRUE** → Use Existing Dialog
- **FALSE** → Create New Dialog

---

### 8. Use Existing Dialog

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Данные с dialog_id

**Логика:** Подготавливает данные для сохранения события

**Передаёт:** Данные без изменений

---

### 9. Create New Dialog

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |
| **Query** | см. ниже |

**SQL запрос:**
```sql
INSERT INTO elo_dialogs (
  tenant_id,
  client_id,
  channel,
  external_chat_id,
  status,
  context
)
VALUES (
  '{{ tenant_id }}',
  '{{ client_id }}',
  '{{ channel }}',
  '{{ external_chat_id }}',
  'new',
  '{}'::jsonb
)
RETURNING id, status, context, created_at;
```

**Принимает:** tenant_id, client_id, channel, external_chat_id

**Логика:** Создаёт новый диалог со статусом 'new'

**Передаёт:**
```json
{
  "id": "new-dialog-uuid-...",
  "status": "new",
  "context": {},
  "created_at": "..."
}
```

---

### 10. Merge New Dialog

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Исходные данные + новый dialog_id

**Логика:** Добавляет dialog_id к данным

**Передаёт:**
```json
{
  "...all fields...",
  "dialog_id": "new-dialog-uuid-...",
  "dialog_found": false,
  "dialog_created": true
}
```

---

### 11. Save Message Event

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |
| **Query** | см. ниже |

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
  'message.incoming',
  'client',
  '{
    "text": "{{ text }}",
    "channel": "{{ channel }}",
    "meta": {{ meta as JSON }}
  }'::jsonb
)
RETURNING id, created_at;
```

**Принимает:** tenant_id, dialog_id, client_id, text, meta

**Логика:** Сохраняет входящее сообщение как событие

**Передаёт:**
```json
{
  "id": "event-uuid-...",
  "created_at": "2024-12-10T10:30:15Z"
}
```

---

### 12. Update Dialog Timestamp

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |
| **Query** | см. ниже |

**SQL запрос:**
```sql
UPDATE elo_dialogs
SET
  updated_at = NOW(),
  status = CASE
    WHEN status = 'new' THEN 'active'
    ELSE status
  END
WHERE id = '{{ dialog_id }}';
```

**Принимает:** dialog_id

**Логика:** Обновляет timestamp и переводит 'new' → 'active'

**Передаёт:** Результат UPDATE

---

### 13. Prepare for AI Router

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Все накопленные данные

**Логика:** Формирует финальный объект для AI Router

**Передаёт:**
```json
{
  "tenant_id": "uuid-...",
  "client_id": "uuid-...",
  "dialog_id": "uuid-...",
  "event_id": "uuid-...",
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Объединённый текст",
  "tenant_settings": {...},
  "client_name": "Иван Петров",
  "client_found": true,
  "dialog_found": false,
  "dialog_created": true
}
```

---

### 14. Execute AI Router

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.executeWorkflow |
| **Workflow ID** | ID ELO_Core_AI_Router |

**Принимает:** Подготовленные данные

**Логика:** Синхронно вызывает ELO_Core_AI_Router

**Передаёт:** Результат выполнения AI Router

---

## Выходные данные

**Куда:** Execute Workflow в ELO_Core_AI_Router

**Формат:**
```json
{
  "tenant_id": "uuid-...",
  "client_id": "uuid-...",
  "dialog_id": "uuid-...",
  "event_id": "uuid-...",
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Текст сообщения пользователя",
  "tenant_settings": {
    "ai_mode": "assist",
    "ai_freedom_level": 50
  },
  "client_name": "Иван Петров",
  "meta": {
    "batched": true,
    "batch_size": 2
  }
}
```

---

## PostgreSQL Tables

| Таблица | Операции | Описание |
|---------|----------|----------|
| elo_clients | INSERT, UPDATE, SELECT | Клиенты |
| elo_dialogs | INSERT, UPDATE, SELECT | Диалоги |
| elo_events | INSERT | События (сообщения) |

---

## Зависимости

| Тип | Название | Назначение |
|-----|----------|------------|
| Credentials | Postgres account | Для работы с БД |
| Workflow | ELO_Core_AI_Router | Вызывается после сохранения |

---

## Ошибки и обработка

| Ошибка | Причина | Обработка |
|--------|---------|-----------|
| PostgreSQL недоступен | Сетевая ошибка | Workflow fail |
| Duplicate key (client) | Race condition | ON CONFLICT handles |
| Duplicate key (dialog) | Race condition | Retry with SELECT |
| Foreign key violation | Invalid tenant_id/client_id | Workflow fail |
