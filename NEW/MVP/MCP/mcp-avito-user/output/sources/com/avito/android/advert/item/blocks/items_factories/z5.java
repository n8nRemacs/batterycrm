package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.R;
import com.avito.android.advert.item.marketplace_rewards.MarketplaceRewardsBannerItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.rewards.RewardsBanner;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarketplaceRewardsBannerItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/z5;", "Lcom/avito/android/advert/item/blocks/items_factories/y5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class z5 implements y5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74092a;

    @Inject
    public z5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74092a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.y5
    @Y61.l
    public final MarketplaceRewardsBannerItem a(@Y61.k AdvertDetails advertDetails) {
        RewardsBanner rewardsBanner = advertDetails.getRewardsBanner();
        if (rewardsBanner == null) {
            return null;
        }
        return new MarketplaceRewardsBannerItem(0L, null, rewardsBanner, R.style.MarketplaceRewardsBanner, this.f74092a.a(), null, null, 99, null);
    }
}
