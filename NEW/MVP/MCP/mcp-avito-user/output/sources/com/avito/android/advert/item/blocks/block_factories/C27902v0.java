package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27944d1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsDockingBadgeBarFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.v0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27902v0 implements dagger.internal.h<C27898u0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27944d1> f73666a;

    public C27902v0(Provider<InterfaceC27944d1> provider) {
        this.f73666a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27898u0(this.f73666a.get());
    }
}
