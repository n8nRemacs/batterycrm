package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28007m1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsEquipmentsTileBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.z0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27918z0 implements dagger.internal.h<C27914y0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28007m1> f73688a;

    public C27918z0(Provider<InterfaceC28007m1> provider) {
        this.f73688a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27914y0(this.f73688a.get());
    }
}
