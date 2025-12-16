package com.avito.android.advert_stats.detail.di;

import javax.inject.Provider;

/* compiled from: AdvertDetailStatsPlotModule_ProvidePeriodItemBlueprint$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_stats.detail.di.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28312m implements dagger.internal.h<com.avito.android.advert_stats.detail.tab.items.chart.l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_stats.detail.tab.items.chart.m> f86150a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f86151b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f86152c;

    public C28312m(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f86150a = provider;
        this.f86151b = uVar;
        this.f86152c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_stats.detail.tab.items.chart.m mVar = this.f86150a.get();
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f86151b.get();
        com.avito.konveyor.a aVar2 = this.f86152c.get();
        C28304e.f86142a.getClass();
        return new com.avito.android.advert_stats.detail.tab.items.chart.l(mVar, aVar, aVar2);
    }
}
