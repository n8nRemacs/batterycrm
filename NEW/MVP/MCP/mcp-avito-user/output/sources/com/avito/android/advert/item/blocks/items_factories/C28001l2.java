package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.hotel.hotel_review.AdvertHotelReviewItem;
import com.avito.android.advert.item.hotel.hotel_review.badges.AdvertHotelRatingBadgeItem;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.hotel.model.AdvertHotel;
import com.avito.android.hotel.model.AdvertHotelRating;
import com.avito.android.hotel.model.HotelBadge;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsHotelReviewItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/l2;", "Lcom/avito/android/advert/item/blocks/items_factories/k2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.l2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28001l2 implements InterfaceC27994k2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73985a;

    @Inject
    public C28001l2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73985a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27994k2
    @Y61.l
    public final AdvertHotelReviewItem a(@Y61.l AdvertDetails advertDetails) {
        AdvertHotel hotel;
        AdvertHotelRating rating;
        ArrayList arrayList;
        if (advertDetails == null || (hotel = advertDetails.getHotel()) == null || (rating = hotel.getRating()) == null) {
            return null;
        }
        int iA2 = this.f73985a.a();
        String title = rating.getTitle();
        AttributedText description = rating.getDescription();
        List<HotelBadge> listD = rating.d();
        if (listD == null) {
            arrayList = null;
        } else {
            UniversalColor universalColorUniversalColorOf$default = UniversalColorKt.universalColorOf$default("gray4", 0, 2, null);
            UniversalColor universalColorUniversalColorOf$default2 = UniversalColorKt.universalColorOf$default(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, 0, 2, null);
            UniversalColor universalColorUniversalColorOf$default3 = UniversalColorKt.universalColorOf$default(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, 0, 2, null);
            List<HotelBadge> list = listD;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (HotelBadge hotelBadge : list) {
                String strValueOf = String.valueOf(hotelBadge.hashCode());
                UniversalColor backgroundColor = hotelBadge.getBackgroundColor();
                UniversalColor universalColor = backgroundColor == null ? universalColorUniversalColorOf$default : backgroundColor;
                UniversalColor titleColor = hotelBadge.getTitleColor();
                UniversalColor universalColor2 = titleColor == null ? universalColorUniversalColorOf$default2 : titleColor;
                UniversalColor subtitleColor = hotelBadge.getSubtitleColor();
                arrayList2.add(new AdvertHotelRatingBadgeItem(strValueOf, universalColor, universalColor2, subtitleColor == null ? universalColorUniversalColorOf$default3 : subtitleColor, hotelBadge.getTitle(), hotelBadge.getSubtitle(), hotelBadge.getIcon()));
            }
            arrayList = arrayList2;
        }
        return new AdvertHotelReviewItem(0L, null, null, null, iA2, title, description, arrayList, rating.getActionButton(), rating.getOnShowEvent(), 15, null);
    }
}
