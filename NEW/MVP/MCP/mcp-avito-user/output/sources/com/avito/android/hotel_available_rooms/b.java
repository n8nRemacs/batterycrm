package com.avito.android.hotel_available_rooms;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvailableHotelRoomsIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/b;", "Lcom/avito/android/hotel_available_rooms/a;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f162667a;

    @Inject
    public b(@Y61.k Context context) {
        this.f162667a = context;
    }

    @Override // com.avito.android.hotel_available_rooms.a
    @Y61.k
    public final Intent a(@Y61.k HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams) {
        HotelAvailableRoomsActivity.f162646u.getClass();
        return new Intent(this.f162667a, (Class<?>) HotelAvailableRoomsActivity.class).putExtra("hotel_available_open_params_key", hotelAvailableRoomsOpenParams);
    }
}
