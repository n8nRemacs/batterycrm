package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.P4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsShowOnMapBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.z2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27920z2 implements dagger.internal.h<C27916y2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<P4> f73690a;

    public C27920z2(Provider<P4> provider) {
        this.f73690a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27916y2(this.f73690a.get());
    }
}
