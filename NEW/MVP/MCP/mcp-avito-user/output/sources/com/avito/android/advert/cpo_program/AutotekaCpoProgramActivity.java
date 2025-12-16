package com.avito.android.advert.cpo_program;

import Cd.C13243a;
import X3.c;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.advert.cpo_program.di.a;
import com.avito.android.analytics.screens.AutotekaCpoProgramScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: AutotekaCpoProgramActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/cpo_program/AutotekaCpoProgramActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AutotekaCpoProgramActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f68843q = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public W3.b f68844m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f68845n = new O0(m0.f406844a.b(W3.a.class), new f(), new e(new h()), new g());

    /* renamed from: o, reason: collision with root package name */
    @k
    public final InterfaceC42726C f68846o = C42727D.c(new b());

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f68847p;

    /* compiled from: AutotekaCpoProgramActivity.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/cpo_program/AutotekaCpoProgramActivity$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: AutotekaCpoProgramActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/advert/cpo_program/e;", "invoke", "()Lcom/avito/android/advert/cpo_program/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.advert.cpo_program.e> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.advert.cpo_program.e invoke() {
            AutotekaCpoProgramActivity autotekaCpoProgramActivity = AutotekaCpoProgramActivity.this;
            return new com.avito.android.advert.cpo_program.e(new com.avito.android.advert.cpo_program.a(autotekaCpoProgramActivity), autotekaCpoProgramActivity.K1());
        }
    }

    /* compiled from: AutotekaCpoProgramActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<X3.c, G0> {
        @Override // Y41.l
        public final G0 invoke(X3.c cVar) {
            AutotekaCpoProgramActivity autotekaCpoProgramActivity = (AutotekaCpoProgramActivity) this.receiver;
            int i12 = AutotekaCpoProgramActivity.f68843q;
            autotekaCpoProgramActivity.getClass();
            if (L.f(cVar, c.a.f18571a)) {
                autotekaCpoProgramActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaCpoProgramActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX3/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LX3/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<X3.d, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(X3.d dVar) {
            ((com.avito.android.advert.cpo_program.d) AutotekaCpoProgramActivity.this.f68846o.getValue()).a(dVar.f18573b);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f68850l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f68850l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f68850l);
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
            return AutotekaCpoProgramActivity.this.getF42820b();
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
            return AutotekaCpoProgramActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaCpoProgramActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LW3/a;", "kotlin.jvm.PlatformType", "invoke", "()LW3/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<W3.a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final W3.a invoke() {
            W3.b bVar = AutotekaCpoProgramActivity.this.f68844m;
            if (bVar == null) {
                bVar = null;
            }
            return (W3.a) bVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_autoteka_cpo_program;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(AutotekaCpoProgramScreen.f90289d, s.a(this), null, 4, null);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("cpo_program_data");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException(("cpo_program_data was not passed to " + this).toString());
        }
        a.InterfaceC2155a interfaceC2155aA = com.avito.android.advert.cpo_program.di.c.a();
        interfaceC2155aA.c((com.avito.android.advert.cpo_program.di.b) C29972i.a(C29972i.b(this), com.avito.android.advert.cpo_program.di.b.class));
        interfaceC2155aA.b((CpoDescription) parcelableExtra);
        interfaceC2155aA.a(c28478k);
        interfaceC2155aA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f68847p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f68847p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f68847p;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (W3.a) this.f68845n.getValue(), new c(1, this, AutotekaCpoProgramActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/advert/cpo_program/autotekacpoprogram/mvi/entity/AutotekaCpoProgramOneTimeEvent;)V", 0), new d());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f68847p;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
    }
}
