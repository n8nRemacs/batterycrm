package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27978i0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsClosingReasonBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27978i0> f73486a;

    public S(Provider<InterfaceC27978i0> provider) {
        this.f73486a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q(this.f73486a.get());
    }
}
