# ELO_Core_AI_Derive

> Derives dependent slot values using Graph lookups (symptom → diagnosis → repair → price)

---

## General Information

| Parameter | Value |
|-----------|-------|
| **ID** | NEW (to be created) |
| **File** | `NEW/workflows/ELO_Core/ELO_Core_AI_Derive.json` |
| **Trigger** | Execute Workflow Trigger |
| **Called from** | ELO_Core_AI_Orchestrator |
| **Calls** | Graph Tool (Neo4j queries) |

---

## Purpose

Calculate dependent slot values from filled slots:

1. **symptom_text → symptom_type_id** (normalize via aliases)
2. **symptom_type_id → diagnosis_type_id** (graph relationship)
3. **diagnosis_type_id → repair_action_id** (graph relationship)
4. **device_model + repair_action → price** (price lookup)

---

## Derivation Chain

```
┌────────────────────────────────────────────────────────┐
│                 DERIVATION CHAIN                        │
├────────────────────────────────────────────────────────┤
│                                                         │
│   symptom.text ("разбит экран")                        │
│        │                                                │
│        ▼ Graph: ALIAS_OF                               │
│   symptom_type_id (1: screen_cracked)                  │
│        │                                                │
│        ▼ Graph: INDICATES                              │
│   diagnosis_type_id (2: display_replacement)           │
│        │                                                │
│        ▼ Graph: REQUIRES                               │
│   repair_action_id (5: replace_display)                │
│        │                                                │
│        └─────────────┐                                  │
│                      │                                  │
│   device.model  ─────┼───▶ Price lookup                │
│   ("iPhone 14 Pro")  │                                  │
│                      ▼                                  │
│                price (8500 RUB)                        │
│                                                         │
└────────────────────────────────────────────────────────┘
```

---

## Input Data

```json
{
  "context": {
    "tenant_id": "uuid",
    "vertical_id": 1,
    "lines": [
      {
        "id": "line_0",
        "slots": {
          "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
          "symptom": {"text": "разбит экран"},
          "diagnosis": null,
          "repair_type": null,
          "price": null
        }
      }
    ]
  },
  "lines_to_derive": ["line_0"]
}
```

---

## Output Data

```json
{
  "derivations": [
    {
      "line_id": "line_0",
      "derived": {
        "symptom_type": {
          "id": 1,
          "code": "screen_cracked",
          "name_ru": "Разбит экран"
        },
        "diagnosis": {
          "type_id": 2,
          "code": "display_replacement",
          "text": "Требуется замена дисплея"
        },
        "repair_type": {
          "id": 5,
          "code": "replace_display",
          "text": "Замена дисплея",
          "is_original": true
        },
        "price": {
          "amount": 8500,
          "currency": "RUB",
          "source": "price_list",
          "is_estimate": false
        }
      },
      "derivation_path": ["symptom→type", "type→diagnosis", "diagnosis→repair", "repair+device→price"]
    }
  ]
}
```

---

## Nodes

### 1. Execute Workflow Trigger

Entry point from Orchestrator.

---

### 2. Filter Lines for Derivation

**Type:** Code Node

```javascript
const context = $json.context;
const linesToDerive = $json.lines_to_derive || [];

// Get lines that need derivation
const lines = context.lines.filter(line => {
  // Include if specified in lines_to_derive
  if (linesToDerive.length > 0) {
    return linesToDerive.includes(line.id);
  }
  // Or if has symptom but no diagnosis
  return line.slots?.symptom && !line.slots?.diagnosis;
});

return {
  context: context,
  lines: lines
};
```

---

### 3. Split Lines

**Type:** SplitInBatches

Process each line separately for parallel derivation.

---

### 4. Normalize Symptom → Get Type

**Type:** HTTP Request (Graph Tool)

**URL:** `http://45.144.177.128:8773/query`

**Body:**
```json
{
  "query_code": "normalize_symptom",
  "params": {
    "symptom_text": "{{ $json.line.slots.symptom.text }}",
    "vertical_id": "{{ $json.context.vertical_id }}"
  }
}
```

