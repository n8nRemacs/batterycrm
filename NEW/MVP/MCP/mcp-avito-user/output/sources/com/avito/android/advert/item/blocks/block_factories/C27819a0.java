package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsConsultationDynamicFormBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.a0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27819a0 implements dagger.internal.h<Z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28057u0> f73521a;

    public C27819a0(Provider<InterfaceC28057u0> provider) {
        this.f73521a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Z(this.f73521a.get());
    }
}
