# ELO_In_Phone

> Входящий workflow для телефонных звонков

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Файл** | `NEW/workflows/ELO_In/ELO_In_Phone.json` |
| **Триггер** | Webhook POST `/phone` |
| **Вызывается из** | АТС, CallTracking системы |
| **Вызывает** | Execute Tenant Resolver, Execute Client Resolver |
| **Выход** | HTTP Response (без Redis очереди!) |

---

## Назначение

Принимает данные о входящих звонках (с записью разговора), транскрибирует запись и создаёт заявку.

**Особенность:** Всегда есть голос (запись разговора), нет Redis очереди.

---

## Входные данные

```json
{
  "from": "+79991234567",
  "caller_id": "+79991234567",
  "call_id": "call-12345",
  "recording_url": "https://ats.example.com/records/call-12345.mp3",
  "duration": 120,
  "status": "completed",
  "start_time": "2024-12-10T10:00:00Z"
}
```

---

## Выходные данные

```json
{
  "channel": "phone",
  "external_user_id": "79991234567",
  "external_chat_id": "+79991234567",
  "text": "[транскрипция разговора]",
  "timestamp": "2024-12-10T10:00:00Z",
  "client_phone": "+79991234567",
  "client_name": null,
  "media": {
    "has_voice": true,
    "voice_transcribed_text": "[транскрипция]"
  },
  "meta": {
    "call_duration": 120,
    "call_status": "completed",
    "recording_url": "https://..."
  }
}
```

---

## Ноды

### 1. Phone Trigger

| Параметр | Значение |
|----------|----------|
| **ID** | `f2cbc9a1-30aa-4d68-b772-04fd96724158` |
| **Path** | `/phone` |
| **Response Mode** | lastNode |

---

### 2. Extract Phone Data

| Параметр | Значение |
|----------|----------|
| **ID** | `5a690131-0e0e-4b0e-afb9-0ce80a4df2e7` |
| **Тип** | n8n-nodes-base.code |

**Код:**
```javascript
const call = $input.first().json;

// Нормализуем номер телефона
let phone = call.from || call.caller_id || call.phone;
if (phone) {
  phone = phone.replace(/\D/g, '');
  if (phone.length === 11 && phone.startsWith('8')) {
    phone = '7' + phone.substring(1);
  }
  phone = '+' + phone;
}

const hasVoice = true;  // <-- всегда есть запись
const recordingUrl = call.recording_url || call.record_url || null;

return {
  has_voice: hasVoice,
  voice_url: recordingUrl,
  raw_call: call,
  phone: phone,
  call_id: call.call_id || call.id || Date.now().toString(),
  call_duration: call.duration || 0,
  call_status: call.status || 'completed',
  start_time: call.start_time || call.created_at || new Date().toISOString()
};
```

---

### 3. Download Recording

| Параметр | Значение |
|----------|----------|
| **ID** | `eda103e3-7cee-40cd-b524-3788897811c6` |
| **URL** | `{{ $json.voice_url }}` |
| **Response** | File (binary) |

---

### 4. Transcribe Recording

| Параметр | Значение |
|----------|----------|
| **ID** | `84c1057d-73cc-48f5-b503-508a78fcc3e7` |
| **Тип** | OpenAI Whisper |
| **Credentials** | OpenAi account (ptoy1RvCOn39G0Af) |

---

### 5. Normalize Phone

| Параметр | Значение |
|----------|----------|
| **ID** | `b101d59e-3ee4-4e73-a529-d5fd34927a1e` |
| **Тип** | n8n-nodes-base.code |

**Код:**
```javascript
const data = $('Extract Phone Data').first().json;
const transcription = $input.first().json.text;

return {
  channel: 'phone',
  external_user_id: data.phone?.replace(/\+/g, ''),
  external_chat_id: data.phone,

  text: transcription,  // <-- весь текст = транскрипция
  timestamp: data.start_time,

  client_phone: data.phone,
  client_name: null,
  client_email: null,

  media: {
    has_voice: true,
    voice_transcribed_text: transcription,
    has_images: false,
    has_video: false,
    has_document: false
  },

  meta: {
    external_message_id: data.call_id,
    ad_channel: 'phone',
    original_media_type: 'voice',
    call_duration: data.call_duration,
    call_status: data.call_status,
    recording_url: data.voice_url
  },

  prefilled_data: {
    model: null,
    parts_owner: null
  }
};
```

---

### 6. Execute Tenant Resolver

| Параметр | Значение |
|----------|----------|
| **ID** | `1d4c2b12-34d8-4bca-a3d4-002cacda8ef5` |
| **Вызывает** | ELO_Core_Tenant_Resolver (rRO6sxLqiCdgvLZz) |

---

### 7. Execute Client Resolver

| Параметр | Значение |
|----------|----------|
| **ID** | `74485659-c973-48fd-b7bc-53134a2fda84` |
| **Вызывает** | `$env.CLIENT_RESOLVER_WORKFLOW_ID` |

---

### 8. Respond Success

```json
{"success": true}
```

---

## Схема потока

```
Phone Trigger → Extract Data → Download Recording → Transcribe → Normalize
                                                                    ↓
                                            Tenant Resolver → Client Resolver → Respond
```

**Без Redis!** Синхронная обработка звонка.

---

## Особенности

| Особенность | Описание |
|-------------|----------|
| **Всегда voice** | `has_voice: true` — запись разговора |
| **Без очереди** | Синхронная обработка |
| **text = транскрипция** | Весь текст сообщения — это транскрипция |
| **call_duration** | Длительность звонка в секундах |
| **recording_url** | Сохраняется в meta для истории |

---

## Зависимости

| Тип | ID | Назначение |
|-----|-----|------------|
| Workflow | rRO6sxLqiCdgvLZz | Tenant Resolver |
| Env | CLIENT_RESOLVER_WORKFLOW_ID | Client Resolver |
| OpenAI | ptoy1RvCOn39G0Af | Transcription |
