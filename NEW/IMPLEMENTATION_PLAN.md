# Plan implementacii 3-h prioritetnyh problem

> Data: 2025-12-21
> Status: Plan

---

## Obzor problem

| # | Problema | Tip | Slozhnost' |
|---|----------|-----|------------|
| 1 | Normalize webhook ne rabotaet (path params) | n8n + Android | Srednyaya |
| 2 | Send message webhook ne rabotaet (path params) + ne vyzyvaet Out_Router | n8n + Android | Srednyaya |
| 3 | Novye dialogi ne poluchayut assigned_operator_id | n8n SQL | Srednyaya |

---

## PRIORITET 1: Ispravit' normalizaciyu teksta

### 1.1 Problema

**Tekushchee sostoyanie:**
- Android vyzyvaet: `POST /android/dialogs/{dialog_id}/normalize`
- n8n webhook: `/android-normalize/android/dialogs/:dialog_id/normalize`
- **n8n NE podderzhivaet dinamicheskie path parametry!**

### 1.2 Reshenie

**Strategiya:** Pereyti na body parametry vmesto path.

### 1.3 Shagi realizacii

#### Shag 1.3.1: n8n - Izmenit' ELO_API_Android_Normalize

**Tekushchiy webhook path:** `/android-normalize/android/dialogs/:dialog_id/normalize`
**Novyy webhook path:** `/android/normalize`
**Metod:** POST

**Izmenenie v n8n:**
1. Otkryt' workflow `ELO_API_Android_Normalize`
2. Izmenit' Webhook node:
   - Path: `/android/normalize`
   - Method: POST
3. Obnovit' logiku chteniya `dialog_id`:
   ```javascript
   // Bylo (path param - ne rabotaet):
   const dialog_id = $input.first().json.params.dialog_id;

   // Stalo (body param):
   const dialog_id = $input.first().json.body.dialog_id;
   ```

#### Shag 1.3.2: Android - Izmenit' ApiService.kt

**Fayl:** `app/src/main/java/com/eldoleado/app/api/ApiService.kt`

**Tekushchiy kod:**
```kotlin
@POST("android-normalize/android/dialogs/{dialog_id}/normalize")
fun normalizeDialogText(
    @Path("dialog_id") dialogId: String,
    @Body request: NormalizeTextRequest
): Call<NormalizeTextResponse>
```

**Novyy kod:**
```kotlin
@POST("android/normalize")
fun normalizeDialogText(
    @Body request: NormalizeDialogRequest
): Call<NormalizeDialogResponse>
```

#### Shag 1.3.3: Android - Sozdat'/Obnovit' data klassy

**Fayl:** `app/src/main/java/com/eldoleado/app/api/ApiService.kt` ili otdel'nyy fayl

**Dobavit' NormalizeDialogRequest:**
```kotlin
data class NormalizeDialogRequest(
    val session_token: String,
    val dialog_id: String,
    val text: String
)
```

**Proverit' NormalizeDialogResponse (dolzhen byt'):**
```kotlin
data class NormalizeDialogResponse(
    val success: Boolean,
    val normalized_text: String?,
    val error: String?
)
```

#### Shag 1.3.4: Android - Obnovit' vyzov v ChatActivity.kt

**Fayl:** `app/src/main/java/com/eldoleado/app/operator/ChatActivity.kt`

**Nayti mesto vyzova normalize i obnovit':**
```kotlin
// Bylo:
val request = NormalizeTextRequest(
    session_token = sessionToken,
    text = messageText
)
apiService.normalizeDialogText(dialogId, request)

// Stalo:
val request = NormalizeDialogRequest(
    session_token = sessionToken,
    dialog_id = dialogId,
    text = messageText
)
apiService.normalizeDialogText(request)
```

### 1.4 Testirovaniye

```bash
# Test normalize webhook posle izmeneniy
curl -X POST "https://n8n.n8nsrv.ru/webhook/android/normalize" \
  -H "Content-Type: application/json" \
  -d '{
    "session_token": "85bc5364-7765-4562-be9e-02d899bb575e",
    "dialog_id": "cff56064-1fc3-4152-8e64-6e0266a87bf6",
    "text": "привет как дела"
  }'
```

