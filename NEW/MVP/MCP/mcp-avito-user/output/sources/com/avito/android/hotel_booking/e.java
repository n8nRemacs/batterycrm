package com.avito.android.hotel_booking;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HotelBookingIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/e;", "Lcom/avito/android/hotel_booking/d;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f163473a;

    @Inject
    public e(@k Context context) {
        this.f163473a = context;
    }

    @Override // com.avito.android.hotel_booking.d
    @k
    public final Intent a(@k HotelBookingOpenParams hotelBookingOpenParams) {
        HotelBookingActivity.f163213t.getClass();
        return new Intent(this.f163473a, (Class<?>) HotelBookingActivity.class).putExtra("open_params", hotelBookingOpenParams);
    }
}
