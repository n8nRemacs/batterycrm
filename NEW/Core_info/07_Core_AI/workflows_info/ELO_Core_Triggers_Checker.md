# ELO_Core_Triggers_Checker

> Checks trigger conditions and executes actions (send file, notify operator, etc.)

---

## General Information

| Parameter | Value |
|-----------|-------|
| **ID** | NEW (to be created) |
| **File** | `NEW/workflows/ELO_Core/ELO_Core_Triggers_Checker.json` |
| **Trigger** | Execute Workflow Trigger |
| **Called from** | ELO_Core_AI_Orchestrator |
| **Calls** | Graph Tool, Action Executors |

---

## Purpose

Execute automated actions based on context conditions:

1. Load triggers for current stage and vertical
2. Evaluate conditions against context
3. Execute matching actions (send file, notify, create task)
4. Track executed triggers to prevent duplicates

---

## Trigger Concept

```
┌─────────────────────────────────────────────────────────┐
│                      TRIGGER                            │
├─────────────────────────────────────────────────────────┤
│                                                         │
│  CONDITIONS (all must match):                           │
│  ┌─────────────────────────────────────────────────┐   │
│  │  stage = "presentation"                          │   │
│  │  device.brand = "Apple"                          │   │
│  │  repair_type.code = "battery_replace"            │   │
│  └─────────────────────────────────────────────────┘   │
│                                                         │
│                    ▼ match                              │
│                                                         │
│  ACTION:                                                │
│  ┌─────────────────────────────────────────────────┐   │
│  │  type: "send_file"                               │   │
│  │  file: "battery_care.pdf"                        │   │
│  │  message: "Вот инструкция по батарее"            │   │
│  └─────────────────────────────────────────────────┘   │
│                                                         │
└─────────────────────────────────────────────────────────┘
```

---

## Input Data

```json
{
  "context": {
    "tenant_id": "uuid",
    "vertical_id": 1,
    "current_stage": "presentation",
    "lines": [
      {
        "id": "line_0",
        "slots": {
          "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
          "repair_type": {"code": "display_replacement"}
        }
      }
    ],
    "client": {
      "name": "Ivan",
      "phone": "+79991234567"
    }
  },
  "stage": "presentation"
}
```

---

## Output Data

```json
{
  "triggers_fired": [
    {
      "trigger_id": "uuid",
      "trigger_name": "Apple display warranty info",
      "action": {
        "type": "send_file",
        "file": "apple_display_warranty.pdf",
        "message": "Важная информация о гарантии на дисплеи Apple"
      },
      "executed": true,
      "execution_time_ms": 150
    }
  ],
  "triggers_skipped": [
    {
      "trigger_id": "uuid",
      "reason": "already_executed"
    }
  ]
}
```

---

## Nodes

### 1. Execute Workflow Trigger

Entry point from Orchestrator.

---

### 2. Load Triggers for Stage

**Type:** HTTP Request (Graph Tool)

**URL:** `http://45.144.177.128:8773/query`

**Body:**
```json
{
  "query_code": "get_triggers_for_stage",
  "params": {
    "stage": "{{ $json.stage }}",
    "vertical_id": "{{ $json.context.vertical_id }}",
    "tenant_id": "{{ $json.context.tenant_id }}"
  }
}
```

**Cypher Query:**
```cypher
// Query: get_triggers_for_stage
MATCH (t:Trigger)-[:EXECUTES]->(a:Action)
WHERE t.stage = $stage
  AND (t.vertical_id = $vertical_id OR t.vertical_id IS NULL)
  AND (t.tenant_id = $tenant_id OR t.tenant_id IS NULL)
  AND t.is_active = true
RETURN t.id AS trigger_id,
       t.name AS trigger_name,
       t.conditions AS conditions,
       t.priority AS priority,
       t.once_per_dialog AS once_per_dialog,
       a.type AS action_type,
       a.params AS action_params,
       a.message AS action_message
ORDER BY
  CASE WHEN t.tenant_id = $tenant_id THEN 0 ELSE 1 END,
  t.priority ASC
```

---

### 3. Get Executed Triggers

**Type:** Code Node + Redis

