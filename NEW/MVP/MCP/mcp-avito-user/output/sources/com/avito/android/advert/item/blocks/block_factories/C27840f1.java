package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28041r2;
import javax.inject.Provider;

/* compiled from: AdvertDetailsIceBreakersBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.f1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27840f1 implements dagger.internal.h<C27836e1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28041r2> f73558a;

    public C27840f1(Provider<InterfaceC28041r2> provider) {
        this.f73558a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27836e1(this.f73558a.get());
    }
}
