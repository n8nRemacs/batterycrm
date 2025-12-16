package com.avito.android.advert_stats.detail.advertdetailstatsmvi;

import Y41.l;
import Y61.k;
import ab.InterfaceC19855a;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advert_stats.detail.tab.OneStatsTabItem;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.ui.SafeViewPager;
import com.google.android.material.tabs.TabLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailStatsMVIView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/e;", "", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f86076a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC19855a, G0> f86077b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TabLayout f86078c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SafeViewPager f86079d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.progress_overlay.l f86080e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k<OneStatsTabItem> f86081f;

    /* compiled from: AdvertDetailStatsMVIView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e.this.f86077b.invoke(InterfaceC19855a.f.f21004a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k View view, @k InterfaceC28373a interfaceC28373a, @k l<? super InterfaceC19855a, G0> lVar) {
        this.f86076a = interfaceC28373a;
        this.f86077b = lVar;
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.advert_detail_stats_tabs);
        this.f86078c = tabLayout;
        SafeViewPager safeViewPager = (SafeViewPager) view.findViewById(R.id.advert_detail_stats_view_pager);
        this.f86079d = safeViewPager;
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.advert_detail_stats_content), R.id.advert_detail_stats_view_pager, interfaceC28373a, 0, 0, 24, null);
        this.f86080e = lVar2;
        com.avito.android.lib.deprecated_design.tab.adapter.k<OneStatsTabItem> kVar = new com.avito.android.lib.deprecated_design.tab.adapter.k<>();
        this.f86081f = kVar;
        com.avito.android.lib.deprecated_design.tab.l.e(tabLayout, new com.avito.android.lib.deprecated_design.tab.c(kVar, tabLayout.getContext(), R.layout.tab_shortcut));
        tabLayout.setupWithViewPager(safeViewPager);
        tabLayout.a(new g(this));
        lVar2.e().t0(new a());
    }
}
