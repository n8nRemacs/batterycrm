package com.avito.android.hotel_booking.di;

import com.avito.android.hotel.model.HotelBookingCreateResponse;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.util.C35866p0;
import java.util.Set;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: HotelBookingJsonModule_ProvideCustomTypeAdaptersFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class C implements dagger.internal.h<Set<C35866p0>> {

    /* compiled from: HotelBookingJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C f163340a = new C();
    }

    public static C a() {
        return a.f163340a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B.f163339a.getClass();
        return b1.g(new C35866p0(HotelBookingCreateResponse.class, P0.g(new kotlin.Q("ok", HotelBookingCreateResponse.BookingAvailable.class), new kotlin.Q("booking-unavailable", HotelBookingCreateResponse.BookingUnavailable.class))), new C35866p0(HotelBookingFormResponse.class, P0.g(new kotlin.Q("ok", HotelBookingFormResponse.Form.class), new kotlin.Q("booking-unavailable", HotelBookingFormResponse.BookingUnavailable.class))));
    }
}
