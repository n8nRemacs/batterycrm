package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.R;
import com.avito.android.advert.item.marketplace_sales_banner.MarketplaceSalesBannerItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.sales.SalesBanner;
import javax.inject.Inject;
import kotlin.Metadata;
import lD.C43617a;

/* compiled from: MarketplaceSalesBannerItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/F5;", "Lcom/avito/android/advert/item/blocks/items_factories/E5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class F5 implements E5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43617a f73750a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73751b;

    @Inject
    public F5(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k C43617a c43617a) {
        this.f73750a = c43617a;
        this.f73751b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.E5
    @Y61.l
    public final MarketplaceSalesBannerItem a(@Y61.k AdvertDetails advertDetails) {
        int i12;
        SalesBanner salesBanner = advertDetails.getSalesBanner();
        if (salesBanner == null) {
            return null;
        }
        C43617a c43617a = this.f73750a;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[29];
        if (((Boolean) c43617a.f413593E.a().invoke()).booleanValue() && kotlin.jvm.internal.L.f(CategoryIds.AUTO.TRUCKS.getId(), advertDetails.getCategoryId())) {
            i12 = R.style.RedesignedMarketplaceSalesBanner;
        } else {
            Integer version = salesBanner.getVersion();
            i12 = (version != null && version.intValue() == 2) ? R.style.MarketplaceSalesBannerV2 : R.style.MarketplaceSalesBanner;
        }
        return new MarketplaceSalesBannerItem(0L, null, salesBanner, i12, this.f73751b.a(), null, null, 99, null);
    }
}
