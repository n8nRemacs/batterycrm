package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28039r0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsComfortableDealPromoBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class W implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28039r0> f73502a;

    public W(Provider<InterfaceC28039r0> provider) {
        this.f73502a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new V(this.f73502a.get());
    }
}
