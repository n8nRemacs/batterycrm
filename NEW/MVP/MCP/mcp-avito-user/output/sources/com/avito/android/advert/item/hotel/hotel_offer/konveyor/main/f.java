package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import com.avito.android.hotel.model.HotelActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AdvertDetailsHotelOfferPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class f extends H implements Y41.l<HotelActionButton, G0> {
    @Override // Y41.l
    public final G0 invoke(HotelActionButton hotelActionButton) {
        HotelActionButton hotelActionButton2 = hotelActionButton;
        h hVar = (h) this.receiver;
        hVar.getClass();
        if (hotelActionButton2 instanceof HotelActionButton.DeeplinkButton) {
            h.O(hVar, ((HotelActionButton.DeeplinkButton) hotelActionButton2).f162616h);
        } else if (hotelActionButton2 instanceof HotelActionButton.SearchButton) {
            hVar.V(hVar.k());
            hVar.f76099f.r();
        }
        return G0.f406611a;
    }
}
