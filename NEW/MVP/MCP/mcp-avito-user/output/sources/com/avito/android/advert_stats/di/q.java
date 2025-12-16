package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.item.C28332k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: AdvertStatsModule_ProvideStatsItemBinder$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class q implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C28332k> f86593a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_stats.item.title.c f86594b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert_stats.item.period.c f86595c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.advert_stats.item.details.c f86596d;

    public q(Provider provider, com.avito.android.advert_stats.item.title.c cVar, com.avito.android.advert_stats.item.period.c cVar2, com.avito.android.advert_stats.item.details.c cVar3) {
        this.f86593a = provider;
        this.f86594b = cVar;
        this.f86595c = cVar2;
        this.f86596d = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C28332k c28332k = this.f86593a.get();
        com.avito.android.advert_stats.item.title.b bVar = (com.avito.android.advert_stats.item.title.b) this.f86594b.get();
        com.avito.android.advert_stats.item.period.b bVar2 = (com.avito.android.advert_stats.item.period.b) this.f86595c.get();
        com.avito.android.advert_stats.item.details.b bVar3 = (com.avito.android.advert_stats.item.details.b) this.f86596d.get();
        e.f86574a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c28332k);
        c10493a.b(bVar);
        c10493a.b(bVar3);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
