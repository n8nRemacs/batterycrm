package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public interface qe1 {
    void a(@j.N n40 n40Var);

    void a(@j.N VideoAd videoAd);

    void onAdClicked(@j.N VideoAd videoAd);

    void onAdCompleted(@j.N VideoAd videoAd);

    void onAdError(@j.N VideoAd videoAd);

    void onAdPaused(@j.N VideoAd videoAd);

    void onAdResumed(@j.N VideoAd videoAd);

    void onAdSkipped(@j.N VideoAd videoAd);

    void onAdStarted(@j.N VideoAd videoAd);

    void onAdStopped(@j.N VideoAd videoAd);

    void onVolumeChanged(@j.N VideoAd videoAd, float f12);
}
