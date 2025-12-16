package com.avito.android.ai_assistant.screens.chat.mvi;

import Vb.i;
import Vb.j;
import com.avito.android.ai_assistant.AssistantChatArguments;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.SendButtonMode;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AiAssistantChatInitialStateBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/D;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AssistantChatArguments f89197a;

    @Inject
    public D(@Y61.k AssistantChatArguments assistantChatArguments) {
        this.f89197a = assistantChatArguments;
    }

    @Y61.k
    public final Vb.i a() {
        i.a aVar = Vb.i.f17248i;
        AssistantChatArguments assistantChatArguments = this.f89197a;
        String str = assistantChatArguments.f88716b;
        String str2 = assistantChatArguments.f88717c;
        aVar.getClass();
        j.a aVar2 = j.a.f17256a;
        SendButtonMode sendButtonMode = SendButtonMode.f89287b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        return new Vb.i(new Vb.m(aVar2, null, false, sendButtonMode, true, null, c42784z0), str2, null, str, new Vb.k(null, null, 3, null), new Vb.l(0L, 0L, 3, null), c42784z0);
    }
}
