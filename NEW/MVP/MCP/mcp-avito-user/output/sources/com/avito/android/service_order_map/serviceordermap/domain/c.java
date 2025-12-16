package com.avito.android.service_order_map.serviceordermap.domain;

import Y41.q;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.analytics.screens.J;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
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
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;

/* compiled from: FindLocationByCoordsUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/domain/c;", "", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.geo_common.interactor.g f278636a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f278637b;

    /* compiled from: FindLocationByCoordsUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/domain/c$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Throwable {
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<ServiceOrderMapInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f278638b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f278639c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ double f278640d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ double f278641e;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f278642b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f278643c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ double f278644d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ double f278645e;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.domain.FindLocationByCoordsUseCase$invoke$$inlined$map$1$2", f = "FindLocationByCoordsUseCase.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.service_order_map.serviceordermap.domain.c$b$a$a, reason: collision with other inner class name */
            public static final class C8283a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f278646q;

                /* renamed from: r, reason: collision with root package name */
                public int f278647r;

                public C8283a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f278646q = obj;
                    this.f278647r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, c cVar, double d12, double d13) {
                this.f278642b = interfaceC43172j;
                this.f278643c = cVar;
                this.f278644d = d12;
                this.f278645e = d13;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.avito.android.service_order_map.serviceordermap.domain.c.b.a.C8283a
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.avito.android.service_order_map.serviceordermap.domain.c$b$a$a r0 = (com.avito.android.service_order_map.serviceordermap.domain.c.b.a.C8283a) r0
                    int r1 = r0.f278647r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f278647r = r1
                    goto L18
                L13:
                    com.avito.android.service_order_map.serviceordermap.domain.c$b$a$a r0 = new com.avito.android.service_order_map.serviceordermap.domain.c$b$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f278646q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f278647r
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.C42729a0.b(r12)
                    goto Laa
                L2a:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L32:
                    kotlin.C42729a0.b(r12)
                    com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                    boolean r12 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r12 == 0) goto L87
                    com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                    com.avito.android.service_order_map.serviceordermap.domain.c r12 = r10.f278643c
                    r12.getClass()
                    java.lang.Object r11 = r11.getResult()
                    uF.a r11 = (uF.AbstractC48888a) r11
                    boolean r12 = r11 instanceof uF.AbstractC48888a.d
                    if (r12 == 0) goto L5d
                    com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$AddressUpdate r12 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$AddressUpdate
                    uF.a$d r11 = (uF.AbstractC48888a.d) r11
                    java.lang.String r5 = r11.getFormattedAddress()
                    double r6 = r10.f278644d
                    double r8 = r10.f278645e
                    r4 = r12
                    r4.<init>(r5, r6, r8)
                    goto L9f
                L5d:
                    boolean r12 = r11 instanceof uF.AbstractC48888a.C12706a
                    if (r12 == 0) goto L63
                    r12 = r3
                    goto L65
                L63:
                    boolean r12 = r11 instanceof uF.AbstractC48888a.b
                L65:
                    if (r12 == 0) goto L69
                    r11 = r3
                    goto L6b
                L69:
                    boolean r11 = r11 instanceof uF.AbstractC48888a.c
                L6b:
                    if (r11 == 0) goto L81
                    com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$UnknownError r12 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$UnknownError
                    com.avito.android.analytics.screens.J$a$a r11 = com.avito.android.analytics.screens.J.a.f90383b
                    com.avito.android.service_order_map.serviceordermap.domain.c$a r2 = new com.avito.android.service_order_map.serviceordermap.domain.c$a
                    r2.<init>()
                    r11.getClass()
                    com.avito.android.analytics.screens.J$a r11 = com.avito.android.analytics.screens.J.a.C2676a.c(r2)
                    r12.<init>(r11)
                    goto L9f
                L81:
                    kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                    r11.<init>()
                    throw r11
                L87:
                    boolean r12 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r12 == 0) goto Lad
                    com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$NetworkError r12 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$NetworkError
                    com.avito.android.analytics.screens.J$a$a r2 = com.avito.android.analytics.screens.J.a.f90383b
                    com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                    com.avito.android.remote.error.ApiError r11 = r11.getError()
                    r2.getClass()
                    com.avito.android.analytics.screens.J$a r11 = com.avito.android.analytics.screens.J.a.C2676a.b(r11)
                    r12.<init>(r11)
                L9f:
                    r0.f278647r = r3
                    kotlinx.coroutines.flow.j r11 = r10.f278642b
                    java.lang.Object r11 = r11.emit(r12, r0)
                    if (r11 != r1) goto Laa
                    return r1
                Laa:
                    kotlin.G0 r11 = kotlin.G0.f406611a
                    return r11
                Lad:
                    kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                    r11.<init>()
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_order_map.serviceordermap.domain.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, c cVar, double d12, double d13) {
            this.f278638b = interfaceC43160i;
            this.f278639c = cVar;
            this.f278640d = d12;
            this.f278641e = d13;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f278638b).collect(new a(interfaceC43172j, this.f278639c, this.f278640d, this.f278641e), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: FindLocationByCoordsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.domain.FindLocationByCoordsUseCase$invoke$2", f = "FindLocationByCoordsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_order_map.serviceordermap.domain.c$c, reason: collision with other inner class name */
    public static final class C8284c extends SuspendLambda implements q<InterfaceC43172j<? super ServiceOrderMapInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f278649q;

        public C8284c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C8284c c8284c = new C8284c(3, continuation);
            c8284c.f278649q = th2;
            return c8284c.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f278649q;
            J.a.f90383b.getClass();
            J.a.C2676a.c(th2);
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k com.avito.android.geo_common.interactor.g gVar, @k R0 r02) {
        this.f278636a = gVar;
        this.f278637b = r02;
    }

    @k
    public final InterfaceC43160i<ServiceOrderMapInternalAction> a(double d12, double d13) {
        Parcelable.Creator<LocationFlowType> creator = LocationFlowType.CREATOR;
        return C43175k.I(this.f278637b.a(), new C43152f0(new b(y.a(this.f278636a.q(d12, d13, PluralsKeys.OTHER)), this, d12, d13), new C8284c(3, null)));
    }
}
