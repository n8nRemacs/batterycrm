package com.eldoleado.app.channels.setup

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.CookieManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

class AvitoSetupActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "AvitoSetupActivity"
        private const val AVITO_URL = "https://m.avito.ru/profile"
        private const val AVITO_LOGIN_URL = "https://m.avito.ru/login"
        private const val AVITO_MESSENGER_URL = "https://www.avito.ru/profile/messenger"
        private const val N8N_WEBHOOK_URL = "https://n8n.n8nsrv.ru/webhook/android/channels/avito/auth"
    }

    private lateinit var channelCredentialsManager: ChannelCredentialsManager
    private lateinit var sessionManager: SessionManager

    // Views
    private lateinit var btnBack: ImageView
    private lateinit var headerTitle: TextView
    private lateinit var instructionsContainer: LinearLayout
    private lateinit var webView: WebView
    private lateinit var loadingOverlay: LinearLayout
    private lateinit var loadingText: TextView
    private lateinit var successOverlay: LinearLayout
    private lateinit var successInfo: TextView
    private lateinit var btnDone: Button

    private var sessidExtracted = false
    private var extractedUserHash: String? = null
    private var extractedSeq: Int = 0
    private var messengerOpened = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avito_setup)

        channelCredentialsManager = ChannelCredentialsManager(this)
        sessionManager = SessionManager(this)

        initViews()
        setupListeners()
        setupWebView()
    }

    private fun initViews() {
        btnBack = findViewById(R.id.btnBack)
        headerTitle = findViewById(R.id.headerTitle)
        instructionsContainer = findViewById(R.id.instructionsContainer)
        webView = findViewById(R.id.webView)
        loadingOverlay = findViewById(R.id.loadingOverlay)
        loadingText = findViewById(R.id.loadingText)
        successOverlay = findViewById(R.id.successOverlay)
        successInfo = findViewById(R.id.successInfo)
        btnDone = findViewById(R.id.btnDone)
    }

    private fun setupListeners() {
        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        btnDone.setOnClickListener {
            finish()
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setupWebView() {
        // Clear cookies first
        CookieManager.getInstance().removeAllCookies(null)
        CookieManager.getInstance().flush()

        webView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            userAgentString = "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36"
        }

        // Add JavaScript interface for receiving extracted data
        webView.addJavascriptInterface(object {
            @android.webkit.JavascriptInterface
            fun onUserHashFound(hash: String) {
                Log.i(TAG, "User hash from JS: $hash")
                extractedUserHash = hash
            }

            @android.webkit.JavascriptInterface
            fun onWebSocketUrlFound(wsUrl: String) {
                Log.i(TAG, "WebSocket URL from JS: $wsUrl")
                // Extract my_hash_id from WebSocket URL
                val hashRegex = Regex("my_hash_id=([^&]+)")
                val hashMatch = hashRegex.find(wsUrl)
                if (hashMatch != null) {
                    val hashId = hashMatch.groupValues[1]
                    Log.i(TAG, "Extracted my_hash_id: $hashId")
                    extractedUserHash = hashId
                }
                // Also extract seq for initial connection
                val seqRegex = Regex("seq=(\\d+)")
                val seqMatch = seqRegex.find(wsUrl)
                if (seqMatch != null) {
                    val seq = seqMatch.groupValues[1]
                    Log.i(TAG, "Extracted seq: $seq")
                    extractedSeq = seq.toIntOrNull() ?: 0
                }
            }
        }, "Android")

        webView.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: android.graphics.Bitmap?) {
                super.onPageStarted(view, url, favicon)
                // Inject WebSocket interceptor BEFORE page loads
                if (url?.contains("/messenger") == true) {
                    Log.i(TAG, "Messenger page starting, injecting WebSocket interceptor early")
                    view?.evaluateJavascript("""
                        (function() {
                            if (window.__wsIntercepted) return;
                            window.__wsIntercepted = true;
                            var OriginalWebSocket = window.WebSocket;
                            window.WebSocket = function(url, protocols) {
                                console.log('WS intercepted: ' + url);
                                if (url && url.includes('socket.avito.ru')) {
                                    try { Android.onWebSocketUrlFound(url); } catch(e) {}
                                }
                                return protocols ? new OriginalWebSocket(url, protocols) : new OriginalWebSocket(url);
                            };
                            window.WebSocket.prototype = OriginalWebSocket.prototype;
                            window.WebSocket.CONNECTING = OriginalWebSocket.CONNECTING;
                            window.WebSocket.OPEN = OriginalWebSocket.OPEN;
                            window.WebSocket.CLOSING = OriginalWebSocket.CLOSING;
                            window.WebSocket.CLOSED = OriginalWebSocket.CLOSED;
                        })()
                    """.trimIndent(), null)
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                Log.d(TAG, "Page finished: $url")

                // On messenger page - search for hash in page data
                if (url?.contains("/messenger") == true) {
                    Log.i(TAG, "Messenger page loaded, searching for hash in page")
                    view?.evaluateJavascript("""
                        (function() {
                            try {
                                // Search in all global objects
                                var found = null;

                                // Try __INITIAL_STATE__
                                if (window.__INITIAL_STATE__) {
                                    var state = JSON.stringify(window.__INITIAL_STATE__);
                                    console.log('__INITIAL_STATE__ found, length=' + state.length);
                                    var match = state.match(/myHashId['":\s]+['"]([^'"]+)['"]/i);
                                    if (match) { found = match[1]; }
                                    if (!found) {
                                        match = state.match(/my_hash_id['":\s]+['"]([^'"]+)['"]/i);
                                        if (match) { found = match[1]; }
                                    }
                                    if (!found) {
                                        match = state.match(/"hashId":\s*"([^"]+)"/);
                                        if (match) { found = match[1]; }
                                    }
                                }

                                // Try __PRELOADED_STATE__
                                if (!found && window.__PRELOADED_STATE__) {
                                    var state = JSON.stringify(window.__PRELOADED_STATE__);
                                    console.log('__PRELOADED_STATE__ found, length=' + state.length);
                                    var match = state.match(/myHashId['":\s]+['"]([^'"]+)['"]/i);
                                    if (match) { found = match[1]; }
                                }

                                // Search in script tags
                                if (!found) {
                                    var scripts = document.getElementsByTagName('script');
                                    for (var i = 0; i < scripts.length; i++) {
                                        var text = scripts[i].textContent || '';
                                        if (text.length > 100) {
                                            var match = text.match(/myHashId['":\s]+['"]([a-zA-Z0-9_-]+)['"]/);
                                            if (match) { found = match[1]; break; }
                                            match = text.match(/my_hash_id['":\s=]+['"]([a-zA-Z0-9_-]+)['"]/);
                                            if (match) { found = match[1]; break; }
                                            match = text.match(/socket\.avito\.ru[^"]*my_hash_id=([^&"]+)/);
                                            if (match) { found = match[1]; break; }
                                        }
                                    }
                                }

                                // Search in page HTML
                                if (!found) {
                                    var html = document.documentElement.outerHTML;
                                    var match = html.match(/socket\.avito\.ru[^"]*my_hash_id=([^&"]+)/);
                                    if (match) { found = match[1]; }
                                }

                                if (found) {
                                    console.log('Found hash: ' + found);
                                    Android.onUserHashFound(found);
                                } else {
                                    console.log('Hash not found in page');
                                }

                                return found;
                            } catch(e) { console.log('Hash search error:', e); }
                            return null;
                        })()
                    """.trimIndent()) { result ->
                        Log.i(TAG, "JS search result: $result")
                    }
                }
                // Try to extract user hash from JavaScript context on profile page
                else if (url?.contains("/profile") == true) {
                    view?.evaluateJavascript("""
                        (function() {
                            try {
                                // Try window.__PRELOADED_STATE__
                                if (window.__PRELOADED_STATE__ && window.__PRELOADED_STATE__.user) {
                                    var userId = window.__PRELOADED_STATE__.user.id ||
                                                 window.__PRELOADED_STATE__.user.userId ||
                                                 window.__PRELOADED_STATE__.user.hashId;
                                    if (userId) { Android.onUserHashFound(userId.toString()); return userId; }
                                }
                                // Try window.initialState
                                if (window.initialState && window.initialState.user) {
                                    var userId = window.initialState.user.id || window.initialState.user.userId;
                                    if (userId) { Android.onUserHashFound(userId.toString()); return userId; }
                                }
                                // Try localStorage
                                var lsUserId = localStorage.getItem('userId') || localStorage.getItem('user_id');
                                if (lsUserId) { Android.onUserHashFound(lsUserId); return lsUserId; }
                                // Try document script tags
                                var scripts = document.getElementsByTagName('script');
                                for (var i = 0; i < scripts.length; i++) {
                                    var text = scripts[i].textContent || '';
                                    var match = text.match(/["']userId["']\s*:\s*["']?(\d+)["']?/);
                                    if (match) { Android.onUserHashFound(match[1]); return match[1]; }
                                    match = text.match(/my_hash_id\s*=\s*["']([^"']+)["']/);
                                    if (match) { Android.onUserHashFound(match[1]); return match[1]; }
                                }
                            } catch(e) { console.log('Hash extraction error:', e); }
                            return null;
                        })()
                    """.trimIndent(), null)
                }

                // Check cookies after page load
                checkAndExtractSessid(url)
            }

            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                val url = request?.url?.toString() ?: return false
                Log.d(TAG, "Loading URL: $url")
                return false
            }
        }

        webView.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (newProgress < 100) {
                    showLoading("Загрузка... $newProgress%")
                } else {
                    hideLoading()
                }
            }
        }

        // Load Avito login page
        webView.loadUrl(AVITO_LOGIN_URL)
    }

    private fun checkAndExtractSessid(url: String?) {
        if (sessidExtracted) return

        val cookieManager = CookieManager.getInstance()
        val cookies = cookieManager.getCookie("avito.ru") ?: cookieManager.getCookie("m.avito.ru")

        Log.d(TAG, "Cookies: $cookies")

        if (cookies == null) return

        // Avito uses 'ft' cookie for auth (encrypted token), not 'sessid'
        // Also check for 'f' cookie which is the main auth token
        val hasFt = cookies.contains("ft=")
        val hasF = cookies.contains("; f=") || cookies.startsWith("f=")
        val isProfilePage = url?.contains("/profile") == true && !url.contains("/login")

        Log.d(TAG, "Auth check: hasFt=$hasFt, hasF=$hasF, isProfilePage=$isProfilePage")

        if ((hasFt || hasF) && isProfilePage) {
            // User is logged in - extract all auth cookies
            val ftCookie = extractCookieValue(cookies, "ft")
            val fCookie = extractCookieValue(cookies, "f")
            val upinCookie = extractCookieValue(cookies, "__upin")

            Log.d(TAG, "Found auth cookies: ft=${ftCookie?.take(20)}..., f=${fCookie?.take(20)}..., upin=$upinCookie")

            sessidExtracted = true
            // Pass all cookies as combined auth data
            verifyAndSaveAuth(cookies, ftCookie, fCookie, upinCookie)
        }
    }

    private fun extractCookieValue(cookies: String, name: String): String? {
        return cookies.split(";")
            .map { it.trim() }
            .find { it.startsWith("$name=") }
            ?.substringAfter("$name=")
    }

    private fun verifyAndSaveAuth(allCookies: String, ftCookie: String?, fCookie: String?, upinCookie: String?) {
        // First, redirect to messenger to capture WebSocket URL with my_hash_id
        if (!messengerOpened) {
            messengerOpened = true
            showLoading("Захват WebSocket hash...")
            Log.i(TAG, "Opening messenger page to capture WebSocket hash")
            webView.loadUrl(AVITO_MESSENGER_URL)

            // Wait for hash capture then save with fresh cookies
            CoroutineScope(Dispatchers.IO).launch {
                // Give more time for messenger to load and WebSocket to connect
                kotlinx.coroutines.delay(8000)
                Log.i(TAG, "After delay, extractedUserHash=$extractedUserHash")

                // Get fresh cookies from messenger page
                val freshCookies = withContext(Dispatchers.Main) {
                    val cookieManager = CookieManager.getInstance()
                    cookieManager.getCookie("avito.ru") ?: cookieManager.getCookie("m.avito.ru") ?: allCookies
                }
                Log.i(TAG, "Fresh cookies length: ${freshCookies.length}")

                finalizeSaveAuth(freshCookies, ftCookie, fCookie, upinCookie)
            }
            return
        }

        finalizeSaveAuth(allCookies, ftCookie, fCookie, upinCookie)
    }

    private fun finalizeSaveAuth(allCookies: String, ftCookie: String?, fCookie: String?, upinCookie: String?) {
        Log.i(TAG, "finalizeSaveAuth called, extractedUserHash=$extractedUserHash")

        CoroutineScope(Dispatchers.Main).launch {
            showLoading("Проверка авторизации...")
        }

        CoroutineScope(Dispatchers.IO).launch {
            try {
                // Verify auth by calling Avito API with all cookies
                val url = URL("https://m.avito.ru/api/1/profile/short")
                val connection = url.openConnection() as HttpURLConnection
                connection.requestMethod = "GET"
                connection.setRequestProperty("Cookie", allCookies)
                connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36")
                connection.connectTimeout = 10000
                connection.readTimeout = 10000

                val responseCode = connection.responseCode
                Log.d(TAG, "Profile API response: $responseCode")

                var userId: String? = null
                var displayName: String? = null

                if (responseCode == 200) {
                    val response = connection.inputStream.bufferedReader().readText()
                    Log.d(TAG, "Profile response: $response")

                    try {
                        val json = JSONObject(response)
                        val email = json.optString("email", null)
                        val name = json.optString("name", null)
                        userId = json.optString("id", null)
                        displayName = email ?: name
                    } catch (e: Exception) {
                        Log.w(TAG, "Failed to parse profile response", e)
                    }
                }

                // Save credentials locally (use all cookies as auth data + extracted hash)
                val hashId = extractedUserHash ?: upinCookie
                Log.i(TAG, "Saving with hashId=$hashId, seq=$extractedSeq")
                channelCredentialsManager.saveAvito(allCookies, userId, displayName, hashId, extractedSeq)
                Log.i(TAG, "Credentials saved! Verify: savedHash=${channelCredentialsManager.getAvitoHashId()}, savedSeq=${channelCredentialsManager.getAvitoSeq()}")

                // Send to server (n8n -> PostgreSQL)
                sendToServer(allCookies, ftCookie, fCookie, upinCookie, userId, displayName, hashId)

                withContext(Dispatchers.Main) {
                    showSuccess(displayName ?: "Подключено")
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error verifying auth", e)
                // Save anyway - user did login successfully
                val hashId = extractedUserHash ?: upinCookie
                channelCredentialsManager.saveAvito(allCookies, null, null, hashId)
                sendToServer(allCookies, ftCookie, fCookie, upinCookie, null, null, hashId)

                withContext(Dispatchers.Main) {
                    showSuccess("Подключено")
                }
            }
        }
    }

    private fun sendToServer(
        allCookies: String,
        ftCookie: String?,
        fCookie: String?,
        upinCookie: String?,
        userId: String?,
        displayName: String?,
        hashId: String? = null
    ) {
        val operatorId = sessionManager.getOperatorId()
        if (operatorId.isNullOrBlank()) {
            Log.w(TAG, "No operator_id, skipping server sync")
            return
        }

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val url = URL(N8N_WEBHOOK_URL)
                val connection = url.openConnection() as HttpURLConnection
                connection.requestMethod = "POST"
                connection.setRequestProperty("Content-Type", "application/json")
                connection.doOutput = true
                connection.connectTimeout = 10000
                connection.readTimeout = 10000

                val body = JSONObject().apply {
                    put("operator_id", operatorId)
                    put("cookies", allCookies)  // All cookies for API calls
                    ftCookie?.let { put("ft", it) }  // Encrypted auth token
                    fCookie?.let { put("f", it) }    // Main auth token
                    upinCookie?.let { put("upin", it) }  // User identifier
                    userId?.let { put("user_id", it) }
                    displayName?.let { put("display_name", it) }
                    hashId?.let { put("hash_id", it) } // WebSocket my_hash_id
                }

                connection.outputStream.bufferedWriter().use { it.write(body.toString()) }

                val responseCode = connection.responseCode
                Log.d(TAG, "Server sync response: $responseCode")

                if (responseCode == 200) {
                    val response = connection.inputStream.bufferedReader().readText()
                    Log.d(TAG, "Server sync success: $response")
                } else {
                    Log.w(TAG, "Server sync failed: $responseCode")
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error sending to server", e)
            }
        }
    }

    private fun showLoading(text: String) {
        loadingOverlay.visibility = View.VISIBLE
        loadingText.text = text
    }

    private fun hideLoading() {
        loadingOverlay.visibility = View.GONE
    }

    private fun showSuccess(info: String) {
        hideLoading()
        instructionsContainer.visibility = View.GONE
        webView.visibility = View.GONE
        successOverlay.visibility = View.VISIBLE
        successInfo.text = info
    }

    override fun onDestroy() {
        webView.destroy()
        super.onDestroy()
    }
}
