# Stop Session - 2025-12-22 22:30

## Что сделано сегодня

### 1. Перенос WhatsApp на MessagerOne (Россия)

**Было:** WhatsApp Baileys на Finnish server (217.145.79.27:8766)
**Стало:** WhatsApp @arceos/baileys на MessagerOne (155.212.221.189:8769)

- Развернут @arceos/baileys с anti-ban фичами
- Настроен dual-IP (155.212.221.189 + 217.114.14.17)
- Выключен WhatsApp на Finnish server
- Добавлен WEBHOOK_URL в docker-compose

**docker-compose:**
```yaml
services:
  whatsapp-ip1:
    image: mcp-whatsapp-arceos:v1.0.0
    ports: "155.212.221.189:8769:8769"
    environment:
      - WEBHOOK_URL=https://n8n.n8nsrv.ru/webhook/whatsapp-incoming
```

---

### 2. Squid Proxy - добавлены MCP порты

n8n не мог достучаться до MessagerOne — Squid блокировал порты.

**Добавлено в `/opt/n8n/squid/squid.conf`:**
```
acl Safe_ports port 8765-8770
acl Safe_ports port 8780
```

---

### 3. База данных - обновлена WhatsApp сессия

```sql
UPDATE elo_t_channel_accounts
SET
  credentials = jsonb_set(credentials, '{session_id}', '"eldoleado_arceos"'),
  ip_node_id = 1
WHERE account_id = 'eldoleado_main' AND channel_id = 2;
```

**Текущие значения:**
- `account_id`: eldoleado_main
- `session_id`: eldoleado_arceos
- `ip_node_id`: 1 (MessagerOne)

---

### 4. ELO_In_WhatsApp - новый парсинг @arceos/baileys

**Extract WhatsApp Data** - переписан для нового формата:

```javascript
const input = $input.first().json;
const event = input.body || input;
const msg = event.message || {};
const key = msg.key || {};
const content = msg.message || {};

const chatId = key.remoteJid || '';

// Только входящие от клиентов (@s.whatsapp.net)
const isClient = chatId.endsWith('@s.whatsapp.net') && !key.fromMe;

if (!isClient) {
  return [];
}

// Has content?
const hasText = !!(content.conversation || content.extendedTextMessage?.text);
const hasMedia = !!(content.imageMessage || content.videoMessage || content.audioMessage || content.documentMessage);

if (!hasText && !hasMedia) {
  return [];
}

const phone = '+' + chatId.replace('@s.whatsapp.net', '');

const messageText = content.conversation
  || content.extendedTextMessage?.text
  || content.imageMessage?.caption
  || content.videoMessage?.caption
  || '';

const timestamp = msg.messageTimestamp
  ? new Date(msg.messageTimestamp * 1000).toISOString()
  : new Date().toISOString();

return {
  session_id: event.sessionId,
  chat_id: chatId,
  phone: phone,
  message_text: messageText,
  message_id: key.id,
  timestamp: timestamp,
  sender_name: msg.pushName || msg.verifiedBizName || null,
  has_photo: !!content.imageMessage,
  has_voice: !!content.audioMessage,
  has_video: !!content.videoMessage,
  has_document: !!content.documentMessage,
  raw_event: event
};
```

**Фильтрует:**
- status@broadcast (статусы/истории)
- @g.us (группы)
- fromMe: true (свои сообщения)
- Пустые сообщения

---

### 5. ELO_Out_WhatsApp - исправлен Parse Message

```javascript
// Handle both: string (old) and object (new Redis behavior)
let message;
if ($json.message_json) {
  message = typeof $json.message_json === 'string'
    ? JSON.parse($json.message_json)
    : $json.message_json;
} else if ($json.propertyName) {
  message = typeof $json.propertyName === 'string'
    ? JSON.parse($json.propertyName)
    : $json.propertyName;
} else {
  throw new Error('No message data found');
}

return {
  out_message: message
};
```

---

## Текущие проблемы

### 1. Redis "Set Deadline" зависает

**Симптом:** Нода получает данные, но не завершается — workflow висит.

**Возможные причины:**
- Неправильный host в Redis credentials (должен быть `n8n-redis`)
- Проблема с TTL/expire

**Проверить:**
- n8n → Credentials → Redis account → Host = `n8n-redis`

### 2. DB Get Tenant не находит tenant

**Запрос ищет:** `account_id = 'eldoleado_arceos'`
**В базе:** `account_id = 'eldoleado_main'`

**Решение — изменить запрос:**
```sql
WHERE ca.credentials->>'session_id' = '{{ sessionId }}'
```

---

## Текущая архитектура WhatsApp

| Сервер | IP | Порт | Статус |
|--------|-----|------|--------|
| Finnish | 217.145.79.27 | 8766 | ВЫКЛЮЧЕН |
| MessagerOne | 155.212.221.189 | 8769 | АКТИВЕН |
| MessagerOne | 217.114.14.17 | 8769 | Резерв |

---

## Сессионные данные

- **Оператор:** +79997253777 (залогинен в WhatsApp)
- **Тестовый клиент:** +79171708077 (Ремакс)
- **Session ID:** eldoleado_arceos
- **Webhook:** https://n8n.n8nsrv.ru/webhook/whatsapp-incoming

---

## Тестовые команды

```bash
# Проверить Baileys
ssh root@155.212.221.189 "curl -s http://localhost:8769/health"

# Отправить тестовое сообщение
ssh root@155.212.221.189 "curl -X POST http://155.212.221.189:8769/messages/text \
  -H 'Content-Type: application/json' \
  -d '{\"sessionId\": \"eldoleado_arceos\", \"to\": \"79171708077\", \"text\": \"Test\"}'"

# Логи Baileys
ssh root@155.212.221.189 "docker logs mcp-whatsapp-ip1 --tail 30"

# Redis ключи
ssh root@185.221.214.83 "docker exec n8n-redis redis-cli KEYS '*'"
```
