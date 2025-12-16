package com.yandex.mobile.ads.video.playback.model;

import j.N;
import j.P;

/* loaded from: classes8.dex */
public interface VideoAd {
    @N
    AdPodInfo getAdPodInfo();

    long getDuration();

    @P
    String getInfo();

    @N
    MediaFile getMediaFile();

    @P
    SkipInfo getSkipInfo();
}
