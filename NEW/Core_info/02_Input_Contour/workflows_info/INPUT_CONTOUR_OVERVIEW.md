# Input Contour — Обзор

> Входной контур: буферизация и подготовка сообщений перед Core

---

## Назначение

Input Contour решает проблему:
- **IN workflows быстрые** (~100ms) — нужно быстро ответить мессенджеру
- **Batcher медленный** (10s+ debounce) — ждёт пока клиент допишет
- **Redis как буфер** — развязывает скорости

---

## Архитектура

```
┌──────────────────────────────────────────────────────────────────┐
│  IN Workflows (быстрые, ~100ms)                                   │
│  ┌─────────┐ ┌─────────┐ ┌─────────┐ ┌─────────┐ ┌─────────┐     │
│  │Telegram │ │WhatsApp │ │  Avito  │ │   VK    │ │   MAX   │     │
│  └────┬────┘ └────┬────┘ └────┬────┘ └────┬────┘ └────┬────┘     │
│       │           │           │           │           │          │
│       └───────────┴─────┬─────┴───────────┴───────────┘          │
│                         ↓                                         │
│         ┌───────────────────────────────┐                        │
│         │  1. ELO_Core_Tenant_Resolver       │  ← определяет tenant   │
│         └───────────────┬───────────────┘                        │
│                         ↓                                         │
│         ┌───────────────────────────────┐                        │
│         │  Redis RPUSH queue:incoming   │  ← быстро и уходят     │
│         └───────────────┬───────────────┘                        │
└─────────────────────────│────────────────────────────────────────┘
                          ↓
┌─────────────────────────────────────────────────────────────────────┐
│  Batcher (медленный, 10s debounce)                                   │
│         ┌───────────────────────────────┐                           │
│         │  2. ELO_Core_Queue_Processor       │  ← каждые 5 сек           │
│         │     POP из queue:incoming     │                           │
│         │     Группировка по chat_id    │                           │
│         └───────────────┬───────────────┘                           │
│                         ↓                                            │
│         ┌───────────────────────────────┐                           │
│         │  3. ELO_Core_Batch_Debouncer ×10   │  ← ждёт 10s тишины        │
│         │     Склеивает сообщения       │                           │
│         └───────────────┬───────────────┘                           │
│                         ↓                                            │
│         ┌───────────────────────────────┐                           │
│         │  4. ELO_Core_Client_Resolver       │  ← находит/создаёт клиента│
│         └───────────────┬───────────────┘                           │
└─────────────────────────│───────────────────────────────────────────┘
                          ↓
                    ┌───────────┐
                    │   CORE    │
                    └───────────┘
```

---

## Компоненты

| # | Workflow | Файл | Назначение |
|---|----------|------|------------|
| 1 | ELO_Core_Tenant_Resolver | [ELO_Core_Tenant_Resolver.md](ELO_Core_Tenant_Resolver.md) | Определяет tenant по credentials |
| 2 | ELO_Core_Queue_Processor | [ELO_Core_Queue_Processor.md](ELO_Core_Queue_Processor.md) | Забирает из очереди, группирует |
| 3 | ELO_Core_Batch_Debouncer | [ELO_Core_Batch_Debouncer.md](ELO_Core_Batch_Debouncer.md) | Ждёт тишины, склеивает |
| 4 | ELO_Core_Client_Resolver | [ELO_Core_Client_Resolver.md](ELO_Core_Client_Resolver.md) | Находит/создаёт клиента |

---

## Redis ключи

| Ключ | Тип | TTL | Назначение |
|------|-----|-----|------------|
| `queue:incoming` | List | — | Глобальная входящая очередь |
| `queue:processor:lock` | String | 30s | Lock процессора |
| `queue:batch:{channel}:{chat_id}` | List | — | Per-chat очередь батча |
| `lock:batch:{channel}:{chat_id}` | String | 300s | Lock обработки чата |
| `last_seen:{channel}:{chat_id}` | String | — | Время последнего сообщения |

---

## Debounce логика

**Зачем:** Клиент пишет несколько сообщений подряд — нужно дождаться и склеить.

```
10:00:01 — "Привет"           ┐
10:00:03 — "Разбил экран"     ├── батч
10:00:05 — "iPhone 14"        ┘

         ↓ тишина 10 сек ↓

10:00:15 — Склеенное сообщение → Core
           "Привет\n\nРазбил экран\n\niPhone 14"
```

**Параметры:**
- `debounce_seconds: 10` — ждём тишины
- `max_wait_seconds: 300` — максимум 5 мин (защита от бесконечного ожидания)

---

## Почему 10 копий Debouncer?

n8n не умеет параллельно обрабатывать в одном workflow. Каждый Debouncer:
- Ждёт (Wait node блокирует)
- Обрабатывает один чат

10 копий = 10 параллельных чатов.

---

## Form и Phone — без Redis

```
Form/Phone → Tenant Resolver → Client Resolver → Core
```

**Почему:**
- Редкие запросы (не нужна очередь)
- Не нужен debounce (одно сообщение = одна заявка)
- Можно обработать синхронно

---

## Контракт данных

**Вход в Input Contour (от IN workflow):**
```json
{
  "channel": "telegram",
  "external_user_id": "tg_123456",
  "external_chat_id": "tg_123456",
  "text": "Привет",
  "timestamp": "2024-12-10T10:00:00Z",
  "client_phone": null,
  "client_name": "Иван",
  "bot_token": "123:ABC...",
  "media": {...},
  "meta": {...}
}
```

**Выход из Input Contour (в Core):**
```json
{
  "channel": "telegram",
  "external_user_id": "tg_123456",
  "external_chat_id": "tg_123456",
  "text": "Привет\n\nРазбил экран\n\niPhone 14",
  "timestamp": "2024-12-10T10:00:01Z",
  "tenant_id": "uuid",
  "client": {
    "id": "uuid",
    "phone": "+79991234567",
    "name": "Иван"
  },
  "meta": {
    "batched": true,
    "batch_size": 3,
    "batch_reason": "silence_reached"
  }
}
```
