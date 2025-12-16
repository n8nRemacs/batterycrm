package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.InterfaceC28240u;
import javax.inject.Provider;

/* compiled from: AdvertDetailsNumberItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Y2 implements dagger.internal.h<X2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73898a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28240u> f73899b;

    public Y2(Provider<com.avito.android.advert.item.similars.j> provider, Provider<InterfaceC28240u> provider2) {
        this.f73898a = provider;
        this.f73899b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X2(this.f73898a.get(), this.f73899b.get());
    }
}
