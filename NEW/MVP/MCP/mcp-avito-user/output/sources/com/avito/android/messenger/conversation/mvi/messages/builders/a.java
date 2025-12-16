package com.avito.android.messenger.conversation.mvi.messages.builders;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import vN.C49237a;

/* compiled from: CallMessageDataBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/builders/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C49237a f192135a;

    @Inject
    public a(@Y61.k C49237a c49237a) {
        this.f192135a = c49237a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d a(@Y61.k com.avito.android.messenger.conversation.T1.d r14) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.builders.a.a(com.avito.android.messenger.conversation.T1$d):com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d");
    }

    @Y61.l
    public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h b(@Y61.k T1.d dVar) {
        com.akita.compose.foundation.p pVar;
        Long duration;
        Long duration2;
        MessageBody f189194a = dVar.f189168c.getF189194a();
        boolean z12 = f189194a instanceof MessageBody.AppCall;
        C49237a c49237a = this.f192135a;
        h.a aVar = null;
        if (!z12) {
            if (!(f189194a instanceof MessageBody.Call)) {
                return null;
            }
            c49237a.getClass();
            kotlin.reflect.n<Object> nVar = C49237a.f440707l[7];
            if (((Boolean) c49237a.f440715h.a().invoke()).booleanValue()) {
                return null;
            }
            return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h(null, Integer.valueOf(((MessageBody.Call) f189194a).isIncoming() ? R.string.message_body_description_incoming_call : R.string.message_body_description_outgoing_call), null, null, null, Integer.valueOf(R.drawable.common_ic_missed_call_outline_16), 29, null);
        }
        MessageBody.AppCall appCall = (MessageBody.AppCall) f189194a;
        c49237a.getClass();
        kotlin.reflect.n<Object> nVar2 = C49237a.f440707l[7];
        if (((Boolean) c49237a.f440715h.a().invoke()).booleanValue() && appCall.getTitle() != null) {
            return null;
        }
        if (appCall.getDuration() == null || ((duration2 = appCall.getDuration()) != null && duration2.longValue() == 0)) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            pVar = com.akita.compose.theme.re23.b.f63984b.f63880R0;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            pVar = com.akita.compose.theme.re23.b.f63984b.f63938l;
        }
        com.akita.compose.foundation.p pVar2 = pVar;
        String title = ((appCall.getCall().getDeepLink() instanceof NoMatchLink) || (appCall.getDuration() != null && ((duration = appCall.getDuration()) == null || duration.longValue() != 0))) ? null : appCall.getCall().getTitle();
        String text = appCall.getText();
        Long duration3 = appCall.getDuration();
        if (duration3 != null && duration3.longValue() != 0) {
            aVar = duration3.longValue() > 60 ? new h.a(R.plurals.minutes, (int) TimeUnit.SECONDS.toMinutes(duration3.longValue())) : new h.a(R.plurals.seconds, (int) duration3.longValue());
        }
        return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h(text, null, pVar2, aVar, title, Integer.valueOf(R.drawable.ic_messenger_call_audio), 2, null);
    }
}
