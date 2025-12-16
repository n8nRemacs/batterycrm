package com.yandex.mobile.ads.instream.player.ad;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public interface InstreamAdPlayer {
    long getAdDuration(@N VideoAd videoAd);

    long getAdPosition(@N VideoAd videoAd);

    float getVolume(@N VideoAd videoAd);

    boolean isPlayingAd(@N VideoAd videoAd);

    void pauseAd(@N VideoAd videoAd);

    void playAd(@N VideoAd videoAd);

    void prepareAd(@N VideoAd videoAd);

    void releaseAd(@N VideoAd videoAd);

    void resumeAd(@N VideoAd videoAd);

    void setInstreamAdPlayerListener(@P InstreamAdPlayerListener instreamAdPlayerListener);

    void setVolume(@N VideoAd videoAd, float f12);

    void skipAd(@N VideoAd videoAd);

    void stopAd(@N VideoAd videoAd);
}
