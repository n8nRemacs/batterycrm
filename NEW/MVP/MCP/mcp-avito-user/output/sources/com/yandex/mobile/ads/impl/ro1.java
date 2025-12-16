package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* loaded from: classes8.dex */
public final class ro1 implements VideoPlayer {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final jv0 f389599a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final qt0 f389600b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final wh1 f389601c;

    public ro1(@j.N bv0 bv0Var, @j.N qt0 qt0Var, @j.N wh1 wh1Var) {
        this.f389599a = bv0Var;
        this.f389600b = qt0Var;
        this.f389601c = wh1Var;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final long getVideoDuration() {
        return this.f389599a.a().a();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final long getVideoPosition() {
        return this.f389599a.a().b();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final float getVolume() {
        Float fA2 = this.f389600b.a();
        if (fA2 != null) {
            return fA2.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void pauseVideo() {
        this.f389601c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void prepareVideo() {
        this.f389601c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void resumeVideo() {
        this.f389601c.onVideoResumed();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void setVideoPlayerListener(@j.P VideoPlayerListener videoPlayerListener) {
        this.f389601c.a(videoPlayerListener);
    }
}
