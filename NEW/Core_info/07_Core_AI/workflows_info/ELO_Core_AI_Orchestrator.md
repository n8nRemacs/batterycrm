# ELO_Core_AI_Orchestrator

> Main controller for Context Lines processing loop

---

## General Information

| Parameter | Value |
|-----------|-------|
| **ID** | NEW (to be created) |
| **File** | `NEW/workflows/ELO_Core/ELO_Core_AI_Orchestrator.json` |
| **Trigger** | Execute Workflow Trigger |
| **Called from** | ELO_Core_Ingest |
| **Calls** | Extract → Lines Analyzer → Derive → Triggers → Stage Manager → Response Generator |

---

## Purpose

Main orchestration workflow that implements the Context Lines algorithm:

1. Load existing context (lines, focus, stage)
2. Call AI Extract for all parameters
3. Analyze and update lines
4. Derive dependent values
5. Check and execute triggers
6. Manage stage transitions
7. Generate response
8. Save updated context

---

## Input Data

**From ELO_Core_Ingest:**
```json
{
  "tenant_id": "uuid",
  "client_id": "uuid",
  "dialog_id": "uuid",
  "channel_id": 1,
  "external_chat_id": "123456789",
  "text": "Client message text",
  "timestamp": "2024-12-10T10:00:15Z",
  "trace_id": "trace_xyz789",
  "client": {
    "name": "Ivan",
    "phone": "+79991234567"
  }
}
```

---

## Output Data

**To Channel OUT (via Response Generator):**
```json
{
  "tenant_id": "uuid",
  "dialog_id": "uuid",
  "channel_id": 1,
  "external_chat_id": "123456789",
  "message": {
    "text": "AI response text",
    "buttons": []
  },
  "context_updated": true,
  "trace_id": "trace_xyz789"
}
```

---

## Nodes

### 1. Execute Workflow Trigger

Entry point from ELO_Core_Ingest.

---

### 2. Load Context

**Type:** Code Node

```javascript
const input = $input.first().json;
const dialog_id = input.dialog_id;

// Context is stored in Redis with dialog_id as key
// For MVP: fetch from Redis or create new
const contextKey = `context:${dialog_id}`;

// This will be replaced with Redis GET in production
let context = {
  tenant_id: input.tenant_id,
  client_id: input.client_id,
  dialog_id: input.dialog_id,
  vertical_id: null, // Will be detected
  current_stage: 'data_collection',

  lines: [],
  focus_line_id: null,
  completed_lines: [],

  client: input.client || {},

  message: {
    text: input.text,
    timestamp: input.timestamp
  }
};

return {
  input: input,
  context: context,
  is_new_context: context.lines.length === 0
};
```

---

### 3. → AI Extract

**Type:** Execute Workflow

| Parameter | Value |
|-----------|-------|
| **Workflow** | ELO_Core_AI_Extract |
| **Mode** | Wait for sub-workflow |

**Passes:**
```json
{
  "text": "{{ $json.input.text }}",
  "context": "{{ $json.context }}",
  "extraction_schema": {
    "entities": ["device", "symptom", "owner", "intent"],
    "multi_entity": true
  }
}
```

**Returns:**
```json
{
  "entities": [
    {"type": "device", "brand": "Apple", "model": "iPhone 14 Pro"},
    {"type": "symptom", "text": "разбит экран", "for_device": "iPhone 14 Pro"}
  ],
  "intent": "repair_request"
}
```

---

### 4. → Lines Analyzer

**Type:** Execute Workflow

| Parameter | Value |
|-----------|-------|
| **Workflow** | ELO_Core_Lines_Analyzer |
| **Mode** | Wait for sub-workflow |

**Passes:**
```json
{
  "context": "{{ $json.context }}",
  "extractions": "{{ $json.extractions }}"
}
```

**Returns:**
```json
{
  "context": {
    "lines": [...],
    "focus_line_id": "line_0",
    "lines_created": 1,
    "lines_updated": 0,
    "focus_changed": true
  }
}
```

