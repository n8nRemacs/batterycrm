package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28020o0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsComfortableDealInfoBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28020o0> f73494a;

    public U(Provider<InterfaceC28020o0> provider) {
        this.f73494a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new T(this.f73494a.get());
    }
}
