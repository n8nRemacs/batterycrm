# Глобальная схема данных ELO

> Версия: 1.0
> Дата: 2025-12-10

---

## Принципы

1. **Все таблицы реляционные** — никакого хардкода, только FK на справочники
2. **Гибридные ID** — INT для справочников, UUID для сущностей
3. **Минимальный пакет** — tenant_id + dialog_id для передачи между блоками

---

## Контракты данных

### Internal (между блоками n8n)
```json
{
  "tenant_id": "uuid",
  "dialog_id": "uuid"
}
```
Минимум. Остальное — запрос в БД. `domain_id` достаём из `tenant_id`.

### External (API → Android App)
```json
{
  "tenant_id": "uuid",
  "dialog_id": "uuid",
  "client": {
    "id": "uuid",
    "name": "Иван",
    "phone": "+7..."
  },
  "channel": "telegram",
  "status": "active",
  "last_message": "...",
  "updated_at": "..."
}
```
Развёрнутые данные для отображения.

---

## Иерархия: Домен → Вертикаль

```
Домен (domain)
  └── Вертикаль (vertical)

Пример:
Electronics (domain)
  ├── phone_repair (vertical)
  ├── buy_sell (vertical)
  └── accessories (vertical)
```

**Правило:** диалог может переключаться между вертикалями внутри одного домена. Переход в другой домен — эскалация или новый диалог.

**MVP:** один домен на тенанта.

---

## Справочники (INT PRIMARY KEY)

### elo_domains
Бизнес-домены верхнего уровня.
```sql
CREATE TABLE elo_domains (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) UNIQUE NOT NULL,   -- electronics, food, auto
    name VARCHAR(100) NOT NULL,
    is_active BOOLEAN DEFAULT true
);
```

### elo_verticals
Вертикали внутри домена.
```sql
CREATE TABLE elo_verticals (
    id SERIAL PRIMARY KEY,
    domain_id INT NOT NULL REFERENCES elo_domains(id),
    code VARCHAR(50) UNIQUE NOT NULL,   -- phone_repair, buy_sell
    name VARCHAR(100) NOT NULL,
    is_active BOOLEAN DEFAULT true
);
```

### elo_channels
Каналы коммуникации.
```sql
CREATE TABLE elo_channels (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,   -- telegram, whatsapp, vk, avito, max, form, phone
    name VARCHAR(50) NOT NULL,
    is_active BOOLEAN DEFAULT true
);
```

### elo_dialog_statuses
Статусы диалога.
```sql
CREATE TABLE elo_dialog_statuses (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,   -- active, waiting, closed, escalated
    name VARCHAR(50) NOT NULL
);
```

### elo_message_types
Типы сообщений.
```sql
CREATE TABLE elo_message_types (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,   -- text, voice, image, file, location
    name VARCHAR(50) NOT NULL
);
```

### elo_directions
Направление сообщения.
```sql
CREATE TABLE elo_directions (
    id SERIAL PRIMARY KEY,
    code VARCHAR(10) UNIQUE NOT NULL,   -- in, out
    name VARCHAR(20) NOT NULL
);
```

### elo_operator_types
Типы операторов.
```sql
CREATE TABLE elo_operator_types (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,   -- human, ai
    name VARCHAR(50) NOT NULL
);
```

---

## Основные сущности (UUID PRIMARY KEY)

### elo_tenants
Арендаторы системы.
```sql
CREATE TABLE elo_tenants (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    domain_id INT NOT NULL REFERENCES elo_domains(id),
    name VARCHAR(255) NOT NULL,
    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);
```

### elo_operators
Операторы (люди и AI).
```sql
CREATE TABLE elo_operators (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    type_id INT NOT NULL REFERENCES elo_operator_types(id),
    name VARCHAR(255) NOT NULL,           -- "Иван Петров" или "AI Assistant"
    ai_model VARCHAR(50),                 -- NULL для human, 'claude-3' для ai
    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW()
);
```

### elo_clients
Клиенты.
```sql
CREATE TABLE elo_clients (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    name VARCHAR(255),
    phone VARCHAR(20),
    email VARCHAR(255),
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);
```

