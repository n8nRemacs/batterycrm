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
**December 12, 2025, 17:00 (UTC+4)**

---

## CORE AI — РЕАЛИЗОВАНО, НУЖЕН ДЕБАГ

### Что сделано

```
✅ Документация Core AI (07_Core_AI/)
   ├── CORE_AI_OVERVIEW.md — полное описание Context Lines
   └── workflows_info/ — 6 документов по воркерам

✅ n8n Workflows (NEW/workflows/ELO_Core_AI/)
   ├── ELO_Core_AI_Orchestrator.json — главный оркестратор
   ├── ELO_Core_Lines_Analyzer.json — анализ линий
   ├── ELO_Core_AI_Derive.json — вычисление зависимых слотов
   ├── ELO_Core_Triggers_Checker.json — проверка триггеров
   ├── ELO_Core_Stage_Manager.json — управление этапами
   ├── ELO_Core_Response_Generator.json — генерация ответов
   └── ELO_Core_AI_Test_Stub.json — тестовая заглушка (эхо)

✅ ELO_Out_Router — роутинг ответов по каналам
   ├── Webhook: /webhook/elo-out-router
   ├── Switch по channel_id (1-5)
   └── Вызывает ELO_Out_* как sub-workflow
```

---

### Текущий статус

```
Channel IN → Input Contour → Client Contour → [Core AI] → Out Router → Channel OUT
                                                  ↑
                                          ЗДЕСЬ ДЕБАЖИМ
```

**Test Stub:** `ELO_Core_AI_Test_Stub` — простой эхо для отладки цепочки без сложного AI.

---

## NEXT STEPS — ДЕБАГ И ТЕСТИРОВАНИЕ

### 1. Проверить цепочку с Test Stub
- Отправить сообщение через Telegram
- Проверить что проходит через Input → Client → Test Stub → Out Router → Telegram

### 2. Включить полный Core AI
- Заменить Test Stub на Orchestrator
- Тестировать по этапам

### 3. Отладить каждый компонент
- Lines Analyzer — правильно ли создаёт/переключает линии
- AI Derive — работает ли вычисление symptom → repair → price
- Stage Manager — корректны ли переходы между этапами
- Triggers Checker — срабатывают ли триггеры
- Response Generator — адекватны ли ответы AI

---

## Модель "Context Lines" (напоминание)

```
┌─────────────────────────────────────────────────────────┐
│                      CONTEXT                            │
│                                                         │
│  Line 0: ●──●──●──○──○  (cursor=3, waiting)            │
│  Line 1: ●──●──●──●──✓  (done)                         │
│  Line 2: ●──○──○──○──○  (cursor=1, active) ← focus     │
│                                                         │
│  ● = filled, ○ = empty, ✓ = complete                   │
└─────────────────────────────────────────────────────────┘

Line = intake с слотами [device, symptom, owner, price]
Cursor = где остановились
Focus = активная линия
Waiting = линии с обрывами
```

---

## Этапы воронки

```
┌─────────────────────────────────────────────────────────┐
│  ЭТАП 1: data_collection — сбор данных                 │
│  slots: [device, symptom, owner, price]                 │
├─────────────────────────────────────────────────────────┤
│  ЭТАП 2: presentation — презентация                    │
│  slots: [offer_shown] + triggers                        │
├─────────────────────────────────────────────────────────┤
│  ЭТАП 3: agreement — согласование                      │
│  slots: [conditions_ok, ready_to_book]                  │
├─────────────────────────────────────────────────────────┤
│  ЭТАП 4: booking — запись                              │
│  slots: [date, time, name, phone]                       │
├─────────────────────────────────────────────────────────┤
│  ЭТАП 5: confirmation — подтверждение                  │
│  slots: [confirmed] → INTAKE CREATED                    │
└─────────────────────────────────────────────────────────┘
```

---

## SERVERS

### MCP Contours:

| Service | IP | Port | Status |
|---------|----|------|--------|
| Input Contour | 45.144.177.128 | 8771 | 📝 Documented |
| Client Contour | 45.144.177.128 | 8772 | ✅ Code ready |
| Graph Tool | 45.144.177.128 | 8773 | 📝 Documented |
| AI Tool | 45.144.177.128 | 8774 | ✅ Created |

### Infrastructure:

| Server | IP/URL | Port | Purpose |
|--------|--------|------|---------|
| n8n | n8n.n8nsrv.ru | 443 | Workflow automation |
| Neo4j | 45.144.177.128 | 7474/7687 | Graph database |
| PostgreSQL | 185.221.214.83 | 6544 | Main database |
| Redis (RU) | 45.144.177.128 | 6379 | Queues |

---

## n8n Workflows (импортированы)

| Workflow | Webhook | Status |
|----------|---------|--------|
| ELO_Out_Router | /webhook/elo-out-router | ✅ Active |
| ELO_Core_AI_Test_Stub | /webhook/elo-core-ingest | ✅ For debug |
| ELO_Out_Telegram | sub-workflow | ✅ |
| ELO_Out_WhatsApp | sub-workflow | ✅ |
| ELO_Out_Avito | sub-workflow | ✅ |
| ELO_Out_VK | sub-workflow | ✅ |
| ELO_Out_MAX | sub-workflow | ✅ |

---

## DATABASE CONNECTIONS

```
PostgreSQL: postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres
Neo4j: bolt://neo4j:Mi31415926pS@45.144.177.128:7687
Redis (RU): redis://:Mi31415926pSss!@45.144.177.128:6379
```

---

## KEY DOCUMENTS

**Core AI:**
1. `NEW/Core_info/07_Core_AI/CORE_AI_OVERVIEW.md` — архитектура
2. `NEW/Core_info/07_Core_AI/workflows_info/` — описания воркеров
3. `NEW/workflows/ELO_Core_AI/` — JSON для импорта

**Architecture:**
1. `NEW/ROADMAP.md` — killer features
2. `CORE_NEW/docs/05_AI_ARCHITECTURE.md` — 7 levels

---

## QUICK COMMANDS

```bash
# Neo4j test data check
ssh root@45.144.177.128 "docker exec neo4j cypher-shell -a 'bolt+ssc://localhost:7687' -u neo4j -p 'Mi31415926pS' 'MATCH (n) RETURN labels(n), count(n)'"

# Redis queue check
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! LLEN "ai_extraction_queue"'

# Test Out Router
curl -X POST https://n8n.n8nsrv.ru/webhook/elo-out-router \
  -H "Content-Type: application/json" \
  -d '{"channel_id": 1, "external_chat_id": "123", "text": "test"}'

# Update context
python scripts/update_core_context.py
```

---

**Before ending session:** update Start.md and Stop.md, git push