```javascript
const context = $json.context;
const triggers = $json.triggers || [];

// Get already executed triggers for this dialog
const dialogId = context.dialog_id;
const executedKey = `triggers:executed:${dialogId}`;

// In production: Redis SMEMBERS executedKey
// For now: from context
const executedTriggerIds = context.executed_triggers || [];

return {
  context: context,
  triggers: triggers,
  executed_trigger_ids: executedTriggerIds
};
```

---

### 4. Evaluate Triggers

**Type:** Code Node (Main Logic)

```javascript
const context = $json.context;
const triggers = $json.triggers;
const executedIds = $json.executed_trigger_ids;

const triggersToFire = [];
const triggersSkipped = [];

// Build flat context for condition checking
function buildFlatContext(ctx) {
  const flat = {
    stage: ctx.current_stage,
    vertical_id: ctx.vertical_id,
    tenant_id: ctx.tenant_id,
    client_name: ctx.client?.name,
    client_phone: ctx.client?.phone
  };

  // Add line data (focus line)
  const focusLine = ctx.lines.find(l => l.id === ctx.focus_line_id) || ctx.lines[0];
  if (focusLine?.slots) {
    flat['device.brand'] = focusLine.slots.device?.brand;
    flat['device.model'] = focusLine.slots.device?.model;
    flat['symptom.text'] = focusLine.slots.symptom?.text;
    flat['diagnosis.code'] = focusLine.slots.diagnosis?.code;
    flat['repair_type.code'] = focusLine.slots.repair_type?.code;
    flat['price.amount'] = focusLine.slots.price?.amount;
  }

  // Add client traits
  if (ctx.client?.traits) {
    for (const trait of ctx.client.traits) {
      flat[`trait.${trait.type}`] = trait.value;
    }
  }

  return flat;
}

// Check if conditions match
function matchConditions(conditions, flatContext) {
  if (!conditions) return true;

  const condObj = typeof conditions === 'string' ? JSON.parse(conditions) : conditions;

  for (const [key, expectedValue] of Object.entries(condObj)) {
    const actualValue = flatContext[key];

    // Handle different comparison types
    if (expectedValue === null) {
      if (actualValue !== null && actualValue !== undefined) return false;
    } else if (typeof expectedValue === 'object') {
      // Advanced conditions
      if (expectedValue.$gt && !(actualValue > expectedValue.$gt)) return false;
      if (expectedValue.$lt && !(actualValue < expectedValue.$lt)) return false;
      if (expectedValue.$in && !expectedValue.$in.includes(actualValue)) return false;
      if (expectedValue.$contains && !actualValue?.includes(expectedValue.$contains)) return false;
    } else {
      // Simple equality (case-insensitive for strings)
      const actual = typeof actualValue === 'string' ? actualValue.toLowerCase() : actualValue;
      const expected = typeof expectedValue === 'string' ? expectedValue.toLowerCase() : expectedValue;
      if (actual !== expected) return false;
    }
  }

  return true;
}

const flatContext = buildFlatContext(context);

for (const trigger of triggers) {
  // Check if already executed
  if (trigger.once_per_dialog && executedIds.includes(trigger.trigger_id)) {
    triggersSkipped.push({
      trigger_id: trigger.trigger_id,
      reason: 'already_executed'
    });
    continue;
  }

  // Check conditions
  if (matchConditions(trigger.conditions, flatContext)) {
    triggersToFire.push({
      trigger_id: trigger.trigger_id,
      trigger_name: trigger.trigger_name,
      action: {
        type: trigger.action_type,
        params: typeof trigger.action_params === 'string'
          ? JSON.parse(trigger.action_params)
          : trigger.action_params,
        message: trigger.action_message
      },
      once_per_dialog: trigger.once_per_dialog
    });
  }
}

return {
  context: context,
  triggers_to_fire: triggersToFire,
  triggers_skipped: triggersSkipped
};
```

---

### 5. Execute Actions (Switch by Type)

**Type:** Switch Node

**Condition:** `$json.action.type`

| Value | Branch |
|-------|--------|
| `send_file` | → Execute Send File |
| `send_message` | → Execute Send Message |
| `notify_operator` | → Execute Notify |
| `create_task` | → Execute Create Task |
| `call_api` | → Execute API Call |

