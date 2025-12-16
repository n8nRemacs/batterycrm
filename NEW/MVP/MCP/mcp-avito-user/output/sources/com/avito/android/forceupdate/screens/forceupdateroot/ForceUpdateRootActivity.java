package com.avito.android.forceupdate.screens.forceupdateroot;

import Cd.C13243a;
import L91.o;
import NE.a;
import OE.b;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.app.C22744b;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.result.h;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.ForceUpdateRootScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.forceupdate.screens.forceupdaterequired.ForceUpdateRequiredActivity;
import com.avito.android.forceupdate.screens.forceupdaterequired.ForceUpdateRequiredOpenParams;
import com.avito.android.lib.design.modal.a;
import com.avito.android.permissions.H;
import com.avito.android.permissions.t;
import com.avito.android.util.C;
import com.avito.android.util.C35961v3;
import com.avito.android.util.N0;
import com.avito.android.version_conflict.analytics.ForceUpdateShowCloseAnalytics;
import com.avito.android.version_conflict.analytics.ForceUpdateWebViewAnalytics;
import com.avito.android.version_conflict.m;
import i.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ForceUpdateRootActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ForceUpdateRootActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final a f158538x = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.forceupdate.screens.forceupdateroot.f f158539m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f158541o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public PE.a f158542p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public m f158543q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public ForceUpdateShowCloseAnalytics f158544r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ForceUpdateWebViewAnalytics f158545s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public C f158546t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public H f158547u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.modal.a f158548v;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f158540n = new O0(m0.f406844a.b(com.avito.android.forceupdate.screens.forceupdateroot.e.class), new e(), new d(new g()), new f());

    /* renamed from: w, reason: collision with root package name */
    @k
    public final h<String> f158549w = registerForActivityResult(new b.l(), new o(this, 20));

    /* compiled from: ForceUpdateRootActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootActivity$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ForceUpdateRootActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<OE.b, G0> {
        public final void f(@k OE.b bVar) {
            ForceUpdateRootActivity forceUpdateRootActivity = (ForceUpdateRootActivity) this.receiver;
            a aVar = ForceUpdateRootActivity.f158538x;
            forceUpdateRootActivity.getClass();
            if (bVar instanceof b.h) {
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, forceUpdateRootActivity, new com.avito.android.forceupdate.screens.forceupdateroot.c(forceUpdateRootActivity));
                com.avito.android.lib.util.g.a(aVarC);
                forceUpdateRootActivity.f158548v = aVarC;
                return;
            }
            if (bVar instanceof b.e) {
                ForceUpdateRequiredActivity.f158468w.getClass();
                forceUpdateRootActivity.startActivity(new Intent(forceUpdateRootActivity, (Class<?>) ForceUpdateRequiredActivity.class).putExtra("open_params", new ForceUpdateRequiredOpenParams(((b.e) bVar).f12086a)).addFlags(268468224));
                return;
            }
            if (bVar instanceof b.c) {
                b.c cVar = (b.c) bVar;
                PE.a aVar2 = forceUpdateRootActivity.f158542p;
                forceUpdateRootActivity.startActivity((aVar2 != null ? aVar2 : null).a(cVar.f12084a).addFlags(268468224));
                return;
            }
            if (bVar instanceof b.f) {
                H h12 = forceUpdateRootActivity.f158547u;
                if (h12 == null) {
                    h12 = null;
                }
                if (h12.g()) {
                    t.f215141z.getClass();
                    if (!C22744b.b(forceUpdateRootActivity, t.a.f215143b)) {
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", forceUpdateRootActivity.getPackageName(), null));
                        forceUpdateRootActivity.startActivity(intent);
                        Toast.makeText(forceUpdateRootActivity, forceUpdateRootActivity.getString(R.string.version_conflict_update_permission_required), 1).show();
                        return;
                    }
                }
                H h13 = forceUpdateRootActivity.f158547u;
                (h13 != null ? h13 : null).c();
                t.f215141z.getClass();
                forceUpdateRootActivity.f158549w.b(t.a.f215143b);
                return;
            }
            if (bVar instanceof b.g) {
                Toast.makeText(forceUpdateRootActivity, forceUpdateRootActivity.getString(R.string.version_conflict_update_download_started), 1).show();
                return;
            }
            if (L.f(bVar, b.a.f12082a)) {
                N0.a(forceUpdateRootActivity.f158548v);
                forceUpdateRootActivity.f158548v = null;
                return;
            }
            if (L.f(bVar, b.C0780b.f12083a)) {
                forceUpdateRootActivity.finish();
                return;
            }
            if (L.f(bVar, b.d.f12085a)) {
                m mVar = forceUpdateRootActivity.f158543q;
                forceUpdateRootActivity.startActivity((mVar != null ? mVar : null).a().addFlags(268468224));
                return;
            }
            if (L.f(bVar, b.l.f12093a)) {
                ForceUpdateShowCloseAnalytics forceUpdateShowCloseAnalytics = forceUpdateRootActivity.f158544r;
                ForceUpdateShowCloseAnalytics forceUpdateShowCloseAnalytics2 = forceUpdateShowCloseAnalytics != null ? forceUpdateShowCloseAnalytics : null;
                ForceUpdateShowCloseAnalytics.FromPage fromPage = ForceUpdateShowCloseAnalytics.FromPage.f325870b;
                if (forceUpdateShowCloseAnalytics2.f325868d) {
                    return;
                }
                forceUpdateShowCloseAnalytics2.f325868d = true;
                forceUpdateShowCloseAnalytics2.f325865a.c(new com.avito.android.version_conflict.analytics.d(fromPage, (String) forceUpdateShowCloseAnalytics2.f325867c.getValue()));
                return;
            }
            if (L.f(bVar, b.k.f12092a)) {
                ForceUpdateShowCloseAnalytics forceUpdateShowCloseAnalytics3 = forceUpdateRootActivity.f158544r;
                (forceUpdateShowCloseAnalytics3 != null ? forceUpdateShowCloseAnalytics3 : null).a(ForceUpdateShowCloseAnalytics.HowClosed.f325874b);
                return;
            }
            b.i iVar = b.i.f12090a;
            if (L.f(bVar, iVar)) {
                ForceUpdateShowCloseAnalytics forceUpdateShowCloseAnalytics4 = forceUpdateRootActivity.f158544r;
                (forceUpdateShowCloseAnalytics4 != null ? forceUpdateShowCloseAnalytics4 : null).a(ForceUpdateShowCloseAnalytics.HowClosed.f325877e);
                return;
            }
            if (L.f(bVar, b.j.f12091a)) {
                ForceUpdateShowCloseAnalytics forceUpdateShowCloseAnalytics5 = forceUpdateRootActivity.f158544r;
                (forceUpdateShowCloseAnalytics5 != null ? forceUpdateShowCloseAnalytics5 : null).a(ForceUpdateShowCloseAnalytics.HowClosed.f325875c);
            } else if (L.f(bVar, iVar)) {
                ForceUpdateShowCloseAnalytics forceUpdateShowCloseAnalytics6 = forceUpdateRootActivity.f158544r;
                (forceUpdateShowCloseAnalytics6 != null ? forceUpdateShowCloseAnalytics6 : null).a(ForceUpdateShowCloseAnalytics.HowClosed.f325877e);
            } else {
                if (!L.f(bVar, b.m.f12094a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ForceUpdateWebViewAnalytics forceUpdateWebViewAnalytics = forceUpdateRootActivity.f158545s;
                ForceUpdateWebViewAnalytics forceUpdateWebViewAnalytics2 = forceUpdateWebViewAnalytics != null ? forceUpdateWebViewAnalytics : null;
                forceUpdateWebViewAnalytics2.f325881a.c(new com.avito.android.version_conflict.analytics.b(ForceUpdateWebViewAnalytics.FromPage.f325884c, forceUpdateWebViewAnalytics2.f325882b.getF253025a()));
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(OE.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ForceUpdateRootActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOE/c;", "it", "Lkotlin/G0;", "invoke", "(LOE/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<OE.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f158550l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(OE.c cVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f158551l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f158551l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f158551l);
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
            return ForceUpdateRootActivity.this.getF42820b();
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
            return ForceUpdateRootActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ForceUpdateRootActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/forceupdate/screens/forceupdateroot/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.forceupdate.screens.forceupdateroot.e> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.forceupdate.screens.forceupdateroot.e invoke() {
            com.avito.android.forceupdate.screens.forceupdateroot.f fVar = ForceUpdateRootActivity.this.f158539m;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.forceupdate.screens.forceupdateroot.e) fVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).Xi().a(new C28478k(ForceUpdateRootScreen.f90360d, s.a(this), null, 4, null), (ForceUpdateRootOpenParams) C35961v3.a(this).getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f158541o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.forceupdate.screens.forceupdateroot.e a2() {
        return (com.avito.android.forceupdate.screens.forceupdateroot.e) this.f158540n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f158541o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f158541o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, a2(), new b(1, this, ForceUpdateRootActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootOneTimeEvent;)V", 0), c.f158550l);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f158541o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
