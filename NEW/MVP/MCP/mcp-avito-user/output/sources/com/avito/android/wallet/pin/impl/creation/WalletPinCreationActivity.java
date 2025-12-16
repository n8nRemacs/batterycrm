package com.avito.android.wallet.pin.impl.creation;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.compose.j;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.compose.q;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.wallet.pin.impl.creation.di.b;
import com.avito.android.wallet.pin.impl.creation.mvi.t;
import com.avito.android.wallet.pin.impl.creation.mvi.u;
import com.avito.android.wallet.pin.impl.creation.perf.WalletPinCreationPerfScreen;
import cv.InterfaceC39417a;
import eP0.b;
import gj.InterfaceC40691b;
import gj.i;
import gj.n;
import gj.o;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
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

/* compiled from: WalletPinCreationActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/WalletPinCreationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "<init>", "()V", "a", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationState;", VoiceInfo.STATE, "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletPinCreationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b, i {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f328432s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public u f328433m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f328435o;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC40691b f328437q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public n f328438r;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f328434n = new O0(m0.f406844a.b(t.class), new f(), new e(new h()), new g());

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Object f328436p = C42727D.b(LazyThreadSafetyMode.f406616d, new b());

    /* compiled from: WalletPinCreationActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/WalletPinCreationActivity$a;", "", "<init>", "()V", "", "KEY_DATA_URL", "Ljava/lang/String;", "RESULT_EXTRA_PARAMS", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WalletPinCreationActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = WalletPinCreationActivity.this.f328435o;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: WalletPinCreationActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {
        public c() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                WalletPinCreationActivity walletPinCreationActivity = WalletPinCreationActivity.this;
                q.b((com.avito.android.analytics.screens.compose.a) walletPinCreationActivity.f328436p.getValue(), r.c(1173819804, new com.avito.android.wallet.pin.impl.creation.b(walletPinCreationActivity, C22126m3.b(((t) walletPinCreationActivity.f328434n.getValue()).getState(), a13)), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinCreationActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.WalletPinCreationActivity$onCreate$2", f = "WalletPinCreationActivity.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328441q;

        /* compiled from: WalletPinCreationActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.WalletPinCreationActivity$onCreate$2$1", f = "WalletPinCreationActivity.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f328443q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ WalletPinCreationActivity f328444r;

            /* compiled from: WalletPinCreationActivity.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.wallet.pin.impl.creation.WalletPinCreationActivity$d$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C10187a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WalletPinCreationActivity f328445b;

                public C10187a(WalletPinCreationActivity walletPinCreationActivity) {
                    this.f328445b = walletPinCreationActivity;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    eP0.b bVar = (eP0.b) obj;
                    int i12 = WalletPinCreationActivity.f328432s;
                    WalletPinCreationActivity walletPinCreationActivity = this.f328445b;
                    walletPinCreationActivity.getClass();
                    if (bVar instanceof b.a) {
                        walletPinCreationActivity.finish();
                    } else if (bVar instanceof b.c) {
                        walletPinCreationActivity.setResult(-1, new Intent().putExtra("wallet_pin_creation_result_extra_params", ((b.c) bVar).f395175a));
                    } else if (bVar instanceof b.C11080b) {
                        walletPinCreationActivity.onBackPressed();
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f328445b, WalletPinCreationActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletPinCreationActivity walletPinCreationActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f328444r = walletPinCreationActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f328444r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f328443q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    WalletPinCreationActivity walletPinCreationActivity = this.f328444r;
                    t tVar = (t) walletPinCreationActivity.f328434n.getValue();
                    C10187a c10187a = new C10187a(walletPinCreationActivity);
                    this.f328443q = 1;
                    if (tVar.ke(c10187a, this) == coroutine_suspended) {
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
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return WalletPinCreationActivity.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328441q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                WalletPinCreationActivity walletPinCreationActivity = WalletPinCreationActivity.this;
                a aVar = new a(walletPinCreationActivity, null);
                this.f328441q = 1;
                if (C23056p0.b(walletPinCreationActivity, state, aVar, this) == coroutine_suspended) {
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
        public final /* synthetic */ Y41.a f328446l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f328446l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f328446l);
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
            return WalletPinCreationActivity.this.getF42820b();
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
            return WalletPinCreationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WalletPinCreationActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/wallet/pin/impl/creation/mvi/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<t> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = WalletPinCreationActivity.this.f328433m;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // gj.i
    @l
    public final RecyclerView B0(@k String str) {
        return null;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(WalletPinCreationPerfScreen.f328722d, s.a(this), null, 4, null);
        b.a aVarA = com.avito.android.wallet.pin.impl.creation.di.a.a();
        com.avito.android.wallet.pin.impl.creation.di.c cVar = (com.avito.android.wallet.pin.impl.creation.di.c) C29972i.a(C29972i.b(this), com.avito.android.wallet.pin.impl.creation.di.c.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        String stringExtra = getIntent().getStringExtra("key_data_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVarA.a(cVar, interfaceC39417aA, c28478k, stringExtra, this).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f328435o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // gj.i
    @l
    public final View b3(@k String str) {
        return null;
    }

    @Override // gj.i
    @k
    public final o c1() {
        return new o(new o.a(K1(), ToastBarPosition.f181047e), new o.a(K1(), ToastBarPosition.f181046d));
    }

    @Override // gj.i
    @k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f328435o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        j.a(this, new C22096n(-663567300, new c(), true));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
        n nVar = this.f328438r;
        if (nVar == null) {
            nVar = null;
        }
        com.avito.android.beduin.view.c cVarA = nVar.a(this, this, this, null);
        InterfaceC40691b interfaceC40691b = this.f328437q;
        if (interfaceC40691b == null) {
            interfaceC40691b = null;
        }
        cVarA.l(interfaceC40691b);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f328435o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        InterfaceC40691b interfaceC40691b = this.f328437q;
        if (interfaceC40691b == null) {
            interfaceC40691b = null;
        }
        interfaceC40691b.onCleared();
    }
}
