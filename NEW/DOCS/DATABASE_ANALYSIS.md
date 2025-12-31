# Database Analysis

**Last sync:** 2025-12-31

---

## Summary

| Category | Count |
|----------|-------|
| Transactional tables (elo_t_*) | 14 |
| Reference tables (elo_*) | 11 |
| Views (elo_v_*) | 5 |
| Functions (elo_*) | 3 |
| **Total objects** | 33 |

---

## Reference Tables

### elo_channels (9 rows)

| id | code | name | supports_media | max_message_length |
|----|------|------|----------------|-------------------|
| 1 | telegram_bot | Telegram Bot | true | 4096 |
| 2 | whatsapp | WhatsApp | true | 4096 |
| 3 | avito_reverse | Avito Eldoleado | true | 4000 |
| 4 | vk | VKontakte | true | 4096 |
| 5 | max | MAX (VK Teams) | true | 4096 |
| 6 | form | Web Form | false | 10000 |
| 7 | phone | Phone Call | false | null |
| 8 | telegram_user | Telegram User | true | 4096 |
| 9 | avito_official | Avito Official | true | 4000 |

### elo_verticals (1 row)

| id | code | name | description |
|----|------|------|-------------|
| 1 | phone_repair | Phone Repair | Mobile phone repair services |

### elo_ip_nodes (2 rows)

| id | server_name | ip_address | status | notes |
|----|-------------|------------|--------|-------|
| 1 | MessagerOne | 155.212.221.189 | active | Primary IP |
| 2 | MessagerOne | 217.114.14.17 | active | Secondary IP |

---

## Transactional Tables Detail

| Table | Columns | FK | Description |
|-------|---------|-----|-------------|
| elo_t_tenants | 12 | 1 | Business accounts |
| elo_t_clients | 10 | 1 | Contacts |
| elo_t_client_channels | 8 | 2 | Client channel links |
| elo_t_dialogs | 18 | 7 | Conversations |
| elo_t_messages | 15 | 3 | Messages |
| elo_t_operators | 15 | 1 | Operators |
| elo_t_operator_devices | 16 | 2 | Mobile devices |
| elo_t_operator_channels | 7 | 2 | Operator-channel links |
| elo_t_channel_accounts | 18 | 3 | Channel credentials |
| elo_t_ai_extractions | 11 | 4 | AI extractions |
| elo_t_tasks | 19 | 6 | Tasks |
| elo_t_price_list | 20 | 3 | Price list |
| elo_t_tenant_verticals | 6 | 2 | Tenant verticals |
| elo_t_events | 5 | 0 | Events log |

---

## Core Tables Structure

### elo_t_tenants
Main tenant (business account) table.

| Column | Type | Nullable | Description |
|--------|------|----------|-------------|
| id | uuid | NO | Primary key |
| name | varchar | YES | Tenant name |
| settings | jsonb | YES | Tenant settings |
| created_at | timestamptz | YES | Created timestamp |
| updated_at | timestamptz | YES | Updated timestamp |

### elo_t_clients
Client (contact) table.

| Column | Type | Nullable | FK | Description |
|--------|------|----------|-----|-------------|
| id | uuid | NO | | Primary key |
| tenant_id | uuid | NO | elo_t_tenants | Tenant reference |
| name | varchar | YES | | Client name |
| phone | varchar | YES | | Phone number |
| email | varchar | YES | | Email |
| profile | jsonb | YES | | Additional profile data |
| stats | jsonb | YES | | Client statistics |
| neo4j_synced_at | timestamptz | YES | | Last Neo4j sync |

### elo_t_client_channels
Links clients to channels with external IDs.

| Column | Type | Nullable | FK | Description |
|--------|------|----------|-----|-------------|
| id | serial | NO | | Primary key |
| client_id | uuid | NO | elo_t_clients | Client reference |
| channel_id | int | NO | elo_channels | Channel reference |
| external_id | varchar | NO | | External ID (sender_id) |
| external_username | varchar | YES | | Username if available |
| metadata | jsonb | YES | | Additional metadata |

### elo_t_dialogs
Conversation/dialog table.