**Ozhidaemyy otvet:**
```json
{
  "success": true,
  "normalized_text": "Привет, как дела?"
}
```

---

## PRIORITET 2: Ispravit' otpravku soobshcheniy

### 2.1 Problema

**Tekushchee sostoyanie:**
- Android vyzyvaet: `POST /android-messages/android/dialogs/{dialog_id}/messages`
- n8n webhook: `/android-messages/android/dialogs/:dialog_id/messages`
- **n8n NE podderzhivaet dinamicheskie path parametry!**
- **Dopolnitel'no:** Soobshcheniye sohranyaetsya v BD, no NE otpravlyaetsya klientu (net vyzova ELO_Out_Router)

### 2.2 Reshenie

**Strategiya:**
1. Pereyti na body/query parametry vmesto path
2. Dobavit' vyzov ELO_Out_Router posle sohraneniya soobshcheniya

### 2.3 Shagi realizacii

#### Shag 2.3.1: n8n - Izmenit' ELO_API_Android_Send_Message

**Tekushchiy webhook path:** `/android-messages/android/dialogs/:dialog_id/messages`
**Novyy webhook path:** `/android/messages/send`
**Metod:** POST

**Izmenenie v n8n:**
1. Otkryt' workflow `ELO_API_Android_Send_Message`
2. Izmenit' Webhook node:
   - Path: `/android/messages/send`
   - Method: POST
3. Obnovit' logiku chteniya `dialog_id`:
   ```javascript
   // Bylo (path param - ne rabotaet):
   const dialog_id = $input.first().json.params.dialog_id;

   // Stalo (body param):
   const dialog_id = $input.first().json.body.dialog_id;
   ```

#### Shag 2.3.2: n8n - Dobavit' vyzov ELO_Out_Router

**V tom zhe workflow ELO_API_Android_Send_Message:**

Posle uzla "Insert Message" dobavit' HTTP Request node:

**Konfiguratsiya HTTP Request:**
- Name: `Call Out Router`
- Method: POST
- URL: `https://n8n.n8nsrv.ru/webhook/elo-out-router`
- Body (JSON):
```json
{
  "tenant_id": "{{ $json.tenant_id }}",
  "dialog_id": "{{ $json.dialog_id }}",
  "message_id": "{{ $json.message_id }}",
  "text": "{{ $json.text }}",
  "channel_id": "{{ $json.channel_id }}"
}
```

**Flow posle izmeneniya:**
```
Webhook -> Validate Session -> Get Dialog Info
    -> Insert Message -> Call Out Router -> Response
```

#### Shag 2.3.3: Android - Izmenit' ApiService.kt

**Fayl:** `app/src/main/java/com/eldoleado/app/api/ApiService.kt`

**Tekushchiy kod:**
```kotlin
@POST("android-messages/android/dialogs/{dialog_id}/messages")
fun sendChatMessage(
    @Path("dialog_id") dialogId: String,
    @Body request: SendMessageRequest
): Call<SendMessageResponse>
```

**Novyy kod:**
```kotlin
@POST("android/messages/send")
fun sendChatMessage(
    @Body request: SendMessageRequest
): Call<SendMessageResponse>
```

#### Shag 2.3.4: Android - Obnovit' SendMessageRequest

**Fayl:** Data klassy v ApiService.kt

