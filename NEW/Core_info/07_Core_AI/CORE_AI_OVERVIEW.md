# Core AI — Overview

> Context Lines: Multi-intake dialog processing with funnel stages

**Date:** 2025-12-12
**Status:** Design Complete, Implementation Pending

---

## Philosophy

```
"People talk. Machine keeps records."

Old approach: Extract → Save → Respond (single entity)
New approach: Extract ALL → Analyze Lines → Derive → Respond (multi-entity)
```

**Key insight:** Client may mention multiple devices/issues in one dialog. System tracks each as separate "line" (intake).

---

## Language: English Only

**IMPORTANT:** Core AI works entirely in English.

```
┌─────────────────────────────────────────────────────────────────┐
│  Input Contour                                                   │
│  ┌─────────────────────────────────────────────────────────────┐│
│  │  ELO_Input_Processor                                         ││
│  │       │                                                      ││
│  │       ├── Merge Batch                                        ││
│  │       │                                                      ││
│  │       ├── **Translate to EN** (OpenRouter Qwen3)            ││
│  │       │       text_original → text (EN)                      ││
│  │       │       + detect lang                                  ││
│  │       │                                                      ││
│  │       └── Call Client Resolve → Core AI                      ││
│  └─────────────────────────────────────────────────────────────┘│
└─────────────────────────────────────────────────────────────────┘
                              ↓
┌─────────────────────────────────────────────────────────────────┐
│  CORE AI (English only)                                          │
│  - All prompts in English                                        │
│  - All extraction in English                                     │
│  - All responses generated in English                            │
└─────────────────────────────────────────────────────────────────┘
                              ↓
┌─────────────────────────────────────────────────────────────────┐
│  Output Contour                                                  │
│  ┌─────────────────────────────────────────────────────────────┐│
│  │  ELO_Out_Router                                              ││
│  │       │                                                      ││
│  │       ├── **Translate to Original Language**                 ││
│  │       │       text (EN) → text (client's lang)               ││
│  │       │                                                      ││
│  │       └── Channel OUT (Telegram, WhatsApp, etc.)             ││
│  └─────────────────────────────────────────────────────────────┘│
└─────────────────────────────────────────────────────────────────┘
```

### Message Fields

| Field | Description |
|-------|-------------|
| `text` | Current working text (EN after input translation) |
| `text_original` | Original client message (any language) |
| `lang` | Detected language code (ru, en, etc.) |

### Why English?

1. **Unified prompts** — no need to maintain prompts in multiple languages
2. **Better AI performance** — English training data is more extensive
3. **Analytics** — all data in one language for analysis
4. **Graph queries** — symptom/diagnosis matching works in English

---

## Context Lines Model

```
┌─────────────────────────────────────────────────────────┐
│                      CONTEXT                            │
│                                                         │
│  Line 0: ●──●──●──○──○  (cursor=3, waiting)            │
│  Line 1: ●──●──●──●──✓  (done)                         │
│  Line 2: ●──○──○──○──○  (cursor=1, active) ← focus     │
│                                                         │
│  ● = filled slot, ○ = empty slot, ✓ = complete         │
└─────────────────────────────────────────────────────────┘

Line   = intake with slots [device, symptom, owner, price]
Cursor = current position (which slot to ask next)
Focus  = active line being processed
Waiting = lines with incomplete slots (paused)
```

### Line States

| State | Description | Action |
|-------|-------------|--------|
| **active** | Currently focused, asking questions | AI asks for cursor slot |
| **waiting** | Has empty slots, but not focused | Will be switched to when focus done |
| **done** | All required slots filled | Ready for next stage |

---

## Core AI Algorithm

