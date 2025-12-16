package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class v40 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InstreamAdPlayer f390791a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final w40 f390792b = new w40();

    public v40(@j.N InstreamAdPlayer instreamAdPlayer) {
        this.f390791a = instreamAdPlayer;
    }

    public final void a(@j.N VideoAd videoAd, float f12) {
        this.f390791a.setVolume(videoAd, f12);
    }

    public final void b(@j.N VideoAd videoAd, @j.N InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f390792b.b(videoAd, instreamAdPlayerListener);
    }

    public final float c(@j.N VideoAd videoAd) {
        return this.f390791a.getVolume(videoAd);
    }

    public final boolean d(@j.N VideoAd videoAd) {
        return this.f390791a.isPlayingAd(videoAd);
    }

    public final void e(@j.N VideoAd videoAd) {
        this.f390791a.pauseAd(videoAd);
    }

    public final void f(@j.N VideoAd videoAd) {
        this.f390791a.playAd(videoAd);
    }

    public final void g(@j.N VideoAd videoAd) {
        this.f390791a.prepareAd(videoAd);
    }

    public final void h(@j.N VideoAd videoAd) {
        this.f390791a.releaseAd(videoAd);
    }

    public final void i(@j.N VideoAd videoAd) {
        this.f390791a.resumeAd(videoAd);
    }

    public final void j(@j.N VideoAd videoAd) {
        this.f390791a.skipAd(videoAd);
    }

    public final void k(@j.N VideoAd videoAd) {
        this.f390791a.stopAd(videoAd);
    }

    public final void a(@j.N VideoAd videoAd, @j.N InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f390792b.a(videoAd, instreamAdPlayerListener);
    }

    public final void b() {
        this.f390791a.setInstreamAdPlayerListener(null);
        this.f390792b.a();
    }

    public final void a() {
        this.f390791a.setInstreamAdPlayerListener(this.f390792b);
    }

    public final long a(@j.N VideoAd videoAd) {
        return this.f390791a.getAdDuration(videoAd);
    }

    public final long b(@j.N VideoAd videoAd) {
        return this.f390791a.getAdPosition(videoAd);
    }
}
