package com.avito.android.advert_stats.detail.di;

import com.avito.android.advert_stats.detail.tab.items.chart.InterfaceC28315a;
import javax.inject.Provider;

/* compiled from: AdvertDetailStatsPlotModule_ProvideBarItemPresenter$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_stats.detail.di.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28306g implements dagger.internal.h<com.avito.android.advert_stats.detail.tab.items.chart.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_stats.detail.tab.items.chart.r> f86144a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f86145b;

    public C28306g(dagger.internal.u uVar, Provider provider) {
        this.f86144a = provider;
        this.f86145b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_stats.detail.tab.items.chart.r rVar = this.f86144a.get();
        InterfaceC28315a interfaceC28315a = (InterfaceC28315a) this.f86145b.get();
        C28304e.f86142a.getClass();
        return new com.avito.android.advert_stats.detail.tab.items.chart.g(rVar, interfaceC28315a);
    }
}