---

### 6a. Execute: Send File

**Type:** Code Node + HTTP Request

```javascript
const trigger = $json;
const context = $('Evaluate Triggers').first().json.context;
const action = trigger.action;

// Queue file send for response
// File will be attached to the AI response
return {
  trigger_id: trigger.trigger_id,
  trigger_name: trigger.trigger_name,
  action: {
    type: 'send_file',
    file: action.params?.file,
    message: action.message
  },
  executed: true,
  execution_time_ms: 0,
  queued_for_response: true
};
```

---

### 6b. Execute: Notify Operator

**Type:** HTTP Request

```javascript
const trigger = $json;
const context = $('Evaluate Triggers').first().json.context;
const action = trigger.action;

// Send notification via internal API
const notification = {
  tenant_id: context.tenant_id,
  dialog_id: context.dialog_id,
  client_id: context.client_id,
  type: action.params?.notification_type || 'info',
  title: action.params?.title || 'Уведомление',
  message: action.message,
  priority: action.params?.priority || 'normal'
};

return {
  trigger_id: trigger.trigger_id,
  notification: notification
};
```

**HTTP Request:**
```
POST http://45.144.177.128:8780/internal/notify
Body: {{ $json.notification }}
```

---

### 6c. Execute: Create Task

**Type:** Code Node + PostgreSQL

```javascript
const trigger = $json;
const context = $('Evaluate Triggers').first().json.context;
const action = trigger.action;

// Create task in elo_tasks
const task = {
  tenant_id: context.tenant_id,
  dialog_id: context.dialog_id,
  client_id: context.client_id,
  task_type: action.params?.task_type || 'follow_up',
  title: action.params?.title || 'Автозадача',
  description: action.message,
  priority: action.params?.priority || 'normal',
  due_at: action.params?.due_hours
    ? new Date(Date.now() + action.params.due_hours * 3600000).toISOString()
    : null
};

return {
  trigger_id: trigger.trigger_id,
  task: task
};
```

**PostgreSQL:**
```sql
INSERT INTO elo_tasks (
  tenant_id, dialog_id, client_id, task_type,
  title, description, priority, due_at,
  created_at, created_by_type
)
VALUES (
  '{{ $json.task.tenant_id }}',
  '{{ $json.task.dialog_id }}',
  '{{ $json.task.client_id }}',
  '{{ $json.task.task_type }}',
  '{{ $json.task.title }}',
  '{{ $json.task.description }}',
  '{{ $json.task.priority }}',
  {{ $json.task.due_at ? `'${$json.task.due_at}'` : 'NULL' }},
  NOW(),
  'trigger'
)
RETURNING id;
```

---

### 7. Aggregate Results

**Type:** Code Node

```javascript
const items = $input.all();
const context = $('Evaluate Triggers').first().json.context;
const skipped = $('Evaluate Triggers').first().json.triggers_skipped;

const fired = items.map(item => ({
  trigger_id: item.json.trigger_id,
  trigger_name: item.json.trigger_name,
  action: item.json.action,
  executed: item.json.executed || true,
  execution_time_ms: item.json.execution_time_ms || 0,
  queued_for_response: item.json.queued_for_response || false
}));

return {
  triggers_fired: fired,
  triggers_skipped: skipped
};
```

---

### 8. Mark Triggers Executed

**Type:** Code Node + Redis

```javascript
const fired = $json.triggers_fired;
const context = $('Evaluate Triggers').first().json.context;

// Mark once_per_dialog triggers as executed
// Redis SADD triggers:executed:{dialog_id} trigger_id

const toMark = fired
  .filter(t => t.once_per_dialog)
  .map(t => t.trigger_id);

return {
  triggers_fired: $json.triggers_fired,
  triggers_skipped: $json.triggers_skipped,
  marked_executed: toMark
};
```

---

## Flow Diagram

