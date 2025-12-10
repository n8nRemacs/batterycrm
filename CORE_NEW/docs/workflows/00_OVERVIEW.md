# ELO Workflows — Общая схема

> Как workflows связаны между собой

---

## Визуальная схема

```
                           ┌─────────────────────┐
                           │    MCP Channels     │
                           │  (внешние сервисы)  │
                           └──────────┬──────────┘
                                      │ HTTP POST
                                      ▼
┌──────────────────────────────────────────────────────────────────────────┐
│                         ВХОДНЫЕ WORKFLOWS (ELO_In_*)                      │
│                                                                          │
│  ┌────────────┐ ┌────────────┐ ┌────────────┐ ┌────────────┐            │
│  │ ELO_In_    │ │ ELO_In_    │ │ ELO_In_    │ │ ELO_In_    │   ...      │
│  │ Telegram   │ │ WhatsApp   │ │ Avito      │ │ VK         │            │
│  └─────┬──────┘ └─────┬──────┘ └─────┬──────┘ └─────┬──────┘            │
└────────┼──────────────┼──────────────┼──────────────┼────────────────────┘
         │              │              │              │
         └──────────────┴──────────────┴──────────────┘
                                      │
                                      │ Redis PUSH
                                      ▼
                        ┌─────────────────────────┐
                        │   queue:incoming        │
                        │   (Redis List)          │
                        └────────────┬────────────┘
                                     │
                                     │ Redis POP (Schedule 5s)
                                     ▼
┌──────────────────────────────────────────────────────────────────────────┐
│                       ELO_Queue_Processor                                 │
│                                                                          │
│  Триггер: Schedule (каждые 5 секунд)                                     │
│  Задача: Читает очередь, резолвит tenant, группирует по chat_id          │
│                                                                          │
└────────────────────────────────────┬─────────────────────────────────────┘
                                     │
                                     │ Execute Workflow
                                     ▼
┌──────────────────────────────────────────────────────────────────────────┐
│                         ELO_Core_Batcher                                  │
│                                                                          │
│  Триггер: Execute Workflow Trigger                                       │
│  Задача: Батчинг/дебаунс сообщений от одного пользователя                │
│                                                                          │
└────────────────────────────────────┬─────────────────────────────────────┘
                                     │
                                     │ Execute Workflow
                                     ▼
┌──────────────────────────────────────────────────────────────────────────┐
│                      ELO_Core_Dialog_Engine                               │
│                                                                          │
│  Триггер: Execute Workflow Trigger                                       │
│  Задача: Find/Create Client, Find/Create Dialog, Save Event             │
│                                                                          │
└────────────────────────────────────┬─────────────────────────────────────┘
                                     │
                                     │ Execute Workflow
                                     ▼
┌──────────────────────────────────────────────────────────────────────────┐
│                       ELO_Core_AI_Router                                  │
│                                                                          │
│  Триггер: Execute Workflow Trigger                                       │
│  Задача: Загрузка контекста, вызов AI, обработка ответа                  │
│                                                                          │
└────────────────────────────────────┬─────────────────────────────────────┘
                                     │
                                     │ Execute Workflow (по каналу)
                                     ▼
┌──────────────────────────────────────────────────────────────────────────┐
│                       ВЫХОДНЫЕ WORKFLOWS (ELO_Out_*)                      │
│                                                                          │
│  ┌────────────┐ ┌────────────┐ ┌────────────┐ ┌────────────┐            │
│  │ ELO_Out_   │ │ ELO_Out_   │ │ ELO_Out_   │ │ ELO_Out_   │   ...      │
│  │ Telegram   │ │ WhatsApp   │ │ Avito      │ │ VK         │            │
│  └─────┬──────┘ └─────┬──────┘ └─────┬──────┘ └─────┬──────┘            │
└────────┼──────────────┼──────────────┼──────────────┼────────────────────┘
         │              │              │              │
         └──────────────┴──────────────┴──────────────┘
                                      │
                                      │ HTTP POST
                                      ▼
                           ┌─────────────────────┐
                           │    MCP Channels     │
                           │  (внешние сервисы)  │
                           └─────────────────────┘
```

---

## Типы связей

