package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.text.SimpleDateFormat;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelOfferPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class o implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f76139a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.hotel.hotel_offer.m> f76140b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.hotel.hotel_offer.e> f76141c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.hotel.hotel_offer.j> f76142d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<G5.a> f76143e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f76144f;

    /* renamed from: g, reason: collision with root package name */
    public final J5.b f76145g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.hotel.hotel_offer.b> f76146h;

    /* renamed from: i, reason: collision with root package name */
    public final u f76147i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<SimpleDateFormat> f76148j;

    public o(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, J5.b bVar, Provider provider7, u uVar, Provider provider8) {
        this.f76139a = provider;
        this.f76140b = provider2;
        this.f76141c = provider3;
        this.f76142d = provider4;
        this.f76143e = provider5;
        this.f76144f = provider6;
        this.f76145g = bVar;
        this.f76146h = provider7;
        this.f76147i = uVar;
        this.f76148j = provider8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f76139a.get(), this.f76140b.get(), this.f76141c.get(), this.f76142d.get(), this.f76143e.get(), this.f76144f.get(), (J5.a) this.f76145g.get(), this.f76146h.get(), (com.avito.konveyor.adapter.d) this.f76147i.get(), this.f76148j.get());
    }
}
