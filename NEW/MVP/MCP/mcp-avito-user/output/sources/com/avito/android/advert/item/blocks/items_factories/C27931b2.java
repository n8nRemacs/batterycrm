package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsHeaderItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.b2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27931b2 implements dagger.internal.h<C27924a2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73922a;

    public C27931b2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73922a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27924a2(this.f73922a.get());
    }
}
