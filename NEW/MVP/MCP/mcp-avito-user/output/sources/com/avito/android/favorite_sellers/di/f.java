package com.avito.android.favorite_sellers.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteSellersModule_ProvideAdapterPresenter$_avito_favorite_sellers_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.responsive.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f155874a;

    /* renamed from: b, reason: collision with root package name */
    public final u f155875b;

    public f(u uVar, Provider provider) {
        this.f155874a = provider;
        this.f155875b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f155874a.get();
        com.avito.android.recycler.responsive.a aVar2 = (com.avito.android.recycler.responsive.a) this.f155875b.get();
        d dVar = d.f155872a;
        return new com.avito.android.recycler.responsive.f(aVar, aVar2);
    }
}
