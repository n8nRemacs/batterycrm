package com.vk.id.group.subscription.compose.interactor;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GroupSubscriptionInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$saveDisplay$2", f = "GroupSubscriptionInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class GroupSubscriptionInteractor$saveDisplay$2 extends SuspendLambda implements p<Throwable, Continuation<? super G0>, Object> {
    int label;

    public GroupSubscriptionInteractor$saveDisplay$2(Continuation<? super GroupSubscriptionInteractor$saveDisplay$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new GroupSubscriptionInteractor$saveDisplay$2(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return G0.f406611a;
    }

    @Override // Y41.p
    public final Object invoke(Throwable th2, Continuation<? super G0> continuation) {
        return ((GroupSubscriptionInteractor$saveDisplay$2) create(th2, continuation)).invokeSuspend(G0.f406611a);
    }
}
