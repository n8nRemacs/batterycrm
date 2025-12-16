package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.anchor_trust_factors.AdvertDetailsAnchorTrustFactorsItem;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAnchorTrustFactorsFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/B;", "Lcom/avito/android/advert/item/blocks/items_factories/A;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73705a;

    @Inject
    public B(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73705a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.A
    @Y61.l
    public final AdvertDetailsAnchorTrustFactorsItem a(@Y61.k AdvertDetails advertDetails) {
        AnchorTrustFactors anchorTrustFactors = advertDetails.getAnchorTrustFactors();
        if (anchorTrustFactors == null) {
            return null;
        }
        return new AdvertDetailsAnchorTrustFactorsItem(0L, null, anchorTrustFactors, this.f73705a.a(), null, null, 51, null);
    }
}
