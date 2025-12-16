package com.avito.android.auto_loans_cabinet;

import He.InterfaceC13981a;
import Ke.InterfaceC14306b;
import android.os.Bundle;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.auto_loans_cabinet.L;
import com.avito.android.auto_loans_cabinet.analytics.AutoLoanCabinetScreen;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z1.AbstractC50339a;

/* compiled from: AutoLoansCabinetActivity.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/AutoLoansCabinetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState;", VoiceInfo.STATE, "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoLoansCabinetActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f95294q = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public L.a f95295m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f95296n = new O0(m0.f406844a.b(L.class), new d(), new c(new f()), new e());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f95297o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f95298p;

    /* compiled from: AutoLoansCabinetActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                O0 o02 = AutoLoansCabinetActivity.this.f95296n;
                C28710o.a((AutoLoansCabinetState) C22126m3.b(((L) o02.getValue()).getState(), a13).getF42167b(), ((L) o02.getValue()).getEvents(), new J(1, (L) o02.getValue(), L.class, "accept", "accept(Ljava/lang/Object;)V", 0), a13, 64);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoLoansCabinetActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auto_loans_cabinet.AutoLoansCabinetActivity$onCreate$2", f = "AutoLoansCabinetActivity.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f95300q;

        /* compiled from: AutoLoansCabinetActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.auto_loans_cabinet.AutoLoansCabinetActivity$onCreate$2$1", f = "AutoLoansCabinetActivity.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f95302q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AutoLoansCabinetActivity f95303r;

            /* compiled from: AutoLoansCabinetActivity.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.auto_loans_cabinet.AutoLoansCabinetActivity$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2826a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutoLoansCabinetActivity f95304b;

                public C2826a(AutoLoansCabinetActivity autoLoansCabinetActivity) {
                    this.f95304b = autoLoansCabinetActivity;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC14306b interfaceC14306b = (InterfaceC14306b) obj;
                    int i12 = AutoLoansCabinetActivity.f95294q;
                    AutoLoansCabinetActivity autoLoansCabinetActivity = this.f95304b;
                    if (interfaceC14306b instanceof InterfaceC14306b.a) {
                        autoLoansCabinetActivity.onBackPressed();
                    } else {
                        if (!(interfaceC14306b instanceof InterfaceC14306b.C0585b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.avito.android.deeplink_handler.handler.composite.a aVar = autoLoansCabinetActivity.f95297o;
                        if (aVar == null) {
                            aVar = null;
                        }
                        b.a.a(aVar, ((InterfaceC14306b.C0585b) interfaceC14306b).f9572a, null, null, 6);
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f95304b, AutoLoansCabinetActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AutoLoansCabinetActivity autoLoansCabinetActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f95303r = autoLoansCabinetActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f95303r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f95302q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    AutoLoansCabinetActivity autoLoansCabinetActivity = this.f95303r;
                    L l12 = (L) autoLoansCabinetActivity.f95296n.getValue();
                    C2826a c2826a = new C2826a(autoLoansCabinetActivity);
                    this.f95302q = 1;
                    Object objCollect = l12.getEvents().collect(c2826a, this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                    if (objCollect == coroutine_suspended) {
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

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return AutoLoansCabinetActivity.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f95300q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                AutoLoansCabinetActivity autoLoansCabinetActivity = AutoLoansCabinetActivity.this;
                a aVar = new a(autoLoansCabinetActivity, null);
                this.f95300q = 1;
                if (C23056p0.b(autoLoansCabinetActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f95306m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar) {
            super(0);
            this.f95306m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(AutoLoansCabinetActivity.this, this.f95306m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AutoLoansCabinetActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AutoLoansCabinetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutoLoansCabinetActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/auto_loans_cabinet/L;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/auto_loans_cabinet/L;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<C23060r0, L> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final L invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            L.a aVar = AutoLoansCabinetActivity.this.f95295m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        com.avito.android.auto_loans_cabinet.di.component.e.a().a((InterfaceC13981a) C29972i.a(C29972i.b(this), InterfaceC13981a.class), cv.c.a(this), new C28478k(AutoLoanCabinetScreen.f95339d, com.avito.android.analytics.screens.s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f95298p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f95298p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        androidx.view.compose.j.a(this, new C22096n(1088692459, new a(), true));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f95298p;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
