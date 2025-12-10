# ELO_In_Telegram

> Входящий workflow для Telegram

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Название** | ELO_In_Telegram |
| **Триггер** | Webhook POST `/telegram-in` |
| **Вызывается из** | mcp-telegram (HTTP POST) |
| **Вызывает** | — (только Redis PUSH) |
| **Выход** | Redis PUSH в `queue:incoming` |

---

## Назначение

Принимает входящие сообщения из Telegram через mcp-telegram, нормализует их в единый формат ELO Core Contract, и помещает в Redis очередь для дальнейшей асинхронной обработки.

---

## Входные данные

**Источник:** HTTP POST от mcp-telegram

```json
{
  "chat_id": "123456789",
  "user_id": "987654321",
  "text": "Здравствуйте, нужен ремонт",
  "bot_token": "123456:ABC-DEF...",
  "first_name": "Иван",
  "last_name": "Петров",
  "username": "ivanpetrov",
  "message_id": "54321",
  "timestamp": "2024-12-10T10:30:00Z",
  "attachments": [
    {
      "type": "voice",
      "file_id": "AwACAgIAAxkBA...",
      "duration": 5
    }
  ],
  "is_callback": false,
  "callback_data": null,
  "raw_data": {...}
}
```

---

## Ноды workflow

### 1. Telegram Webhook

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.webhook |
| **Метод** | POST |
| **Path** | `/telegram-in` |
| **Response Mode** | Response Node |

**Принимает:** HTTP POST с телом JSON от mcp-telegram

**Передаёт:** Сырые данные из body в следующую ноду

---

### 2. Extract Telegram Data

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Сырой JSON из webhook

**Логика:**
- Извлекает chat_id, user_id, text, bot_token
- Формирует client_name из first_name + last_name или username
- Анализирует attachments на наличие voice, photo, video
- Извлекает voice_file_id если есть голосовое сообщение

**Передаёт:**
```json
{
  "has_voice": true,
  "voice_file_id": "AwACAgIA...",
  "bot_token": "123456:ABC...",
  "chat_id": "123456789",
  "user_id": "987654321",
  "message_text": "Здравствуйте",
  "message_id": "54321",
  "timestamp": "2024-12-10T10:30:00Z",
  "sender_name": "Иван Петров",
  "username": "ivanpetrov",
  "has_photo": false,
  "photo_attachments": [],
  "has_video": false,
  "video_attachments": [],
  "has_document": false,
  "is_callback": false,
  "callback_data": null,
  "raw_event": {...}
}
```

---

### 3. Has Voice?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.has_voice === true` |

**Принимает:** Данные из Extract Telegram Data

**Логика:** Проверяет есть ли голосовое сообщение

**Передаёт:**
- **TRUE** → Get Voice File Path
- **FALSE** → Normalize without Voice

---

### 4. Get Voice File Path (если голосовое)

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.httpRequest |
| **URL** | `https://api.telegram.org/bot{bot_token}/getFile?file_id={voice_file_id}` |

**Принимает:** bot_token, voice_file_id

**Логика:** Запрашивает путь к файлу через Telegram Bot API

**Передаёт:**
```json
{
  "ok": true,
  "result": {
    "file_id": "AwACAgIA...",
    "file_path": "voice/file_123.oga"
  }
}
```

---

### 5. Download Voice (если голосовое)

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.httpRequest |
| **URL** | `https://api.telegram.org/file/bot{bot_token}/{file_path}` |
| **Response Format** | File |

**Принимает:** bot_token, file_path

**Логика:** Скачивает аудиофайл

**Передаёт:** Binary data (аудиофайл)

---

### 6. Transcribe Voice (если голосовое)

| Параметр | Значение |
|----------|----------|
| **Тип** | @n8n/n8n-nodes-langchain.openAi |
| **Resource** | audio |
| **Operation** | transcribe |

**Принимает:** Binary аудиофайл

**Логика:** Транскрибирует через OpenAI Whisper

**Передаёт:**
```json
{
  "text": "Здравствуйте нужен ремонт айфона"
}
```

---

### 7. Normalize with Voice / Normalize without Voice

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:**
- Данные из Extract Telegram Data
- Транскрипцию (для with Voice)

**Логика:** Формирует ELO Core Contract

**Передаёт:**
```json
{
  "channel": "telegram",
  "bot_token": "123456:ABC...",
  "external_user_id": "tg_987654321",
  "external_chat_id": "tg_123456789",
  "text": "Здравствуйте нужен ремонт айфона",
  "timestamp": "2024-12-10T10:30:00Z",
  "client_phone": null,
  "client_name": "Иван Петров",
  "client_email": null,
  "client_username": "ivanpetrov",
  "media": {
    "has_voice": true,
    "voice_transcribed_text": "Здравствуйте нужен ремонт айфона",
    "has_images": false,
    "images": [],
    "has_video": false,
    "videos": [],
    "has_document": false
  },
  "meta": {
    "external_message_id": "54321",
    "ad_channel": "telegram",
    "original_media_type": "voice",
    "telegram_user_id": "987654321",
    "telegram_chat_id": "123456789",
    "is_callback": false,
    "callback_data": null,
    "raw": {...},
    "provider": "mcp-telegram"
  },
  "prefilled_data": {
    "model": null,
    "parts_owner": null
  }
}
```

---

### 8. Prepare for Queue

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Нормализованное сообщение

**Логика:** Сериализует в JSON для Redis

**Передаёт:**
```json
{
  "message_json": "{...serialized...}",
  "batch_key": "telegram:tg_123456789"
}
```

---

### 9. Push to Queue

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | push |
| **List** | `queue:incoming` |
| **Tail** | true (RPUSH) |

**Принимает:** message_json

**Логика:** Добавляет сообщение в конец очереди Redis

**Передаёт:** Результат операции

---

### 10. Respond Success

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.respondToWebhook |
| **Response** | JSON |

**Принимает:** batch_key

**Логика:** Возвращает 200 OK вызывающему MCP

**Передаёт (HTTP Response):**
```json
{
  "success": true,
  "queued": true,
  "batch_key": "telegram:tg_123456789"
}
```

---

## Выходные данные

**Куда:** Redis list `queue:incoming`

**Формат:** JSON строка с ELO Core Contract (без tenant_id — он добавляется позже в Queue Processor)

---

## Зависимости

| Тип | Название | Назначение |
|-----|----------|------------|
| Credentials | Redis account | Для push в очередь |
| Credentials | OpenAi account | Для транскрипции голоса |
| External API | Telegram Bot API | Для скачивания voice файлов |

---

## Ошибки и обработка

| Ошибка | Причина | Обработка |
|--------|---------|-----------|
| Telegram API error | Недоступен API | Retry или skip voice |
| OpenAI transcription error | Ошибка Whisper | Использовать пустой text |
| Redis push error | Redis недоступен | Workflow fail, MCP получит 500 |
