package com.avito.android.advert.item.hotel.hotel_offer;

import android.os.Bundle;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n2;

/* compiled from: AdvertHotelOfferStateProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/m;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface m {
    @Y61.k
    Bundle H();

    void a(@Y61.k HotelOfferState hotelOfferState);

    void b(@Y61.l Bundle bundle);

    @Y61.k
    n2<HotelOfferState> getState();
}
