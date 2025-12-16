package com.avito.android.wallet.history;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
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
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.wallet.history.mvi.H;
import com.avito.android.wallet.history.mvi.I;
import com.avito.android.wallet.history.mvi.di.c;
import com.avito.android.wallet.history.mvi.perf.WalletHistoryPerfScreen;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: WalletHistoryActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/wallet/history/WalletHistoryActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryState;", VoiceInfo.STATE, "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletHistoryActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public I f327506m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f327508o;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f327507n = new O0(m0.f406844a.b(H.class), new e(), new d(new g()), new f());

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Object f327509p = C42727D.b(LazyThreadSafetyMode.f406616d, new b());

    /* compiled from: WalletHistoryActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/wallet/history/WalletHistoryActivity$a;", "", "<init>", "()V", "", "KEY_PAGE_FROM", "Ljava/lang/String;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WalletHistoryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = WalletHistoryActivity.this.f327508o;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: WalletHistoryActivity.kt */
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
                WalletHistoryActivity walletHistoryActivity = WalletHistoryActivity.this;
                q.b((com.avito.android.analytics.screens.compose.a) walletHistoryActivity.f327509p.getValue(), r.c(1750710300, new com.avito.android.wallet.history.c(walletHistoryActivity, C22126m3.b(((H) walletHistoryActivity.f327507n.getValue()).getState(), a13)), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f327512l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f327512l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f327512l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return WalletHistoryActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return WalletHistoryActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WalletHistoryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/wallet/history/mvi/H;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/wallet/history/mvi/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<H> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final H invoke() {
            I i12 = WalletHistoryActivity.this.f327506m;
            if (i12 == null) {
                i12 = null;
            }
            return (H) i12.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(WalletHistoryPerfScreen.f327715d, s.a(this), null, 4, null);
        c.a aVarA = com.avito.android.wallet.history.mvi.di.a.a();
        com.avito.android.wallet.history.mvi.di.d dVar = (com.avito.android.wallet.history.mvi.di.d) C29972i.a(C29972i.b(this), com.avito.android.wallet.history.mvi.di.d.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        String stringExtra = getIntent().getStringExtra("key_page_from");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVarA.a(dVar, interfaceC39417aA, c28478k, stringExtra).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f327508o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f327508o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        j.a(this, new C22096n(883610300, new c(), true));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f327508o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
