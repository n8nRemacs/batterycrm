package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsServicesTransportInfoItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class I4 implements dagger.internal.h<H4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73775a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C43617a> f73776b;

    /* renamed from: c, reason: collision with root package name */
    public final C28076x1 f73777c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73778d;

    public I4(Provider provider, Provider provider2, C28076x1 c28076x1, Provider provider3) {
        this.f73775a = provider;
        this.f73776b = provider2;
        this.f73777c = c28076x1;
        this.f73778d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H4(this.f73775a.get(), this.f73776b.get(), (C28070w1) this.f73777c.get(), this.f73778d.get());
    }
}
