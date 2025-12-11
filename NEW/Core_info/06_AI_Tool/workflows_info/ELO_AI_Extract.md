# ELO_AI_Extract

> n8n Polygon — Proxy to AI Tool /extract endpoint

---

## General Information

| Parameter | Value |
|----------|----------|
| **ID** | `NEW` (to be created) |
| **File** | `NEW/workflows/ELO_AI/ELO_AI_Extract.json` |
| **Trigger** | Webhook POST `/webhook/elo-ai-extract` |
| **Called from** | Core Contour workflows |
| **Calls** | AI Tool MCP (8774) /extract |

---

## Purpose

n8n polygon for debugging AI extraction before direct MCP calls:

1. Receive extraction request
2. Validate input
3. Forward to AI Tool MCP
4. Return result

**Production:** Use AI Tool MCP directly (HTTP call to 8774)
**Polygon:** This n8n workflow for debugging, logging

---

## Input Data

**Request:**
```json
{
  "message": "Разбил экран на iPhone 14 Pro",
  "extraction_schema": {
    "type": "object",
    "properties": {
      "device": {
        "type": "object",
        "properties": {
          "brand": {"type": "string"},
          "model": {"type": "string"}
        }
      },
      "symptoms": {
        "type": "array",
        "items": {
          "type": "object",
          "properties": {
            "code": {"type": "string"},
            "text": {"type": "string"}
          }
        }
      }
    }
  },
  "model": "qwen/qwen3-30b-a3b",
  "trace_id": "trace_abc123"
}
```

---

## Output Data

**Response:**
```json
{
  "success": true,
  "data": {
    "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
    "symptoms": [{"code": "screen_cracked", "text": "разбил экран"}]
  },
  "execution_time_ms": 1234,
  "model_used": "qwen/qwen3-30b-a3b",
  "trace_id": "trace_abc123"
}
```

---

## Nodes

### 1. Webhook Trigger

| Parameter | Value |
|----------|----------|
| **Type** | Webhook |
| **typeVersion** | 2 |
| **Path** | `/webhook/elo-ai-extract` |
| **Method** | POST |
| **Response** | responseNode |

---

### 2. Validate Input

```javascript
const input = $input.first().json;

// Required fields
if (!input.message) {
  throw new Error('Missing required field: message');
}

if (!input.extraction_schema) {
  throw new Error('Missing required field: extraction_schema');
}

return {
  message: input.message,
  extraction_schema: input.extraction_schema,
  model: input.model || null,
  system_prompt: input.system_prompt || null,
  trace_id: input.trace_id || `trace_${Date.now()}`
};
```

---

### 3. Call AI Tool MCP

| Parameter | Value |
|----------|----------|
| **Type** | HTTP Request |
| **typeVersion** | 4.2 |
| **URL** | `http://45.144.177.128:8774/extract` |
| **Method** | POST |
| **Timeout** | 60000 |

**Body:**
```json
{
  "message": "{{ $json.message }}",
  "extraction_schema": {{ JSON.stringify($json.extraction_schema) }},
  "model": {{ $json.model ? JSON.stringify($json.model) : 'null' }},
  "system_prompt": {{ $json.system_prompt ? JSON.stringify($json.system_prompt) : 'null' }}
}
```

---

### 4. Add trace_id to Response

```javascript
const input = $('Validate Input').first().json;
const response = $input.first().json;

return {
  ...response,
  trace_id: input.trace_id
};
```

---

### 5. Respond to Webhook

Return the response to caller.

---

## Flow Diagram

```
Webhook POST /webhook/elo-ai-extract
         │
         ▼
┌─────────────────────┐
│  1. Validate Input  │  ← message, extraction_schema required
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ 2. Call AI Tool MCP │  ← HTTP POST to 8774/extract
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ 3. Add trace_id     │
└──────────┬──────────┘
           │
           ▼
    Respond to Webhook
```

---

## Extraction Schema Examples

### Device + Symptoms

```json
{
  "type": "object",
  "properties": {
    "device": {
      "type": "object",
      "properties": {
        "brand": {"type": "string", "description": "Device brand (Apple, Samsung, etc.)"},
        "model": {"type": "string", "description": "Device model"},
        "color": {"type": "string", "description": "Device color if mentioned"}
      },
      "required": ["brand", "model"]
    },
    "symptoms": {
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "code": {"type": "string", "enum": ["screen_cracked", "no_power", "no_touch", "battery_drain", "water_damage"]},
          "text": {"type": "string", "description": "Original text describing symptom"}
        }
      }
    },
    "intent": {
      "type": "string",
      "enum": ["repair", "purchase", "question", "sale"],
      "description": "Client's intent"
    }
  }
}
```

### Price Inquiry

```json
{
  "type": "object",
  "properties": {
    "is_price_inquiry": {"type": "boolean"},
    "device_mentioned": {"type": "string"},
    "repair_type": {"type": "string", "enum": ["screen", "battery", "back_glass", "camera", "other"]}
  }
}
```

---

## Error Handling

| Error | Action |
|-------|--------|
| Missing message | Return 400, validation error |
| Missing extraction_schema | Return 400, validation error |
| AI Tool timeout | Return 504, timeout error |
| AI Tool unavailable | Return 503, service unavailable |
| JSON parse error | Return with raw_response for debugging |

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| Service | AI Tool MCP (8774) | AI extraction |

---

## n8n v2.0 Compliance

| Check | Status |
|-------|--------|
| No Python Code Node | ✅ |
| No `process.env` | ✅ |
| Webhook typeVersion: 2 | ✅ |
| Code typeVersion: 2 | ✅ |
| HTTP Request typeVersion: 4.2 | ✅ |

---

**Document:** ELO_AI_Extract.md
**Date:** 2025-12-11
**Author:** Claude
**Status:** n8n polygon
