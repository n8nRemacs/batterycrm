package com.avito.android.hotel_available_rooms.konveyor.booking;

import Y61.k;
import Y61.l;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingDiscount;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingInstallments;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HotelRoomBookingView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/booking/g;", "LTV0/e;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface g extends TV0.e {

    /* compiled from: HotelRoomBookingView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void EN(int i12);

    void Nc(@l AttributedText attributedText);

    void O40(@l HotelBookingInstallments hotelBookingInstallments);

    void V0(@l String str);

    void Wj(@l List<String> list);

    void Y(@k Y41.a<G0> aVar);

    void dd(@l AttributedText attributedText);

    void h4(@l Y41.a<G0> aVar);

    void mu(@l HotelBookingDiscount hotelBookingDiscount);

    void oB(boolean z12);
}
