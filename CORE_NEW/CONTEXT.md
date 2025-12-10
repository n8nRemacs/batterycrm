# CORE_NEW — Контекст разработки

*Последнее обновление: 2025-12-09 22:45 (UTC+4)*

> Этот файл — единый источник правды о состоянии CORE_NEW.
> Обновляется при каждом коммите/закрытии сессии.

---

## Quick Stats

| Категория | Количество | Статус |
|-----------|------------|--------|
| PostgreSQL таблицы (elo_*) | 14 | ✅ Созданы |
| Neo4j лейблы (ELO_*) | 3 | ✅ Созданы |
| API v2 эндпоинты | 19 | ✅ Описаны |
| n8n workflows (ELO_*) | 0 | TODO |
| MCP серверы | 10 | v2.0.0 |
---

## Архитектура

### 7 уровней AI системы

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
| **Tasks в PostgreSQL** | Задачи — CRUD, не граф |

---

## PostgreSQL: 13 таблиц (elo_*)

### Ядро (5)

| Таблица | Описание | Ключевые поля |
|---------|----------|---------------|
| `elo_tenants` | Тенанты | settings (JSONB), plan, max_operators |
| `elo_clients` | Клиенты | phone, telegram_id, profile (JSONB), stats (JSONB) |
| `elo_dialogs` | Диалоги | channel, status, context (JSONB), assigned_operator_id |
| `elo_events` | События | event_type, data (JSONB), actor_type |
| `elo_operators` | Операторы | role, fcm_tokens (JSONB), settings (JSONB) |

### Справочники (3)

| Таблица | Описание |
|---------|----------|
| `elo_verticals` | Вертикали бизнеса (phone_repair, auto_service) |
| `elo_tenant_verticals` | Привязка тенанта к вертикали |
| `elo_price_list` | Прайс-лист услуг |

### AI (2)

| Таблица | Описание |
|---------|----------|
| `elo_ai_extractions` | Извлечения AI (intent, device, issue) |
| `elo_ai_suggestions` | Подсказки AI (ответы, действия) |

### Каналы (1)

| Таблица | Описание |
|---------|----------|
| `elo_channel_accounts` | Аккаунты каналов (webhook_hash, credentials) |

### Задачи (2)

| Таблица | Описание |
|---------|----------|
| `elo_tasks` | Задачи сотрудников |
| `elo_task_updates` | История обновлений задач |

---

## Neo4j: 5 лейблов (ELO_*)

| Лейбл | Описание | Связи |
|-------|----------|-------|
| `ELO_Client` | Клиент | HAS_DIALOG, FAMILY, REFERRED |
| `ELO_Dialog` | Диалог | ABOUT_DEVICE, HAS_ISSUE |
| `ELO_Device` | Устройство | — |
| `ELO_Problem` | Проблема | — |
| `ELO_Fact` | Факт о клиенте | — |

---

## API v2 Endpoints

### Dialogs

| Method | Endpoint | Описание |
|--------|----------|----------|
| GET | `/v2/dialogs` | Список диалогов |
| GET | `/v2/dialogs/{id}` | Детали диалога |
| POST | `/v2/dialogs` | Создать диалог |
| PATCH | `/v2/dialogs/{id}` | Обновить диалог |
| POST | `/v2/dialogs/{id}/messages` | Отправить сообщение |

### AI

| Method | Endpoint | Описание |
|--------|----------|----------|
| GET | `/v2/dialogs/{id}/suggestions` | AI подсказки |
| POST | `/v2/dialogs/{id}/extract` | Запустить AI извлечение |

### Events

| Method | Endpoint | Описание |
|--------|----------|----------|
| GET | `/v2/dialogs/{id}/events` | Timeline событий |
| GET | `/v2/clients/{id}/events` | События клиента |

### Tasks

| Method | Endpoint | Описание |
|--------|----------|----------|
| GET | `/v2/tasks` | Список задач |
| POST | `/v2/tasks` | Создать задачу |
| PATCH | `/v2/tasks/{id}` | Обновить задачу |

---

## n8n Workflows (CORE_NEW)

> TODO: Создать workflows для новой архитектуры

| ID | Название | Webhook | Статус |
|----|----------|---------|--------|
| — | ELO_IN_Telegram | `/elo/telegram` | TODO |
| — | ELO_IN_WhatsApp | `/elo/whatsapp` | TODO |
| — | ELO_Dialog_Engine | — | TODO |
| — | ELO_Context_Builder | `/elo/context` | TODO |
| — | ELO_AI_Orchestrator | — | TODO |

---

## MCP Серверы

| Сервер | Порт | Сервер | Статус |
|--------|------|--------|--------|
| mcp-telegram | 8767 | 217.145.79.27 (FI) | v2.0.0 multi-tenant |
| mcp-whatsapp | 8766 | 217.145.79.27 (FI) | v2.0.0 multi-tenant |
| mcp-avito | 8765 | 45.144.177.128 (RU) | v2.0.0 multi-tenant |
| mcp-vk | 8767 | 45.144.177.128 (RU) | v2.0.0 multi-tenant |
| mcp-max | 8768 | 45.144.177.128 (RU) | v2.0.0 multi-tenant |
| mcp-form | 8770 | 45.144.177.128 (RU) | v1.0.0 |
| api-android | 8780 | 45.144.177.128 (RU) | Gateway |

---

## Файлы документации

| Файл | Описание | Статус |
|------|----------|--------|
| [00_VISION.md](docs/00_VISION.md) | Видение продукта | ✅ |
| [01_CORE_DESIGN.md](docs/01_CORE_DESIGN.md) | Архитектура ядра, глоссарий | ✅ |
| [02_DATABASE_SCHEMA.md](docs/02_DATABASE_SCHEMA.md) | PostgreSQL: 13 таблиц | ✅ |
| [03_NEO4J_SCHEMA.md](docs/03_NEO4J_SCHEMA.md) | Neo4j: 5 лейблов | ✅ |
| [04_API_CONTRACTS.md](docs/04_API_CONTRACTS.md) | API v2 контракты | ✅ |
| [05_AI_ARCHITECTURE.md](docs/05_AI_ARCHITECTURE.md) | AI: 7 уровней | ✅ |

---

## Миграции

| Файл | Описание | Статус |
|------|----------|--------|
| `CORE_NEW/migrations/001_elo_tables.sql` | Все 13 таблиц | TODO |

---

## Связи компонентов

```
MCP Channels ──webhook──> n8n Workflows
                              │
                              ▼
                    ┌─────────────────┐
                    │ Dialog Engine   │
                    │ (n8n workflow)  │
                    └────────┬────────┘
                             │
              ┌──────────────┼──────────────┐
              ▼              ▼              ▼
        PostgreSQL        Neo4j        AI Workers
        (elo_*)          (ELO_*)      (Universal)
```

---

## Чеклист перед коммитом

- [ ] Обновить этот файл (CONTEXT.md)
- [ ] Обновить Start.md
- [ ] Запустить `python scripts/update_core_context.py` (когда будет готов)
- [ ] git add && git commit && git push

---

## История изменений

| Дата | Изменение |
|------|-----------|
| 2025-12-09 | Создан CONTEXT.md |
| 2025-12-09 | Добавлены таблицы elo_tasks, elo_task_updates |
| 2025-12-09 | Создана AI архитектура (7 уровней) |
| 2025-12-09 | Создана схема PostgreSQL (13 таблиц) |
| 2025-12-09 | Создана схема Neo4j (5 лейблов) |
