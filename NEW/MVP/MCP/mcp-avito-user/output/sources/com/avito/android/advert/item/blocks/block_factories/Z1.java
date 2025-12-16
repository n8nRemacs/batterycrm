package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27961f4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Z1 implements dagger.internal.h<Y1> {

    /* renamed from: a, reason: collision with root package name */
    public final C4.d f73517a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27961f4> f73518b;

    public Z1(C4.d dVar, Provider provider) {
        this.f73517a = dVar;
        this.f73518b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y1((C4.c) this.f73517a.get(), this.f73518b.get());
    }
}
