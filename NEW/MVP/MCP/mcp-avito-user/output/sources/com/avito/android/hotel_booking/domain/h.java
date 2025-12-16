package com.avito.android.hotel_booking.domain;

import android.os.Parcelable;
import com.avito.android.hotel.model.HotelBookingInputItem;
import com.avito.android.hotel.model.HotelBookingSelectItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: HotelBookingUpdateFormErrorsUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/domain/h;", "Lcom/avito/android/hotel_booking/domain/g;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements g {
    @Inject
    public h() {
    }

    @Override // com.avito.android.hotel_booking.domain.g
    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.k Map map) {
        List<Parcelable> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Parcelable parcelableA : list2) {
            if (parcelableA instanceof HotelBookingInputItem) {
                HotelBookingInputItem hotelBookingInputItem = (HotelBookingInputItem) parcelableA;
                parcelableA = HotelBookingInputItem.a(hotelBookingInputItem, null, (String) map.get(hotelBookingInputItem.getId()), 959);
            } else if (parcelableA instanceof HotelBookingSelectItem) {
                HotelBookingSelectItem hotelBookingSelectItem = (HotelBookingSelectItem) parcelableA;
                parcelableA = HotelBookingSelectItem.a(hotelBookingSelectItem, null, (String) map.get(hotelBookingSelectItem.getId()), 239);
            }
            arrayList.add(parcelableA);
        }
        return arrayList;
    }
}
