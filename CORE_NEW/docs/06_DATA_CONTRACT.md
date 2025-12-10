# ELO Data Contract — Минимальный пакет данных

> Спецификация минимального набора данных, который передаётся между ELO workflows.
> Каждый воркер может восстановить полный контекст из PostgreSQL по этим ID.

---

## Философия

**Проблема:** Передавать между workflows полные объекты (client, dialog, context) — избыточно и приводит к рассинхронизации.

**Решение:** Передаём минимум — только ID. Каждый воркер при необходимости делает свой запрос в БД.

---

## Минимальный пакет (ELO Core Contract)

```typescript
interface ELOCoreContract {
  // === ОБЯЗАТЕЛЬНЫЕ (минимум для работы) ===
  tenant_id: UUID;           // ID тенанта — основа multi-tenancy
  channel: string;           // telegram | whatsapp | vk | avito | max | phone | web
  external_chat_id: string;  // ID чата во внешней системе (с префиксом: tg_123, wa_789)

  // === ТЕКУЩЕЕ СООБЩЕНИЕ ===
  text: string;              // Текст сообщения (или объединённый батч)

  // === ОПЦИОНАЛЬНЫЕ ID (заполняются по мере прохождения) ===
  client_id?: UUID;          // ID клиента в elo_clients (после Client Resolver)
  dialog_id?: UUID;          // ID диалога в elo_dialogs (после Dialog Engine)
  event_id?: UUID;           // ID события в elo_events (после сохранения)

  // === МЕТАДАННЫЕ ===
  meta?: {
    external_message_id?: string;   // ID сообщения во внешней системе
    external_user_id?: string;      // ID пользователя во внешней системе
    timestamp?: string;             // ISO timestamp
    batched?: boolean;              // true если это батч сообщений
    batch_size?: number;            // количество сообщений в батче
  };
}
```

---

## Правила прокидывания

### 1. Входной воркер (ELO_In_*)

**Получает от MCP:** raw webhook data

**Нормализует в:**
```json
{
  "tenant_id": null,          // ← заполнит Tenant Resolver
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "external_user_id": "tg_987654321",
  "text": "Привет, нужен ремонт",
  "meta": {
    "external_message_id": "12345",
    "timestamp": "2024-12-09T10:30:00Z",
    "bot_token": "123:ABC..."
  }
}
```

**Обязательно прокидывает:** channel, external_chat_id, text, meta

---

### 2. Tenant Resolver (ELO_Core_Tenant_Resolver)

**Получает:** нормализованный пакет без tenant_id

**Добавляет:**
```json
{
  "tenant_id": "uuid-...",
  "tenant_settings": {
    "batch_timeout_sec": 10,
    "ai_mode": "assist"
  }
}
```

**Обязательно прокидывает:** всё входящее + tenant_id + tenant_settings

---

### 3. Batcher (ELO_Core_Batcher)

**Получает:** пакет с tenant_id

**Модифицирует:**
```json
{
  "text": "Объединённый текст\n\nвторое сообщение",
  "meta": {
    "batched": true,
    "batch_size": 2,
    "batch_timeout_sec": 10
  }
}
```

**Обязательно прокидывает:** всё входящее (с модифицированным text и meta)

---

### 4. Dialog Engine (ELO_Core_Dialog_Engine)

**Получает:** пакет с tenant_id

**Добавляет:**
```json
{
  "client_id": "uuid-...",
  "dialog_id": "uuid-...",
  "event_id": "uuid-...",
  "client_found": true,
  "dialog_found": true
}
```

**Обязательно прокидывает:** tenant_id, channel, external_chat_id, text + новые ID

---

### 5. AI Router (ELO_Core_AI_Router)

**Получает:** пакет с tenant_id, client_id, dialog_id

**Использует ID для:**
- Загрузки dialog.context из PostgreSQL
- Загрузки истории из elo_events
- Загрузки профиля клиента из elo_clients

**Добавляет:**
```json
{
  "ai_response": "Текст ответа",
  "extraction_id": "uuid-...",
  "suggestion_id": "uuid-..."
}
```

---

### 6. Выходной воркер (ELO_Out_*)

**Получает:** пакет с response_text, channel, external_chat_id

