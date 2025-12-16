package com.avito.android.advert.item.marketplace_rewards;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.rewards.RewardsBackground;
import com.avito.android.remote.model.rewards.RewardsBannerBadge;
import com.avito.android.remote.model.rewards.RewardsButton;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MarketplaceRewardsBannerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_rewards/i;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface i extends TV0.e {

    /* compiled from: MarketplaceRewardsBannerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void F5();

    void P6();

    void aM(@k RewardsBackground rewardsBackground);

    void i(@l UniversalImage universalImage);

    void j0(int i12);

    void k(@l AttributedText attributedText);

    void qT(@l RewardsBannerBadge rewardsBannerBadge);

    void setTitle(@l String str);

    void vp(@l RewardsButton rewardsButton, @k Y41.a<G0> aVar);

    void x8(@k AttributedText attributedText);

    void y7();
}
