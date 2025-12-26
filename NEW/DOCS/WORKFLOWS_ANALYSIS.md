# Workflows Analysis

**Last sync:** 2025-12-26

---

## Summary

| Category | Active | Inactive | Total |
|----------|--------|----------|-------|
| Channel Contour (In) | 4 | 6 | 10 |
| Channel Contour (Out) | 1 | 5 | 6 |
| API | 8 | 2 | 10 |
| AI Contour | 1 | 10 | 11 |
| Input Contour | 0 | 3 | 3 |
| Core | 0 | 3 | 3 |
| Graph Contour | 0 | 1 | 1 |
| **Total** | **14** | **30** | **44** |

---

## Data Flow Diagram

```
                            MCP Channels
                                 |
    +----------+----------+------+------+----------+----------+
    |          |          |             |          |          |
    v          v          v             v          v          v
ELO_In_   ELO_In_    ELO_In_       ELO_In_    ELO_In_    ELO_In_
WhatsApp  Telegram   Avito         VK         MAX        App
  [ON]      [off]    [ON]         [off]      [off]      [ON]
    |          |          |             |          |          |
    +----------+----------+------+------+----------+----------+
                                 |
                                 v
                    +------------------------+
                    | ELO_Core_Tenant_Resolver|
                    |         [off]          |
                    +------------------------+
                                 |
                                 v
                    +------------------------+
                    |   ELO_Client_Resolve   |
                    |         [off]          |
                    +------------------------+
                                 |
                                 v
                    +------------------------+
                    |   ELO_Input_Ingest     |
                    |         [off]          |
                    +------------------------+
                                 |
                                 v
                    +------------------------+
                    |   ELO_Input_Batcher    |
                    |         [off]          |
                    +------------------------+
                                 |
                                 v
                    +------------------------+
                    |  ELO_Input_Processor   |
                    |         [off]          |
                    +------------------------+
                                 |
                                 v
                    +------------------------+
                    | ELO_Core_Dialog_Engine |
                    |         [off]          |
                    +------------------------+
                                 |
          +----------------------+----------------------+
          |                                             |
          v                                             v
+-------------------+                        +-------------------+
| AI Processing     |                        | Operator Mode     |
| (auto-response)   |                        | (manual)          |
+-------------------+                        +-------------------+
          |                                             |
          v                                             v
+-------------------+                        +-------------------+
| ELO_AI_Extract    |                        | ELO_Message_Router|
|       [off]       |                        |       [ON]        |
+-------------------+                        +-------------------+
          |                                             |
          v                                             |
+-------------------+                                   |
| ELO_Decision      |                                   |
|       [off]       |                                   |
+-------------------+                                   |
          |                                             |
          v                                             |
+-------------------+                                   |
| ELO_Executor      |                                   |
|       [off]       |                                   |
+-------------------+                                   |
          |                                             |
          +----------------------+----------------------+
                                 |
                                 v
                    +------------------------+
                    |    ELO_Out_Router      |
                    |         [off]          |
                    +------------------------+
                                 |
    +----------+----------+------+------+----------+
    |          |          |             |          |
    v          v          v             v          v
ELO_Out_   ELO_Out_  ELO_Out_      ELO_Out_   ELO_Out_
WhatsApp   Telegram  Avito          VK         MAX
  [ON]      [off]    [off]        [off]      [off]
```

---

## Channel Contour

### Inbound (ELO_In_*)

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_In_WhatsApp | ON | Webhook | WhatsApp messages via MCP |
| ELO_In_Telegram | off | Webhook | Telegram messages via MCP |
| ELO_In_Avito | ON | Webhook | Avito messages via MCP |
| ELO_In_VK | off | Webhook | VK messages via MCP |
| ELO_In_MAX | off | Webhook | MAX messages via MCP |
| ELO_In_App | ON | Webhook | Android app messages |
| ELO_In_Form | off | Webhook | Web form submissions |
| ELO_In_Phone | off | Webhook | Phone call transcriptions |
| ELO_In_Avito_User | - | Webhook | Avito user account (legacy) |

