package com.avito.android.advert.item.hotel.hotel_promo_widget;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertHotelPromoWidgetPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f76222a;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f76222a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f76222a.get());
    }
}