| Тип связи | Описание | Пример |
|-----------|----------|--------|
| **HTTP POST** | Внешний вызов webhook | MCP → ELO_In_Telegram |
| **Redis PUSH/POP** | Асинхронная очередь | ELO_In_* → queue:incoming → ELO_Queue_Processor |
| **Execute Workflow** | Синхронный вызов n8n workflow | ELO_Queue_Processor → ELO_Core_Batcher |

---

## Таблица связей

| Источник | Связь | Цель | Данные |
|----------|-------|------|--------|
| mcp-telegram | HTTP POST `/telegram-in` | ELO_In_Telegram | MCP event |
| mcp-whatsapp | HTTP POST `/whatsapp-in` | ELO_In_WhatsApp | Wappi event |
| mcp-avito | HTTP POST `/avito-in` | ELO_In_Avito | Avito event |
| mcp-vk | HTTP POST `/vk-in` | ELO_In_VK | VK Callback event |
| mcp-max | HTTP POST `/max-in` | ELO_In_MAX | VK Teams event |
| mcp-form | HTTP POST `/form-in` | ELO_In_Form | Web form data |
| ELO_In_* | Redis PUSH | queue:incoming | Normalized message |
| ELO_Queue_Processor | Redis POP | queue:incoming | Batch of messages |
| ELO_Queue_Processor | Execute Workflow | ELO_Core_Batcher | Messages + tenant |
| ELO_Core_Batcher | Execute Workflow | ELO_Core_Dialog_Engine | Combined message |
| ELO_Core_Dialog_Engine | Execute Workflow | ELO_Core_AI_Router | Dialog context |
| ELO_Core_AI_Router | Execute Workflow | ELO_Out_* | Response |
| ELO_Out_Telegram | HTTP POST `/send` | mcp-telegram | Message to send |
| ELO_Out_WhatsApp | HTTP POST `/send` | mcp-whatsapp | Message to send |

---

## Файлы документации

| Файл | Workflow | Описание |
|------|----------|----------|
| [01_ELO_In_Telegram.md](01_ELO_In_Telegram.md) | ELO_In_Telegram | Входящие из Telegram |
| [02_ELO_In_WhatsApp.md](02_ELO_In_WhatsApp.md) | ELO_In_WhatsApp | Входящие из WhatsApp |
| [03_ELO_In_Avito.md](03_ELO_In_Avito.md) | ELO_In_Avito | Входящие из Avito |
| [04_ELO_In_VK.md](04_ELO_In_VK.md) | ELO_In_VK | Входящие из VK |
| [05_ELO_In_MAX.md](05_ELO_In_MAX.md) | ELO_In_MAX | Входящие из MAX |
| [06_ELO_In_Form.md](06_ELO_In_Form.md) | ELO_In_Form | Входящие из веб-форм |
| [10_ELO_Queue_Processor.md](10_ELO_Queue_Processor.md) | ELO_Queue_Processor | Обработка очереди |
| [11_ELO_Core_Batcher.md](11_ELO_Core_Batcher.md) | ELO_Core_Batcher | Батчинг сообщений |
| [12_ELO_Core_Dialog_Engine.md](12_ELO_Core_Dialog_Engine.md) | ELO_Core_Dialog_Engine | Управление диалогами |
| [13_ELO_Core_AI_Router.md](13_ELO_Core_AI_Router.md) | ELO_Core_AI_Router | Маршрутизация AI |
| [20_ELO_Out_Telegram.md](20_ELO_Out_Telegram.md) | ELO_Out_Telegram | Исходящие в Telegram |
| [21_ELO_Out_WhatsApp.md](21_ELO_Out_WhatsApp.md) | ELO_Out_WhatsApp | Исходящие в WhatsApp |

---

## Порядок активации

1. **ELO_Queue_Processor** — первым (он запускает всю цепочку по Schedule)
2. **ELO_Core_Batcher** — вторым (ждёт вызова)
3. **ELO_Core_Dialog_Engine** — третьим (ждёт вызова)
4. **ELO_Core_AI_Router** — четвёртым (ждёт вызова)
5. **ELO_Out_*** — пятыми (выходные каналы)
6. **ELO_In_*** — последними (входные каналы)
