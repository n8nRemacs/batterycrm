package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27957f0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsChatHistoryBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27957f0> f73463a;

    public N(Provider<InterfaceC27957f0> provider) {
        this.f73463a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new M(this.f73463a.get());
    }
}
