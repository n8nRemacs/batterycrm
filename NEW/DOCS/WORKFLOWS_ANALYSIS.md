# Workflows Analysis

**Last sync:** 2025-12-28

---

## Summary

| Category | Active | Inactive | Total |
|----------|--------|----------|-------|
| Channel Contour (In) | 5 | 3 | 8 |
| Channel Contour (Out) | 2 | 4 | 6 |
| API | 7 | 0 | 7 |
| AI Contour | 0 | 10 | 10 |
| Input Contour | 0 | 3 | 3 |
| Resolve Contour | 0 | 4 | 4 |
| Core | 0 | 3 | 3 |
| Operator Contour | 1 | 0 | 1 |
| Graph Contour | 0 | 1 | 1 |
| Other | 1 | 0 | 1 |
| **Total n8n ELO** | **14** | **30** | **44** |

---

## CRITICAL GAPS

### 1. ELO_Core_AI_Test_Stub is NOT CALLED by anyone!

ELO_Core_AI_Test_Stub is active but **no workflow calls it**.

**Impact:** AI processing is completely disconnected from the pipeline.

**Root cause:** ELO_Input_Processor calls old ELO_Client_Resolve directly, then ends.

### 2. Orphaned Sub-workflows (10)

These workflows have executeWorkflowTrigger but are never called:

| Workflow | Purpose |
|----------|---------|
| ELO_Resolver | Main resolver (calls Tenant/Client/Dialog) |
| ELO_Client_Resolver | Resolve client from external_id |
| ELO_Dialog_Resolver | Find/create dialog |
| ELO_Tenant_Resolver | Resolve tenant from credential |
| ELO_Unifier | Unify clients by phone |
| ELO_Core_Batcher | Batch messages |
| ELO_Core_Dialog_Engine | Main dialog processing |
| ELO_Core_Tenant_Resolver | Old tenant resolver |

**Impact:** New Resolve Contour is not integrated into pipeline.

### 3. ELO_Input_Processor uses old workflow

Current chain:
Merge Batch -> Call Client Resolve (OLD) -> Delete keys -> End

Should be:
Merge Batch -> ELO_Resolver -> ELO_Core_AI_Test_Stub -> Delete keys -> End

---

## Data Flow (Current vs Expected)

### Current (Broken)
MCP Webhook -> ELO_In_* -> Redis batch:* -> ELO_Input_Processor -> ELO_Client_Resolve -> END (NO AI!)

### Expected
MCP Webhook -> ELO_In_* -> Redis batch:* -> ELO_Input_Processor -> ELO_Resolver -> ELO_Core_AI_Test_Stub -> Response

---

## Channel Contour

### Inbound (ELO_In_*)

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_In_WhatsApp | **ON** | Webhook | WhatsApp via MCP |
| ELO_In_Telegram_Bot | **ON** | Webhook | Telegram Bot API |
| ELO_In_Avito | **ON** | Webhook | Avito via MCP |
| ELO_In_App | **ON** | Webhook | Android app messages |
| ELO_In_VK | off | Webhook | VK via MCP |
| ELO_In_MAX | off | Webhook | MAX via MCP |
| ELO_In_Form | off | Webhook | Web forms |
| ELO_In_Phone | off | Webhook | Phone calls |

### Outbound (ELO_Out_*)

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_Out_Telegram_Bot | **ON** | Schedule | Send via Telegram Bot |
| ELO_Out_WhatsApp | **ON** | Schedule | Send via WhatsApp MCP |
| ELO_Out_Router | off | Execute | Route to channel |
| ELO_Out_Avito | off | Schedule | Send via Avito |
| ELO_Out_VK | off | Schedule | Send via VK |
| ELO_Out_MAX | off | Schedule | Send via MAX |

---

## API Contour (7 workflows, all ON)

| Workflow | Endpoint | Description |
|----------|----------|-------------|
| ELO_API_Android_Auth | POST /auth | Login with PIN |
| ELO_API_Android_Dialogs | GET /dialogs | Get dialogs list |
| ELO_API_Android_Messages | GET /messages | Get messages |
| ELO_API_Android_Send_Message | POST /send | Send message |
| ELO_API_Android_Logout | POST /logout | Logout |
| ELO_API_Android_Register_FCM | POST /fcm | Register push token |
| ELO_API_Android_Normalize | POST /normalize | Normalize data |

---

## AI Contour (10 workflows)

| Workflow | Active | Purpose |
|----------|--------|---------|
| ELO_Core_AI_Test_Stub | **ON** | Test stub - returns mock |
| ELO_AI_Extract | off | Extract entities |
| ELO_Core_AI_Derive | off | AI derivation |
| ELO_Context_Collector | off | Collect context |
| ELO_Core_Context_Builder | off | Build full context |
| ELO_Core_Stage_Manager | off | Manage funnel stages |
| ELO_Core_Triggers_Checker | off | Check triggers |
| ELO_Core_Response_Generator | off | Generate response |
| ELO_Core_Graph_Writer | off | Write to Neo4j |
| ELO_Decision | off | AI decision making |

---

## Resolve Contour (4 workflows, all OFF)

| Workflow | Purpose |
|----------|---------|
| ELO_Resolver | Main orchestrator |
| ELO_Tenant_Resolver | Resolve tenant |
| ELO_Client_Resolver | Resolve client |
| ELO_Unifier | Unify clients by phone |

---

## Input Contour (3 workflows, all OFF)

| Workflow | Trigger | Purpose |
|----------|---------|---------|
| ELO_Input_Batcher | Schedule | Add to batch |
| ELO_Input_Processor | Schedule | Process batches |
| ELO_Input_Ingest | Webhook | Ingest messages |

---

## Action Items

### Priority 1: Connect AI to Pipeline
1. Update ELO_Input_Processor to call ELO_Resolver instead of old ELO_Client_Resolve
2. Add call to ELO_Core_AI_Test_Stub after Resolver
3. Activate ELO_Input_Processor

### Priority 2: Activate Resolve Chain
4. Activate ELO_Resolver
5. Activate ELO_Tenant_Resolver
6. Activate ELO_Client_Resolver
7. Import ELO_Dialog_Resolver to n8n

### Priority 3: Enable Full Flow
8. Activate ELO_Input_Batcher
9. Test end-to-end flow
10. Connect AI response to ELO_Out_Router

---

*Generated by Claude Code - 2025-12-28*
