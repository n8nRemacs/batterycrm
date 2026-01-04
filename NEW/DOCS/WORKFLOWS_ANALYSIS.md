# Workflows Analysis

**Last sync:** 2026-01-04

---

## Summary

| Category | Active | Inactive | Total |
|----------|--------|----------|-------|
| Channel In (ELO_In_*) | 4 | 1 | 5 |
| Channel Out (ELO_Out_*) | 2 | 1 | 3 |
| API | 5 | 0 | 5 |
| AI Contour | 2 | 7 | 9 |
| InputCore | 1 | 0 | 1 |
| OperatorCore | 1 | 0 | 1 |
| Resolve | 0 | 2 | 2 |
| Core | 0 | 1 | 1 |
| Tool | 0 | 1 | 1 |
| Other | 1 | 0 | 1 |
| **Total ELO** | **16** | **14** | **30** |

---

## CRITICAL: Pipeline Break

```
ELO_In_* → queue:incoming → ELO_Input_Batcher → batch:*
                                    ↓
                          ELO_Input_Processor [ON]
                                    ↓
                            ELO_Resolver [OFF] ← NOT CALLED!
                                    ↓
                     webhook /elo-core-ingest ← BROKEN LINK!
                                    ↓
                   ELO_Core_AI_Test_Stub_WS [OFF] ← OLD STUB

─────────────────── NOT CONNECTED ───────────────────────────

ELO_Pipeline_Orchestrator [OFF] ← REAL AI, NEVER CALLED!
    ├── ELO_Task_Dispatcher [ON]
    ├── ELO_Results_Aggregator [ON]
    └── ELO_Funnel_Controller [ON]
```

**Fix Required:** Replace HTTP Request in ELO_Resolver with Execute Workflow → ELO_Pipeline_Orchestrator

---

## Detailed Workflow List

### Channel In (ELO_In_*) — 4 active / 1 inactive

| Status | Workflow | Tags | Description |
|--------|----------|------|-------------|
| **ON** | ELO_In_Telegram | In | Telegram Bot input |
| **ON** | ELO_In_WhatsApp | In | WhatsApp input |
| **ON** | ELO_In_Avito | In | Avito official API |
| **ON** | ELO_In_Avito_User | In | Avito user webview |
| OFF | ELO_In_Phone | In | Phone call input |

### Channel Out (ELO_Out_*) — 2 active / 1 inactive

| Status | Workflow | Tags | Description |
|--------|----------|------|-------------|
| **ON** | ELO_Out_Telegram_Bot | Out | Send via Telegram |
| **ON** | ELO_Out_MAX | Out | Send via MAX |
| OFF | ELO_Out_Router | Out | Universal router |

### API — 5 active / 0 inactive

| Status | Workflow | Tags | Endpoint |
|--------|----------|------|----------|
| **ON** | ELO_API_Android_Auth | API | /v1/auth |
| **ON** | ELO_API_Android_Dialogs | API | /v1/dialogs |
| **ON** | ELO_API_Android_Messages | API | /v1/messages |
| **ON** | ELO_API_Android_Send_Message | API | /v1/send |
| **ON** | ELO_API_Channels_Status | API | /v1/channels-status |

### AI Contour — 2 active / 7 inactive

| Status | Workflow | Tags | Description |
|--------|----------|------|-------------|
| **ON** | ELO_Funnel_Controller | AI | Manage funnel stages |
| **ON** | ELO_Results_Aggregator | AI | Aggregate extraction results |
| OFF | ELO_Pipeline_Orchestrator | AI | Main AI pipeline |
| OFF | ELO_AI_Extract | AI | Extract context |
| OFF | ELO_Core_Context_Builder | AI | Build context |
| OFF | ELO_Core_Stage_Manager | AI | Manage stages |
| OFF | ELO_Core_Graph_Writer | AI | Write to Neo4j |
| OFF | ELO_Context_Collector | AI | Collect context |
| OFF | ELO_Context_Router | AI | Route context |

### Resolve Contour — 0 active / 2 inactive

| Status | Workflow | Tags | Description |
|--------|----------|------|-------------|
| OFF | ELO_Client_Resolver | Resolve | Find/create client |
| OFF | ELO_Unifier | Resolve | Unify clients by phone |

### Other

