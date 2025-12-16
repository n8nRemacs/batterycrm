package com.avito.android.service_order_map.serviceordermap.mvi;

import Y41.p;
import android.app.Activity;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: ServiceOrderMapActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapState;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<com.avito.android.service_order_map.serviceordermap.mvi.entity.a, ServiceOrderMapInternalAction, ServiceOrderMapState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_map.serviceordermap.domain.f f278722a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_map.serviceordermap.domain.c f278723b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_map.serviceordermap.domain.i f278724c;

    /* compiled from: ServiceOrderMapActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.mvi.ServiceOrderMapActor$process$1", f = "ServiceOrderMapActor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_order_map.serviceordermap.mvi.a$a, reason: collision with other inner class name */
    public static final class C8291a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278725q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278726r;

        public C8291a(Continuation<? super C8291a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C8291a c8291a = a.this.new C8291a(continuation);
            c8291a.f278726r = obj;
            return c8291a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8291a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43160i c43207v;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278725q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f278726r;
                com.avito.android.service_order_map.serviceordermap.domain.f fVar = a.this.f278722a;
                if (fVar.f278659b.b("android.permission.ACCESS_FINE_LOCATION")) {
                    Activity activity = fVar.f278660c.get();
                    c43207v = activity == null ? new C43207v(new ServiceOrderMapInternalAction[0]) : new com.avito.android.service_order_map.serviceordermap.domain.e(y.a(fVar.f278658a.b(activity, (4 & 2) == 0, (4 & 4) == 0)));
                } else {
                    c43207v = new C43210w(ServiceOrderMapInternalAction.RequestLocationPermission.f278763b);
                }
                this.f278725q = 1;
                if (C43175k.u(this, c43207v, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: ServiceOrderMapActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.mvi.ServiceOrderMapActor$process$2", f = "ServiceOrderMapActor.kt", i = {0}, l = {37, 38}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278728q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278729r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.service_order_map.serviceordermap.mvi.entity.a f278731t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.service_order_map.serviceordermap.mvi.entity.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f278731t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = a.this.new b(this.f278731t, continuation);
            bVar.f278729r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278728q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f278729r;
                ServiceOrderMapInternalAction.LoadingStarted loadingStarted = new ServiceOrderMapInternalAction.LoadingStarted();
                this.f278729r = interfaceC43172j;
                this.f278728q = 1;
                if (interfaceC43172j.emit(loadingStarted, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f278729r;
                C42729a0.b(obj);
            }
            com.avito.android.service_order_map.serviceordermap.domain.c cVar = a.this.f278723b;
            a.e eVar = (a.e) this.f278731t;
            InterfaceC43160i<ServiceOrderMapInternalAction> interfaceC43160iA = cVar.a(eVar.f278791a.getLatitude(), eVar.f278791a.getLongitude());
            this.f278729r = null;
            this.f278728q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderMapActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.mvi.ServiceOrderMapActor$process$3", f = "ServiceOrderMapActor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278732q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278733r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ServiceOrderMapState f278734s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ServiceOrderMapState serviceOrderMapState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f278734s = serviceOrderMapState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f278734s, continuation);
            cVar.f278733r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278732q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f278733r;
                ServiceOrderMapState serviceOrderMapState = this.f278734s;
                ServiceOrderMapInternalAction.CloseWithResult closeWithResult = new ServiceOrderMapInternalAction.CloseWithResult(serviceOrderMapState.f278776d, serviceOrderMapState.f278777e, serviceOrderMapState.f278775c);
                this.f278732q = 1;
                if (interfaceC43172j.emit(closeWithResult, this) == coroutine_suspended) {
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

    /* compiled from: ServiceOrderMapActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.mvi.ServiceOrderMapActor$process$4", f = "ServiceOrderMapActor.kt", i = {0}, l = {52, 53}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278735q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278736r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.service_order_map.serviceordermap.mvi.entity.a f278738t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.service_order_map.serviceordermap.mvi.entity.a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f278738t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = a.this.new d(this.f278738t, continuation);
            dVar.f278736r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            AvitoMapPoint topLeft;
            AvitoMapPoint bottomRight;
            AvitoMapPoint bottomRight2;
            AvitoMapPoint topLeft2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278735q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f278736r;
                ServiceOrderMapInternalAction.LoadingStarted loadingStarted = new ServiceOrderMapInternalAction.LoadingStarted();
                this.f278736r = interfaceC43172j;
                this.f278735q = 1;
                if (interfaceC43172j.emit(loadingStarted, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f278736r;
                C42729a0.b(obj);
            }
            com.avito.android.service_order_map.serviceordermap.domain.i iVar = a.this.f278724c;
            a.f fVar = (a.f) this.f278738t;
            String str = fVar.f278792a;
            AvitoMapBounds avitoMapBounds = fVar.f278793b;
            iVar.getClass();
            InterfaceC43160i interfaceC43160iI = C43175k.I(iVar.f278673b.a(), new com.avito.android.service_order_map.serviceordermap.domain.h(y.a(iVar.f278672a.y(str == null ? "" : str, (62 & 2) != 0 ? null : (avitoMapBounds == null || (topLeft2 = avitoMapBounds.getTopLeft()) == null) ? null : Double.valueOf(topLeft2.getLongitude()), (62 & 4) != 0 ? null : (avitoMapBounds == null || (bottomRight2 = avitoMapBounds.getBottomRight()) == null) ? null : Double.valueOf(bottomRight2.getLatitude()), (62 & 8) != 0 ? null : (avitoMapBounds == null || (bottomRight = avitoMapBounds.getBottomRight()) == null) ? null : Double.valueOf(bottomRight.getLongitude()), (62 & 16) != 0 ? null : (avitoMapBounds == null || (topLeft = avitoMapBounds.getTopLeft()) == null) ? null : Double.valueOf(topLeft.getLatitude()), (62 & 32) != 0 ? P0.c() : null)), str));
            this.f278736r = null;
            this.f278735q = 2;
            if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderMapActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.mvi.ServiceOrderMapActor$process$5", f = "ServiceOrderMapActor.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278739q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278740r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.service_order_map.serviceordermap.mvi.entity.a f278741s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.service_order_map.serviceordermap.mvi.entity.a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f278741s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f278741s, continuation);
            eVar.f278740r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278739q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f278740r;
                ServiceOrderMapInternalAction.ChangeMode changeMode = new ServiceOrderMapInternalAction.ChangeMode(((a.b) this.f278741s).f278788a);
                this.f278739q = 1;
                if (interfaceC43172j.emit(changeMode, this) == coroutine_suspended) {
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

    /* compiled from: ServiceOrderMapActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.mvi.ServiceOrderMapActor$process$6", f = "ServiceOrderMapActor.kt", i = {0, 1, 1, 2, 2}, l = {61, 63, 64, 71}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", ServiceTransportationWidget.LocationField.COORDINATES, "$this$flow", ServiceTransportationWidget.LocationField.COORDINATES}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Coordinates f278742q;

        /* renamed from: r, reason: collision with root package name */
        public int f278743r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f278744s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.service_order_map.serviceordermap.mvi.entity.a f278745t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.service_order_map.serviceordermap.mvi.entity.a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f278745t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f278745t, continuation);
            fVar.f278744s = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f278743r
                com.avito.android.service_order_map.serviceordermap.mvi.entity.a r2 = r13.f278745t
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L40
                if (r1 == r6) goto L38
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                kotlin.C42729a0.b(r14)
                goto Lb9
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                com.avito.android.remote.model.Coordinates r1 = r13.f278742q
                java.lang.Object r2 = r13.f278744s
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r14)
                goto La4
            L2e:
                com.avito.android.remote.model.Coordinates r1 = r13.f278742q
                java.lang.Object r5 = r13.f278744s
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                kotlin.C42729a0.b(r14)
                goto L80
            L38:
                java.lang.Object r1 = r13.f278744s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L58
            L40:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f278744s
                r1 = r14
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$LoadingStarted r14 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$LoadingStarted
                r14.<init>()
                r13.f278744s = r1
                r13.f278743r = r6
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto L58
                return r0
            L58:
                r14 = r2
                com.avito.android.service_order_map.serviceordermap.mvi.entity.a$g r14 = (com.avito.android.service_order_map.serviceordermap.mvi.entity.a.g) r14
                com.avito.android.geo_common.model.location_picker.AddressSuggestion r14 = r14.f278794a
                com.avito.android.remote.model.Coordinates r14 = r14.getCoordinates()
                if (r14 != 0) goto L6a
                com.avito.android.remote.model.Coordinates r14 = new com.avito.android.remote.model.Coordinates
                r7 = 0
                r14.<init>(r7, r7)
            L6a:
                com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$ChangeMode r7 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$ChangeMode
                com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState$MapMode r8 = com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState.MapMode.f278784c
                r7.<init>(r8)
                r13.f278744s = r1
                r13.f278742q = r14
                r13.f278743r = r5
                java.lang.Object r5 = r1.emit(r7, r13)
                if (r5 != r0) goto L7e
                return r0
            L7e:
                r5 = r1
                r1 = r14
            L80:
                com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$AddressUpdate r14 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$AddressUpdate
                com.avito.android.service_order_map.serviceordermap.mvi.entity.a$g r2 = (com.avito.android.service_order_map.serviceordermap.mvi.entity.a.g) r2
                com.avito.android.geo_common.model.location_picker.AddressSuggestion r2 = r2.f278794a
                java.lang.String r8 = r2.c()
                double r9 = r1.getLatitude()
                double r11 = r1.getLongitude()
                r7 = r14
                r7.<init>(r8, r9, r11)
                r13.f278744s = r5
                r13.f278742q = r1
                r13.f278743r = r4
                java.lang.Object r14 = r5.emit(r14, r13)
                if (r14 != r0) goto La3
                return r0
            La3:
                r2 = r5
            La4:
                com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$UpdatePinCoordinates r14 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$UpdatePinCoordinates
                com.avito.android.service_order_map.serviceordermap.ServiceOrderMapView$ZoomLevel r4 = com.avito.android.service_order_map.serviceordermap.ServiceOrderMapView.ZoomLevel.f278614c
                r14.<init>(r1, r6, r4)
                r1 = 0
                r13.f278744s = r1
                r13.f278742q = r1
                r13.f278743r = r3
                java.lang.Object r14 = r2.emit(r14, r13)
                if (r14 != r0) goto Lb9
                return r0
            Lb9:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_order_map.serviceordermap.mvi.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.service_order_map.serviceordermap.domain.f fVar, @Y61.k com.avito.android.service_order_map.serviceordermap.domain.c cVar, @Y61.k com.avito.android.service_order_map.serviceordermap.domain.i iVar) {
        this.f278722a = fVar;
        this.f278723b = cVar;
        this.f278724c = iVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new com.avito.android.service_order_map.serviceordermap.mvi.c(this, aVar, null), C43175k.o(c43197r1, com.avito.android.service_order_map.serviceordermap.mvi.b.f278746l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<ServiceOrderMapInternalAction> b(@Y61.k com.avito.android.service_order_map.serviceordermap.mvi.entity.a aVar, @Y61.k ServiceOrderMapState serviceOrderMapState) {
        if (aVar.equals(a.c.f278789a)) {
            return C43175k.G(new C8291a(null));
        }
        if (aVar instanceof a.e) {
            return C43175k.G(new b(aVar, null));
        }
        if (aVar instanceof a.d) {
            return C43175k.G(new c(serviceOrderMapState, null));
        }
        if (aVar instanceof a.f) {
            return C43175k.G(new d(aVar, null));
        }
        if (aVar instanceof a.b) {
            return C43175k.G(new e(aVar, null));
        }
        if (aVar instanceof a.g) {
            return C43175k.G(new f(aVar, null));
        }
        if (aVar instanceof a.C8292a) {
            return new C43210w(ServiceOrderMapInternalAction.Back.f278757b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
