package com.avito.android.advert_stats.detail.tab;

import Y61.k;
import android.os.Bundle;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.StatsFavoriteTabMviFragment;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.StatsItemTabMviFragment;
import kotlin.Metadata;

/* compiled from: AdvertDetailStatsPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/d;", "Landroidx/fragment/app/F;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends F {

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<OneStatsTabItem> f86199j;

    public d(@k FragmentManager fragmentManager, @k com.avito.android.lib.deprecated_design.tab.adapter.j<OneStatsTabItem> jVar) {
        super(fragmentManager, 1);
        this.f86199j = jVar;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f86199j.getCount();
    }

    @Override // androidx.viewpager.widget.a
    @k
    public final CharSequence e(int i12) {
        return this.f86199j.getItem(i12).f86187d;
    }

    @Override // androidx.fragment.app.F
    @k
    public final Fragment o(int i12) {
        OneStatsTabItem item = this.f86199j.getItem(i12);
        boolean z12 = item.f86190g;
        String str = item.f86187d;
        if (z12) {
            StatsFavoriteTabMviFragment statsFavoriteTabMviFragment = new StatsFavoriteTabMviFragment();
            Bundle bundle = new Bundle();
            bundle.putString("advert_tab", str);
            statsFavoriteTabMviFragment.setArguments(bundle);
            return statsFavoriteTabMviFragment;
        }
        StatsItemTabMviFragment statsItemTabMviFragment = new StatsItemTabMviFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("advert_tab", str);
        statsItemTabMviFragment.setArguments(bundle2);
        return statsItemTabMviFragment;
    }
}
