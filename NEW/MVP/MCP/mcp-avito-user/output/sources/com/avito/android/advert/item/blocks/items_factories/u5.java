package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: GarageCompatibilityV3ItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class u5 implements dagger.internal.h<t5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74039a;

    public u5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74039a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t5(this.f74039a.get());
    }
}
