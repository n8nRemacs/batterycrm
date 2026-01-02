# Start Session - 2026-01-02

## Текущий статус: 4-Level Context Extraction System

SQL миграция выполнена, workflows созданы. Требуется импорт в n8n и настройка Neo4j.

---

## СЛЕДУЮЩИЕ ШАГИ

### 1. Импорт Workflows в n8n (вручную)

Открыть https://n8n.n8nsrv.ru и импортировать:

| Workflow | Файл |
|----------|------|
| ELO_AI_Extract_v2 | `NEW/workflows/AI Contour/ELO_AI_Extract_v2.json` |
| ELO_Funnel_Controller | `NEW/workflows/AI Contour/ELO_Funnel_Controller.json` |
| ELO_Context_Router | `NEW/workflows/AI Contour/ELO_Context_Router.json` |
| ELO_Worker_Executor | `NEW/workflows/AI Contour/ELO_Worker_Executor.json` |

### 2. Neo4j Enterprise

Создать 3 базы данных:
- `electronics`
- `auto`
- `software`

### 3. ELO_Graph_Sync Workflow

Создать workflow для синхронизации PostgreSQL → Neo4j

### 4. REST API Endpoints

Добавить в api-android:
- `/api/admin/domains` - управление доменами
- `/api/admin/context-types` - управление типами контекста
- `/api/admin/verticals` - управление вертикалями

### 5. Тестовый тенант

Создать тенанта и подключить:
- domain: electronics
- vertical: repair

---

## Архитектура системы

```
Global (elo_)
    │
    ├── elo_context_types: greeting, goodbye, sentiment, urgency
    ├── elo_intent_types: question, complaint, thanks
    │
    ▼
Domain (elo_d_)
    │
    ├── electronics → device, owner
    ├── auto → vehicle, owner
    ├── software → product, company
    │
    ▼
Vertical (elo_v_)
    │
    ├── repair → symptom, warranty, complaint
    ├── sales → price_expectation, condition
    │
    ▼
Tenant (elo_t_)
    │
    ├── tenant_domains - подключенные домены
    ├── tenant_verticals - подключенные вертикали
    └── context_type_overrides - переопределения
```

---

## Документация

| Файл | Описание |
|------|----------|
| `NEW/DOCS/CONTEXT_EXTRACTION_ARCHITECTURE.md` | Архитектура системы |
| `C:\Users\ELOnout\.claude\plans\polished-foraging-lobster.md` | Детальный план |
| `Stop.md` | Детали последней сессии |

---

## Проверка БД

```bash
# Домены
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c 'SELECT code, name FROM elo_domains;'"

# Action types
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c 'SELECT code, category FROM elo_action_types;'"

# Funnel stages
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c 'SELECT code, stage_type FROM elo_funnel_stages;'"
```

---

## Инфраструктура

| Сервер | IP | Сервисы |
|--------|-----|---------|
| **Messenger** | 155.212.221.189 | mcp-* :876x, api-android :8780 |
| **n8n** | 185.221.214.83 | n8n :5678, PostgreSQL :6544 |

---

## SSH

```bash
ssh root@155.212.221.189  # Messenger
ssh root@185.221.214.83   # n8n / PostgreSQL
```

---

## Workflows созданные

| Workflow | Endpoint | Описание |
|----------|----------|----------|
| ELO_AI_Extract_v2 | `/webhook/elo-ai-extract-v2` | 4-level extraction |
| ELO_Funnel_Controller | `/webhook/elo-funnel-controller` | Stage transitions |
| ELO_Context_Router | `/webhook/elo-context-router` | Routing |
| ELO_Worker_Executor | `/webhook/elo-worker-executor` | Workers |

---

*Последнее обновление: 2026-01-02*
