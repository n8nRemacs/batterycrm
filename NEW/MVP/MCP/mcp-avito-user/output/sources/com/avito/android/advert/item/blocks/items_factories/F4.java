package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesTitleItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class F4 implements dagger.internal.h<E4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73748a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73749b;

    public F4(Provider<com.avito.android.advert.item.similars.j> provider, Provider<com.avito.android.B2> provider2) {
        this.f73748a = provider;
        this.f73749b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E4(this.f73749b.get(), this.f73748a.get());
    }
}
