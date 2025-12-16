package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSxAddressesItemFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.c5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27941c5 implements dagger.internal.h<C27934b5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f73931a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73932b;

    public C27941c5(Provider<com.avito.android.J0> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73931a = provider;
        this.f73932b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27934b5(this.f73931a.get(), this.f73932b.get());
    }
}
