package com.avito.android.ai_assistant.screens.chat_list.mvi;

import com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AiAssistantChatListBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.arch.mvi.b<AiAssistantChatListInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f89606a;

    @Inject
    public d(@Y61.k k kVar) {
        this.f89606a = kVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AiAssistantChatListInternalAction> a() {
        return this.f89606a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
