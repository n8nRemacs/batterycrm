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
**December 13, 2025, 17:30 (UTC+4)**

---

## ТЕКУЩАЯ ЗАДАЧА: ELO_Input_Worker → Разделить на 2 воркфлоу

### Проблема

ELO_Input_Worker пытается в одном цикле:
1. Забрать сообщение из очереди
2. Добавить в batch
3. Проверить deadline
4. Если due — собрать и отправить

**Но это не работает**, потому что:
- Цикл 1: Pop msg1 → batch → deadline not due → end
- Цикл 2: Pop msg2 → batch → deadline not due → end
- Цикл 3: Pop msg3 → batch → deadline not due → end
- Цикл 4: Queue empty → deadline DUE! → но Parse Message пустой!

### Решение — 2 воркфлоу:

**1. ELO_Input_Batcher (Schedule 3 sec)**
```
Pop Message → Parse → Push to Batch → Set Deadline → END
```
Только батчит, не проверяет готовность.

**2. ELO_Input_Processor (Schedule 3 sec)**
```
Get All Batches → Check Deadlines → If Due → Collect from Redis → Merge → Send
```
Только проверяет готовность и отправляет.

---

## n8n Redis Node — ВАЖНЫЕ БАГИ

При работе с Redis в n8n учитывай:

| Операция | Где данные | Пример |
|----------|-----------|--------|
| POP | `$json.propertyName` (объект) или `$json.value` (строка) | Проверяй оба |
| KEYS | Ключи как свойства объекта | `Object.keys($json).filter(k => k.startsWith('batch:'))` |
| GET | Значение в имени ключа | `$json['deadline:telegram:tg_123']` |
| SET | Нужен `String()` | `={{String($json.value)}}` |

**IF ноды:** всегда ставь `looseTypeValidation: true` (Convert types = ON)

---

## Архитектура (n8n only, MCP отключены)

```
┌─────────────────────────────────────────────────────────────────────┐
│                         n8n WORKFLOWS                                │
├─────────────────────────────────────────────────────────────────────┤
│  Channel IN (webhooks from MCP messengers)                          │
│      ↓                                                               │
│  ELO_In_Telegram/WhatsApp/Avito/VK/MAX                              │
│      ↓                                                               │
│  queue:incoming (Redis)                                              │
│      ↓                                                               │
│  ELO_Input_Batcher ←── TODO: создать                                │
│      ↓                                                               │
│  batch:* + deadline:* + first_seen:* (Redis)                        │
│      ↓                                                               │
│  ELO_Input_Processor ←── TODO: создать                              │
│      ↓                                                               │
│  ELO_Client_Resolve                                                  │
│      ↓                                                               │
│  [Core AI] ←── Test Stub пока                                       │
│      ↓                                                               │
│  ELO_Out_Router → ELO_Out_*                                         │
└─────────────────────────────────────────────────────────────────────┘
```

**MCP Messengers (работают):**
- mcp-telegram (217.145.79.27:8767)
- mcp-whatsapp (217.145.79.27:8766)
- mcp-avito (45.144.177.128:8765)
- mcp-vk (45.144.177.128:8767)
- mcp-max (45.144.177.128:8768)

**MCP Contours (ОТКЛЮЧЕНЫ):**
- input-contour, client-contour, graph-tool, ai-tool — disabled

---

## Redis структура (debounce batching)

```
queue:incoming          — входящие сообщения (FIFO)
batch:{channel}:{chat}  — накопленные сообщения для батча (LIST)
deadline:{channel}:{chat} — timestamp когда обрабатывать (STRING, TTL 120s)
first_seen:{channel}:{chat} — timestamp первого сообщения (STRING, TTL 120s)
dlq:input_contour       — dead letter queue для ошибок
```

**Debounce логика:**
- DEBOUNCE_MS = 10000 (10 сек тишины)
- MAX_WAIT_MS = 40000 (40 сек максимум)
- deadline = min(first_seen + max_wait, now + debounce)

---

## SERVERS

### Infrastructure:

| Server | IP/URL | Port | Purpose |
|--------|--------|------|---------|
| n8n | n8n.n8nsrv.ru | 443 | Workflow automation |
| Neo4j | 45.144.177.128 | 7474/7687 | Graph database |
| PostgreSQL | 185.221.214.83 | 6544 | Main database |
| Redis (RU) | 45.144.177.128 | 6379 | Queues |

---

## DATABASE CONNECTIONS

```
PostgreSQL: postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres
Neo4j: bolt://neo4j:Mi31415926pS@45.144.177.128:7687
Redis (RU): redis://:Mi31415926pSss!@45.144.177.128:6379
```

---

## QUICK COMMANDS

```bash
# Redis - проверить все ключи
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! KEYS "*"'

# Redis - очистить всё
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! FLUSHALL'

# Redis - добавить тестовые сообщения
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! RPUSH "queue:incoming" "{\"channel\":\"telegram\",\"external_chat_id\":\"tg_123\",\"text\":\"Test 1\"}" "{\"channel\":\"telegram\",\"external_chat_id\":\"tg_123\",\"text\":\"Test 2\"}" "{\"channel\":\"telegram\",\"external_chat_id\":\"tg_123\",\"text\":\"Test 3\"}"'

# Neo4j test
ssh root@45.144.177.128 "docker exec neo4j cypher-shell -a 'bolt+ssc://localhost:7687' -u neo4j -p 'Mi31415926pS' 'MATCH (n) RETURN labels(n), count(n)'"
```

---

## KEY DOCUMENTS

**Input Contour:**
- `NEW/workflows/Input Contour/ELO_Input_Worker.json` — текущая (нерабочая) версия
- `NEW/workflows/Chanel Contour/ELO_In/ELO_In_Telegram.json` — Telegram input

**Core AI:**
- `NEW/Core_info/07_Core_AI/CORE_AI_OVERVIEW.md` — архитектура
- `NEW/workflows/ELO_Core_AI/` — JSON для импорта

---

## NEXT STEPS

1. **Создать ELO_Input_Batcher** — только батчинг
2. **Создать ELO_Input_Processor** — только проверка deadline и отправка
3. **Протестировать цепочку** — 3 сообщения → 1 merged
4. **Подключить Core AI** — заменить Test Stub на Orchestrator

---

**Before ending session:** update Start.md and Stop.md, git push
