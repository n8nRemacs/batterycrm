package com.avito.android.advert_stats.detail.tab.items.chart;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.util.L0;
import kotlin.Metadata;

/* compiled from: StatsPlotDimensionsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/s;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/r;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L0 f86340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86342c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86343d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86344e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86345f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86346g;

    public s(@Y61.k Resources resources, @Y61.k L0 l02) throws Resources.NotFoundException {
        this.f86340a = l02;
        this.f86341b = resources.getDimensionPixelSize(R.dimen.start_gap);
        this.f86342c = resources.getDimensionPixelSize(R.dimen.gap_between_bars_small);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.recycler_top_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.bar_bottom_margin);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.shadow_padding);
        int iMax = (Math.max(l02.c(), l02.d()) * 34) / 100;
        this.f86343d = iMax;
        this.f86344e = ((iMax - dimensionPixelSize) - dimensionPixelSize3) - dimensionPixelSize2;
        this.f86345f = resources.getDimensionPixelSize(R.dimen.bar_min_height);
        this.f86346g = resources.getDimensionPixelSize(R.dimen.empty_bar_height);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.r
    public final int a() {
        int i12 = this.f86342c * 14;
        return ((this.f86340a.c() - i12) - (d() * 7)) / 2;
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.r
    /* renamed from: b, reason: from getter */
    public final int getF86344e() {
        return this.f86344e;
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.r
    /* renamed from: c, reason: from getter */
    public final int getF86346g() {
        return this.f86346g;
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.r
    public final int d() {
        int i12 = this.f86342c;
        int iC2 = ((this.f86340a.c() - (i12 * 14)) - ((i12 * 2) + (this.f86341b * 2))) / 7;
        return iC2 % 2 == 0 ? iC2 : iC2 - 1;
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.r
    /* renamed from: e, reason: from getter */
    public final int getF86345f() {
        return this.f86345f;
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.r
    /* renamed from: f, reason: from getter */
    public final int getF86343d() {
        return this.f86343d;
    }
}
