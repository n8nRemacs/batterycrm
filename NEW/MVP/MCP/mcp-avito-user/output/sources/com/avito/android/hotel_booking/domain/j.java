package com.avito.android.hotel_booking.domain;

import com.avito.android.hotel.model.HotelBookingFormItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: HotelBookingUpdateParameterUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/domain/j;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface j {
    @Y61.l
    <T> Object a(@Y61.k List<? extends HotelBookingFormItem> list, @Y61.l String str, @Y61.l T t12, @Y61.k Continuation<? super List<? extends HotelBookingFormItem>> continuation);
}
