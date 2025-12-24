# Stop Session - 2025-12-24

## Что сделано сегодня

### 1. Avito WebSocket через Android WebView

**Проблема:** Python avito-listener на сервере блокируется QRATOR (anti-bot)

**Решение:** WebSocket через Android WebView
- Используется мобильный IP телефона
- QRATOR пропускает мобильные устройства
- VPN должен быть ОТКЛЮЧЕН!

**Ключевой файл:**
`app/src/main/java/com/eldoleado/app/channels/avito/AvitoWebViewClient.kt`

### 2. sender_name - получение имени контакта

Добавлено получение имени отправителя через `getChannels` API:

```kotlin
fetchContactName(channelId) → "Дмитрий"
```

**Логика:**
- `sender_id` = уникальный хэш пользователя (для БД lookup)
- `sender_name` = имя для отображения (может повторяться)

### 3. Webhook payload (работает!)

```json
{
  "channel_account_id": "default",
  "tenant_id": "11111111-1111-1111-1111-111111111111",
  "channel_type": "avito",
  "external_chat_id": "u2i-PJIRB81Ps9iX81CSTNUgPw",
  "external_message_id": "be83190f7db4b85b8b53dc281f91eb96",
  "message_type": "text",
  "message_text": "Здравствуйте",
  "sender_id": "b5b928d9b300d15526cf829b93962213",
  "sender_name": "Дмитрий",
  "source": "android_webview"
}
```

---

## Текущая архитектура Avito

```
┌─────────────────────────────────────────────────────────────┐
│                    Android Phone                             │
│                    (Mobile IP - no VPN!)                     │
├─────────────────────────────────────────────────────────────┤
│  AvitoWebViewClient                                          │
│  ├── WebView with cookies                                    │
│  ├── JavaScript WebSocket to socket.avito.ru                │
│  ├── fetchContactName() → getChannels API                   │
│  └── Forward to n8n webhook                                  │
└─────────────────────────────────────────────────────────────┘
                           │
                           │ POST /avito/incoming
                           ▼
┌─────────────────────────────────────────────────────────────┐
│                    n8n (185.221.214.83)                      │
│  ELO_In_Avito_User → queue:incoming:universal               │
└─────────────────────────────────────────────────────────────┘
```

---

## Что осталось сделать

### n8n доработки

1. **Normalize Message** — добавить `client_name`:
   ```javascript
   client_name: $json.sender_name || $json.sender_id
   ```

2. **ELO_Client_Resolve** — создание клиента:
   - Искать: `WHERE external_id = sender_id AND channel_type = 'avito'`
   - Если не найден → создать нового клиента

---

## Серверы

| Сервер | IP | Роль |
|--------|-----|------|
| MessagerOne | 155.212.221.189 | MCP сервисы (WhatsApp, MAX, Telegram) |
| n8n | 185.221.214.83 | n8n, PostgreSQL, Redis |
| Android | Mobile IP | Avito WebSocket (обход QRATOR) |

---

## Коммиты сегодня

```
3cc20cd7d feat: Avito WebSocket via Android WebView + sender_name
```

---

*Сессия завершена: 2025-12-24 14:40 MSK*
