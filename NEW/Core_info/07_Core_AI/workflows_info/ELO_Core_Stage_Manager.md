# ELO_Core_Stage_Manager

> Manages funnel stage transitions and focus switching

---

## General Information

| Parameter | Value |
|-----------|-------|
| **ID** | NEW (to be created) |
| **File** | `NEW/workflows/ELO_Core/ELO_Core_Stage_Manager.json` |
| **Trigger** | Execute Workflow Trigger |
| **Called from** | ELO_Core_AI_Orchestrator |
| **Calls** | None (pure logic) |

---

## Purpose

Manage dialog progression through funnel stages:

1. Check if current stage exit conditions are met
2. Determine next stage
3. Handle line completion and focus switching
4. Update context with new stage

---

## Funnel Stages

```
┌─────────────────────────────────────────────────────────┐
│                    FUNNEL STAGES                        │
├─────────────────────────────────────────────────────────┤
│                                                         │
│  ┌─────────────────────────────────────────────────┐   │
│  │  STAGE 1: data_collection                       │   │
│  │  Goal: Collect device, symptom, price info      │   │
│  │  Exit: All lines have device + symptom          │   │
│  └──────────────────────┬──────────────────────────┘   │
│                         │                               │
│                         ▼                               │
│  ┌─────────────────────────────────────────────────┐   │
│  │  STAGE 2: presentation                          │   │
│  │  Goal: Show price, options, terms               │   │
│  │  Exit: Client acknowledged price/info           │   │
│  └──────────────────────┬──────────────────────────┘   │
│                         │                               │
│                         ▼                               │
│  ┌─────────────────────────────────────────────────┐   │
│  │  STAGE 3: agreement                             │   │
│  │  Goal: Confirm client agrees to proceed         │   │
│  │  Exit: Client says yes to booking               │   │
│  └──────────────────────┬──────────────────────────┘   │
│                         │                               │
│                         ▼                               │
│  ┌─────────────────────────────────────────────────┐   │
│  │  STAGE 4: booking                               │   │
│  │  Goal: Collect date, time, contact info         │   │
│  │  Exit: All booking slots filled                 │   │
│  └──────────────────────┬──────────────────────────┘   │
│                         │                               │
│                         ▼                               │
│  ┌─────────────────────────────────────────────────┐   │
│  │  STAGE 5: confirmation                          │   │
│  │  Goal: Final confirmation                       │   │
│  │  Exit: Client confirms → CREATE INTAKE          │   │
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
    "dialog_id": "uuid",
    "vertical_id": 1,
    "current_stage": "data_collection",
    "stage_entered_at": "2024-12-10T10:00:00Z",
    "lines": [
      {
        "id": "line_0",
        "status": "done",
        "cursor": 5,
        "slots": {
          "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
          "symptom": {"text": "разбит экран"},
          "diagnosis": {"code": "display_replacement"},
          "repair_type": {"code": "replace_display"},
          "price": {"amount": 8500}
        }
      }
    ],
    "focus_line_id": "line_0",
    "completed_lines": ["line_0"],
    "booking": {
      "date": null,
      "time": null,
      "name": "Ivan",
      "phone": "+79991234567"
    }
  }
}
```

---

## Output Data

```json
{
  "context": {
    "current_stage": "presentation",
    "stage_entered_at": "2024-12-10T10:05:00Z",
    "previous_stage": "data_collection"
  },
  "stage_changed": true,
  "transition": {
    "from": "data_collection",
    "to": "presentation",
    "reason": "all_lines_complete"
  }
}
```

---

## Nodes

### 1. Execute Workflow Trigger

Entry point from Orchestrator.

---

### 2. Load Stage Configuration

**Type:** Code Node

