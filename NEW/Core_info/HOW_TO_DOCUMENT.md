# Как документировать Workflows

> Инструкция по созданию документации для n8n workflows

---

## Процесс документирования

### 1. Прочитать JSON workflow

```bash
# Найти файл
NEW/workflows/ELO_In/ELO_In_Telegram.json
NEW/workflows/ELO_Out/ELO_Out_Telegram.json
NEW/workflows/n8n_old/API/API_Android_Auth.json
```

### 2. Извлечь ключевую информацию

Из JSON нужно получить:

| Что | Где в JSON |
|-----|------------|
| Название | `name` |
| Ноды | `nodes[]` |
| Связи | `connections` |
| Триггер | Первая нода (webhook/executeWorkflowTrigger) |

### 3. Создать markdown файл

**Путь:** `Core_info/{BLOCK}/workflows_info/{WORKFLOW_NAME}.md`

**Блоки:**
- `01_Channel_Layer` — ELO_In_*, ELO_Out_*
- `02_Input_Contour` — Tenant/Client/Dialog Resolver, Batcher
- `03_Core` — Dialog Engine, AI Router
- `04_Graph` — Neo4j операции
- `05_Diagnostic_Engine` — Симптомы, диагнозы
- `06_API` — API_Android_*

---

## Шаблон документации

```markdown
# {Workflow Name}

> Краткое описание (1 строка)

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Файл** | `путь/к/файлу.json` |
| **Триггер** | Webhook POST `/path` или Execute Workflow Trigger |
| **Вызывается из** | Откуда вызывается |
| **Вызывает** | Какие другие workflows вызывает |
| **Выход** | Куда отправляет результат |

---

## Назначение

2-3 предложения о том, что делает workflow.

---

## Входные данные

**Источник:** откуда приходят данные

\```json
{
  "field": "value"
}
\```

---

## Выходные данные

**Куда:** куда отправляются

\```json
{
  "field": "value"
}
\```

---

## Ноды

### 1. {Node Name}

| Параметр | Значение |
|----------|----------|
| **ID** | `uuid из json` |
| **Тип** | n8n-nodes-base.xxx |

**Описание:** что делает нода

---

## Схема потока

\```
Node1 → Node2 → Node3
            ├── YES → Node4
            └── NO → Node5
\```

---

## Особенности

| Особенность | Описание |
|-------------|----------|
| **Ключевая особенность** | Объяснение |

---

## Зависимости

| Тип | ID | Назначение |
|-----|-----|------------|
| Workflow | uuid | Название |
| Redis | uuid | Для чего |
| Postgres | uuid | БД |
```

---

## Что документировать в нодах

### Code Node

**Обязательно включить:**
- Полный код (или ключевые части если очень длинный)
- Что делает логика
- Какие поля извлекает/преобразует

```markdown
**Код:**
\```javascript
const data = $input.first().json;
// ... код
return { field: value };
\```
```

### PostgreSQL Node

**Обязательно включить:**
- Полный SQL запрос
- Какие таблицы использует
- Что возвращает

```markdown
**SQL запрос:**
\```sql
SELECT * FROM table WHERE id = '{{ $json.id }}'
\```

**Таблица:** `table_name`
```

### Redis Node

**Обязательно включить:**
- Операция (GET/SET/PUSH/POP)
- Ключ
- TTL (если SET)
- Кто кладёт / кто забирает

```markdown
**Redis:**
| Операция | Key | TTL | Назначение |
|----------|-----|-----|------------|
| SET | `avito_access_token` | 86400s | Кэш OAuth токена |
| RPUSH | `queue:incoming` | — | Очередь сообщений |
```

### HTTP Request Node

**Обязательно включить:**
- URL
- Method
- Headers (важные)
- Body формат

```markdown
**HTTP Request:**
| Параметр | Значение |
|----------|----------|
| **URL** | `https://api.example.com/endpoint` |
| **Method** | POST |
| **Headers** | `Authorization: Bearer {{token}}` |
```

### IF Node

**Обязательно включить:**
- Условие
- Что происходит при TRUE/FALSE

```markdown
**Условие:** `$json.field === true`
- TRUE → Node A
- FALSE → Node B
```

### Execute Workflow Node

**Обязательно включить:**
- ID вызываемого workflow
- Название workflow

```markdown
**Вызывает:** ELO_Core_Tenant_Resolver (rRO6sxLqiCdgvLZz)
```

---

## Паттерны для разных типов workflows

### ELO_In (входящие)

```
Webhook → Extract Data → Has Voice?
                            ├── YES → Download → Transcribe → Normalize
                            └── NO → Normalize
                                          ↓
                            Execute Tenant Resolver
                                          ↓
                            [Redis PUSH или Client Resolver]
                                          ↓
                            Respond
```

**Ключевые секции:**
- Как извлекаются данные из webhook
- Нормализация телефона
- Формат ELO Core Contract
- Куда отправляется (Redis или напрямую)

### ELO_Out (исходящие)

```
Execute Trigger → [Get Credentials] → Send Message → Process Response
                                                          ↓
                                            Save Message History (PostgreSQL)
                                                          ↓
                                            Register Touchpoint (Neo4j webhook)
```

**Ключевые секции:**
- Откуда берутся credentials
- Формат отправки в канал
- Определение touchpoint_direction

### API (Android)

```
Webhook → Parse/Validate → [Auth Check] → Business Logic → Format Response → Respond
```

**Ключевые секции:**
- Endpoint (path, method)
- Авторизация (x-session-token)
- SQL запросы
- Формат ответа

---

## Обновление INDEX.md

После создания документации обновить `Core_info/INDEX.md`:

1. Добавить файл в структуру (с ✅)
2. Добавить в таблицу workflows
3. Обновить счётчик блока

---

## Примеры хороших документаций

- `01_Channel_Layer/workflows_info/ELO_In_Avito.md` — фильтрация, особенности
- `01_Channel_Layer/workflows_info/ELO_Out_Avito.md` — OAuth refresh, Redis cache
- `06_API/workflows_info/API_Android_Auth.md` — полный auth flow
