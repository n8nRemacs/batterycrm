# Brief для следующей сессии

> Проектирование архитектуры ELO workflows с нуля

---

## Что уже есть (работает)

### MCP серверы (v2.0.0, production)
- mcp-telegram (217.145.79.27:8767)
- mcp-whatsapp (217.145.79.27:8766)
- mcp-avito (45.144.177.128:8765)
- mcp-vk (45.144.177.128:8767)
- mcp-max (45.144.177.128:8768)

### База данных
- PostgreSQL (185.221.214.83:6544) — 14 таблиц elo_*
- Neo4j (45.144.177.128:7687) — 3 лейбла ELO_*
- Redis (на обоих серверах)

### n8n
- ~100 старых BAT_* workflows (работают)
- 15 новых ELO_* workflows (не работают, неправильная архитектура)

---

## Проблема

Текущие ELO_* workflows не связаны правильно:
- ELO_In_Telegram вызывает старый BAT_Tenant_Resolver
- ELO_Core_Batcher имеет Execute Workflow Trigger, но никто его не вызывает
- Нет единой цепочки обработки

---

## Задача

Спроектировать архитектуру n8n workflows для системы:

```
Входящее сообщение → [обработка] → AI ответ → Исходящее сообщение
```

### Ключевые требования

1. **Multi-tenant** — один workflow обрабатывает всех клиентов
2. **Multi-channel** — Telegram, WhatsApp, Avito, VK, MAX, Form, Phone
3. **Debounce/Batching** — объединение быстрых последовательных сообщений
4. **Async** — входящий webhook должен отвечать быстро (200 OK)

### Вопросы для проектирования

1. Сколько workflows нужно?
2. Как они связаны (Redis, Execute Workflow, HTTP)?
3. Какие триггеры у каждого (Webhook, Schedule, Execute Trigger)?
4. Что делает каждый блок?

---

## Ресурсы

- `CORE_NEW/docs/06_DATA_CONTRACT.md` — формат данных между workflows
- `CORE_NEW/docs/02_DATABASE_SCHEMA.md` — таблицы PostgreSQL
- `Old/n8n_workflows/` — старые рабочие workflows (справочно)

---

## Доступ

```bash
# PostgreSQL
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c 'QUERY'"

# Neo4j
ssh root@45.144.177.128 "docker exec neo4j cypher-shell -a 'bolt+ssc://localhost:7687' -u neo4j -p 'Mi31415926pS' 'QUERY'"

# n8n API (read-only)
curl -s "https://n8n.n8nsrv.ru/api/v1/workflows" -H "X-N8N-API-KEY: eyJ..."
```
