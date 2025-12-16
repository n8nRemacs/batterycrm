package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public interface NativeAdLoadListener {
    void onAdFailedToLoad(@N AdRequestError adRequestError);

    void onAdLoaded(@N NativeAd nativeAd);
}
