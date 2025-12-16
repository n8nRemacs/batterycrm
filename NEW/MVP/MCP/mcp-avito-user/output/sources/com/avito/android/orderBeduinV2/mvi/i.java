package com.avito.android.orderBeduinV2.mvi;

import U40.a;
import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "LU40/a$b;", "poolingAction", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;LU40/a$b;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orderBeduinV2.mvi.OrderActor$handlePollingActions$2", f = "OrderActor.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super OrderInternalAction>, a.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209894q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f209895r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ a.b f209896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f209897t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<U40.c> f209898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, Y41.a<U40.c> aVar2, Continuation<? super i> continuation) {
        super(3, continuation);
        this.f209897t = aVar;
        this.f209898u = aVar2;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super OrderInternalAction> interfaceC43172j, a.b bVar, Continuation<? super G0> continuation) {
        Y41.a<U40.c> aVar = this.f209898u;
        i iVar = new i(this.f209897t, aVar, continuation);
        iVar.f209895r = interfaceC43172j;
        iVar.f209896s = bVar;
        return iVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209894q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f209895r;
            a.b bVar = this.f209896s;
            if (L.f(bVar, a.f.f16165a)) {
                this.f209895r = null;
                this.f209894q = 1;
                if (a.d(this.f209897t, interfaceC43172j, this.f209898u, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                L.f(bVar, a.g.f16166a);
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