```
┌─────────────────────────────────────────────────────────────────┐
│                    CORE AI — MAIN LOOP                          │
├─────────────────────────────────────────────────────────────────┤
│                                                                  │
│  1. RECEIVE message from client                                 │
│                                                                  │
│  2. AI EXTRACT — extract ALL parameters from message            │
│     {device: ?, symptom: ?, owner: ?, ...}                      │
│     Note: Extract EVERYTHING at once, not one-by-one            │
│                                                                  │
│  3. ANALYZE lines:                                               │
│     ┌─────────────────────────────────────────────────────────┐ │
│     │  new owner/device? → CREATE new line                    │ │
│     │  existing line's owner/device? → SWITCH focus           │ │
│     │  fill ALL matching slots in appropriate line            │ │
│     │  move cursor forward                                    │ │
│     └─────────────────────────────────────────────────────────┘ │
│                                                                  │
│  4. DERIVE — calculate dependent values                         │
│     symptom → diagnosis → repair_type → price                   │
│                                                                  │
│  5. CHECK TRIGGERS — execute actions if conditions met          │
│     (send file, notify operator, create task, etc.)             │
│                                                                  │
│  6. CHECK LINE STATUS:                                           │
│     ┌─────────────────────────────────────────────────────────┐ │
│     │  current line done? → remove from waiting               │ │
│     │  all lines done? → advance to next funnel stage         │ │
│     │  has waiting lines? → switch focus to first waiting     │ │
│     └─────────────────────────────────────────────────────────┘ │
│                                                                  │
│  7. ASK — generate question for cursor slot of active line      │
│                                                                  │
└─────────────────────────────────────────────────────────────────┘
```

---

## Funnel Stages

```
┌─────────────────────────────────────────────────────────┐
│  STAGE 1: Data Collection                               │
│  slots: [device, symptom, owner, price]                 │
│  goal: Collect all required info for each intake        │
├─────────────────────────────────────────────────────────┤
│  STAGE 2: Presentation                                  │
│  slots: [offer_shown]                                   │
│  triggers: send price, send info based on device        │
├─────────────────────────────────────────────────────────┤
│  STAGE 3: Agreement                                     │
│  slots: [conditions_ok, ready_to_book]                  │
│  goal: Confirm client agrees with terms                 │
├─────────────────────────────────────────────────────────┤
│  STAGE 4: Booking                                       │
│  slots: [date, time, name, phone]                       │
│  goal: Schedule appointment                             │
├─────────────────────────────────────────────────────────┤
│  STAGE 5: Confirmation                                  │
│  slots: [confirmed]                                     │
│  result: INTAKE CREATED → operator notification         │
└─────────────────────────────────────────────────────────┘
```

### Stage Transitions

```
Stage 1 (all lines done) → Stage 2
Stage 2 (offer shown)    → Stage 3
Stage 3 (agreed)         → Stage 4
Stage 4 (booked)         → Stage 5
Stage 5 (confirmed)      → COMPLETE (create task)
```

---

## Slot Schema (phone_repair vertical)

### Stage 1: Data Collection

| Slot | Type | Required | Derivable | Source |
|------|------|----------|-----------|--------|
| `device.brand` | string | yes | no | AI extraction |
| `device.model` | string | yes | no | AI extraction |
| `device.color` | string | no | no | AI extraction |
| `symptom` | string | yes | no | AI extraction |
| `diagnosis` | string | no | yes | Graph lookup |
| `repair_type` | string | no | yes | Graph lookup |
| `price` | number | no | yes | Price lookup |
| `owner` | string | no | no | AI extraction or "self" |

### Stage 4: Booking

| Slot | Type | Required | Derivable | Source |
|------|------|----------|-----------|--------|
| `client.name` | string | yes | no | AI extraction or existing |
| `client.phone` | string | yes | no | Channel (WhatsApp) or AI |
| `appointment.date` | date | yes | no | AI extraction |
| `appointment.time` | time | yes | no | AI extraction |

---

## Dependency Graph (Derivations)

