# AI Contour v2 — Single Brain Architecture

> One Brain + Infinite Dumb Tools

**Date:** 2025-12-15

---

## Philosophy

```
v1: AI Agent knows tools by name, decides which to call
v2: ONE BRAIN controls everything, all else is dumb execution
```

**Core principle:**
```
BLOCK2 (Brain) = ONLY intelligence in the system
Everything else = configurable dumb executors
```

In the end we have:
- **ONE Brain** — all thinking, planning, decisions
- **Infinite Tools** — all controlled by Brain, zero own logic

---

## Architecture

```
┌─────────────────────────────────────────────────────────────┐
│  BLOCK2 (Brain) — THE ONLY INTELLIGENCE                     │
│  ═══════════════════════════════════════                    │
│                                                             │
│  • Understands context                                      │
│  • Decides what to do                                       │
│  • Generates execution script                               │
│  • Defines response format                                  │
│  • Controls slot count                                      │
│  • Handles dependencies between tasks                       │
│                                                             │
│  Input: message, context, available_handlers                │
│  Output: script {tasks[], response_format, slots, deps}     │
└─────────────────────┬───────────────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────────────┐
│  DISPATCHER (n8n) — DUMB                                    │
│  ════════════════════════                                   │
│  No logic. No decisions. Just:                              │
│                                                             │
│    task[i] → first free slot → collect result               │
│                                                             │
│  ┌────────┐ ┌────────┐ ┌────────┐ ┌────────┐               │
│  │ slot_1 │ │ slot_2 │ │ slot_3 │ │ slot_N │  (parallel)   │
│  └───┬────┘ └───┬────┘ └───┬────┘ └───┬────┘               │
│      └──────────┴────┬─────┴──────────┘                     │
└──────────────────────┼──────────────────────────────────────┘
                       │ POST {task_text}
                       ▼
┌─────────────────────────────────────────────────────────────┐
│  MCP ROUTER (Python) — DUMB                                 │
│  ══════════════════════════                                 │
│  No logic. No decisions. Just:                              │
│                                                             │
│    pattern match → call handler → return result             │
│                                                             │
│  Handlers (also dumb, just execute):                        │
│    "extract:" → ExtractHandler                              │
│    "derive:"  → DeriveHandler                               │
│    "graph:"   → GraphHandler                                │
│    "sql:"     → SQLHandler                                  │
│    "http:"    → HTTPHandler                                 │
│    ...        → ... (infinite, added via config)            │
└─────────────────────────────────────────────────────────────┘
```

## Final State

```
┌──────────────────────────────────────────────────────────┐
│                                                          │
│                    BLOCK2 (Brain)                        │
│                         │                                │
│              ┌──────────┼──────────┐                     │
│              │          │          │                     │
│              ▼          ▼          ▼                     │
│           [tool]     [tool]     [tool]    ...infinite    │
│                                                          │
│  Brain configures tools via database                     │
│  Brain generates scripts for dispatchers                 │
│  Tools have ZERO intelligence                            │
│                                                          │
└──────────────────────────────────────────────────────────┘
```

---

## Data Flow

### Input to Dispatcher (from Block2)

```json
{
  "script": {
    "tasks": [
      "extract entities from: У меня айфон 14, экран треснул",
      "load client context for: client_uuid_123",
      "derive chain for symptom: broken_screen, device: iPhone 14",
      "check triggers for: {stage: data_collection, brand: Apple}"
    ],
    "response_format": {
      "entities": "$task[0].result.entities",
      "client": "$task[1].result",
      "derived": "$task[2].result",
      "triggers": "$task[3].result.triggers_fired"
    },
    "parallel_slots": 4
  }
}
```

### Dispatcher → MCP Router

```json
{
  "task": "extract entities from: У меня айфон 14, экран треснул",
  "trace_id": "trace_123",
  "slot_id": 1
}
```

### MCP Router Response

