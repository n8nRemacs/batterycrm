# Graph Block — Overview

> Neo4j графовая БД для контекста клиентов, устройств, проблем

**Сервер:** 45.144.177.128:7474 (RU Server)
**База:** neo4j (HTTP API)

---

## Архитектура

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           Graph Block (Neo4j)                                │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                              │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  Context Builder                                                     │    │
│  │  POST /webhook/neo4j/context                                         │    │
│  │                                                                      │    │
│  │  • get_context      — полный контекст клиента                       │    │
│  │  • disambiguation   — определить устройство                          │    │
│  │  • match_entities   — найти/создать сущности                        │    │
│  │  • enrichment       — предложить собрать контакты                   │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                                                              │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  CRUD Operations                                                     │    │
│  │  POST /webhook/neo4j/crud                                            │    │
│  │                                                                      │    │
│  │  • create, read, update, delete                                      │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                                                              │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  Sync (PostgreSQL → Neo4j)                                           │    │
│  │  POST /webhook/neo4j/sync                                            │    │
│  │                                                                      │    │
│  │  • client, device, problem, channel                                  │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                                                              │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  Touchpoint Register                                                 │    │
│  │  POST /webhook/neo4j/touchpoint/register                             │    │
│  │                                                                      │    │
│  │  • inbound / outbound / mutual                                       │    │
│  │  • Сохраняет в Neo4j + PostgreSQL                                   │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                                                              │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  Touchpoint Tracker                                                  │    │
│  │  POST /webhook/neo4j/touchpoint                                      │    │
│  │                                                                      │    │
│  │  • Трекинг упоминаний устройств/проблем                             │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                                                              │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## Neo4j Schema

### Node Types

| Node | Описание | Ключевые свойства |
|------|----------|-------------------|
| Client | Клиент | id, phone, name |
| Device | Устройство клиента | id, brand, model, owner_label |
| Problem | Проблема устройства | id, type, status |
| ProblemType | Тип проблемы | code |
| Channel | Канал связи | type, identifier, verified |
| Vertical | Вертикаль бизнеса | type |
| Touchpoint | Точка касания | id, timestamp, type, channel, direction |

### Edge Types (Relationships)

```
Client -[:OWNS]-> Device
Device -[:HAS_PROBLEM]-> Problem
Problem -[:OF_TYPE]-> ProblemType
Client -[:HAS_CHANNEL]-> Channel
Client -[:CUSTOMER_OF]-> Vertical

Touchpoint -[:FROM]-> Client     (inbound — клиент пишет)
Touchpoint -[:TO]-> Client       (outbound — мы пишем)
Touchpoint -[:ABOUT_DEVICE]-> Device    {confidence, explicit}
Touchpoint -[:ABOUT_PROBLEM]-> Problem  {confidence, explicit}
Touchpoint -[:IN_VERTICAL]-> Vertical
```

### Визуальная схема

```
                         ┌─────────────┐
                         │   Client    │
                         └──────┬──────┘
            ┌──────────────────┼──────────────────┐
            │                  │                  │
      [:OWNS]            [:HAS_CHANNEL]    [:CUSTOMER_OF]
            │                  │                  │
            ▼                  ▼                  ▼
     ┌──────────┐       ┌──────────┐       ┌──────────┐
     │  Device  │       │ Channel  │       │ Vertical │
     └────┬─────┘       └──────────┘       └──────────┘
          │
    [:HAS_PROBLEM]
          │
          ▼
     ┌──────────┐      ┌─────────────┐
     │ Problem  │─────▶│ ProblemType │
     └──────────┘      └─────────────┘
                [:OF_TYPE]


     ┌────────────┐
     │ Touchpoint │
     └─────┬──────┘
           │
           ├──[:FROM]────────▶ Client (inbound)
           ├──[:TO]──────────▶ Client (outbound)
           ├──[:ABOUT_DEVICE]▶ Device
           ├──[:ABOUT_PROBLEM]▶ Problem
           └──[:IN_VERTICAL]─▶ Vertical
```

---

## Workflows

| # | Workflow | ID | Webhook | Назначение |
|---|----------|-----|---------|------------|
| 1 | ELO_Graph_Context_Builder | gF8hYMVuCRqCkw83 | /neo4j/context | AI контекст |
| 2 | ELO_Graph_CRUD | gtm1CfLF557Ta40P | /neo4j/crud | CRUD операции |
| 3 | ELO_Graph_Sync | Jqu7d7yWOjyxm80x | /neo4j/sync | PostgreSQL → Neo4j |
| 4 | ELO_Graph_Touchpoint_Register | TrCjdgREvPAB2yyL | /neo4j/touchpoint/register | Регистрация касаний |
| 5 | ELO_Graph_Touchpoint_Tracker | tKHYEwn1AR18UrDS | /neo4j/touchpoint | Трекинг упоминаний |

---

## Кто вызывает Graph

| Вызывающий | Webhook | Зачем |
|------------|---------|-------|
| AI Router | /neo4j/context | get_context, match_entities |
| Task Dispatcher | /neo4j/context | get_context для AI |
| Appeal Manager | /neo4j/touchpoint/register | Регистрация касания |
| ELO_Out_* | /neo4j/touchpoint/register | Исходящие сообщения |
| Client Creator | /neo4j/sync | Синхронизация нового клиента |

---

## Direction (направление касания)

| Direction | Описание | Edge |
|-----------|----------|------|
| **inbound** | Клиент пишет нам (первое обращение) | `(Touchpoint)-[:FROM]->(Client)` |
| **outbound** | Мы пишем клиенту (промо, рассылка) | `(Touchpoint)-[:TO]->(Client)` |
| **mutual** | Диалог (после первого ответа) | Оба edge: `[:FROM]` и `[:TO]` |

---

## PostgreSQL таблицы

| Таблица | Назначение |
|---------|------------|
| touchpoints | Все касания (дублирует Neo4j) |
| enrichment_paths | Пути обогащения каналов |

---

## Примеры запросов

### Get Context
```json
POST /webhook/neo4j/context
{
  "client_id": "uuid",
  "action": "get_context"
}
```

### Disambiguation
```json
POST /webhook/neo4j/context
{
  "client_id": "uuid",
  "action": "disambiguation"
}
```

### Match Entities
```json
POST /webhook/neo4j/context
{
  "client_id": "uuid",
  "action": "match_entities",
  "extracted": {
    "brand": "Apple",
    "model": "iPhone 14"
  }
}
```

### Register Touchpoint
```json
POST /webhook/neo4j/touchpoint/register
{
  "client_id": "uuid",
  "channel": "telegram",
  "direction": "inbound",
  "type": "message"
}
```
