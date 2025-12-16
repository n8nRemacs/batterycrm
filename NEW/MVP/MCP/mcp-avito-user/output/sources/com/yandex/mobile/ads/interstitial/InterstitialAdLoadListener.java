package com.yandex.mobile.ads.interstitial;

import com.yandex.mobile.ads.common.AdRequestError;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public interface InterstitialAdLoadListener {
    void onAdFailedToLoad(@N AdRequestError adRequestError);

    void onAdLoaded(@N InterstitialAd interstitialAd);
}
