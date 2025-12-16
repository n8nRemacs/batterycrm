package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27973h2;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelPromoWidgetBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Z0 implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27973h2> f73516a;

    public Z0(Provider<InterfaceC27973h2> provider) {
        this.f73516a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y0(this.f73516a.get());
    }
}