```json
{
  "success": true,
  "result": {
    "entities": [
      {"type": "device", "brand": "Apple", "model": "iPhone 14"},
      {"type": "symptom", "code": "broken_screen", "text": "экран треснул"}
    ]
  },
  "handler": "extract",
  "duration_ms": 150
}
```

---

## Components

### ELO_Context_Collector v2

**Role:** Collect context for incoming message

**Input:**
```json
{
  "tenant_id": "uuid",
  "client_id": "uuid",
  "dialog_id": "uuid",
  "text": "customer message",
  "script": { /* from Block2 */ }
}
```

**Output:**
```json
{
  "context": { /* assembled from task results */ }
}
```

### ELO_Executor v2

**Role:** Execute actions (write graph, generate response)

**Input:**
```json
{
  "context": { /* full context */ },
  "script": { /* from Block2 */ }
}
```

**Output:**
```json
{
  "message": {
    "text": "response text",
    "buttons": []
  }
}
```

---

## MCP Router Handlers

| Pattern | Handler | Description |
|---------|---------|-------------|
| `extract entities from:` | ExtractHandler | AI entity extraction |
| `derive chain for:` | DeriveHandler | symptom→diagnosis→repair→price |
| `load client context for:` | ContextHandler | Neo4j client history |
| `write to graph:` | GraphWriteHandler | Neo4j write |
| `check triggers for:` | TriggersHandler | Condition checking |
| `generate response for:` | ResponseHandler | AI text generation |
| `get price for:` | PriceHandler | PostgreSQL price lookup |
| `format for channel:` | FormatHandler | Channel-specific formatting |

### Adding New Handler

1. Add handler function in MCP Router
2. Add pattern to registry
3. Add task generation logic to Block2
4. **No changes to n8n workflows!**

---

## Benefits

| Aspect | v1 | v2 |
|--------|----|----|
| Add new tool | Edit n8n workflow | Add MCP handler only |
| AI knowledge | Knows all tool names | Knows nothing |
| Tool logic | Spread across n8n | Centralized in MCP |
| Parallelism | Manual in workflow | Automatic by slots |
| Testing | Need n8n running | Test MCP handlers directly |
| Flexibility | Limited by n8n tools | Unlimited |

---

## Implementation Plan

### Phase 1: MCP Router
- [ ] Create `mcp-router` service
- [ ] Implement pattern matching
- [ ] Move existing handlers from n8n

### Phase 2: Dispatcher Workflows
- [ ] Rewrite ELO_Context_Collector as Task Dispatcher
- [ ] Rewrite ELO_Executor as Task Dispatcher
- [ ] Universal slot tools (N parallel)

### Phase 3: Block2 (Brain)
- [ ] Design script generation logic
- [ ] Context-aware task planning
- [ ] Response format templates

---

## AI Processor Architecture

### Analogy: CPU + CoProcessor

```
Hardware:  CPU (complex) + GPU/NPU (specialized, parallel)
AI:        AI Processor (complex) + AI CoProcessor (simple, fast, cheap)
```

### AI Processor (Main Brain)

```
┌─────────────────────────────────────────────────────────┐
│  AI PROCESSOR                                           │
│  ═══════════════                                        │
│                                                         │
│  Model: Claude / GPT-4 / Qwen-72B (expensive, smart)    │
│                                                         │
│  Tasks:                                                 │
│    • Complex reasoning                                  │
│    • Script generation with dependencies               │
│    • Multi-step planning                                │
│    • Edge case handling                                 │
│    • Final response composition                         │
│                                                         │
│  When: Complex requests, new scenarios, errors          │
│  Cost: $$$                                              │
│  Latency: 1-3 sec                                       │
└─────────────────────────────────────────────────────────┘
```

### AI CoProcessor (Light Brain)

