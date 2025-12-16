package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAnchorTrustFactorsBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class r implements dagger.internal.h<C27882q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.A> f73646a;

    public r(Provider<com.avito.android.advert.item.blocks.items_factories.A> provider) {
        this.f73646a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27882q(this.f73646a.get());
    }
}
