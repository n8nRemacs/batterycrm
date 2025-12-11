# ELO_AI_Chat

> n8n Polygon — Proxy to AI Tool /chat endpoint

---

## General Information

| Parameter | Value |
|----------|----------|
| **ID** | `NEW` (to be created) |
| **File** | `NEW/workflows/ELO_AI/ELO_AI_Chat.json` |
| **Trigger** | Webhook POST `/webhook/elo-ai-chat` |
| **Called from** | Core Contour workflows |
| **Calls** | AI Tool MCP (8774) /chat |

---

## Purpose

n8n polygon for debugging AI chat before direct MCP calls:

1. Receive chat request with messages and optional tools
2. Validate input
3. Forward to AI Tool MCP
4. Return result with content and tool_calls

**Production:** Use AI Tool MCP directly (HTTP call to 8774)
**Polygon:** This n8n workflow for debugging, logging

---

## Input Data

**Request:**
```json
{
  "messages": [
    {"role": "system", "content": "You are a phone repair assistant..."},
    {"role": "user", "content": "Сколько стоит замена экрана iPhone 14?"}
  ],
  "tools": [
    {
      "name": "get_price",
      "description": "Get price for repair",
      "parameters": {
        "type": "object",
        "properties": {
          "device_model": {"type": "string"},
          "repair_type": {"type": "string"}
        }
      }
    }
  ],
  "model": "anthropic/claude-3-5-sonnet",
  "max_tokens": 4096,
  "temperature": 0.7,
  "trace_id": "trace_abc123"
}
```

---

## Output Data

**Response:**
```json
{
  "success": true,
  "content": "Для уточнения цены мне нужно проверить прайс.",
  "tool_calls": [
    {
      "name": "get_price",
      "arguments": {
        "device_model": "iPhone 14",
        "repair_type": "screen_replacement"
      }
    }
  ],
  "execution_time_ms": 2345,
  "model_used": "anthropic/claude-3-5-sonnet",
  "usage": {
    "prompt_tokens": 150,
    "completion_tokens": 50
  },
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
| **Path** | `/webhook/elo-ai-chat` |
| **Method** | POST |
| **Response** | responseNode |

---

### 2. Validate Input

```javascript
const input = $input.first().json;

// Required fields
if (!input.messages || !Array.isArray(input.messages) || input.messages.length === 0) {
  throw new Error('Missing required field: messages (non-empty array)');
}

// Validate message format
for (const msg of input.messages) {
  if (!msg.role || !msg.content) {
    throw new Error('Each message must have role and content');
  }
}

return {
  messages: input.messages,
  tools: input.tools || null,
  model: input.model || null,
  max_tokens: input.max_tokens || 4096,
  temperature: input.temperature || 0.7,
  trace_id: input.trace_id || `trace_${Date.now()}`
};
```

---

### 3. Call AI Tool MCP

| Parameter | Value |
|----------|----------|
| **Type** | HTTP Request |
| **typeVersion** | 4.2 |
| **URL** | `http://45.144.177.128:8774/chat` |
| **Method** | POST |
| **Timeout** | 120000 |

**Body:**
```json
{
  "messages": {{ JSON.stringify($json.messages) }},
  "tools": {{ $json.tools ? JSON.stringify($json.tools) : 'null' }},
  "model": {{ $json.model ? JSON.stringify($json.model) : 'null' }},
  "max_tokens": {{ $json.max_tokens }},
  "temperature": {{ $json.temperature }}
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
Webhook POST /webhook/elo-ai-chat
         │
         ▼
┌─────────────────────┐
│  1. Validate Input  │  ← messages required
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ 2. Call AI Tool MCP │  ← HTTP POST to 8774/chat
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

## Tool Examples

### get_price

```json
{
  "name": "get_price",
  "description": "Get price for device repair from price list",
  "parameters": {
    "type": "object",
    "properties": {
      "device_brand": {"type": "string", "description": "Device brand"},
      "device_model": {"type": "string", "description": "Device model"},
      "repair_type": {
        "type": "string",
        "enum": ["screen", "battery", "back_glass", "camera", "motherboard"],
        "description": "Type of repair"
      }
    },
    "required": ["device_model", "repair_type"]
  }
}
```

### graph_query

```json
{
  "name": "graph_query",
  "description": "Query Neo4j graph for client/device history",
  "parameters": {
    "type": "object",
    "properties": {
      "query_code": {
        "type": "string",
        "enum": ["get_client_context", "get_device_history", "find_similar_cases"],
        "description": "Query to execute"
      },
      "params": {
        "type": "object",
        "description": "Query parameters"
      }
    },
    "required": ["query_code"]
  }
}
```

### send_response

```json
{
  "name": "send_response",
  "description": "Send response to client",
  "parameters": {
    "type": "object",
    "properties": {
      "text": {"type": "string", "description": "Response text"},
      "buttons": {
        "type": "array",
        "items": {
          "type": "object",
          "properties": {
            "text": {"type": "string"},
            "callback_data": {"type": "string"}
          }
        },
        "description": "Optional buttons"
      }
    },
    "required": ["text"]
  }
}
```

---

## Tool Call Processing

When AI returns tool_calls, Core Orchestrator processes them:

```
AI Response
    │
    │ tool_calls: [{name: "get_price", arguments: {...}}]
    ▼
Core Orchestrator
    │
    ├── get_price → Price Lookup (PostgreSQL)
    ├── graph_query → Graph Tool MCP (8773)
    └── send_response → Response Builder
    │
    │ Return results to AI (if needed)
    ▼
Continue conversation or finish
```

---

## Error Handling

| Error | Action |
|-------|--------|
| Missing messages | Return 400, validation error |
| Empty messages array | Return 400, validation error |
| Invalid message format | Return 400, validation error |
| AI Tool timeout | Return 504, timeout error |
| AI Tool unavailable | Return 503, service unavailable |

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| Service | AI Tool MCP (8774) | AI chat |

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

**Document:** ELO_AI_Chat.md
**Date:** 2025-12-11
**Author:** Claude
**Status:** n8n polygon
