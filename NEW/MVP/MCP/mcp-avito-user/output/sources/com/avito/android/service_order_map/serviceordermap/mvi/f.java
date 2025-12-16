package com.avito.android.service_order_map.serviceordermap.mvi;

import Y41.p;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapActivityArgs;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapView;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceOrderMapBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.arch.mvi.b<ServiceOrderMapInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_map.serviceordermap.domain.a f278795a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ServiceOrderMapActivityArgs f278796b;

    /* compiled from: ServiceOrderMapBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.mvi.ServiceOrderMapBootstrap$produce$1", f = "ServiceOrderMapBootstrap.kt", i = {0, 1}, l = {23, 31, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278797q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278798r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f278798r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Double d12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278797q;
            f fVar = f.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f278798r;
                ServiceOrderMapActivityArgs serviceOrderMapActivityArgs = fVar.f278796b;
                Double d13 = serviceOrderMapActivityArgs.f278612d;
                if (d13 == null || (d12 = serviceOrderMapActivityArgs.f278613e) == null) {
                    InterfaceC43160i<ServiceOrderMapInternalAction> interfaceC43160iA = fVar.f278795a.a();
                    this.f278798r = interfaceC43172j;
                    this.f278797q = 2;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ServiceOrderMapInternalAction.UpdatePinCoordinates updatePinCoordinates = new ServiceOrderMapInternalAction.UpdatePinCoordinates(new Coordinates(d13.doubleValue(), d12.doubleValue()), false, ServiceOrderMapView.ZoomLevel.f278614c);
                    this.f278798r = interfaceC43172j;
                    this.f278797q = 1;
                    if (interfaceC43172j.emit(updatePinCoordinates, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f278798r;
                C42729a0.b(obj);
            }
            ServiceOrderMapActivityArgs serviceOrderMapActivityArgs2 = fVar.f278796b;
            ServiceOrderMapInternalAction.UpdateTextResources updateTextResources = new ServiceOrderMapInternalAction.UpdateTextResources(serviceOrderMapActivityArgs2.f278610b, serviceOrderMapActivityArgs2.f278611c);
            this.f278798r = null;
            this.f278797q = 3;
            if (interfaceC43172j.emit(updateTextResources, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.service_order_map.serviceordermap.domain.a aVar, @Y61.k ServiceOrderMapActivityArgs serviceOrderMapActivityArgs) {
        this.f278795a = aVar;
        this.f278796b = serviceOrderMapActivityArgs;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ServiceOrderMapInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
