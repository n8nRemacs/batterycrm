package com.avito.android.favorite_sellers.adapter.advert_list;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f155526a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.favorite_sellers.adapter.advert_list.di.b f155527b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.favorite_sellers.adapter.advert_list.di.c f155528c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.favorite_sellers.adapter.advert_list.di.f f155529d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f155530e;

    public c(Provider provider, com.avito.android.favorite_sellers.adapter.advert_list.di.b bVar, com.avito.android.favorite_sellers.adapter.advert_list.di.c cVar, com.avito.android.favorite_sellers.adapter.advert_list.di.f fVar, Provider provider2) {
        this.f155526a = provider;
        this.f155527b = bVar;
        this.f155528c = cVar;
        this.f155529d = fVar;
        this.f155530e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f155526a.get();
        com.avito.konveyor.a aVar = this.f155530e.get();
        return new b(dVar, this.f155527b, this.f155528c, this.f155529d, aVar);
    }
}