### elo_dialogs
Диалоги с клиентами.
```sql
CREATE TABLE elo_dialogs (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    client_id UUID NOT NULL REFERENCES elo_clients(id),
    channel_id INT NOT NULL REFERENCES elo_channels(id),
    status_id INT NOT NULL REFERENCES elo_dialog_statuses(id),
    operator_id UUID REFERENCES elo_operators(id),   -- текущий ответственный
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);
```

### elo_messages
Сообщения в диалогах.
```sql
CREATE TABLE elo_messages (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    dialog_id UUID NOT NULL REFERENCES elo_dialogs(id),
    direction_id INT NOT NULL REFERENCES elo_directions(id),
    operator_id UUID REFERENCES elo_operators(id),   -- NULL для входящих, заполнен для исходящих
    message_type_id INT NOT NULL REFERENCES elo_message_types(id),
    content TEXT,
    created_at TIMESTAMPTZ DEFAULT NOW()
);
```

---

## Связующие таблицы

### elo_tenant_verticals
Какие вертикали доступны тенанту.
```sql
CREATE TABLE elo_tenant_verticals (
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    vertical_id INT NOT NULL REFERENCES elo_verticals(id),
    is_active BOOLEAN DEFAULT true,
    PRIMARY KEY (tenant_id, vertical_id)
);
```

### elo_dialog_verticals
Какие вертикали активны в диалоге.
```sql
CREATE TABLE elo_dialog_verticals (
    dialog_id UUID NOT NULL REFERENCES elo_dialogs(id),
    vertical_id INT NOT NULL REFERENCES elo_verticals(id),
    status_id INT NOT NULL REFERENCES elo_dialog_statuses(id),   -- статус по этой вертикали
    operator_id UUID REFERENCES elo_operators(id),               -- ответственный по этой вертикали
    created_at TIMESTAMPTZ DEFAULT NOW(),
    PRIMARY KEY (dialog_id, vertical_id)
);
```

---

## Блоки системы

| # | Блок | Описание |
|---|------|----------|
| 1 | Channel Layer | MCP + In + Out (per channel) |
| 2 | Billing | Подписки, балансы, проверки |
| 3 | Input Contour | Tenant Resolver → Batcher |
| 4 | Core | Dialog Engine + AI Pipeline |
| 5 | Graph | Neo4j (Client, Device, Symptom, Diagnosis, Repair) |
| 6 | Diagnostic Engine | Симптомы → Диагнозы → Ремонты |

+ **Tools** — отдельно потом.

---

## Блок 1: Channel Layer (IN/OUT)

### Что получает ELO_In от MCP (NormalizedMessage)

MCP уже делает нормализацию и транскрипцию голоса.

```json
{
  "channel": "telegram",
  "bot_token": "123:ABC...",
  "message_id": 111,
  "chat_id": 789,
  "user_id": 456,
  "user_name": "ivan",
  "first_name": "Иван",
  "last_name": "Петров",
  "username": "ivan",
  "text": "Привет, не работает телефон",
  "voice_text": "транскрипция если голос",
  "attachments": [
    {"type": "photo", "file_id": "..."},
    {"type": "voice", "file_id": "...", "duration": 5}
  ],
  "timestamp": "2025-12-10T12:00:00Z",
  "is_callback": false,
  "callback_data": null,
  "raw_data": {}
}
```

### Что делает ELO_In

1. По `bot_token` → найти `tenant_id` (Tenant Resolver, таблица `elo_channel_accounts`)
2. По `chat_id` + `channel` → найти или создать `client_id`
3. По `client_id` + `channel` → найти или создать `dialog_id`
4. Сохранить message в `elo_messages`
5. Отдать дальше: `{tenant_id, dialog_id}`

### Что получает ELO_Out

```json
{
  "tenant_id": "uuid",
  "dialog_id": "uuid",
  "message": {
    "text": "Ответ клиенту",
    "operator_id": "uuid",
    "reply_markup": {}
  }
}
```

### Что делает ELO_Out

