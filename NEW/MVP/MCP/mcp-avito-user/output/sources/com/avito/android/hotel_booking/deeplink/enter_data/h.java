package com.avito.android.hotel_booking.deeplink.enter_data;

import com.avito.android.hotel_booking.InputConstraint;
import com.avito.android.hotel_booking.deserializers.InputConstraintTypeAdapter;
import com.avito.android.hotel_booking.di.C30793n;
import com.avito.android.hotel_booking.di.C30794o;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HotelBookingEnterDataDeeplinkParser_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30794o f163314a;

    public h(C30794o c30794o) {
        this.f163314a = c30794o;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f163314a.getClass();
        C30793n.f163451a.getClass();
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.b(InputConstraint.class, new InputConstraintTypeAdapter());
        return new f(dVar.a());
    }
}
