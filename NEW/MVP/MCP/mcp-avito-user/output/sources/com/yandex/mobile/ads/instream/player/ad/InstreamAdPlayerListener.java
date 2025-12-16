package com.yandex.mobile.ads.instream.player.ad;

import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public interface InstreamAdPlayerListener {
    void onAdBufferingFinished(@N VideoAd videoAd);

    void onAdBufferingStarted(@N VideoAd videoAd);

    void onAdCompleted(@N VideoAd videoAd);

    void onAdPaused(@N VideoAd videoAd);

    void onAdPrepared(@N VideoAd videoAd);

    void onAdResumed(@N VideoAd videoAd);

    void onAdSkipped(@N VideoAd videoAd);

    void onAdStarted(@N VideoAd videoAd);

    void onAdStopped(@N VideoAd videoAd);

    void onError(@N VideoAd videoAd, @N InstreamAdPlayerError instreamAdPlayerError);

    void onVolumeChanged(@N VideoAd videoAd, float f12);
}
