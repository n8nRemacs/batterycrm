package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.marketplace_sales_banner_out_of_bound.MarketplaceSalesBannerOutOfBoundsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.SalesBannerImageOutOfBounds;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarketplaceSalesBannerOutOfBoundsImageItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/I5;", "Lcom/avito/android/advert/item/blocks/items_factories/H5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I5 implements H5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73779a;

    @Inject
    public I5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73779a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.H5
    @Y61.l
    public final MarketplaceSalesBannerOutOfBoundsItem a(@Y61.k AdvertDetails advertDetails) {
        SalesBannerImageOutOfBounds salesBannerWithFlexibleImage = advertDetails.getSalesBannerWithFlexibleImage();
        if (salesBannerWithFlexibleImage == null) {
            return null;
        }
        return new MarketplaceSalesBannerOutOfBoundsItem(0L, null, salesBannerWithFlexibleImage, this.f73779a.a(), null, null, 51, null);
    }
}
