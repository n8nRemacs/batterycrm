package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsConsultationBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28057u0> f73510a;

    public Y(Provider<InterfaceC28057u0> provider) {
        this.f73510a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X(this.f73510a.get());
    }
}
