package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28011m5;
import javax.inject.Provider;

/* compiled from: AdvertVideoCallRequestBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Q2 implements dagger.internal.h<P2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28011m5> f73481a;

    public Q2(Provider<InterfaceC28011m5> provider) {
        this.f73481a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new P2(this.f73481a.get());
    }
}
