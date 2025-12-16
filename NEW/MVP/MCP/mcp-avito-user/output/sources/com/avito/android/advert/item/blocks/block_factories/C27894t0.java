package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27923a1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsDisclaimerBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.t0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27894t0 implements dagger.internal.h<C27890s0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27923a1> f73657a;

    public C27894t0(Provider<InterfaceC27923a1> provider) {
        this.f73657a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27890s0(this.f73657a.get());
    }
}
