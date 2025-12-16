package com.avito.android.advert.item.hotel.hotel_review;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertHotelReviewPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f76264a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.d> f76265b;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.konveyor.adapter.d> provider2) {
        this.f76264a = provider;
        this.f76265b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f76264a.get(), dagger.internal.g.b(this.f76265b));
    }
}
