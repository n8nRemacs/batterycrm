# Eldoleado Project

> Единый файл контекста проекта для Claude и разработчиков

**Последнее обновление:** 2025-12-06

---

## Quick Commands

When user says:
- **"фулл синк" / "full sync" / "обнови KB"** → `python scripts/full_sync.py`
- **"быстрый синк" / "quick sync"** → `python scripts/full_sync.py --quick`
- **"обнови документацию"** → `python scripts/update_flow_docs.py --all`
- **"покажи индекс workflow"** → `python scripts/update_flow_docs.py --index`
- **"stop" / "стоп"** → Kill all background tasks

---

## Project Structure

```
app/                    # Android приложение (Kotlin)
MCP/                    # MCP серверы (Python FastAPI)
  ├── mcp-telegram/
  ├── mcp-whatsapp/
  ├── mcp-avito/
  ├── mcp-vk/
  ├── mcp-max/
  ├── mcp-form/
  ├── api-android/
  └── shared/           # Общий storage модуль
n8n_workflows/          # JSON файлы workflow с n8n сервера (READ-ONLY)
workflows_to_import/    # Для новых/изменённых workflows
supabase/migrations/    # SQL миграции
scripts/                # Python скрипты автоматизации
docs/flows/             # Автогенерируемая документация потоков
Plans/                  # Документы планирования
```

---

## Servers & Services

### RU Server (45.144.177.128)

| Service | Port | Version | Description |
|---------|------|---------|-------------|
| mcp-avito | 8765 | v2.0.0 multi-tenant | Avito Messenger API |
| mcp-vk | 8767 | v2.0.0 multi-tenant | VK Community API |
| mcp-max | 8768 | v2.0.0 multi-tenant | MAX (VK Teams) API |
| mcp-form | 8770 | v1.0.0 | Web forms API |
| api-android | 8780 | - | Android API Gateway |
| Redis (avito-redis) | - | Docker network: avito-api_default |

### Finnish Server (217.145.79.27)

| Service | Port | Version | Description |
|---------|------|---------|-------------|
| mcp-telegram | 8767 | v2.0.0 multi-tenant | Telegram Bot API |
| mcp-whatsapp | 8766 | v2.0.0 multi-tenant | WhatsApp (Wappi.pro) API |
| Redis (mcp-redis) | 6379 | Docker network: mcp-network |

### n8n Server (185.221.214.83)

| Service | Port | Description |
|---------|------|-------------|
| n8n | 5678 | https://n8n.n8nsrv.ru |
| PostgreSQL | 6544 | Main database |

### Multi-tenant Webhook URLs

```
/webhook/telegram/{bot_hash}
/webhook/avito/{user_hash}
/webhook/vk/{group_hash}
/webhook/max/{token_hash}
/webhook/whatsapp/{profile_hash}
```
Hash = SHA256(primary_credential)[:16]

---

## Database

**Connection:** `postgresql://supabase_admin:***@185.221.214.83:6544/postgres`

### Key Tables

| Category | Tables |
|----------|--------|
| Core | tenants, clients, appeals, messages |
| Devices | appeal_devices, repair_categories, issue_types |
| Funnel | funnel_stages, appeal_stage_history |
| Marketing | promo_campaigns, short_links, fingerprints |
| AI | ai_prompts, ai_extraction_queue |
| Knowledge Base | project_components, component_relations, workflow_nodes, channel_accounts |

---

## Project Status

### Production Ready

| Component | Status | Notes |
|-----------|--------|-------|
| mcp-telegram | ✅ v2.0.0 | 1 bot registered |
| mcp-whatsapp | ✅ v2.0.0 | Wappi.pro integration |
| mcp-avito | ✅ v2.0.0 | OAuth + rate limiting |
| mcp-vk | ✅ v2.0.0 | Callback confirmation |
| mcp-max | ✅ v2.0.0 | VK Teams |
| mcp-form | ✅ v1.0.0 | Web forms |
| api-android | ✅ | Android API Gateway |
| Android App | ✅ | Calls, chat, appeals |
| n8n Workflows | ✅ | ~100 workflows |

### In Progress

| Component | Status | What's Left |
|-----------|--------|-------------|
| mcp-docs-rag | 🔄 90% | Apply pgvector migration, index docs |
| mcp-instagram | 🔄 50% | FB Graph API integration |

### TODO (Priority)

1. **BAT IN Telegram** — Activate workflow (MCP ready)
2. **Admin Panel** — Web UI for tenant management
3. **10-20 paying customers** — Proof for investor

---

## Architecture Decisions

### 2025-12-06: Multi-tenant MCP

All MCP channels v2.0.0 use unified storage (Redis + PostgreSQL) with dynamic webhook URLs.
Webhook format: `/webhook/{channel}/{account_hash}` where hash = SHA256[:16] of primary credential.

### 2025-12-06: Two Servers for MCP

- RU server for avito/vk/max/form/android
- Finnish server for telegram/whatsapp (closer to EU APIs)

### 2025-12-05: Separate MCP Servers

Each channel = separate FastAPI server. Isolation, scaling, reusability.

### 2025-12-04: PostgreSQL as Main DB

PostgreSQL + JSONB instead of MongoDB. Relational joins, transactions, pgvector for embeddings.

---

## n8n Rules

**n8n сервер только для ЧТЕНИЯ. НЕ загружать workflows через API.**

- `n8n_workflows/` — READ-ONLY (sync from server)
- `workflows_to_import/` — for NEW and MODIFIED workflows

**When creating/modifying workflow:**
1. Create JSON in `workflows_to_import/`
2. User imports manually via n8n UI
3. Run `python scripts/full_sync.py` to sync

---

## Useful Scripts

| Script | Purpose |
|--------|---------|
| `full_sync.py` | Full KB sync (n8n + components + relations) |
| `trace_flow.py` | Trace execution path through workflows |
| `update_flow_docs.py` | Generate flow documentation |
| `populate_*.py` | Populate KB tables |

### Trace Examples

```bash
# Trace by keyword
python scripts/trace_flow.py "telegram"

# Trace specific workflow
python scripts/trace_flow.py --workflow "BAT IN Telegram"
```

---

## Useful SQL

```sql
-- Find workflows touching a table
SELECT DISTINCT workflow_name FROM workflow_nodes
WHERE details->>'sql' ILIKE '%appeals%';

-- Find workflows by webhook
SELECT name, metadata->>'webhook_path' FROM project_components
WHERE type = 'workflow' AND metadata->>'webhook_path' IS NOT NULL;

-- Component relations
SELECT c2.type, c2.name, r.relation_type
FROM component_relations r
JOIN project_components c2 ON c2.id = r.to_component_id
WHERE r.from_component_id = (SELECT id FROM project_components WHERE name = 'X');
```

---

## Conventions

- Workflow naming: `BAT IN {Channel}` for inbound, `API_Android_{Action}` for API
- All documentation in Russian
- Flow docs have YAML frontmatter for incremental updates

---

## History

### 2025-12-06
- Deployed all MCP servers v2.0.0 multi-tenant to production
- Created shared storage module (Redis + PostgreSQL)
- Created CONTEXT.md, merged into CLAUDE.md

### 2025-12-05
- Created shared storage for MCP servers
- Added channel_accounts table

### 2025-12-04
- Created KB structure (project_components, component_relations)
- Created automation scripts
