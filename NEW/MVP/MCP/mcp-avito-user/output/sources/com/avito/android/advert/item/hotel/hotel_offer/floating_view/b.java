package com.avito.android.advert.item.hotel.hotel_offer.floating_view;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.hotel.model.HotelActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AdvertHotelBookingInfoFloatingPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class b extends H implements l<HotelActionButton, G0> {
    @Override // Y41.l
    public final G0 invoke(HotelActionButton hotelActionButton) {
        HotelActionButton hotelActionButton2 = hotelActionButton;
        f fVar = (f) this.receiver;
        fVar.getClass();
        if (hotelActionButton2 instanceof HotelActionButton.DeeplinkButton) {
            DeepLink deepLink = ((HotelActionButton.DeeplinkButton) hotelActionButton2).f162616h;
            if (deepLink != null) {
                b.a.a(fVar.f75979d, deepLink, "key_advert_details_hotel", null, 4);
            }
        } else if (hotelActionButton2 instanceof HotelActionButton.SearchButton) {
            fVar.f75980e.b(fVar.f75976a.getState().getValue().f75902b);
            fVar.f75977b.v();
        }
        return G0.f406611a;
    }
}
