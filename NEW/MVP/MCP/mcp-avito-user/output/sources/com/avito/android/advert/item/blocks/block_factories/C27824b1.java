package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27994k2;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelReviewBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.b1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27824b1 implements dagger.internal.h<C27820a1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27994k2> f73527a;

    public C27824b1(Provider<InterfaceC27994k2> provider) {
        this.f73527a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27820a1(this.f73527a.get());
    }
}
