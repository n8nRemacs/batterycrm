package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.AdvertDetailsHotelDescriptionItemFactory;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelCheckinRulesBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class T0 implements dagger.internal.h<S0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AdvertDetailsHotelDescriptionItemFactory> f73491a;

    public T0(Provider<AdvertDetailsHotelDescriptionItemFactory> provider) {
        this.f73491a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S0(this.f73491a.get());
    }
}
