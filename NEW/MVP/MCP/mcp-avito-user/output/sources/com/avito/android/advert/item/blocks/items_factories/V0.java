package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.developer.trust.DeveloperTrustItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Developer;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDeveloperTrustItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/V0;", "Lcom/avito/android/advert/item/blocks/items_factories/U0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class V0 implements U0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73868a;

    @Inject
    public V0(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73868a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.U0
    @Y61.l
    public final DeveloperTrustItem a(@Y61.k AdvertDetails advertDetails) {
        Developer developerV2 = advertDetails.getDeveloperV2();
        if (developerV2 == null) {
            return null;
        }
        return new DeveloperTrustItem(0L, null, this.f73868a.a(), null, null, developerV2.getTitle(), developerV2.getDescription(), developerV2.getTrustCard(), developerV2.getFoundationCard(), 27, null);
    }
}
