# AI Tool — Overview

> Blind AI executor for extraction and chat operations

**MCP Service:** 45.144.177.128:8774
**n8n Polygon:** Webhooks for debugging

---

## Purpose

AI Tool is a **blind executor** for AI operations:
- **Extraction** — Extract structured data from text using schema
- **Chat** — AI chat with optional tool support

**Principle:** No business logic. Takes input, calls AI, returns output.

---

## Architecture

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                              AI TOOL (8774)                                  │
│                           (Blind AI Executor)                                │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                              │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  POST /extract                                                       │    │
│  │  • Receive message + extraction_schema                              │    │
│  │  • Build prompt from schema                                         │    │
│  │  • Call OpenRouter (Qwen3-30B default)                              │    │
│  │  • Parse JSON response                                              │    │
│  │  • Return extracted data                                            │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                                                              │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  POST /chat                                                          │    │
│  │  • Receive messages + tools (optional)                              │    │
│  │  • Call OpenRouter (Claude default)                                 │    │
│  │  • Return content + tool_calls                                      │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                                                              │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## Endpoints

### POST /extract

Extract structured data from text.

**Request:**
```json
{
  "message": "Разбил экран на iPhone 14 Pro, сколько стоит замена?",
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
      },
      "intent": {"type": "string", "enum": ["repair", "purchase", "question", "sale"]}
    }
  },
  "model": "qwen/qwen3-30b-a3b"
}
```

**Response:**
```json
{
  "success": true,
  "data": {
    "device": {
      "brand": "Apple",
      "model": "iPhone 14 Pro"
    },
    "symptoms": [
      {"code": "screen_cracked", "text": "разбил экран"}
    ],
    "intent": "repair"
  },
  "raw_response": "...",
  "execution_time_ms": 1234,
  "model_used": "qwen/qwen3-30b-a3b"
}
```

---

### POST /chat

AI chat with optional tool support.

**Request:**
```json
{
  "messages": [
    {"role": "system", "content": "You are a phone repair assistant."},
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
  "temperature": 0.7
}
```

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
  }
}
```

---

### GET /health

**Response:**
```json
{
  "status": "ok",
  "openrouter_configured": true,
  "default_extraction_model": "qwen/qwen3-30b-a3b",
  "default_chat_model": "anthropic/claude-3-5-sonnet"
}
```

---

## Models

| Model | Purpose | Provider |
|-------|---------|----------|
| `qwen/qwen3-30b-a3b` | Extraction (default) | OpenRouter |
| `anthropic/claude-3-5-sonnet` | Chat (default) | OpenRouter |
| `openai/gpt-4o` | Chat (alternative) | OpenRouter |

---

## Use Cases

### 1. Core calls /extract

```
Core Context Builder
       │
       │ POST /extract
       │ {message, extraction_schema}
       ▼
  AI Tool (8774)
       │
       │ OpenRouter API
       ▼
  Return extracted data
       │
       ▼
Core saves to Graph
```

### 2. Core calls /chat for response

```
Core Request Builder
       │
       │ POST /chat
       │ {messages, tools}
       ▼
  AI Tool (8774)
       │
       │ OpenRouter API
       ▼
  Return content + tool_calls
       │
       ▼
Core processes tool_calls
```

---

## Configuration

```env
# OpenRouter
OPENROUTER_API_KEY=sk-or-...
OPENROUTER_BASE_URL=https://openrouter.ai/api/v1

# Default models
DEFAULT_EXTRACTION_MODEL=qwen/qwen3-30b-a3b
DEFAULT_CHAT_MODEL=anthropic/claude-3-5-sonnet

# Service
HOST=0.0.0.0
PORT=8774
```

---

## n8n Polygon Workflow

For debugging, use n8n workflow: `ELO_AI_Tool.json`

```
POST /webhook/elo-ai-extract → AI Tool /extract
POST /webhook/elo-ai-chat → AI Tool /chat
```

---

## Dependencies

| Type | Resource | Purpose |
|------|----------|---------|
| External | OpenRouter API | AI model access |

---

## Error Handling

| Error | Response |
|-------|----------|
| Missing API key | `{success: false, error: "OpenRouter API key not configured"}` |
| API timeout | `{success: false, error: "Request timeout"}` |
| Invalid JSON in response | `{success: false, error: "Failed to parse JSON: ...", raw_response: "..."}` |
| Rate limit | `{success: false, error: "API error: 429 - ..."}` |

---

**Document:** AI_TOOL_OVERVIEW.md
**Date:** 2025-12-11
**Author:** Claude
**Status:** MCP + n8n polygon
