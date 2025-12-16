package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* loaded from: classes8.dex */
public final class d60 implements Inroll, Pauseroll {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ra0 f384533a;

    public d60(@j.N ra0 ra0Var) {
        this.f384533a = ra0Var;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    @j.N
    public final InstreamAdBreak getInstreamAdBreak() {
        return this.f384533a.getInstreamAdBreak();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        this.f384533a.invalidate();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        this.f384533a.pause();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(@j.N InstreamAdView instreamAdView) {
        this.f384533a.play(instreamAdView);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(@j.N InstreamAdPlayer instreamAdPlayer) {
        this.f384533a.prepare(instreamAdPlayer);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        this.f384533a.resume();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(@j.P InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f384533a.setListener(instreamAdBreakEventListener);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(@j.P VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f384533a.setVideoAdPlaybackListener(videoAdPlaybackListener);
    }
}
