package com.avito.android.service_order_map.serviceordermap.domain;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CurrentLocationUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/domain/a;", "", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.geo_common.interactor.g f278622a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f278623b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_order_map.serviceordermap.domain.a$a, reason: collision with other inner class name */
    public static final class C8280a implements InterfaceC43160i<ServiceOrderMapInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f278624b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.service_order_map.serviceordermap.domain.a$a$a, reason: collision with other inner class name */
        public static final class C8281a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f278625b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.domain.CurrentLocationUseCase$invoke$$inlined$map$1$2", f = "CurrentLocationUseCase.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.service_order_map.serviceordermap.domain.a$a$a$a, reason: collision with other inner class name */
            public static final class C8282a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f278626q;

                /* renamed from: r, reason: collision with root package name */
                public int f278627r;

                public C8282a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f278626q = obj;
                    this.f278627r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8281a.this.emit(null, this);
                }
            }

            public C8281a(InterfaceC43172j interfaceC43172j) {
                this.f278625b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.service_order_map.serviceordermap.domain.a.C8280a.C8281a.C8282a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.service_order_map.serviceordermap.domain.a$a$a$a r0 = (com.avito.android.service_order_map.serviceordermap.domain.a.C8280a.C8281a.C8282a) r0
                    int r1 = r0.f278627r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f278627r = r1
                    goto L18
                L13:
                    com.avito.android.service_order_map.serviceordermap.domain.a$a$a$a r0 = new com.avito.android.service_order_map.serviceordermap.domain.a$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f278626q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f278627r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L72
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                    boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r7 == 0) goto L4f
                    com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$UpdatePinCoordinates r7 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$UpdatePinCoordinates
                    com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                    java.lang.Object r6 = r6.getResult()
                    uF.g r6 = (uF.g) r6
                    com.avito.android.remote.model.Coordinates r6 = r6.getCoordinates()
                    com.avito.android.service_order_map.serviceordermap.ServiceOrderMapView$ZoomLevel r2 = com.avito.android.service_order_map.serviceordermap.ServiceOrderMapView.ZoomLevel.f278615d
                    r4 = 0
                    r7.<init>(r6, r4, r2)
                    goto L67
                L4f:
                    boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r7 == 0) goto L75
                    com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$NetworkError r7 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$NetworkError
                    com.avito.android.analytics.screens.J$a$a r2 = com.avito.android.analytics.screens.J.a.f90383b
                    com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                    com.avito.android.remote.error.ApiError r6 = r6.getError()
                    r2.getClass()
                    com.avito.android.analytics.screens.J$a r6 = com.avito.android.analytics.screens.J.a.C2676a.b(r6)
                    r7.<init>(r6)
                L67:
                    r0.f278627r = r3
                    kotlinx.coroutines.flow.j r6 = r5.f278625b
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L72
                    return r1
                L72:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                L75:
                    kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_order_map.serviceordermap.domain.a.C8280a.C8281a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C8280a(InterfaceC43160i interfaceC43160i) {
            this.f278624b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f278624b.collect(new C8281a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: CurrentLocationUseCase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "LuF/g;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.domain.CurrentLocationUseCase$invoke$1", f = "CurrentLocationUseCase.kt", i = {}, l = {23, 23}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<uF.g>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278629q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278630r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f278630r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<uF.g>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278629q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f278630r;
                com.avito.android.geo_common.interactor.g gVar = a.this.f278622a;
                this.f278630r = interfaceC43172j;
                this.f278629q = 1;
                obj = gVar.w(this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f278630r;
                C42729a0.b(obj);
            }
            this.f278630r = null;
            this.f278629q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CurrentLocationUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.domain.CurrentLocationUseCase$invoke$3", f = "CurrentLocationUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f278632q;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f278632q = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f278632q;
            J.a.f90383b.getClass();
            J.a.C2676a.c(th2);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k com.avito.android.geo_common.interactor.g gVar, @k R0 r02) {
        this.f278622a = gVar;
        this.f278623b = r02;
    }

    @k
    public final InterfaceC43160i<ServiceOrderMapInternalAction> a() {
        return C43175k.I(this.f278623b.a(), new C43152f0(new C8280a(C43175k.G(new b(null))), new c(3, null)));
    }
}
