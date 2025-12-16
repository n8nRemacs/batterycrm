package com.avito.android.short_term_rent.bookingform.promocode.di;

import com.avito.android.short_term_rent.bookingform.promocode.di.f;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormPromoCodeKonveyorModule_KonveyorModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f282108a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.d f282109b;

    public g(Provider provider, com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.d dVar) {
        this.f282108a = provider;
        this.f282109b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f282108a.get();
        com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.c cVar = (com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.c) this.f282109b.get();
        f.a.f282107a.getClass();
        return new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), aVar, cVar);
    }
}
