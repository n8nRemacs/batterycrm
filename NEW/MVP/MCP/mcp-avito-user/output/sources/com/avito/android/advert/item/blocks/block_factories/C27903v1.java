package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27939c3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsParkingAddressBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.v1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27903v1 implements dagger.internal.h<C27899u1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27939c3> f73667a;

    public C27903v1(Provider<InterfaceC27939c3> provider) {
        this.f73667a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27899u1(this.f73667a.get());
    }
}
