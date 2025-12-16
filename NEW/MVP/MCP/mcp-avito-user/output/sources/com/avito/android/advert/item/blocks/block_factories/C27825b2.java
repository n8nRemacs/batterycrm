package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.Z3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealInfoBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.b2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27825b2 implements dagger.internal.h<C27821a2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Z3> f73528a;

    public C27825b2(Provider<Z3> provider) {
        this.f73528a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27821a2(this.f73528a.get());
    }
}