```
┌────────────────────────────────────────────────────────┐
│                 DERIVATION CHAIN                        │
├────────────────────────────────────────────────────────┤
│                                                         │
│   symptom_text                                          │
│        │                                                │
│        ▼ (Graph lookup: ALIAS_OF)                       │
│   symptom_type_id                                       │
│        │                                                │
│        ▼ (Graph lookup: INDICATES)                      │
│   diagnosis_type_id                                     │
│        │                                                │
│        ▼ (Graph lookup: REQUIRES)                       │
│   repair_action_id                                      │
│        │                                                │
│        ├─────────────────────┐                          │
│        ▼                     ▼                          │
│   device.model          repair_action                   │
│        │                     │                          │
│        └─────────┬───────────┘                          │
│                  ▼ (Price lookup)                       │
│             price_range                                 │
│                                                         │
└────────────────────────────────────────────────────────┘
```

### Cypher Query Examples

**Symptom → Diagnosis:**
```cypher
MATCH (s:SymptomType)<-[:ALIAS_OF*0..1]-(alias)
WHERE alias.name_ru =~ $symptom_text
MATCH (s)-[:INDICATES]->(d:DiagnosisType)
RETURN d.id, d.name_ru, d.code
```

**Diagnosis → Repair → Price:**
```cypher
MATCH (d:DiagnosisType {id: $diagnosis_type_id})-[:REQUIRES]->(r:RepairAction)
MATCH (m:DeviceModel {name: $device_model})-[:HAS_PRICE]->(p:Price)-[:FOR_REPAIR]->(r)
RETURN r.id, r.name_ru, r.code, p.amount, p.currency
```

---

## Triggers System

### Trigger Definition (stored in Neo4j)

```cypher
(:Trigger {
  id: uuid,
  stage: "presentation",
  conditions: {
    device_brand: "Apple",
    repair_type: "battery_replace"
  }
})-[:EXECUTES]->(:Action {
  type: "send_file",
  file: "battery_care.pdf",
  message: "Вот инструкция по уходу за батареей"
})
```

### Trigger Types

| Type | Description | Example |
|------|-------------|---------|
| `send_file` | Send PDF/image to client | Battery care guide |
| `send_message` | Send predefined message | Warranty info |
| `notify_operator` | Alert operator | VIP client detected |
| `create_task` | Create task in system | Parts order |
| `call_api` | External API call | Check parts availability |

### Trigger Check (after each message)

```javascript
async function checkTriggers(context) {
  const triggers = await graph.query('get_triggers_for_stage', {
    stage: context.current_stage,
    vertical_id: context.vertical_id
  });

  for (const trigger of triggers) {
    if (matchesConditions(trigger.conditions, context)) {
      await executeAction(trigger.action);
    }
  }
}
```

---

## n8n Workflows Architecture

```
┌─────────────────────────────────────────────────────────────────┐
│                     CORE AI WORKFLOWS                            │
├─────────────────────────────────────────────────────────────────┤
│                                                                  │
│  ELO_Core_Ingest (webhook)                                       │
│       │                                                          │
│       ▼                                                          │
│  ELO_Core_AI_Orchestrator ──────────────────────────┐            │
│       │                                              │            │
│       ├──▶ ELO_Core_AI_Extract (all parameters)     │            │
│       │         │                                    │            │
│       │         ▼                                    │            │
│       ├──▶ ELO_Core_Lines_Analyzer                   │            │
│       │         │                                    │            │
│       │         ▼                                    │            │
│       ├──▶ ELO_Core_AI_Derive (graph lookups)       │            │
│       │         │                                    │            │
│       │         ▼                                    │            │
│       ├──▶ ELO_Core_Triggers_Checker                │            │
│       │         │                                    │            │
│       │         ▼                                    │            │
│       ├──▶ ELO_Core_Stage_Manager                   │            │
│       │         │                                    │            │
│       │         ▼                                    │            │
│       └──▶ ELO_Core_Response_Generator              │            │
│                 │                                    │            │
│                 ▼                                    │            │
│            ELO_Core_Graph_Writer ◀───────────────────┘            │
│                 │                                                 │
│                 ▼                                                 │
│            Channel OUT (ELO_Out_*)                               │
│                                                                  │
└─────────────────────────────────────────────────────────────────┘
```