```javascript
// Stage configuration (can be moved to DB/Graph later)
const STAGE_CONFIG = {
  data_collection: {
    code: 'data_collection',
    name: 'Сбор данных',
    order: 1,
    required_slots: ['device', 'symptom'],
    optional_slots: ['diagnosis', 'repair_type', 'price'],
    exit_conditions: {
      type: 'all_lines_complete',
      required_slots: ['device', 'symptom']
    },
    next_stage: 'presentation'
  },

  presentation: {
    code: 'presentation',
    name: 'Презентация',
    order: 2,
    required_slots: ['offer_shown'],
    exit_conditions: {
      type: 'slot_filled',
      slot: 'offer_acknowledged'
    },
    next_stage: 'agreement'
  },

  agreement: {
    code: 'agreement',
    name: 'Согласование',
    order: 3,
    required_slots: ['ready_to_book'],
    exit_conditions: {
      type: 'intent_detected',
      intent: 'agree_to_book'
    },
    next_stage: 'booking'
  },

  booking: {
    code: 'booking',
    name: 'Запись',
    order: 4,
    required_slots: ['date', 'time', 'name', 'phone'],
    exit_conditions: {
      type: 'all_slots_filled',
      slots: ['date', 'time', 'name', 'phone']
    },
    next_stage: 'confirmation'
  },

  confirmation: {
    code: 'confirmation',
    name: 'Подтверждение',
    order: 5,
    required_slots: ['confirmed'],
    exit_conditions: {
      type: 'intent_detected',
      intent: 'confirm'
    },
    next_stage: null,  // Final stage
    on_complete: 'create_intake'
  }
};

const context = $input.first().json.context;
const currentStage = context.current_stage || 'data_collection';
const stageConfig = STAGE_CONFIG[currentStage];

return {
  context: context,
  current_stage_config: stageConfig,
  all_stages: STAGE_CONFIG
};
```

---

### 3. Check Exit Conditions

**Type:** Code Node (Main Logic)

```javascript
const context = $json.context;
const stageConfig = $json.current_stage_config;
const allStages = $json.all_stages;

let shouldTransition = false;
let transitionReason = null;

// Check exit conditions based on type
const exitCond = stageConfig?.exit_conditions;

if (exitCond) {
  switch (exitCond.type) {

    case 'all_lines_complete':
      // All lines must have required slots filled
      const requiredSlots = exitCond.required_slots || ['device', 'symptom'];
      const allComplete = context.lines.every(line => {
        return requiredSlots.every(slot => {
          return line.slots[slot] !== null && line.slots[slot] !== undefined;
        });
      });
      shouldTransition = allComplete && context.lines.length > 0;
      if (shouldTransition) {
        transitionReason = 'all_lines_complete';
      }
      break;

    case 'slot_filled':
      // Specific slot must be filled
      const slotName = exitCond.slot;
      shouldTransition = context[slotName] !== null && context[slotName] !== undefined;
      if (shouldTransition) {
        transitionReason = `slot_filled:${slotName}`;
      }
      break;

    case 'all_slots_filled':
      // All specified slots must be filled
      const slots = exitCond.slots || [];
      const booking = context.booking || {};
      const allFilled = slots.every(slot => {
        return booking[slot] !== null && booking[slot] !== undefined;
      });
      shouldTransition = allFilled;
      if (shouldTransition) {
        transitionReason = 'all_booking_slots_filled';
      }
      break;

    case 'intent_detected':
      // Check last AI extraction for intent
      const lastIntent = context.last_intent;
      shouldTransition = lastIntent === exitCond.intent;
      if (shouldTransition) {
        transitionReason = `intent:${exitCond.intent}`;
      }
      break;
  }
}

return {
  context: context,
  current_stage_config: stageConfig,
  all_stages: allStages,
  should_transition: shouldTransition,
  transition_reason: transitionReason
};
```

---

### 4. Handle Transition

**Type:** IF Node

**Condition:** `$json.should_transition === true`

- **TRUE** → Update Stage
- **FALSE** → Check Focus

---

### 5a. Update Stage (TRUE branch)

**Type:** Code Node