```
Execute Trigger
       │
       ▼
┌──────────────────┐
│ Load Triggers    │  ← Graph: get triggers for stage
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│ Get Executed     │  ← Redis: already fired triggers
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│ Evaluate Triggers│  ← Check conditions against context
└────────┬─────────┘
         │
         ▼
┌──────────────────────────────────────┐
│           Execute Actions             │
│  ┌──────────┐ ┌──────────┐ ┌────────┐│
│  │send_file │ │ notify   │ │ task   ││
│  └──────────┘ └──────────┘ └────────┘│
└────────────────────┬─────────────────┘
                     │
                     ▼
              ┌──────────────────┐
              │ Aggregate Results│
              └────────┬─────────┘
                       │
                       ▼
              ┌──────────────────┐
              │ Mark Executed    │  ← Redis SADD
              └────────┬─────────┘
                       │
                       ▼
                  Return result
```

---

## Trigger Conditions Reference

### Condition Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `=` (default) | Exact match | `{"stage": "presentation"}` |
| `$gt` | Greater than | `{"price.amount": {"$gt": 5000}}` |
| `$lt` | Less than | `{"price.amount": {"$lt": 10000}}` |
| `$in` | In array | `{"device.brand": {"$in": ["Apple", "Samsung"]}}` |
| `$contains` | String contains | `{"symptom.text": {"$contains": "экран"}}` |
| `null` | Is null | `{"diagnosis.code": null}` |

### Available Context Fields

| Field | Type | Description |
|-------|------|-------------|
| `stage` | string | Current funnel stage |
| `vertical_id` | number | Vertical ID |
| `tenant_id` | uuid | Tenant ID |
| `device.brand` | string | Device brand |
| `device.model` | string | Device model |
| `symptom.text` | string | Symptom text |
| `diagnosis.code` | string | Diagnosis code |
| `repair_type.code` | string | Repair type code |
| `price.amount` | number | Price amount |
| `client_name` | string | Client name |
| `client_phone` | string | Client phone |
| `trait.*` | any | Client traits |

---

## Action Types Reference

### send_file

```json
{
  "type": "send_file",
  "params": {
    "file": "battery_care.pdf",
    "file_url": "https://..."
  },
  "message": "Вот полезная информация"
}
```

### send_message

```json
{
  "type": "send_message",
  "params": {
    "template": "warranty_info"
  },
  "message": "Гарантия на ремонт — 6 месяцев"
}
```

### notify_operator

```json
{
  "type": "notify_operator",
  "params": {
    "notification_type": "alert",
    "title": "VIP клиент",
    "priority": "high"
  },
  "message": "Клиент с историей > 5 обращений"
}
```

### create_task

```json
{
  "type": "create_task",
  "params": {
    "task_type": "call_back",
    "title": "Перезвонить клиенту",
    "priority": "high",
    "due_hours": 2
  },
  "message": "Клиент просил перезвонить"
}
```

### call_api

```json
{
  "type": "call_api",
  "params": {
    "url": "https://external.api/endpoint",
    "method": "POST",
    "body": {"client_id": "{{client_id}}"}
  },
  "message": null
}
```

---

## Neo4j Trigger Schema

```cypher
// Create trigger
CREATE (t:Trigger {
  id: randomUUID(),
  name: 'Apple battery care info',
  stage: 'presentation',
  vertical_id: 1,
  tenant_id: null,
  conditions: '{"device.brand": "Apple", "repair_type.code": "battery_replace"}',
  priority: 10,
  once_per_dialog: true,
  is_active: true,
  created_at: datetime()
})

// Create action
CREATE (a:Action {
  id: randomUUID(),
  type: 'send_file',
  params: '{"file": "battery_care.pdf"}',
  message: 'Инструкция по уходу за батареей Apple'
})

// Link
MATCH (t:Trigger {name: 'Apple battery care info'})
MATCH (a:Action {type: 'send_file', message: 'Инструкция по уходу за батареей Apple'})
CREATE (t)-[:EXECUTES]->(a)
```

---

## Error Handling

| Error | Action |
|-------|--------|
| Graph query fails | Skip triggers, log error |
| Condition parse error | Skip trigger, log |
| Action execution fails | Log, mark as failed |
| Redis unavailable | Continue, risk duplicate |

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| External | Graph Tool (8773) | Load triggers |
| Redis | triggers:executed:* | Track executed |
| PostgreSQL | elo_tasks | Create tasks |
| Internal API | /internal/notify | Send notifications |
