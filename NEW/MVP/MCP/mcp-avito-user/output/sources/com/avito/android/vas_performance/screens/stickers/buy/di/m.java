package com.avito.android.vas_performance.screens.stickers.buy.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickersBuyListModule_ProvideSimpleRecyclerAdapter$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f320653a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f320654b;

    public m(Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.a> provider2) {
        this.f320653a = provider;
        this.f320654b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f320653a.get();
        com.avito.konveyor.a aVar2 = this.f320654b.get();
        j.f320647a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
