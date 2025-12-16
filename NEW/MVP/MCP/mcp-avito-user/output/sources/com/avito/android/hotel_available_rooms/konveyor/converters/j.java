package com.avito.android.hotel_available_rooms.konveyor.converters;

import com.avito.android.hotel_available_rooms.domain.models.PromoWidget;
import com.avito.android.hotel_available_rooms.konveyor.promo_widget.HotelPromoWidgetItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HotelPromoWidgetItemConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/converters/j;", "Lcom/avito/android/hotel_available_rooms/konveyor/converters/i;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements i {
    @Inject
    public j() {
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.converters.i
    @Y61.k
    public final HotelPromoWidgetItem a(@Y61.k PromoWidget promoWidget) {
        return new HotelPromoWidgetItem("HOTEL_PROMO_WIDGET_ITEM_ID_" + promoWidget.hashCode(), promoWidget.f162810b, promoWidget.f162811c, promoWidget.f162812d, promoWidget.f162813e, promoWidget.f162814f, promoWidget.f162815g);
    }
}
