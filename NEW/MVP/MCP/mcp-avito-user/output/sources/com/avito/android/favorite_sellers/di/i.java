package com.avito.android.favorite_sellers.di;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteSellersModule_ProvideDestroyableViewHolderBuilder$_avito_favorite_sellers_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f155878a;

    public i(Provider<com.avito.konveyor.a> provider) {
        this.f155878a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f155878a.get();
        d dVar = d.f155872a;
        return new C14699c(aVar);
    }
}