---

### 5. → Derive Values

**Type:** Execute Workflow

| Parameter | Value |
|-----------|-------|
| **Workflow** | ELO_Core_AI_Derive |
| **Mode** | Wait for sub-workflow |

**Passes:**
```json
{
  "context": "{{ $json.context }}",
  "lines_to_derive": ["line_0"]
}
```

**Returns:**
```json
{
  "derivations": [
    {
      "line_id": "line_0",
      "derived": {
        "diagnosis": {"type_id": 2, "text": "замена дисплея"},
        "price": {"amount": 8500, "currency": "RUB"}
      }
    }
  ]
}
```

---

### 6. Apply Derivations

**Type:** Code Node

```javascript
const context = $json.context;
const derivations = $json.derivations || [];

// Apply derived values to lines
for (const deriv of derivations) {
  const line = context.lines.find(l => l.id === deriv.line_id);
  if (line && deriv.derived) {
    // Merge derived values into slots
    for (const [key, value] of Object.entries(deriv.derived)) {
      if (value && !line.slots[key]) {
        line.slots[key] = value;
        // Move cursor if slot was empty
        if (line.cursor === getSlotIndex(key)) {
          line.cursor++;
        }
      }
    }
  }
}

function getSlotIndex(slotName) {
  const slotOrder = ['device', 'symptom', 'diagnosis', 'repair_type', 'price'];
  return slotOrder.indexOf(slotName);
}

return { context };
```

---

### 7. → Triggers Checker

**Type:** Execute Workflow

| Parameter | Value |
|-----------|-------|
| **Workflow** | ELO_Core_Triggers_Checker |
| **Mode** | Wait for sub-workflow |

**Passes:**
```json
{
  "context": "{{ $json.context }}",
  "stage": "{{ $json.context.current_stage }}"
}
```

**Returns:**
```json
{
  "triggers_fired": [
    {
      "trigger_id": "uuid",
      "action": "send_file",
      "executed": true
    }
  ]
}
```

---

### 8. → Stage Manager

**Type:** Execute Workflow

| Parameter | Value |
|-----------|-------|
| **Workflow** | ELO_Core_Stage_Manager |
| **Mode** | Wait for sub-workflow |

**Passes:**
```json
{
  "context": "{{ $json.context }}"
}
```

**Returns:**
```json
{
  "context": {
    "current_stage": "presentation",
    "stage_changed": true,
    "previous_stage": "data_collection"
  }
}
```

---

### 9. → Response Generator

**Type:** Execute Workflow

| Parameter | Value |
|-----------|-------|
| **Workflow** | ELO_Core_Response_Generator |
| **Mode** | Wait for sub-workflow |

**Passes:**
```json
{
  "context": "{{ $json.context }}",
  "triggers_fired": "{{ $json.triggers_fired }}"
}
```

**Returns:**
```json
{
  "response": {
    "text": "Стоимость замены дисплея iPhone 14 Pro — 8500₽. Записать?",
    "buttons": [
      {"text": "Да, записаться", "callback_data": "book"},
      {"text": "Уточнить", "callback_data": "clarify"}
    ]
  }
}
```

---

### 10. Save Context

**Type:** Code Node + Redis

```javascript
const context = $json.context;
const response = $json.response;

// Save context to Redis
const contextKey = `context:${context.dialog_id}`;
const contextJson = JSON.stringify(context);

// TTL: 24 hours
// This will be Redis SET in production

return {
  tenant_id: context.tenant_id,
  dialog_id: context.dialog_id,
  channel_id: $('Load Context').first().json.input.channel_id,
  external_chat_id: $('Load Context').first().json.input.external_chat_id,
  message: response,
  context_updated: true,
  trace_id: $('Load Context').first().json.input.trace_id
};
```

---

### 11. → Graph Writer

**Type:** Execute Workflow

