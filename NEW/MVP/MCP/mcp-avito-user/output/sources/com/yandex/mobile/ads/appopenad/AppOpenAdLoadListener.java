package com.yandex.mobile.ads.appopenad;

import com.yandex.mobile.ads.common.AdRequestError;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public interface AppOpenAdLoadListener {
    void onAdFailedToLoad(@N AdRequestError adRequestError);

    void onAdLoaded(@N AppOpenAd appOpenAd);
}