```
┌─────────────────────────────────────────────────────────┐
│  AI COPROCESSOR                                         │
│  ═══════════════                                        │
│                                                         │
│  Model: Qwen-7B / Gemma-2B / Phi-3 (cheap, fast)        │
│                                                         │
│  Tasks:                                                 │
│    • Language detection                                 │
│    • Intent classification                              │
│    • Entity extraction (simple)                         │
│    • Schema selection                                   │
│    • Translation                                        │
│    • Validation                                         │
│    • Preprocessing for Processor                        │
│                                                         │
│  When: Every request (before/after Processor)           │
│  Cost: ¢                                                │
│  Latency: 100-500ms                                     │
└─────────────────────────────────────────────────────────┘
```

### Processing Pipeline

```
Message arrives
      │
      ▼
┌─────────────────┐
│  CoProcessor    │  ← language? intent? simple/complex?
│  (100-300ms)    │
└────────┬────────┘
         │
         ├─── simple request ───→ Cached Script ───→ Dispatcher
         │                        (skip Processor!)
         │
         ▼ complex request
┌─────────────────┐
│  Processor      │  ← full script generation
│  (1-2 sec)      │
└────────┬────────┘
         │
         ▼
┌─────────────────┐
│  Dispatcher     │  ← execute waves
│  (200-500ms)    │
└────────┬────────┘
         │
         ▼
┌─────────────────┐
│  CoProcessor    │  ← format response, translate
│  (100-300ms)    │
└────────┬────────┘
         │
         ▼
    Response
```

### Cost & Performance Impact

| Scenario | Without CoProcessor | With CoProcessor |
|----------|--------------------|--------------------|
| Simple request | Processor (1.5s, $$$) | CoProcessor (0.3s, ¢) |
| Complex request | Processor (2s, $$$) | CoP + Proc + CoP (2.5s, $$) |
| 100 requests/day | ~$5 | ~$1.50 |
| Latency (simple) | 1.5s | 0.3s |

**80% of requests are simple** → CoProcessor handles them → 70% cost reduction

### CoProcessor Tasks Matrix

| Task | Model | Latency | Cost |
|------|-------|---------|------|
| Language detection | Qwen-1.5B | 50ms | ¢ |
| Intent classification | Qwen-7B | 100ms | ¢ |
| Entity extraction | Qwen-7B | 200ms | ¢ |
| Translation | Qwen-7B | 300ms | ¢ |
| Validation | Qwen-1.5B | 50ms | ¢ |
| Script selection | Qwen-7B | 100ms | ¢ |

### When Processor is Required

```
CoProcessor asks: "Can I handle this?"

YES (use cached script):
  ├── "Сколько стоит замена экрана?" → price_inquiry script
  ├── "Привет" → greeting script
  ├── "iPhone 14, разбит экран" → standard_intake script
  └── "Да, согласен" → confirmation script

NO (call Processor):
  ├── Multiple devices + multiple symptoms
  ├── Unusual request pattern
  ├── Error recovery needed
  ├── Context conflicts
  └── New scenario (no matching script)
```

### Architecture Diagram

```
┌──────────────────────────────────────────────────────────────┐
│                                                              │
│   ┌─────────────┐         ┌─────────────┐                   │
│   │ CoProcessor │ ◄─────► │  Processor  │                   │
│   │   (fast)    │         │   (smart)   │                   │
│   └──────┬──────┘         └──────┬──────┘                   │
│          │                       │                          │
│          └───────────┬───────────┘                          │
│                      │                                      │
│                      ▼                                      │
│              ┌──────────────┐                               │
│              │    Redis     │                               │
│              │  (scripts,   │                               │
│              │   cache)     │                               │
│              └──────┬───────┘                               │
│                     │                                       │
└─────────────────────┼───────────────────────────────────────┘
                      │
                      ▼
            [Dispatchers + MCP]
```

---

## Decisions

| Question | Answer |
|----------|--------|
| Slot count | 10 initially (can scale to 100) |
| Task dependencies | Yes, via Waves |
| Error handling | Brain decides retry strategy |
| Brain location | n8n first → Python later |

