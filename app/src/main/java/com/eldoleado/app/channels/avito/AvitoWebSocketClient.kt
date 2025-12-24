package com.eldoleado.app.channels.avito

import android.util.Log
import kotlinx.coroutines.*
import okhttp3.*
import org.json.JSONObject
import java.net.URL
import java.security.MessageDigest
import java.util.concurrent.TimeUnit
import javax.net.ssl.HttpsURLConnection

/**
 * Avito WebSocket Client
 * Maintains persistent connection to socket.avito.ru
 * Forwards incoming messages to n8n webhook
 */
class AvitoWebSocketClient(
    private val cookies: String,
    private val tenantId: String,
    private val channelAccountId: String,
    private val savedHashId: String? = null, // Pre-saved hash from login
    private val initialSeq: Int = 0, // Initial seq from captured WebSocket
    private val webhookUrl: String = "https://n8n.n8nsrv.ru/webhook/avito/incoming"
) {
    companion object {
        private const val TAG = "AvitoWebSocket"
        private const val AVITO_WS_BASE = "wss://socket.avito.ru"
        private const val RECONNECT_DELAY = 5000L
        private const val PING_INTERVAL = 30L
    }

    private var webSocket: WebSocket? = null
    private var isConnected = false
    private var shouldReconnect = true
    private var seq = initialSeq
    private var myHashId: String? = null
    private var reconnectJob: Job? = null

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    private val okHttpClient = OkHttpClient.Builder()
        .pingInterval(PING_INTERVAL, TimeUnit.SECONDS)
        .readTimeout(0, TimeUnit.MILLISECONDS)
        .build()

    interface Listener {
        fun onConnected()
        fun onDisconnected(reason: String)
        fun onMessage(message: AvitoMessage)
        fun onError(error: String)
    }

    var listener: Listener? = null

    /**
     * Start WebSocket connection
     */
    fun connect() {
        shouldReconnect = true
        scope.launch {
            doConnect()
        }
    }

    /**
     * Stop WebSocket connection
     */
    fun disconnect() {
        shouldReconnect = false
        reconnectJob?.cancel()
        webSocket?.close(1000, "Client disconnect")
        webSocket = null
        isConnected = false
    }

    private suspend fun doConnect() {
        try {
            // Get user hash from cookies
            myHashId = getUserHash()
            if (myHashId == null) {
                listener?.onError("Failed to get user hash")
                scheduleReconnect()
                return
            }

            // Build WebSocket URL (matching Avito mobile web client)
            val wsUrl = buildString {
                append(AVITO_WS_BASE)
                append("?use_seq=true")
                append("&seq=$seq")
                append("&id_version=v2")
                append("&my_hash_id=$myHashId")
                append("&app_name=mav")  // Mobile Avito Web
                append("&app_version=7.456.1")
            }

            Log.d(TAG, "Connecting to: ${wsUrl.take(80)}...")

            Log.d(TAG, "Cookies length: ${cookies.length}")
            val hasF = cookies.contains("; f=") || cookies.startsWith("f=")
            val hasFt = cookies.contains("ft=")
            Log.d(TAG, "Cookie check: hasF=$hasF, hasFt=$hasFt")

            val request = Request.Builder()
                .url(wsUrl)
                .addHeader("Cookie", cookies)
                .addHeader("Origin", "https://m.avito.ru")
                .addHeader("Host", "socket.avito.ru")
                .addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36")
                .build()

            webSocket = okHttpClient.newWebSocket(request, createWebSocketListener())

        } catch (e: Exception) {
            Log.e(TAG, "Connection error: ${e.message}")
            listener?.onError(e.message ?: "Connection failed")
            scheduleReconnect()
        }
    }

    private fun getUserHash(): String? {
        // First try pre-saved hash from login
        if (!savedHashId.isNullOrEmpty()) {
            Log.d(TAG, "Using saved hash: ${savedHashId.take(10)}...")
            return savedHashId
        }

        // Try to extract __upin from cookies
        val upin = extractCookie("__upin")
        if (upin != null) {
            Log.d(TAG, "Using __upin: ${upin.take(10)}...")
            return upin
        }

        // Try profile API to get user info
        try {
            val url = URL("https://www.avito.ru/api/1/profile")
            val connection = url.openConnection() as HttpsURLConnection
            connection.requestMethod = "GET"
            connection.setRequestProperty("Cookie", cookies)
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36")
            connection.setRequestProperty("Accept", "application/json, text/plain, */*")
            connection.setRequestProperty("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
            connection.setRequestProperty("Origin", "https://www.avito.ru")
            connection.setRequestProperty("Referer", "https://www.avito.ru/profile/messenger")
            connection.setRequestProperty("X-Requested-With", "XMLHttpRequest")
            connection.connectTimeout = 10000
            connection.readTimeout = 10000

            if (connection.responseCode == 200) {
                val response = connection.inputStream.bufferedReader().readText()
                Log.d(TAG, "Profile API response: ${response.take(300)}")
                val json = JSONObject(response)

                // Try to find user id in profile response
                val userId = json.optString("id")
                if (!userId.isNullOrEmpty()) {
                    Log.d(TAG, "Got user id from profile: ${userId.take(10)}...")
                    return userId
                }

                // Try result object
                val result = json.optJSONObject("result")
                val resultId = result?.optString("id")
                if (!resultId.isNullOrEmpty()) {
                    Log.d(TAG, "Got user id from result: ${resultId.take(10)}...")
                    return resultId
                }

                // Try myHashId in meta
                val meta = result?.optJSONObject("meta") ?: json.optJSONObject("meta")
                val hashId = meta?.optString("myHashId")
                if (!hashId.isNullOrEmpty()) {
                    Log.d(TAG, "Got myHashId from API: ${hashId.take(10)}...")
                    return hashId
                }
            } else {
                val errorBody = try { connection.errorStream?.bufferedReader()?.readText() } catch (e: Exception) { null }
                Log.w(TAG, "Profile API returned ${connection.responseCode}: ${errorBody?.take(200)}")
            }
            connection.disconnect()
        } catch (e: Exception) {
            Log.w(TAG, "Failed to get hash from API: ${e.message}")
        }

        // Try to extract hash from f cookie (format: "5.{32-char-hash}...")
        val fCookie = extractCookie("f")
        if (fCookie != null && fCookie.startsWith("5.")) {
            val hashPart = fCookie.substring(2, minOf(34, fCookie.length))
            if (hashPart.length == 32 && hashPart.all { it.isDigit() || it in 'a'..'f' }) {
                Log.d(TAG, "Extracted hash from f cookie: ${hashPart.take(10)}...")
                return hashPart
            }
        }

        // Fallback: generate from ma_cid
        val maCid = extractCookie("ma_cid")
        if (maCid != null) {
            val hash = md5(maCid)
            Log.d(TAG, "Generated hash from ma_cid: ${hash.take(10)}...")
            return hash
        }

        // Last resort: use f cookie hash directly
        if (fCookie != null) {
            val hash = md5(fCookie.take(32))
            Log.d(TAG, "Generated hash from f cookie: ${hash.take(10)}...")
            return hash
        }

        return null
    }

    private fun extractCookie(name: String): String? {
        for (part in cookies.split(";")) {
            val trimmed = part.trim()
            if (trimmed.startsWith("$name=")) {
                var value = trimmed.substring(name.length + 1)
                // Remove quotes
                if (value.startsWith("\"") && value.endsWith("\"")) {
                    value = value.substring(1, value.length - 1)
                }
                return value
            }
        }
        return null
    }

    private fun md5(input: String): String {
        val md = MessageDigest.getInstance("MD5")
        val digest = md.digest(input.toByteArray())
        return digest.joinToString("") { "%02x".format(it) }
    }

    private fun createWebSocketListener() = object : WebSocketListener() {
        override fun onOpen(webSocket: WebSocket, response: Response) {
            Log.i(TAG, "WebSocket connected")
            isConnected = true
            listener?.onConnected()
        }

        override fun onMessage(webSocket: WebSocket, text: String) {
            Log.d(TAG, "WS message received: ${text.take(200)}")
            try {
                val json = JSONObject(text)
                handleMessage(json)
            } catch (e: Exception) {
                Log.w(TAG, "Failed to parse message: ${e.message}")
            }
        }

        override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
            Log.d(TAG, "WebSocket closing: $code $reason")
        }

        override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
            Log.i(TAG, "WebSocket closed: $code $reason")
            isConnected = false
            listener?.onDisconnected("$code: $reason")
            scheduleReconnect()
        }

        override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
            Log.e(TAG, "WebSocket failure: ${t.message}")
            isConnected = false
            listener?.onError(t.message ?: "WebSocket failure")
            scheduleReconnect()
        }
    }

    private fun handleMessage(json: JSONObject) {
        // Update sequence number
        if (json.has("seq")) {
            seq = json.getInt("seq")
        }

        val msgType = json.optString("type")
        val msgTypeV2 = json.optString("type_v2", "")

        // Skip internal messages
        if (json.has("jsonrpc") || json.has("result") || json.has("error")) {
            return
        }

        // Handle session init
        if (msgType == "session") {
            val value = json.optJSONObject("value")
            Log.i(TAG, "Session init, userId=${value?.optString("userId")}")
            return
        }

        // Handle new message
        if (msgType == "Message" || msgTypeV2 == "messenger.Message") {
            val value = json.optJSONObject("value") ?: return

            // Skip own messages
            if (value.optString("fromUid") == myHashId) {
                Log.d(TAG, "Skipping own message")
                return
            }

            val message = parseMessage(json)
            listener?.onMessage(message)

            // Forward to n8n
            scope.launch {
                forwardToN8n(json)
            }
            return
        }

        // Log other types for debugging
        Log.d(TAG, "Unknown message type: $msgType")
    }

    private fun parseMessage(json: JSONObject): AvitoMessage {
        val value = json.optJSONObject("value") ?: JSONObject()
        val body = value.optJSONObject("body") ?: JSONObject()

        return AvitoMessage(
            id = value.optString("id"),
            channelId = value.optString("channelId"),
            fromUid = value.optString("fromUid"),
            messageType = value.optString("type", "text"),
            text = body.optString("text"),
            created = value.optLong("created"),
            raw = json
        )
    }

    private suspend fun forwardToN8n(messageData: JSONObject) {
        try {
            val value = messageData.optJSONObject("value") ?: JSONObject()
            val body = value.optJSONObject("body") ?: JSONObject()

            // Convert nanosecond timestamp
            val createdNs = value.optLong("created", 0)
            val createdAt = if (createdNs > 0) {
                java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US)
                    .apply { timeZone = java.util.TimeZone.getTimeZone("UTC") }
                    .format(java.util.Date(createdNs / 1_000_000))
            } else null

            val payload = JSONObject().apply {
                put("channel_account_id", channelAccountId)
                put("tenant_id", tenantId)
                put("channel_type", "avito")
                put("external_chat_id", value.optString("channelId"))
                put("external_message_id", value.optString("id"))
                put("seq", messageData.optInt("seq"))
                put("message_type", value.optString("type", "text"))
                put("message_text", body.optString("text"))
                put("sender_id", value.optString("fromUid"))
                put("message_date", createdAt)
                put("received_at", java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US)
                    .apply { timeZone = java.util.TimeZone.getTimeZone("UTC") }
                    .format(java.util.Date()))
                put("source", "android")
                put("raw", messageData)
            }

            val url = URL(webhookUrl)
            val connection = url.openConnection() as HttpsURLConnection
            connection.requestMethod = "POST"
            connection.setRequestProperty("Content-Type", "application/json")
            connection.doOutput = true
            connection.connectTimeout = 10000
            connection.readTimeout = 10000

            connection.outputStream.bufferedWriter().use { it.write(payload.toString()) }

            val responseCode = connection.responseCode
            if (responseCode == 200) {
                Log.i(TAG, "Forwarded message to n8n")
            } else {
                Log.w(TAG, "n8n returned $responseCode")
            }
            connection.disconnect()

        } catch (e: Exception) {
            Log.e(TAG, "Failed to forward to n8n: ${e.message}")
        }
    }

    private fun scheduleReconnect() {
        if (!shouldReconnect) return

        reconnectJob?.cancel()
        reconnectJob = scope.launch {
            Log.i(TAG, "Reconnecting in ${RECONNECT_DELAY}ms...")
            delay(RECONNECT_DELAY)
            doConnect()
        }
    }

    fun isConnected() = isConnected
}

/**
 * Avito message data class
 */
data class AvitoMessage(
    val id: String,
    val channelId: String,
    val fromUid: String,
    val messageType: String,
    val text: String?,
    val created: Long,
    val raw: JSONObject
)
