package com.eldoleado.app.channels

import android.content.Context
import android.util.Log
import com.eldoleado.app.SessionManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL

/**
 * Service for registering channels with the backend.
 *
 * When a channel is connected (WhatsApp, Telegram, etc.), this service
 * registers it with the backend to link the session_id to the tenant.
 *
 * This enables proper routing of incoming messages to the correct tenant.
 */
class ChannelRegistrationService(private val context: Context) {

    companion object {
        private const val TAG = "ChannelRegistration"
        private const val BASE_URL = "https://n8n.n8nsrv.ru/webhook"
        private const val REGISTER_ENDPOINT = "$BASE_URL/android/channels/register"
        private const val TIMEOUT_MS = 15000
    }

    private val sessionManager = SessionManager(context)

    /**
     * Result of channel registration
     */
    sealed class RegistrationResult {
        data class Success(
            val channelAccountId: String,
            val tenantId: String
        ) : RegistrationResult()

        data class AlreadyRegistered(
            val message: String
        ) : RegistrationResult()

        data class Unauthorized(
            val message: String
        ) : RegistrationResult()

        data class Error(
            val message: String,
            val exception: Exception? = null
        ) : RegistrationResult()
    }

    /**
     * Register a channel with the backend.
     *
     * @param channel Channel type: "whatsapp", "telegram", "avito", "vk", "max"
     * @param sessionId Unique session identifier from the channel service
     * @param accountId Account identifier (phone number, username, user_id, etc.)
     * @param accountName Optional display name
     * @param credentials Channel-specific credentials as JSON
     * @param isOfficial Whether this uses official API (vs reverse-engineered)
     *
     * @return RegistrationResult indicating success, conflict, or error
     */
    suspend fun registerChannel(
        channel: String,
        sessionId: String,
        accountId: String,
        accountName: String? = null,
        credentials: JSONObject = JSONObject(),
        isOfficial: Boolean = false
    ): RegistrationResult = withContext(Dispatchers.IO) {

        val sessionToken = sessionManager.getSessionToken()
        if (sessionToken.isNullOrEmpty()) {
            return@withContext RegistrationResult.Unauthorized("No session token")
        }

        try {
            Log.i(TAG, "Registering channel: $channel, sessionId: $sessionId, accountId: $accountId")

            val url = URL(REGISTER_ENDPOINT)
            val connection = url.openConnection() as HttpURLConnection

            connection.apply {
                requestMethod = "POST"
                setRequestProperty("Content-Type", "application/json")
                setRequestProperty("X-Session-Token", sessionToken)
                doOutput = true
                connectTimeout = TIMEOUT_MS
                readTimeout = TIMEOUT_MS
            }

            val requestBody = JSONObject().apply {
                put("channel", channel)
                put("session_id", sessionId)
                put("account_id", accountId)
                accountName?.let { put("account_name", it) }
                put("credentials", credentials)
                put("is_official", isOfficial)
            }

            Log.d(TAG, "Request body: $requestBody")

            OutputStreamWriter(connection.outputStream).use {
                it.write(requestBody.toString())
            }

            val responseCode = connection.responseCode
            Log.i(TAG, "Response code: $responseCode")

            when (responseCode) {
                200, 201 -> {
                    val response = connection.inputStream.bufferedReader().readText()
                    Log.d(TAG, "Success response: $response")

                    val json = JSONObject(response)
                    if (json.optBoolean("success", false)) {
                        RegistrationResult.Success(
                            channelAccountId = json.optString("channel_account_id", ""),
                            tenantId = json.optString("tenant_id", "")
                        )
                    } else {
                        RegistrationResult.Error("Unexpected response: $response")
                    }
                }

                401 -> {
                    val response = connection.errorStream?.bufferedReader()?.readText() ?: ""
                    Log.w(TAG, "Unauthorized: $response")
                    RegistrationResult.Unauthorized("Session expired or invalid")
                }

                409 -> {
                    val response = connection.errorStream?.bufferedReader()?.readText() ?: ""
                    Log.w(TAG, "Conflict: $response")

                    val json = try { JSONObject(response) } catch (e: Exception) { JSONObject() }
                    val message = json.optString("message", "Channel already registered by another business")
                    RegistrationResult.AlreadyRegistered(message)
                }

                else -> {
                    val response = connection.errorStream?.bufferedReader()?.readText() ?: ""
                    Log.e(TAG, "Error $responseCode: $response")
                    RegistrationResult.Error("Server error: $responseCode")
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Registration failed: ${e.message}", e)
            RegistrationResult.Error("Network error: ${e.message}", e)
        }
    }

    // ==================== Convenience methods for each channel ====================

    /**
     * Register WhatsApp channel
     */
    suspend fun registerWhatsApp(
        sessionId: String,
        phone: String,
        name: String?
    ): RegistrationResult {
        val credentials = JSONObject().apply {
            put("phone", phone)
            name?.let { put("name", it) }
        }
        return registerChannel(
            channel = "whatsapp",
            sessionId = sessionId,
            accountId = phone,
            accountName = name,
            credentials = credentials,
            isOfficial = false
        )
    }

    /**
     * Register Telegram Bot channel
     */
    suspend fun registerTelegramBot(
        botToken: String,
        username: String
    ): RegistrationResult {
        val credentials = JSONObject().apply {
            put("bot_token", botToken)
        }
        return registerChannel(
            channel = "telegram",
            sessionId = botToken,
            accountId = username,
            accountName = "@$username",
            credentials = credentials,
            isOfficial = true
        )
    }

    /**
     * Register Telegram User channel
     */
    suspend fun registerTelegramUser(
        sessionId: String,
        phone: String,
        apiId: String,
        apiHash: String
    ): RegistrationResult {
        val credentials = JSONObject().apply {
            put("api_id", apiId)
            put("api_hash", apiHash)
            put("phone", phone)
        }
        return registerChannel(
            channel = "telegram",
            sessionId = sessionId,
            accountId = phone,
            accountName = phone,
            credentials = credentials,
            isOfficial = false
        )
    }

    /**
     * Register Avito channel
     */
    suspend fun registerAvito(
        sessionId: String,
        userId: String,
        displayName: String?,
        cookies: String,
        hashId: String?
    ): RegistrationResult {
        val credentials = JSONObject().apply {
            put("cookies", cookies)
            hashId?.let { put("hash_id", it) }
        }
        return registerChannel(
            channel = "avito",
            sessionId = sessionId,
            accountId = userId,
            accountName = displayName,
            credentials = credentials,
            isOfficial = false
        )
    }

    /**
     * Register Avito Official API channel
     */
    suspend fun registerAvitoOfficial(
        clientId: String,
        userId: String,
        displayName: String?
    ): RegistrationResult {
        val credentials = JSONObject().apply {
            put("client_id", clientId)
        }
        return registerChannel(
            channel = "avito",
            sessionId = clientId,
            accountId = userId,
            accountName = displayName,
            credentials = credentials,
            isOfficial = true
        )
    }

    /**
     * Register MAX channel
     */
    suspend fun registerMax(
        token: String,
        userId: String,
        name: String?
    ): RegistrationResult {
        val credentials = JSONObject().apply {
            put("token", token)
        }
        return registerChannel(
            channel = "max",
            sessionId = token,
            accountId = userId,
            accountName = name,
            credentials = credentials,
            isOfficial = true
        )
    }

    /**
     * Register VK channel
     */
    suspend fun registerVk(
        token: String,
        userId: String,
        name: String?
    ): RegistrationResult {
        val credentials = JSONObject().apply {
            put("token", token)
        }
        return registerChannel(
            channel = "vk",
            sessionId = token,
            accountId = userId,
            accountName = name,
            credentials = credentials,
            isOfficial = true
        )
    }

    /**
     * Register VK Group channel
     */
    suspend fun registerVkGroup(
        token: String,
        groupId: String,
        name: String?
    ): RegistrationResult {
        val credentials = JSONObject().apply {
            put("token", token)
            put("is_group", true)
        }
        return registerChannel(
            channel = "vk",
            sessionId = token,
            accountId = "group_$groupId",
            accountName = name,
            credentials = credentials,
            isOfficial = true
        )
    }
}
