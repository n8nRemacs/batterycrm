# Configurable Funnel Architecture

**Created:** 2026-01-04

---

## Principle

**"Database knows WHAT to do, LLM knows HOW to say it"**

- All behavior types are configurable in database
- All transition conditions are configurable in database
- All actions are configurable in database
- LLM only formulates text based on templates
- Zero hardcoding of business logic

---

## New Tables

### 1. elo_behavior_types

Behavior templates for funnel stages.

| Column | Type | Description |
|--------|------|-------------|
| id | SERIAL | Primary key |
| code | VARCHAR(50) | Unique code |
| name | VARCHAR(100) | Display name |
| action_template | JSONB | Actions for events (on_enter, on_message, etc.) |
| default_config | JSONB | Default configuration |
| is_system | BOOLEAN | System behavior (protected) |

**Base Behaviors:**

| Code | Description |
|------|-------------|
| `collect_iterative` | Collect fields through multiple iterations |
| `collect_batch` | Collect all fields in one message |
| `present_and_confirm` | Present info and wait for confirmation |
| `wait_external` | Wait for external event |
| `terminal_success` | Dialog completed successfully |
| `terminal_cancelled` | Dialog cancelled |
| `escalate` | Escalate to human operator |

### 2. elo_condition_operators

Operators for evaluating transition conditions.

| Column | Type | Description |
|--------|------|-------------|
| id | SERIAL | Primary key |
| code | VARCHAR(50) | Unique code |
| evaluator_type | VARCHAR(20) | expression/sql/javascript/python/workflow |
| evaluator_code | TEXT | Evaluation code |
| input_schema | JSONB | JSON Schema for operands |
| operand_count | INT | Number of operands |

**Base Operators:**

| Category | Operators |
|----------|-----------|
| Comparison | eq, neq, gt, gte, lt, lte |
| String | contains, starts_with, matches |
| Existence | exists, is_empty |
| Collection | in, not_in |
| Logical | and, or, not |
| Completion | fields_complete, completion_ratio |
| Intent | intent_is, intent_in |
| Iteration | max_iterations |

### 3. elo_action_types

Types of actions that can be executed.

| Column | Type | Description |
|--------|------|-------------|
| id | SERIAL | Primary key |
| code | VARCHAR(50) | Unique code |
| executor_type | VARCHAR(20) | internal/workflow/http/mcp |
| executor_ref | VARCHAR(255) | Reference to executor |
| config_schema | JSONB | JSON Schema for configuration |
| allows_parallel | BOOLEAN | Can run in parallel |

**Base Actions:**

| Category | Actions |
|----------|---------|
| Context | extract_context, update_context, check_completion |
| Response | generate_response, send_message |
| Stage | advance_stage, rollback_stage |
| Operator | notify_operator, escalate, forward_to_operator |
| Dialog | close_dialog, pause_dialog |
| Intent | detect_intent, route_by_intent |
| Graph | write_to_graph |
| Scheduled | send_reminder, schedule_followup |
| External | call_mcp, call_http |

### 4. elo_event_handlers

Global event handlers (replaces hardcoded on_max_iterations).

| Column | Type | Description |
|--------|------|-------------|
| id | SERIAL | Primary key |
| event_type | VARCHAR(50) | Event type |
| handler_name | VARCHAR(100) | Handler identifier |
| scope | VARCHAR(20) | global/vertical/tenant |
| scope_id | VARCHAR(50) | Scope reference |
| action_type_id | INT | Action to execute |
| action_config | JSONB | Action configuration |
| priority | INT | Execution priority |
| conditions | JSONB | Optional activation conditions |

**Event Types:**

- `max_iterations_reached`
- `timeout_reached`
- `completion_threshold_met`
- `escalation_requested`
- `intent_not_recognized`
- `extraction_failed`
- `validation_failed`
- `external_event_received`
- `operator_timeout`
- `client_inactive`

### 5. elo_stage_conditions

Configurable stage transition conditions.

| Column | Type | Description |
|--------|------|-------------|
| id | SERIAL | Primary key |
| stage_id | INT | Source stage |
| target_stage_id | INT | Target stage |
| operator_id | INT | Condition operator |
| operands | JSONB | Operands for evaluation |
| priority | INT | Evaluation order |

### 6. elo_stage_actions

Actions configured per stage.

