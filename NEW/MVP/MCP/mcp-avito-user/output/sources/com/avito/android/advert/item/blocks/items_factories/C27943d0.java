package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.campaigns.AdvertDetailsCampaignsItem;
import com.avito.android.remote.model.AdvertCampaigns;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.CampaignOption;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AdvertDetailsCampaignsItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/d0;", "Lcom/avito/android/advert/item/blocks/items_factories/c0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.d0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27943d0 implements InterfaceC27936c0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73933a;

    @Inject
    public C27943d0(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73933a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27936c0
    @Y61.l
    public final AdvertDetailsCampaignsItem a(@Y61.k AdvertDetails advertDetails) {
        List<CampaignOption> options;
        boolean zIsRestyle = advertDetails.isRestyle();
        AdvertCampaigns campaigns = advertDetails.getCampaigns();
        if (campaigns == null && !zIsRestyle) {
            return null;
        }
        if (campaigns == null || (options = campaigns.getOptions()) == null) {
            options = C42784z0.f406748b;
        }
        return new AdvertDetailsCampaignsItem(0L, null, options, zIsRestyle, this.f73933a.a(), null, null, 99, null);
    }
}
