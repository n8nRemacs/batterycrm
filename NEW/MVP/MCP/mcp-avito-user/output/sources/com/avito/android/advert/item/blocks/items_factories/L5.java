package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.marketplace_stocks.MarketplaceStocksItem;
import com.avito.android.remote.marketplace.MarketplaceStocks;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarketplaceStocksItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/L5;", "Lcom/avito/android/advert/item/blocks/items_factories/K5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L5 implements K5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73802a;

    @Inject
    public L5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73802a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.K5
    @Y61.l
    public final MarketplaceStocksItem a(@Y61.k AdvertDetails advertDetails) {
        MarketplaceStocks marketplaceStocks = advertDetails.getMarketplaceStocks();
        if (marketplaceStocks == null) {
            return null;
        }
        return new MarketplaceStocksItem(marketplaceStocks, 0L, null, this.f73802a.a(), null, null, 54, null);
    }
}
