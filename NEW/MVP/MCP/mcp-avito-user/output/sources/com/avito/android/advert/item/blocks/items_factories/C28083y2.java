package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.imv_v4_cars.ImvCarsData;
import com.avito.android.advert_details_items.imv_v4_cars.ImvCarsV4Item;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.CarMarketPrice;
import com.avito.android.remote.model.PriceRanges;
import com.avito.android.remote.model.Range;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsImvCarsV4Factory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/y2;", "Lcom/avito/android/advert/item/blocks/items_factories/x2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.y2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28083y2 implements InterfaceC28077x2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74084a;

    @Inject
    public C28083y2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74084a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28077x2
    @Y61.l
    public final ImvCarsV4Item a(@Y61.k AdvertDetails advertDetails) {
        PriceRanges priceRanges;
        List<Range> ranges;
        CarMarketPrice carMarketPrice = advertDetails.getCarMarketPrice();
        if (carMarketPrice == null || (priceRanges = carMarketPrice.getPriceRanges()) == null || (ranges = priceRanges.getRanges()) == null || ranges.isEmpty()) {
            return null;
        }
        return new ImvCarsV4Item(0L, null, new ImvCarsData(priceRanges.getTitle(), priceRanges.getDisclaimer(), priceRanges.getSubtitle(), priceRanges.getDetails()), priceRanges.getRanges(), advertDetails.getId(), this.f74084a.a(), null, null, 195, null);
    }
}
