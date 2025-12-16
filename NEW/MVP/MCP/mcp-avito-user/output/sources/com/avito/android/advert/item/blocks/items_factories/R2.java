package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.di.C27710t;
import com.avito.android.advert_details_items.price.realty.AdvertDetailsNormalizedAndHistoryPricesItem;
import com.avito.android.item_price_history.deeplink.PriceHistory;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/R2;", "Lcom/avito/android/advert/item/blocks/items_factories/Q2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class R2 implements Q2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f73841a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f73842b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f73843c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73844d;

    @Inject
    public R2(@C27710t.InterfaceC2166t @Y61.l String str, @Y61.k @C27710t.j InterfaceC35945t1<AdvertPrice> interfaceC35945t1, @Y61.k @C27710t.r InterfaceC35945t1<AdvertPrice> interfaceC35945t12, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73841a = str;
        this.f73842b = interfaceC35945t1;
        this.f73843c = interfaceC35945t12;
        this.f73844d = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.Q2
    @Y61.l
    public final AdvertDetailsNormalizedAndHistoryPricesItem a(@Y61.k AdvertDetails advertDetails) {
        AdvertDetailsNormalizedAndHistoryPricesItem.PriceHistory priceHistory;
        int iA2 = this.f73844d.a();
        String strA = this.f73842b.a(advertDetails.getPrice());
        String strA2 = this.f73843c.a(advertDetails.getPrice());
        PriceHistory priceHistory2 = advertDetails.getPriceHistory();
        if (priceHistory2 != null) {
            priceHistory = new AdvertDetailsNormalizedAndHistoryPricesItem.PriceHistory(priceHistory2.getDeepLink(), this.f73841a, advertDetails.getIsFavorite(), priceHistory2.getTitle());
        } else {
            priceHistory = null;
        }
        return new AdvertDetailsNormalizedAndHistoryPricesItem(0L, null, iA2, null, null, strA, strA2, priceHistory, !advertDetails.isActive(), 27, null);
    }
}
