# ELO Workflows Analysis

> Last sync: 2025-12-20
> Total: 38 workflows (13 active, 25 inactive)

---

## Summary by Contour

| Contour | Active | Inactive | Total |
|---------|--------|----------|-------|
| Channel In | 2 | 8 | 10 |
| Channel Out | 1 | 5 | 6 |
| Client | 1 | 0 | 1 |
| AI Core | 1 | 9 | 10 |
| API | 7 | 0 | 7 |
| Graph | 0 | 1 | 1 |
| Router | 1 | 0 | 1 |
| Decision | 0 | 2 | 2 |
| **Total** | **13** | **25** | **38** |

---

## Data Flow Diagram

```
                        INBOUND (Client -> Operator)
                        ============================

[WhatsApp/TG/VK/Avito/MAX/Phone/Form/App]
                |
                v
        ELO_In_{Channel}          <- Webhook, STT (Whisper), normalize
                |
                v
        Redis queue:incoming      <- Push message
                |
                v
        ELO_Input_Batcher         <- Poll every 3s, debounce 10s/40s max
                |
                v
        ELO_Input_Processor       <- Check deadline, collect batch
                |
                v
        ELO_Client_Resolve        <- Tenant/Client/Dialog resolution
                |
                v
        ELO_Message_Router        <- direction=in -> push_to_operator
                |
                v
        [FCM Push to Android]     <- TODO: ELO_Notify_Operator


                        OUTBOUND (Operator -> Client)
                        =============================

        [Android App]
                |
                v
        ELO_API_Android_Send_Message  <- Save to elo_t_messages
                |
                v (TODO: missing call)
        ELO_Out_Router            <- Switch by channel_id
                |
        +-------+-------+-------+-------+-------+
        |       |       |       |       |       |
        v       v       v       v       v       v
    ELO_Out_  ELO_Out_  ELO_Out_  ELO_Out_  ELO_Out_
    Telegram  WhatsApp  Avito     VK       MAX
        |
        v
        MCP Server -> Channel
```

---

## Channel In (10 workflows)

### ELO_In_WhatsApp (ACTIVE)
**Webhook:** POST `/whatsapp-incoming`

**Flow:**
```
Webhook -> Is Message? -> Extract WhatsApp Data -> Has Voice?
    |                          |-> Download Voice -> Transcribe (Whisper) -> Normalize
    |                          +-> Normalize (no voice)
    +-> Skip Non-Message                    |
                                            v
                               Prepare for Queue -> Push to Redis -> Respond
```

**Output format:**
```json
{
  "channel": "whatsapp",
  "profile_id": "session_id",
  "external_user_id": "phone",
  "external_chat_id": "chat_id",
  "text": "message + transcription",
  "timestamp": "ISO",
  "client_phone": "+7...",
  "client_name": "...",
  "media": { "has_voice": bool, "has_images": bool }
}
```

### ELO_In_App (ACTIVE)
**Webhook:** POST `/in-app`

**Purpose:** Handle messages from Android app (operator-as-server mode)

**Flow:**
```
Webhook -> Prepare -> [Audio?] -> Whisper -> [Media?] -> Proxy Fetch -> Save -> Respond
```

### ELO_In_Telegram (inactive)
**Webhook:** POST `/telegram-incoming`

### ELO_In_VK (inactive)
**Webhook:** POST `/vk-incoming`

### ELO_In_Avito (inactive)
**Webhook:** POST `/avito-incoming`

### ELO_In_MAX (inactive)
**Webhook:** POST `/max-incoming`

### ELO_In_Phone (inactive)
**Webhook:** POST `/phone-incoming`

### ELO_In_Form (inactive)
**Webhook:** POST `/form-incoming`

### ELO_Input_Batcher (inactive)
**Trigger:** Schedule every 3 seconds

**Purpose:** Message batching with debounce (10s silence, 40s max wait)

**Flow:**
```
Schedule 3s -> Pop from queue:incoming -> Parse -> Get first_seen
    -> Calc deadline -> Push to batch:{key} -> Set deadline
```

### ELO_Input_Processor (inactive)
**Trigger:** Schedule every 3 seconds

