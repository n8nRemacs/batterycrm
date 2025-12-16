package com.avito.android.hotel_available_rooms.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.hotel_available_rooms.HotelAvailableRoomsOpenParams;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: HotelAvailableRoomsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/k;", "", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface k {
    @Y61.k
    InterfaceC43160i<HotelAvailableRoomsInternalAction> a(@Y61.l String str, @Y61.k InterfaceC14249c interfaceC14249c, @Y61.l String str2, @Y61.k HotelFilters hotelFilters);

    @Y61.k
    InterfaceC43160i<HotelAvailableRoomsInternalAction> b(@Y61.l String str, @Y61.k HotelFilters hotelFilters);

    @Y61.k
    InterfaceC43160i<HotelAvailableRoomsInternalAction> c(@Y61.k HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams);
}
