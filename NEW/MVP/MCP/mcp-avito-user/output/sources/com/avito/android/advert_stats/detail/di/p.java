package com.avito.android.advert_stats.detail.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: AdvertDetailStatsPlotModule_ProvideStatsPeriodItemBinder$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class p implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f86156a;

    public p(dagger.internal.u uVar) {
        this.f86156a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_stats.detail.tab.items.chart.l lVar = (com.avito.android.advert_stats.detail.tab.items.chart.l) this.f86156a.get();
        C28304e.f86142a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(lVar);
        return c10493a.a();
    }
}
