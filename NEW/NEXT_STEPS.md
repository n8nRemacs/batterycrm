# Следующие шаги проектирования ELO

> **Последнее обновление:** 10 декабря 2025, 01:45 (UTC+4)
> **Статус:** Документирование OLD архитектуры

---

## Согласованный подход к разработке

```
1. Проработать все блоки (понять что ЕСТЬ в OLD архитектуре)
   ├── Channel Layer ✅ DONE (12/12)
   ├── Input Contour ✅ DONE (5/5)
   ├── Core 🔄 РАЗОБРАН (не документирован)
   ├── Graph 🔄 НАЧАТ (4 открытых вопроса)
   └── API ⏳ TODO (25+ endpoints)

2. Создать подробную структуру NEW архитектуры (как ДОЛЖНО быть)

3. Спроектировать структуру БД (elo_* таблицы)

4. Создать новые воркеры

5. Дебаг и тестирование
```

**Важно:** Документирование OLD архитектуры (BAT_*) — это НЕ план для NEW архитектуры (ELO_*). Это этап понимания существующей логики перед проектированием новой.

---

## Сессия 10.12.2025 (ночь) — Подробный отчёт

### Что было сделано

#### 1. Создана структура документации

**Папка:** `NEW/Core_info/`

```
NEW/Core_info/
├── INDEX.md                          # Навигация по всем блокам
├── HOW_TO_DOCUMENT.md                # Инструкция документирования
├── 01_Channel_Layer/
│   └── workflows_info/
│       ├── ELO_In_Telegram.md        ✅
│       ├── ELO_In_WhatsApp.md        ✅
│       ├── ELO_In_Avito.md           ✅
│       ├── ELO_In_VK.md              ✅
│       ├── ELO_In_MAX.md             ✅
│       ├── ELO_In_Form.md            ✅
│       ├── ELO_In_Phone.md           ✅
│       ├── ELO_Out_Telegram.md       ✅
│       ├── ELO_Out_WhatsApp.md       ✅
│       ├── ELO_Out_Avito.md          ✅
│       ├── ELO_Out_VK.md             ✅
│       └── ELO_Out_MAX.md            ✅
├── 02_Input_Contour/
│   └── workflows_info/
│       ├── INPUT_CONTOUR_OVERVIEW.md ✅
│       ├── ELO_Core_Tenant_Resolver.md   ✅
│       ├── ELO_Core_Queue_Processor.md   ✅
│       ├── ELO_Core_Batch_Debouncer.md   ✅
│       └── ELO_Core_Client_Resolver.md   ✅
├── 03_Core/
│   └── workflows_info/               # TODO
├── 04_Graph/
│   └── workflows_info/
│       └── GRAPH_OVERVIEW.md         ✅
├── 05_Diagnostic_Engine/
│   └── workflows_info/               # Нет workflows
└── 06_API/
    └── workflows_info/
        ├── API_Android_Auth.md       ✅
        └── API_Android_Appeals_List.md ✅
```

#### 2. Channel Layer — полностью документирован (12/12)

**ELO_In workflows (7 шт):**

| Workflow | Nodes | Паттерн | Особенности |
|----------|-------|---------|-------------|
| ELO_In_Telegram | 12 | Standard | MCP payload, tg_ prefix, Redis queue |
| ELO_In_WhatsApp | 10 | Standard | Wappi.pro, phone from chatId (79991234567@c.us) |
| ELO_In_Avito | 13 | Standard | System filter (author_id===user_id), item_id |
| ELO_In_VK | 15 | Standard | Confirmation flow, response="ok" text |
| ELO_In_MAX | 10 | Standard | Phone normalization (8→7) |
| ELO_In_Form | 5 | **Direct** | NO Redis, prefilled_data.model |
| ELO_In_Phone | 7 | **Direct** | NO Redis, ALWAYS voice |

**Паттерны ELO_In:**
- **Standard (5):** Telegram, WhatsApp, VK, MAX, Avito → Redis queue (async)
- **Direct (2):** Form, Phone → NO Redis (редкие, синхронно)

**ELO_Out workflows (5 шт):**

| Workflow | Nodes | Credentials | Особенности |
|----------|-------|-------------|-------------|
| ELO_Out_Telegram | 8 | SQL tenant_configs | MCP API tg.eldoleado.ru |
| ELO_Out_WhatsApp | 5 | Direct | wappi.pro/api/sync |
| ELO_Out_Avito | 11 | Redis cache (TTL 86400) | OAuth refresh, text escape |
| ELO_Out_VK | 5 | N/A | random_id required |
| ELO_Out_MAX | 5 | N/A | MAX_API_URL env |

