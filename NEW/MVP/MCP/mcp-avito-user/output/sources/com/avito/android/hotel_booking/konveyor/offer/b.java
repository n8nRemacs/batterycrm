package com.avito.android.hotel_booking.konveyor.offer;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BookingFormOfferBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f163717a;

    public b(e eVar) {
        this.f163717a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f163717a.get());
    }
}
