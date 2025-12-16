package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28075x0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsContactBarBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.h0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27847h0 implements dagger.internal.h<C27839f0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28075x0> f73578a;

    public C27847h0(Provider<InterfaceC28075x0> provider) {
        this.f73578a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27839f0(this.f73578a.get());
    }
}