**All logic in Brain. Period.**

---

## Parallelism: Waves Architecture

Brain groups tasks into **waves**. Tasks within a wave run in parallel.
Next wave waits for previous wave to complete.

```
Script from Brain:
{
  "waves": [
    {
      "id": 0,
      "tasks": [
        {"id": "t0", "task": "extract entities from: ..."},
        {"id": "t1", "task": "load client context for: ..."}
      ],
      "parallel": true
    },
    {
      "id": 1,
      "depends_on": [0],
      "tasks": [
        {"id": "t2", "task": "derive chain for symptom: $t0.result.symptom"}
      ]
    },
    {
      "id": 2,
      "depends_on": [1],
      "tasks": [
        {"id": "t3", "task": "check triggers for: $t2.result"},
        {"id": "t4", "task": "generate response for: ..."}
      ],
      "parallel": true
    }
  ]
}
```

### Execution Flow

```
Wave 0:  [t0] ─┬─→ parallel execution ─┬─→ results
         [t1] ─┘                       │
                                       ▼
Wave 1:  [t2] ────→ uses $t0.result ───→ result
                                       │
                                       ▼
Wave 2:  [t3] ─┬─→ parallel execution ─┬─→ results
         [t4] ─┘                       │
                                       ▼
                              Final assembly
```

### n8n Implementation

```
┌────────────────────────────────────────────────────────────┐
│  Dispatcher Workflow                                       │
│                                                            │
│  ┌──────────┐   ┌─────────────┐   ┌──────────────────┐    │
│  │ Webhook  │ → │ Parse Script│ → │ Loop Over Waves  │    │
│  └──────────┘   └─────────────┘   └────────┬─────────┘    │
│                                            │              │
│                                            ▼              │
│                              ┌─────────────────────────┐  │
│                              │ Split Wave Tasks        │  │
│                              │ (batch size = 10 slots) │  │
│                              └────────────┬────────────┘  │
│                                           │               │
│                                           ▼               │
│                              ┌─────────────────────────┐  │
│                              │ HTTP Request to MCP     │  │
│                              │ (parallel per batch)    │  │
│                              └────────────┬────────────┘  │
│                                           │               │
│                                           ▼               │
│                              ┌─────────────────────────┐  │
│                              │ Merge Wave Results      │  │
│                              │ (substitute $refs)      │  │
│                              └────────────┬────────────┘  │
│                                           │               │
│                                           ▼               │
│                                    Next Wave / Done       │
└────────────────────────────────────────────────────────────┘
```

### Variable Substitution

Tasks can reference previous results:

| Reference | Meaning |
|-----------|---------|
| `$t0.result` | Full result of task t0 |
| `$t0.result.entities` | Specific field |
| `$wave[0].results` | All results from wave 0 |

Substitution happens in Dispatcher before sending to MCP.

---

## Performance Optimization Concept

### Goal: Reduce Everything to Elementary Operations

```
LLM call = SLOW (1-3 sec)
HTTP call = FAST (100-300ms)
Redis call = INSTANT (<10ms)

Strategy: Minimize LLM calls, maximize elementary operations
```

### Current Problem: AI Agent Loop

```
n8n AI Agent:
  [LLM 1.5s] → [tool 0.2s] → [LLM 1.5s] → [tool 0.2s] → [LLM 1s]

  Each "round" = LLM call
  More complexity = More LLM calls = Slower
```

### v2 Solution: Single Brain Call

```
Python Dispatcher:
  [BRAIN 1.5s] → [HTTP 0.2s] → [HTTP 0.2s] → [HTTP 0.2s]

  Brain called ONCE at start
  Everything else = elementary operations (no LLM)
```

### Performance Comparison

| Scenario | n8n AI Agent | v2 (n8n) | v2 (Python) |
|----------|--------------|----------|-------------|
| Simple (1 wave) | ~3 sec | ~2 sec | ~1.5 sec |
| Medium (3 waves) | ~6 sec | ~3 sec | ~2 sec |
| Complex (5 waves) | ~10 sec | ~4 sec | ~2.5 sec |

