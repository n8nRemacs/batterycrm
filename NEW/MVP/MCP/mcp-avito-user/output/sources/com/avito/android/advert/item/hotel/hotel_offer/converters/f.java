package com.avito.android.advert.item.hotel.hotel_offer.converters;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: AdvertDetailsOffersDatesFormatter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SimpleDateFormat> f75948a;

    /* renamed from: b, reason: collision with root package name */
    public final u f75949b;

    public f(u uVar, Provider provider) {
        this.f75948a = provider;
        this.f75949b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f75948a.get(), (Map) this.f75949b.get());
    }
}
