package com.avito.android.ai_assistant.screens.chat;

import Vb.InterfaceC15661a;
import com.avito.android.ai_assistant.adapter.segment_buttons.a;
import com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment;
import kotlin.Metadata;

/* compiled from: AiAssistantChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/g;", "Lcom/avito/android/ai_assistant/adapter/segment_buttons/e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements com.avito.android.ai_assistant.adapter.segment_buttons.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AiAssistantChatFragment f89187a;

    public g(AiAssistantChatFragment aiAssistantChatFragment) {
        this.f89187a = aiAssistantChatFragment;
    }

    @Override // com.avito.android.ai_assistant.adapter.segment_buttons.e
    public final void a(@Y61.k a.C2619a c2619a, @Y61.k com.avito.android.ai_assistant.adapter.segment_buttons.a aVar) {
        AiAssistantChatFragment.a aVar2 = AiAssistantChatFragment.f89144v0;
        this.f89187a.q5().accept(new InterfaceC15661a.l(c2619a, aVar));
    }

    @Override // com.avito.android.ai_assistant.adapter.segment_buttons.e
    public final void b(@Y61.k com.avito.android.ai_assistant.adapter.segment_buttons.a aVar) {
        AiAssistantChatFragment.a aVar2 = AiAssistantChatFragment.f89144v0;
        this.f89187a.q5().accept(new InterfaceC15661a.m(aVar));
    }
}
