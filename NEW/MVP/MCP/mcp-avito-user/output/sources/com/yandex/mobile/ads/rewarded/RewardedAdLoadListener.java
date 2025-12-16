package com.yandex.mobile.ads.rewarded;

import com.yandex.mobile.ads.common.AdRequestError;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public interface RewardedAdLoadListener {
    void onAdFailedToLoad(@N AdRequestError adRequestError);

    void onAdLoaded(@N RewardedAd rewardedAd);
}
