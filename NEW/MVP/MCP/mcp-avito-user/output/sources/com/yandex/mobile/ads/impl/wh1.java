package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* loaded from: classes8.dex */
public final class wh1 implements VideoPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private VideoPlayerListener f391418a;

    public final void a(@j.P VideoPlayerListener videoPlayerListener) {
        this.f391418a = videoPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        VideoPlayerListener videoPlayerListener = this.f391418a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        VideoPlayerListener videoPlayerListener = this.f391418a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        VideoPlayerListener videoPlayerListener = this.f391418a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        VideoPlayerListener videoPlayerListener = this.f391418a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoPrepared();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        VideoPlayerListener videoPlayerListener = this.f391418a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoResumed();
        }
    }
}
