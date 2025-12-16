package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSellerSubscriptionItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.t4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28055t4 implements dagger.internal.h<C28049s4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74033a;

    public C28055t4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74033a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28049s4(this.f74033a.get());
    }
}
