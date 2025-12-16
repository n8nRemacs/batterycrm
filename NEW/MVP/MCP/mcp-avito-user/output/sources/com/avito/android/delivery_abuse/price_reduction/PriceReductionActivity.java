package com.avito.android.delivery_abuse.price_reduction;

import Bv.b;
import Cd.C13243a;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.delivery_abuse.price_reduction.perf.PriceReductionPerfScreen;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z1.AbstractC50339a;

/* compiled from: PriceReductionActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/PriceReductionActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "LBv/c;", VoiceInfo.STATE, "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PriceReductionActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f134765q = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public r f134766m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f134768o;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f134767n = new O0(m0.f406844a.b(q.class), new f(), new e(new h()), new g());

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f134769p = C42727D.c(new b());

    /* compiled from: PriceReductionActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/PriceReductionActivity$a;", "", "<init>", "()V", "", "IS_NEW_PRICE", "Ljava/lang/String;", "ITEM_ID", "NEW_PRICE", "OLD_PRICE", "SELECTED_PRICE", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PriceReductionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = PriceReductionActivity.this.f134768o;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: PriceReductionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1930251464, new com.avito.android.delivery_abuse.price_reduction.d(PriceReductionActivity.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PriceReductionActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_abuse.price_reduction.PriceReductionActivity$onCreate$2", f = "PriceReductionActivity.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f134772q;

        /* compiled from: PriceReductionActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.delivery_abuse.price_reduction.PriceReductionActivity$onCreate$2$1", f = "PriceReductionActivity.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f134774q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PriceReductionActivity f134775r;

            /* compiled from: PriceReductionActivity.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.delivery_abuse.price_reduction.PriceReductionActivity$d$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C4065a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PriceReductionActivity f134776b;

                public C4065a(PriceReductionActivity priceReductionActivity) {
                    this.f134776b = priceReductionActivity;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Bv.b bVar = (Bv.b) obj;
                    int i12 = PriceReductionActivity.f134765q;
                    PriceReductionActivity priceReductionActivity = this.f134776b;
                    if (bVar instanceof b.c) {
                        Intent intent = new Intent();
                        b.c cVar = (b.c) bVar;
                        intent.putExtra("selected_price", cVar.f1786a);
                        intent.putExtra("is_new_price", cVar.f1787b);
                        G0 g02 = G0.f406611a;
                        priceReductionActivity.setResult(-1, intent);
                        priceReductionActivity.finish();
                    }
                    G0 g03 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g03;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f134776b, PriceReductionActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PriceReductionActivity priceReductionActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f134775r = priceReductionActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f134775r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f134774q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PriceReductionActivity priceReductionActivity = this.f134775r;
                    q qVar = (q) priceReductionActivity.f134767n.getValue();
                    C4065a c4065a = new C4065a(priceReductionActivity);
                    this.f134774q = 1;
                    if (qVar.ke(c4065a, this) == coroutine_suspended) {
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

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return PriceReductionActivity.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f134772q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                PriceReductionActivity priceReductionActivity = PriceReductionActivity.this;
                a aVar = new a(priceReductionActivity, null);
                this.f134772q = 1;
                if (C23056p0.b(priceReductionActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f134777l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f134777l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f134777l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return PriceReductionActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return PriceReductionActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: PriceReductionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/delivery_abuse/price_reduction/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<q> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = PriceReductionActivity.this.f134766m;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.delivery_abuse.price_reduction.di.a.a().a((com.avito.android.delivery_abuse.price_reduction.di.f) C29972i.a(C29972i.b(this), com.avito.android.delivery_abuse.price_reduction.di.f.class), cv.c.a(this), new C28478k(PriceReductionPerfScreen.f134927d, com.avito.android.analytics.screens.s.a(this), null, 4, null), getIntent().getLongExtra("item_id", 0L), getIntent().getLongExtra("old_price", 0L), getIntent().getLongExtra("new_price", 0L)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f134768o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f134768o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        androidx.view.compose.j.a(this, new C22096n(1108379181, new c(), true));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f134768o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
