package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesWorkTimeItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class O4 implements dagger.internal.h<N4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73824a;

    public O4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73824a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N4(this.f73824a.get());
    }
}