**Общий паттерн ELO_Out:**
```
Execute Trigger → [Get Credentials?] → Send → Process → Save History → Register Touchpoint
```

#### 3. Input Contour — полностью документирован (5/5)

**Архитектура потока:**

```
┌─────────────────────────────────────────────────────────────────────────────┐
│  IN Workflows (быстрые, ~100ms)                                             │
│  ┌─────────┐ ┌─────────┐ ┌─────────┐ ┌─────────┐ ┌─────────┐               │
│  │Telegram │ │WhatsApp │ │  Avito  │ │   VK    │ │   MAX   │               │
│  └────┬────┘ └────┬────┘ └────┬────┘ └────┬────┘ └────┬────┘               │
│       │           │           │           │           │                    │
│       └───────────┴─────┬─────┴───────────┴───────────┘                    │
│                         ↓                                                   │
│         ┌───────────────────────────────┐                                  │
│         │  1. ELO_Core_Tenant_Resolver  │  ← определяет tenant             │
│         └───────────────┬───────────────┘                                  │
│                         ↓                                                   │
│         ┌───────────────────────────────┐                                  │
│         │  Redis RPUSH queue:incoming   │  ← быстро и уходят               │
│         └───────────────┬───────────────┘                                  │
└─────────────────────────│──────────────────────────────────────────────────┘
                          ↓
┌─────────────────────────────────────────────────────────────────────────────┐
│  Batcher (медленный, 10s debounce)                                          │
│         ┌───────────────────────────────┐                                   │
│         │  2. ELO_Core_Queue_Processor  │  ← каждые 5 сек                   │
│         │     POP из queue:incoming     │                                   │
│         │     Группировка по chat_id    │                                   │
│         └───────────────┬───────────────┘                                   │
│                         ↓                                                    │
│         ┌───────────────────────────────┐                                   │
│         │  3. ELO_Core_Batch_Debouncer  │  ← ждёт 10s тишины                │
│         │     ×10 копий (параллельно)   │                                   │
│         │     Склеивает сообщения       │                                   │
│         └───────────────┬───────────────┘                                   │
│                         ↓                                                    │
│         ┌───────────────────────────────┐                                   │
│         │  4. ELO_Core_Client_Resolver  │  ← находит/создаёт клиента       │
│         └───────────────┬───────────────┘                                   │
└─────────────────────────│───────────────────────────────────────────────────┘
                          ↓
                    ┌───────────┐
                    │   CORE    │
                    └───────────┘
```

**Redis ключи Input Contour:**

| Ключ | Тип | TTL | Назначение |
|------|-----|-----|------------|
| `queue:incoming` | List | — | Глобальная входящая очередь |
| `queue:processor:lock` | String | short | Mutex для Queue Processor |
| `queue:batch:{channel}:{chat_id}` | List | — | Per-chat очередь сообщений |
| `lock:batch:{channel}:{chat_id}` | String | 300s | Per-chat lock на обработку |
| `last_seen:{channel}:{chat_id}` | String | — | Timestamp последнего сообщения |

**Debounce логика:**
- Ждём **10 секунд тишины** (user confirmed: 20s слишком долго)
- Максимум **300 секунд** ожидания (защита от chatty users)
- После debounce — склеиваем все сообщения в один текст
- Голосовые помечаются `[Голосовое]: {transcription}`

**Документированные workflows:**

1. **ELO_Core_Tenant_Resolver** (rRO6sxLqiCdgvLZz)
   - 7 nodes
   - Маппинг channel → lookup_key (telegram→telegram_bot_token, vk→vk_app_id, etc.)
   - Default tenant UUID: `a0000000-0000-0000-0000-000000000001`

2. **ELO_Core_Queue_Processor** (без ID, Schedule Trigger)
   - Schedule: every 5 seconds
   - 10× параллельный POP (workaround для n8n)
   - Группировка по batch_key = `{channel}:{external_chat_id}`
   - Двухуровневая блокировка (processor + per-chat)

3. **ELO_Core_Batch_Debouncer** (hwYfaLAKCwaWpoQk) ×10 копий
   - Debounce loop: Wait → Check Silence → Ready?
   - Combine Messages: sort by timestamp, join with `\n\n`
   - TODO: per-tenant debounce setting в elo_tenants

4. **ELO_Core_Client_Resolver** (без ID)
   - Find Client SQL с JOIN client_merges
   - Поиск по phone/telegram_id/vk_id/whatsapp_id/avito_id
   - Client Exists? → Merge / Execute Client Creator
   - → Execute Appeal Manager (граница с Core)

