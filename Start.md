# START - Context for Continuing Work

## FIRST — Sync

**If reading this file SECOND time after git pull — SKIP this block and go to next section!**

```bash
cd "C:/Users/User/Documents/Eldoleado"
git pull
```

After git pull — REREAD this file from the beginning (Start.md), starting from the next section (skipping this sync block to avoid loops).

---

## Last update date and time
**20 December 2025, 15:50 (MSK, UTC+3)**

---

## Текущая задача: WhatsApp → Android

### Цель
Входящие сообщения WhatsApp должны отображаться в Android приложении.

### Статус
```
WhatsApp → Baileys → ELO_In_WhatsApp → Redis → Batcher → ELO_Client_Resolve → AI_Stub
     ✓         ✓            ✓             ✓        ✓              ✓              ✓
                                                                   │
                                                          НО: message не сохраняется в БД!
```

### Проблема
Android читает сообщения из `elo_t_messages`, но **никто туда не пишет**.

---

## NEXT STEP: Изучить полную цепочку

### Нужно найти и изучить:

1. **Batcher** — какой workflow? что делает с данными?
2. **ELO_Core_Ingest** — что происходит после Client_Resolve?
3. **Где INSERT INTO elo_t_messages?** — кто должен сохранять?

### Текущий flow (с вопросами):

```
ELO_In_WhatsApp
    │ RPUSH queue:incoming
    ▼
Redis Queue
    │ BRPOP
    ▼
??? Batcher ???          ← Какой workflow? Где он?
    │
    ▼
ELO_Client_Resolve       ← Создаёт client + dialog, НО НЕ message
    │ HTTP POST
    ▼
??? ELO_Core_Ingest ???  ← Что делает?
    │
    ▼
ELO_Core_AI_Test_Stub    ← Заглушка AI
    │
    ▼
??? ← КТО СОХРАНЯЕТ MESSAGE? КТО УВЕДОМЛЯЕТ ОПЕРАТОРА?
```

---

## Что уже сделано

### 1. ELO_In_WhatsApp — исправлен
- ✅ Фильтр message events (отсекает presence)
- ✅ Извлечение session_id из Baileys
- ✅ profile_id добавляется в данные

### 2. WhatsApp Channel Account — создан
```sql
tenant_id: 11111111-1111-1111-1111-111111111111 (Test Repair Shop)
account_id: eldoleado_main
channel_id: 2 (whatsapp)
```

### 3. ELO_Client_Resolve — исправлен
- ✅ DB Get Tenant берёт sessionId из `meta.raw.sessionId`
- ✅ Находит tenant для WhatsApp

---

## Baileys Session

**Server:** 217.145.79.27:8766
**Session ID:** eldoleado_main
**Phone:** 79171708077 (Ремакс)
**Status:** connected
**Webhook:** https://n8n.n8nsrv.ru/webhook/whatsapp-incoming

---

## Key Files

| File | Description |
|------|-------------|
| `NEW/workflows/Chanel Contour/ELO_In/ELO_In_WhatsApp.json` | Incoming WhatsApp messages |
| `NEW/workflows/Chanel Contour/ELO_Out/ELO_Out_WhatsApp.json` | Outgoing WhatsApp messages |
| `NEW/workflows/Client Contour/ELO_Client_Resolve.json` | Resolve tenant/client/dialog |
| `NEW/workflows/API/API_Android_Dialogs.json` | Android dialogs API |
| `NEW/workflows/API/API_Android_Messages.json` | Android messages API |

---

## Quick Commands

```bash
# Check Redis queue
ssh root@185.221.214.83 "docker exec n8n-redis redis-cli LRANGE queue:incoming 0 5"

# Check Baileys logs
ssh root@217.145.79.27 "docker logs mcp-whatsapp-baileys --tail 50"

# Check Baileys sessions
curl http://217.145.79.27:8766/sessions

# Database query
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c 'SELECT * FROM elo_t_messages LIMIT 5;'"
```

---

## Database Tables (Android reads from)

```sql
-- Dialogs (ELO_Client_Resolve создаёт ✓)
SELECT * FROM elo_t_dialogs WHERE tenant_id = '11111111-1111-1111-1111-111111111111';

-- Messages (ПУСТО - никто не пишет ✗)
SELECT * FROM elo_t_messages WHERE dialog_id = '...';
```

---

**Before ending session:** update Start.md, Stop.md, git push
