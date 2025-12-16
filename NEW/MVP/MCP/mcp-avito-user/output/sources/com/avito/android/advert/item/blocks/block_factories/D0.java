package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28082y1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpCalculatorFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class D0 implements dagger.internal.h<C0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28082y1> f73427a;

    public D0(Provider<InterfaceC28082y1> provider) {
        this.f73427a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C0(this.f73427a.get());
    }
}
