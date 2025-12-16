package com.avito.android.loyalty.ui.quality_service_gray;

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
import com.avito.android.analytics.screens.LoyaltyQualityGrayStateScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.loyalty.di.quality_service_gray.b;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import lX.C43697a;
import qX.C47355a;
import qX.C47356b;
import qX.C47357c;
import qX.C47358d;
import rX.AbstractC47609c;
import rX.InterfaceC47607a;
import rX.InterfaceC47608b;
import z1.AbstractC50339a;

/* compiled from: QualityServiceGrayActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/QualityServiceGrayActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QualityServiceGrayActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f184032w = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.loyalty.ui.quality_service_gray.i f184033m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f184034n = new O0(m0.f406844a.b(com.avito.android.loyalty.ui.quality_service_gray.h.class), new g(), new f(new i()), new h());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public L f184035o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f184036p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f184037q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f184038r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public j f184039s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f184040t;

    /* renamed from: u, reason: collision with root package name */
    public RecyclerView f184041u;

    /* renamed from: v, reason: collision with root package name */
    public C42670a f184042v;

    /* compiled from: QualityServiceGrayActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/QualityServiceGrayActivity$a;", "", "<init>", "()V", "", "QUALITY_SERVICE_GRAY_ARGS", "Ljava/lang/String;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: QualityServiceGrayActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = QualityServiceGrayActivity.f184032w;
            ((com.avito.android.loyalty.ui.quality_service_gray.h) QualityServiceGrayActivity.this.f184034n.getValue()).accept(InterfaceC47607a.C12378a.f429855a);
            return G0.f406611a;
        }
    }

    /* compiled from: QualityServiceGrayActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            RecyclerView recyclerView = QualityServiceGrayActivity.this.f184041u;
            if (recyclerView == null) {
                return null;
            }
            return recyclerView;
        }
    }

    /* compiled from: QualityServiceGrayActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<InterfaceC47608b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47608b interfaceC47608b) {
            InterfaceC47608b interfaceC47608b2 = interfaceC47608b;
            QualityServiceGrayActivity qualityServiceGrayActivity = (QualityServiceGrayActivity) this.receiver;
            int i12 = QualityServiceGrayActivity.f184032w;
            qualityServiceGrayActivity.getClass();
            if (interfaceC47608b2 instanceof InterfaceC47608b.a) {
                qualityServiceGrayActivity.onBackPressed();
            } else {
                if (interfaceC47608b2 instanceof InterfaceC47608b.C12379b) {
                    L l12 = qualityServiceGrayActivity.f184035o;
                    if (l12 == null) {
                        l12 = null;
                    }
                    Intent intentA = L.a.a(l12, null, 3);
                    intentA.addFlags(268468224);
                    qualityServiceGrayActivity.startActivity(intentA);
                    qualityServiceGrayActivity.finish();
                } else if (interfaceC47608b2 instanceof InterfaceC47608b.c) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar = qualityServiceGrayActivity.f184036p;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, ((InterfaceC47608b.c) interfaceC47608b2).f429861a, null, null, 6);
                } else if (interfaceC47608b2 instanceof InterfaceC47608b.d) {
                    InterfaceC47608b.d dVar = (InterfaceC47608b.d) interfaceC47608b2;
                    InterfaceC35845m2 interfaceC35845m2 = qualityServiceGrayActivity.f184037q;
                    Intent intentU = (interfaceC35845m2 != null ? interfaceC35845m2 : null).u(Uri.parse(dVar.f429862a), (6 & 2) == 0, (6 & 4) == 0);
                    C35974x2.d(intentU);
                    try {
                        qualityServiceGrayActivity.startActivity(intentU);
                    } catch (Exception unused) {
                        L5.a(qualityServiceGrayActivity, R.string.no_application_installed_to_perform_this_action, 0);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: QualityServiceGrayActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements l<AbstractC47609c, G0> {
        public final void f(@k AbstractC47609c abstractC47609c) {
            QualityServiceGrayActivity qualityServiceGrayActivity = (QualityServiceGrayActivity) this.receiver;
            int i12 = QualityServiceGrayActivity.f184032w;
            qualityServiceGrayActivity.getClass();
            if (abstractC47609c instanceof AbstractC47609c.C12380c) {
                AbstractC47609c.C12380c c12380c = (AbstractC47609c.C12380c) abstractC47609c;
                C42670a c42670a = qualityServiceGrayActivity.f184042v;
                if (c42670a == null) {
                    c42670a = null;
                }
                c42670a.b();
                com.avito.konveyor.adapter.h hVar = qualityServiceGrayActivity.f184040t;
                (hVar != null ? hVar : null).f338510e = new UV0.c(c12380c.f429865b.f184145a);
                return;
            }
            if (abstractC47609c instanceof AbstractC47609c.d) {
                C42670a c42670a2 = qualityServiceGrayActivity.f184042v;
                C42670a.d(c42670a2 != null ? c42670a2 : null);
                return;
            }
            if (abstractC47609c instanceof AbstractC47609c.a) {
                C42670a c42670a3 = qualityServiceGrayActivity.f184042v;
                if (c42670a3 == null) {
                    c42670a3 = null;
                }
                c42670a3.c(null, com.avito.android.loyalty.ui.quality_service_gray.b.f184052l);
                return;
            }
            if (abstractC47609c instanceof AbstractC47609c.b) {
                C42670a c42670a4 = qualityServiceGrayActivity.f184042v;
                if (c42670a4 == null) {
                    c42670a4 = null;
                }
                c42670a4.c(null, com.avito.android.loyalty.ui.quality_service_gray.a.f184051l);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(AbstractC47609c abstractC47609c) {
            f(abstractC47609c);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f184045l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f184045l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f184045l);
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
            return QualityServiceGrayActivity.this.getF42820b();
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
            return QualityServiceGrayActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: QualityServiceGrayActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/loyalty/ui/quality_service_gray/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.loyalty.ui.quality_service_gray.h> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.loyalty.ui.quality_service_gray.h invoke() {
            com.avito.android.loyalty.ui.quality_service_gray.i iVar = QualityServiceGrayActivity.this.f184033m;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.loyalty.ui.quality_service_gray.h) iVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_quality_service_gray;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.loyalty.di.quality_service_gray.a.a();
        C28478k c28478k = new C28478k(LoyaltyQualityGrayStateScreen.f90402d, s.a(this), "loyalty-qualityService-gray");
        com.avito.android.loyalty.di.quality_service_gray.c cVar = (com.avito.android.loyalty.di.quality_service_gray.c) C29972i.a(C29972i.b(this), com.avito.android.loyalty.di.quality_service_gray.c.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        Intent intent = getIntent();
        aVarA.a(c28478k, (QualityServiceGrayArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("QUALITY_SERVICE_GRAY_ARGS", QualityServiceGrayArgs.class) : intent.getParcelableExtra("QUALITY_SERVICE_GRAY_ARGS")), new com.avito.android.cpt.pre_activation.ui.c(this, 22), new com.avito.android.auction.details.i(this, 10), cVar, interfaceC39417aA).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f184038r;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f184038r;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ((NavBar) findViewById(R.id.quality_service_gray_navbar)).c(R.attr.ic_arrowBack24, new b());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.quality_service_gray_list);
        j jVar = this.f184039s;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        RecyclerView.l[] lVarArr = {new C47358d(), new C47356b(), new C47357c(), new C47355a(), new C43697a()};
        for (int i12 = 0; i12 < 5; i12++) {
            recyclerView.l(lVarArr[i12], -1);
        }
        this.f184041u = recyclerView;
        C42670a c42670a = new C42670a((ViewGroup) findViewById(R.id.quality_service_gray_content), new c(), 0, 4, null);
        this.f184042v = c42670a;
        c42670a.a(new com.avito.android.imv_similiar_adverts.h(this, 24));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f184038r;
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.loyalty.ui.quality_service_gray.h) this.f184034n.getValue(), new d(1, this, QualityServiceGrayActivity.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/entity/QualityServiceGrayOneTimeEvent;)V", 0), new e(1, this, QualityServiceGrayActivity.class, "handleState", "handleState(Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/entity/QualityServiceGrayState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f184038r;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
