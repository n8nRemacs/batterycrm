package com.avito.android.advert_details_items.campaigns;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.CampaignOption;
import com.avito.android.remote.model.CampaignOptionCopy;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsCampaignsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/campaigns/f;", "LTV0/e;", "b", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f extends TV0.e {

    /* compiled from: AdvertDetailsCampaignsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: AdvertDetailsCampaignsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/campaigns/f$b;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void Z(@k DeepLink deepLink);

        void h0(@k CampaignOptionCopy campaignOptionCopy);
    }

    void Ey(@k List<CampaignOption> list, @k b bVar);
}