**Tekushchiy SendMessageRequest (proverit'):**
```kotlin
data class SendMessageRequest(
    val session_token: String,
    val text: String
)
```

**Novyy SendMessageRequest:**
```kotlin
data class SendMessageRequest(
    val session_token: String,
    val dialog_id: String,
    val text: String
)
```

#### Shag 2.3.5: Android - Obnovit' vyzov v ChatActivity.kt

**Fayl:** `app/src/main/java/com/eldoleado/app/operator/ChatActivity.kt`

**Nayti mesto vyzova sendMessage i obnovit':**
```kotlin
// Bylo:
val request = SendMessageRequest(
    session_token = sessionToken,
    text = messageText
)
apiService.sendChatMessage(dialogId, request)

// Stalo:
val request = SendMessageRequest(
    session_token = sessionToken,
    dialog_id = dialogId,
    text = messageText
)
apiService.sendChatMessage(request)
```

### 2.4 Testirovaniye

```bash
# Test send message webhook posle izmeneniy
curl -X POST "https://n8n.n8nsrv.ru/webhook/android/messages/send" \
  -H "Content-Type: application/json" \
  -d '{
    "session_token": "85bc5364-7765-4562-be9e-02d899bb575e",
    "dialog_id": "cff56064-1fc3-4152-8e64-6e0266a87bf6",
    "text": "Test message from operator"
  }'
```

**Ozhidaemyy otvet:**
```json
{
  "success": true,
  "message_id": "uuid",
  "sent_to_channel": true
}
```

**Proverit' chto soobshcheniye doshlo v WhatsApp/Telegram:**
1. Posle vyzova API proverit' logi MCP servera
2. Proverit' chto klient poluchil soobshcheniye

---

## PRIORITET 3: Avtonaznachenie operatora dlya novyh dialogov

### 3.1 Problema

**Tekushchee sostoyanie:**
- Novye dialogi sozdayutsya bez `assigned_operator_id`
- Operator ne vidit novye dialogi v svoem spiske
- Net svyazi mezhdu `channel_account` i `operator`

### 3.2 Reshenie

**Strategiya:**
1. Dobavit' tablitsu `elo_t_operator_channels` (svyaz' operator <-> channel_account)
2. Pri sozdanii dialoga naznachat' operatora iz etoy tablitsy
3. Obnovlyat' `last_message_at` pri kazhdом novom soobshchenii

### 3.3 Shagi realizacii

#### Shag 3.3.1: Sozdaniye tablitsy elo_t_operator_channels

**SQL Migration:**
```sql
-- Tablitsa svyazi operatorov s kanal-akkauntami
CREATE TABLE IF NOT EXISTS elo_t_operator_channels (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    operator_id UUID NOT NULL REFERENCES elo_t_operators(id),
    channel_account_id UUID NOT NULL REFERENCES elo_t_channel_accounts(id),
    is_primary BOOLEAN DEFAULT false,  -- pervichnyy operator dlya etogo akkaunts
    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(operator_id, channel_account_id)
);

-- Indeks dlya bystrogo poiska operatora po kanal-akkauntu
CREATE INDEX idx_operator_channels_account
ON elo_t_operator_channels(channel_account_id)
WHERE is_active = true;

-- Indeks dlya poiska pervichnogo operatora
CREATE INDEX idx_operator_channels_primary
ON elo_t_operator_channels(channel_account_id, is_primary)
WHERE is_active = true AND is_primary = true;
```

**Vypolnit' na servere:**
```bash
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c '
CREATE TABLE IF NOT EXISTS elo_t_operator_channels (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    operator_id UUID NOT NULL REFERENCES elo_t_operators(id),
    channel_account_id UUID NOT NULL REFERENCES elo_t_channel_accounts(id),
    is_primary BOOLEAN DEFAULT false,
    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),
    UNIQUE(operator_id, channel_account_id)
);

CREATE INDEX IF NOT EXISTS idx_operator_channels_account
ON elo_t_operator_channels(channel_account_id)
WHERE is_active = true;

CREATE INDEX IF NOT EXISTS idx_operator_channels_primary
ON elo_t_operator_channels(channel_account_id, is_primary)
WHERE is_active = true AND is_primary = true;
'"
```

#### Shag 3.3.2: Zapolnit' testovye dannye

**Dlya Test Admin operatora:**
```sql
-- Nayti channel_account dlya WhatsApp Baileys
SELECT id, account_id, account_name
FROM elo_t_channel_accounts
WHERE tenant_id = '11111111-1111-1111-1111-111111111111';

-- Svyazat' Test Admin s WhatsApp akkauntom
INSERT INTO elo_t_operator_channels (operator_id, channel_account_id, is_primary)
VALUES (
    '22222222-2222-2222-2222-222222222222',  -- Test Admin
    'uuid-of-whatsapp-channel-account',       -- WhatsApp Baileys account
    true
);
```

#### Shag 3.3.3: n8n - Izmenit' ELO_Client_Resolve - DB Get Tenant

