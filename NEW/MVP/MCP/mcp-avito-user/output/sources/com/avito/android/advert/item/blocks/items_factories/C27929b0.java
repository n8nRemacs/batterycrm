package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBuzzoolaCreditBannerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27929b0 implements dagger.internal.h<C27922a0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C29640d> f73916a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73917b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f73918c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Boolean> f73919d;

    public C27929b0(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f73916a = provider;
        this.f73917b = provider2;
        this.f73918c = uVar;
        this.f73919d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27922a0(this.f73916a.get(), this.f73917b.get(), (com.avito.android.advert.item.creditinfo.buzzoola.k) this.f73918c.get(), this.f73919d.get().booleanValue());
    }
}
