package com.avito.android.advert_stats.detail.tab.items.chart;

import javax.inject.Provider;

/* compiled from: StatsPlotBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u> f86336a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f86337b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f86338c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<r> f86339d;

    public q(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f86336a = provider;
        this.f86337b = provider2;
        this.f86338c = uVar;
        this.f86339d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f86336a.get(), this.f86337b.get(), (com.avito.konveyor.adapter.a) this.f86338c.get(), this.f86339d.get());
    }
}