**Tekushchiy SQL (priblizitel'no):**
```sql
SELECT t.id as tenant_id, t.domain_id
FROM elo_t_tenants t
JOIN elo_t_channel_accounts ca ON ca.tenant_id = t.id
WHERE ca.account_id = '{{ $json.profile_id }}'
  AND t.is_active = true
  AND ca.is_active = true
LIMIT 1;
```

**Novyy SQL:**
```sql
SELECT
    t.id as tenant_id,
    t.domain_id,
    ca.id as channel_account_id,
    ca.channel_id
FROM elo_t_tenants t
JOIN elo_t_channel_accounts ca ON ca.tenant_id = t.id
WHERE ca.account_id = '{{ $json.profile_id }}'
  AND t.is_active = true
  AND ca.is_active = true
LIMIT 1;
```

**Chto dobavili:** `ca.id as channel_account_id`, `ca.channel_id`

#### Shag 3.3.4: n8n - Izmenit' ELO_Client_Resolve - DB Create Dialog

**Tekushchiy SQL (priblizitel'no):**
```sql
INSERT INTO elo_t_dialogs (
    tenant_id,
    client_id,
    channel_id,
    status_id,
    external_chat_id
)
VALUES (
    '{{ $json.tenant_id }}',
    '{{ $json.client_id }}',
    {{ $json.channel_id }},
    1,
    '{{ $json.external_chat_id }}'
)
RETURNING id, tenant_id, client_id, channel_id;
```

**Novyy SQL:**
```sql
INSERT INTO elo_t_dialogs (
    tenant_id,
    client_id,
    channel_id,
    status_id,
    external_chat_id,
    assigned_operator_id,
    channel_account_id,
    last_message_at
)
SELECT
    '{{ $json.tenant_id }}',
    '{{ $json.client_id }}',
    {{ $json.channel_id }},
    1,
    '{{ $json.external_chat_id }}',
    (
        SELECT oc.operator_id
        FROM elo_t_operator_channels oc
        WHERE oc.channel_account_id = '{{ $json.channel_account_id }}'
          AND oc.is_active = true
        ORDER BY oc.is_primary DESC
        LIMIT 1
    ),
    '{{ $json.channel_account_id }}',
    NOW()
RETURNING id, tenant_id, client_id, channel_id, assigned_operator_id;
```

**Chto dobavili:**
- `assigned_operator_id` - avto-vybor iz `elo_t_operator_channels`
- `channel_account_id` - dlya buduschikh zaprosov
- `last_message_at` - dlya sortirovki dialogov

#### Shag 3.3.5: n8n - Dobavit' obnovlenie last_message_at pri vhodyanshchih soobshcheniyah

**V ELO_Client_Resolve, posle sozdaniya/nahozhdeniya dialoga:**

**Novyy SQL node "Update Dialog Last Message":**
```sql
UPDATE elo_t_dialogs
SET last_message_at = NOW()
WHERE id = '{{ $json.dialog_id }}';
```

**Ili ob"edinit' s sohraneniem soobshcheniya (CTE):**
```sql
WITH msg AS (
    INSERT INTO elo_t_messages (
        dialog_id,
        direction_id,
        message_type_id,
        content,
        external_user_id,
        created_at
    )
    VALUES (
        '{{ $json.dialog_id }}',
        1,  -- in
        1,  -- text
        '{{ $json.text }}',
        '{{ $json.external_user_id }}',
        NOW()
    )
    RETURNING id, dialog_id
)
UPDATE elo_t_dialogs
SET last_message_at = NOW()
WHERE id = (SELECT dialog_id FROM msg)
RETURNING (SELECT id FROM msg) as message_id;
```

#### Shag 3.3.6: Dobavit' kolonku channel_account_id v elo_t_dialogs (esli net)

**Proverit' nalichie kolonki:**
```bash
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c \"
SELECT column_name FROM information_schema.columns
WHERE table_name = 'elo_t_dialogs' AND column_name = 'channel_account_id';
\""
```

**Esli net - dobavit':**
```sql
ALTER TABLE elo_t_dialogs
ADD COLUMN IF NOT EXISTS channel_account_id UUID REFERENCES elo_t_channel_accounts(id);

ALTER TABLE elo_t_dialogs
ADD COLUMN IF NOT EXISTS last_message_at TIMESTAMPTZ DEFAULT NOW();

CREATE INDEX IF NOT EXISTS idx_dialogs_operator_last_msg
ON elo_t_dialogs(assigned_operator_id, last_message_at DESC)
WHERE status_id = 1;  -- active dialogs
```

### 3.4 Testirovaniye

**1. Proverit' chto operator svyazan s kanal-akkauntom:**
```bash
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c \"
SELECT o.name as operator, ca.account_name as channel_account, oc.is_primary
FROM elo_t_operator_channels oc
JOIN elo_t_operators o ON o.id = oc.operator_id
JOIN elo_t_channel_accounts ca ON ca.id = oc.channel_account_id
WHERE oc.is_active = true;
\""
```

**2. Proverit' chto novyy dialog poluchaet operatora:**
```bash
# Otpravit' soobshcheniye ot novogo nomer v WhatsApp
# Proverit' dialog v BD:

ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c \"
SELECT d.id, d.assigned_operator_id, o.name as operator_name, d.last_message_at
FROM elo_t_dialogs d
LEFT JOIN elo_t_operators o ON o.id = d.assigned_operator_id
ORDER BY d.created_at DESC
LIMIT 5;
\""
```

---

## Poryadok vypolneniya

### Etap 1: Podgotovka BD (Prioritet 3 - chast')

1. Sozdat' tablitsu `elo_t_operator_channels`
2. Dobavit' kolonki v `elo_t_dialogs` (esli net)
3. Zapolnit' testovye dannye (svyazat' Test Admin s WhatsApp)

### Etap 2: n8n izmeneniya

**Poryadok:**
1. `ELO_API_Android_Normalize` - izmenit' webhook path
2. `ELO_API_Android_Send_Message` - izmenit' webhook path + dobavit' Out Router
3. `ELO_Client_Resolve` - obnovit' SQL zaprosy

**Vazhno:** Posle kazhdogo izmeneniya v n8n - sohranit' i aktivirovat' workflow.

### Etap 3: Android izmeneniya

**Fayly dlya izmeneniya:**
1. `ApiService.kt` - izmenit' endpointy i data klassy
2. `ChatActivity.kt` - obnovit' vyzovy API

**Poryadok:**
1. Obnovit' `ApiService.kt`
2. Obnovit' `ChatActivity.kt`
3. Sobrat' APK
4. Ustanovit' na ustroystve

### Etap 4: Testirovaniye

1. Test normalize cherez curl
2. Test send message cherez curl
3. Test polnogo flow cherez Android app:
   - Otpravit' soobshcheniye ot klienta v WhatsApp
   - Proverit' chto dialog poyavilsya v app
   - Otvetit' iz app
   - Proverit' chto klient poluchil otvet

---

## Rollback plan

**Esli chto-to poshlo ne tak:**

### n8n Rollback
1. V n8n UI - otkryt' workflow
2. Vernut' staryy webhook path
3. Sohranit' i aktivirovat'

### Android Rollback
1. Vernut' staruyu versiyu `ApiService.kt` iz git
2. Peresobrat' APK
3. Ustanovit'

### BD Rollback
```sql
-- Udalit' novuyu tablitsu (esli problema)
DROP TABLE IF EXISTS elo_t_operator_channels;

-- Udalit' novye kolonki (esli problema)
ALTER TABLE elo_t_dialogs DROP COLUMN IF EXISTS channel_account_id;
ALTER TABLE elo_t_dialogs DROP COLUMN IF EXISTS last_message_at;
```

---

## Zavisiomosti i riski

| Risk | Veroyatnost' | Vliyanie | Mitigaciya |
|------|--------------|----------|------------|
| n8n workflow ne sohranitsya | Nizkaya | Vysokoe | Eksportirovat' backup pered izmeneniem |
| Android app ne sobirayetsya | Srednyaya | Srednee | Testirovat' postepenno |
| Starye dialogi bez operatora | Nizkaya | Nizkoe | Ruchnoe naznachenie cherez SQL |

---

*Plan sostavlen: 2025-12-21*
