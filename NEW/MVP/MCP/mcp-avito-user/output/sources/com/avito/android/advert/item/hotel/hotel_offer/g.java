package com.avito.android.advert.item.hotel.hotel_offer;

import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: AdvertDetailsHotelOfferInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<DI.c> f76001a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ZI.a> f76002b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f76003c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<m> f76004d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.advert.item.hotel.hotel_offer.converters.d f76005e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C43624b> f76006f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.advert.item.hotel.hotel_offer.converters.b f76007g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.f<SimpleTestGroup>> f76008h;

    public g(Provider provider, Provider provider2, Provider provider3, Provider provider4, com.avito.android.advert.item.hotel.hotel_offer.converters.d dVar, Provider provider5, com.avito.android.advert.item.hotel.hotel_offer.converters.b bVar, Provider provider6) {
        this.f76001a = provider;
        this.f76002b = provider2;
        this.f76003c = provider3;
        this.f76004d = provider4;
        this.f76005e = dVar;
        this.f76006f = provider5;
        this.f76007g = bVar;
        this.f76008h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        DI.c cVar = this.f76001a.get();
        ZI.a aVar = this.f76002b.get();
        R0 r02 = this.f76003c.get();
        m mVar = this.f76004d.get();
        this.f76005e.getClass();
        com.avito.android.advert.item.hotel.hotel_offer.converters.c cVar2 = new com.avito.android.advert.item.hotel.hotel_offer.converters.c();
        C43624b c43624b = this.f76006f.get();
        this.f76007g.getClass();
        return new f(cVar, aVar, r02, mVar, cVar2, c43624b, new com.avito.android.advert.item.hotel.hotel_offer.converters.a(), this.f76008h.get());
    }
}
