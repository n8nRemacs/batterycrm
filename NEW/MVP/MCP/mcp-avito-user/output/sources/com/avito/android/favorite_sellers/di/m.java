package com.avito.android.favorite_sellers.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteSellersModule_ProvideItemPresenterRegistry$_avito_favorite_sellers_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<com.avito.android.recycler.responsive.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.favorite_sellers.adapter.advert_list.d> f155882a;

    public m(Provider<com.avito.android.favorite_sellers.adapter.advert_list.d> provider) {
        this.f155882a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.favorite_sellers.adapter.advert_list.d dVar = this.f155882a.get();
        d dVar2 = d.f155872a;
        com.avito.android.recycler.responsive.b bVar = new com.avito.android.recycler.responsive.b();
        bVar.d(dVar);
        return bVar;
    }
}