| Status | Workflow | Tags | Description |
|--------|----------|------|-------------|
| **ON** | ELO_Input_Batcher | InputCore | Batch incoming messages |
| **ON** | ELO_Message_Router | OperatorCore | Route to operators |
| **ON** | ELO_Avito_Session_Refresh | - | Keep Avito sessions alive |
| OFF | ELO_Core_Dialog_Engine | Core | Dialog processing |
| OFF | ELO_Graph_Query | Tool | Neo4j queries |
| OFF | ELO_Blind_Worker | TaskWork | Execute blind tasks |

---

## Data Flow Architecture

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           CHANNEL INPUT (ELO_In_*)                          │
├─────────────────────────────────────────────────────────────────────────────┤
│  Telegram [ON] │ WhatsApp [ON] │ Avito [ON] │ Avito_User [ON] │ Phone [OFF] │
└──────────────────────────────┬──────────────────────────────────────────────┘
                               │ Push to queue:incoming
                               ▼
┌─────────────────────────────────────────────────────────────────────────────┐
│                    INPUT CORE (Batching Layer)                              │
├─────────────────────────────────────────────────────────────────────────────┤
│  ELO_Input_Batcher [ON]                                                     │
│  - Cron: every 3 sec                                                        │
│  - Pop from queue:incoming                                                  │
│  - Push to batch:{channel}:{chat_id}                                        │
│  - Set deadline:{channel}:{chat_id}                                         │
└──────────────────────────────┬──────────────────────────────────────────────┘
                               │ Execute Workflow → ELO_Resolver
                               ▼
┌─────────────────────────────────────────────────────────────────────────────┐
│                         ELO_Resolver [OFF]                                  │
├─────────────────────────────────────────────────────────────────────────────┤
│  1. Validate Input                                                          │
│  2. Resolve Tenant (Redis cache → DB)                                       │
│  3. Resolve Client (Redis cache → DB)                                       │
│  4. Resolve Dialog (Redis cache → DB)                                       │
│  5. Save Message                                                            │
│  6. Forward to Core → Execute Workflow → ELO_Pipeline_Orchestrator          │
└──────────────────────────────┬──────────────────────────────────────────────┘
                               │
                               ▼
┌─────────────────────────────────────────────────────────────────────────────┐
│                  ELO_Pipeline_Orchestrator [OFF]                            │
├─────────────────────────────────────────────────────────────────────────────┤
│  1. Get Mode (operator/tenant settings)                                     │
│  2. Call Task Dispatcher → ELO_Task_Dispatcher [ON]                         │
│  3. Poll Results → ELO_Results_Aggregator [ON]                              │
│  4. Call Funnel Controller → ELO_Funnel_Controller [ON]                     │
│  5. Mode Switch:                                                            │
│     - manual → Notify Operator                                              │
│     - semi_auto → Generate Draft → Notify Operator                          │
│     - auto → Generate → Send / Escalate                                     │
│  6. Update Dialog Context                                                   │
└──────────────────────────────┬──────────────────────────────────────────────┘
                               │
                               ▼
┌─────────────────────────────────────────────────────────────────────────────┐
│                        CHANNEL OUTPUT (ELO_Out_*)                           │
├─────────────────────────────────────────────────────────────────────────────┤
│  Telegram_Bot [ON] │ MAX [ON] │ Router [OFF] │ WhatsApp [missing] │         │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## Redis Keys

| Key Pattern | Purpose | TTL |
|-------------|---------|-----|
| `queue:incoming` | Raw incoming messages | - |
| `batch:{channel}:{chat_id}` | Batched messages per dialog | 120s |
| `deadline:{channel}:{chat_id}` | When to process batch | 120s |
| `first_seen:{channel}:{chat_id}` | Batch start time | 120s |
| `cache:tenant:{channel}:{credential}` | Tenant cache | 1h |
| `cache:client:{tenant}:{channel}:{external_id}` | Client cache | 1h |
| `cache:dialog:{tenant}:{client}` | Dialog cache | 1h |

---

## Next Steps (Priority Order)

### Phase 1: Fix Pipeline (Critical)

1. **ELO_Resolver** — Replace HTTP Request with Execute Workflow
2. **ELO_Pipeline_Orchestrator** — Add Mode Router
3. **ELO_Operator_Notify** — Create new workflow
4. Enable: ELO_Resolver, ELO_Pipeline_Orchestrator

### Phase 2: Test Modes

1. Test MANUAL mode
2. Test SEMI_AUTO mode
3. Test AUTO mode

### Phase 3: Enable AI

1. ELO_AI_Extract
2. ELO_Core_Context_Builder
3. ELO_Context_Router
4. ELO_Core_Graph_Writer

---

*Generated by Claude Code — 2026-01-04*
