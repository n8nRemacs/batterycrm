package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDescriptionItemFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Q0 implements dagger.internal.h<P0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f73836a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73837b;

    public Q0(Provider<com.avito.android.J0> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73836a = provider;
        this.f73837b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new P0(this.f73836a.get(), this.f73837b.get());
    }
}
