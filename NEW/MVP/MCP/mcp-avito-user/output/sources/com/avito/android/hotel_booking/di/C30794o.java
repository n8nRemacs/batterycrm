package com.avito.android.hotel_booking.di;

import com.avito.android.hotel_booking.InputConstraint;
import com.avito.android.hotel_booking.deserializers.InputConstraintTypeAdapter;
import com.google.gson.Gson;

/* compiled from: HotelBookingDeeplinkModule_ProvideCustomGsonFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.hotel_booking.di.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30794o implements dagger.internal.h<Gson> {

    /* compiled from: HotelBookingDeeplinkModule_ProvideCustomGsonFactory.java */
    /* renamed from: com.avito.android.hotel_booking.di.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C30794o f163452a = new C30794o();
    }

    public static C30794o a() {
        return a.f163452a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30793n.f163451a.getClass();
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.b(InputConstraint.class, new InputConstraintTypeAdapter());
        return dVar.a();
    }
}
