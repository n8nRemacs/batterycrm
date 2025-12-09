# Core_info — Документация Workflows

> Детальное описание каждого workflow: входы, выходы, ноды, SQL, Redis, Neo4j

**[HOW_TO_DOCUMENT.md](HOW_TO_DOCUMENT.md)** — Инструкция по документированию workflows

---

## Структура

```
Core_info/
├── INDEX.md                              ← этот файл
├── HOW_TO_DOCUMENT.md                    ← инструкция
├── 01_Channel_Layer/
│   └── workflows_info/
│       ├── ELO_In_Telegram.md            ✅
│       ├── ELO_In_WhatsApp.md            ✅
│       ├── ELO_In_Avito.md               ✅
│       ├── ELO_In_VK.md                  ✅
│       ├── ELO_In_MAX.md                 ✅
│       ├── ELO_In_Form.md                ✅
│       ├── ELO_In_Phone.md               ✅
│       ├── ELO_Out_Telegram.md           ✅
│       ├── ELO_Out_WhatsApp.md           ✅
│       ├── ELO_Out_Avito.md              ✅
│       ├── ELO_Out_VK.md                 ✅
│       └── ELO_Out_MAX.md                ✅
├── 02_Input_Contour/
│   └── workflows_info/
│       ├── INPUT_CONTOUR_OVERVIEW.md        ✅
│       ├── ELO_Core_Tenant_Resolver.md      ✅
│       ├── ELO_Core_Queue_Processor.md      ✅
│       ├── ELO_Core_Batch_Debouncer.md      ✅
│       └── ELO_Core_Client_Resolver.md      ✅
├── 03_Core/
│   └── workflows_info/
│       └── (TODO)
├── 04_Graph/
│   └── workflows_info/
│       └── (TODO)
├── 05_Diagnostic_Engine/
│   └── workflows_info/
│       └── (TODO)
└── 06_API/
    └── workflows_info/
        ├── API_Android_Auth.md           ✅
        └── API_Android_Appeals_List.md   ✅
```

---

## Блоки системы

| # | Блок | Описание | Статус |
|---|------|----------|--------|
| 1 | Channel Layer | ELO_In_*, ELO_Out_* | **12/12** |
| 2 | Input Contour | Tenant Resolver, Queue Processor, Debouncer, Client Resolver | **5/5** |
| 3 | Core | Dialog Engine, AI Router | TODO |
| 4 | Graph | Neo4j операции | TODO |
| 5 | Diagnostic Engine | Симптомы, диагнозы | TODO |
| 6 | API | Android API endpoints | 2/27 |

---

## Задокументированные Workflows

### 01_Channel_Layer — ELO_In (7)

| Workflow | Файл | Особенности |
|----------|------|-------------|
| ELO_In_Telegram | [ELO_In_Telegram.md](01_Channel_Layer/workflows_info/ELO_In_Telegram.md) | MCP API, bot_token passthrough |
| ELO_In_WhatsApp | [ELO_In_WhatsApp.md](01_Channel_Layer/workflows_info/ELO_In_WhatsApp.md) | Wappi.pro, phone из chatId |
| ELO_In_Avito | [ELO_In_Avito.md](01_Channel_Layer/workflows_info/ELO_In_Avito.md) | Фильтр системных, ad_id |
| ELO_In_VK | [ELO_In_VK.md](01_Channel_Layer/workflows_info/ELO_In_VK.md) | Confirmation flow, "ok" response |
| ELO_In_MAX | [ELO_In_MAX.md](01_Channel_Layer/workflows_info/ELO_In_MAX.md) | Phone 8→7, sender extraction |
| ELO_In_Form | [ELO_In_Form.md](01_Channel_Layer/workflows_info/ELO_In_Form.md) | **NO Redis**, prefilled model |
| ELO_In_Phone | [ELO_In_Phone.md](01_Channel_Layer/workflows_info/ELO_In_Phone.md) | **NO Redis**, always voice |

### 01_Channel_Layer — ELO_Out (5)

| Workflow | Файл | Особенности |
|----------|------|-------------|
| ELO_Out_Telegram | [ELO_Out_Telegram.md](01_Channel_Layer/workflows_info/ELO_Out_Telegram.md) | Bot token из БД, MCP API |
| ELO_Out_WhatsApp | [ELO_Out_WhatsApp.md](01_Channel_Layer/workflows_info/ELO_Out_WhatsApp.md) | Wappi.pro sync API |
| ELO_Out_Avito | [ELO_Out_Avito.md](01_Channel_Layer/workflows_info/ELO_Out_Avito.md) | OAuth token refresh, Redis cache |
| ELO_Out_VK | [ELO_Out_VK.md](01_Channel_Layer/workflows_info/ELO_Out_VK.md) | random_id обязателен |
| ELO_Out_MAX | [ELO_Out_MAX.md](01_Channel_Layer/workflows_info/ELO_Out_MAX.md) | MAX_API_URL env |

### 02_Input_Contour (5)

