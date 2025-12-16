package com.avito.android.ai_assistant.screens.chat.mvi;

import Vb.b;
import com.avito.android.ai_assistant.AssistantChatArguments;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AiAssistantChatBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/y;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class y implements com.avito.android.arch.mvi.b<AiAssistantInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AssistantChatArguments f89455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ai_assistant.screens.chat.mvi.interactor.a f89456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Vb.e f89457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f89458d;

    @Inject
    public y(@Y61.k AssistantChatArguments assistantChatArguments, @Y61.k com.avito.android.ai_assistant.screens.chat.mvi.interactor.a aVar, @Y61.k Vb.e eVar, @Y61.k com.avito.android.favorite.h hVar) {
        this.f89455a = assistantChatArguments;
        this.f89456b = aVar;
        this.f89457c = eVar;
        this.f89458d = hVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AiAssistantInternalAction> a() {
        AssistantChatArguments assistantChatArguments = this.f89455a;
        boolean z12 = assistantChatArguments.f88718d;
        String str = assistantChatArguments.f88717c;
        return C43175k.N((z12 && str == null) ? C43175k.Y(new C43210w(b.a.f17231a), new v(null, this)) : str != null ? C43175k.Y(new C43210w(b.a.f17231a), new w(null, this)) : C43175k.w(), new x(kotlinx.coroutines.reactive.A.a(this.f89458d.c())));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
