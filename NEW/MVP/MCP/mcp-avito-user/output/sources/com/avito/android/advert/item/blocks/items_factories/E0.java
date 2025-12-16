package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsCreditBrokerLinkItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class E0 implements dagger.internal.h<D0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.credits.q> f73734a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73735b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Boolean> f73736c;

    public E0(Provider<com.avito.android.credits.q> provider, Provider<com.avito.android.advert.item.similars.j> provider2, Provider<Boolean> provider3) {
        this.f73734a = provider;
        this.f73735b = provider2;
        this.f73736c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D0(this.f73734a.get(), this.f73735b.get(), this.f73736c.get().booleanValue());
    }
}
