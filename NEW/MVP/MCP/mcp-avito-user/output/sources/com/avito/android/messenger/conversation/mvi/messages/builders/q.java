package com.avito.android.messenger.conversation.mvi.messages.builders;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VoiceMessageStateBuilder.kt */
@P
@h31.j
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/builders/q;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q {
    @Inject
    public q() {
    }

    @Y61.l
    public static com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m a(@Y61.k T1.d dVar) {
        String strC;
        MessageBody f189194a = dVar.f189168c.getF189194a();
        MessageBody.Voice voice = f189194a instanceof MessageBody.Voice ? (MessageBody.Voice) f189194a : null;
        if (voice == null) {
            return null;
        }
        String voiceId = voice.getVoiceId();
        Q1 q12 = dVar.f189181p;
        m.a aVar = (q12 != null ? q12.f215288g : null) == TransferStatus.IN_PROGRESS ? m.a.c.f192701a : m.a.b.f192700a;
        VoiceInfo voiceInfo = dVar.f189183r;
        if (voiceInfo != null) {
            long duration = voiceInfo.getDuration();
            LY.a.f9975a.getClass();
            strC = LY.a.c(duration);
        } else {
            strC = "-:--";
        }
        return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m(voiceId, aVar, strC, false, false, 0);
    }
}