---

## Future: Brain Server + Redis Architecture

### Concept

```
┌────────────────────────────────────────────────────────────┐
│  BRAIN SERVER (dedicated, high-performance)                │
│  ═══════════════════════════════════════════               │
│                                                            │
│  ┌──────────────────────────────────────────────────────┐ │
│  │  Brain instances (multiple, load-balanced)           │ │
│  │                                                       │ │
│  │  • All thinking happens here                         │ │
│  │  • Script generation                                  │ │
│  │  • Decision making                                    │ │
│  │  • Internal state = FAST (in-memory)                 │ │
│  └──────────────────────────────────────────────────────┘ │
│                          │                                 │
│                          │ internal: instant               │
│                          ▼                                 │
│  ┌──────────────────────────────────────────────────────┐ │
│  │  Redis (on same server)                              │ │
│  │                                                       │ │
│  │  • Communication bus with external world             │ │
│  │  • Task queues                                        │ │
│  │  • Result storage                                     │ │
│  │  • Context cache                                      │ │
│  └──────────────────────────────────────────────────────┘ │
│                          │                                 │
└──────────────────────────┼─────────────────────────────────┘
                           │ external: Redis pub/sub
                           ▼
┌──────────────────────────────────────────────────────────┐
│  DISPATCHERS + MCP HANDLERS (distributed)                │
│                                                          │
│  All dumb. All fast. All scalable.                       │
└──────────────────────────────────────────────────────────┘
```

### Communication Flow

```
1. Message arrives → Redis queue
2. Brain picks up → generates script → Redis queue
3. Dispatcher picks up → executes waves → Redis results
4. If Brain needed again → Redis queue → Brain
5. Final response → Redis → Output channel
```

### Why Redis?

| Operation | Latency |
|-----------|---------|
| Brain internal (memory) | <1ms |
| Redis (same server) | <1ms |
| Redis (cross-server) | ~5ms |
| HTTP (cross-server) | ~50-200ms |
| LLM API call | ~1000-3000ms |

### Bottlenecks Analysis

```
SLOW (minimize):
  └── LLM calls (Brain thinking)
      └── Solution: smarter Brain, fewer calls
      └── Solution: Brain Lite for simple decisions

MEDIUM (optimize):
  └── HTTP calls (MCP handlers)
      └── Solution: batch requests
      └── Solution: parallel execution

FAST (maximize):
  └── Redis operations
  └── In-memory operations
  └── Elementary logic
```

### Ultimate Goal

```
┌─────────────────────────────────────────────────────────┐
│                                                         │
│   Message → Brain (1x) → [elementary ops] → Response    │
│                                                         │
│   99% of work = elementary operations                   │
│   1% of work = Brain thinking                           │
│                                                         │
└─────────────────────────────────────────────────────────┘
```

---

## Risks & Mitigation (Updated)

| Risk | Probability | Impact | Mitigation |
|------|-------------|--------|------------|
| Processor generates bad script | Medium | High | **More hardcoded logic, less AI reasoning.** Business is not essay writing. Strict templates for 80% cases, AI only for edge cases. JSON Schema validation. |
| Processor unavailable | Low | Critical | **Duplicate Processor as standby.** Active-passive setup. Auto-failover. CoProcessor handles simple requests during failover. |
| MCP handler timeout | Medium | Low | **Parallelism + load balancing.** Multiple handler instances. Round-robin distribution. Circuit breaker pattern. |
| Redis unavailable | Low | Critical | **Redis replication + persistence.** Master-slave setup. AOF persistence to not lose queue. Automatic failover with Sentinel. |

### Detailed Mitigation Strategies

#### 1. Bad Script Prevention

