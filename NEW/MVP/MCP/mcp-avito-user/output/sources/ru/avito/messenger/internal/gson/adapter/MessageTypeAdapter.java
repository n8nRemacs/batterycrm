package ru.avito.messenger.internal.gson.adapter;

import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.Quote;
import ru.avito.messenger.api.entity.body.MessageBody;

/* compiled from: MessageTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/MessageTypeAdapter;", "Lcom/google/gson/h;", "Lru/avito/messenger/api/entity/ChatMessage;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageTypeAdapter implements h<ChatMessage> {
    @Override // com.google.gson.h
    public final ChatMessage deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        String strS = kVarI.D("id").s();
        String strS2 = kVarI.D("uid").s();
        String strS3 = kVarI.D("channelId").s();
        String strS4 = kVarI.D("fromUid").s();
        long jL2 = kVarI.D("created").l();
        i iVarD = kVarI.D("initActionTimestamp");
        Long lValueOf = (iVarD == null || (iVarD instanceof j)) ? null : Long.valueOf(iVarD.l());
        boolean zD2 = kVarI.D("isRead").d();
        i iVarD2 = kVarI.D("read");
        Long lValueOf2 = (iVarD2 == null || (iVarD2 instanceof j)) ? null : Long.valueOf(iVarD2.l());
        MessageBody messageBody = (MessageBody) gVar.b(iVar, MessageBody.class);
        i iVarD3 = kVarI.D("channel");
        i iVarD4 = kVarI.D(MessageSuggest.PREVIEW);
        i iVarD5 = kVarI.D(PlatformActions.PLATFORM_SUPPORT);
        i iVarD6 = kVarI.D("quote");
        return new ChatMessage(strS, strS2, strS3, messageBody, strS4, jL2, zD2, lValueOf2, (ChatMessage.PartialChannel) gVar.b(iVarD3, ChatMessage.PartialChannel.class), (ChatMessage.Preview) gVar.b(iVarD4, ChatMessage.Preview.class), (PlatformSupport) gVar.b(iVarD5, PlatformSupport.class), iVarD6 != null ? (Quote) gVar.b(iVarD6, Quote.class) : null, lValueOf);
    }
}
