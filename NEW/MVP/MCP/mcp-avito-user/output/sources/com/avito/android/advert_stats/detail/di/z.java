package com.avito.android.advert_stats.detail.di;

import javax.inject.Provider;

/* compiled from: AdvertDetailStatsTabModule_ProvideRecyclerAdapter$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class z implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f86177a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f86178b;

    public z(dagger.internal.u uVar, Provider provider) {
        this.f86177a = uVar;
        this.f86178b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f86177a.get();
        com.avito.konveyor.a aVar2 = this.f86178b.get();
        s.f86157a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
