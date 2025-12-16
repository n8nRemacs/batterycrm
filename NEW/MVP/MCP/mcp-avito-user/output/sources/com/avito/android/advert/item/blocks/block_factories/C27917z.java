package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAvitoForBusinessBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27917z implements dagger.internal.h<C27913y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.J> f73687a;

    public C27917z(Provider<com.avito.android.advert.item.blocks.items_factories.J> provider) {
        this.f73687a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27913y(this.f73687a.get());
    }
}