---

## Workflows List (NEW)

| # | Workflow | Purpose | Status |
|---|----------|---------|--------|
| 1 | ELO_Core_Ingest | Entry point, validation | Exists |
| 2 | ELO_Core_AI_Orchestrator | Main loop controller | NEW |
| 3 | ELO_Core_AI_Extract | Extract all parameters | Update |
| 4 | ELO_Core_Lines_Analyzer | Analyze/create/switch lines | NEW |
| 5 | ELO_Core_AI_Derive | Derive dependent values | NEW |
| 6 | ELO_Core_Triggers_Checker | Check and execute triggers | NEW |
| 7 | ELO_Core_Stage_Manager | Manage funnel stages | NEW |
| 8 | ELO_Core_Response_Generator | Generate AI response | NEW |
| 9 | ELO_Core_Graph_Writer | Write to Neo4j | Exists |

---

## Data Structures

### Context Object

```json
{
  "tenant_id": "uuid",
  "client_id": "uuid",
  "dialog_id": "uuid",
  "vertical_id": 1,
  "current_stage": "data_collection",

  "lines": [
    {
      "id": "line_0",
      "status": "waiting",
      "cursor": 3,
      "slots": {
        "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
        "symptom": {"text": "разбит экран", "type_id": 1},
        "diagnosis": {"type_id": 2, "text": "замена дисплея"},
        "repair_type": null,
        "price": null
      }
    },
    {
      "id": "line_1",
      "status": "active",
      "cursor": 1,
      "slots": {
        "device": {"brand": "Samsung", "model": "Galaxy S23"},
        "symptom": null,
        "diagnosis": null,
        "repair_type": null,
        "price": null
      }
    }
  ],

  "focus_line_id": "line_1",
  "completed_lines": [],

  "client": {
    "name": "Ivan",
    "phone": "+79991234567"
  },

  "message": {
    "text": "original message",
    "timestamp": "..."
  }
}
```

### Extraction Result

```json
{
  "entities": [
    {
      "type": "device",
      "brand": "Apple",
      "model": "iPhone 14 Pro",
      "confidence": 0.95
    },
    {
      "type": "device",
      "brand": "Samsung",
      "model": "Galaxy S23",
      "confidence": 0.9
    },
    {
      "type": "symptom",
      "text": "разбит экран",
      "for_device": "iPhone 14 Pro",
      "confidence": 0.85
    }
  ],
  "intent": "repair_multiple",
  "raw_response": "..."
}
```

### Derivation Result

```json
{
  "line_id": "line_0",
  "derived": {
    "diagnosis": {
      "type_id": 2,
      "text": "замена оригинального дисплея",
      "source": "graph_lookup"
    },
    "repair_type": {
      "id": 5,
      "code": "display_replacement",
      "text": "Замена дисплея"
    },
    "price": {
      "amount": 8500,
      "currency": "RUB",
      "source": "price_list"
    }
  }
}
```

---

## Performance & Cost

### Scaling

```
1000 tenants × 50 dialogs/day × 40 messages = 2M messages/day

Python FastAPI async: 2-3 pods sufficient
OpenRouter Qwen3-30B: paid tier, no rate limit
```

### AI Cost Estimate

| Operation | Model | Cost per 1K tokens | Daily volume | Daily cost |
|-----------|-------|-------------------|--------------|------------|
| Extract | Qwen3-30B | $0.0003 | 2M × 0.5K = 1B | ~$5 |
| Response | Claude 3.5 | $0.003 | 500K × 1K = 500M | ~$74 |
| **Total** | | | | **~$79/day** |

