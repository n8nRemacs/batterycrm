package com.eldoleado.app

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eldoleado.app.api.ChatMessagesResponse
import com.eldoleado.app.api.RetrofitClient
import com.eldoleado.app.adapters.ChatMessagesAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ChatActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "ChatActivity"
    }

    private lateinit var sessionManager: SessionManager
    private lateinit var messagesAdapter: ChatMessagesAdapter

    private lateinit var tvClientName: TextView
    private lateinit var tvChannel: TextView
    private lateinit var ivBack: ImageView
    private lateinit var recyclerView: RecyclerView
    private lateinit var progressBar: ProgressBar
    private lateinit var tvEmpty: TextView
    private lateinit var inputMessage: EditText
    private lateinit var btnSend: ImageButton

    private var dialogId: String = ""
    private var channel: String = ""
    private var clientName: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        sessionManager = SessionManager(this)

        dialogId = intent.getStringExtra("dialog_id") ?: ""
        channel = intent.getStringExtra("channel") ?: ""
        clientName = intent.getStringExtra("client_name") ?: "Клиент"

        if (dialogId.isEmpty()) {
            Log.e(TAG, "No dialog_id provided")
            finish()
            return
        }

        initViews()
        setupAdapter()
        loadMessages()
    }

    private fun initViews() {
        tvClientName = findViewById(R.id.tvClientName)
        tvChannel = findViewById(R.id.tvChannel)
        ivBack = findViewById(R.id.ivBack)
        recyclerView = findViewById(R.id.messagesRecyclerView)
        progressBar = findViewById(R.id.progressBar)
        tvEmpty = findViewById(R.id.tvEmpty)
        inputMessage = findViewById(R.id.inputMessage)
        btnSend = findViewById(R.id.btnSend)

        tvClientName.text = clientName
        tvChannel.text = channel.uppercase()

        ivBack.setOnClickListener { finish() }

        btnSend.setOnClickListener {
            val text = inputMessage.text.toString().trim()
            if (text.isNotEmpty()) {
                sendMessage(text)
            }
        }
    }

    private fun setupAdapter() {
        messagesAdapter = ChatMessagesAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this).apply {
            stackFromEnd = true
        }
        recyclerView.adapter = messagesAdapter
    }

    private fun loadMessages() {
        val sessionToken = sessionManager.getSessionToken()
        if (sessionToken.isNullOrBlank()) {
            Log.e(TAG, "No session token")
            finish()
            return
        }

        progressBar.visibility = View.VISIBLE
        tvEmpty.visibility = View.GONE

        RetrofitClient.getApiService(this).getChatMessages(dialogId, sessionToken)
            .enqueue(object : Callback<ChatMessagesResponse> {
                override fun onResponse(
                    call: Call<ChatMessagesResponse>,
                    response: Response<ChatMessagesResponse>
                ) {
                    progressBar.visibility = View.GONE

                    if (response.isSuccessful && response.body()?.success == true) {
                        val data = response.body()!!

                        // Update header with dialog info
                        data.dialog?.let { dialog ->
                            tvClientName.text = dialog.client_name ?: dialog.client_phone ?: clientName
                            tvChannel.text = dialog.channel?.uppercase() ?: channel.uppercase()
                        }

                        // Show messages
                        val messages = data.messages ?: emptyList()
                        if (messages.isEmpty()) {
                            tvEmpty.visibility = View.VISIBLE
                            tvEmpty.text = "Нет сообщений"
                        } else {
                            messagesAdapter.setMessages(messages)
                            recyclerView.scrollToPosition(messages.size - 1)
                        }

                        Log.i(TAG, "Loaded ${messages.size} messages")
                    } else if (response.code() == 401) {
                        Log.w(TAG, "Session expired")
                        sessionManager.clearSession()
                        finish()
                    } else {
                        Log.e(TAG, "Failed to load messages: ${response.code()}")
                        tvEmpty.visibility = View.VISIBLE
                        tvEmpty.text = "Ошибка загрузки"
                    }
                }

                override fun onFailure(call: Call<ChatMessagesResponse>, t: Throwable) {
                    progressBar.visibility = View.GONE
                    Log.e(TAG, "Error loading messages: ${t.message}")
                    tvEmpty.visibility = View.VISIBLE
                    tvEmpty.text = "Ошибка сети"
                }
            })
    }

    private fun sendMessage(text: String) {
        // TODO: Implement send message API
        Toast.makeText(this, "Отправка сообщений в разработке", Toast.LENGTH_SHORT).show()
        inputMessage.text.clear()
    }
}