| Parameter | Value |
|-----------|-------|
| **Workflow** | ELO_Core_Graph_Writer |
| **Mode** | Fire and forget |

**Passes:**
```json
{
  "context": "{{ $json.context }}",
  "write_mode": "incremental"
}
```

---

## Flow Diagram

```
Execute Trigger
       │
       ▼
┌──────────────────┐
│  Load Context    │  ← Redis GET or create new
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│  AI Extract      │  ← Extract ALL entities from message
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│  Lines Analyzer  │  ← Create/update/switch lines
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│  Derive Values   │  ← Graph lookups for dependent slots
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│ Apply Derivations│  ← Merge into context
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│ Triggers Checker │  ← Check conditions, execute actions
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│  Stage Manager   │  ← Check stage transitions
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│Response Generator│  ← AI generates response
└────────┬─────────┘
         │
         ├──────────────────┐
         ▼                  ▼
┌──────────────────┐ ┌──────────────────┐
│  Save Context    │ │  Graph Writer    │
│    (Redis)       │ │   (Neo4j)        │
└────────┬─────────┘ └──────────────────┘
         │
         ▼
    Channel OUT
```

---

## Context Flow

```
┌─────────────────────────────────────────────────────────────────┐
│                    CONTEXT FLOW                                  │
├─────────────────────────────────────────────────────────────────┤
│                                                                  │
│  Input ──▶ Load Context ──▶ context v1                          │
│                                                                  │
│  AI Extract ──▶ extractions                                      │
│                                                                  │
│  Lines Analyzer(context v1, extractions) ──▶ context v2         │
│     • new lines created                                          │
│     • focus changed                                              │
│                                                                  │
│  Derive(context v2) ──▶ derivations                             │
│                                                                  │
│  Apply Derivations(context v2, derivations) ──▶ context v3      │
│     • slots filled with derived values                           │
│     • cursors moved                                              │
│                                                                  │
│  Triggers(context v3) ──▶ triggers_fired                        │
│     • actions executed (async)                                   │
│                                                                  │
│  Stage Manager(context v3) ──▶ context v4                       │
│     • stage may change                                           │
│     • focus may switch                                           │
│                                                                  │
│  Response Generator(context v4) ──▶ response                    │
│                                                                  │
│  Save Context(context v4) ──▶ Redis                             │
│  Graph Writer(context v4) ──▶ Neo4j                             │
│                                                                  │
└─────────────────────────────────────────────────────────────────┘
```

---

## Error Handling

| Step | Error | Action |
|------|-------|--------|
| Load Context | Redis error | Create empty context |
| AI Extract | API timeout | Log, use empty extractions |
| Lines Analyzer | Parse error | Log, keep current lines |
| Derive | Graph error | Log, skip derivations |
| Triggers | Action fails | Log, continue |
| Stage Manager | Logic error | Log, keep current stage |
| Response Generator | AI error | Return fallback response |
| Save Context | Redis error | Log (critical), retry once |
| Graph Writer | Neo4j error | Log, will be retried |

**Fallback response:**
```
"Спасибо за сообщение! Я его обработал. Что ещё могу помочь?"
```

---

## Redis Keys

| Key | TTL | Purpose |
|-----|-----|---------|
| `context:{dialog_id}` | 24h | Dialog context with lines |
| `context:lock:{dialog_id}` | 30s | Prevent concurrent processing |

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| Workflow | ELO_Core_AI_Extract | AI extraction |
| Workflow | ELO_Core_Lines_Analyzer | Lines logic |
| Workflow | ELO_Core_AI_Derive | Derivations |
| Workflow | ELO_Core_Triggers_Checker | Triggers |
| Workflow | ELO_Core_Stage_Manager | Stage transitions |
| Workflow | ELO_Core_Response_Generator | Response |
| Workflow | ELO_Core_Graph_Writer | Neo4j write |
| Redis | context:* | Context storage |
