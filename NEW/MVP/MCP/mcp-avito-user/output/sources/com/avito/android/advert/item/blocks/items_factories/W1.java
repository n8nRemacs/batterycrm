package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert.item.gig.documents.GigPersonalInfoItem;
import com.avito.android.advert.item.gig.duties.AdvertDetailsDutiesItem;
import com.avito.android.advert.item.gig.seller.AdvertDetailsGigSellerItem;
import com.avito.android.advert.item.gig.similar_shifts.AdvertDetailsSimilarShiftsItem;
import com.avito.android.advert_core.map.AdvertMapItem;
import com.avito.android.advert_details_items.price.AdvertDetailsPriceItem;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: AdvertDetailsGigItemsFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/W1;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface W1 {

    /* compiled from: AdvertDetailsGigItemsFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    AdvertDetailsSimilarShiftsItem a(@Y61.k AdvertDetails advertDetails, @Y61.l AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem, @Y61.l String str, @Y61.l String str2, boolean z12, boolean z13);

    @Y61.l
    AdvertDetailsContactBarItem b(@Y61.l AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem);

    @Y61.l
    AdvertDetailsPriceItem c(@Y61.l AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem);

    @Y61.l
    AdvertMapItem d(@Y61.k AdvertDetails advertDetails, @Y61.l String str);

    @Y61.l
    GigPersonalInfoItem e(@Y61.k AdvertDetails advertDetails);

    @Y61.l
    AdvertDetailsGigSellerItem f(@Y61.k AdvertDetails advertDetails);

    @Y61.l
    AdvertDetailsDutiesItem g(@Y61.k AdvertDetails advertDetails);
}
