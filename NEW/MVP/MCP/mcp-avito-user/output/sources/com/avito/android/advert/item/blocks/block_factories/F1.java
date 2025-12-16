package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28084y3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPromoMechanicsBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class F1 implements dagger.internal.h<E1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28084y3> f73435a;

    public F1(Provider<InterfaceC28084y3> provider) {
        this.f73435a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E1(this.f73435a.get());
    }
}
