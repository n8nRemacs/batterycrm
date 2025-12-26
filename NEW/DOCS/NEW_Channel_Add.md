# Adding New Channels - Complete Guide

> Documentation for adding new messaging channels to Eldoleado platform

**Last updated:** 2025-12-26

---

## Table of Contents

1. [Architecture Overview](#architecture-overview)
2. [Required Components](#required-components)
3. [Channel Registration Flow](#channel-registration-flow)
4. [Backend API (n8n)](#backend-api-n8n)
5. [Android App Integration](#android-app-integration)
6. [MCP Server Setup](#mcp-server-setup)
7. [Database Schema](#database-schema)
8. [Checklist](#checklist)
9. [Common Mistakes](#common-mistakes)

---

## Architecture Overview

```
┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐
│  Messenger API  │────▶│   MCP Server    │────▶│   n8n Webhook   │
│  (Telegram,     │     │   (Normalizer)  │     │   (ELO_In_*)    │
│   WhatsApp...)  │     │                 │     │                 │
└─────────────────┘     └─────────────────┘     └─────────────────┘
                                                        │
                                                        ▼
┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐
│  Android App    │────▶│  Register API   │────▶│   PostgreSQL    │
│  (Setup UI)     │     │  (n8n workflow) │     │ elo_t_channel_  │
│                 │     │                 │     │    accounts     │
└─────────────────┘     └─────────────────┘     └─────────────────┘
```

### Data Flow

1. **Incoming messages:** Messenger → MCP Server → n8n (ELO_In_*) → Redis Queue → Processing
2. **Outgoing messages:** n8n (ELO_Out_*) → Redis Queue → MCP Server → Messenger
3. **Channel registration:** Android App → n8n API → PostgreSQL + Redis Cache

---

## Required Components

For each new channel, you need to create/configure:

| Component | Location | Purpose |
|-----------|----------|---------|
| MCP Server | `155.212.221.189:87XX` | Normalize messages, handle webhooks |
| ELO_In_* workflow | n8n | Process incoming messages |
| ELO_Out_* workflow | n8n | Send outgoing messages |
| SetupActivity | Android app | UI for channel connection |
| ChannelCredentialsManager | Android app | Local credential storage |
| ChannelRegistrationService | Android app | Backend registration |

---

## Channel Registration Flow

### Step-by-Step Flow

```
1. User opens channel setup in app
2. User authenticates (QR scan, token input, login/password)
3. App validates credentials with messenger API
4. App saves credentials locally (SharedPreferences)
5. App registers channel with backend (n8n API)
6. Backend saves to elo_t_channel_accounts
7. Backend caches tenant binding in Redis
8. (For bots) App registers with MCP server + sets webhook
```

### Required Parameters for Registration

```kotlin
// POST /android/channels/register
{
    "channel": "telegram",           // Channel name (lowercase)
    "session_id": "bot_token_here",  // Unique session identifier
    "account_id": "bot_username",    // Account ID in messenger
    "account_name": "@BotName",      // Display name (optional)
    "credentials": {                 // Channel-specific credentials
        "bot_token": "123:ABC..."
    },
    "is_official": true              // true = official API, false = unofficial
}
```

### Channel ID Mapping

| Channel | channel_id | Notes |
|---------|------------|-------|
| telegram | 1 | Bot API or User API |
| whatsapp | 2 | Baileys (unofficial) |
| avito | 3 | Camoufox browser |
| vk | 4 | Community API |
| max | 5 | VK Teams API |
| form | 6 | Web forms |
| phone | 7 | Phone calls |

---

## Backend API (n8n)

### ELO_API_Android_Register_Channel

**Endpoint:** `POST https://n8n.n8nsrv.ru/webhook/android/channels/register`

**Headers:**
```
X-Session-Token: <operator_session_token>
Content-Type: application/json
```

**Request Body:**
```json
{
    "channel": "telegram",
    "session_id": "123456789:ABC...",
    "account_id": "my_bot",
    "account_name": "@my_bot",
    "credentials": {
        "bot_token": "123456789:ABC..."
    },
    "is_official": true
}
```

**Responses:**

| Code | Status | Description |
|------|--------|-------------|
| 200 | success | Channel registered/updated |
| 409 | conflict | Channel belongs to another tenant |
| 401 | unauthorized | Invalid session token |
| 400 | error | Validation failed |

**Success Response:**
```json
{
    "status": "success",
    "channel_account_id": "uuid-here",
    "tenant_id": "uuid-here",
    "message": "Channel registered successfully"
}
```

**Conflict Response (409):**
```json
{
    "status": "conflict",
    "message": "Этот канал уже подключен к другому аккаунту"
}
```

### Workflow Logic

1. Validate input fields
2. Get operator by session token
3. Check if channel already exists
4. If exists for same tenant → update
5. If exists for different tenant → return 409 conflict
6. If new → create channel_account
7. Cache tenant binding in Redis

### Redis Cache Key Format

```
cache:tenant:{channel}:{session_id}
```

Example:
```
cache:tenant:telegram:123456789:ABCdef...
cache:tenant:whatsapp:wa_operator123_1234567890
```

**Cache Value:**
```json
{
    "tenant_id": "uuid",
    "channel_account_id": "uuid",
    "channel_id": 1
}
```

---

## Android App Integration

### 1. ChannelCredentialsManager

Location: `app/src/main/java/com/eldoleado/app/channels/ChannelCredentialsManager.kt`

Add methods for the new channel:

```kotlin
// Save credentials
fun saveNewChannel(sessionId: String, accountId: String, ...) {
    prefs.edit().apply {
        putString("newchannel_session_id", sessionId)
        putString("newchannel_account_id", accountId)
        // ... other fields
        apply()
    }
}

// Get credentials
fun getNewChannelSessionId(): String? = prefs.getString("newchannel_session_id", null)

// Clear credentials
fun clearNewChannel() {
    prefs.edit().apply {
        remove("newchannel_session_id")
        // ... remove all fields
        apply()
    }
}

// Get status
fun getNewChannelStatus(): ChannelStatus { ... }
```

### 2. ChannelRegistrationService

Location: `app/src/main/java/com/eldoleado/app/channels/ChannelRegistrationService.kt`

Add registration method:

```kotlin
suspend fun registerNewChannel(
    sessionId: String,
    accountId: String,
    accountName: String?,
    // ... channel-specific params
): RegistrationResult {
    val credentials = JSONObject().apply {
        put("field1", value1)
        put("field2", value2)
    }
    return registerChannel(
        channel = "newchannel",
        sessionId = sessionId,
        accountId = accountId,
        accountName = accountName,
        credentials = credentials,
        isOfficial = true  // or false for unofficial APIs
    )
}
```

### 3. SetupActivity

Location: `app/src/main/java/com/eldoleado/app/channels/setup/NewChannelSetupActivity.kt`

Required structure:

```kotlin
class NewChannelSetupActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "NewChannelSetup"
        // MCP server URL if needed
        private const val MCP_URL = "http://155.212.221.189:87XX"
    }

    private lateinit var channelCredentialsManager: ChannelCredentialsManager
    private lateinit var channelRegistrationService: ChannelRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newchannel_setup)

        channelCredentialsManager = ChannelCredentialsManager(this)
        channelRegistrationService = ChannelRegistrationService(this)

        // ... setup UI
    }

    private fun onConnectionSuccess(/* params */) {
        // 1. Save locally
        channelCredentialsManager.saveNewChannel(...)

        // 2. Register with backend
        CoroutineScope(Dispatchers.IO).launch {
            val result = channelRegistrationService.registerNewChannel(...)

            withContext(Dispatchers.Main) {
                when (result) {
                    is RegistrationResult.Success -> {
                        // Show success UI
                    }
                    is RegistrationResult.AlreadyRegistered -> {
                        // Clear local, show error
                        channelCredentialsManager.clearNewChannel()
                        Toast.makeText(..., result.message, ...).show()
                    }
                    // ... other cases
                }
            }
        }

        // 3. Register with MCP if needed (for bots/webhooks)
        registerWithMcp(...)
    }
}
```

### 4. Layout XML

Location: `app/src/main/res/layout/activity_newchannel_setup.xml`

Required elements:
- Header with back button
- Loading state (ProgressBar + TextView)
- Input form(s)
- Success state
- Error display

### 5. AndroidManifest.xml

Add activity declaration:

```xml
<activity
    android:name=".channels.setup.NewChannelSetupActivity"
    android:theme="@style/Theme.EldoleadoApp"
    android:exported="false" />
```

### 6. ChannelDetailsActivity

Add navigation to setup:

```kotlin
ChannelType.NEWCHANNEL -> startActivity(
    Intent(this, NewChannelSetupActivity::class.java)
)
```

---

## MCP Server Setup

### When MCP Server is Needed

| Scenario | MCP Required | Reason |
|----------|--------------|--------|
| Bot with webhook | Yes | Normalize incoming, set webhook |
| Polling-based | Optional | Can poll directly from n8n |
| User API (MTProto) | Yes | Complex protocol handling |
| Browser automation | Yes | Session management |

### MCP Server Configuration

Location: `/opt/mcp-{channel}/.env`

Required variables:
```env
API_KEY=eldoleado_mcp_2024
N8N_WEBHOOK_URL=https://n8n.n8nsrv.ru/webhook/{channel}-in
SERVER_PORT=87XX
```

### Webhook Registration (for bots)

Android app must register bot with MCP:

```kotlin
private fun registerWithMcp(token: String): Boolean {
    val url = URL("$MCP_URL/setup?base_url=$MCP_URL")
    val connection = url.openConnection() as HttpURLConnection
    connection.requestMethod = "POST"
    connection.setRequestProperty("Content-Type", "application/json")
    connection.setRequestProperty("X-API-Key", MCP_API_KEY)
    connection.doOutput = true

    val body = JSONObject().apply {
        put("token", token)
    }

    connection.outputStream.bufferedWriter().use {
        it.write(body.toString())
    }

    return connection.responseCode in 200..299
}
```

---

## Database Schema

### elo_t_channel_accounts

```sql
CREATE TABLE elo_t_channel_accounts (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    tenant_id UUID NOT NULL REFERENCES elo_t_tenants(id),
    channel_id INTEGER NOT NULL,  -- 1=telegram, 2=whatsapp, etc
    session_id TEXT NOT NULL,     -- Unique session identifier
    account_id TEXT NOT NULL,     -- Account ID in messenger
    account_name TEXT,            -- Display name
    credentials JSONB,            -- Channel-specific credentials
    session_status TEXT DEFAULT 'pending',
    is_official BOOLEAN DEFAULT false,
    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(channel_id, account_id)  -- One channel per account
);
```

### Credentials JSONB Structure by Channel

**Telegram Bot:**
```json
{
    "bot_token": "123456789:ABC..."
}
```

**Telegram User:**
```json
{
    "api_id": "12345678",
    "api_hash": "abcdef...",
    "phone": "+79991234567"
}
```

**WhatsApp:**
```json
{
    "phone": "+79991234567",
    "name": "User Name"
}
```

**Avito:**
```json
{
    "user_id": "12345",
    "hash_id": "abc123",
    "cookies": ""  // stored on Camoufox server
}
```

**MAX (VK Teams):**
```json
{
    "token": "access_token",
    "user_id": "12345"
}
```

---

## Checklist

### Before Starting

- [ ] Determine channel_id (add to mapping if new)
- [ ] Decide: MCP server needed?
- [ ] Decide: Official or unofficial API?
- [ ] Document authentication flow

### Android App

- [ ] Add to ChannelType enum
- [ ] Create SetupActivity
- [ ] Create layout XML
- [ ] Add to ChannelCredentialsManager
- [ ] Add to ChannelRegistrationService
- [ ] Register in AndroidManifest.xml
- [ ] Add navigation in ChannelDetailsActivity
- [ ] Add channel icon (ic_newchannel.xml)
- [ ] Add channel color to colors.xml

### n8n Workflows

- [ ] Create ELO_In_{Channel} workflow
- [ ] Create ELO_Out_{Channel} workflow
- [ ] Update ELO_API_Android_Register_Channel (channel mapping)
- [ ] Activate all workflows

### MCP Server (if needed)

- [ ] Create MCP server code
- [ ] Configure .env
- [ ] Deploy to server
- [ ] Set correct webhook URL in .env
- [ ] Test health endpoint

### Testing

- [ ] Test channel setup in app
- [ ] Verify credentials saved locally
- [ ] Verify channel registered in DB
- [ ] Verify Redis cache populated
- [ ] Test incoming message flow
- [ ] Test outgoing message flow
- [ ] Test conflict handling (409)

---

## Common Mistakes

### 1. Webhook URL Mismatch

**Problem:** MCP server sends to wrong n8n webhook URL.

**Solution:** Check `.env` on MCP server:
```env
N8N_WEBHOOK_URL=https://n8n.n8nsrv.ru/webhook/{exact-path-from-workflow}
```

Verify webhook path in n8n workflow matches exactly.

### 2. Missing MCP Registration

**Problem:** Bot doesn't receive messages after setup.

**Solution:** App must register bot with MCP server AND set webhook:
```kotlin
// In SetupActivity after successful auth
registerWithMcp(token)  // This sets up webhook
```

### 3. Wrong Credentials Field Name

**Problem:** ELO_Out_* can't find token in credentials.

**Solution:** Ensure field names match:
```kotlin
// In ChannelRegistrationService
put("bot_token", token)  // Must match SQL query
```
```sql
-- In ELO_Out_* workflow
SELECT credentials->>'bot_token' as bot_token
```

### 4. Missing Channel in Mapping

**Problem:** Registration fails with "Unknown channel".

**Solution:** Add channel to `channelMap` in ELO_API_Android_Register_Channel:
```javascript
const channelMap = {
    'telegram': 1,
    'whatsapp': 2,
    'newchannel': 8,  // Add new channel
};
```

### 5. No Conflict Handling

**Problem:** Multiple tenants can register same channel.

**Solution:**
1. DB has UNIQUE constraint: `UNIQUE(channel_id, account_id)`
2. Workflow checks existing channel and returns 409
3. App handles 409 and clears local credentials

### 6. Redis Cache Not Populated

**Problem:** Tenant resolution fails after registration.

**Solution:** Registration workflow must cache tenant:
```javascript
// Redis SET in registration workflow
const cacheKey = `cache:tenant:${channel}:${session_id}`;
const cacheValue = JSON.stringify({
    tenant_id,
    channel_account_id,
    channel_id
});
```

### 7. Workflow Not Activated

**Problem:** Messages not processed.

**Solution:** Activate both workflows in n8n UI:
- ELO_In_{Channel} - for incoming
- ELO_Out_{Channel} - for outgoing

### 8. Session ID Format Inconsistency

**Problem:** Cache miss due to different session_id format.

**Solution:** Use consistent format:
```kotlin
// For WhatsApp: wa_{operator}_{timestamp}
val sessionId = "wa_${operatorId}_${System.currentTimeMillis()}"

// For Telegram Bot: bot token itself
val sessionId = botToken

// For Avito: camoufox_{account}
val sessionId = "camoufox_${accountId}"
```

---

## Example: Adding a New Channel (Summary)

1. **Assign channel_id** (e.g., 8 for "mychannel")

2. **Update n8n workflow** - add to channelMap

3. **Create Android files:**
   - `MyChannelSetupActivity.kt`
   - `activity_mychannel_setup.xml`
   - Add to `ChannelCredentialsManager.kt`
   - Add to `ChannelRegistrationService.kt`
   - Update `AndroidManifest.xml`
   - Update `ChannelDetailsActivity.kt`

4. **Create n8n workflows:**
   - `ELO_In_MyChannel` - webhook path: `/mychannel-in`
   - `ELO_Out_MyChannel` - Redis queue: `queue:outgoing:mychannel`

5. **(Optional) Create MCP server:**
   - `/opt/mcp-mychannel/`
   - Configure `.env` with webhook URL
   - Deploy and test

6. **Test full flow:**
   - Setup → Registration → Incoming → Outgoing

---

## Contacts

For questions about channel integration:
- n8n workflows: https://n8n.n8nsrv.ru
- MCP servers: 155.212.221.189
- Database: 185.221.214.83
