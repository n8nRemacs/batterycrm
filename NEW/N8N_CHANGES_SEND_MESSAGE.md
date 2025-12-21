# n8n Changes: ELO_API_Android_Send_Message

> Workflow ID: 6twQI6tVin73BcN1
> Status: ACTIVE

---

## Problema

1. Webhook path `/android-messages/android/dialogs/:dialog_id/messages` - n8n NE podderzhivaet `:param`
2. Soobshcheniye sohranyaetsya v BD, no NE otpravlyaetsya klientu (net vyzova Out_Router)

---

## Izmeneniya

### 1. Izmenit' Webhook node

**Tekushchiy path:** `android-messages/android/dialogs/:dialog_id/messages`
**Novyy path:** `android/messages/send`

**Shagi:**
1. Otkryt' workflow `ELO_API_Android_Send_Message`
2. Kliknut' na node `Webhook - Send Message`
3. Izmenit' pole `Path` na: `android/messages/send`
4. Ubeditsya chto Method = POST

---

### 2. Izmenit' SQL v "Postgres - Get Dialog Info"

**Tekushchiy SQL:**
```sql
SELECT
  d.id as dialog_id,
  d.tenant_id,
  d.client_id,
  d.external_chat_id as chat_id,
  LOWER(ch.name) as channel,
  c.name as client_name,
  c.phone as client_phone
FROM elo_t_dialogs d
JOIN elo_t_clients c ON d.client_id = c.id
JOIN elo_channels ch ON d.channel_id = ch.id
WHERE d.id = '{{ $('Webhook - Send Message').item.json.params.dialog_id }}'::uuid
  AND d.tenant_id = '{{ $('Postgres - Validate Session').item.json.tenant_id }}'::uuid
LIMIT 1;
```

**Novyy SQL (zamenit' params.dialog_id -> body.dialog_id):**
```sql
SELECT
  d.id as dialog_id,
  d.tenant_id,
  d.client_id,
  d.channel_id,
  d.external_chat_id as chat_id,
  LOWER(ch.name) as channel,
  c.name as client_name,
  c.phone as client_phone,
  ca.account_id as profile_id,
  ca.mcp_base_url
FROM elo_t_dialogs d
JOIN elo_t_clients c ON d.client_id = c.id
JOIN elo_channels ch ON d.channel_id = ch.id
LEFT JOIN elo_t_channel_accounts ca ON d.channel_account_id = ca.id
WHERE d.id = '{{ $('Webhook - Send Message').item.json.body.dialog_id }}'::uuid
  AND d.tenant_id = '{{ $('Postgres - Validate Session').item.json.tenant_id }}'::uuid
LIMIT 1;
```

**Chto izmenili:**
- `params.dialog_id` -> `body.dialog_id`
- Dobavili `d.channel_id` (nuzhno dlya routera)
- Dobavili `ca.account_id as profile_id` (nuzhno dlya MCP)
- Dobavili `ca.mcp_base_url` (URL MCP servera)

---

### 3. Dobavit' HTTP Request node "Call Out Router"

**Posle** uzla `Prepare Channel Send` dobavit' novyy node:

**Tip:** HTTP Request

**Nastroyki:**
- **Name:** `Call Out Router`
- **Method:** POST
- **URL:** `https://n8n.n8nsrv.ru/webhook/elo-out-router`
- **Body Content Type:** JSON
- **Body:**
```json
{
  "channel_id": {{ $('Postgres - Get Dialog Info').item.json.channel_id }},
  "chat_id": "{{ $('Postgres - Get Dialog Info').item.json.chat_id }}",
  "profile_id": "{{ $('Postgres - Get Dialog Info').item.json.profile_id }}",
  "text": "{{ $('Webhook - Send Message').item.json.body.text }}",
  "mcp_base_url": "{{ $('Postgres - Get Dialog Info').item.json.mcp_base_url }}"
}
```

**Soedinit':**
```
Prepare Channel Send --> Call Out Router --> Response - Success
```

---

### 4. Obnovit' "Prepare Channel Send" (optsional'no)

Mozhno uprosto kod dlya peredachi dannyh:

```javascript
const dialogInfo = $('Postgres - Get Dialog Info').first().json;
const message = $('Postgres - Insert Message').first().json;
const body = $('Webhook - Send Message').first().json.body;

return {
  // Dlya Out Router
  channel_id: dialogInfo.channel_id,
  chat_id: dialogInfo.chat_id,
  profile_id: dialogInfo.profile_id,
  mcp_base_url: dialogInfo.mcp_base_url,
  text: body.text,

  // Dlya Response
  message: {
    id: message.id,
    text: message.text,
    direction: message.direction,
    sender_type: message.sender_type,
    sender_name: message.sender_name,
    timestamp: message.timestamp
  }
};
```

---

## Itogovaya struktura workflow

```
Webhook - Send Message (POST /android/messages/send)
    |
    v
Postgres - Validate Session
    |
    +--[invalid]--> Response - Unauthorized
    |
    v [valid]
Postgres - Get Dialog Info  (s body.dialog_id!)
    |
    v
Postgres - Insert Message
    |
    v
Prepare Channel Send
    |
    v
Call Out Router  <-- NOVYY NODE
    |
    v
Response - Success
```

---

## Testirovaniye

Posle izmeneniy proverit' cherez curl:

```bash
curl -X POST "https://n8n.n8nsrv.ru/webhook/android/messages/send" \
  -H "Content-Type: application/json" \
  -d '{
    "session_token": "85bc5364-7765-4562-be9e-02d899bb575e",
    "dialog_id": "cff56064-1fc3-4152-8e64-6e0266a87bf6",
    "text": "Test message from API"
  }'
```

**Ozhidaemyy rezultat:**
1. Soobshcheniye sohranyaetsya v `elo_t_messages`
2. Vyzyvaetsya `ELO_Out_Router`
3. Soobshcheniye otpravlyaetsya klientu v WhatsApp

---

## VAZHNO: ELO_Out_WhatsApp ne sushchestvuet!

Obnaruzheno chto workflow `ELO_Out_WhatsApp` **NE sushchestvuet**.

Sushchestvuyut tol'ko:
- ELO_Out_Router (active)
- ELO_Out_Telegram (inactive)
- ELO_Out_MAX (inactive)

**Nuzhno sozdat' ELO_Out_WhatsApp** pered testirovaniyem!

---

*Instruktsiya sozdana: 2025-12-21*
