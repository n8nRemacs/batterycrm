package com.avito.android.service_order_map.serviceordermap.mvi;

import Y41.p;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceOrderMapActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "<anonymous>", "(Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.mvi.ServiceOrderMapActor$process$8", f = "ServiceOrderMapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<com.avito.android.service_order_map.serviceordermap.mvi.entity.a, Continuation<? super InterfaceC43160i<? extends ServiceOrderMapInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f278747q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f278748r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ServiceOrderMapState> f278749s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Y41.a<ServiceOrderMapState> aVar2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f278748r = aVar;
        this.f278749s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f278748r, this.f278749s, continuation);
        cVar.f278747q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.service_order_map.serviceordermap.mvi.entity.a aVar, Continuation<? super InterfaceC43160i<? extends ServiceOrderMapInternalAction>> continuation) {
        return ((c) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f278748r.b((com.avito.android.service_order_map.serviceordermap.mvi.entity.a) this.f278747q, this.f278749s.invoke());
    }
}
