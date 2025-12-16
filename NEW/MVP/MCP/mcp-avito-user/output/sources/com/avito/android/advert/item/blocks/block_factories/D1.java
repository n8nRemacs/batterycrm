package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28048s3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceHistoryBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class D1 implements dagger.internal.h<C1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28048s3> f73428a;

    public D1(Provider<InterfaceC28048s3> provider) {
        this.f73428a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C1(this.f73428a.get());
    }
}