#### 4. Core — разобран, НЕ документирован

**Прочитанные workflows:**

| Workflow | ID | Назначение |
|----------|-----|------------|
| BAT_Appeal_Manager | L2pYPcv7r8j5XFU3 | Точка входа в Core |
| BAT_AI_Appeal_Router | Flhmu33l0ZhZhr90 | AI мозг, маршрутизация |
| BAT_AI_Task_Dispatcher | aEzuOXgpLBTNZ4ie | Диспетчер AI задач |
| BAT_AI_Universal_Worker | CDHwzDiXqh3t0Iam | AI воркер (×7 копий) |
| BAT_Client_Creator | vkQwat1iZhJJj7C9 | Создание клиента |

**Структура Core (понята, не документирована):**

```
Client Resolver
      ↓
┌─────────────────────────────────────────────────────────────────┐
│  ELO_Core_Appeal_Manager (L2pYPcv7r8j5XFU3)                     │
│    • Find Active Appeal (7 дней, не завершён)                   │
│    • Create New Appeal (если нет)                               │
│    • Save Message History                                       │
│    • Register Touchpoint (Neo4j webhook)                        │
│    → Execute AI Router                                          │
└─────────────────────────────────────────────────────────────────┘
                              ↓
┌─────────────────────────────────────────────────────────────────┐
│  ELO_Core_AI_Router (Flhmu33l0ZhZhr90)                          │
│    • Load Appeal & Devices (SQL + history + devices)            │
│    • Load Fields Config (context_fields_config)                 │
│    • Prepare Context (focus, disambiguation, completeness %)    │
│    • Needs Extraction? → Task Dispatcher                        │
│    • Call Graph Matcher (Neo4j webhook)                         │
│    • AI Response Generator (OpenAI)                             │
│    • Route by Completeness (full/partial/minimal)               │
│    • Update Appeal Data (SQL)                                   │
│    • Route By Mode:                                             │
│        - auto → Call Client Response Sender                     │
│        - assist → Call Operator Notifier                        │
└─────────────────────────────────────────────────────────────────┘
```

**operation_mode:**
- **auto** — AI отвечает клиенту напрямую
- **assist** — AI готовит ответ, оператор подтверждает

**Решено:** Core отложен до проработки остальных блоков. Это центральный блок, его нужно адаптировать под все остальные.

#### 5. Graph — начат, есть открытые вопросы

**Прочитанные workflows (5 шт):**

| Workflow | ID | Webhook |
|----------|-----|---------|
| BAT_Neo4j_Context_Builder | gF8hYMVuCRqCkw83 | /neo4j/context |
| BAT_Neo4j_CRUD | gtm1CfLF557Ta40P | /neo4j/crud |
| BAT_Neo4j_Sync | Jqu7d7yWOjyxm80x | /neo4j/sync |
| BAT_Neo4j_Touchpoint_Register | TrCjdgREvPAB2yyL | /neo4j/touchpoint/register |
| BAT_Neo4j_Touchpoint_Tracker | tKHYEwn1AR18UrDS | /neo4j/touchpoint |

**Neo4j Schema (из анализа):**

```
Node Types:
- Client (id, phone, name)
- Device (id, brand, model, owner_label)
- Problem (id, type, status)
- ProblemType (code)
- Channel (type, identifier, verified)
- Vertical (type)
- Touchpoint (id, timestamp, type, channel, direction)

Edge Types:
- Client -[:OWNS]-> Device
- Device -[:HAS_PROBLEM]-> Problem
- Problem -[:OF_TYPE]-> ProblemType
- Client -[:HAS_CHANNEL]-> Channel
- Client -[:CUSTOMER_OF]-> Vertical
- Touchpoint -[:FROM]-> Client (inbound)
- Touchpoint -[:TO]-> Client (outbound)
- Touchpoint -[:ABOUT_DEVICE]-> Device
- Touchpoint -[:ABOUT_PROBLEM]-> Problem
- Touchpoint -[:IN_VERTICAL]-> Vertical
```

**Создан:** `04_Graph/workflows_info/GRAPH_OVERVIEW.md`

---

## ОТКРЫТЫЕ ВОПРОСЫ ПО GRAPH (на утро!)

### 1. Register vs Tracker — дублирование или разные сценарии?

**Touchpoint Register** (`/webhook/neo4j/touchpoint/register`):
```
Входные данные:
- client_id (required)
- appeal_id
- channel
- direction: inbound | outbound | mutual
- type: message | call | visit | promo | form
- is_new_client
- vertical_id
- tenant_id

Что делает:
1. Создаёт Touchpoint node в Neo4j
2. Связь с Client: FROM (inbound), TO (outbound), или ОБЕ (mutual)
3. Связь с Vertical если указан
4. Сохраняет в PostgreSQL таблицу touchpoints
```