| Column | Type | Nullable | FK | Description |
|--------|------|----------|-----|-------------|
| id | uuid | NO | | Primary key |
| tenant_id | uuid | NO | elo_t_tenants | Tenant reference |
| client_id | uuid | NO | elo_t_clients | Client reference |
| channel_id | int | NO | elo_channels | Channel reference |
| channel_account_id | uuid | YES | elo_t_channel_accounts | Account reference |
| external_chat_id | varchar | YES | | External chat ID |
| vertical_id | int | YES | elo_verticals | Vertical reference |
| status_id | int | YES | | Dialog status (default 1) |
| current_stage_id | int | YES | elo_v_funnel_stages | Current funnel stage |
| assigned_operator_id | uuid | YES | elo_t_operators | Assigned operator |
| context | jsonb | YES | | Dialog context |
| metadata | jsonb | YES | | Dialog metadata |
| last_message_at | timestamptz | YES | | Last message timestamp |
| last_client_message_at | timestamptz | YES | | Last client message |
| last_operator_message_at | timestamptz | YES | | Last operator message |
| first_contact_channel_id | int | YES | elo_channels | First contact channel |
| last_client_channel_id | int | YES | elo_channels | Last client channel |

### elo_t_messages
Message table.

| Column | Type | Nullable | FK | Description |
|--------|------|----------|-----|-------------|
| id | uuid | NO | | Primary key |
| tenant_id | uuid | NO | elo_t_tenants | Tenant reference |
| dialog_id | uuid | NO | elo_t_dialogs | Dialog reference |
| client_id | uuid | YES | elo_t_clients | Client reference |
| direction_id | int | NO | | 1=incoming, 2=outgoing |
| message_type_id | int | YES | | Message type (default 1) |
| actor_type | varchar | NO | | 'client', 'operator', 'ai' |
| actor_id | uuid | YES | | Actor UUID |
| content | text | YES | | Message text |
| media | jsonb | YES | | Media attachments |
| changed_graph | boolean | YES | | Graph was updated |
| external_message_id | varchar | YES | | External message ID |
| trace_id | varchar | YES | | Trace ID |
| timestamp | timestamptz | YES | | Message timestamp |

### elo_t_channel_accounts
Channel account credentials and sessions.

| Column | Type | Nullable | FK | Description |
|--------|------|----------|-----|-------------|
| id | uuid | NO | | Primary key |
| tenant_id | uuid | NO | elo_t_tenants | Tenant reference |
| channel_id | int | NO | elo_channels | Channel reference |
| account_id | varchar | NO | | Account identifier |
| account_name | varchar | YES | | Display name |
| webhook_hash | varchar | YES | | Webhook hash |
| webhook_url | text | YES | | Webhook URL |
| credentials | jsonb | YES | | Credentials (tokens) |
| is_active | boolean | YES | | Active status |
| ip_node_id | int | YES | elo_ip_nodes | IP node reference |
| session_id | varchar | YES | | Session identifier |
| session_status | varchar | YES | | 'pending', 'active', 'connected' |
| is_official | boolean | YES | | Official API flag |
| session_archive | text | YES | | Session archive |

### Current Channel Accounts (6 rows)

| channel_id | account_id | session_id | session_status | ip_node_id |
|------------|------------|------------|----------------|------------|
| 1 | TEST_BOT_TOKEN_12345 | - | pending | - |
| 1 | remacsbot | 6939426823:AAE... | connected | - |
| 2 | eldoleado_main | eldoleado_arceos | connected | 1 |
| 2 | remaks_main | wa_22222222-... | connected | 1 |
| 3 | default | default | not_configured | - |
| 3 | 3++Dj9NEdAz81lOGAX4Kmg | - | not_configured | - |

### elo_t_operators
Operator table.

| Column | Type | Nullable | FK | Description |
|--------|------|----------|-----|-------------|
| id | uuid | NO | | Primary key |
| tenant_id | uuid | NO | elo_t_tenants | Tenant reference |
| name | varchar | NO | | Operator name |
| email | varchar | YES | | Email |
| phone | varchar | YES | | Phone |
| telegram_id | varchar | YES | | Telegram user ID |
| password_hash | varchar | YES | | Password hash |
| avatar_url | text | YES | | Avatar URL |
| role | varchar | YES | | Role (default 'operator') |
| fcm_tokens | jsonb | YES | | FCM tokens array |
| settings | jsonb | YES | | Operator settings |
| is_active | boolean | YES | | Active status |
| last_seen_at | timestamptz | YES | | Last seen |

### elo_t_operator_devices
Operator mobile devices (Android app).

