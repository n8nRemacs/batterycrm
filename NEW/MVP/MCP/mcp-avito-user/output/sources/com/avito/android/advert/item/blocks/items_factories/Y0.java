package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.development_offers.DevelopmentOffersItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.DevelopmentOffers;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDevelopmentOffersItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/Y0;", "Lcom/avito/android/advert/item/blocks/items_factories/X0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y0 implements X0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73891a;

    @Inject
    public Y0(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73891a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.X0
    @Y61.l
    public final DevelopmentOffersItem a(@Y61.k AdvertDetails advertDetails) {
        DevelopmentOffers developmentOffers = advertDetails.getDevelopmentOffers();
        if (developmentOffers == null) {
            return null;
        }
        DevelopmentsAdvice developmentsAdvice = advertDetails.getDevelopmentsAdvice();
        String contactBarButtonTitle = developmentsAdvice != null ? developmentsAdvice.getContactBarButtonTitle() : null;
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new DevelopmentOffersItem(developmentOffers, contactBarButtonTitle, "ITEM_DEVELOPMENT_OFFERS", 123, this.f73891a.a(), null, null, new AnalyticsData(advertDetails.getLocationId(), "item_discounts", null, null, 12, null), advertDetails.isRedesign(), 96, null);
    }
}
