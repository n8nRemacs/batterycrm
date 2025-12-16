package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite;

import Cd.r;
import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.internal.G;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cb.InterfaceC27155a;
import cb.InterfaceC27156b;
import com.avito.android.R;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.c;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: StatsFavoriteTabMviFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/StatsFavoriteTabMviFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatsFavoriteTabMviFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public c.a f86200n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f86201o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f86202p0;

    /* renamed from: q0, reason: collision with root package name */
    public TextView f86203q0;

    /* renamed from: r0, reason: collision with root package name */
    public TextView f86204r0;

    /* renamed from: s0, reason: collision with root package name */
    public TextView f86205s0;

    /* compiled from: StatsFavoriteTabMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcb/b;", "it", "Lkotlin/G0;", "invoke", "(Lcb/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<InterfaceC27156b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f86206l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC27156b interfaceC27156b) {
            return G0.f406611a;
        }
    }

    /* compiled from: StatsFavoriteTabMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<MviFavoriteState, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(MviFavoriteState mviFavoriteState) {
            MviFavoriteState mviFavoriteState2 = mviFavoriteState;
            StatsFavoriteTabMviFragment statsFavoriteTabMviFragment = StatsFavoriteTabMviFragment.this;
            TextView textView = statsFavoriteTabMviFragment.f86203q0;
            if (textView == null) {
                textView = null;
            }
            textView.setText(mviFavoriteState2.f86236b);
            TextView textView2 = statsFavoriteTabMviFragment.f86204r0;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(mviFavoriteState2.f86237c);
            TextView textView3 = statsFavoriteTabMviFragment.f86205s0;
            (textView3 != null ? textView3 : null).setText(mviFavoriteState2.f86238d);
            return G0.f406611a;
        }
    }

    /* compiled from: StatsFavoriteTabMviFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<String, Bundle, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            ((com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.c) StatsFavoriteTabMviFragment.this.f86201o0.getValue()).accept(new InterfaceC27155a.C2048a(bundle.getLong("requestKeyLastDate")));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f86210m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar) {
            super(0);
            this.f86210m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(StatsFavoriteTabMviFragment.this, this.f86210m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StatsFavoriteTabMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f86212l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f86212l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f86212l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f86213l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f86213l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f86213l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f86214l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f86214l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f86214l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StatsFavoriteTabMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/c;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements l<C23060r0, com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.c> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.c invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            c.a aVar = StatsFavoriteTabMviFragment.this.f86200n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public StatsFavoriteTabMviFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f86201o0 = new O0(m0.f406844a.b(com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.c.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f86202p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        Bundle arguments = getArguments();
        AdvertDetailStatsTabItem advertDetailStatsTabItemA = Za.f.a(arguments != null ? arguments.getString("advert_tab") : null);
        O0 o02 = this.f86201o0;
        ((com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.c) o02.getValue()).accept(new InterfaceC27155a.b(advertDetailStatsTabItemA));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f86202p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.c) o02.getValue(), a.f86206l, new b());
        return layoutInflater.inflate(R.layout.advert_favorite_stats_tab, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86203q0 = (TextView) view.findViewById(R.id.tv_advert_favorite_count);
        this.f86204r0 = (TextView) view.findViewById(R.id.tv_advert_favorite_count_text);
        this.f86205s0 = (TextView) view.findViewById(R.id.tv_advert_favorite_description);
        ScreenPerformanceTracker screenPerformanceTracker = this.f86202p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        C22960s.b(this, G.f("AdvertDetailStatsTab", arguments != null ? arguments.getString("advert_tab") : null), new c());
        com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.di.a.a().a(this, s.c(this), new C28478k(StatsTabFavoriteScreen.f86216d, s.c(this), null, 4, null), (com.avito.android.advert_stats.detail.di.r) C29972i.a(C29972i.b(this), com.avito.android.advert_stats.detail.di.r.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f86202p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }
}
