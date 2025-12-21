# Start Session - План на следующую сессию

## Приоритет 0: Тестирование Redis Queue

### Что проверить
Отправка сообщений через новую Redis архитектуру:

```bash
curl -X POST "https://n8n.n8nsrv.ru/webhook/android/messages/send" \
  -H "Content-Type: application/json" \
  -d '{
    "session_token": "85bc5364-7765-4562-be9e-02d899bb575e",
    "dialog_id": "cff56064-1fc3-4152-8e64-6e0266a87bf6",
    "text": "Test Redis queue message"
  }'
```

**Ожидаемый результат:**
1. Ответ: `{"success": true, "queued": true, "queue": "queue:outgoing:whatsapp"}`
2. Через 3 сек ELO_Out_WhatsApp берёт сообщение из очереди
3. Сообщение отправляется в WhatsApp через Baileys
4. Клиент получает сообщение

**Мониторинг очередей:**
```bash
ssh root@185.221.214.83 "docker exec redis redis-cli LLEN queue:outgoing:whatsapp"
```

---

## Приоритет 1: Исправить нормализацию текста

### Проблема
Webhook `android-normalize/android/dialogs/:dialog_id/normalize` не работает - n8n не поддерживает динамические path параметры.

### Решение
1. **n8n:** Изменить webhook path на `android/normalize`

2. **ApiService.kt:** Убрать `@Path`, использовать body:
   ```kotlin
   @POST("android/normalize")
   fun normalizeDialogText(
       @Body request: NormalizeDialogRequest
   ): Call<NormalizeDialogResponse>
   ```

3. **NormalizeDialogRequest:** Добавить dialog_id:
   ```kotlin
   data class NormalizeDialogRequest(
       val session_token: String,
       val dialog_id: String,
       val text: String
   )
   ```

4. **ChatActivity.kt:** Передавать dialog_id в request

---

## Приоритет 2: Автоназначение оператора для новых диалогов

### ELO_Client_Resolve - изменения:

1. **DB Get Tenant** - добавить `channel_account_id`:
   ```sql
   SELECT t.id as tenant_id, t.domain_id, ca.id as channel_account_id, ca.channel_id
   FROM elo_t_tenants t
   JOIN elo_t_channel_accounts ca ON ca.tenant_id = t.id
   ...
   ```

2. **DB Create Dialog** - назначать оператора:
   ```sql
   INSERT INTO elo_t_dialogs (..., assigned_operator_id, channel_account_id)
   SELECT ...,
       (SELECT oc.operator_id FROM elo_t_operator_channels oc
        WHERE oc.channel_account_id = '...' AND oc.is_active = true
        ORDER BY oc.is_primary DESC LIMIT 1),
       '...'
   ```

---

## Архитектура Redis Queue (реализовано)

```
Android App ──► ELO_API_Android_Send_Message
                        │
                        ├─► queue:outgoing:telegram  ──► ELO_Out_Telegram
                        ├─► queue:outgoing:whatsapp  ──► ELO_Out_WhatsApp
                        ├─► queue:outgoing:avito     ──► ELO_Out_Avito
                        ├─► queue:outgoing:vk        ──► ELO_Out_VK
                        └─► queue:outgoing:max       ──► ELO_Out_MAX
```

Каждый ELO_Out_* воркфлоу:
- Schedule Trigger (каждые 3 сек)
- Redis LPOP из своей очереди
- IF Has Message → Parse → Get Token → Send → Update Dialog

---

## Baileys Session (Finnish Server)

**Server:** 217.145.79.27:8766
**Session ID:** eldoleado_main
**Phone:** 79171708077 (Ремакс)
**Status:** connected (авторизован)
**Webhook:** https://n8n.n8nsrv.ru/webhook/whatsapp-incoming

**ВАЖНО:** В БД `elo_t_channel_accounts.credentials->>'session_id'` = `eldoleado_main`

---

## Тестовые данные

- **Оператор:** Test Admin (22222222-2222-2222-2222-222222222222)
- **Session:** 85bc5364-7765-4562-be9e-02d899bb575e
- **Диалог:** cff56064-1fc3-4152-8e64-6e0266a87bf6
- **Клиент:** Дмитрий (+79997253777, WhatsApp, channel_id=2)

---

## Документация

- `NEW/N8N_REDIS_IMPORT.md` — инструкция по импорту Redis воркфлоу
- `NEW/IMPLEMENTATION_PLAN.md` — план реализации
- `NEW/N8N_SQL_FIXES.md` — SQL фиксы для n8n

---

## Команды для тестирования

```bash
# === BAILEYS (Finnish Server) ===
curl http://217.145.79.27:8766/sessions

# === Отправка сообщения (Redis queue) ===
curl -X POST "https://n8n.n8nsrv.ru/webhook/android/messages/send" \
  -H "Content-Type: application/json" \
  -d '{"session_token":"85bc5364-7765-4562-be9e-02d899bb575e","dialog_id":"cff56064-1fc3-4152-8e64-6e0266a87bf6","text":"Test"}'

# === Мониторинг Redis очередей ===
ssh root@185.221.214.83 "docker exec redis redis-cli LLEN queue:outgoing:whatsapp"
ssh root@185.221.214.83 "docker exec redis redis-cli LLEN queue:outgoing:telegram"

# === Database ===
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c 'SELECT id, content, direction_id FROM elo_t_messages ORDER BY timestamp DESC LIMIT 5;'"
```
