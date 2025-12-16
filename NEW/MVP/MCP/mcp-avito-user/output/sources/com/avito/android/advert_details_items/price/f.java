package com.avito.android.advert_details_items.price;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPricePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.price_hint.f> f85177a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.buyer_bonuses.c> f85178b;

    /* renamed from: c, reason: collision with root package name */
    public final u f85179c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f85177a = provider;
        this.f85178b = provider2;
        this.f85179c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f85177a.get(), this.f85178b.get(), (j) this.f85179c.get());
    }
}
