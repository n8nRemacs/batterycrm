package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27952e2;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelOfferBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class X0 implements dagger.internal.h<W0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27952e2> f73507a;

    public X0(Provider<InterfaceC27952e2> provider) {
        this.f73507a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W0(this.f73507a.get());
    }
}
