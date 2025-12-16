package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.item.P;
import com.avito.android.advert_stats.item.T;
import javax.inject.Provider;

/* compiled from: AdvertStatsModule_ProvideWeekItemBlueprint$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class v implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<T> f86602a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f86603b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f86604c;

    public v(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f86602a = provider;
        this.f86603b = uVar;
        this.f86604c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T t12 = this.f86602a.get();
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f86603b.get();
        com.avito.konveyor.a aVar2 = this.f86604c.get();
        e.f86574a.getClass();
        return new P(t12, aVar, aVar2);
    }
}
