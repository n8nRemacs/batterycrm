# n8n Redis Queue Import Instructions

> Дата: 2025-12-21
> Архитектура: Каждый канал имеет свою Redis очередь

---

## Архитектура

```
Android App
    │
    ▼
ELO_API_Android_Send_Message
    │
    ├─► RPUSH queue:outgoing:telegram  ─► ELO_Out_Telegram (poll)
    ├─► RPUSH queue:outgoing:whatsapp  ─► ELO_Out_WhatsApp (poll)
    ├─► RPUSH queue:outgoing:avito     ─► ELO_Out_Avito (poll)
    ├─► RPUSH queue:outgoing:vk        ─► ELO_Out_VK (poll)
    └─► RPUSH queue:outgoing:max       ─► ELO_Out_MAX (poll)
```

**Преимущества:**
- Каждый канал независим
- Нет проблем с HTTP вызовами между n8n воркфлоу
- Легко масштабировать
- Можно перезапускать отдельные каналы

---

## Порядок импорта

### 1. ELO_Out_WhatsApp (ЗАМЕНИТЬ)

**Файл:** `NEW/workflows/Channel Contour/ELO_Out/ELO_Out_WhatsApp_v2.json`

**Действия:**
1. Деактивировать старый workflow `ELO_Out_WhatsApp`
2. n8n UI → Workflows → Import from File
3. Выбрать файл
4. Переименовать в `ELO_Out_WhatsApp` (убрать _v2)
5. **ВАЖНО:** Настроить Redis credentials (выбрать существующий "Redis n8n")
6. Активировать workflow

**Проверка:**
- Trigger: Schedule Trigger (каждые 3 сек)
- Redis: queue:outgoing:whatsapp

---

### 2. ELO_Out_Telegram (ЗАМЕНИТЬ)

**Файл:** `NEW/workflows/Channel Contour/ELO_Out/ELO_Out_Telegram_v2.json`

**Действия:**
1. Деактивировать старый workflow `ELO_Out_Telegram`
2. Import from File
3. Переименовать в `ELO_Out_Telegram`
4. Настроить Redis credentials
5. Активировать

---

### 3. ELO_Out_Avito (ЗАМЕНИТЬ)

**Файл:** `NEW/workflows/Channel Contour/ELO_Out/ELO_Out_Avito_v2.json`

**Действия:**
1. Деактивировать старый `ELO_Out_Avito`
2. Import from File
3. Переименовать в `ELO_Out_Avito`
4. Настроить Redis credentials
5. Активировать

---

### 4. ELO_Out_VK (ЗАМЕНИТЬ)

**Файл:** `NEW/workflows/Channel Contour/ELO_Out/ELO_Out_VK_v2.json`

**Действия:**
1. Деактивировать старый `ELO_Out_VK`
2. Import from File
3. Переименовать в `ELO_Out_VK`
4. Настроить Redis credentials
5. Активировать

---

### 5. ELO_Out_MAX (ЗАМЕНИТЬ)

**Файл:** `NEW/workflows/Channel Contour/ELO_Out/ELO_Out_MAX_v2.json`

**Действия:**
1. Деактивировать старый `ELO_Out_MAX`
2. Import from File
3. Переименовать в `ELO_Out_MAX`
4. Настроить Redis credentials
5. Активировать

---

### 6. ELO_API_Android_Send_Message (ЗАМЕНИТЬ)

**Файл:** `NEW/workflows/API/ELO_API_Android_Send_Message_v4_channel_queues.json`

**Действия:**
1. Деактивировать старый `ELO_API_Android_Send_Message`
2. Import from File
3. Переименовать в `ELO_API_Android_Send_Message`
4. Настроить Redis credentials
5. Активировать

**Изменения в этом workflow:**
- Webhook path: `android/messages/send` (без :dialog_id в path)
- dialog_id теперь в body запроса
- Пуш в channel-specific очередь (queue:outgoing:{channel})

---

## Можно удалить (опционально)

- `ELO_Out_Router` - больше не нужен
- `ELO_Out_Processor` - не нужен (каждый канал сам себе processor)

---

## Итоговая таблица

| # | Workflow | Файл | Очередь | Действие |
|---|----------|------|---------|----------|
| 1 | ELO_Out_WhatsApp | ELO_Out_WhatsApp_v2.json | queue:outgoing:whatsapp | Replace + Activate |
| 2 | ELO_Out_Telegram | ELO_Out_Telegram_v2.json | queue:outgoing:telegram | Replace + Activate |
| 3 | ELO_Out_Avito | ELO_Out_Avito_v2.json | queue:outgoing:avito | Replace + Activate |
| 4 | ELO_Out_VK | ELO_Out_VK_v2.json | queue:outgoing:vk | Replace + Activate |
| 5 | ELO_Out_MAX | ELO_Out_MAX_v2.json | queue:outgoing:max | Replace + Activate |
| 6 | ELO_API_Android_Send_Message | ELO_API_Android_Send_Message_v4.json | (producer) | Replace + Activate |

---

## Тестирование WhatsApp

После импорта проверить:

```bash
curl -X POST "https://n8n.n8nsrv.ru/webhook/android/messages/send" \
  -H "Content-Type: application/json" \
  -d '{
    "session_token": "YOUR_SESSION_TOKEN",
    "dialog_id": "YOUR_DIALOG_ID",
    "text": "Test Redis queue message"
  }'
```

**Ожидаемый результат:**
1. Ответ: `{"success": true, "queued": true, "queue": "queue:outgoing:whatsapp"}`
2. Через 3 сек ELO_Out_WhatsApp берёт сообщение из очереди
3. Сообщение отправляется в WhatsApp через Baileys

---

## Мониторинг очередей

```bash
# Проверить очереди на сервере
ssh root@185.221.214.83 "docker exec redis redis-cli LLEN queue:outgoing:whatsapp"
ssh root@185.221.214.83 "docker exec redis redis-cli LLEN queue:outgoing:telegram"
```

---

## Android изменения

Файл: `app/src/main/java/com/eldoleado/app/api/ApiService.kt`

```kotlin
// Endpoint уже правильный:
@POST("android/messages/send")
fun sendChatMessage(
    @Body request: SendMessageRequest
): Call<SendMessageResponse>

// SendMessageRequest должен включать:
data class SendMessageRequest(
    val session_token: String,
    val dialog_id: String,
    val text: String,
    val media_type: String? = null,
    val media_data: String? = null
)
```

---

*Создано: 2025-12-21*
