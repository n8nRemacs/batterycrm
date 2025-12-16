package com.avito.android.order.feature.mvi;

import P40.a;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OrderActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "LP40/e;", "poolingAction", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;LP40/e;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.order.feature.mvi.OrderActor$handlePollingActions$2", f = "OrderActor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super OrderInternalAction>, P40.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209647q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f209648r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ P40.e f209649s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32941a f209650t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<P40.c> f209651u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C32941a c32941a, Y41.a<P40.c> aVar, Continuation<? super i> continuation) {
        super(3, continuation);
        this.f209650t = c32941a;
        this.f209651u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super OrderInternalAction> interfaceC43172j, P40.e eVar, Continuation<? super G0> continuation) {
        Y41.a<P40.c> aVar = this.f209651u;
        i iVar = new i(this.f209650t, aVar, continuation);
        iVar.f209648r = interfaceC43172j;
        iVar.f209649s = eVar;
        return iVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209647q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f209648r;
            P40.e eVar = this.f209649s;
            if (L.f(eVar, a.b.f12816a)) {
                this.f209648r = null;
                this.f209647q = 1;
                if (C32941a.c(this.f209650t, interfaceC43172j, this.f209651u, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                L.f(eVar, a.c.f12817a);
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
