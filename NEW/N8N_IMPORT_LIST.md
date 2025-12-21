# n8n Import List

> Data: 2025-12-21
> Poryadok importa vazhen!

---

## Poryadok importa

### 1. ELO_Out_WhatsApp (sub-workflow)

**Fayl:** `NEW/workflows/Chanel Contour/ELO_Out/ELO_Out_WhatsApp.json`

**Deystviya:**
1. n8n UI -> Workflows -> Import from File
2. Vybrat' fayl
3. **Aktivirovat'** workflow (toggle ON)

**Proverka:**
- Workflow dolzhen byt' ACTIVE
- Trigger: Execute Workflow Trigger

---

### 2. ELO_API_Android_Send_Message (obnovlennyy)

**Fayl:** `NEW/workflows/API/ELO_API_Android_Send_Message_v2.json`

**Deystviya:**
1. **SNACHALA:** Deaktivirovat' staryy workflow `ELO_API_Android_Send_Message`
2. n8n UI -> Workflows -> Import from File
3. Vybrat' fayl
4. **Pereimenovat'** v `ELO_API_Android_Send_Message` (ubrat' _v2)
5. **Aktivirovat'** workflow

**Izmeneniya v etom workflow:**
- Webhook path: `android/messages/send` (bylo: `android-messages/android/dialogs/:dialog_id/messages`)
- SQL: `body.dialog_id` (bylo: `params.dialog_id`)
- Dobavlen node: `Call Out Router`
- Dobavlen node: `Merge Response`

**Proverka:**
```bash
curl -X POST "https://n8n.n8nsrv.ru/webhook/android/messages/send" \
  -H "Content-Type: application/json" \
  -d '{
    "session_token": "85bc5364-7765-4562-be9e-02d899bb575e",
    "dialog_id": "cff56064-1fc3-4152-8e64-6e0266a87bf6",
    "text": "Test from updated API"
  }'
```

---

## Itogo

| # | Workflow | Fayl | Status |
|---|----------|------|--------|
| 1 | ELO_Out_WhatsApp | `Chanel Contour/ELO_Out/ELO_Out_WhatsApp.json` | Import + Activate |
| 2 | ELO_API_Android_Send_Message | `API/ELO_API_Android_Send_Message_v2.json` | Replace + Activate |

---

## Posle importa - Android izmeneniya

**Fayl:** `app/src/main/java/com/eldoleado/app/api/ApiService.kt`

**Izmenit':**
```kotlin
// BYLO:
@POST("android-messages/android/dialogs/{dialog_id}/messages")
fun sendChatMessage(
    @Path("dialog_id") dialogId: String,
    @Body request: SendMessageRequest
): Call<SendMessageResponse>

// STALO:
@POST("android/messages/send")
fun sendChatMessage(
    @Body request: SendMessageRequest
): Call<SendMessageResponse>
```

**SendMessageRequest:**
```kotlin
data class SendMessageRequest(
    val session_token: String,
    val dialog_id: String,  // Dobavit'!
    val text: String,
    val media_type: String? = null,
    val media_data: String? = null
)
```

---

*Sozdano: 2025-12-21*
