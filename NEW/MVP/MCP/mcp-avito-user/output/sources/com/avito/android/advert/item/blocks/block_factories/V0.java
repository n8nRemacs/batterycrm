package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.AdvertDetailsHotelDescriptionItemFactory;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelGuestInfoBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class V0 implements dagger.internal.h<U0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AdvertDetailsHotelDescriptionItemFactory> f73499a;

    public V0(Provider<AdvertDetailsHotelDescriptionItemFactory> provider) {
        this.f73499a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U0(this.f73499a.get());
    }
}
