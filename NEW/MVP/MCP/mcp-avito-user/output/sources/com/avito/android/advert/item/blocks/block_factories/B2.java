package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.S4;

/* compiled from: AdvertDetailsSimilarItemsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class B2 implements dagger.internal.h<A2> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f73421a;

    public B2(dagger.internal.u uVar) {
        this.f73421a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A2((S4) this.f73421a.get());
    }
}
