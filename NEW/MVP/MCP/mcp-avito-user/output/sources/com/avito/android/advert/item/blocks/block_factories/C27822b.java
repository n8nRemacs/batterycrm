package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27921a;
import javax.inject.Provider;

/* compiled from: AdvertBadgeBarBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27822b implements dagger.internal.h<C27818a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27921a> f73525a;

    public C27822b(Provider<InterfaceC27921a> provider) {
        this.f73525a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27818a(this.f73525a.get());
    }
}
