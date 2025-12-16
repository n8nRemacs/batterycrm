package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.di.C27710t;
import com.avito.android.advert_details_items.price_history.PriceHistoryItem;
import com.avito.android.item_price_history.deeplink.PriceHistory;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertPrice;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPriceHistoryItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/t3;", "Lcom/avito/android/advert/item/blocks/items_factories/s3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.t3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28054t3 implements InterfaceC28048s3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74031a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f74032b;

    @Inject
    public C28054t3(@Y61.k com.avito.android.advert.item.similars.j jVar, @C27710t.InterfaceC2166t @Y61.l String str) {
        this.f74031a = jVar;
        this.f74032b = str;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28048s3
    @Y61.l
    public final PriceHistoryItem a(@Y61.k AdvertDetails advertDetails) {
        PriceHistory priceHistory = advertDetails.getPriceHistory();
        if (priceHistory == null) {
            return null;
        }
        AdvertPrice price = advertDetails.getPrice();
        if ((price != null ? price.getNormalizedValue() : null) != null) {
            return null;
        }
        return new PriceHistoryItem(null, 0L, null, this.f74031a.a(), null, this.f74032b, priceHistory.getDeepLink(), advertDetails.getIsFavorite(), priceHistory.getTitle(), !advertDetails.isActive(), 23, null);
    }
}
