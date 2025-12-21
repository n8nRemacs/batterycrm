# ELO Database Schema

> PostgreSQL database structure
> Last updated: 2025-12-20

---

## Overview

```
elo_t_tenants
     |
     +--< elo_t_operators --< elo_t_operator_devices
     |
     +--< elo_t_clients --< elo_t_client_channels
     |         |
     |         +--< elo_t_dialogs --< elo_t_messages
     |                   |
     |                   +--< elo_t_ai_extractions
     |                   +--< elo_t_tasks
     |
     +--< elo_t_channel_accounts

elo_channels (справочник)
elo_verticals (справочник)
```

---

## Core Tables

### elo_t_tenants
Арендаторы (компании/сервисные центры)

| Column | Type | Description |
|--------|------|-------------|
| id | uuid | PK |
| name | varchar(255) | Название |
| slug | varchar(100) | URL-идентификатор |
| domain_id | int | Домен (1=ремонт) |
| settings | jsonb | Настройки |
| plan | varchar(50) | Тариф: free/basic/pro |
| max_operators | int | Лимит операторов (def: 3) |
| max_dialogs_per_month | int | Лимит диалогов (def: 500) |
| is_active | bool | Активен |
| created_at | timestamptz | |
| updated_at | timestamptz | |

---

### elo_t_operators
Операторы (сотрудники)

| Column | Type | Description |
|--------|------|-------------|
| id | uuid | PK |
| tenant_id | uuid | FK -> elo_t_tenants |
| email | varchar(255) | Email (уникален в tenant) |
| phone | varchar(20) | Телефон |
| telegram_id | varchar(50) | Telegram ID |
| password_hash | varchar(255) | bcrypt hash |
| name | varchar(255) | Имя |
| avatar_url | text | URL аватара |
| role | varchar(20) | operator/admin/owner |
| fcm_tokens | jsonb | FCM токены (legacy) |
| settings | jsonb | Настройки |
| is_active | bool | Активен |
| last_seen_at | timestamptz | Последняя активность |
| created_at | timestamptz | |
| updated_at | timestamptz | |

---

### elo_t_operator_devices
Устройства операторов (для push-уведомлений)

| Column | Type | Description |
|--------|------|-------------|
| id | uuid | PK |
| operator_id | uuid | FK -> elo_t_operators |
| tenant_id | uuid | FK -> elo_t_tenants |
| device_id | varchar(255) | ID устройства |
| device_type | varchar(20) | mobile/desktop |
| device_name | varchar(255) | Название |
| device_info | jsonb | Информация об устройстве |
| session_token | varchar(255) | Токен сессии (уникален) |
| **fcm_token** | text | **FCM токен для push** |
| app_mode | varchar(20) | client/server/both |
| tunnel_url | text | URL туннеля (server mode) |
| tunnel_secret | varchar(255) | Секрет туннеля |
| is_active | bool | Активен |
| last_active_at | timestamptz | Последняя активность |
| created_at | timestamptz | |
| updated_at | timestamptz | |

**Constraints:**
- UNIQUE (operator_id, device_type, tenant_id)
- UNIQUE (session_token)

---

### elo_t_clients
Клиенты

| Column | Type | Description |
|--------|------|-------------|
| id | uuid | PK |
| tenant_id | uuid | FK -> elo_t_tenants |
| name | varchar(255) | Имя |
| phone | varchar(20) | Телефон (уникален в tenant) |
| email | varchar(255) | Email |
| profile | jsonb | Профиль клиента |
| stats | jsonb | Статистика |
| neo4j_synced_at | timestamptz | Время синхронизации с Neo4j |
| created_at | timestamptz | |
| updated_at | timestamptz | |

---

### elo_t_dialogs
Диалоги

| Column | Type | Description |
|--------|------|-------------|
| id | uuid | PK |
| tenant_id | uuid | FK -> elo_t_tenants |
| client_id | uuid | FK -> elo_t_clients |
| channel_id | int | FK -> elo_channels |
| external_chat_id | varchar(100) | ID чата в канале |
| vertical_id | int | FK -> elo_verticals |
| status_id | int | 1=new, 2=active, 3=closed |
| current_stage_id | int | FK -> elo_v_funnel_stages |
| stage_entered_at | timestamptz | Время входа в стадию |
| assigned_operator_id | uuid | FK -> elo_t_operators |
| context | jsonb | Контекст диалога |
| metadata | jsonb | Метаданные |
| last_message_at | timestamptz | Последнее сообщение |
| last_client_message_at | timestamptz | От клиента |
| last_operator_message_at | timestamptz | От оператора |
| created_at | timestamptz | |
| updated_at | timestamptz | |

**Constraints:**
- UNIQUE (tenant_id, client_id, channel_id)

---

### elo_t_messages
Сообщения

