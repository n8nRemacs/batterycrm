package com.avito.android.advert_stats.detail.di;

import android.content.res.Resources;
import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: AdvertDetailStatsPlotModule_ProvidePlotDimensProvider$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_stats.detail.di.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28314o implements dagger.internal.h<com.avito.android.advert_stats.detail.tab.items.chart.r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f86154a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L0> f86155b;

    public C28314o(Provider<Resources> provider, Provider<L0> provider2) {
        this.f86154a = provider;
        this.f86155b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = this.f86154a.get();
        L0 l02 = this.f86155b.get();
        C28304e.f86142a.getClass();
        return new com.avito.android.advert_stats.detail.tab.items.chart.s(resources, l02);
    }
}
