package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV4ItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class x5 implements dagger.internal.h<w5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C29640d> f74079a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74080b;

    public x5(Provider<C29640d> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f74079a = provider;
        this.f74080b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w5(this.f74079a.get(), this.f74080b.get());
    }
}
