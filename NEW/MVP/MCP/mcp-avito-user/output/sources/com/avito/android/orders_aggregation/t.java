package com.avito.android.orders_aggregation;

import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.orders_aggregation.api.remote.model.OrdersAggregationResult;
import com.avito.android.orders_aggregation.x;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import n50.InterfaceC44196b;

/* compiled from: OrdersAggregationViewModelImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders_aggregation/t;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/orders_aggregation_core/g;", "Ln50/b;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t extends M0 implements com.avito.android.orders_aggregation_core.g, InterfaceC44196b {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final f f210319E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final R0 f210320J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final OrdersAggregationIntentFactory.GeneralOrdersData f210321K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f210322L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final B2 f210323M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f210324N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final OrdersAggregationTabShownStatusStorage f210325O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final String f210326P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final Z1<x> f210327Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final n2<x> f210328R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final e2 f210329S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final d2<G0> f210330T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<String> f210331U;

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f210332a;

        static {
            int[] iArr = new int[OrdersAggregationResult.Tab.Type.values().length];
            try {
                iArr[OrdersAggregationResult.Tab.Type.GOODS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrdersAggregationResult.Tab.Type.ORDERS_SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f210332a = iArr;
        }
    }

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationViewModelImpl$onGeneralOrdersScrolled$1", f = "OrdersAggregationViewModelImpl.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210333q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return t.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210333q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = t.this.f210329S;
                G0 g02 = G0.f406611a;
                this.f210333q = 1;
                if (e2Var.emit(g02, this) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<String> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f210335b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f210336b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationViewModelImpl$special$$inlined$mapNotNull$1$2", f = "OrdersAggregationViewModelImpl.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.orders_aggregation.t$c$a$a, reason: collision with other inner class name */
            public static final class C6281a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f210337q;

                /* renamed from: r, reason: collision with root package name */
                public int f210338r;

                public C6281a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f210337q = obj;
                    this.f210338r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f210336b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.orders_aggregation.t.c.a.C6281a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.orders_aggregation.t$c$a$a r0 = (com.avito.android.orders_aggregation.t.c.a.C6281a) r0
                    int r1 = r0.f210338r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f210338r = r1
                    goto L18
                L13:
                    com.avito.android.orders_aggregation.t$c$a$a r0 = new com.avito.android.orders_aggregation.t$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f210337q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f210338r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4d
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.orders_aggregation.x r5 = (com.avito.android.orders_aggregation.x) r5
                    boolean r6 = r5 instanceof com.avito.android.orders_aggregation.x.b
                    if (r6 == 0) goto L3f
                    com.avito.android.orders_aggregation.x$b r5 = (com.avito.android.orders_aggregation.x.b) r5
                    java.lang.String r5 = r5.f210368d
                    goto L40
                L3f:
                    r5 = 0
                L40:
                    if (r5 == 0) goto L4d
                    r0.f210338r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f210336b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4d
                    return r1
                L4d:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orders_aggregation.t.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i) {
            this.f210335b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super String> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f210335b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    public t(@Y61.k f fVar, @Y61.k R0 r02, @Y61.l OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k B2 b22, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k OrdersAggregationTabShownStatusStorage ordersAggregationTabShownStatusStorage, @Y61.l @com.avito.android.orders_aggregation.di.module.m String str) {
        this.f210319E = fVar;
        this.f210320J = r02;
        this.f210321K = generalOrdersData;
        this.f210322L = interfaceC28373a;
        this.f210323M = b22;
        this.f210324N = screenPerformanceTracker;
        this.f210325O = ordersAggregationTabShownStatusStorage;
        this.f210326P = str;
        Z1<x> z1A = p2.a(x.c.f210371a);
        this.f210327Q = z1A;
        this.f210328R = z1A;
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f210329S = e2VarB;
        this.f210330T = C43175k.a(e2VarB);
        this.f210331U = C43175k.r(new c(z1A));
        ScreenPerformanceTracker.a.b(screenPerformanceTracker, null, 3);
        C43259k.d(N0.a(this), null, null, new u(this, null, null), 3);
    }

    @Override // n50.InterfaceC44196b
    public final void Y5() {
        x value = this.f210328R.getValue();
        x.b bVar = value instanceof x.b ? (x.b) value : null;
        if (bVar == null) {
            return;
        }
        this.f210327Q.setValue(x.b.a(bVar, 0, null, false, 31));
    }

    @Override // n50.InterfaceC44196b
    public final void Y9() {
        C43259k.d(N0.a(this), null, null, new b(null), 3);
    }

    @Override // n50.InterfaceC44196b
    @Y61.k
    public final InterfaceC43160i<String> s9() {
        return this.f210331U;
    }
}
