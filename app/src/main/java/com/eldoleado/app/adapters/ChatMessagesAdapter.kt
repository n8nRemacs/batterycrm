package com.eldoleado.app.adapters

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.eldoleado.app.R
import com.eldoleado.app.api.ChatMessageDto
import java.text.SimpleDateFormat
import java.util.*

class ChatMessagesAdapter : RecyclerView.Adapter<ChatMessagesAdapter.MessageViewHolder>() {

    private var messages: MutableList<ChatMessageDto> = mutableListOf()

    fun setMessages(newMessages: List<ChatMessageDto>) {
        messages = newMessages.toMutableList()
        notifyDataSetChanged()
    }

    fun addMessage(message: ChatMessageDto) {
        messages.add(message)
        notifyItemInserted(messages.size - 1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chat_message, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.bind(messages[position])
    }

    override fun getItemCount() = messages.size

    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val container: LinearLayout = itemView.findViewById(R.id.messageContainer)
        private val bubble: LinearLayout = itemView.findViewById(R.id.messageBubble)
        private val tvText: TextView = itemView.findViewById(R.id.tvMessageText)
        private val tvTime: TextView = itemView.findViewById(R.id.tvMessageTime)
        private val tvSender: TextView = itemView.findViewById(R.id.tvSenderName)

        fun bind(message: ChatMessageDto) {
            val isOutgoing = message.direction == "out"

            // Text
            tvText.text = message.text ?: ""

            // Time
            tvTime.text = formatTime(message.timestamp ?: 0)

            // Sender name (only for incoming)
            if (!isOutgoing && !message.sender_name.isNullOrBlank()) {
                tvSender.visibility = View.VISIBLE
                tvSender.text = message.sender_name
            } else {
                tvSender.visibility = View.GONE
            }

            // Alignment and styling
            val params = container.layoutParams as FrameLayout.LayoutParams
            if (isOutgoing) {
                params.gravity = Gravity.END
                bubble.setBackgroundResource(R.drawable.bg_message_outgoing)
                tvText.setTextColor(ContextCompat.getColor(itemView.context, android.R.color.white))
            } else {
                params.gravity = Gravity.START
                bubble.setBackgroundResource(R.drawable.bg_message_incoming)
                tvText.setTextColor(ContextCompat.getColor(itemView.context, android.R.color.black))
            }
            container.layoutParams = params
        }

        private fun formatTime(timestamp: Long): String {
            if (timestamp == 0L) return ""
            return SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date(timestamp))
        }
    }
}