**Per tenant:** ~$2.40/month for AI

---

## Implementation Phases

### Phase 1: Context Lines (current)

1. Line data structure
2. AI Extract for all parameters (multi-entity)
3. Lines Analyzer (create/switch logic)
4. Focus/waiting/cursor management
5. Derive dependent slots

### Phase 2: Funnel Stages

1. Stage schema in graph
2. Stage transitions
3. Per-stage slot schemas

### Phase 3: Triggers

1. Trigger schema in graph
2. Condition checking
3. Action execution

### Phase 4: Integration

1. Connect all workflows
2. Context flow between nodes
3. Full E2E test

---

## Neo4j Schema Extensions

### New Node Types

```cypher
// Trigger definition
CREATE (t:Trigger {
  id: randomUUID(),
  stage: 'presentation',
  conditions: '{"device_brand": "Apple"}',
  tenant_id: $tenant_id
})

// Action definition
CREATE (a:Action {
  id: randomUUID(),
  type: 'send_file',
  params: '{"file": "battery_care.pdf"}',
  message: 'Инструкция по батарее'
})

// Link trigger to action
MATCH (t:Trigger {id: $trigger_id})
MATCH (a:Action {id: $action_id})
CREATE (t)-[:EXECUTES]->(a)
```

### New Relationships

| Relationship | From | To | Purpose |
|--------------|------|-----|---------|
| `EXECUTES` | Trigger | Action | Trigger-action binding |
| `ALIAS_OF` | SymptomAlias | SymptomType | Symptom normalization |
| `INDICATES` | SymptomType | DiagnosisType | Symptom → Diagnosis |
| `REQUIRES` | DiagnosisType | RepairAction | Diagnosis → Repair |
| `HAS_PRICE` | DeviceModel | Price | Device-specific pricing |
| `FOR_REPAIR` | Price | RepairAction | Price for repair type |

---

## Test Scenarios

### Scenario 1: Single Device

```
Client: "Разбил экран на iPhone 14 Pro"

Expected:
- Create Line 0: {device: iPhone 14 Pro, symptom: разбит экран}
- Derive: diagnosis=display_replacement, price=8500
- Response: "Стоимость замены дисплея iPhone 14 Pro — 8500₽. Записать?"
```

### Scenario 2: Multiple Devices

```
Client: "У меня iPhone разбит экран и Samsung не заряжается"

Expected:
- Create Line 0: {device: iPhone, symptom: разбит экран}
- Create Line 1: {device: Samsung, symptom: не заряжается}
- Focus on Line 0 first
- Response: "По iPhone — какая модель?"
```

### Scenario 3: Context Switch

```
Client: "iPhone 14 Pro"
(processing Line 0: device = iPhone 14 Pro)

Client: "А по Samsung — Galaxy S23"
Expected:
- Switch focus to Line 1
- Fill: device = Galaxy S23
- Response: "Понял, Samsung Galaxy S23. Что с ним?"
```

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| Database | PostgreSQL | Dialog state, messages |
| Database | Neo4j | Graph (devices, symptoms, triggers) |
| External | OpenRouter | AI models |
| Cache | Redis | Context cache |

---

**Next:** See individual workflow documentation:
- [ELO_Core_AI_Orchestrator.md](workflows_info/ELO_Core_AI_Orchestrator.md)
- [ELO_Core_Lines_Analyzer.md](workflows_info/ELO_Core_Lines_Analyzer.md)
- [ELO_Core_AI_Derive.md](workflows_info/ELO_Core_AI_Derive.md)
- [ELO_Core_Triggers_Checker.md](workflows_info/ELO_Core_Triggers_Checker.md)
- [ELO_Core_Stage_Manager.md](workflows_info/ELO_Core_Stage_Manager.md)
- [ELO_Core_Response_Generator.md](workflows_info/ELO_Core_Response_Generator.md)
