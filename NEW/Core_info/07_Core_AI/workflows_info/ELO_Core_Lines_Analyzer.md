# ELO_Core_Lines_Analyzer

> Analyzes extractions, creates/updates lines, manages focus and cursor

---

## General Information

| Parameter | Value |
|-----------|-------|
| **ID** | NEW (to be created) |
| **File** | `NEW/workflows/ELO_Core/ELO_Core_Lines_Analyzer.json` |
| **Trigger** | Execute Workflow Trigger |
| **Called from** | ELO_Core_AI_Orchestrator |
| **Calls** | None (pure logic) |

---

## Purpose

Core logic for Context Lines:

1. Match extractions to existing lines
2. Create new lines when new device/owner detected
3. Update slots in appropriate lines
4. Manage cursor positions
5. Switch focus when needed

---

## Input Data

```json
{
  "context": {
    "lines": [
      {
        "id": "line_0",
        "status": "active",
        "cursor": 2,
        "slots": {
          "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
          "symptom": null,
          "diagnosis": null,
          "repair_type": null,
          "price": null
        }
      }
    ],
    "focus_line_id": "line_0",
    "completed_lines": []
  },
  "extractions": {
    "entities": [
      {"type": "symptom", "text": "разбит экран", "for_device": "iPhone 14 Pro"},
      {"type": "device", "brand": "Samsung", "model": "Galaxy S23"}
    ]
  }
}
```

---

## Output Data

```json
{
  "context": {
    "lines": [
      {
        "id": "line_0",
        "status": "active",
        "cursor": 3,
        "slots": {
          "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
          "symptom": {"text": "разбит экран"},
          "diagnosis": null,
          "repair_type": null,
          "price": null
        }
      },
      {
        "id": "line_1",
        "status": "waiting",
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
    "focus_line_id": "line_0",
    "completed_lines": []
  },
  "changes": {
    "lines_created": 1,
    "lines_updated": 1,
    "focus_changed": false
  }
}
```

---

## Nodes

### 1. Execute Workflow Trigger

Entry point from Orchestrator.

---

### 2. Parse Input

**Type:** Code Node

```javascript
const input = $input.first().json;

return {
  context: input.context,
  entities: input.extractions?.entities || [],
  changes: {
    lines_created: 0,
    lines_updated: 0,
    focus_changed: false
  }
};
```

---

### 3. Process Entities

**Type:** Code Node (Main Logic)

```javascript
const context = $json.context;
const entities = $json.entities;
let changes = $json.changes;

// Slot order for cursor calculation
const SLOT_ORDER = ['device', 'symptom', 'diagnosis', 'repair_type', 'price'];

// Helper: find line by device match
function findLineByDevice(lines, brand, model) {
  return lines.find(line => {
    const dev = line.slots?.device;
    if (!dev) return false;
    // Fuzzy match: same brand and model contains
    return dev.brand?.toLowerCase() === brand?.toLowerCase() &&
           (dev.model?.toLowerCase().includes(model?.toLowerCase()) ||
            model?.toLowerCase().includes(dev.model?.toLowerCase()));
  });
}

// Helper: create new line
function createLine(lines, device) {
  const newLine = {
    id: `line_${lines.length}`,
    status: 'waiting',
    cursor: 1, // After device (device is index 0)
    slots: {
      device: {
        brand: device.brand,
        model: device.model,
        color: device.color || null
      },
      symptom: null,
      diagnosis: null,
      repair_type: null,
      price: null
    }
  };
  return newLine;
}

// Helper: fill slot and move cursor
function fillSlot(line, slotName, value) {
  const slotIndex = SLOT_ORDER.indexOf(slotName);

  // Only fill if empty
  if (!line.slots[slotName]) {
    line.slots[slotName] = value;

    // Move cursor if this slot is at or before cursor
    if (slotIndex <= line.cursor) {
      line.cursor = Math.max(line.cursor, slotIndex + 1);
    }
    return true;
  }
  return false;
}

// Helper: check if line is complete
function isLineComplete(line) {
  const requiredSlots = ['device', 'symptom'];
  return requiredSlots.every(slot => line.slots[slot] !== null);
}

// Process each entity
const deviceEntities = entities.filter(e => e.type === 'device');
const otherEntities = entities.filter(e => e.type !== 'device');

// Step 1: Process devices (may create new lines)
for (const device of deviceEntities) {
  const existingLine = findLineByDevice(context.lines, device.brand, device.model);

  if (!existingLine) {
    // Create new line for this device
    const newLine = createLine(context.lines, device);
    context.lines.push(newLine);
    changes.lines_created++;
  } else {
    // Update existing line's device info if more specific
    if (device.model && device.model.length > (existingLine.slots.device?.model?.length || 0)) {
      existingLine.slots.device.model = device.model;
    }
    if (device.color && !existingLine.slots.device.color) {
      existingLine.slots.device.color = device.color;
    }
    changes.lines_updated++;
  }
}

// Step 2: Process other entities (symptoms, etc.)
for (const entity of otherEntities) {
  let targetLine = null;

  // Find target line
  if (entity.for_device) {
    // Entity specifies device - find matching line
    const parts = entity.for_device.split(' ');
    targetLine = context.lines.find(line => {
      const dev = line.slots?.device;
      return dev && entity.for_device.toLowerCase().includes(dev.model?.toLowerCase());
    });
  }

  // Fallback: use focus line or first line
  if (!targetLine) {
    if (context.focus_line_id) {
      targetLine = context.lines.find(l => l.id === context.focus_line_id);
    } else {
      targetLine = context.lines[0];
    }
  }

  if (targetLine) {
    // Fill appropriate slot
    if (entity.type === 'symptom') {
      const filled = fillSlot(targetLine, 'symptom', {
        text: entity.text,
        confidence: entity.confidence || 0.8
      });
      if (filled) changes.lines_updated++;
    }
    // Add other entity types here...
  }
}

// Step 3: Update line statuses
for (const line of context.lines) {
  if (isLineComplete(line)) {
    line.status = 'done';
  } else if (line.id === context.focus_line_id) {
    line.status = 'active';
  } else {
    line.status = 'waiting';
  }
}

// Step 4: Manage focus
// If current focus line is done, switch to next waiting
const focusLine = context.lines.find(l => l.id === context.focus_line_id);
if (!focusLine || focusLine.status === 'done') {
  const nextWaiting = context.lines.find(l => l.status === 'waiting');
  if (nextWaiting) {
    nextWaiting.status = 'active';
    context.focus_line_id = nextWaiting.id;
    changes.focus_changed = true;
  } else if (context.lines.length > 0 && !context.focus_line_id) {
    // No focus set - use first line
    context.lines[0].status = 'active';
    context.focus_line_id = context.lines[0].id;
    changes.focus_changed = true;
  }
}

// Update completed_lines
context.completed_lines = context.lines
  .filter(l => l.status === 'done')
  .map(l => l.id);

return {
  context: context,
  changes: changes
};
```

