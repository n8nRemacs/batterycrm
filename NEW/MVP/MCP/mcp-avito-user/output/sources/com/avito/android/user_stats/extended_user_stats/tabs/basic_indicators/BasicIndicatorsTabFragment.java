package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C22960s;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BasicIndicatorsTabFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/BasicIndicatorsTabFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BasicIndicatorsTabFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f317341v0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f317342n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public i f317343o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f317344p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f317345q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public SK0.b f317346r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f317347s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f317348t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f317349u0;

    /* compiled from: BasicIndicatorsTabFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/BasicIndicatorsTabFragment$a;", "", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BasicIndicatorsTabFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i iVar = BasicIndicatorsTabFragment.this.f317343o0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.ke();
        }
    }

    /* compiled from: BasicIndicatorsTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            i iVar = BasicIndicatorsTabFragment.this.f317343o0;
            if (iVar == null) {
                iVar = null;
            }
            b.a.a(iVar.f13676E, deepLink, null, null, 6);
        }
    }

    /* compiled from: BasicIndicatorsTabFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<String, Bundle, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Parcelable parcelable = bundle.getParcelable("requestConfig");
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            StatsConfig statsConfig = (StatsConfig) parcelable;
            i iVar = BasicIndicatorsTabFragment.this.f317343o0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.f13678K = statsConfig;
            iVar.ke();
            return G0.f406611a;
        }
    }

    /* compiled from: BasicIndicatorsTabFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f317353b;

        public e(Y41.l lVar) {
            this.f317353b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f317353b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f317353b;
        }

        public final int hashCode() {
            return this.f317353b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f317353b.invoke(obj);
        }
    }

    public BasicIndicatorsTabFragment() {
        super(0, 1, null);
        this.f317349u0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.user_stats_fragment_tab, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SK0.b bVar = this.f317346r0;
        if (bVar == null) {
            bVar = null;
        }
        dK0.h.a(bVar, "gen-stat_main-tab");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f317344p0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f317347s0;
        if (aVar == null) {
            aVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f317342n0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        g gVar = new g(view, jVar, aVar, interfaceC28373a);
        io.reactivex.rxjava3.disposables.d dVarT0 = gVar.f317416e.t0(new b());
        io.reactivex.rxjava3.disposables.c cVar = this.f317349u0;
        cVar.b(dVarT0);
        cVar.b(gVar.f317418g.t0(new c()));
        i iVar = this.f317343o0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.f317425Q.observe(getViewLifecycleOwner(), new e(new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.e(gVar, this)));
        Set<TV0.d<?, ?>> set = this.f317345q0;
        if (set == null) {
            set = null;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.f) {
                i iVar2 = this.f317343o0;
                if (iVar2 == null) {
                    iVar2 = null;
                }
                com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.f fVar = (com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.f) dVar;
                iVar2.f13677J.b(fVar.getF317476b().j0(iVar2.f317421M.e()).t0(new m(iVar2)));
                i iVar3 = this.f317343o0;
                if (iVar3 == null) {
                    iVar3 = null;
                }
                iVar3.f13677J.b(fVar.getF317477c().j0(iVar3.f317421M.e()).t0(new n(iVar3)));
            } else if (dVar instanceof com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.e) {
                i iVar4 = this.f317343o0;
                if (iVar4 == null) {
                    iVar4 = null;
                }
                iVar4.f13677J.b(((com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.e) dVar).getF317494b().j0(iVar4.f317421M.e()).t0(new m(iVar4)));
            }
        }
        C22960s.b(this, "requestKeyIndicator", new d());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di.l.a().a(cv.c.b(this), getResources(), s.c(this), this, (com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di.b) C29972i.a(C29972i.b(this), com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di.b.class)).a(this);
    }
}
