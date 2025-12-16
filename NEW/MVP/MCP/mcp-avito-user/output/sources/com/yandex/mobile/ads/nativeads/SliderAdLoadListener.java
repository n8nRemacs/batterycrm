package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public interface SliderAdLoadListener {
    void onSliderAdFailedToLoad(@N AdRequestError adRequestError);

    void onSliderAdLoaded(@N SliderAd sliderAd);
}
