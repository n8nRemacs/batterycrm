package com.avito.android.loyalty.ui.criteria;

import Cd.C13243a;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.LoyaltyCriteriaScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.loyalty.di.criteria.a;
import com.avito.android.loyalty.ui.criteria.CriteriaTabsInfo;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35974x2;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import cv.InterfaceC39417a;
import iX.AbstractC41357c;
import iX.InterfaceC41355a;
import iX.InterfaceC41356b;
import java.util.ArrayList;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: CriteriaActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/CriteriaActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CriteriaActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f183403x = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public k f183404m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f183405n = new O0(m0.f406844a.b(j.class), new f(), new e(new h()), new g());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f183406o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f183407p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public L f183408q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f183409r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.tab.adapter.j<CommonTab> f183410s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.tab.adapter.c<CommonTab> f183411t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f183412u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f183413v;

    /* renamed from: w, reason: collision with root package name */
    public com.avito.android.loyalty.ui.criteria.g f183414w;

    /* compiled from: CriteriaActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/CriteriaActivity$a;", "", "<init>", "()V", "", "CRITERIA_ARGS", "Ljava/lang/String;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CriteriaActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC41355a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC41355a interfaceC41355a) {
            ((j) this.receiver).accept(interfaceC41355a);
            return G0.f406611a;
        }
    }

    /* compiled from: CriteriaActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC41356b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC41356b interfaceC41356b) {
            InterfaceC41356b interfaceC41356b2 = interfaceC41356b;
            CriteriaActivity criteriaActivity = (CriteriaActivity) this.receiver;
            int i12 = CriteriaActivity.f183403x;
            criteriaActivity.getClass();
            if (interfaceC41356b2 instanceof InterfaceC41356b.c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = criteriaActivity.f183407p;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, ((InterfaceC41356b.c) interfaceC41356b2).f398539a, null, null, 6);
            } else if (interfaceC41356b2 instanceof InterfaceC41356b.d) {
                InterfaceC41356b.d dVar = (InterfaceC41356b.d) interfaceC41356b2;
                InterfaceC35845m2 interfaceC35845m2 = criteriaActivity.f183409r;
                Intent intentU = (interfaceC35845m2 != null ? interfaceC35845m2 : null).u(Uri.parse(dVar.f398540a), (6 & 2) == 0, (6 & 4) == 0);
                C35974x2.d(intentU);
                try {
                    criteriaActivity.startActivity(intentU);
                } catch (Exception unused) {
                    L5.a(criteriaActivity, R.string.no_application_installed_to_perform_this_action, 0);
                }
            } else if (interfaceC41356b2 instanceof InterfaceC41356b.C11380b) {
                L l12 = criteriaActivity.f183408q;
                if (l12 == null) {
                    l12 = null;
                }
                Intent intentA = L.a.a(l12, null, 3);
                intentA.addFlags(268468224);
                criteriaActivity.startActivity(intentA);
                criteriaActivity.finish();
            } else if (interfaceC41356b2 instanceof InterfaceC41356b.a) {
                criteriaActivity.onBackPressed();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CriteriaActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LiX/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LiX/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<AbstractC41357c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC41357c abstractC41357c) {
            AbstractC41357c abstractC41357c2 = abstractC41357c;
            com.avito.android.loyalty.ui.criteria.g gVar = CriteriaActivity.this.f183414w;
            if (gVar == null) {
                gVar = null;
            }
            gVar.getClass();
            boolean z12 = abstractC41357c2 instanceof AbstractC41357c.e;
            C42670a c42670a = gVar.f183461e;
            if (z12) {
                c42670a.b();
                CriteriaTabsInfo criteriaTabsInfo = ((AbstractC41357c.e) abstractC41357c2).f398546d;
                gVar.f183464h.setText(criteriaTabsInfo.f183424a);
                CriteriaTabsInfo.a aVar = criteriaTabsInfo.f183425b;
                String str = aVar.f183434a;
                ArrayList arrayList = aVar.f183435b;
                String str2 = criteriaTabsInfo.f183428e;
                ArrayList arrayListE0 = C42745f0.e0(new com.avito.android.loyalty.ui.criteria.items.tab.a(str, arrayList, str2));
                int i12 = 1;
                CriteriaTabsInfo.a aVar2 = criteriaTabsInfo.f183426c;
                boolean z13 = aVar2 != null;
                AvitoTabLayout avitoTabLayout = gVar.f183462f;
                D6.G(avitoTabLayout, z13);
                if (aVar2 != null) {
                    CommonTab commonTab = new CommonTab(aVar.f183434a, null, 2, null);
                    String str3 = aVar2.f183434a;
                    gVar.f183457a.E5(C42745f0.U(commonTab, new CommonTab(str3, null, 2, null)));
                    arrayListE0.add(new com.avito.android.loyalty.ui.criteria.items.tab.a(str3, aVar2.f183435b, str2));
                    com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> gVarC = com.avito.android.lib.deprecated_design.tab.l.c(avitoTabLayout);
                    if (gVarC != null) {
                        gVarC.d();
                    }
                }
                com.avito.konveyor.util.a.a(gVar.f183459c, arrayListE0);
                int iOrdinal = criteriaTabsInfo.f183427d.ordinal();
                if (iOrdinal == 0) {
                    i12 = 0;
                } else if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewPager2 viewPager2 = gVar.f183463g;
                if (viewPager2.getCurrentItem() != i12) {
                    viewPager2.g(i12, false);
                }
            } else if (abstractC41357c2 instanceof AbstractC41357c.d) {
                C42670a.d(c42670a);
            } else if (abstractC41357c2 instanceof AbstractC41357c.b) {
                c42670a.c(null, i.f183468l);
            } else if (abstractC41357c2 instanceof AbstractC41357c.C11381c) {
                c42670a.c(null, com.avito.android.loyalty.ui.criteria.h.f183467l);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f183416l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f183416l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f183416l);
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
            return CriteriaActivity.this.getF42820b();
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
            return CriteriaActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: CriteriaActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/loyalty/ui/criteria/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<j> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() {
            k kVar = CriteriaActivity.this.f183404m;
            if (kVar == null) {
                kVar = null;
            }
            return (j) kVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_criteria;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC5367a interfaceC5367aA = com.avito.android.loyalty.di.criteria.i.a();
        C28478k c28478k = new C28478k(LoyaltyCriteriaScreen.f90401d, s.a(this), "loyalty-criteria");
        com.avito.android.loyalty.di.criteria.b bVar = (com.avito.android.loyalty.di.criteria.b) C29972i.a(C29972i.b(this), com.avito.android.loyalty.di.criteria.b.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        com.avito.android.loyalty.ui.criteria.a aVar = new com.avito.android.loyalty.ui.criteria.a(this, 0);
        com.avito.android.cpt.pre_activation.ui.c cVar = new com.avito.android.cpt.pre_activation.ui.c(this, 17);
        com.avito.android.auction.details.i iVar = new com.avito.android.auction.details.i(this, 8);
        Intent intent = getIntent();
        interfaceC5367aA.a(c28478k, aVar, this, cVar, iVar, (CriteriaArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("CRITERIA_ARGS", CriteriaArgs.class) : intent.getParcelableExtra("CRITERIA_ARGS")), interfaceC39417aA, bVar).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183406o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183406o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewK1 = K1();
        com.avito.android.lib.deprecated_design.tab.adapter.j<CommonTab> jVar = this.f183410s;
        com.avito.android.lib.deprecated_design.tab.adapter.j<CommonTab> jVar2 = jVar != null ? jVar : null;
        com.avito.android.lib.deprecated_design.tab.adapter.c<CommonTab> cVar = this.f183411t;
        com.avito.android.lib.deprecated_design.tab.adapter.c<CommonTab> cVar2 = cVar != null ? cVar : null;
        O0 o02 = this.f183405n;
        b bVar = new b(1, (j) o02.getValue(), j.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        com.avito.konveyor.adapter.j jVar3 = this.f183412u;
        com.avito.konveyor.adapter.j jVar4 = jVar3 != null ? jVar3 : null;
        com.avito.konveyor.adapter.a aVar = this.f183413v;
        this.f183414w = new com.avito.android.loyalty.ui.criteria.g(viewK1, jVar2, cVar2, bVar, jVar4, aVar != null ? aVar : null);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f183406o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (j) o02.getValue(), new c(1, this, CriteriaActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaOneTimeEvent;)V", 0), new d());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f183406o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