**Purpose:** Process ready batches

**Flow:**
```
Schedule 3s -> Get deadline:* keys -> Check if due
    -> Collect batch messages -> Call ELO_Client_Resolve -> Cleanup Redis
```

### ELO_Input_Ingest (inactive)
**Trigger:** Execute Workflow

**Purpose:** Sub-workflow to process single message

---

## Channel Out (6 workflows)

### ELO_Out_Router (ACTIVE)
**Webhook:** POST `/elo-out-router`

**Channel mapping:**
| channel_id | Channel | Sub-workflow |
|------------|---------|--------------|
| 1 | Telegram | ELO_Out_Telegram |
| 2 | WhatsApp | ELO_Out_WhatsApp |
| 3 | Avito | ELO_Out_Avito |
| 4 | VK | ELO_Out_VK |
| 5 | MAX | ELO_Out_MAX |

**Flow:**
```
Webhook -> Determine Channel -> Switch Channel
    -> Call ELO_Out_{channel} -> Respond
```

### ELO_Out_WhatsApp (inactive)
**Trigger:** Execute Workflow

**Purpose:** Send message via MCP WhatsApp Baileys

### ELO_Out_Telegram (inactive)
**Trigger:** Execute Workflow

### ELO_Out_VK (inactive)
**Trigger:** Execute Workflow

### ELO_Out_Avito (inactive)
**Trigger:** Execute Workflow

### ELO_Out_MAX (inactive)
**Trigger:** Execute Workflow

---

## Client Contour (1 workflow)

### ELO_Client_Resolve (ACTIVE)
**Trigger:** Execute Workflow

**Purpose:** Resolve tenant, client, and dialog from incoming message

**Key operations:**
1. Tenant resolution by profile_id/channel
2. Client lookup/creation by phone/channel ID
3. Dialog lookup/creation for client
4. Redis caching for performance

**Output:**
```json
{
  "tenant_id": "uuid",
  "client_id": "uuid",
  "dialog_id": "uuid",
  "is_new_client": bool,
  "is_new_dialog": bool
}
```

---

## Router (1 workflow)

### ELO_Message_Router (ACTIVE)
**Webhook:** POST `/router`

**Purpose:** Route messages based on direction and status

**Flow:**
```
Webhook -> Determine Type
    |-> from_client -> push_to_operator action
    |-> approved -> send_to_client action
    +-> from_operator -> Normalize (OpenRouter Gemini) -> show_draft action
```

**Normalization:** Uses `google/gemini-2.0-flash-001` via OpenRouter for grammar/spelling correction

---

## AI Contour (10 workflows)

### ELO_Core_AI_Test_Stub (ACTIVE)
**Webhook:** POST `/elo-core-ingest`

**Purpose:** Test stub - returns echo response

```json
{
  "message": { "text": "[TEST] Received: ..." },
  "context_updated": true,
  "trace_id": "..."
}
```

### ELO_Core_Context_Builder (inactive)
**Purpose:** Build context from PostgreSQL + Neo4j

### ELO_Core_Graph_Writer (inactive)
**Purpose:** Write entities to Neo4j

### ELO_Core_Stage_Manager (inactive)
**Purpose:** Manage dialog stages (micro-funnel)

### ELO_Core_Triggers_Checker (inactive)
**Purpose:** Check for action triggers

### ELO_Core_AI_Derive (inactive)
**Purpose:** AI derivation logic

### ELO_Core_Response_Generator (inactive)
**Purpose:** Generate AI responses

### ELO_Context_Collector (inactive)
**Purpose:** Collect context for AI

### ELO_AI_Extract (inactive)
**Purpose:** Extract entities from text

### ELO_Decision (inactive)
**Purpose:** Decision making logic

### ELO_Executor (inactive)
**Purpose:** Execute AI decisions

---

## API Contour (7 workflows - ALL ACTIVE)

### ELO_API_Android_Auth
**Webhook:** POST `/android/auth/login`

**Flow:**
```
Login -> Find Operator -> Verify Password -> Generate Token
    -> Insert Device -> Response
```

