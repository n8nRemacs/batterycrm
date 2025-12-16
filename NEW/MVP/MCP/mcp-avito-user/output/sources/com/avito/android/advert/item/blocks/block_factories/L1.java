package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.E3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRealtyImvBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class L1 implements dagger.internal.h<K1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E3> f73457a;

    public L1(Provider<E3> provider) {
        this.f73457a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K1(this.f73457a.get());
    }
}
