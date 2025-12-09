# Eldoleado Project — CORE_NEW

> Единый файл контекста проекта для Claude и разработчиков

**Последнее обновление:** 2025-12-09

---

## Quick Commands

When user says:
- **"обнови контекст"** → `python scripts/update_core_context.py`
- **"stop" / "стоп"** → Kill all background tasks

---

## CORE_NEW — Новая архитектура

### Философия: "Люди общаются. Машина ведёт учёт."

```
Старый подход:  Клиент → Заявки → Устройства → Проблемы (50 таблиц)
Новый подход:   Клиент → Диалоги (с контекстом внутри) (13 таблиц)
```

- Человеку — естественное общение в мессенджерах
- Машине — рутина, учёт, таблицы (AI под капотом)
- БЕЗ канбанов, БЕЗ заполнения форм

---

## Documentation Index

| Category | Path | Description |
|----------|------|-------------|
| **CORE_NEW** | `CORE_NEW/docs/` | Документация новой архитектуры |
| **Context** | `CORE_NEW/CONTEXT.md` | Быстрый обзор состояния проекта |
| **Old** | `Old/docs/` | Старая документация (архив) |
| **Plans** | `Plans/` | Бизнес-планы и требования |

### Key Documents (CORE_NEW)

| Document | Description |
|----------|-------------|
| `CORE_NEW/CONTEXT.md` | Quick Stats + состояние проекта |
| `CORE_NEW/docs/00_VISION.md` | Видение продукта |
| `CORE_NEW/docs/01_CORE_DESIGN.md` | Архитектура ядра, глоссарий |
| `CORE_NEW/docs/02_DATABASE_SCHEMA.md` | PostgreSQL: 13 elo_* таблиц |
| `CORE_NEW/docs/03_NEO4J_SCHEMA.md` | Neo4j: Client, Device, Problem |
| `CORE_NEW/docs/04_API_CONTRACTS.md` | API v2 контракты |
| `CORE_NEW/docs/05_AI_ARCHITECTURE.md` | AI: 7 уровней, Prompt-in-Request |

---

## Project Structure

```
CORE_NEW/               # Новая архитектура (АКТИВНАЯ)
  ├── docs/             # Документация
  ├── CONTEXT.md        # Состояние проекта
  └── migrations/       # SQL миграции (TODO)

app/                    # Android приложение (Kotlin)
MCP/                    # MCP серверы (Python FastAPI)
  ├── mcp-telegram/
  ├── mcp-whatsapp/
  ├── mcp-avito/
  ├── mcp-vk/
  ├── mcp-max/
  ├── mcp-form/
  ├── api-android/
  └── shared/

scripts/                # Скрипты автоматизации
Plans/                  # Документы планирования

Old/                    # Старая архитектура (АРХИВ)
  ├── docs/             # Старая документация
  ├── database/         # Старые миграции
  ├── n8n_workflows/    # Старые workflows
  ├── scripts/          # Старые скрипты синхронизации
  └── KNOWLEDGE_BASE.md # Старая база знаний
```

---

## Servers & Services

### RU Server (45.144.177.128)

| Service | Port | Description |
|---------|------|-------------|
| mcp-avito | 8765 | Avito Messenger API |
| mcp-vk | 8767 | VK Community API |
| mcp-max | 8768 | MAX (VK Teams) API |
| mcp-form | 8770 | Web forms API |
| api-android | 8780 | Android API Gateway |
| Neo4j | 7474/7687 | Graph database |
| Redis | 6379 | Cache |

### Finnish Server (217.145.79.27)

| Service | Port | Description |
|---------|------|-------------|
| mcp-telegram | 8767 | Telegram Bot API |
| mcp-whatsapp | 8766 | WhatsApp (Wappi.pro) |

### n8n Server (185.221.214.83)

| Service | Port | Description |
|---------|------|-------------|
| n8n | 5678 | https://n8n.n8nsrv.ru |
| PostgreSQL | 6544 | Main database |
| Redis | 6379 | n8n cache |

---

## Database

**Connection:** `postgresql://supabase_admin:***@185.221.214.83:6544/postgres`

### CORE_NEW Tables (elo_*)

| Category | Tables |
|----------|--------|
| Ядро (5) | elo_tenants, elo_clients, elo_dialogs, elo_events, elo_operators |
| Справочники (3) | elo_verticals, elo_tenant_verticals, elo_price_list |
| AI (2) | elo_ai_extractions, elo_ai_suggestions |
| Каналы (1) | elo_channel_accounts |
| Задачи (2) | elo_tasks, elo_task_updates |

**Всего: 13 таблиц с префиксом elo_**

---

## AI Architecture (7 уровней)

```
┌─────────────────────────────────────────────────────────┐
│  7. MCP Channels (Telegram, WhatsApp, Avito, VK, MAX)   │
├─────────────────────────────────────────────────────────┤
│  6. Response Builder (форматирование под канал)         │
├─────────────────────────────────────────────────────────┤
│  5. Dialog Engine (обработка сообщений, граф)           │
├─────────────────────────────────────────────────────────┤
│  4. Universal Tools (воркеры с промптами)               │
├─────────────────────────────────────────────────────────┤
│  3. Universal Orchestrator (слепой исполнитель)         │
├─────────────────────────────────────────────────────────┤
│  2. Request Builder (правила → AI → правила)            │
├─────────────────────────────────────────────────────────┤
│  1. Context Builder (PostgreSQL + Neo4j)                │
└─────────────────────────────────────────────────────────┘
```

### Ключевые концепции

| Концепция | Описание |
|-----------|----------|
| **Prompt-in-Request** | Промпты передаются в запросе, не хардкодятся |
| **Кнут-Пряник-Кнут** | Правила → AI-свобода → Валидация |
| **ai_freedom_level** | 0-100, регулятор жёсткости AI |
| **Dialog-centric** | Диалог — центральная сущность, не заявка |

---

## Scripts

| Script | Purpose |
|--------|---------|
| `update_core_context.py` | Обновить CORE_NEW/CONTEXT.md |
| `test_connections.py` | Проверить подключения к серверам |
| `n8n_manager.py` | Управление n8n workflows |

---

## Conventions

- **Таблицы CORE_NEW:** префикс `elo_`
- **Neo4j лейблы:** без префикса (Client, Device, Problem)
- **Workflows CORE_NEW:** префикс `ELO_` (TODO)
- Документация на русском

---

## Session Workflow

**При старте:**
1. `git pull`
2. Прочитать `Start.md`
3. Прочитать `CORE_NEW/CONTEXT.md`

**При завершении:**
1. Обновить `Start.md`
2. `python scripts/update_core_context.py`
3. `git add -A && git commit && git push`

---

## History

### 2025-12-09
- Создана система CORE_NEW (13 таблиц вместо 50)
- Создана AI архитектура (7 уровней)
- Перенесена старая архитектура в Old/
- Создан CORE_NEW/CONTEXT.md
- Создан scripts/update_core_context.py

### 2025-12-07
- Fixed BAT Batch Debouncer
- Created Redis debug guide

### 2025-12-06
- Deployed all MCP servers v2.0.0 multi-tenant
