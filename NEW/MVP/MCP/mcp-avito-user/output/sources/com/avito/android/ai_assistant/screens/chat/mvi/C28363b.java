package com.avito.android.ai_assistant.screens.chat.mvi;

import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;

/* compiled from: AiAssistantChatActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$createNoChangeActionsJob$1", f = "AiAssistantChatActor.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28363b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89221q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I0<AiAssistantInternalAction> f89222r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28363b(I0<? super AiAssistantInternalAction> i02, Continuation<? super C28363b> continuation) {
        super(2, continuation);
        this.f89222r = i02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C28363b(this.f89222r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C28363b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89221q;
        if (i12 == 0) {
            C42729a0.b(obj);
            AiAssistantInternalAction.p pVar = AiAssistantInternalAction.p.f89272a;
            this.f89221q = 1;
            if (this.f89222r.send(pVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
