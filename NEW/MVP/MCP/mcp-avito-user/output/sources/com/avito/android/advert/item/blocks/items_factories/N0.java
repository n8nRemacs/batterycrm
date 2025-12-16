package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.trust_factors.DeliveryTrustFactorsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.DeliveryTrustFactors;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDeliveryTrustFactorsFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/N0;", "Lcom/avito/android/advert/item/blocks/items_factories/M0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N0 implements M0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73814a;

    @Inject
    public N0(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73814a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.M0
    @Y61.l
    public final DeliveryTrustFactorsItem a(@Y61.k AdvertDetails advertDetails) {
        DeliveryTrustFactors deliveryTrustFactors = advertDetails.getDeliveryTrustFactors();
        if (deliveryTrustFactors == null) {
            return null;
        }
        return new DeliveryTrustFactorsItem(0L, null, this.f73814a.a(), null, null, deliveryTrustFactors, 27, null);
    }
}
