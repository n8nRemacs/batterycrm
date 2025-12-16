package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsGeoReferenceItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class S1 implements dagger.internal.h<R1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73851a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f73852b;

    public S1(dagger.internal.u uVar, Provider provider) {
        this.f73851a = provider;
        this.f73852b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new R1(this.f73851a.get(), (com.avito.android.advert_core.blocks.h) this.f73852b.get());
    }
}
