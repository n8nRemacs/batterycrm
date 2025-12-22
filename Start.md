# Start Session - План на следующую сессию

## Приоритет 0: Исправить Redis зависание

### Проблема
Нода "Set Deadline" в ELO_Input_Batcher зависает — получает данные, но не завершается.

### Что проверить
1. **Redis credentials в n8n:**
   - n8n → Credentials → "Redis account"
   - Host должен быть `n8n-redis` (не `redis`, не `localhost`)
   - Port: `6379`

2. **Тест без TTL:**
   - Убрать галочку "Expire" в ноде Set Deadline
   - Проверить проходит ли без TTL

3. **Проверить Redis доступность:**
   ```bash
   ssh root@185.221.214.83 "docker exec n8n-n8n-1 sh -c 'echo PING | nc n8n-redis 6379'"
   # Должен вернуть +PONG
   ```

---

## Приоритет 1: DB Get Tenant — исправить поиск

### Проблема
Запрос ищет `account_id = 'eldoleado_arceos'`, но в базе `account_id = 'eldoleado_main'`.

### Решение
Изменить запрос в ELO_Client_Resolve → DB Get Tenant:

```sql
SELECT
  t.id as tenant_id,
  t.domain_id,
  ca.id as channel_account_id,
  ca.channel_id
FROM elo_t_tenants t
JOIN elo_t_channel_accounts ca ON ca.tenant_id = t.id
JOIN elo_channels c ON c.id = ca.channel_id
WHERE ca.credentials->>'session_id' = '{{ $('Validate Input').item.json.meta.raw.sessionId }}'
  AND c.code = '{{ $('Validate Input').first().json.channel }}'
  AND ca.is_active = true
  AND t.is_active = true
LIMIT 1;
```

---

## Приоритет 2: Тестировать полный flow WhatsApp

### Входящие сообщения
1. Отправить сообщение с +79171708077 на +79997253777
2. Проверить:
   - ELO_In_WhatsApp получил webhook
   - Extract WhatsApp Data отфильтровал мусор
   - Сообщение в Redis queue
   - ELO_Input_Batcher обработал
   - ELO_Client_Resolve нашёл tenant
   - Сообщение в базе

### Исходящие сообщения
```bash
curl -X POST "https://n8n.n8nsrv.ru/webhook/android/messages/send" \
  -H "Content-Type: application/json" \
  -d '{
    "session_token": "85bc5364-7765-4562-be9e-02d899bb575e",
    "dialog_id": "cff56064-1fc3-4152-8e64-6e0266a87bf6",
    "text": "Test message"
  }'
```

---

## Текущая архитектура WhatsApp

```
Клиент (+79171708077)
    │
    ▼ WhatsApp
    │
MessagerOne (155.212.221.189:8769) — @arceos/baileys
    │
    ▼ WEBHOOK
    │
https://n8n.n8nsrv.ru/webhook/whatsapp-incoming
    │
    ▼
ELO_In_WhatsApp → Redis queue → ELO_Input_Batcher → ELO_Client_Resolve
    │
    ▼
elo_t_messages (PostgreSQL)
```

**Сессия:** eldoleado_arceos
**Оператор:** +79997253777
**IP Nodes:** MessagerOne (155.212.221.189, 217.114.14.17)

---

## Серверы

| Сервер | IP | Сервисы |
|--------|-----|---------|
| n8n | 185.221.214.83 | n8n, PostgreSQL, Redis |
| MessagerOne | 155.212.221.189 | WhatsApp Baileys (8769) |
| Finnish | 217.145.79.27 | Telegram (8767) — WhatsApp ВЫКЛЮЧЕН |
| RU Server | 45.144.177.128 | Avito, VK, MAX, Neo4j |

---

## Тестовые данные

- **Оператор:** Test Admin (22222222-2222-2222-2222-222222222222)
- **Session:** 85bc5364-7765-4562-be9e-02d899bb575e
- **Диалог:** cff56064-1fc3-4152-8e64-6e0266a87bf6
- **WhatsApp Session:** eldoleado_arceos

---

## Полезные команды

```bash
# === WhatsApp Baileys ===
ssh root@155.212.221.189 "curl -s http://localhost:8769/health"
ssh root@155.212.221.189 "docker logs mcp-whatsapp-ip1 --tail 30"

# === Redis ===
ssh root@185.221.214.83 "docker exec n8n-redis redis-cli KEYS '*'"
ssh root@185.221.214.83 "docker exec n8n-redis redis-cli LLEN queue:incoming"

# === Database ===
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c \"
  SELECT account_id, credentials->>'session_id' as session_id
  FROM elo_t_channel_accounts WHERE channel_id = 2;
\""

# === Test send message ===
ssh root@155.212.221.189 "curl -X POST http://155.212.221.189:8769/messages/text \
  -H 'Content-Type: application/json' \
  -d '{\"sessionId\": \"eldoleado_arceos\", \"to\": \"79171708077\", \"text\": \"Test\"}'"
```

---

## Файлы с кодом (обновлены)

- `NEW/workflows/Channel Contour/ELO_In/ELO_In_WhatsApp.json` — нужно обновить в n8n
- `NEW/workflows/Channel Contour/ELO_Out/ELO_Out_WhatsApp_v2.json` — обновлён Parse Message
- `NEW/workflows/API/ELO_API_Android_Normalize.json` — path изменён на `android/normalize`
