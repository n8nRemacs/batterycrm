package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.buyer_trust_banner.BuyerTrustBannerItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.buyer_trust_banner.BuyerTrustBanner;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBuyerTrustBannerItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/X;", "Lcom/avito/android/advert/item/blocks/items_factories/W;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73876a;

    @Inject
    public X(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73876a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W
    @Y61.l
    public final BuyerTrustBannerItem a(@Y61.k AdvertDetails advertDetails) {
        BuyerTrustBanner buyerTrustBanner = advertDetails.getBuyerTrustBanner();
        if (buyerTrustBanner == null) {
            return null;
        }
        return new BuyerTrustBannerItem(0L, null, this.f73876a.getSpanCount(), buyerTrustBanner, null, null, 51, null);
    }
}
