package com.avito.android.advert.item.hotel.hotel_offer;

import com.avito.android.ab_tests.groups.SimpleTestGroup;
import dagger.internal.x;
import dagger.internal.y;
import java.text.SimpleDateFormat;
import javax.inject.Provider;

/* compiled from: AdvertHotelOfferViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SimpleDateFormat> f76197a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SimpleDateFormat> f76198b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert.item.hotel.hotel_offer.converters.i f76199c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.advert.item.hotel.hotel_offer.converters.f f76200d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<u3.f<SimpleTestGroup>> f76201e;

    public s(Provider provider, Provider provider2, com.avito.android.advert.item.hotel.hotel_offer.converters.i iVar, com.avito.android.advert.item.hotel.hotel_offer.converters.f fVar, Provider provider3) {
        this.f76197a = provider;
        this.f76198b = provider2;
        this.f76199c = iVar;
        this.f76200d = fVar;
        this.f76201e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f76197a.get(), this.f76198b.get(), (com.avito.android.advert.item.hotel.hotel_offer.converters.g) this.f76199c.get(), (com.avito.android.advert.item.hotel.hotel_offer.converters.e) this.f76200d.get(), this.f76201e.get());
    }
}