**Использует:**
- channel — куда отправлять
- external_chat_id — кому отправлять
- response_text — что отправлять
- tenant_id — для получения credentials канала

---

## Восстановление контекста

Любой воркер может восстановить полный контекст по минимальному набору ID:

```sql
-- Получить всё по dialog_id
SELECT
  d.*,
  c.name as client_name,
  c.phone as client_phone,
  c.profile as client_profile,
  t.name as tenant_name,
  t.settings as tenant_settings
FROM elo_dialogs d
JOIN elo_clients c ON c.id = d.client_id
JOIN elo_tenants t ON t.id = d.tenant_id
WHERE d.id = :dialog_id;

-- Получить историю сообщений
SELECT * FROM elo_events
WHERE dialog_id = :dialog_id
  AND event_type LIKE 'message.%'
ORDER BY created_at DESC
LIMIT 20;
```

---

## Валидация контракта

Каждый воркер должен проверять входящий пакет:

```javascript
function validateCoreContract(data) {
  const errors = [];

  // Обязательные после Tenant Resolver
  if (!data.tenant_id) errors.push('missing tenant_id');
  if (!data.channel) errors.push('missing channel');
  if (!data.external_chat_id) errors.push('missing external_chat_id');

  // Обязательные после Dialog Engine
  if (data.dialog_id && !data.client_id) {
    errors.push('dialog_id present but client_id missing');
  }

  if (errors.length > 0) {
    throw new Error(`Contract validation failed: ${errors.join(', ')}`);
  }

  return true;
}
```

---

## Цепочка прохождения данных

```
MCP Webhook
    │
    ▼
┌─────────────────────────────────────────────────────────────┐
│ ELO_In_Telegram                                             │
│ + channel, external_chat_id, text, meta                     │
└─────────────────────────────────────────────────────────────┘
    │
    ▼
┌─────────────────────────────────────────────────────────────┐
│ ELO_Core_Tenant_Resolver                                    │
│ + tenant_id, tenant_settings                                │
└─────────────────────────────────────────────────────────────┘
    │
    ▼
┌─────────────────────────────────────────────────────────────┐
│ ELO_Core_Batcher                                            │
│ ~ text (объединённый), meta.batched                         │
└─────────────────────────────────────────────────────────────┘
    │
    ▼
┌─────────────────────────────────────────────────────────────┐
│ ELO_Core_Dialog_Engine                                      │
│ + client_id, dialog_id, event_id                            │
└─────────────────────────────────────────────────────────────┘
    │
    ▼
┌─────────────────────────────────────────────────────────────┐
│ ELO_Core_AI_Router                                          │
│ + ai_response, extraction_id, suggestion_id                 │
└─────────────────────────────────────────────────────────────┘
    │
    ▼
┌─────────────────────────────────────────────────────────────┐
│ ELO_Out_Telegram                                            │
│ Использует: channel, external_chat_id, ai_response          │
└─────────────────────────────────────────────────────────────┘
```

---

## Тестирование контракта

Для каждого воркера создать тест:

```javascript
// test_contract.js
const testInput = {
  tenant_id: 'test-tenant-uuid',
  channel: 'telegram',
  external_chat_id: 'tg_123',
  text: 'Тестовое сообщение'
};

// Прогнать через воркер
const output = await executeWorkflow('ELO_Core_Dialog_Engine', testInput);

// Проверить что все входные данные прокинуты
assert(output.tenant_id === testInput.tenant_id);
assert(output.channel === testInput.channel);
assert(output.external_chat_id === testInput.external_chat_id);
assert(output.text === testInput.text);

// Проверить что добавлены новые данные
assert(output.client_id);
assert(output.dialog_id);
assert(output.event_id);
```

---

## Настройки в elo_tenants.settings

```json
{
  "batch_timeout_sec": 10,
  "ai_mode": "assist",
  "ai_freedom_level": 50,
  "working_hours": {
    "start": "09:00",
    "end": "20:00"
  },
  "auto_response_enabled": true,
  "greeting_message": "Здравствуйте! Чем могу помочь?"
}
```

Эти настройки передаются в `tenant_settings` после Tenant Resolver и доступны всем последующим воркерам.