**Cypher Query (in cypher_queries table):**
```cypher
// Query: normalize_symptom
MATCH (alias:SymptomAlias)
WHERE toLower(alias.text) CONTAINS toLower($symptom_text)
   OR toLower($symptom_text) CONTAINS toLower(alias.text)
MATCH (alias)-[:ALIAS_OF]->(st:SymptomType)
WHERE st.vertical_id = $vertical_id OR st.vertical_id IS NULL
RETURN st.id AS type_id, st.code AS code, st.name_ru AS name
ORDER BY
  CASE WHEN toLower(alias.text) = toLower($symptom_text) THEN 0 ELSE 1 END,
  length(alias.text) DESC
LIMIT 1
```

---

### 5. Get Diagnosis from Symptom

**Type:** HTTP Request (Graph Tool)

**URL:** `http://45.144.177.128:8773/query`

**Body:**
```json
{
  "query_code": "symptom_to_diagnosis",
  "params": {
    "symptom_type_id": "{{ $json.symptom_type.type_id }}"
  }
}
```

**Cypher Query:**
```cypher
// Query: symptom_to_diagnosis
MATCH (st:SymptomType {id: $symptom_type_id})-[:INDICATES]->(dt:DiagnosisType)
RETURN dt.id AS type_id, dt.code AS code, dt.name_ru AS name, dt.description AS description
LIMIT 1
```

---

### 6. Get Repair from Diagnosis

**Type:** HTTP Request (Graph Tool)

**URL:** `http://45.144.177.128:8773/query`

**Body:**
```json
{
  "query_code": "diagnosis_to_repair",
  "params": {
    "diagnosis_type_id": "{{ $json.diagnosis.type_id }}"
  }
}
```

**Cypher Query:**
```cypher
// Query: diagnosis_to_repair
MATCH (dt:DiagnosisType {id: $diagnosis_type_id})-[:REQUIRES]->(ra:RepairAction)
RETURN ra.id AS id, ra.code AS code, ra.name_ru AS name, ra.is_original_required AS is_original
LIMIT 1
```

---

### 7. Get Price for Repair + Device

**Type:** HTTP Request (Graph Tool)

**URL:** `http://45.144.177.128:8773/query`

**Body:**
```json
{
  "query_code": "get_repair_price",
  "params": {
    "device_model": "{{ $json.device.model }}",
    "device_brand": "{{ $json.device.brand }}",
    "repair_action_id": "{{ $json.repair.id }}",
    "tenant_id": "{{ $json.context.tenant_id }}"
  }
}
```

**Cypher Query:**
```cypher
// Query: get_repair_price
MATCH (dm:DeviceModel)
WHERE toLower(dm.name) CONTAINS toLower($device_model)
  AND toLower(dm.brand) = toLower($device_brand)
MATCH (dm)-[:HAS_PRICE]->(p:Price)-[:FOR_REPAIR]->(ra:RepairAction {id: $repair_action_id})
WHERE p.tenant_id = $tenant_id OR p.tenant_id IS NULL
RETURN p.amount AS amount, p.currency AS currency, p.is_estimate AS is_estimate
ORDER BY
  CASE WHEN p.tenant_id = $tenant_id THEN 0 ELSE 1 END
LIMIT 1
```

---

### 8. Aggregate Derivations

**Type:** Code Node

```javascript
const items = $input.all();

const derivations = items.map(item => {
  const json = item.json;

  return {
    line_id: json.line_id,
    derived: {
      symptom_type: json.symptom_type || null,
      diagnosis: json.diagnosis ? {
        type_id: json.diagnosis.type_id,
        code: json.diagnosis.code,
        text: json.diagnosis.name || json.diagnosis.description
      } : null,
      repair_type: json.repair ? {
        id: json.repair.id,
        code: json.repair.code,
        text: json.repair.name,
        is_original: json.repair.is_original || false
      } : null,
      price: json.price ? {
        amount: json.price.amount,
        currency: json.price.currency || 'RUB',
        source: 'price_list',
        is_estimate: json.price.is_estimate || false
      } : null
    },
    derivation_path: buildDerivationPath(json)
  };
});

function buildDerivationPath(json) {
  const path = [];
  if (json.symptom_type) path.push('symptom→type');
  if (json.diagnosis) path.push('type→diagnosis');
  if (json.repair) path.push('diagnosis→repair');
  if (json.price) path.push('repair+device→price');
  return path;
}

return { derivations };
```

---

## Flow Diagram

