package ru.avito.messenger.api.entity;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ChatMessagesResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessagesResponse;", "", "", "count", "", "Lru/avito/messenger/api/entity/ChatMessage;", "messages", "<init>", "(ILjava/util/List;)V", "I", "getCount", "()I", "Ljava/util/List;", "getMessages", "()Ljava/util/List;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ChatMessagesResponse {

    @c("count")
    private final int count;

    @c("items")
    @k
    private final List<ChatMessage> messages;

    public ChatMessagesResponse(int i12, @k List<ChatMessage> list) {
        this.count = i12;
        this.messages = list;
    }

    @k
    public final List<ChatMessage> getMessages() {
        return this.messages;
    }
}
