# Database Analysis

**Last sync:** 2026-01-04 (post-RBAC migration)

---

## Summary

| Category | Count |
|----------|-------|
| Reference tables (elo_*) | 40 |
| Transactional tables (elo_t_*) | 19 |
| Materialized tables (elo_v_*) | 8 |
| Domain tables (elo_d_*) | 2 |
| Views (actual) | 5 |
| **Total objects** | **74** |

---

## NEW: RBAC System

### elo_permission_scopes (4 rows)

| level | code | name |
|-------|------|------|
| 1 | domain | Domain (highest) |
| 2 | vertical | Vertical |
| 3 | tenant | Tenant |
| 4 | operator | Operator |

### elo_roles (8 rows)

| scope | code | name |
|-------|------|------|
| domain | supervisor | Supervisor (full access) |
| domain | domain_admin | Domain Admin |
| vertical | vertical_admin | Vertical Admin |
| vertical | vertical_manager | Vertical Manager |
| tenant | tenant_owner | Tenant Owner |
| tenant | tenant_admin | Tenant Admin |
| operator | operator | Operator |
| operator | operator_senior | Senior Operator |

### elo_resources (22 rows)

| category | resources |
|----------|-----------|
| system | domains, verticals, global_config, prompts, behavior_types, executor_types |
| config | funnel_stages, context_types, intent_types, price_rules, tenant.settings, tenant.channels, tenant.operators |
| billing | tenant.billing |
| data | dialogs, messages, clients, analytics, reports |
| ai | mode_override, generation, extraction |

### elo_actions (7 rows)

| code | description |
|------|-------------|
| read | View access |
| create | Create records |
| update | Modify records |
| delete | Delete records |
| execute | Execute actions |
| delegate | Delegate to lower level |
| admin | Full admin access |

### elo_permissions (102 rows)

Role-resource-action mappings.

### elo_user_roles (1 row)

| email | role | scope |
|-------|------|-------|
| admin@eldoleado.ru | supervisor | domain |

### elo_admin_users (1 row)

Domain/vertical level admin accounts.

### elo_permission_audit (0 rows)

Audit log for permission changes.

---

## Configurable Funnel Tables

### elo_behavior_types (7 rows)

| code | name |
|------|------|
| collect_iterative | Iterative Collection |
| collect_batch | Batch Collection |
| present_and_confirm | Present and Confirm |
| wait_external | Wait for External |
| terminal_success | Terminal Success |
| terminal_cancelled | Terminal Cancelled |
| escalate | Escalate to Operator |

### elo_condition_operators (20 rows)

| Category | Operators |
|----------|-----------|
| Comparison | eq, neq, gt, gte, lt, lte |
| String | contains, starts_with |
| Existence | exists, is_empty |
| Collection | in, not_in |
| Logical | and, or, not |
| Completion | fields_complete, completion_ratio |
| Intent | intent_is, intent_in |
| Iteration | max_iterations |

### elo_executor_types (17 rows)

| Category | Executors |
|----------|-----------|
| Context | extract_context, update_context, check_completion |
| Response | generate_response, send_message |
| Stage | advance_stage, rollback_stage |
| Operator | notify_operator, escalate, forward_to_operator |
| Dialog | close_dialog |
| Intent | detect_intent, route_by_intent |
| Graph | write_to_graph |
| External | call_mcp, call_http |

### elo_event_handlers (5 rows)

| event_type | handler | executor |
|------------|---------|----------|
| max_iterations_reached | default_escalate | escalate |
| timeout_reached | send_reminder | send_reminder |
| timeout_reached | close_if_no_response | close_dialog |
| intent_not_recognized | ask_clarification | generate_response |
| client_inactive | send_followup | send_reminder |

---

## Reference Data

### elo_channels (9 rows)

| id | code | name |
|----|------|------|
| 1 | telegram_bot | Telegram Bot |
| 2 | whatsapp | WhatsApp |
| 3 | avito_reverse | Avito Eldoleado |
| 4 | vk | VKontakte |
| 5 | max | MAX (VK Teams) |
| 6 | form | Web Form |
| 7 | phone | Phone Call |
| 8 | telegram_user | Telegram User |
| 9 | avito_official | Avito Official |

### elo_domains (3 rows)

| id | code | name |
|----|------|------|
| 1 | electronics | Electronics |
| 2 | auto | Automotive |
| 3 | software | Software |

### elo_verticals (2 rows)

| id | domain_id | code | name |
|----|-----------|------|------|
| 1 | 1 | phone_repair | Phone Repair |
| 2 | 1 | repair | Repair |

### elo_funnel_stages (7 rows)

| code | behavior_type_id | is_required |
|------|------------------|-------------|
| lead | collect_iterative | true |
| qualification | collect_iterative | true |
| data_collection | collect_iterative | true |
| presentation | present_and_confirm | false |
| agreement | wait_external | false |
| booking | collect_iterative | false |
| confirmation | wait_external | false |

