package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAddressItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28056u implements dagger.internal.h<C28050t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74035a;

    public C28056u(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74035a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28050t(this.f74035a.get());
    }
}