1. Из `dialog_id` достать `channel_id`, внешний `chat_id`
2. Из `elo_channel_accounts` достать `bot_token` / credentials
3. Вызвать MCP `/api/send` с нужными параметрами
4. Сохранить message в `elo_messages` (direction = out)

### Таблица elo_channel_accounts

Связь tenant ↔ канал ↔ аккаунт для Tenant Resolver и отправки.

```sql
CREATE TABLE elo_channel_accounts (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    channel_id INT NOT NULL REFERENCES elo_channels(id),

    -- Идентификация
    account_id VARCHAR(100) NOT NULL,    -- bot_token, phone, group_id
    account_name VARCHAR(255),           -- отображаемое имя
    webhook_hash VARCHAR(32) UNIQUE,     -- для Tenant Resolver: /webhook/{hash} → tenant_id

    -- Credentials (для отправки)
    credentials JSONB,                   -- {token, api_key, secret...}

    -- MCP endpoint
    mcp_base_url VARCHAR(255),           -- https://mcp-telegram.example.com

    -- Статус
    is_active BOOLEAN DEFAULT true,

    -- Audit
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(tenant_id, channel_id, account_id)
);

-- Индекс для быстрого поиска по bot_token/account_id
CREATE INDEX idx_channel_accounts_account ON elo_channel_accounts(account_id);
CREATE INDEX idx_channel_accounts_webhook ON elo_channel_accounts(webhook_hash);
```

### Таблица elo_client_channels

Связь клиента с его идентификаторами в разных каналах.

```sql
CREATE TABLE elo_client_channels (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    client_id UUID NOT NULL REFERENCES elo_clients(id),
    channel_id INT NOT NULL REFERENCES elo_channels(id),

    external_id VARCHAR(100) NOT NULL,   -- chat_id в Telegram, phone в WhatsApp
    external_username VARCHAR(100),      -- @username если есть

    created_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(client_id, channel_id, external_id)
);

-- Индекс для быстрого поиска клиента по external_id
CREATE INDEX idx_client_channels_external ON elo_client_channels(channel_id, external_id);
```

---

## Блок 3: Input Contour

**Поток:**
```
MCP → ELO_In → [Input Contour] → Core
                    ↓
         Tenant Resolver → Batcher → Client/Dialog Resolver
```

### 3.1 Tenant Resolver

**Получает от ELO_In:**
```json
{
  "channel": "telegram",
  "bot_token": "123:ABC...",
  "chat_id": 789,
  "user_id": 456,
  "text": "...",
  ...
}
```

**Делает:**
1. По `bot_token` → SELECT из `elo_channel_accounts` → `tenant_id`, `account_id`
2. Проверка `is_active` у tenant и channel_account
3. Если не найден → логировать и отбросить

**Отдаёт:**
```json
{
  "tenant_id": "uuid",
  "channel_id": 1,
  "account_id": "uuid",
  "external_user_id": "456",
  "external_chat_id": "789",
  "text": "...",
  "voice_text": "...",
  "attachments": [...],
  "timestamp": "..."
}
```

### 3.2 Batcher (Debounce)

**Зачем:** клиент шлёт 5 сообщений подряд за 3 секунды — обрабатываем как одно.

**Архитектура:** высоконагруженный компонент, параллельная обработка через Redis.

```
┌─────────────┐     ┌─────────────┐     ┌─────────────┐
│ ELO_In_TG   │────▶│             │     │             │
├─────────────┤     │             │     │             │
│ ELO_In_WA   │────▶│    Redis    │────▶│  Batcher    │
├─────────────┤     │   Queue     │     │  Workers    │
│ ELO_In_VK   │────▶│             │     │  (N штук)   │
└─────────────┘     └─────────────┘     └─────────────┘
```

**Redis структуры:**
```
# Очередь входящих
elo:in:queue                    -- LIST, входящие сообщения

# Батчи по ключу (tenant + external_chat_id + channel)
elo:batch:{key}:messages        -- LIST, сообщения в батче
elo:batch:{key}:timer           -- STRING, timestamp последнего сообщения

# Настройки debounce (из tenant settings)
elo:tenant:{id}:debounce_ms     -- STRING, время ожидания (default 3000)
```

