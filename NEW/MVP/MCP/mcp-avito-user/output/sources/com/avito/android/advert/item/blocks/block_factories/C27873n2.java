package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.B4;
import com.avito.android.advert.item.blocks.items_factories.C4;

/* compiled from: AdvertDetailsServicesPriceBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.n2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27873n2 implements dagger.internal.h<C27869m2> {

    /* renamed from: a, reason: collision with root package name */
    public final C4 f73633a;

    public C27873n2(C4 c42) {
        this.f73633a = c42;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27869m2((B4) this.f73633a.get());
    }
}
