package com.avito.android.loyalty.ui.criteria_gray;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.LoyaltyCriteriaGrayScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.loyalty.di.criteria_gray.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import cv.InterfaceC39417a;
import jX.C42315a;
import jX.C42316b;
import jX.C42317c;
import javax.inject.Inject;
import kX.AbstractC42642c;
import kX.InterfaceC42640a;
import kX.InterfaceC42641b;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import lX.C43697a;
import z1.AbstractC50339a;

/* compiled from: CriteriaGrayActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/CriteriaGrayActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CriteriaGrayActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f183562w = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public j f183563m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f183564n = new O0(m0.f406844a.b(com.avito.android.loyalty.ui.criteria_gray.i.class), new g(), new f(new i()), new h());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public L f183565o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f183566p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f183567q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f183568r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f183569s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f183570t;

    /* renamed from: u, reason: collision with root package name */
    public RecyclerView f183571u;

    /* renamed from: v, reason: collision with root package name */
    public C42670a f183572v;

    /* compiled from: CriteriaGrayActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/CriteriaGrayActivity$a;", "", "<init>", "()V", "", "CRITERIA_GRAY_ARGS", "Ljava/lang/String;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CriteriaGrayActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = CriteriaGrayActivity.f183562w;
            CriteriaGrayActivity.this.a2().accept(InterfaceC42640a.b.f406360a);
            return G0.f406611a;
        }
    }

    /* compiled from: CriteriaGrayActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            RecyclerView recyclerView = CriteriaGrayActivity.this.f183571u;
            if (recyclerView == null) {
                return null;
            }
            return recyclerView;
        }
    }

    /* compiled from: CriteriaGrayActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<InterfaceC42641b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC42641b interfaceC42641b) {
            InterfaceC42641b interfaceC42641b2 = interfaceC42641b;
            CriteriaGrayActivity criteriaGrayActivity = (CriteriaGrayActivity) this.receiver;
            int i12 = CriteriaGrayActivity.f183562w;
            criteriaGrayActivity.getClass();
            if (interfaceC42641b2 instanceof InterfaceC42641b.a) {
                criteriaGrayActivity.onBackPressed();
            } else {
                if (interfaceC42641b2 instanceof InterfaceC42641b.C11619b) {
                    L l12 = criteriaGrayActivity.f183565o;
                    if (l12 == null) {
                        l12 = null;
                    }
                    Intent intentA = L.a.a(l12, null, 3);
                    intentA.addFlags(268468224);
                    criteriaGrayActivity.startActivity(intentA);
                    criteriaGrayActivity.finish();
                } else if (interfaceC42641b2 instanceof InterfaceC42641b.c) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar = criteriaGrayActivity.f183567q;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, ((InterfaceC42641b.c) interfaceC42641b2).f406366a, null, null, 6);
                } else if (interfaceC42641b2 instanceof InterfaceC42641b.d) {
                    InterfaceC42641b.d dVar = (InterfaceC42641b.d) interfaceC42641b2;
                    InterfaceC35845m2 interfaceC35845m2 = criteriaGrayActivity.f183568r;
                    Intent intentU = (interfaceC35845m2 != null ? interfaceC35845m2 : null).u(Uri.parse(dVar.f406367a), (6 & 2) == 0, (6 & 4) == 0);
                    C35974x2.d(intentU);
                    try {
                        criteriaGrayActivity.startActivity(intentU);
                    } catch (Exception unused) {
                        L5.a(criteriaGrayActivity, R.string.no_application_installed_to_perform_this_action, 0);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CriteriaGrayActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LkX/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LkX/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<AbstractC42642c, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC42642c abstractC42642c) {
            AbstractC42642c abstractC42642c2 = abstractC42642c;
            int i12 = CriteriaGrayActivity.f183562w;
            CriteriaGrayActivity criteriaGrayActivity = CriteriaGrayActivity.this;
            if (abstractC42642c2 instanceof AbstractC42642c.e) {
                C42670a c42670a = criteriaGrayActivity.f183572v;
                C42670a.d(c42670a != null ? c42670a : null);
            } else if (abstractC42642c2 instanceof AbstractC42642c.b) {
                AbstractC42642c.b bVar = (AbstractC42642c.b) abstractC42642c2;
                C42670a c42670a2 = criteriaGrayActivity.f183572v;
                if (c42670a2 == null) {
                    c42670a2 = null;
                }
                c42670a2.b();
                com.avito.konveyor.adapter.h hVar = criteriaGrayActivity.f183570t;
                (hVar != null ? hVar : null).f338510e = new UV0.c(bVar.f406370d.f183599a);
            } else if (abstractC42642c2 instanceof AbstractC42642c.C11620c) {
                C42670a c42670a3 = criteriaGrayActivity.f183572v;
                if (c42670a3 == null) {
                    c42670a3 = null;
                }
                c42670a3.c(null, com.avito.android.loyalty.ui.criteria_gray.b.f183583l);
            } else if (abstractC42642c2 instanceof AbstractC42642c.d) {
                C42670a c42670a4 = criteriaGrayActivity.f183572v;
                if (c42670a4 == null) {
                    c42670a4 = null;
                }
                c42670a4.c(null, com.avito.android.loyalty.ui.criteria_gray.a.f183582l);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f183576l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f183576l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f183576l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return CriteriaGrayActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return CriteriaGrayActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: CriteriaGrayActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/loyalty/ui/criteria_gray/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.loyalty.ui.criteria_gray.i> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.loyalty.ui.criteria_gray.i invoke() {
            j jVar = CriteriaGrayActivity.this.f183563m;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.loyalty.ui.criteria_gray.i) jVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_criteria_gray;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC5369a interfaceC5369aA = com.avito.android.loyalty.di.criteria_gray.h.a();
        C28478k c28478k = new C28478k(LoyaltyCriteriaGrayScreen.f90400d, s.a(this), "loyalty-criteria-gray");
        com.avito.android.loyalty.di.criteria_gray.b bVar = (com.avito.android.loyalty.di.criteria_gray.b) C29972i.a(C29972i.b(this), com.avito.android.loyalty.di.criteria_gray.b.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        com.avito.android.cpt.pre_activation.ui.c cVar = new com.avito.android.cpt.pre_activation.ui.c(this, 18);
        com.avito.android.auction.details.i iVar = new com.avito.android.auction.details.i(this, 9);
        Intent intent = getIntent();
        interfaceC5369aA.a(c28478k, cVar, iVar, (CriteriaGrayArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("CRITERIA_GRAY_ARGS", CriteriaGrayArgs.class) : intent.getParcelableExtra("CRITERIA_GRAY_ARGS")), new com.avito.android.loyalty.ui.criteria.a(this, 1), interfaceC39417aA, bVar).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183566p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.loyalty.ui.criteria_gray.i a2() {
        return (com.avito.android.loyalty.ui.criteria_gray.i) this.f183564n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183566p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ((NavBar) findViewById(R.id.loyalty_criteria_gray_nav_bar)).c(R.attr.ic_arrowBack24, new b());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.loyalty_criteria_gray_list);
        this.f183571u = recyclerView;
        com.avito.konveyor.adapter.j jVar = this.f183569s;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        RecyclerView recyclerView2 = this.f183571u;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        RecyclerView.l[] lVarArr = {new C42315a(), new C43697a(), new C42317c(), new C42316b()};
        for (int i12 = 0; i12 < 4; i12++) {
            recyclerView2.l(lVarArr[i12], -1);
        }
        C42670a c42670a = new C42670a((ViewGroup) findViewById(R.id.loyalty_criteria_gray_content), new c(), 0, 4, null);
        this.f183572v = c42670a;
        c42670a.a(new com.avito.android.imv_similiar_adverts.h(this, 22));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f183566p;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, a2(), new d(1, this, CriteriaGrayActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayOneTimeEvent;)V", 0), new e());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f183566p;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
