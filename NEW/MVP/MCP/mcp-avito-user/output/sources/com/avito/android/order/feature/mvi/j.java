package com.avito.android.order.feature.mvi;

import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OrderActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LP40/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "<anonymous>", "(LP40/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.order.feature.mvi.OrderActor$process$1", f = "OrderActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class j extends SuspendLambda implements Y41.p<P40.a, Continuation<? super InterfaceC43160i<? extends OrderInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f209652q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32941a f209653r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<P40.c> f209654s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C32941a c32941a, Y41.a<P40.c> aVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f209653r = c32941a;
        this.f209654s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f209653r, this.f209654s, continuation);
        jVar.f209652q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(P40.a aVar, Continuation<? super InterfaceC43160i<? extends OrderInternalAction>> continuation) {
        return ((j) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        P40.a aVar = (P40.a) this.f209652q;
        this.f209654s.invoke();
        return this.f209653r.e(aVar);
    }
}
