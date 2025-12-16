package com.yandex.mobile.ads.video.playback;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public interface VideoAdPlaybackListener {
    void onAdClicked(@N VideoAd videoAd);

    void onAdCompleted(@N VideoAd videoAd);

    void onAdError(@N VideoAd videoAd);

    void onAdPaused(@N VideoAd videoAd);

    void onAdPrepared(@N VideoAd videoAd);

    void onAdResumed(@N VideoAd videoAd);

    void onAdSkipped(@N VideoAd videoAd);

    void onAdStarted(@N VideoAd videoAd);

    void onAdStopped(@N VideoAd videoAd);

    void onImpression(@N VideoAd videoAd);

    void onVolumeChanged(@N VideoAd videoAd, float f12);
}
