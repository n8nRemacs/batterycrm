package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27940c4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealPaymentBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.d2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27833d2 implements dagger.internal.h<C27829c2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27940c4> f73540a;

    public C27833d2(Provider<InterfaceC27940c4> provider) {
        this.f73540a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27829c2(this.f73540a.get());
    }
}
