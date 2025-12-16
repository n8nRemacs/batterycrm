package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28026p;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAddressGeoDistanceBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27870n implements dagger.internal.h<C27866m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28026p> f73630a;

    public C27870n(Provider<InterfaceC28026p> provider) {
        this.f73630a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27866m(this.f73630a.get());
    }
}