| Column | Type | Nullable | FK | Description |
|--------|------|----------|-----|-------------|
| id | uuid | NO | | Primary key |
| operator_id | uuid | NO | elo_t_operators | Operator reference |
| tenant_id | uuid | NO | elo_t_tenants | Tenant reference |
| device_id | varchar | YES | | Device identifier |
| device_type | varchar | NO | | 'mobile' (default) |
| device_name | varchar | YES | | Device name |
| device_info | jsonb | YES | | Device info |
| session_token | varchar | YES | | Session token |
| fcm_token | text | YES | | Firebase token |
| app_mode | varchar | NO | | 'client' (default) |
| tunnel_url | text | YES | | Tunnel URL |
| tunnel_secret | varchar | YES | | Tunnel secret |
| is_active | boolean | YES | | Active status |
| last_active_at | timestamptz | YES | | Last active |

---

## Views

### elo_v_ip_usage
Shows IP node usage by channel type.

```sql
SELECT
    n.id AS node_id,
    n.server_name,
    n.ip_address,
    count(CASE WHEN c.code = 'whatsapp' THEN 1 END) AS whatsapp_count,
    count(CASE WHEN c.code = 'telegram' AND NOT ca.is_official THEN 1 END) AS telegram_user_count,
    count(CASE WHEN c.code = 'vk' AND NOT ca.is_official THEN 1 END) AS vk_user_count,
    count(CASE WHEN c.code = 'max' THEN 1 END) AS max_count,
    count(CASE WHEN c.code = 'avito' THEN 1 END) AS avito_count,
    count(ca.id) AS total_sessions,
    count(DISTINCT ca.tenant_id) AS tenant_count
FROM elo_ip_nodes n
LEFT JOIN elo_t_channel_accounts ca ON ca.ip_node_id = n.id AND ca.is_active
LEFT JOIN elo_channels c ON ca.channel_id = c.id
GROUP BY n.id, n.server_name, n.ip_address, n.status, n.max_sessions_per_type;
```

### elo_v_funnel_stages
Funnel stages for dialog progression.

### elo_v_prompts
AI prompts storage.

### elo_v_triggers
Dialog triggers.

### elo_v_symptom_mappings
Symptom to diagnosis mappings.

### elo_v_ai_settings
AI settings per tenant.

---

## Functions

| Function | Description |
|----------|-------------|
| elo_find_ip_for_channel | Find best IP node for channel |
| elo_update_tenant_preferred_ip | Update tenant preferred IP |
| elo_update_timestamp | Auto-update timestamps |

---

## Type Directories

### elo_symptom_types
Device symptoms (problems reported by client).

| Column | Type | Description |
|--------|------|-------------|
| id | serial | Primary key |
| uuid | uuid | UUID for Neo4j |
| code | varchar | Unique code |
| name | varchar | Name (EN) |
| name_ru | varchar | Name (RU) |
| category | varchar | Category |

### elo_diagnosis_types
Technical diagnoses.

### elo_repair_actions
Repair actions (what we do to fix).

### elo_symptom_diagnosis_links
Links symptoms to possible diagnoses.

### elo_diagnosis_repair_links
Links diagnoses to repair actions.

---

## Key Relationships

```
elo_t_tenants
    |
    +--< elo_t_clients (tenant_id)
    |       |
    |       +--< elo_t_client_channels (client_id)
    |               |
    |               +---> elo_channels (channel_id)
    |
    +--< elo_t_operators (tenant_id)
    |       |
    |       +--< elo_t_operator_devices (operator_id)
    |       |
    |       +--< elo_t_operator_channels (operator_id)
    |
    +--< elo_t_dialogs (tenant_id, client_id)
    |       |
    |       +--< elo_t_messages (dialog_id)
    |       |
    |       +--< elo_t_ai_extractions (dialog_id)
    |
    +--< elo_t_channel_accounts (tenant_id)
            |
            +---> elo_ip_nodes (ip_node_id)
            |
            +---> elo_channels (channel_id)
```

---

## Knowledge Graph Links

| PostgreSQL Table | Neo4j Label |
|-----------------|-------------|
| elo_t_clients | Client |
| elo_symptom_types | Symptom |
| elo_diagnosis_types | Diagnosis |
| elo_repair_actions | Repair |
| - | Device (brand/model) |
| - | Problem (instance) |

---

*Generated by Claude Code - 2025-12-31*
