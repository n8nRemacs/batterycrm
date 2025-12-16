package com.avito.android.advert.item.marketplace_rewards;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.rewards.RewardsBanner;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MarketplaceRewardsBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_rewards/g;", "Lcom/avito/android/advert/item/marketplace_rewards/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f77481b;

    @Inject
    public g(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f77481b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        i iVar = (i) eVar;
        MarketplaceRewardsBannerItem marketplaceRewardsBannerItem = (MarketplaceRewardsBannerItem) aVar;
        iVar.j0(marketplaceRewardsBannerItem.f77468e);
        RewardsBanner rewardsBanner = marketplaceRewardsBannerItem.f77467d;
        AttributedText attributedTitle = rewardsBanner.getAttributedTitle();
        if (attributedTitle != null) {
            iVar.x8(attributedTitle);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            iVar.setTitle(rewardsBanner.getTitle());
        }
        iVar.k(rewardsBanner.getSubtitle());
        iVar.i(rewardsBanner.getImage());
        iVar.aM(rewardsBanner.getBackground());
        iVar.qT(rewardsBanner.getBannerBadge());
        iVar.vp(rewardsBanner.getButton(), new f(rewardsBanner, this));
        iVar.y7();
        iVar.P6();
        iVar.F5();
    }
}
