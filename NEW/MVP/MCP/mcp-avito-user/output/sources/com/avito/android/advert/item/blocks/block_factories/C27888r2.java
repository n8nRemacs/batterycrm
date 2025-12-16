package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.G4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesTransportInfoBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.r2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27888r2 implements dagger.internal.h<C27885q2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G4> f73649a;

    public C27888r2(Provider<G4> provider) {
        this.f73649a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27885q2(this.f73649a.get());
    }
}
