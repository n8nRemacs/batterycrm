package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.Q3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsReservationInfoBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class V1 implements dagger.internal.h<U1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Q3> f73500a;

    public V1(Provider<Q3> provider) {
        this.f73500a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U1(this.f73500a.get());
    }
}
