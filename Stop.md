# STOP - Session Completion Checklist

> **IMPORTANT:** When updating this file ALWAYS specify date AND time in format: `DD Month YYYY, HH:MM (UTC+3)`

---

## MANDATORY before closing session:

### 1. Update Start.md

**IMPORTANT:** ALWAYS add sync block at the beginning of Start.md:

```markdown
## FIRST — Sync

**If reading this file SECOND time after git pull — SKIP this block and go to next section!**

\`\`\`bash
cd "C:/Users/User/Documents/Eldoleado"
git pull
\`\`\`

After git pull — REREAD this file from the beginning (Start.md), starting from the next section (skipping this sync block to avoid loops).

---
```

Then update "What's done" section — add everything done in this session.

### 2. Clean project
Delete temporary files from project root.

### 3. Update CORE_NEW context
```bash
python scripts/update_core_context.py
```

### 4. Git sync
```bash
git add -A && git commit -m "Session update: brief description" && git push
```

---

## Last session: 20 December 2025, 15:50 (MSK, UTC+3)

---

## What's done in this session

### 1. WhatsApp → Android: Message Flow Investigation

**Цель:** Входящие сообщения WhatsApp должны отображаться в Android приложении.

**Что сделано:**

1. ✅ **ELO_In_WhatsApp** — исправлен:
   - Фильтр `$json.body.event === "message"` (отсекает presence events)
   - Извлечение `session_id` из Baileys webhook
   - Добавление `profile_id: session_id` в нормализованные данные
   - Push в Redis queue `queue:incoming`

2. ✅ **WhatsApp Channel Account** — создан в БД:
   ```sql
   tenant_id: 11111111-1111-1111-1111-111111111111 (Test Repair Shop)
   account_id: eldoleado_main
   channel_id: 2 (whatsapp)
   ```

3. ✅ **ELO_Client_Resolve** — исправлен:
   - DB Get Tenant берёт sessionId из `meta.raw.sessionId`
   - Теперь находит tenant по WhatsApp session

4. ✅ **Протестирован flow до AI Stub:**
   ```
   WhatsApp → Baileys → ELO_In_WhatsApp → Redis → Batcher → ELO_Client_Resolve → Core → AI_Stub ✓
   ```

### 2. Обнаружен GAP: Messages не сохраняются!

**Проблема:**
```
Android читает из:
- elo_t_dialogs  ← ELO_Client_Resolve создаёт ✓
- elo_t_messages ← НИКТО НЕ ПИШЕТ! ✗
```

**Текущий flow:**
```
ELO_In_WhatsApp     → только Redis queue (убрали DB writes)
Batcher             → объединяет сообщения
ELO_Client_Resolve  → создаёт client + dialog (НО НЕ message!)
ELO_Core_Ingest     → отправляет в AI
AI_Stub             → заглушка
```

**Нужно добавить:** запись в `elo_t_messages` где-то в цепочке.

---

## Current Message Flow (needs investigation)

```
┌─────────────────────────────────────────────────────────────────────────┐
│                         INCOMING MESSAGE FLOW                           │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                         │
│  WhatsApp (Baileys 217.145.79.27:8766)                                 │
│       │                                                                 │
│       ▼ webhook POST                                                    │
│  ┌─────────────────────┐                                               │
│  │  ELO_In_WhatsApp    │  path: /webhook/whatsapp-incoming             │
│  │  - filter messages  │  output: {channel, profile_id, text, ...}     │
│  │  - extract data     │                                               │
│  │  - normalize        │                                               │
│  └──────────┬──────────┘                                               │
│             │ RPUSH queue:incoming                                      │
│             ▼                                                           │
│  ┌─────────────────────┐                                               │
│  │  Redis Queue        │  queue:incoming                               │
│  └──────────┬──────────┘                                               │
│             │ BRPOP (Batcher)                                           │
│             ▼                                                           │
│  ┌─────────────────────┐                                               │
│  │  ELO_Batcher_*      │  batches messages by chat_id                  │
│  │  (???)              │  ТЕРЯЕТ profile_id! берёт из meta.raw         │
│  └──────────┬──────────┘                                               │
│             │ Execute Workflow                                          │
│             ▼                                                           │
│  ┌─────────────────────┐                                               │
│  │  ELO_Client_Resolve │  - resolves tenant (by sessionId)             │
│  │                     │  - upserts client                              │
│  │                     │  - upserts dialog                              │
│  │                     │  - НЕ СОХРАНЯЕТ message!                       │
│  └──────────┬──────────┘                                               │
│             │ HTTP POST to Core                                         │
│             ▼                                                           │
│  ┌─────────────────────┐                                               │
│  │  ELO_Core_Ingest    │  (???)                                        │
│  └──────────┬──────────┘                                               │
│             │                                                           │
│             ▼                                                           │
│  ┌─────────────────────┐                                               │
│  │  AI Processing      │  ELO_Core_AI_Test_Stub (заглушка)             │
│  └──────────┬──────────┘                                               │
│             │                                                           │
│             ▼                                                           │
│         ??? КТО СОХРАНЯЕТ MESSAGE В БД ???                             │
│         ??? КТО ОТПРАВЛЯЕТ ОПЕРАТОРУ ???                               │
│                                                                         │
└─────────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────────┐
│                         ANDROID APP (READ)                              │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                         │
│  API_Android_Dialogs   GET /android/dialogs                            │
│       │                SELECT FROM elo_t_dialogs                        │
│       ▼                                                                 │
│  API_Android_Messages  GET /android/dialogs/:id/messages               │
│                        SELECT FROM elo_t_messages  ← ПУСТО!            │
│                                                                         │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## Files Modified This Session

| File | Changes |
|------|---------|
| `NEW/workflows/Chanel Contour/ELO_In/ELO_In_WhatsApp.json` | Added session_id extraction, profile_id, event filter |
| `NEW/workflows/Client Contour/ELO_Client_Resolve.json` | DB Get Tenant uses meta.raw.sessionId for WhatsApp |

---

## NEXT STEPS (Priority Order)

### 1. 🔴 Изучить полную цепочку сообщений
- [ ] Найти ВСЕ workflows в цепочке (Batcher, Core_Ingest, etc.)
- [ ] Определить КТО должен сохранять message в `elo_t_messages`
- [ ] Определить КТО отправляет сообщение оператору в Android

### 2. 🔴 Добавить сохранение messages
- [ ] Решить ГДЕ: ELO_Client_Resolve или отдельный workflow
- [ ] INSERT INTO elo_t_messages (tenant_id, dialog_id, client_id, content, ...)

### 3. 🟡 Проверить outbound flow
- [ ] ELO_Out_WhatsApp → Baileys API
- [ ] Сохранение исходящих в elo_t_messages

---

## Key Workflows

| Workflow | Location | Purpose |
|----------|----------|---------|
| ELO_In_WhatsApp | Chanel Contour/ELO_In/ | Incoming WhatsApp → Redis |
| ELO_Client_Resolve | Client Contour/ | Resolve tenant/client/dialog |
| ELO_Out_WhatsApp | Chanel Contour/ELO_Out/ | Send via Baileys |
| API_Android_Dialogs | API/ | Android dialogs list |
| API_Android_Messages | API/ | Android messages in dialog |

---

## To continue

1. `git pull`
2. Read `Start.md`
3. **Найти и изучить:**
   - Batcher workflow (что делает с данными)
   - ELO_Core_Ingest (что делает после Client_Resolve)
   - Где должен быть INSERT INTO elo_t_messages