| Workflow | Файл | Особенности |
|----------|------|-------------|
| Overview | [INPUT_CONTOUR_OVERVIEW.md](02_Input_Contour/workflows_info/INPUT_CONTOUR_OVERVIEW.md) | Архитектура, Redis ключи, debounce логика |
| ELO_Core_Tenant_Resolver | [ELO_Core_Tenant_Resolver.md](02_Input_Contour/workflows_info/ELO_Core_Tenant_Resolver.md) | Определение tenant по credentials |
| ELO_Core_Queue_Processor | [ELO_Core_Queue_Processor.md](02_Input_Contour/workflows_info/ELO_Core_Queue_Processor.md) | POP из очереди, группировка по chat |
| ELO_Core_Batch_Debouncer | [ELO_Core_Batch_Debouncer.md](02_Input_Contour/workflows_info/ELO_Core_Batch_Debouncer.md) | 10s debounce, склейка сообщений |
| ELO_Core_Client_Resolver | [ELO_Core_Client_Resolver.md](02_Input_Contour/workflows_info/ELO_Core_Client_Resolver.md) | Поиск/создание клиента |

### 06_API

| Workflow | Файл | Описание |
|----------|------|----------|
| API_Android_Auth | [API_Android_Auth.md](06_API/workflows_info/API_Android_Auth.md) | Авторизация оператора |
| API_Android_Appeals_List | [API_Android_Appeals_List.md](06_API/workflows_info/API_Android_Appeals_List.md) | Список обращений |

---

## Паттерны ELO_In

| Тип | Workflows | Особенности |
|-----|-----------|-------------|
| **Standard** | Telegram, WhatsApp, VK, MAX, Avito | Redis queue, Tenant Resolver |
| **Direct** | Form, Phone | NO Redis, Client Resolver сразу |

**Standard flow:**
```
Webhook → Extract → Voice? → Normalize → Tenant Resolver → Redis PUSH → Respond
```

**Direct flow:**
```
Webhook → Extract → (Voice?) → Normalize → Tenant Resolver → Client Resolver → Respond
```

---

## Паттерны ELO_Out

**Общий flow:**
```
Execute Trigger → [Get Credentials?] → Send Message → Process Response → Save History → Register Touchpoint
```

| Channel | Credentials | Особенности |
|---------|------------|-------------|
| Telegram | PostgreSQL (tenant_configs) | MCP API |
| WhatsApp | - | Wappi.pro direct |
| Avito | Redis cache + OAuth refresh | Escape text |
| VK | - | random_id required |
| MAX | - | MAX_API_URL env |

---

## Input Contour — Redis Flow

```
IN Workflows (быстрые, ~100ms)
     │
     ▼
┌─────────────────┐
│ Tenant Resolver │  ← определяет tenant
└────────┬────────┘
         ▼
   Redis RPUSH
   queue:incoming
         │
═════════│═════════════ граница IN / Batcher
         ▼
┌─────────────────┐
│ Queue Processor │  ← каждые 5 сек
│  POP × 10       │
└────────┬────────┘
         ▼
   Group by chat_id
         │
     ┌───┴───┐
     ▼       ▼
  Has Lock?  No Lock
     │         │
  Push to    Create lock +
  queue:batch Trigger Debouncer
         │
         ▼
┌─────────────────┐
│ Batch Debouncer │  ← ждёт 10s тишины
│  × 10 копий     │
└────────┬────────┘
         ▼
   Combine messages
         │
         ▼
┌─────────────────┐
│ Client Resolver │  ← find/create client
└────────┬────────┘
═════════│═════════════ граница Input Contour / Core
         ▼
    Appeal Manager
```

**Redis ключи:**
| Ключ | TTL | Назначение |
|------|-----|------------|
| `queue:incoming` | — | Входящая очередь |
| `queue:processor:lock` | 30s | Mutex процессора |
| `lock:batch:{key}` | 300s | Lock обработки чата |
| `queue:batch:{key}` | — | Per-chat очередь |
| `last_seen:{key}` | — | Время последнего сообщения |

---

## Формат документации

Каждый файл содержит:

1. **Общая информация** — триггер, входы/выходы
2. **Входные данные** — JSON формат
3. **Выходные данные** — JSON формат
4. **Ноды** — детальное описание каждой:
   - Тип ноды
   - Назначение
   - **Код** (если Code нода)
   - **SQL запрос** (если Postgres)
   - **Redis операция** (что кладём/забираем)
   - **Neo4j запрос** (что ищем)
5. **Схема потока** — ASCII диаграмма
6. **Зависимости** — credentials, внешние API
7. **Особенности** — специфика канала

---

## Workflows для документирования

### Приоритет 2: Core (из n8n_old → ELO_Core_*)

- [ ] ELO_Core_Appeal_Manager (L2pYPcv7r8j5XFU3)
- [ ] ELO_Core_Client_Creator (vkQwat1iZhJJj7C9)
- [ ] ELO_Core_AI_Router (Flhmu33l0ZhZhr90)
- [ ] ELO_Core_AI_Universal_Worker (×7 копий)
- [ ] ELO_Core_Out_Processor (×6 копий)

### Приоритет 3: API (из n8n_old)

- [ ] API_Android_Appeal_Detail
- [ ] API_Android_Device_Create
- [ ] API_Android_Device_Update
- [ ] API_Android_Send_Promo
- [ ] ... (и другие 20+)

---

## Как добавить новый workflow

1. Прочитать JSON файл workflow
2. Создать `.md` файл в соответствующей папке `workflows_info/`
3. Заполнить по шаблону (см. существующие файлы)
4. Обновить этот INDEX.md
