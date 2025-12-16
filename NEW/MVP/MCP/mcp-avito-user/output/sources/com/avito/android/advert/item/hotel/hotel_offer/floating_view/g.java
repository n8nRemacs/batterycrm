package com.avito.android.advert.item.hotel.hotel_offer.floating_view;

import com.avito.android.advert.item.hotel.hotel_offer.m;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertHotelBookingInfoFloatingPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f75986a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G5.a> f75987b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f75988c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75989d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.hotel.hotel_offer.j> f75990e;

    public g(Provider<m> provider, Provider<G5.a> provider2, Provider<R0> provider3, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider4, Provider<com.avito.android.advert.item.hotel.hotel_offer.j> provider5) {
        this.f75986a = provider;
        this.f75987b = provider2;
        this.f75988c = provider3;
        this.f75989d = provider4;
        this.f75990e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f75986a.get(), this.f75987b.get(), this.f75988c.get(), this.f75989d.get(), this.f75990e.get());
    }
}
