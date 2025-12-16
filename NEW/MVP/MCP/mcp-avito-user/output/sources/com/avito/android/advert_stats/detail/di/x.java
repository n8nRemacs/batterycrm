package com.avito.android.advert_stats.detail.di;

import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: AdvertDetailStatsTabModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class x implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_stats.detail.tab.items.funnel.c> f86173a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_stats.detail.tab.items.chart.u> f86174b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_stats.detail.tab.items.button.c> f86175c;

    public x(Provider<com.avito.android.advert_stats.detail.tab.items.funnel.c> provider, Provider<com.avito.android.advert_stats.detail.tab.items.chart.u> provider2, Provider<com.avito.android.advert_stats.detail.tab.items.button.c> provider3) {
        this.f86173a = provider;
        this.f86174b = provider2;
        this.f86175c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_stats.detail.tab.items.funnel.c cVar = this.f86173a.get();
        com.avito.android.advert_stats.detail.tab.items.chart.u uVar = this.f86174b.get();
        com.avito.android.advert_stats.detail.tab.items.button.c cVar2 = this.f86175c.get();
        s.f86157a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{cVar, uVar, cVar2});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
