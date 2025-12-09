# ELO_In_VK

> Входящий workflow для VK Community Messages

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Файл** | `NEW/workflows/ELO_In/ELO_In_VK.json` |
| **Триггер** | Webhook POST `/vk` |
| **Вызывается из** | VK Callback API |
| **Вызывает** | ELO_Core_Tenant_Resolver |
| **Выход** | Redis PUSH в `queue:incoming` |

---

## Назначение

Принимает входящие сообщения из VK сообществ через Callback API, обрабатывает confirmation запросы, нормализует и помещает в очередь.

---

## Входные данные

**Confirmation request:**
```json
{
  "type": "confirmation",
  "group_id": 123456789
}
```

**New message:**
```json
{
  "type": "message_new",
  "object": {
    "message": {
      "id": 12345,
      "from_id": 123456789,
      "peer_id": 123456789,
      "text": "Здравствуйте",
      "date": 1702200000,
      "attachments": [
        {
          "type": "audio_message",
          "audio_message": {
            "link_mp3": "https://vk.com/audio.mp3"
          }
        }
      ]
    }
  }
}
```

---

## Выходные данные

```json
{
  "channel": "vk",
  "external_user_id": "123456789",
  "external_chat_id": "123456789",
  "text": "Здравствуйте [транскрипция]",
  "timestamp": "2024-12-10T10:00:00Z",
  "client_phone": null,
  "client_name": null,
  "meta": {
    "group_id": "123456789"
  }
}
```

---

## Ноды

### 1. VK Trigger

| Параметр | Значение |
|----------|----------|
| **ID** | `640302a9-28d4-4e52-994a-a48259d07422` |
| **Path** | `/vk` |

---

### 2. Is Confirmation?

| Параметр | Значение |
|----------|----------|
| **ID** | `5a1b6925-ebe6-42c8-a575-715616ff2bb3` |
| **Тип** | n8n-nodes-base.if |

**Условие:** `$json.type === "confirmation"`

VK требует подтверждения webhook при настройке.

---

### 3. Send Confirmation

| Параметр | Значение |
|----------|----------|
| **ID** | `b92668a6-18d9-4191-bb73-1a38354cdf4c` |
| **Response** | `$env.VK_CONFIRMATION_STRING` |

Возвращает confirmation code из env переменной.

---

### 4. Is New Message?

| Параметр | Значение |
|----------|----------|
| **ID** | `6067d84a-2098-4d69-8670-e274d8f7d767` |
| **Условие** | `$json.type === "message_new"` |

- TRUE → обрабатываем сообщение
- FALSE → Respond OK (Other) — игнорируем другие события

---

### 5. Has Voice?

| Параметр | Значение |
|----------|----------|
| **ID** | `943521d1-905b-42f3-ab47-578678f34ac3` |
| **Условие** | `attachments.some(a => a.type === 'audio_message')` |

---

### 6. Extract Voice URL

```javascript
const msg = $input.first().json.object.message;
const voiceAttachment = msg.attachments.find(a => a.type === 'audio_message');
const voiceUrl = voiceAttachment?.audio_message?.link_mp3;

return {
  voice_url: voiceUrl,
  original_message: msg
};
```

---

### 7-8. Download Voice + Transcribe

Стандартная обработка голоса через OpenAI Whisper.

---

### 9-10. Normalize with/without Voice

**Особенности VK:**
```javascript
const msg = $input.first().json.object.message;

// Фото - берём максимальный размер
const photoAttachment = msg.attachments.find(a => a.type === 'photo');
if (photoAttachment?.photo?.sizes) {
  const maxSize = photoAttachment.photo.sizes.reduce((max, size) =>
    (size.width * size.height > max.width * max.height) ? size : max
  );
  photoUrl = maxSize.url;
}

return {
  channel: 'vk',
  external_user_id: msg.from_id.toString(),
  external_chat_id: msg.peer_id.toString(),
  timestamp: new Date(msg.date * 1000).toISOString(),
  meta: {
    group_id: msg.group_id?.toString()
  }
};
```

---

### 11-14. Tenant Resolver → Queue → Respond

**Response:** `ok` (plain text, требование VK)

---

## Схема потока

```
VK Trigger → Is Confirmation?
                ├── YES → Send Confirmation Code
                └── NO → Is New Message?
                            ├── NO → Respond OK (Other)
                            └── YES → Has Voice?
                                        ├── YES → Extract URL → Download → Transcribe → Normalize
                                        └── NO → Normalize
                                                      ↓
                                        Tenant Resolver → Queue → Respond "ok"
```

---

## Особенности VK

| Особенность | Описание |
|-------------|----------|
| **Confirmation** | Первый запрос — подтверждение webhook |
| **Response** | Всегда `ok` (plain text), иначе VK retry |
| **audio_message** | Голосовые в `.link_mp3` |
| **photo.sizes** | Массив размеров, выбираем максимальный |
| **from_id** | ID пользователя |
| **peer_id** | ID чата (= from_id для личных сообщений) |

---

## Env переменные

| Переменная | Описание |
|------------|----------|
| `VK_CONFIRMATION_STRING` | Код подтверждения webhook |
