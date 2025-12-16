package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27936c0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsCampaignsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class L implements dagger.internal.h<K> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27936c0> f73455a;

    public L(Provider<InterfaceC27936c0> provider) {
        this.f73455a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K(this.f73455a.get());
    }
}