**Логика:**
1. Сообщение приходит в `elo:in:queue`
2. Worker берёт, вычисляет `batch_key = {tenant_id}:{channel_id}:{external_chat_id}`
3. RPUSH в `elo:batch:{key}:messages`
4. SET `elo:batch:{key}:timer` = NOW
5. Отдельный процесс проверяет таймеры, если прошло N ms — отправляет батч дальше

**Отдаёт:**
```json
{
  "tenant_id": "uuid",
  "channel_id": 1,
  "account_id": "uuid",
  "external_user_id": "456",
  "external_chat_id": "789",
  "batch": {
    "message_count": 3,
    "combined_text": "Привет\nНе работает телефон\nЭкран разбит",
    "attachments": [...],
    "first_timestamp": "...",
    "last_timestamp": "..."
  }
}
```

### 3.3 Client/Dialog Resolver

**Получает:** батч с `tenant_id`, `channel_id`, `external_chat_id`

**Делает:**
1. По `channel_id` + `external_chat_id` → ищет в `elo_client_channels` → `client_id`
2. Если не найден → создаёт `client` и `client_channel`
3. По `client_id` + `channel_id` → ищет активный `dialog` или создаёт новый
4. Сохраняет messages в `elo_messages`

**Отдаёт в Core:**
```json
{
  "tenant_id": "uuid",
  "dialog_id": "uuid"
}
```

Минимальный Internal-контракт. Core сам достаёт что нужно.

### Принцип передачи данных между нодами

**Проблема n8n:** после SQL-ноды теряется входящий payload.

**Решение:** Code-нода после каждого SQL для мержа данных.

```javascript
// Пример: после SQL "Tenant Resolver"
const input = $('Webhook').first().json;  // исходные данные
const sqlResult = $input.first().json;    // результат SQL

return {
  ...input,                    // пробрасываем всё
  tenant_id: sqlResult.tenant_id,
  channel_id: sqlResult.channel_id,
  account_id: sqlResult.id
};
```

**Принцип:** один растущий объект, каждый воркер добавляет свои поля.

### Воркеры Input Contour (предварительно)

| # | Воркер | Входит | SQL | Добавляет |
|---|--------|--------|-----|-----------|
| 1 | Tenant Resolver | MCP payload | 1 (channel_accounts) | tenant_id, channel_id, account_id |
| 2 | Batcher | + tenant_id | 0 (Redis) | batch{} |
| 3 | Client Resolver | + batch | 1-2 (client, client_channels) | client_id |
| 4 | Dialog Resolver | + client_id | 1-2 (dialog) | dialog_id |
| 5 | Message Saver | + dialog_id | 1 INSERT (messages) | message_id |

**TODO:** решить — много мелких воркеров или объединить 3+4+5.

---

## Seed данные

### elo_domains
| id | code | name |
|----|------|------|
| 1 | electronics | Электроника |

### elo_verticals
| id | domain_id | code | name |
|----|-----------|------|------|
| 1 | 1 | phone_repair | Ремонт телефонов |
| 2 | 1 | buy_sell | Купля-продажа |

### elo_channels
| id | code | name |
|----|------|------|
| 1 | telegram | Telegram |
| 2 | whatsapp | WhatsApp |
| 3 | vk | ВКонтакте |
| 4 | avito | Авито |
| 5 | max | MAX |
| 6 | form | Форма |
| 7 | phone | Телефон |

### elo_dialog_statuses
| id | code | name |
|----|------|------|
| 1 | active | Активный |
| 2 | waiting | Ожидание |
| 3 | closed | Закрыт |
| 4 | escalated | Эскалация |

### elo_message_types
| id | code | name |
|----|------|------|
| 1 | text | Текст |
| 2 | voice | Голос |
| 3 | image | Изображение |
| 4 | file | Файл |
| 5 | location | Геолокация |

### elo_directions
| id | code | name |
|----|------|------|
| 1 | in | Входящее |
| 2 | out | Исходящее |

### elo_operator_types
| id | code | name |
|----|------|------|
| 1 | human | Человек |
| 2 | ai | AI |