```javascript
const context = $json.context;
const stageConfig = $json.current_stage_config;
const transitionReason = $json.transition_reason;

const previousStage = context.current_stage;
const nextStage = stageConfig.next_stage;

// Update context
context.previous_stage = previousStage;
context.current_stage = nextStage;
context.stage_entered_at = new Date().toISOString();

// Handle final stage completion
let finalAction = null;
if (!nextStage && stageConfig.on_complete) {
  finalAction = stageConfig.on_complete;
}

return {
  context: context,
  stage_changed: true,
  transition: {
    from: previousStage,
    to: nextStage,
    reason: transitionReason
  },
  final_action: finalAction
};
```

---

### 5b. Check Focus (FALSE branch)

**Type:** Code Node

```javascript
const context = $json.context;

// Check if focus needs to switch
let focusChanged = false;
let newFocusLine = null;

// Get current focus line
const focusLine = context.lines.find(l => l.id === context.focus_line_id);

// If focus line is done, switch to next waiting
if (focusLine && focusLine.status === 'done') {
  const waitingLine = context.lines.find(l => l.status === 'waiting');
  if (waitingLine) {
    // Switch focus
    focusLine.status = 'done';  // Confirm done
    waitingLine.status = 'active';
    context.focus_line_id = waitingLine.id;
    focusChanged = true;
    newFocusLine = waitingLine.id;
  }
}

// If no focus set, set to first non-done line
if (!context.focus_line_id && context.lines.length > 0) {
  const firstActive = context.lines.find(l => l.status !== 'done');
  if (firstActive) {
    firstActive.status = 'active';
    context.focus_line_id = firstActive.id;
    focusChanged = true;
    newFocusLine = firstActive.id;
  }
}

return {
  context: context,
  stage_changed: false,
  focus_changed: focusChanged,
  new_focus_line: newFocusLine
};
```

---

### 6. Handle Final Action

**Type:** IF Node

**Condition:** `$json.final_action !== null`

- **TRUE** → Execute Final Action
- **FALSE** → Return Result

---

### 7. Execute Final Action (create_intake)

**Type:** Code Node

```javascript
const context = $json.context;
const finalAction = $json.final_action;

if (finalAction === 'create_intake') {
  // Prepare intake data
  const intakes = context.lines.map(line => ({
    tenant_id: context.tenant_id,
    dialog_id: context.dialog_id,
    client_id: context.client_id,
    device: line.slots.device,
    symptom: line.slots.symptom,
    diagnosis: line.slots.diagnosis,
    repair_type: line.slots.repair_type,
    price: line.slots.price,
    booking: context.booking,
    status: 'confirmed'
  }));

  return {
    context: context,
    stage_changed: $json.stage_changed,
    transition: $json.transition,
    final_action: finalAction,
    intakes_to_create: intakes
  };
}

return $json;
```

---

### 8. Merge Results

**Type:** Merge Node

Combines TRUE and FALSE branches.

---

### 9. Return Result

**Type:** Code Node

```javascript
const context = $json.context;

return {
  context: context,
  stage_changed: $json.stage_changed || false,
  transition: $json.transition || null,
  focus_changed: $json.focus_changed || false,
  final_action: $json.final_action || null,
  intakes_to_create: $json.intakes_to_create || null
};
```

---

## Flow Diagram

```
Execute Trigger
       │
       ▼
┌──────────────────────┐
│ Load Stage Config    │
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│ Check Exit Conditions│
└──────────┬───────────┘
           │
           ▼
    ┌──────────────┐
    │ Should       │
    │ Transition?  │
    └──────┬───────┘
           │
     ┌─────┴─────┐
     │           │
    YES          NO
     │           │
     ▼           ▼
┌─────────┐ ┌─────────┐
│ Update  │ │ Check   │
│ Stage   │ │ Focus   │
└────┬────┘ └────┬────┘
     │           │
     │           │
     ▼           │
┌─────────┐      │
│ Final   │      │
│ Action? │      │
└────┬────┘      │
     │           │
   ┌─┴─┐         │
   │YES│         │
   └─┬─┘         │
     ▼           │
┌─────────┐      │
│ Create  │      │
│ Intake  │      │
└────┬────┘      │
     │           │
     └─────┬─────┘
           │
           ▼
     ┌───────────┐
     │  Merge    │
     └─────┬─────┘
           │
           ▼
      Return result
```

