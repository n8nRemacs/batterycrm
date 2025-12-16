package com.avito.android.advert_stats.item;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.util.L0;
import kotlin.Metadata;

/* compiled from: PlotDimensionsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/m;", "Lcom/avito/android/advert_stats/item/l;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_stats.item.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28334m implements InterfaceC28333l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L0 f86772a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86773b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86774c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86775d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86776e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86777f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86778g;

    public C28334m(@Y61.k Resources resources, @Y61.k L0 l02) throws Resources.NotFoundException {
        this.f86772a = l02;
        this.f86773b = resources.getDimensionPixelSize(R.dimen.start_gap);
        this.f86774c = resources.getDimensionPixelSize(R.dimen.gap_between_bars_small);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.recycler_top_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.recycler_bottom_padding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.bar_bottom_margin);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.text_area);
        int iMax = (Math.max(l02.c(), l02.d()) * 34) / 100;
        this.f86775d = iMax;
        this.f86776e = (((iMax - dimensionPixelSize) - dimensionPixelSize2) - dimensionPixelSize4) - dimensionPixelSize3;
        this.f86777f = resources.getDimensionPixelSize(R.dimen.bar_min_height);
        this.f86778g = resources.getDimensionPixelSize(R.dimen.empty_bar_height);
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28333l
    public final int a() {
        int i12 = this.f86774c * 14;
        return ((this.f86772a.c() - i12) - (d() * 7)) / 2;
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28333l
    /* renamed from: b, reason: from getter */
    public final int getF86776e() {
        return this.f86776e;
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28333l
    /* renamed from: c, reason: from getter */
    public final int getF86778g() {
        return this.f86778g;
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28333l
    public final int d() {
        int i12 = this.f86774c;
        int iC2 = ((this.f86772a.c() - (i12 * 14)) - ((i12 * 2) + (this.f86773b * 2))) / 7;
        return iC2 % 2 == 0 ? iC2 : iC2 - 1;
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28333l
    /* renamed from: e, reason: from getter */
    public final int getF86777f() {
        return this.f86777f;
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28333l
    /* renamed from: f, reason: from getter */
    public final int getF86775d() {
        return this.f86775d;
    }
}