**Flow:** Webhook -> Normalize -> Tenant Resolver -> Client Resolve -> Input Ingest

### Outbound (ELO_Out_*)

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_Out_Router | off | Execute | Routes to channel-specific Out |
| ELO_Out_WhatsApp | ON | Execute | Send via WhatsApp MCP |
| ELO_Out_Telegram | off | Execute | Send via Telegram MCP |
| ELO_Out_Avito | off | Execute | Send via Avito MCP |
| ELO_Out_VK | off | Execute | Send via VK MCP |
| ELO_Out_MAX | off | Execute | Send via MAX MCP |

**Flow:** Out Router -> Channel Out -> MCP -> Messenger

---

## API Contour

| Workflow | Active | Endpoint | Description |
|----------|--------|----------|-------------|
| ELO_API_Android_Auth | ON | POST /android/auth | Login with PIN |
| ELO_API_Android_Logout | ON | POST /android/logout | Logout device |
| ELO_API_Android_Dialogs | ON | GET /android/dialogs | Get operator dialogs |
| ELO_API_Android_Messages | ON | GET /android/messages | Get dialog messages |
| ELO_API_Android_Send_Message | ON | POST /android/send | Send message |
| ELO_API_Android_Normalize | ON | POST /android/normalize | Normalize operator reply |
| ELO_API_Android_Register_FCM | ON | POST /android/fcm | Register FCM token |

---

## AI Contour

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_Core_AI_Test_Stub | ON | Execute | Test stub (returns mock) |
| ELO_AI_Extract | off | Execute | Extract entities from message |
| ELO_Context_Collector | off | Execute | Collect context for AI |
| ELO_Core_Context_Builder | off | Execute | Build full context |
| ELO_Decision | off | Execute | Make AI decision |
| ELO_Executor | off | Execute | Execute AI decision |
| ELO_Core_Response_Generator | off | Execute | Generate response text |
| ELO_Core_Stage_Manager | off | Execute | Manage funnel stages |
| ELO_Core_Triggers_Checker | off | Execute | Check triggers |
| ELO_Core_AI_Derive | off | Execute | Derive insights |
| ELO_Core_Graph_Writer | off | Execute | Write to Neo4j |

---

## Input Contour

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_Input_Ingest | off | Execute | Initial message ingest |
| ELO_Input_Batcher | off | Schedule | Batch messages |
| ELO_Input_Processor | off | Execute | Process batched messages |

---

## Core

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_Core_Tenant_Resolver | off | Execute | Resolve tenant from webhook_hash |
| ELO_Core_Dialog_Engine | off | Execute | Main dialog processing |
| ELO_Core_Batcher | off | Execute | Message batching |
| ELO_Message_Router | ON | Execute | Route to operator/channel |

---

## Graph Contour

| Workflow | Active | Trigger | Description |
|----------|--------|---------|-------------|
| ELO_Graph_Query | off | Webhook | Execute Cypher queries |

---

## Current Issues

### 1. Many workflows are inactive
Most AI and Core workflows are disabled. Only the basic message flow works:
- ELO_In_* -> ELO_Message_Router -> ELO_Out_WhatsApp

### 2. Android App flow is separate
The Android app uses direct API calls and bypasses the main flow:
- API Auth -> API Dialogs -> API Messages -> API Send

### 3. Missing Client Resolve integration
ELO_Client_Resolve exists but has no ELO tag and is not properly integrated.

### 4. Avito Official API not integrated
The official Avito API workflows are separate and not part of ELO flow.

---

## Recommended Activation Order

1. **Phase 1: Basic Flow**
   - ELO_Core_Tenant_Resolver
   - ELO_Client_Resolve (add ELO tag)
   - ELO_Input_Ingest
   - ELO_Out_Router

2. **Phase 2: AI Processing**
   - ELO_AI_Extract
   - ELO_Context_Collector
   - ELO_Decision

3. **Phase 3: Full AI**
   - ELO_Executor
   - ELO_Core_Response_Generator
   - ELO_Core_Graph_Writer

---

*Generated by Claude Code*
