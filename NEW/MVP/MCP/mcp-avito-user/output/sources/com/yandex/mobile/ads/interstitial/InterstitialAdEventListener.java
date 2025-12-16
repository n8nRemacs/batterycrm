package com.yandex.mobile.ads.interstitial;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public interface InterstitialAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(@N AdError adError);

    void onAdImpression(@P ImpressionData impressionData);

    void onAdShown();
}