---

### 4. Log Changes

**Type:** Code Node

```javascript
const context = $json.context;
const changes = $json.changes;

console.log(`Lines Analyzer: created=${changes.lines_created}, updated=${changes.lines_updated}, focus_changed=${changes.focus_changed}`);
console.log(`Current lines: ${context.lines.length}, focus: ${context.focus_line_id}`);

return $json;
```

---

## Flow Diagram

```
Execute Trigger
       │
       ▼
┌──────────────────┐
│   Parse Input    │
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│ Process Entities │  ← Main logic
│                  │
│  1. Process devices → create lines if new
│  2. Process symptoms → assign to lines
│  3. Update statuses
│  4. Manage focus
│                  │
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│   Log Changes    │
└────────┬─────────┘
         │
         ▼
    Return context
```

---

## Line Matching Algorithm

### Device Matching

```
INPUT: entity with brand="Apple", model="iPhone 14 Pro"

1. Search existing lines for matching device
   - Compare brand (case-insensitive)
   - Compare model (partial match, either contains other)

2. If found:
   - Update device if new info more specific
   - Mark line as updated

3. If not found:
   - Create new line
   - Set status="waiting"
   - Set cursor=1 (device is filled, index 0)
```

### Entity-to-Line Assignment

```
INPUT: entity with for_device="iPhone 14 Pro"

1. If entity has for_device:
   - Find line where device.model contains for_device
   - Use that line

2. If no for_device:
   - Use focus line (active)
   - Fallback: first line

3. Fill appropriate slot in target line
```

---

## Focus Management

### Focus Switch Rules

| Current Focus State | Trigger | Action |
|---------------------|---------|--------|
| Active, incomplete | New entity for different device | Stay on current |
| Active, complete (done) | — | Switch to first waiting |
| No focus | Any message | Set focus to first line |
| All lines done | — | Keep last focus, trigger stage change |

### Priority Order

```
1. Explicit switch request from client ("а по Samsung...")
2. Current focus line completed
3. First incomplete line
4. Stay on current
```

---

## Cursor Management

### Slot Order (Stage 1: Data Collection)

| Index | Slot | Description |
|-------|------|-------------|
| 0 | device | Device info (brand, model) |
| 1 | symptom | What's wrong |
| 2 | diagnosis | Determined problem |
| 3 | repair_type | Required repair |
| 4 | price | Cost |

### Cursor Movement Rules

```javascript
// Cursor starts at 0
// When slot at index N is filled:
//   - If N <= cursor, cursor = N + 1
//   - Cursor only moves forward

// Example:
// cursor=1 (waiting for symptom)
// symptom filled → cursor=2
// price filled (index 4) → cursor stays 2 (not at cursor position)
```

---

## Edge Cases

### Case 1: Multiple Devices in One Message

```
Input: "iPhone разбит экран, Samsung не заряжается"

Result:
- Line 0: device=iPhone, symptom="разбит экран"
- Line 1: device=Samsung, symptom="не заряжается"
- Focus: Line 0 (first)
```

### Case 2: Device Mentioned Second Time

```
Context: Line 0 has device=iPhone 14 Pro (cursor=1)
Input: "iPhone 14 Pro Max"

Result:
- Line 0: device updated to "iPhone 14 Pro Max" (more specific)
- No new line created
```

### Case 3: Ambiguous Symptom

```
Context: Line 0 (iPhone), Line 1 (Samsung)
Input: "не работает"

Result:
- Symptom assigned to focus line (active one)
- If no context, assigned to first line
```

### Case 4: Context Switch Request

```
Context: Line 0 (iPhone, active), Line 1 (Samsung, waiting)
Input: "а по Samsung"

Result:
- AI should detect switch intent
- Focus switched to Line 1
- Line 0 becomes waiting
```

---

## Error Handling

| Error | Action |
|-------|--------|
| No entities extracted | Return context unchanged |
| Invalid entity format | Skip entity, log warning |
| No lines exist | Create line with empty device |
| Slot type mismatch | Log, attempt conversion |

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| Input | context | Current dialog state |
| Input | extractions | AI extraction result |
| Output | context | Updated dialog state |
| Output | changes | Summary of modifications |
