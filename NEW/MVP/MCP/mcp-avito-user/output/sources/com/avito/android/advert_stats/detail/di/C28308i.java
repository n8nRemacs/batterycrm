package com.avito.android.advert_stats.detail.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: AdvertDetailStatsPlotModule_ProvideChartSectionItemBinder$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_stats.detail.di.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28308i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f86147a;

    public C28308i(dagger.internal.u uVar) {
        this.f86147a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_stats.detail.tab.items.chart.e eVar = (com.avito.android.advert_stats.detail.tab.items.chart.e) this.f86147a.get();
        C28304e.f86142a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(eVar);
        return c10493a.a();
    }
}
