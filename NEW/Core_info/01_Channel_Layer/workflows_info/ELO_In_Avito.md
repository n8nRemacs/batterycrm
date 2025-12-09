# ELO_In_Avito

> Входящий workflow для Avito Messenger

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Файл** | `NEW/workflows/ELO_In/ELO_In_Avito.json` |
| **Триггер** | Webhook POST `/avito` |
| **Вызывается из** | Avito Messenger webhook |
| **Вызывает** | ELO_Core_Tenant_Resolver |
| **Выход** | Redis PUSH в `queue:incoming` |

---

## Назначение

Принимает входящие сообщения из Avito Messenger, фильтрует системные сообщения, нормализует и помещает в очередь.

---

## Входные данные

**Источник:** Avito Messenger webhook

```json
{
  "id": "webhook-id",
  "timestamp": 1702200000,
  "payload": {
    "value": {
      "id": "message-id",
      "chat_id": "chat-uuid",
      "user_id": 123456,
      "author_id": 789012,
      "author": {"name": "Покупатель"},
      "content": {"text": "Здравствуйте"},
      "type": "text",
      "created": 1702200000,
      "item_id": 12345678
    }
  }
}
```

---

## Выходные данные

```json
{
  "channel": "avito",
  "external_user_id": "789012",
  "external_chat_id": "chat-uuid",
  "text": "Здравствуйте",
  "timestamp": "2024-12-10T10:00:00Z",
  "client_phone": null,
  "client_name": "Покупатель",
  "meta": {
    "ad_id": "12345678",
    "chat_type": "u2i"
  }
}
```

---

## Ноды

### 1. Avito Trigger

| Параметр | Значение |
|----------|----------|
| **ID** | `fe64d5c7-7982-4d3d-aa9e-f93a078ff6f4` |
| **Path** | `/avito` |

---

### 2. Parse Auth Filter

| Параметр | Значение |
|----------|----------|
| **ID** | `99c5e201-93fc-49d9-9150-3eded9edeb4f` |
| **Тип** | n8n-nodes-base.code |

**Логика фильтрации системных сообщений:**
```javascript
const webhookData = $input.first().json;
const msg = webhookData.payload?.value;

// AUTH CHECK
if (!webhookData.id || !webhookData.timestamp) {
  throw new Error('Invalid webhook format');
}

// SYSTEM FILTER - пропускаем системные сообщения
const isSystem = (
  msg.author_id === msg.user_id ||
  msg.author_id === 0 ||
  !msg.author_id
);

if (isSystem) {
  return { skip: true, reason: 'system_message' };
}

// ... извлечение данных
return {
  skip: false,
  has_voice: msg.type === 'voice',
  author_id: msg.author_id,
  author_name: msg.author?.name,
  chat_id: msg.chat_id,
  message_text: msg.content?.text || '',
  item_id: msg.item_id,
  // ...
};
```

**Фильтр системных:**
- `author_id === user_id` — сообщение от продавца (мы сами)
- `author_id === 0` — системное уведомление
- `!author_id` — нет автора

---

### 3. Should Skip?

| Параметр | Значение |
|----------|----------|
| **ID** | `13395364-4167-4f5e-a011-77440689eb14` |
| **Тип** | n8n-nodes-base.if |

**Условие:** `$json.skip === true`

- TRUE → Respond Skipped (200 OK, пропускаем)
- FALSE → продолжаем обработку

---

### 4. Respond Skipped

```json
{"ok": true, "skipped": true}
```

---

### 5-9. Voice Processing + Normalize

Аналогично другим каналам: Download → Transcribe → Normalize

**Особенности Avito:**
- `external_user_id`: author_id (ID покупателя)
- `ad_id`: item_id (ID объявления)
- `chat_type`: из raw_message

---

### 10-12. Tenant Resolver → Queue → Respond

**Response:**
```json
{"ok": true, "queued": true, "batch_key": "avito:chat-uuid"}
```

---

## Схема потока

```
Avito Trigger → Parse Auth Filter → Should Skip?
                                        ├── YES → Respond Skipped
                                        └── NO → Has Voice?
                                                    ├── YES → Download → Transcribe → Normalize
                                                    └── NO → Normalize
                                                                  ↓
                                                    Tenant Resolver → Queue → Respond
```

---

## Особенности

| Особенность | Описание |
|-------------|----------|
| **Фильтр системных** | Пропускает сообщения от продавца и системные |
| **ad_id** | ID объявления для привязки к товару |
| **author_id** | ID покупателя (не user_id!) |
| **chat_type** | Тип чата (u2i - user to item) |

---

## Зависимости

| Тип | ID | Назначение |
|-----|-----|------------|
| Workflow | rRO6sxLqiCdgvLZz | Tenant Resolver |
| Redis | 7FQcEivUY94atW24 | Queue |
| OpenAI | ptoy1RvCOn39G0Af | Transcription |
