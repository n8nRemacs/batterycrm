package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.delivery_suggests.AdvertDetailsDeliverySuggestsItem;
import com.avito.android.remote.delivery_suggests.DeliverySuggests;
import com.avito.android.remote.model.AdvertDetails;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDeliverySuggestsFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/K0;", "Lcom/avito/android/advert/item/blocks/items_factories/J0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K0 implements J0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73783a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.price_with_delivery.c f73784b;

    @Inject
    public K0(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.advert_core.price_with_delivery.c cVar) {
        this.f73783a = jVar;
        this.f73784b = cVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.J0
    @Y61.l
    public final AdvertDetailsDeliverySuggestsItem a(@Y61.k AdvertDetails advertDetails) {
        Map<String, DeliverySuggests.SelectionSettings.DeliveryOption> mapD;
        DeliverySuggests deliverySuggests = advertDetails.getDeliverySuggests();
        if (deliverySuggests == null) {
            return null;
        }
        DeliverySuggests.SelectionSettings selectionSettings = deliverySuggests.getSelectionSettings();
        if (selectionSettings != null && (mapD = selectionSettings.d()) != null) {
            this.f73784b.f(mapD);
        }
        return new AdvertDetailsDeliverySuggestsItem(0L, null, deliverySuggests, this.f73783a.a(), null, null, null, 115, null);
    }
}
