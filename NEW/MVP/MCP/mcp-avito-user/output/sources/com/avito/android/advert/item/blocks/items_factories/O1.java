package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.geo_market_report.AdvertDetailsGeoMarketReportItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.GeoMarketReport;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsGeoMarketingReportItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/O1;", "Lcom/avito/android/advert/item/blocks/items_factories/N1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O1 implements N1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73818a;

    @Inject
    public O1(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73818a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.N1
    @Y61.l
    public final AdvertDetailsGeoMarketReportItem a(@Y61.k AdvertDetails advertDetails) {
        GeoMarketReport geoMarketReport = advertDetails.getGeoMarketReport();
        if (geoMarketReport == null) {
            return null;
        }
        return new AdvertDetailsGeoMarketReportItem(0L, null, this.f73818a.a(), null, null, geoMarketReport, 27, null);
    }
}
