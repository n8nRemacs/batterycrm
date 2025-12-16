package com.avito.android.arch.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Feature.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u0001\"\b\b\u0004\u0010\u0005*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "", "Action", "InternalAction", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.Feature$trackActionsSubscribers$1", f = "Feature.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<Object>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c<Object, Object, Object, Object> f91961q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c<Object, Object, Object, Object> cVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f91961q = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f91961q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        c<Object, Object, Object, Object> cVar = this.f91961q;
        if (cVar.f91927p.get() == 0) {
            cVar.f91925n.b(cVar.f91923l, cVar.f91921j, new e(cVar));
        }
        cVar.f91927p.incrementAndGet();
        return G0.f406611a;
    }
}
