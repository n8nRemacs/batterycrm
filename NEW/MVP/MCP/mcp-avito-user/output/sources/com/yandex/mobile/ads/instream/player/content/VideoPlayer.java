package com.yandex.mobile.ads.instream.player.content;

import j.K;
import j.P;

@K
/* loaded from: classes8.dex */
public interface VideoPlayer {
    long getVideoDuration();

    long getVideoPosition();

    float getVolume();

    void pauseVideo();

    void prepareVideo();

    void resumeVideo();

    void setVideoPlayerListener(@P VideoPlayerListener videoPlayerListener);
}
