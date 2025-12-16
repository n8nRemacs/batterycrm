package ru.avito.messenger.api.entity;

import X81.v;
import Y61.k;
import kotlin.Metadata;

/* compiled from: ChatMessageUpdate.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessageUpdate;", "LX81/v;", "Lru/avito/messenger/api/entity/ChatMessage;", "message", "<init>", "(Lru/avito/messenger/api/entity/ChatMessage;)V", "Lru/avito/messenger/api/entity/ChatMessage;", "getMessage", "()Lru/avito/messenger/api/entity/ChatMessage;", "", "getChannelId", "()Ljava/lang/String;", "channelId", "getFromId", "fromId", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ChatMessageUpdate implements v {

    @k
    private final ChatMessage message;

    public ChatMessageUpdate(@k ChatMessage chatMessage) {
        this.message = chatMessage;
    }

    @Override // X81.h
    @k
    public String getChannelId() {
        return this.message.getChannelId();
    }

    @Override // X81.v
    @k
    public String getFromId() {
        return this.message.getFromId();
    }

    @k
    public final ChatMessage getMessage() {
        return this.message;
    }
}
