package com.avito.android.advert_stats.detail.di;

import javax.inject.Provider;

/* compiled from: AdvertDetailStatsTabModule_ProvideDataAwareAdapterPresenterImpl$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f86159a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f86160b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f86161c;

    public u(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f86159a = provider;
        this.f86160b = provider2;
        this.f86161c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f86159a);
        com.avito.konveyor.adapter.h hVar = this.f86160b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f86161c.get();
        s.f86157a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
