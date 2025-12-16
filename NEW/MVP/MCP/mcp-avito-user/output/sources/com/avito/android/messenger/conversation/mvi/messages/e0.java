package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MessageListItemConverter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e0 {
    public static final boolean a(@Y61.l MessageBody messageBody, @Y61.k String str) {
        String flow;
        MessageBody.SystemMessageBody.Platform.FromAvito fromAvito = messageBody instanceof MessageBody.SystemMessageBody.Platform.FromAvito ? (MessageBody.SystemMessageBody.Platform.FromAvito) messageBody : null;
        if (fromAvito == null || (flow = fromAvito.getFlow()) == null) {
            return false;
        }
        return C43066x.h0(flow, str, false);
    }

    public static final boolean b(@Y61.l LocalMessage localMessage) {
        return a(localMessage != null ? localMessage.getBody() : null, "smart-assistant");
    }

    public static final boolean c(@Y61.l LocalMessage localMessage) {
        return a(localMessage != null ? localMessage.getBody() : null, "smart-assistant-reply");
    }

    public static final int d(@Y61.k String str) {
        return str.equals("ai-assistant") ? 15 : 100;
    }
}
