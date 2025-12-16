package com.avito.android.advert_stats.detail.tab.stats_item_tab;

import Cd.C13243a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert_stats.G;
import com.avito.android.advert_stats.detail.di.r;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.advert_stats.detail.tab.StatsDialogType;
import com.avito.android.advert_stats.detail.tab.items.button.dialogs.HowUnderstandChartDialogFragment;
import com.avito.android.advert_stats.detail.tab.items.button.dialogs.MoreContactsDialogFragment;
import com.avito.android.advert_stats.detail.tab.items.button.dialogs.ResponsesDialogFragment;
import com.avito.android.advert_stats.detail.tab.items.chart.u;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState;
import com.avito.android.analytics.screens.AdvertDetailTabStatisticsScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import eb.InterfaceC40078a;
import eb.InterfaceC40079b;
import fb.C40391b;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: StatsItemTabMviFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/StatsItemTabMviFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatsItemTabMviFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_stats.detail.tab.stats_item_tab.f f86467n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f86468o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f86469p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f86470q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f86471r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f86472s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f86473t0;

    /* renamed from: u0, reason: collision with root package name */
    public C40391b f86474u0;

    /* compiled from: StatsItemTabMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<InterfaceC40079b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC40079b interfaceC40079b) {
            InterfaceC40079b interfaceC40079b2 = interfaceC40079b;
            StatsItemTabMviFragment statsItemTabMviFragment = (StatsItemTabMviFragment) this.receiver;
            statsItemTabMviFragment.getClass();
            if (interfaceC40079b2 instanceof InterfaceC40079b.c) {
                InterfaceC40079b.c cVar = (InterfaceC40079b.c) interfaceC40079b2;
                statsItemTabMviFragment.getParentFragmentManager().o0(C22777e.b(new Q("requestKeyAdvertDetailStatsDateFrom", cVar.f395244a), new Q("requestKeyAdvertDetailStatsTabId", cVar.f395245b)), "requestKeyAdvertDetailStatsMVI");
            } else if (interfaceC40079b2 instanceof InterfaceC40079b.a) {
                DeepLink deepLink = ((InterfaceC40079b.a) interfaceC40079b2).f395242a;
                if (deepLink != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar = statsItemTabMviFragment.f86472s0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, deepLink, null, null, 6);
                }
            } else if (interfaceC40079b2 instanceof InterfaceC40079b.C11091b) {
                StatsDialogType statsDialogType = ((InterfaceC40079b.C11091b) interfaceC40079b2).f395243a;
                if (statsDialogType instanceof StatsDialogType.HowUnderstandChartType) {
                    HowUnderstandChartDialogFragment.a aVar2 = HowUnderstandChartDialogFragment.f86255h0;
                    FragmentManager childFragmentManager = statsItemTabMviFragment.getChildFragmentManager();
                    aVar2.getClass();
                    HowUnderstandChartDialogFragment howUnderstandChartDialogFragment = new HowUnderstandChartDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("KEY_DIALOG_TYPE", (StatsDialogType.HowUnderstandChartType) statsDialogType);
                    howUnderstandChartDialogFragment.setArguments(bundle);
                    howUnderstandChartDialogFragment.show(childFragmentManager, "HowUnderstandChartDialog");
                } else if (statsDialogType.equals(StatsDialogType.b.f86197c)) {
                    MoreContactsDialogFragment.a aVar3 = MoreContactsDialogFragment.f86256h0;
                    FragmentManager childFragmentManager2 = statsItemTabMviFragment.getChildFragmentManager();
                    aVar3.getClass();
                    new MoreContactsDialogFragment().show(childFragmentManager2, "MoreContactsDialog");
                } else if (statsDialogType.equals(StatsDialogType.c.f86198c)) {
                    ResponsesDialogFragment.a aVar4 = ResponsesDialogFragment.f86257h0;
                    FragmentManager childFragmentManager3 = statsItemTabMviFragment.getChildFragmentManager();
                    aVar4.getClass();
                    new ResponsesDialogFragment().show(childFragmentManager3, "MoreResponsesDialog");
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StatsItemTabMviFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<StatsItemTabState, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(StatsItemTabState statsItemTabState) {
            StatsItemTabState statsItemTabState2 = statsItemTabState;
            StatsItemTabMviFragment statsItemTabMviFragment = StatsItemTabMviFragment.this;
            C40391b c40391b = statsItemTabMviFragment.f86474u0;
            if (c40391b == null) {
                c40391b = null;
            }
            c40391b.getClass();
            c40391b.f395970a.c(new UV0.c(statsItemTabState2.f86564b));
            Set<TV0.d<?, ?>> set = statsItemTabMviFragment.f86473t0;
            Iterator<T> it = (set != null ? set : null).iterator();
            while (it.hasNext()) {
                TV0.d dVar = (TV0.d) it.next();
                if (dVar instanceof u) {
                    ((u) dVar).P4(statsItemTabState2.f86566d);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StatsItemTabMviFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "requestKey", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<String, Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f86476l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ StatsItemTabMviFragment f86477m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, StatsItemTabMviFragment statsItemTabMviFragment) {
            super(2);
            this.f86476l = view;
            this.f86477m = statsItemTabMviFragment;
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            com.avito.android.advert_stats.detail.tab.stats_item_tab.a aVar = new com.avito.android.advert_stats.detail.tab.stats_item_tab.a(this.f86477m, bundle);
            View view = this.f86476l;
            view.postDelayed(aVar, 300L);
            view.addOnAttachStateChangeListener(new com.avito.android.advert_stats.detail.tab.stats_item_tab.b(view, aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: StatsItemTabMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leb/a;", "it", "Lkotlin/G0;", "invoke", "(Leb/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<InterfaceC40078a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40078a interfaceC40078a) {
            ((com.avito.android.advert_stats.detail.tab.stats_item_tab.e) StatsItemTabMviFragment.this.f86468o0.getValue()).accept(interfaceC40078a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f86479l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f86479l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f86479l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StatsItemTabMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f86481l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f86481l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f86481l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f86482l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f86482l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f86482l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f86483l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f86483l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f86483l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StatsItemTabMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.advert_stats.detail.tab.stats_item_tab.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.advert_stats.detail.tab.stats_item_tab.e invoke() {
            com.avito.android.advert_stats.detail.tab.stats_item_tab.f fVar = StatsItemTabMviFragment.this.f86467n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.advert_stats.detail.tab.stats_item_tab.e) fVar.get();
        }
    }

    public StatsItemTabMviFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f86468o0 = new O0(m0.f406844a.b(com.avito.android.advert_stats.detail.tab.stats_item_tab.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f86469p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.advert_stats_tab, viewGroup, false);
        com.avito.konveyor.adapter.j jVar = this.f86470q0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f86471r0;
        if (aVar == null) {
            aVar = null;
        }
        this.f86474u0 = new C40391b(viewInflate, aVar, jVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f86469p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.advert_stats.detail.tab.stats_item_tab.e) this.f86468o0.getValue(), new a(1, this, StatsItemTabMviFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabOneTimeEvent;)V", 0), new b());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f86469p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        Bundle arguments = getArguments();
        AdvertDetailStatsTabItem advertDetailStatsTabItemA = Za.f.a(arguments != null ? arguments.getString("advert_tab") : null);
        ((com.avito.android.advert_stats.detail.tab.stats_item_tab.e) this.f86468o0.getValue()).accept(new InterfaceC40078a.e(advertDetailStatsTabItemA));
        StringBuilder sb2 = new StringBuilder("AdvertDetailStatsTab");
        sb2.append(advertDetailStatsTabItemA != null ? advertDetailStatsTabItemA.getTitle() : null);
        C22960s.b(this, sb2.toString(), new c(view, this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.advert_stats.detail.tab.stats_item_tab.di.a.a().a(s.c(this), new C28478k(AdvertDetailTabStatisticsScreen.f90277d, s.c(this), null, 4, null), new d(), (G) requireActivity(), (r) C29972i.a(C29972i.b(this), r.class), cv.c.b(this)).fb(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f86469p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