```
Problem: AI "thinks" too much, generates unpredictable scripts

Solution: Hardcoded logic where possible
┌─────────────────────────────────────────────────────────┐
│  80% requests → Template scripts (no AI reasoning)      │
│  15% requests → CoProcessor selects from templates      │
│  5% requests  → Full Processor reasoning                │
└─────────────────────────────────────────────────────────┘

Business logic = deterministic rules, not AI essays
AI = only where human-like judgment truly needed
```

#### 2. Processor High Availability

```
┌─────────────────────────────────────────────────────────┐
│  PROCESSOR CLUSTER                                      │
│                                                         │
│  ┌──────────────┐    ┌──────────────┐                  │
│  │  Processor   │    │  Processor   │                  │
│  │   PRIMARY    │◄──►│   STANDBY    │                  │
│  └──────┬───────┘    └──────┬───────┘                  │
│         │                   │                          │
│         └─────────┬─────────┘                          │
│                   │                                    │
│              Health check                              │
│              Auto-failover                             │
│                                                        │
│  During failover: CoProcessor + cached scripts         │
└─────────────────────────────────────────────────────────┘
```

#### 3. Handler Load Distribution

```
┌─────────────────────────────────────────────────────────┐
│  MCP HANDLER POOL                                       │
│                                                         │
│  ┌─────────┐ ┌─────────┐ ┌─────────┐ ┌─────────┐       │
│  │Handler 1│ │Handler 2│ │Handler 3│ │Handler N│       │
│  └────┬────┘ └────┬────┘ └────┬────┘ └────┬────┘       │
│       │          │          │          │              │
│       └──────────┴────┬─────┴──────────┘              │
│                       │                               │
│              Load Balancer                            │
│              (round-robin / least-connections)        │
│                                                       │
│  Circuit breaker: if handler fails 3x → remove from   │
│  pool, health check, re-add when healthy              │
└─────────────────────────────────────────────────────────┘
```

#### 4. Redis High Availability

```
┌─────────────────────────────────────────────────────────┐
│  REDIS CLUSTER                                          │
│                                                         │
│  ┌──────────────┐    ┌──────────────┐                  │
│  │    Redis     │───►│    Redis     │                  │
│  │   MASTER     │    │    SLAVE     │                  │
│  └──────┬───────┘    └──────┬───────┘                  │
│         │                   │                          │
│         ▼                   ▼                          │
│  ┌─────────────────────────────────────┐               │
│  │  Redis Sentinel (monitors + failover)│              │
│  └─────────────────────────────────────┘               │
│                                                        │
│  Persistence: AOF (append-only file)                   │
│  - Every write → disk                                  │
│  - Queue survives restart                              │
│  - No message loss                                     │
└─────────────────────────────────────────────────────────┘
```

### Philosophy Update

```
OLD THINKING:
  "AI will figure it out" → unpredictable, slow, expensive

NEW THINKING:
  "Hardcode what you can, AI only where necessary"

  ┌─────────────────────────────────────────────────┐
  │  Deterministic logic  │████████████████│ 80%   │
  │  CoProcessor (simple) │████            │ 15%   │
  │  Processor (complex)  │█               │  5%   │
  └─────────────────────────────────────────────────┘

  Business = rules, not creativity
  AI = handle exceptions, not routine
```

---

## Thoughts & Ideas for Future

1. **Template Library** — pre-built scripts for common scenarios
   - Greeting → template
   - Price inquiry → template
   - Standard intake → template
   - Confirmation → template
   - Only edge cases need Processor

2. **Streaming Results** — don't wait for all waves
   - Stream partial results as they complete
   - Better UX for complex operations

3. **Processor Federation** — multiple specialized processors
   - Sales Processor
   - Support Processor
   - Technical Processor
   - Route based on intent (CoProcessor decides)

---

## Related Documents

- `AI_CONTOUR_ARCHITECTURE.md` — v1 architecture (current)
- `../../../CORE_NEW/docs/05_AI_ARCHITECTURE.md` — 7-layer AI architecture
