package com.avito.android.service_orders.mvi;

import Mu0.InterfaceC14531a;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceOrdersListActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LMu0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "<anonymous>", "(LMu0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$1", f = "ServiceOrdersListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class t extends SuspendLambda implements Y41.p<InterfaceC14531a, Continuation<? super InterfaceC43160i<? extends ServiceOrdersListInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f279664q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f279665r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ServiceOrdersListState> f279666s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, Y41.a<ServiceOrdersListState> aVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f279665r = sVar;
        this.f279666s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f279665r, this.f279666s, continuation);
        tVar.f279664q = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC14531a interfaceC14531a, Continuation<? super InterfaceC43160i<? extends ServiceOrdersListInternalAction>> continuation) {
        return ((t) create(interfaceC14531a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f279665r.b((InterfaceC14531a) this.f279664q, this.f279666s.invoke());
    }
}