| Column | Type | Description |
|--------|------|-------------|
| id | uuid | PK |
| tenant_id | uuid | FK -> elo_t_tenants |
| dialog_id | uuid | FK -> elo_t_dialogs |
| client_id | uuid | FK -> elo_t_clients |
| **direction_id** | int | **1=inbound, 2=outbound** |
| message_type_id | int | 1=text, 2=media, ... |
| **actor_type** | varchar(20) | **client/operator/ai** |
| actor_id | uuid | ID актора |
| content | text | Текст сообщения |
| media | jsonb | Медиа-файлы |
| changed_graph | bool | Изменен граф? |
| external_message_id | varchar(100) | ID в канале |
| trace_id | varchar(100) | ID трассировки |
| timestamp | timestamptz | Время сообщения |
| created_at | timestamptz | |

**Direction IDs:**
- 1 = inbound (от клиента)
- 2 = outbound (от оператора/AI)

---

## Reference Tables

### elo_channels
Каналы связи

| id | code | name |
|----|------|------|
| 1 | telegram | Telegram |
| 2 | whatsapp | WhatsApp |
| 3 | avito | Avito |
| 4 | vk | VKontakte |
| 5 | max | MAX (VK Teams) |
| 6 | form | Web Form |
| 7 | phone | Phone Call |

---

### elo_t_channel_accounts
Аккаунты каналов (привязка tenant к каналу)

| Column | Type | Description |
|--------|------|-------------|
| id | uuid | PK |
| tenant_id | uuid | FK -> elo_t_tenants |
| channel_id | int | FK -> elo_channels |
| account_id | varchar(255) | ID аккаунта в канале |
| account_name | varchar(255) | Название |
| webhook_hash | varchar(64) | Hash для webhook |
| webhook_url | text | URL webhook |
| credentials | jsonb | Креденшалы |
| is_active | bool | Активен |
| last_webhook_at | timestamptz | Последний webhook |
| error_count | int | Счетчик ошибок |
| last_error | text | Последняя ошибка |
| created_at | timestamptz | |
| updated_at | timestamptz | |

---

## Supporting Tables

### elo_t_ai_extractions
Извлечения AI

### elo_t_tasks
Задачи

### elo_t_price_list
Прайс-лист

### elo_t_client_channels
Связь клиентов с каналами

### elo_verticals
Вертикали (ниши)

### elo_t_tenant_verticals
Связь tenant с вертикалями

---

## Views / Reference Data

- elo_v_funnel_stages - Стадии воронки
- elo_v_prompts - Промпты AI
- elo_v_triggers - Триггеры
- elo_v_ai_settings - Настройки AI
- elo_v_symptom_mappings - Маппинг симптомов

---

## Key Relationships

```sql
-- Tenant -> Operators -> Devices
elo_t_operators.tenant_id -> elo_t_tenants.id
elo_t_operator_devices.operator_id -> elo_t_operators.id
elo_t_operator_devices.tenant_id -> elo_t_tenants.id

-- Tenant -> Clients -> Dialogs -> Messages
elo_t_clients.tenant_id -> elo_t_tenants.id
elo_t_dialogs.tenant_id -> elo_t_tenants.id
elo_t_dialogs.client_id -> elo_t_clients.id
elo_t_dialogs.channel_id -> elo_channels.id
elo_t_dialogs.assigned_operator_id -> elo_t_operators.id
elo_t_messages.dialog_id -> elo_t_dialogs.id
elo_t_messages.client_id -> elo_t_clients.id
```

---

## Useful Queries

### Get FCM tokens for tenant operators
```sql
SELECT
  od.fcm_token,
  od.operator_id,
  o.name as operator_name
FROM elo_t_operator_devices od
JOIN elo_t_operators o ON o.id = od.operator_id
WHERE od.tenant_id = :tenant_id
  AND od.fcm_token IS NOT NULL
  AND od.device_type = 'mobile'
  AND o.is_active = true;
```

### Get dialogs for operator
```sql
SELECT
  d.id, d.status_id, d.last_message_at,
  c.name as client_name, c.phone as client_phone,
  ch.name as channel_name
FROM elo_t_dialogs d
JOIN elo_t_clients c ON c.id = d.client_id
JOIN elo_channels ch ON ch.id = d.channel_id
WHERE d.tenant_id = :tenant_id
ORDER BY d.last_message_at DESC;
```

### Get messages for dialog
```sql
SELECT
  m.id, m.content, m.direction_id, m.actor_type, m.timestamp,
  CASE WHEN m.direction_id = 1 THEN c.name ELSE o.name END as sender_name
FROM elo_t_messages m
LEFT JOIN elo_t_clients c ON c.id = m.client_id
LEFT JOIN elo_t_operators o ON o.id = m.actor_id AND m.actor_type = 'operator'
WHERE m.dialog_id = :dialog_id
ORDER BY m.timestamp ASC;
```

---

*Generated: 2025-12-20*
