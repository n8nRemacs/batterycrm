package com.eldoleado.app.channels.setup

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eldoleado.app.R
import com.eldoleado.app.SessionManager
import com.eldoleado.app.channels.ChannelCredentialsManager
import com.eldoleado.app.channels.ChannelStatus
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

/**
 * Avito Camoufox Setup Activity
 *
 * Flow:
 * 1. User enters phone + password
 * 2. Android calls server: POST /account/{id}/login
 * 3. Server logs in via Camoufox browser
 * 4. If SMS required -> show SMS input
 * 5. Android calls server: POST /account/{id}/sms
 * 6. Success -> save locally
 */
class AvitoCamoufoxSetupActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "AvitoCamoufoxSetup"
        // Server running on 155.212.221.189:8793
        private const val SERVER_URL = "http://155.212.221.189:8793"
    }

    private lateinit var channelCredentialsManager: ChannelCredentialsManager
    private lateinit var sessionManager: SessionManager

    // Views
    private lateinit var btnBack: ImageView
    private lateinit var loginForm: LinearLayout
    private lateinit var smsForm: LinearLayout
    private lateinit var loadingState: LinearLayout
    private lateinit var successState: LinearLayout

    // Login form
    private lateinit var inputPhone: TextInputEditText
    private lateinit var inputPassword: TextInputEditText
    private lateinit var inputAccountId: TextInputEditText
    private lateinit var btnLogin: Button
    private lateinit var errorText: TextView

    // SMS form
    private lateinit var smsPhoneText: TextView
    private lateinit var inputSmsCode: TextInputEditText
    private lateinit var btnSubmitSms: Button
    private lateinit var smsErrorText: TextView

    // Loading
    private lateinit var loadingText: TextView

    // Success
    private lateinit var successInfo: TextView
    private lateinit var successName: TextView
    private lateinit var btnDone: Button

    private var currentAccountId: String = "default"
    private var currentPhone: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avito_camoufox_setup)

        channelCredentialsManager = ChannelCredentialsManager(this)
        sessionManager = SessionManager(this)

        initViews()
        setupListeners()
    }

    private fun initViews() {
        btnBack = findViewById(R.id.btnBack)

        // Forms
        loginForm = findViewById(R.id.loginForm)
        smsForm = findViewById(R.id.smsForm)
        loadingState = findViewById(R.id.loadingState)
        successState = findViewById(R.id.successState)

        // Login form views
        inputPhone = findViewById(R.id.inputPhone)
        inputPassword = findViewById(R.id.inputPassword)
        inputAccountId = findViewById(R.id.inputAccountId)
        btnLogin = findViewById(R.id.btnLogin)
        errorText = findViewById(R.id.errorText)

        // SMS form views
        smsPhoneText = findViewById(R.id.smsPhoneText)
        inputSmsCode = findViewById(R.id.inputSmsCode)
        btnSubmitSms = findViewById(R.id.btnSubmitSms)
        smsErrorText = findViewById(R.id.smsErrorText)

        // Loading
        loadingText = findViewById(R.id.loadingText)

        // Success
        successInfo = findViewById(R.id.successInfo)
        successName = findViewById(R.id.successName)
        btnDone = findViewById(R.id.btnDone)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        btnLogin.setOnClickListener {
            doLogin()
        }

        btnSubmitSms.setOnClickListener {
            submitSmsCode()
        }

        btnDone.setOnClickListener {
            finish()
        }
    }

    private fun doLogin() {
        val phone = inputPhone.text?.toString()?.trim() ?: ""
        val password = inputPassword.text?.toString() ?: ""
        val accountId = inputAccountId.text?.toString()?.trim()?.ifEmpty { "default" } ?: "default"

        if (phone.length < 10) {
            showError("Введите корректный номер телефона")
            return
        }
        if (password.isEmpty()) {
            showError("Введите пароль")
            return
        }

        currentAccountId = accountId
        currentPhone = phone
        hideError()
        showLoading("Выполняется вход...")

        CoroutineScope(Dispatchers.IO).launch {
            try {
                // First create account session
                createAccountSession(accountId)

                // Then login
                val result = loginRequest(accountId, phone, password)
                Log.d(TAG, "Login result: $result")

                withContext(Dispatchers.Main) {
                    handleLoginResult(result)
                }
            } catch (e: Exception) {
                Log.e(TAG, "Login error", e)
                withContext(Dispatchers.Main) {
                    hideLoading()
                    showError("Ошибка: ${e.message}")
                }
            }
        }
    }

    private fun createAccountSession(accountId: String) {
        val url = URL("$SERVER_URL/account/$accountId/create")
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.connectTimeout = 30000
        connection.readTimeout = 30000

        val responseCode = connection.responseCode
        Log.d(TAG, "Create session response: $responseCode")
    }

    private fun loginRequest(accountId: String, phone: String, password: String): JSONObject {
        val url = URL("$SERVER_URL/account/$accountId/login")
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.setRequestProperty("Content-Type", "application/json")
        connection.doOutput = true
        connection.connectTimeout = 60000  // Browser login can take time
        connection.readTimeout = 60000

        val body = JSONObject().apply {
            put("phone", phone)
            put("password", password)
        }

        connection.outputStream.bufferedWriter().use { it.write(body.toString()) }

        val responseCode = connection.responseCode
        Log.d(TAG, "Login response code: $responseCode")

        val responseText = if (responseCode in 200..299) {
            connection.inputStream.bufferedReader().readText()
        } else {
            connection.errorStream?.bufferedReader()?.readText() ?: """{"status":"error","message":"HTTP $responseCode"}"""
        }

        Log.d(TAG, "Login response: $responseText")
        return JSONObject(responseText)
    }

    private fun handleLoginResult(result: JSONObject) {
        val status = result.optString("status", "error")

        when (status) {
            "success" -> {
                // Login successful, save and show success
                saveCredentials(result)
                showSuccess(result)
            }
            "sms_required" -> {
                // Need SMS code
                showSmsForm()
            }
            else -> {
                hideLoading()
                val message = result.optString("message", "Ошибка входа")
                showError(message)
            }
        }
    }

    private fun submitSmsCode() {
        val code = inputSmsCode.text?.toString()?.trim() ?: ""

        if (code.length < 4) {
            showSmsError("Введите код из SMS")
            return
        }

        hideSmsError()
        showLoading("Проверка кода...")

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val result = smsRequest(currentAccountId, code)
                Log.d(TAG, "SMS result: $result")

                withContext(Dispatchers.Main) {
                    handleSmsResult(result)
                }
            } catch (e: Exception) {
                Log.e(TAG, "SMS error", e)
                withContext(Dispatchers.Main) {
                    hideLoading()
                    showSmsForm()
                    showSmsError("Ошибка: ${e.message}")
                }
            }
        }
    }

    private fun smsRequest(accountId: String, code: String): JSONObject {
        val url = URL("$SERVER_URL/account/$accountId/sms")
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.setRequestProperty("Content-Type", "application/json")
        connection.doOutput = true
        connection.connectTimeout = 30000
        connection.readTimeout = 30000

        val body = JSONObject().apply {
            put("code", code)
        }

        connection.outputStream.bufferedWriter().use { it.write(body.toString()) }

        val responseCode = connection.responseCode
        Log.d(TAG, "SMS response code: $responseCode")

        val responseText = if (responseCode in 200..299) {
            connection.inputStream.bufferedReader().readText()
        } else {
            connection.errorStream?.bufferedReader()?.readText() ?: """{"status":"error","message":"HTTP $responseCode"}"""
        }

        Log.d(TAG, "SMS response: $responseText")
        return JSONObject(responseText)
    }

    private fun handleSmsResult(result: JSONObject) {
        val status = result.optString("status", "error")

        when (status) {
            "success" -> {
                saveCredentials(result)
                showSuccess(result)
            }
            else -> {
                hideLoading()
                showSmsForm()
                val message = result.optString("message", "Неверный код")
                showSmsError(message)
            }
        }
    }

    private fun saveCredentials(result: JSONObject) {
        // Save to local storage
        channelCredentialsManager.setAvitoAccountId(currentAccountId)
        channelCredentialsManager.setAvitoStatus(ChannelStatus.CONNECTED)

        // Try to get additional info from status
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val statusResult = getAccountStatus(currentAccountId)
                val state = statusResult.optJSONObject("state")
                val userName = state?.optString("user_name")
                val userId = state?.optString("user_id")
                val hashId = state?.optString("hash_id")

                // Save additional info
                channelCredentialsManager.saveAvito(
                    cookies = "", // Cookies are on server
                    userId = userId,
                    displayName = userName ?: currentPhone,
                    hashId = hashId
                )
            } catch (e: Exception) {
                Log.w(TAG, "Failed to get status", e)
            }
        }

        Log.i(TAG, "Credentials saved for account: $currentAccountId")
    }

    private fun getAccountStatus(accountId: String): JSONObject {
        val url = URL("$SERVER_URL/account/$accountId/status")
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        connection.connectTimeout = 10000
        connection.readTimeout = 10000

        val responseCode = connection.responseCode
        if (responseCode == 200) {
            val response = connection.inputStream.bufferedReader().readText()
            return JSONObject(response)
        }
        return JSONObject()
    }

    // === UI State Management ===

    private fun showLoading(text: String) {
        loginForm.visibility = View.GONE
        smsForm.visibility = View.GONE
        loadingState.visibility = View.VISIBLE
        successState.visibility = View.GONE
        loadingText.text = text
    }

    private fun hideLoading() {
        loadingState.visibility = View.GONE
        loginForm.visibility = View.VISIBLE
    }

    private fun showError(message: String) {
        errorText.text = message
        errorText.visibility = View.VISIBLE
    }

    private fun hideError() {
        errorText.visibility = View.GONE
    }

    private fun showSmsForm() {
        loginForm.visibility = View.GONE
        smsForm.visibility = View.VISIBLE
        loadingState.visibility = View.GONE
        successState.visibility = View.GONE

        // Mask phone for display
        val maskedPhone = if (currentPhone.length > 4) {
            "${currentPhone.take(4)}****${currentPhone.takeLast(2)}"
        } else {
            currentPhone
        }
        smsPhoneText.text = "Код отправлен на $maskedPhone"
    }

    private fun showSmsError(message: String) {
        smsErrorText.text = message
        smsErrorText.visibility = View.VISIBLE
    }

    private fun hideSmsError() {
        smsErrorText.visibility = View.GONE
    }

    private fun showSuccess(result: JSONObject) {
        loginForm.visibility = View.GONE
        smsForm.visibility = View.GONE
        loadingState.visibility = View.GONE
        successState.visibility = View.VISIBLE

        successInfo.text = "Account: $currentAccountId"

        // Try to get user name from result
        val state = result.optJSONObject("state")
        val userName = state?.optString("user_name")
        if (!userName.isNullOrEmpty()) {
            successName.text = userName
            successName.visibility = View.VISIBLE
        } else {
            successName.text = currentPhone
            successName.visibility = View.VISIBLE
        }

        Toast.makeText(this, "Avito подключен!", Toast.LENGTH_SHORT).show()
    }
}
