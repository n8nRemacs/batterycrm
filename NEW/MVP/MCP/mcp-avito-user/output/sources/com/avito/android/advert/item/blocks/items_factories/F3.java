package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.realty_imv.RealtyImvItem;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRealtyImvItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/F3;", "Lcom/avito/android/advert/item/blocks/items_factories/E3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class F3 implements E3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73747a;

    @Inject
    public F3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73747a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.E3
    @Y61.l
    public final RealtyImvItem a(@Y61.k AdvertDetails advertDetails) {
        if (advertDetails.getRealtyImv() == null) {
            return null;
        }
        return new RealtyImvItem(0L, null, this.f73747a.a(), null, null, advertDetails.getId(), advertDetails.getRealtyImv(), advertDetails.isRedesign(), 27, null);
    }
}
