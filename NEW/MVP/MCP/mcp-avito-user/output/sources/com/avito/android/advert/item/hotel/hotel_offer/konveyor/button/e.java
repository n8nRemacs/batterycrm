package com.avito.android.advert.item.hotel.hotel_offer.konveyor.button;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelButtonPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.hotel.hotel_offer.b> f76029a;

    public e(Provider<com.avito.android.advert.item.hotel.hotel_offer.b> provider) {
        this.f76029a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f76029a.get());
    }
}
