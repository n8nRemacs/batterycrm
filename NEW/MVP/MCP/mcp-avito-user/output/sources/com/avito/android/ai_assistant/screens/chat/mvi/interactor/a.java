package com.avito.android.ai_assistant.screens.chat.mvi.interactor;

import Tb.j;
import Y61.k;
import Y61.l;
import com.avito.android.ai_assistant.model.MessageSendFrom;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AssistantChatInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/interactor/a;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    @k
    InterfaceC43160i<AiAssistantInternalAction> a(@k String str, @l String str2, @k com.avito.android.arch.mvi.utils.l<Vb.d> lVar);

    @k
    InterfaceC43160i b(@k String str, @l String str2, boolean z12);

    @k
    InterfaceC43160i<AiAssistantInternalAction> c(@k String str, @k String str2, @l String str3, @k MessageSendFrom messageSendFrom, @k com.avito.android.arch.mvi.utils.l<Vb.d> lVar);

    @k
    InterfaceC43160i<AiAssistantInternalAction> d(@k String str, boolean z12, @l j jVar, @k com.avito.android.arch.mvi.utils.l<Vb.d> lVar);
}
