package ru.avito.messenger.internal.gson.adapter;

import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessageUpdate;

/* compiled from: MessageUpdateTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/MessageUpdateTypeAdapter;", "Lcom/google/gson/h;", "Lru/avito/messenger/api/entity/ChatMessageUpdate;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageUpdateTypeAdapter implements h<ChatMessageUpdate> {
    @Override // com.google.gson.h
    public final ChatMessageUpdate deserialize(i iVar, Type type, g gVar) {
        return new ChatMessageUpdate((ChatMessage) gVar.b(iVar, ChatMessage.class));
    }
}