**Response:**
```json
{
  "success": true,
  "operator_id": "uuid",
  "tenant_id": "uuid",
  "session_token": "uuid",
  "app_mode": "client|server|both",
  "tunnel_url": "https://tunnel.eldoleado.ru/{session_token}"
}
```

### ELO_API_Android_Dialogs
**Webhook:** GET `/android/dialogs`

**Purpose:** Get list of dialogs for operator

### ELO_API_Android_Messages
**Webhook:** GET `/android/dialogs/:dialog_id/messages`

**Purpose:** Get messages for a dialog

### ELO_API_Android_Send_Message
**Webhook:** POST `/android-messages/android/dialogs/:dialog_id/messages`

**Flow:**
```
Webhook -> Validate Session -> Get Dialog Info
    -> Insert Message (direction_id=2) -> Response
```

**GAP:** Does NOT call ELO_Out_Router!

### ELO_API_Android_Normalize
**Webhook:** POST `/android/normalize`

**Purpose:** Normalize operator text (grammar/spelling)

### ELO_API_Android_Register_FCM
**Webhook:** POST `/android-register-fcm`

**Purpose:** Register FCM token for push notifications

### ELO_API_Android_Logout
**Webhook:** POST `/android/logout`

---

## Graph Contour (1 workflow)

### ELO_Graph_Query (inactive)
**Purpose:** Query Neo4j graph database

---

## Webhook Endpoints Summary

| Workflow | Method | Path | Status |
|----------|--------|------|--------|
| ELO_In_WhatsApp | POST | /whatsapp-incoming | Active |
| ELO_In_App | POST | /in-app | Active |
| ELO_In_Telegram | POST | /telegram-incoming | Inactive |
| ELO_In_VK | POST | /vk-incoming | Inactive |
| ELO_In_Avito | POST | /avito-incoming | Inactive |
| ELO_In_MAX | POST | /max-incoming | Inactive |
| ELO_Out_Router | POST | /elo-out-router | Active |
| ELO_Message_Router | POST | /router | Active |
| ELO_Core_AI_Test_Stub | POST | /elo-core-ingest | Active |
| ELO_API_Android_Auth | POST | /android/auth/login | Active |
| ELO_API_Android_Dialogs | GET | /android/dialogs | Active |
| ELO_API_Android_Messages | GET | /android/dialogs/:id/messages | Active |
| ELO_API_Android_Send_Message | POST | /android-messages/... | Active |
| ELO_API_Android_Normalize | POST | /android/normalize | Active |
| ELO_API_Android_Register_FCM | POST | /android-register-fcm | Active |
| ELO_API_Android_Logout | POST | /android/logout | Active |

---

## Identified Gaps

### Critical

1. **ELO_API_Android_Send_Message** - Does NOT call `ELO_Out_Router`
   - Message is saved to DB but not sent to client
   - Need to add HTTP call to `/webhook/elo-out-router`

2. **No FCM Push Workflow** - When new message arrives, no workflow pushes to Android
   - Need `ELO_Notify_Operator` workflow
   - Should be called after `ELO_Client_Resolve`

3. **Input Pipeline Inactive** - `ELO_Input_Batcher` and `ELO_Input_Processor` are inactive
   - Messages pushed to Redis but not processed

### Medium

4. **Incoming messages not saved** - `ELO_Client_Resolve` doesn't save to `elo_t_messages`
   - Patch created: `Client Contour/PATCH_ELO_Client_Resolve.md`

5. **Most Out channels inactive** - Only Router is active
   - ELO_Out_WhatsApp, ELO_Out_Telegram, etc. need activation

6. **AI Core is stub** - Only test stub active
   - Real AI workflows (Context_Builder, Response_Generator) inactive

---

## Database Tables

| Table | Used By |
|-------|---------|
| elo_t_operators | Auth |
| elo_t_operator_devices | Auth, FCM, Logout |
| elo_t_tenants | Client_Resolve |
| elo_t_clients | Client_Resolve, Messages |
| elo_t_dialogs | Client_Resolve, Dialogs, Messages |
| elo_t_messages | Send_Message |
| elo_channels | Out_Router |

---

*Generated: 2025-12-20*
