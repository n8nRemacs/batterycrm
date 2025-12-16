package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28022o2;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelShowOnMapBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.d1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27832d1 implements dagger.internal.h<C27828c1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28022o2> f73539a;

    public C27832d1(Provider<InterfaceC28022o2> provider) {
        this.f73539a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27828c1(this.f73539a.get());
    }
}
