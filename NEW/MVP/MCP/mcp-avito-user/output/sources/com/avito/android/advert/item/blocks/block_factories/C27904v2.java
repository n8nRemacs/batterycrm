package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.M4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesWorkTimeBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.v2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27904v2 implements dagger.internal.h<C27900u2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M4> f73668a;

    public C27904v2(Provider<M4> provider) {
        this.f73668a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27900u2(this.f73668a.get());
    }
}
