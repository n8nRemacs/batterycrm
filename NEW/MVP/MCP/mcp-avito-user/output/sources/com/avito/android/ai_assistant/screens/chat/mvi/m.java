package com.avito.android.ai_assistant.screens.chat.mvi;

import Vb.InterfaceC15661a;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AiAssistantChatActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LVb/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<anonymous>", "(LVb/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$process$2", f = "AiAssistantChatActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC15661a, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f89411q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C28362a f89412r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Vb.i> f89413s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Y41.a aVar, C28362a c28362a, Continuation continuation) {
        super(2, continuation);
        this.f89412r = c28362a;
        this.f89413s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f89413s, this.f89412r, continuation);
        mVar.f89411q = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC15661a interfaceC15661a, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>> continuation) {
        return ((m) create(interfaceC15661a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f89412r.b((InterfaceC15661a) this.f89411q, this.f89413s.invoke());
    }
}
