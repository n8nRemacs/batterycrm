package com.avito.android.advert_stats.detail.di;

import com.avito.android.advert_stats.detail.tab.items.chart.InterfaceC28315a;
import javax.inject.Provider;

/* compiled from: AdvertDetailStatsPlotModule_ProvideOnBarItemClickListener$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_stats.detail.di.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28310k implements dagger.internal.h<InterfaceC28315a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_stats.detail.tab.items.chart.u> f86148a;

    public C28310k(Provider<com.avito.android.advert_stats.detail.tab.items.chart.u> provider) {
        this.f86148a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_stats.detail.tab.items.chart.u uVar = this.f86148a.get();
        C28304e.f86142a.getClass();
        return uVar;
    }
}
