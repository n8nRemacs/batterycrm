package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsConsultationSuperFormBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.e0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27835e0 implements dagger.internal.h<C27831d0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28057u0> f73547a;

    public C27835e0(Provider<InterfaceC28057u0> provider) {
        this.f73547a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27831d0(this.f73547a.get());
    }
}
