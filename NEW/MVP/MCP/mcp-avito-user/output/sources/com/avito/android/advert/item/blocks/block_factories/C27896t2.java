package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.J4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesTransportationGeoItemBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.t2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27896t2 implements dagger.internal.h<C27892s2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J4> f73660a;

    public C27896t2(Provider<J4> provider) {
        this.f73660a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27892s2(this.f73660a.get());
    }
}
