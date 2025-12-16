package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsCreditBrokerLinkBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27855j0 implements dagger.internal.h<C27851i0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.C0> f73588a;

    public C27855j0(Provider<com.avito.android.advert.item.blocks.items_factories.C0> provider) {
        this.f73588a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27851i0(this.f73588a.get());
    }
}
