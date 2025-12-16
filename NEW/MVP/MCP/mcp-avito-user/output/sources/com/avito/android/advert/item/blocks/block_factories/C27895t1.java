package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.C28076x1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsParametersBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.t1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27895t1 implements dagger.internal.h<C27891s1> {

    /* renamed from: a, reason: collision with root package name */
    public final C28076x1 f73658a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73659b;

    public C27895t1(C28076x1 c28076x1, Provider provider) {
        this.f73658a = c28076x1;
        this.f73659b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27891s1((C28070w1) this.f73658a.get(), this.f73659b.get());
    }
}