### elo_t_tenants (2 rows)

| name | slug | domain_id |
|------|------|-----------|
| Default Tenant | - | 1 |
| Test Repair Shop | test-repair | 1 |

---

## Table Categories

### Reference Tables (elo_*) — 40 tables

| Group | Tables |
|-------|--------|
| RBAC | elo_permission_scopes, elo_resources, elo_actions, elo_roles, elo_permissions, elo_user_roles, elo_admin_users, elo_permission_audit |
| Funnel | elo_behavior_types, elo_condition_operators, elo_executor_types, elo_event_handlers, elo_stage_conditions, elo_stage_actions, elo_funnel_stages, elo_funnel_stage_workers, elo_stage_fields, elo_stage_cta_actions |
| AI | elo_action_types, elo_context_types, elo_intent_types, elo_prompts, elo_meta_prompts, elo_worker_configs |
| Reference | elo_channels, elo_domains, elo_verticals, elo_ip_nodes |
| Graph | elo_symptom_types, elo_diagnosis_types, elo_repair_actions, elo_problem_categories, elo_symptom_diagnosis_links, elo_diagnosis_repair_links |
| Other | elo_triggers, elo_trigger_types, elo_normalization_rules, elo_custom_fields, elo_cypher_queries, elo_auto_generation_log, elo_dialog_field_tracking |

### Transactional Tables (elo_t_*) — 19 tables

| Table | Description |
|-------|-------------|
| elo_t_tenants | Business accounts |
| elo_t_clients | Client contacts |
| elo_t_client_channels | Client-channel links |
| elo_t_dialogs | Conversations |
| elo_t_messages | Messages |
| elo_t_operators | Operators |
| elo_t_operator_devices | Operator devices |
| elo_t_operator_channels | Operator-channel links |
| elo_t_channel_accounts | Channel credentials |
| elo_t_ai_extractions | AI extractions |
| elo_t_tasks | Tasks |
| elo_t_price_list | Price list |
| elo_t_events | Event log |
| elo_t_tenant_domains | Tenant domains |
| elo_t_tenant_verticals | Tenant verticals |
| elo_t_context_type_overrides | Context type overrides |
| elo_t_custom_field_overrides | Custom field overrides |
| elo_t_funnel_custom_stages | Custom funnel stages |
| elo_t_funnel_stage_overrides | Stage overrides |

### Domain Tables (elo_d_*) — 2 tables

| Table | Description |
|-------|-------------|
| elo_d_context_types | Domain-level context types |
| elo_d_intent_types | Domain-level intent types |

### Views — 13 objects (5 actual views)

| Name | Type | Description |
|------|------|-------------|
| elo_v_effective_permissions | VIEW | **NEW** Effective permissions |
| elo_v_ip_usage | VIEW | IP node usage |
| elo_v_stage_actions_new | VIEW | Stage actions |
| elo_v_stage_config_new | VIEW | Stage config |
| elo_v_stage_transitions | VIEW | Stage transitions |
| elo_v_ai_settings | TABLE | AI settings |
| elo_v_context_types | TABLE | Merged context types |
| elo_v_funnel_stages | TABLE | Merged funnel stages |
| elo_v_intent_types | TABLE | Merged intent types |
| elo_v_prompts | TABLE | Active prompts |
| elo_v_symptom_mappings | TABLE | Symptom mappings |
| elo_v_triggers | TABLE | Active triggers |
| elo_verticals | TABLE | Verticals |

---

## Key Relationships

```
elo_permission_scopes
    │
    └──< elo_roles (scope_id)
            │
            ├──< elo_permissions (role_id)
            │       └──> elo_resources (resource_id)
            │
            └──< elo_user_roles (role_id)
                    ├──> elo_t_operators (operator_id)
                    └──> elo_admin_users (admin_email)

elo_behavior_types
    │
    └──< elo_funnel_stages (behavior_type_id)
            │
            ├──< elo_stage_conditions (stage_id)
            │       └──> elo_condition_operators (operator_id)
            │
            └──< elo_stage_actions (stage_id)
                    └──> elo_executor_types (executor_type_id)

elo_domains
    │
    ├──< elo_verticals (domain_id)
    │
    └──< elo_t_tenants (domain_id)
            │
            ├──< elo_t_clients → elo_t_client_channels
            ├──< elo_t_operators → elo_t_operator_devices
            ├──< elo_t_dialogs → elo_t_messages
            └──< elo_t_channel_accounts
```

---

## Migrations Applied

| # | File | Date | Description |
|---|------|------|-------------|
| 002 | 002_configurable_funnel_system_v2.sql | 2026-01-04 | Funnel system |
| 003 | 003_rbac_system.sql | 2026-01-04 | RBAC system |

---

## Functions

| Function | Description |
|----------|-------------|
| elo_check_permission() | Check if user has permission |

---

*Generated by Claude Code — 2026-01-04*
