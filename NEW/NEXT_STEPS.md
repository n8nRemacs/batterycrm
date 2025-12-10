# Следующие шаги проектирования ELO

> Сессия: 2025-12-10
> Статус: в процессе

---

## Что сделано

### 1. Глобальная схема (`GLOBAL_SCHEMA.md`)

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

### 2. Блоки системы (6 + Tools)

| # | Блок | Статус |
|---|------|--------|
| 1 | Channel Layer (IN/OUT) | Описан |
| 2 | Billing | TODO |
| 3 | Input Contour | Описан частично |
| 4 | Core | TODO |
| 5 | Graph (Neo4j) | TODO |
| 6 | Diagnostic Engine | TODO |
| — | Tools | TODO |

### 3. Блок 1: Channel Layer

- Формат NormalizedMessage от MCP
- Что делает ELO_In (5 шагов)
- Что делает ELO_Out (4 шага)
- Таблицы: elo_channel_accounts, elo_client_channels

### 4. Блок 3: Input Contour

- Поток: Tenant Resolver → Batcher → Client/Dialog Resolver
- Redis-архитектура для Batcher
- Принцип передачи данных (merge после SQL)
- Предварительный список воркеров (5 шт)

---

## На чём остановились

**Вопрос:** как организовать воркеры внутри Input Contour?

- Много мелких (5 воркеров) или объединить 3+4+5 в один?
- Детальное описание каждой ноды в воркере

---

## План дальнейшей работы

### Структура папок

```
NEW/
├── GLOBAL_SCHEMA.md          # Общая схема (таблицы, контракты)
├── NEXT_STEPS.md             # Этот файл
└── SCHEMA/
    ├── 01_CHANNEL_LAYER/
    │   ├── ELO_In_Telegram.md
    │   ├── ELO_In_WhatsApp.md
    │   ├── ELO_Out_Telegram.md
    │   └── ...
    ├── 02_BILLING/
    │   └── ...
    ├── 03_INPUT_CONTOUR/
    │   ├── Tenant_Resolver.md
    │   ├── Batcher.md
    │   ├── Client_Resolver.md
    │   ├── Dialog_Resolver.md
    │   └── Message_Saver.md
    ├── 04_CORE/
    │   └── ...
    ├── 05_GRAPH/
    │   └── ...
    └── 06_DIAGNOSTIC_ENGINE/
        └── ...
```

### Формат файла воркера

```markdown
# Имя воркера

## Назначение
Краткое описание что делает

## Входные данные
JSON с описанием полей

## Выходные данные
JSON с описанием полей

## Ноды

### 1. Webhook / Trigger
- Тип: n8n-nodes-base.webhook
- Назначение: ...

### 2. SQL - Find Tenant
- Тип: n8n-nodes-base.postgres
- Query: ...
- Назначение: ...

### 3. Code - Merge Data
- Тип: n8n-nodes-base.code
- Назначение: ...
- Код: ...

...
```

### Порядок работы

1. Выбираем блок
2. Определяем воркеры в блоке
3. Для каждого воркера — описание + все ноды
4. Обратная связь и корректировки
5. Следующий блок

---

## Следующая сессия

Начинаем с **Блок 3: Input Contour**, первый воркер — **Tenant Resolver**.
