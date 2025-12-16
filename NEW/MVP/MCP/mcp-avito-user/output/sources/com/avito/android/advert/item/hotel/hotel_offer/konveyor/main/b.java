package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelOfferBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f76089a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Locale> f76090b;

    public b(u uVar, Provider provider) {
        this.f76089a = uVar;
        this.f76090b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f76089a.get(), this.f76090b.get());
    }
}
