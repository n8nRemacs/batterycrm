package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsShortTermRentBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.x2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27912x2 implements dagger.internal.h<C27908w2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.short_term_rent.a> f73679a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E4.d> f73680b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E4.a> f73681c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E4.l> f73682d;

    public C27912x2(Provider<com.avito.android.advert_core.short_term_rent.a> provider, Provider<E4.d> provider2, Provider<E4.a> provider3, Provider<E4.l> provider4) {
        this.f73679a = provider;
        this.f73680b = provider2;
        this.f73681c = provider3;
        this.f73682d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27908w2(this.f73679a.get(), this.f73680b.get(), this.f73681c.get(), this.f73682d.get());
    }
}