---

## Exit Conditions Reference

### all_lines_complete

```javascript
{
  type: 'all_lines_complete',
  required_slots: ['device', 'symptom']
}

// Passes when: every line has device AND symptom filled
```

### slot_filled

```javascript
{
  type: 'slot_filled',
  slot: 'offer_acknowledged'
}

// Passes when: context.offer_acknowledged is not null
```

### all_slots_filled

```javascript
{
  type: 'all_slots_filled',
  slots: ['date', 'time', 'name', 'phone']
}

// Passes when: all booking slots are filled
```

### intent_detected

```javascript
{
  type: 'intent_detected',
  intent: 'agree_to_book'
}

// Passes when: last AI extraction detected 'agree_to_book' intent
// Intents: agree_to_book, confirm, decline, clarify, cancel
```

---

## Stage-Specific Slot Requirements

### data_collection (Stage 1)

| Slot | Required | Per-Line |
|------|----------|----------|
| device | yes | yes |
| symptom | yes | yes |
| diagnosis | no (derived) | yes |
| repair_type | no (derived) | yes |
| price | no (derived) | yes |

### presentation (Stage 2)

| Slot | Required | Per-Line |
|------|----------|----------|
| offer_shown | yes | no |
| offer_acknowledged | yes (for exit) | no |

### agreement (Stage 3)

| Slot | Required | Per-Line |
|------|----------|----------|
| ready_to_book | yes (intent) | no |

### booking (Stage 4)

| Slot | Required | Per-Line |
|------|----------|----------|
| date | yes | no |
| time | yes | no |
| name | yes | no |
| phone | yes | no |

### confirmation (Stage 5)

| Slot | Required | Per-Line |
|------|----------|----------|
| confirmed | yes (intent) | no |

---

## Focus Switching Logic

```
┌─────────────────────────────────────────────────────────┐
│                 FOCUS SWITCHING                          │
├─────────────────────────────────────────────────────────┤
│                                                         │
│  1. Check current focus line                            │
│     └── Is it done (all required slots filled)?         │
│                                                         │
│  2. If done:                                            │
│     └── Find first line with status='waiting'           │
│     └── Switch focus to it                              │
│     └── Set its status to 'active'                      │
│                                                         │
│  3. If no waiting lines:                                │
│     └── All lines complete                              │
│     └── Trigger stage transition check                  │
│                                                         │
│  4. Special case: client switches context               │
│     └── "а по Samsung" → find Samsung line              │
│     └── Switch focus regardless of completion           │
│                                                         │
└─────────────────────────────────────────────────────────┘
```

---

## Final Action: create_intake

When Stage 5 (confirmation) completes:

1. Create intake record for each line
2. Create task for operator
3. Send confirmation to client
4. Mark dialog as "intake_created"

```javascript
// Intake data structure
{
  tenant_id: "uuid",
  dialog_id: "uuid",
  client_id: "uuid",
  vertical_id: 1,

  // From line
  device: { brand: "Apple", model: "iPhone 14 Pro" },
  symptom: { text: "разбит экран", type_id: 1 },
  diagnosis: { type_id: 2, text: "замена дисплея" },
  repair_type: { id: 5, code: "replace_display" },
  price: { amount: 8500, currency: "RUB" },

  // From booking
  appointment: {
    date: "2024-12-15",
    time: "14:00",
    client_name: "Ivan",
    client_phone: "+79991234567"
  },

  status: "confirmed",
  created_at: "2024-12-10T10:30:00Z"
}
```

---

## Error Handling

| Error | Action |
|-------|--------|
| Stage config not found | Use default (data_collection) |
| Invalid exit condition | Log, stay on current stage |
| No lines in context | Create empty line |
| Focus line not found | Reset focus to first line |

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| Input | context | Current dialog state |
| Config | STAGE_CONFIG | Stage definitions |
| Output | context | Updated dialog state |
| Output | intakes_to_create | Final intake data |