| Column | Type | Description |
|--------|------|-------------|
| id | SERIAL | Primary key |
| stage_id | INT | Stage reference |
| trigger_event | VARCHAR(50) | on_enter/on_message/on_exit/on_timeout |
| action_type_id | INT | Action type |
| action_config | JSONB | Configuration override |
| execution_order | INT | Order in event |
| execution_group | INT | Parallel group |

---

## Modified Tables

### elo_funnel_stages

Added columns:

| Column | Type | Description |
|--------|------|-------------|
| behavior_type_id | INT | Reference to behavior template |
| stage_config | JSONB | Stage-specific configuration |
| required_context_fields | JSONB | Required fields array |
| completion_mask | BIGINT | Binary mask for tracking |

---

## Views

### elo_v_stage_config

Full stage configuration with merged behavior config.

### elo_v_stage_transitions

Stage transitions with condition details.

### elo_v_stage_actions

Stage actions with executor details.

---

## Architecture Diagram

```
┌─────────────────────────────────────────────────────────────────┐
│                    elo_behavior_types                            │
│  (collect_iterative, present_and_confirm, escalate, ...)        │
└─────────────────────────────┬───────────────────────────────────┘
                              │ behavior_type_id
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                    elo_funnel_stages                             │
│  (lead, qualification, data_collection, presentation, ...)      │
├─────────────────────────────┬───────────────────────────────────┤
│                             │                                    │
│  ┌──────────────────────────┼──────────────────────────────────┐ │
│  │       stage_id           │                                  │ │
│  ▼                          ▼                                  │ │
│  elo_stage_conditions      elo_stage_actions                   │ │
│  ├── operator_id ──────────────────────────────────────────┐   │ │
│  │                         ├── action_type_id ─────────────┼───┤ │
│  │                         │                               │   │ │
│  ▼                         ▼                               │   │ │
│  elo_condition_operators   elo_action_types                │   │ │
│  (eq, gt, fields_complete) (extract, generate, send)       │   │ │
│                                                            │   │ │
└────────────────────────────────────────────────────────────┘   │ │
                                                                  │ │
┌─────────────────────────────────────────────────────────────────┘ │
│                    elo_event_handlers                             │
│  (max_iterations_reached → escalate, timeout → remind)           │
└─────────────────────────────────────────────────────────────────┘
```

---

## Example: Phone Repair Funnel

### Stages

| Stage | Behavior | Required Fields |
|-------|----------|-----------------|
| lead | collect_batch | client_name |
| qualification | collect_iterative | device_brand, device_model |
| data_collection | collect_iterative | symptoms, problem_description |
| presentation | present_and_confirm | - |
| agreement | present_and_confirm | - |
| booking | collect_batch | preferred_date, preferred_time |
| confirmation | terminal_success | - |

### Transitions

```
lead ──[client_name exists]──> qualification
qualification ──[device fields complete]──> data_collection
data_collection ──[symptoms exists]──> presentation
presentation ──[intent=confirm]──> agreement
agreement ──[intent=confirm]──> booking
booking ──[booking fields complete]──> confirmation
```

### Actions (data_collection stage)

```
on_enter:
  1. generate_response(template: ask_problem_description)

on_message:
  Group 0 (parallel):
    - extract_context(types: symptoms, problem_description)
    - write_to_graph(nodes: Symptom, Device)

  Group 1 (after group 0):
    - check_completion(fields: symptoms)
    - [if complete] advance_stage
    - [if max_iterations] escalate
```

---

## Extensibility

### Adding New Behavior Type

```sql
INSERT INTO elo_behavior_types (code, name, action_template, default_config)
VALUES (
  'custom_survey',
  'Custom Survey',
  '{"on_enter": [...], "on_message": [...]}',
  '{"max_questions": 10}'
);
```

### Adding New Condition Operator

```sql
INSERT INTO elo_condition_operators (code, name, evaluator_type, evaluator_code)
VALUES (
  'sentiment_positive',
  'Sentiment is Positive',
  'expression',
  '${context.sentiment} > 0.7'
);
```

### Adding New Action Type

```sql
INSERT INTO elo_action_types (code, name, executor_type, executor_ref, config_schema)
VALUES (
  'send_sms',
  'Send SMS',
  'mcp',
  'mcp-sms',
  '{"type": "object", "properties": {"phone": {"type": "string"}, "message": {"type": "string"}}}'
);
```

---

## Migration File

`NEW/migrations/001_configurable_funnel_system.sql`

---

*Generated by Claude Code — 2026-01-04*
