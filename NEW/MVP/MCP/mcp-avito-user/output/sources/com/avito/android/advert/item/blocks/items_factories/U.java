package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.beduin.AdvertDetailsBeduinItem;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBeduinItemsItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/U;", "Lcom/avito/android/advert/item/blocks/items_factories/T;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73861a;

    @Inject
    public U(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73861a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.T
    @Y61.l
    public final AdvertDetailsBeduinItem a(@Y61.k AdvertDetails advertDetails) {
        String beduinItemsBlockUrlPath = advertDetails.getBeduinItemsBlockUrlPath();
        if (beduinItemsBlockUrlPath == null) {
            return null;
        }
        return new AdvertDetailsBeduinItem("BEDUIN", beduinItemsBlockUrlPath, this.f73861a.getSpanCount(), null, null, 24, null);
    }
}