**Touchpoint Tracker** (`/webhook/neo4j/touchpoint`):
```
Входные данные:
- client_id (required)
- message_id
- channel
- direction: inbound | outbound (БЕЗ mutual!)
- type
- mentioned_device_id    ← дополнительно
- mentioned_problem_id   ← дополнительно
- confidence (0-1)       ← дополнительно
- explicit (bool)        ← дополнительно

Что делает:
1. Создаёт Touchpoint node в Neo4j
2. Связь с Client: FROM или TO
3. Связь ABOUT_DEVICE (если упомянуто устройство)
4. Связь ABOUT_PROBLEM (если упомянута проблема)
5. НЕ сохраняет в PostgreSQL!
```

**Сравнение:**

| Аспект | Register | Tracker |
|--------|----------|---------|
| PostgreSQL | ✅ Да | ❌ Нет |
| mutual direction | ✅ Да | ❌ Нет |
| ABOUT_DEVICE | ❌ Нет | ✅ Да |
| ABOUT_PROBLEM | ❌ Нет | ✅ Да |
| confidence | ❌ Нет | ✅ Да |

**Гипотеза:**
- Register = регистрация факта контакта (для воронки, аналитики)
- Tracker = трекинг что обсуждали (для AI контекста)

**Вопрос:** Это верно? Или они должны работать вместе? Или это дублирование которое нужно объединить?

### 2. Direction — кто определяет inbound/outbound/mutual?

В коде Touchpoint Register есть комментарий:
```javascript
// Логика определения direction:
// - is_new_client && нет телефона в базе → inbound
// - is_new_client && есть телефон в базе → mutual
// - промо/рассылка → outbound
// - диалог (есть inbound + был ответ + клиент написал) → mutual
```

Но это только комментарий, не код!

**Вопрос:** Кто реально определяет direction?
- Вызывающий workflow передаёт готовое значение?
- Или Graph должен сам определять по логике?

### 3. enrichment_paths — что это за таблица?

В Context Builder есть action `enrichment_suggestion`:
```javascript
// Запрос к PostgreSQL
SELECT * FROM enrichment_paths WHERE enabled = true ORDER BY priority DESC, conversion_rate DESC

// Логика
const suggestions = enrichmentPaths
  .filter(path => {
    const hasFrom = existingTypes.has(path.from_channel_type);
    const needsTo = !existingTypes.has(path.to_channel_type);
    return hasFrom && needsTo;
  })
  .slice(0, 3);
```

**Вопрос:** Что это за таблица? Структура? Пути конверсии типа "telegram → собрать phone"?

### 4. Когда какой touchpoint вызывать?

**Вопрос:**
- Register → для всех входящих/исходящих сообщений?
- Tracker → только когда AI определил упоминание устройства в тексте?

---

## Предыдущий контекст (из прошлых сессий)

### Глобальная схема (`GLOBAL_SCHEMA.md`)

- **Принципы:**
  - Все таблицы реляционные (никакого хардкода, только FK)
  - Гибридные ID: INT для справочников, UUID для сущностей
  - Минимальный пакет между блоками: `{tenant_id, dialog_id}`

- **Иерархия:** Домен → Вертикаль (один домен на тенанта для MVP)

- **Справочники (7):**
  - elo_domains, elo_verticals, elo_channels
  - elo_dialog_statuses, elo_message_types, elo_directions
  - elo_operator_types

- **Основные сущности (5):**
  - elo_tenants, elo_operators, elo_clients
  - elo_dialogs, elo_messages

- **Связующие:**
  - elo_tenant_verticals, elo_dialog_verticals
  - elo_channel_accounts, elo_client_channels

- **Контракты данных:**
  - Internal: `{tenant_id, dialog_id}`
  - External (API → App): развёрнутый объект

### 6 блоков системы

| # | Блок | Статус | Документов |
|---|------|--------|------------|
| 1 | Channel Layer (IN/OUT) | ✅ DONE | 12/12 |
| 2 | Billing | ⏳ TODO | — |
| 3 | Input Contour | ✅ DONE | 5/5 |
| 4 | Core | 🔄 Разобран | 0 |
| 5 | Graph (Neo4j) | 🔄 Начат | 1 + вопросы |
| 6 | Diagnostic Engine | ❓ Нет workflows | 0 |
| — | API | 🔄 Начат | 2/27 |

---

## Naming convention

