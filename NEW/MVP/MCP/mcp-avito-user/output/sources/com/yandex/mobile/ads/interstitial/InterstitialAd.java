package com.yandex.mobile.ads.interstitial;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public interface InterstitialAd {
    @N
    AdInfo getInfo();

    void setAdEventListener(@P InterstitialAdEventListener interstitialAdEventListener);

    void show(@N Activity activity);
}
