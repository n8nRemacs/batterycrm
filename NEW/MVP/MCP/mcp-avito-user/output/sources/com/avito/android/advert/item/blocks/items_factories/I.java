package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAutotekaTeaserItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73769a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f73770b;

    public I(dagger.internal.l lVar, Provider provider) {
        this.f73769a = provider;
        this.f73770b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f73769a.get(), (String) this.f73770b.f393949a);
    }
}
