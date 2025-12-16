package com.avito.android.passport.profiles_list;

import Cd.C13243a;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.view.C22981N;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.N0;
import j60.InterfaceC42204a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;

/* compiled from: PassportProfilesListActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profiles_list/PassportProfilesListActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportProfilesListActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b, com.avito.android.ui.status_bar.a {

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final a f213728u = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f213729m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public l f213730n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f213731o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f213732p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public j f213733q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final O0 f213734r = new O0(m0.f406844a.b(i.class), new d(), new c(new f()), new e());

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f213735s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f213736t;

    /* compiled from: PassportProfilesListActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profiles_list/PassportProfilesListActivity$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PassportProfilesListActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj60/a;", "action", "Lkotlin/G0;", "invoke", "(Lj60/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC42204a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC42204a interfaceC42204a) {
            ((i) PassportProfilesListActivity.this.f213734r.getValue()).accept(interfaceC42204a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f213738l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f213738l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f213738l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return PassportProfilesListActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return PassportProfilesListActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: PassportProfilesListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profiles_list/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profiles_list/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<i> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final i invoke() {
            j jVar = PassportProfilesListActivity.this.f213733q;
            if (jVar == null) {
                jVar = null;
            }
            return (i) jVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.passport.profiles_list.di.a.a().a((com.avito.android.passport.profiles_list.di.d) C29972i.a(C29972i.b(this), com.avito.android.passport.profiles_list.di.d.class), cv.c.a(this), getIntent().getBooleanExtra("finalized", false), com.avito.android.analytics.screens.s.a(this), new b()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f213735s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_passport_profiles_list);
        a.b.a(this, true);
        com.avito.android.ui.status_bar.e eVar = this.f213736t;
        Object[] objArr = 0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.b(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f213735s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.profiles_list_bottom_sheet, (ViewGroup) null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(this, 0, 2, objArr == true ? 1 : 0);
        dVar.G(viewInflate, true);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnDismissListener(new com.avito.android.passport.profiles_list.a(this, 0));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        this.f213729m = dVar;
        com.avito.konveyor.adapter.j jVar = this.f213731o;
        if (jVar == null) {
            jVar = null;
        }
        this.f213730n = new l(viewInflate, jVar, new com.avito.android.passport.profiles_list.d(this), new com.avito.android.passport.profiles_list.e(this));
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f213729m;
        if (dVar2 != null) {
            com.avito.android.lib.util.g.a(dVar2);
        }
        C43259k.d(C22981N.a(getLifecycle()), null, null, new com.avito.android.passport.profiles_list.b(this, null), 3);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new com.avito.android.passport.profiles_list.c(this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f213735s;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f213729m;
        if (dVar != null) {
            dVar.setOnDismissListener(null);
            N0.a(dVar);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f213729m;
        if (dVar != null) {
            dVar.setOnDismissListener(new com.avito.android.passport.profiles_list.a(this, 1));
            com.avito.android.lib.util.g.a(dVar);
        }
    }
}
