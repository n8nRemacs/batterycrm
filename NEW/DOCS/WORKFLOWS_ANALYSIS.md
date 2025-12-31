# Workflows Analysis

**Last sync:** 2025-12-31

---

## Summary

| Category | Active | Inactive | Total |
|----------|--------|----------|-------|
| Channel Contour (In) | 7 | 3 | 10 |
| Channel Contour (Out) | 3 | 3 | 6 |
| API | 10 | 0 | 10 |
| AI Contour | 0 | 10 | 10 |
| Input Contour | 2 | 1 | 3 |
| Resolve Contour | 0 | 5 | 5 |
| Core Contour | 0 | 3 | 3 |
| Operator Contour | 1 | 0 | 1 |
| Graph Contour | 0 | 1 | 1 |
| Other | 3 | 0 | 3 |
| **Total n8n ELO** | **26** | **26** | **52** |

---

## CRITICAL GAPS

### 1. AI Contour completely inactive

All 10 AI workflows are disabled. No AI processing in the pipeline.

**Impact:** Messages are received and saved but no AI analysis/response generation.

### 2. Resolve Contour completely inactive

All 5 resolve workflows are disabled:
- ELO_Resolver
- ELO_Client_Resolver
- ELO_Dialog_Resolver
- ELO_Tenant_Resolver
- ELO_Unifier

**Impact:** New resolve architecture not integrated.

### 3. Core Contour inactive

All 3 core workflows are disabled:
- ELO_Core_Batcher
- ELO_Core_Dialog_Engine
- ELO_Core_Tenant_Resolver

---

## Data Flow (Current)

```
MCP Webhook -> ELO_In_* -> Redis queue:incoming
                              |
                              v
                    ELO_Input_Batcher (batch:*)
                              |
                              v
                    ELO_Input_Processor
                              |
                              v
                    ELO_Message_Router -> Operator WebSocket
                              |
                              v
                    queue:outgoing -> ELO_Out_*
```

---

## Channel Contour

### Inbound (ELO_In_*) - 7 active / 3 inactive

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_In_WhatsApp | **ON** | Webhook | WhatsApp via MCP |
| ELO_In_Telegram | **ON** | Webhook | Telegram User via MCP |
| ELO_In_Telegram_Bot | **ON** | Webhook | Telegram Bot API |
| ELO_In_Avito | **ON** | Webhook | Avito via MCP |
| ELO_In_Avito_User | **ON** | Webhook | Avito User Android |
| ELO_In_MAX | **ON** | Webhook | MAX via MCP |
| ELO_In_App | **ON** | Webhook | Android app messages |
| ELO_In_VK | off | Webhook | VK via MCP |
| ELO_In_Form | off | Webhook | Web forms |
| ELO_In_Phone | off | Webhook | Phone calls |

### Outbound (ELO_Out_*) - 3 active / 3 inactive

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_Out_Telegram_Bot | **ON** | Schedule | Send via Telegram Bot |
| ELO_Out_WhatsApp | **ON** | Schedule | Send via WhatsApp MCP |
| ELO_Out_MAX | **ON** | Schedule | Send via MAX MCP |
| ELO_Out_Router | off | Execute | Route to channel |
| ELO_Out_Avito | off | Schedule | Send via Avito |
| ELO_Out_VK | off | Schedule | Send via VK |

---

## API Contour (10 workflows, all ON)

| Workflow | Endpoint | Description |
|----------|----------|-------------|
| ELO_API_Android_Auth | POST /auth | Login with PIN |
| ELO_API_Android_Dialogs | GET /dialogs | Get dialogs list |
| ELO_API_Android_Messages | GET /messages | Get messages |
| ELO_API_Android_Send_Message | POST /send | Send message |
| ELO_API_Android_Logout | POST /logout | Logout |
| ELO_API_Android_Register_FCM | POST /fcm | Register push token |
| ELO_API_Android_Normalize | POST /normalize | Normalize data |
| ELO_API_Android_Register_Channel | POST /register-channel | Register channel |
| ELO_API_Channel_Setup | POST /channel-setup | Setup channel |
| ELO_API_Channels_Status | GET /channels-status | Get channels status |

---

## AI Contour (10 workflows, all OFF)

| Workflow | Purpose |
|----------|---------|
| ELO_AI_Extract | Extract entities from text |
| ELO_Core_AI_Derive | AI derivation |
| ELO_Context_Collector | Collect context for AI |
| ELO_Core_Context_Builder | Build full context |
| ELO_Core_Stage_Manager | Manage funnel stages |
| ELO_Core_Triggers_Checker | Check triggers |
| ELO_Core_Response_Generator | Generate AI response |
| ELO_Core_Graph_Writer | Write to Neo4j |
| ELO_Decision | AI decision making |
| ELO_Executor | Execute AI actions |

---

## Input Contour (3 workflows) - 2 active

| Workflow | Active | Trigger | Purpose |
|----------|--------|---------|---------|
| ELO_Input_Batcher | **ON** | Schedule | Add to batch |
| ELO_Input_Processor | **ON** | Schedule | Process batches |
| ELO_Input_Ingest | off | Webhook | Ingest messages |

---

## Resolve Contour (5 workflows, all OFF)

| Workflow | Purpose |
|----------|---------|
| ELO_Resolver | Main orchestrator |
| ELO_Tenant_Resolver | Resolve tenant |
| ELO_Client_Resolver | Resolve client |
| ELO_Dialog_Resolver | Find/create dialog |
| ELO_Unifier | Unify clients by phone |

---

## Core Contour (3 workflows, all OFF)

| Workflow | Purpose |
|----------|---------|
| ELO_Core_Batcher | Batch messages |
| ELO_Core_Dialog_Engine | Main dialog processing |
| ELO_Core_Tenant_Resolver | Old tenant resolver |

---

## Operator Contour (1 workflow, ON)

| Workflow | Active | Purpose |
|----------|--------|---------|
| ELO_Message_Router | **ON** | Route messages to operators via WebSocket |

---

## Graph Contour (1 workflow, OFF)

| Workflow | Purpose |
|----------|---------|
| ELO_Graph_Query | Query Neo4j graph |

---

## Other (3 workflows, all ON)

| Workflow | Active | Purpose |
|----------|--------|---------|
| ELO_Core_AI_Test_Stub_WS | **ON** | Test AI stub with WebSocket |
| ELO_Avito_Session_Refresh | **ON** | Refresh Avito sessions |
| ELO_API_Channel_Avito_Auth | **ON** | Avito channel auth |

---

## File Locations

```
NEW/workflows/
├── Channel Contour/
│   ├── ELO_In/          # 10 workflows
│   └── ELO_Out/         # 6 workflows
├── API/                  # 10 workflows
├── AI Contour/           # 10 workflows
├── Input Contour/        # 3 workflows
├── Resolve Contour/      # 5 workflows
├── Core Contour/         # 3 workflows
├── Operator Contour/     # 1 workflow
├── Graph Contour/        # 1 workflow
└── *.json               # 3 other workflows
```

---

## Action Items

### Priority 1: Enable AI Processing
1. Activate ELO_Resolver chain
2. Connect ELO_Input_Processor to ELO_Resolver
3. Activate ELO_Core_AI_Test_Stub_WS for testing

### Priority 2: Complete Resolve Chain
4. Activate ELO_Tenant_Resolver
5. Activate ELO_Client_Resolver
6. Activate ELO_Dialog_Resolver

### Priority 3: Enable Full AI
7. Activate ELO_AI_Extract
8. Activate ELO_Core_Response_Generator
9. Connect response to ELO_Out_Router

---

*Generated by Claude Code - 2025-12-31*