- **BAT** prefix = BattCRM (старое название проекта)
- **ELO** prefix = Eldoleado (новое название)
- Channel Layer (ELO_In_*, ELO_Out_*) уже переименован
- Input Contour документация использует ELO_Core_* (хотя JSON ещё BAT_*)
- Core workflows (BAT_Appeal_Manager, etc.) ещё не переименованы
- `n8n_old/` — папка со всеми OLD BAT_* workflows
- `ELO_Core/` — папка для NEW ELO_Core_* workflows (пока пустая)

---

## Структура папок (актуальная)

```
NEW/
├── GLOBAL_SCHEMA.md              # Общая схема (таблицы, контракты)
├── NEXT_STEPS.md                 # Этот файл
├── Core_info/                    # Документация по блокам
│   ├── INDEX.md                  # Навигация
│   ├── HOW_TO_DOCUMENT.md        # Инструкция
│   ├── 01_Channel_Layer/         # ✅ 12/12
│   ├── 02_Input_Contour/         # ✅ 5/5
│   ├── 03_Core/                  # TODO
│   ├── 04_Graph/                 # 🔄 1 + вопросы
│   ├── 05_Diagnostic_Engine/     # Нет workflows
│   └── 06_API/                   # 🔄 2/27
└── workflows/
    ├── ELO_InOut/                # Новые ELO_In/Out
    │   ├── ELO_In/               # 7 workflows
    │   └── ELO_Out/              # 5 workflows
    └── n8n_old/                  # Старые BAT_* workflows
        ├── API/                  # 27 workflows
        ├── Core/                 # ~20 workflows
        ├── In/                   # 7 workflows
        ├── Out/                  # 5 workflows
        ├── TaskWork/             # Debouncer×10, Worker×7, OutProcessor×6
        └── Tool/                 # AI tools
```

---

## План следующей сессии (утро 10.12.2025)

### 1. Разобрать вопросы по Graph

По порядку:
1. Register vs Tracker
2. Direction логика
3. enrichment_paths таблица
4. Когда какой touchpoint

### 2. Документировать Graph (5 workflows)

После ответов на вопросы:
- ELO_Graph_Context_Builder.md
- ELO_Graph_CRUD.md
- ELO_Graph_Sync.md
- ELO_Graph_Touchpoint_Register.md
- ELO_Graph_Touchpoint_Tracker.md

### 3. Документировать API (25+ workflows)

После Graph — документировать Android API и Operator API.

### 4. Вернуться к Core

После понимания всех блоков — документировать Core как центральный элемент.

---

## Quick Reference

### Redis ключи (все блоки)

**Input Contour:**
- `queue:incoming` — глобальная входящая очередь
- `queue:processor:lock` — mutex для Queue Processor
- `queue:batch:{key}` — per-chat очередь
- `lock:batch:{key}` — per-chat lock (TTL 300s)
- `last_seen:{key}` — timestamp

**Core:**
- `ai_extraction_queue` — очередь задач для AI Workers
- `batch:{id}:status` — статус батча извлечения (TTL 300s)

**Channel Layer (Avito):**
- `avito_access_token` — OAuth token (TTL 86400s)

### Webhooks (Neo4j)

| Webhook | Назначение |
|---------|------------|
| POST /webhook/neo4j/context | AI контекст (get_context, disambiguation, match_entities, enrichment) |
| POST /webhook/neo4j/crud | CRUD операции |
| POST /webhook/neo4j/sync | PostgreSQL → Neo4j синхронизация |
| POST /webhook/neo4j/touchpoint/register | Регистрация касания |
| POST /webhook/neo4j/touchpoint | Трекинг упоминаний |

### Ключевые ID workflows

| Workflow | ID |
|----------|-----|
| Tenant Resolver | rRO6sxLqiCdgvLZz |
| Batch Debouncer | hwYfaLAKCwaWpoQk |
| Client Creator | vkQwat1iZhJJj7C9 |
| Appeal Manager | L2pYPcv7r8j5XFU3 |
| AI Router | Flhmu33l0ZhZhr90 |
| Task Dispatcher | aEzuOXgpLBTNZ4ie |
| AI Worker | CDHwzDiXqh3t0Iam |
| Client Response Sender | Gxd1gIKgk8HxuOya |
| Operator Notifier | GUeLgLcNnawYfpf9 |
| Context Builder | gF8hYMVuCRqCkw83 |
| Neo4j CRUD | gtm1CfLF557Ta40P |
| Neo4j Sync | Jqu7d7yWOjyxm80x |
| Touchpoint Register | TrCjdgREvPAB2yyL |
| Touchpoint Tracker | tKHYEwn1AR18UrDS |
