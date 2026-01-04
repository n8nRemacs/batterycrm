# AI Agent Architecture

> Universal AI Agent with dynamic model selection and MCP tools

## Current State (n8n Workaround)

Due to n8n limitations, we have 5 static branches:

```
Task Router
├── ai_agent_nano   → AI Agent + qwen/qwen3-4b:free
├── ai_agent_small  → AI Agent + qwen/qwen3-8b
├── ai_agent_optima → AI Agent + claude-3-haiku
├── ai_agent_pro    → AI Agent + gpt-4o-mini
└── ai_agent_expert → AI Agent + claude-3.5-sonnet
```

**Limitations:**
- Static tool connections (can't add tools dynamically)
- 5 separate branches for 5 tiers
- No multi-step agent loop
- Tools must be pre-configured in n8n UI

---

## Future State (Python Implementation)

### Single Universal Agent

```python
class UniversalAIAgent:
    """
    One agent that handles all tiers with dynamic configuration.
    """

    AGENT_TIERS = {
        'nano':   'qwen/qwen3-4b:free',
        'small':  'qwen/qwen3-8b',
        'optima': 'anthropic/claude-3-haiku',
        'pro':    'openai/gpt-4o-mini',
        'expert': 'anthropic/claude-3-5-sonnet'
    }

    async def execute(self, task: AgentTask) -> AgentResult:
        # 1. Select model from tier
        model = self.AGENT_TIERS[task.config.agent_tier]

        # 2. Load tools from tenant settings
        tools = await self.load_tenant_tools(task.meta.tenant_id)

        # 3. Build messages
        messages = self.build_messages(task)

        # 4. Agent loop with function calling
        result = await self.agent_loop(model, messages, tools, task)

        # 5. Log token usage (for paid tiers)
        if task.config.agent_tier != 'nano':
            await self.log_usage(task, result)

        return result
```

### Agent Loop (Multi-step Reasoning)

```python
async def agent_loop(
    self,
    model: str,
    messages: list,
    tools: list,
    task: AgentTask,
    max_iterations: int = 10
) -> AgentResult:
    """
    Executes agent with function calling until done or max iterations.
    """
    iteration = 0
    total_tokens = TokenUsage()

    while iteration < max_iterations:
        # Call OpenRouter with tools
        response = await self.openrouter.chat(
            model=model,
            messages=messages,
            tools=tools,
            tool_choice="auto"
        )

        total_tokens += response.usage

        # Check if model wants to call a tool
        if response.tool_calls:
            for tool_call in response.tool_calls:
                # Execute tool via MCP hook
                tool_result = await self.call_mcp_tool(
                    tool_name=tool_call.function.name,
                    arguments=tool_call.function.arguments,
                    tenant_id=task.meta.tenant_id
                )

                # Add tool result to messages
                messages.append({
                    "role": "tool",
                    "tool_call_id": tool_call.id,
                    "content": json.dumps(tool_result)
                })

            iteration += 1
            continue

        # No tool calls - we're done
        return AgentResult(
            text=response.content,
            tokens=total_tokens,
            iterations=iteration + 1
        )

    raise MaxIterationsError(f"Agent exceeded {max_iterations} iterations")
```

### Dynamic Tool Loading

```python
async def load_tenant_tools(self, tenant_id: str) -> list[Tool]:
    """
    Load tools configured for tenant from database.
    """
    tools = await db.fetch_all("""
        SELECT t.code, t.name, t.description, t.parameters_schema, t.mcp_endpoint
        FROM elo_agent_tools t
        JOIN elo_t_tenant_tools tt ON tt.tool_id = t.id
        WHERE tt.tenant_id = $1 AND tt.is_enabled = true
        ORDER BY t.sort_order
    """, tenant_id)

    return [
        Tool(
            type="function",
            function=FunctionDefinition(
                name=t.code,
                description=t.description,
                parameters=t.parameters_schema
            ),
            mcp_endpoint=t.mcp_endpoint  # for execution
        )
        for t in tools
    ]
```

### MCP Tool Execution

```python
async def call_mcp_tool(
    self,
    tool_name: str,
    arguments: dict,
    tenant_id: str
) -> dict:
    """
    Execute tool via MCP HTTP endpoint.
    """
    # Get tool config
    tool = await db.fetch_one("""
        SELECT mcp_endpoint, auth_header, timeout_ms
        FROM elo_agent_tools WHERE code = $1
    """, tool_name)

    # Call MCP endpoint
    async with httpx.AsyncClient() as client:
        response = await client.post(
            tool.mcp_endpoint,
            json={
                "tool": tool_name,
                "arguments": arguments,
                "tenant_id": tenant_id
            },
            headers={"Authorization": tool.auth_header},
            timeout=tool.timeout_ms / 1000
        )

    return response.json()
```

---

## Database Schema

### elo_agent_tools (existing)

```sql
CREATE TABLE elo_agent_tools (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    parameters_schema JSONB,      -- OpenAI function schema
    mcp_endpoint VARCHAR(500),    -- HTTP endpoint for tool execution
    auth_header VARCHAR(500),     -- Authorization header
    timeout_ms INT DEFAULT 30000,
    is_active BOOLEAN DEFAULT true,
    sort_order INT DEFAULT 0
);
```

### elo_t_tenant_tools (new)

```sql
CREATE TABLE elo_t_tenant_tools (
    id SERIAL PRIMARY KEY,
    tenant_id UUID NOT NULL REFERENCES elo_tenants(id),
    tool_id INT NOT NULL REFERENCES elo_agent_tools(id),
    is_enabled BOOLEAN DEFAULT true,
    custom_config JSONB,          -- tenant-specific overrides
    created_at TIMESTAMPTZ DEFAULT NOW(),
    UNIQUE(tenant_id, tool_id)
);
```

### Tool Examples

```sql
INSERT INTO elo_agent_tools (code, name, description, parameters_schema, mcp_endpoint) VALUES
('mcp_telegram', 'Send Telegram Message', 'Send message to Telegram chat',
 '{"type":"object","properties":{"chat_id":{"type":"string"},"text":{"type":"string"}},"required":["chat_id","text"]}',
 'http://mcp-telegram:8767/send'),

('mcp_whatsapp', 'Send WhatsApp Message', 'Send message to WhatsApp',
 '{"type":"object","properties":{"phone":{"type":"string"},"text":{"type":"string"}},"required":["phone","text"]}',
 'http://mcp-whatsapp:8766/send'),

('sql_query', 'Execute SQL Query', 'Run read-only SQL query',
 '{"type":"object","properties":{"query":{"type":"string"}},"required":["query"]}',
 'http://api-internal:8080/sql'),

('neo4j_query', 'Query Neo4j', 'Run Cypher query on knowledge graph',
 '{"type":"object","properties":{"cypher":{"type":"string"}},"required":["cypher"]}',
 'http://api-internal:8080/neo4j'),

('http_request', 'HTTP Request', 'Make external HTTP request',
 '{"type":"object","properties":{"method":{"type":"string"},"url":{"type":"string"},"body":{"type":"object"}},"required":["method","url"]}',
 'http://api-internal:8080/http'),

('embeddings', 'Search Embeddings', 'Semantic search in vector store',
 '{"type":"object","properties":{"query":{"type":"string"},"limit":{"type":"integer"}},"required":["query"]}',
 'http://api-internal:8080/embeddings');
```

---

## Task Contract

### Request (Redis Queue)

```json
{
  "task_id": "agent_123",
  "trace_id": "trace_456",
  "task_type": "ai_agent",
  "config": {
    "agent_tier": "pro",
    "system_prompt": "You are a helpful assistant...",
    "message": "Find all orders for client X",
    "context": {"client_id": "123", "dialog_id": "456"},
    "max_iterations": 5,
    "temperature": 0.7
  },
  "meta": {
    "tenant_id": "uuid-here",
    "client_id": "client-123",
    "dialog_id": "dialog-456"
  },
  "callback": {
    "result_key": "elo:results:trace_456",
    "notify_webhook": "https://n8n.../webhook/callback"
  }
}
```

### Response

```json
{
  "task_id": "agent_123",
  "result": {
    "text": "I found 5 orders for client X...",
    "tool_calls": [
      {"tool": "sql_query", "result": {"rows": 5}},
      {"tool": "mcp_telegram", "result": {"sent": true}}
    ]
  },
  "model_used": "openai/gpt-4o-mini",
  "agent_tier": "pro",
  "iterations": 3,
  "tokens": {
    "prompt": 1250,
    "completion": 340,
    "total": 1590
  },
  "duration_ms": 4520
}
```

---

## Token Billing

```python
async def log_usage(self, task: AgentTask, result: AgentResult):
    """Log token usage for paid tiers only."""
    if task.config.agent_tier == 'nano':
        return  # Free tier, no billing

    await db.execute("""
        INSERT INTO elo_t_token_usage
        (tenant_id, trace_id, task_id, model_id, agent_tier,
         prompt_tokens, completion_tokens, total_tokens, cost_usd, task_type)
        SELECT $1, $2, $3, $4, $5, $6, $7, $8,
            COALESCE(
                (SELECT ($6 * input_cost_per_1m + $7 * output_cost_per_1m) / 1000000.0
                 FROM elo_model_pricing WHERE model_id = $4),
                0
            ),
            'ai_agent'
    """,
        task.meta.tenant_id,
        task.trace_id,
        task.task_id,
        result.model_used,
        task.config.agent_tier,
        result.tokens.prompt,
        result.tokens.completion,
        result.tokens.total
    )
```

---

## Migration Path

### Phase 1: Current (n8n)
- 5 static AI Agent branches
- No dynamic tools
- Basic function calling via n8n LangChain nodes

### Phase 2: Hybrid
- Python worker for `ai_agent` task type
- n8n continues handling `llm_extraction`, `http_request`, etc.
- Gradual migration

### Phase 3: Full Python
- All task types in Python
- Single Redis consumer
- Full agent loop with dynamic tools
- MCP integration via HTTP

---

## Architecture Diagram

```
┌─────────────────────────────────────────────────────────────────┐
│                        Redis Queue                               │
│                    elo:tasks:pending                             │
└─────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                     Python AI Worker                             │
│  ┌─────────────────────────────────────────────────────────┐   │
│  │                   UniversalAIAgent                       │   │
│  │  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐  │   │
│  │  │ Model Select │  │ Tool Loader  │  │ Agent Loop   │  │   │
│  │  │ (from tier)  │  │ (from DB)    │  │ (with tools) │  │   │
│  │  └──────────────┘  └──────────────┘  └──────────────┘  │   │
│  └─────────────────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────────────────┘
         │                    │                    │
         ▼                    ▼                    ▼
┌─────────────┐      ┌─────────────┐      ┌─────────────┐
│ OpenRouter  │      │  PostgreSQL │      │ MCP Servers │
│    API      │      │   (tools)   │      │  (HTTP)     │
└─────────────┘      └─────────────┘      └─────────────┘
                                                 │
                     ┌───────────────────────────┼───────────────┐
                     │                           │               │
              ┌──────▼──────┐            ┌───────▼─────┐  ┌──────▼──────┐
              │mcp-telegram │            │mcp-whatsapp │  │ mcp-avito   │
              │   :8767     │            │   :8766     │  │   :8765     │
              └─────────────┘            └─────────────┘  └─────────────┘
```

---

## Summary

| Aspect | n8n (Current) | Python (Future) |
|--------|---------------|-----------------|
| Branches | 5 static | 1 dynamic |
| Model selection | Pre-configured | From config |
| Tools | Static in UI | Dynamic from DB |
| Agent loop | No | Yes (multi-step) |
| MCP integration | Manual | Via HTTP hooks |
| Billing | Per tier | Per tier |
