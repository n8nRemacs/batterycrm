package com.avito.android.forceupdate.screens.forceupdaterequired;

import Cd.C13243a;
import L91.o;
import LE.a;
import ME.a;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.View;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.result.h;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.ForceUpdateRequiredScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.forceupdate.screens.forceupdaterequired.ForceUpdateRequiredActivity;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredState;
import com.avito.android.permissions.H;
import com.avito.android.util.C35961v3;
import com.avito.android.version_conflict.analytics.ForceUpdateShowCloseAnalytics;
import com.avito.android.version_conflict.analytics.ForceUpdateWebViewAnalytics;
import com.avito.android.version_conflict.m;
import i.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ForceUpdateRequiredActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/ForceUpdateRequiredActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ForceUpdateRequiredActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final a f158468w = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.forceupdate.screens.forceupdaterequired.d f158469m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f158471o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public PE.a f158472p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public m f158473q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public ForceUpdateShowCloseAnalytics f158474r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ForceUpdateWebViewAnalytics f158475s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public H f158476t;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f158470n = new O0(m0.f406844a.b(com.avito.android.forceupdate.screens.forceupdaterequired.c.class), new e(), new d(new g()), new f());

    /* renamed from: u, reason: collision with root package name */
    @k
    public final Object f158477u = C35961v3.a(this);

    /* renamed from: v, reason: collision with root package name */
    @k
    public final h<String> f158478v = registerForActivityResult(new b.l(), new o(this, 19));

    /* compiled from: ForceUpdateRequiredActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/ForceUpdateRequiredActivity$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ForceUpdateRequiredActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements l<ME.b, G0> {
        /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(ME.b r6) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.forceupdate.screens.forceupdaterequired.ForceUpdateRequiredActivity.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ForceUpdateRequiredActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<ForceUpdateRequiredState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f158479l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(ForceUpdateRequiredState forceUpdateRequiredState) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f158480l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f158480l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f158480l);
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
            return ForceUpdateRequiredActivity.this.getF42820b();
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
            return ForceUpdateRequiredActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ForceUpdateRequiredActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/forceupdate/screens/forceupdaterequired/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.forceupdate.screens.forceupdaterequired.c> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.forceupdate.screens.forceupdaterequired.c invoke() {
            com.avito.android.forceupdate.screens.forceupdaterequired.d dVar = ForceUpdateRequiredActivity.this.f158469m;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.forceupdate.screens.forceupdaterequired.c) dVar.get();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).ea().a(new C28478k(ForceUpdateRequiredScreen.f90359d, s.a(this), null, 4, null), (ForceUpdateRequiredOpenParams) this.f158477u.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f158471o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f158471o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.version_conflict_update_required_screen);
        final int i12 = 0;
        findViewById(R.id.button_update_application).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.forceupdate.screens.forceupdaterequired.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ForceUpdateRequiredActivity f158486c;

            {
                this.f158486c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForceUpdateRequiredActivity forceUpdateRequiredActivity = this.f158486c;
                switch (i12) {
                    case 0:
                        ForceUpdateRequiredActivity.a aVar = ForceUpdateRequiredActivity.f158468w;
                        ((c) forceUpdateRequiredActivity.f158470n.getValue()).accept(a.b.f10483a);
                        break;
                    default:
                        ForceUpdateRequiredActivity.a aVar2 = ForceUpdateRequiredActivity.f158468w;
                        ((c) forceUpdateRequiredActivity.f158470n.getValue()).accept(a.C0665a.f10482a);
                        break;
                }
            }
        });
        final int i13 = 1;
        findViewById(R.id.button_open_mav).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.forceupdate.screens.forceupdaterequired.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ForceUpdateRequiredActivity f158486c;

            {
                this.f158486c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForceUpdateRequiredActivity forceUpdateRequiredActivity = this.f158486c;
                switch (i13) {
                    case 0:
                        ForceUpdateRequiredActivity.a aVar = ForceUpdateRequiredActivity.f158468w;
                        ((c) forceUpdateRequiredActivity.f158470n.getValue()).accept(a.b.f10483a);
                        break;
                    default:
                        ForceUpdateRequiredActivity.a aVar2 = ForceUpdateRequiredActivity.f158468w;
                        ((c) forceUpdateRequiredActivity.f158470n.getValue()).accept(a.C0665a.f10482a);
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f158471o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (com.avito.android.forceupdate.screens.forceupdaterequired.c) this.f158470n.getValue(), new b(1, this, ForceUpdateRequiredActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredOneTimeEvent;)V", 0), c.f158479l);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f158471o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