```
Execute Trigger
       │
       ▼
┌──────────────────┐
│ Filter Lines     │  ← Select lines needing derivation
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│  Split Lines     │  ← Process each line
└────────┬─────────┘
         │ (for each line)
         ▼
┌──────────────────┐
│ Normalize Symptom│  ← Graph: text → SymptomType
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│  Get Diagnosis   │  ← Graph: SymptomType → DiagnosisType
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│   Get Repair     │  ← Graph: DiagnosisType → RepairAction
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│   Get Price      │  ← Graph: Device + Repair → Price
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│   Aggregate      │  ← Combine all derivations
└────────┬─────────┘
         │
         ▼
    Return derivations
```

---

## Graph Schema for Derivations

### Node Types

```cypher
(:SymptomAlias {
  id: uuid,
  text: "разбит экран",
  language: "ru"
})

(:SymptomType {
  id: uuid,
  code: "screen_cracked",
  name_ru: "Разбит экран",
  vertical_id: 1
})

(:DiagnosisType {
  id: uuid,
  code: "display_replacement",
  name_ru: "Требуется замена дисплея",
  description: "...",
  vertical_id: 1
})

(:RepairAction {
  id: uuid,
  code: "replace_display",
  name_ru: "Замена дисплея",
  is_original_required: true,
  vertical_id: 1
})

(:DeviceModel {
  id: uuid,
  brand: "Apple",
  name: "iPhone 14 Pro",
  category: "smartphone"
})

(:Price {
  id: uuid,
  amount: 8500,
  currency: "RUB",
  tenant_id: uuid | null,
  is_estimate: false
})
```

### Relationships

```cypher
// Symptom normalization
(alias:SymptomAlias)-[:ALIAS_OF]->(type:SymptomType)

// Symptom → Diagnosis
(type:SymptomType)-[:INDICATES]->(diag:DiagnosisType)

// Diagnosis → Repair
(diag:DiagnosisType)-[:REQUIRES]->(repair:RepairAction)

// Device → Price
(device:DeviceModel)-[:HAS_PRICE]->(price:Price)

// Price → Repair
(price:Price)-[:FOR_REPAIR]->(repair:RepairAction)
```

---

## Fallback Strategy

### If No Exact Match

| Step | Fallback |
|------|----------|
| Symptom → Type | Use AI to classify |
| Type → Diagnosis | Return most common for vertical |
| Diagnosis → Repair | Return most common for diagnosis |
| Price | Return null, mark as "needs quote" |

### Confidence Levels

```javascript
const derivation = {
  diagnosis: {
    type_id: 2,
    text: "Замена дисплея",
    confidence: 0.9,  // High: exact match
    source: "graph"
  }
};

// Confidence levels:
// 1.0 - exact match in graph
// 0.8 - fuzzy match (alias)
// 0.6 - AI classification
// 0.4 - statistical guess
```

---

## Price Lookup Logic

### Priority Order

1. **Tenant-specific price** (tenant_id matches)
2. **Default price** (tenant_id IS NULL)
3. **Estimate** (is_estimate = true)
4. **No price** (return null)

### Price Response

```json
{
  "price": {
    "amount": 8500,
    "currency": "RUB",
    "source": "price_list",
    "is_estimate": false,
    "valid_until": "2025-01-01"
  }
}

// Or if no exact price:
{
  "price": {
    "amount": 8000,
    "currency": "RUB",
    "source": "estimate",
    "is_estimate": true,
    "range": {"min": 7000, "max": 9000}
  }
}
```

---

## Error Handling

| Error | Action |
|-------|--------|
| Graph connection failed | Return empty derivations, log |
| No symptom type found | Use AI fallback (if enabled) |
| No diagnosis found | Return partial derivation |
| No price found | Mark price as null |
| Multiple matches | Use first by priority |

---

## Caching

### Redis Cache Keys

| Key | TTL | Purpose |
|-----|-----|---------|
| `derive:symptom:{hash}` | 1h | Symptom normalization |
| `derive:diag:{symptom_id}` | 1h | Symptom → Diagnosis |
| `derive:repair:{diag_id}` | 1h | Diagnosis → Repair |
| `derive:price:{device}:{repair}:{tenant}` | 5m | Price (short TTL for accuracy) |

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| External | Graph Tool (8773) | Neo4j queries |
| Table | cypher_queries | Query definitions |
| Redis | derive:* | Derivation cache |
