package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.sales_banner.AdvertDetailsStickedSalesBannerItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.sales_banner.StickedSalesBanner;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsStickedSalesBannerItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/Z4;", "Lcom/avito/android/advert/item/blocks/items_factories/Y4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Z4 implements Y4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f73902a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.sales_banner.analytics.a f73903b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73904c;

    @Inject
    public Z4(@Y61.k com.avito.android.Z0 z02, @Y61.k com.avito.android.advert.item.sales_banner.analytics.a aVar, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73902a = z02;
        this.f73903b = aVar;
        this.f73904c = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.Y4
    @Y61.l
    public final AdvertDetailsStickedSalesBannerItem a(@Y61.k AdvertDetails advertDetails) {
        StickedSalesBanner stickedBanner;
        com.avito.android.Z0 z02 = this.f73902a;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.Z0.f67595D[7];
        if (!((Boolean) z02.f67607j.a().invoke()).booleanValue() || (stickedBanner = advertDetails.getStickedBanner()) == null) {
            return null;
        }
        String bannerType = stickedBanner.getBannerType();
        List<Attribute> attributes = stickedBanner.getTitle().getAttributes();
        com.avito.android.advert.item.sales_banner.analytics.a aVar = this.f73903b;
        aVar.getClass();
        if (bannerType == null) {
            bannerType = "";
        }
        aVar.f79300a.c(new com.avito.android.advert.item.sales_banner.analytics.d(aVar.f79301b, bannerType, com.avito.android.advert.item.sales_banner.analytics.a.a(attributes)));
        return new AdvertDetailsStickedSalesBannerItem(0L, null, null, null, this.f73904c.getSpanCount(), stickedBanner, 15, null);
    }
}
