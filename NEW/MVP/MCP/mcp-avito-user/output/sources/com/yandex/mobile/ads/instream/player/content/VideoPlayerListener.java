package com.yandex.mobile.ads.instream.player.content;

import j.K;

@K
/* loaded from: classes8.dex */
public interface VideoPlayerListener {
    void onVideoCompleted();

    void onVideoError();

    void onVideoPaused();

    void onVideoPrepared();

    void onVideoResumed();
}
