package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsEarlyAccessAdvertItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.l1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28000l1 implements dagger.internal.h<C27993k1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73984a;

    public C28000l1(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73984a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27993k1(this.f73984a.get());
    }
}
