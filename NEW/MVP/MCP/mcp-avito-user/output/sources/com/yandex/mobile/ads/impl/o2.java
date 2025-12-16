package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h50 f388420a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final qe1 f388421b;

    public o2(@j.N h50 h50Var, @j.N re1 re1Var) {
        this.f388420a = h50Var;
        this.f388421b = re1Var;
    }

    public final void a(@j.N VideoAd videoAd, float f12) {
        this.f388421b.onVolumeChanged(videoAd, f12);
    }

    public final void b(@j.N VideoAd videoAd) {
        this.f388421b.onAdError(videoAd);
    }

    public final void c(@j.N VideoAd videoAd) {
        this.f388421b.onAdPaused(videoAd);
    }

    public final void d(@j.N VideoAd videoAd) {
        this.f388421b.a(new n40(this.f388420a, videoAd));
    }

    public final void e(@j.N VideoAd videoAd) {
        this.f388421b.onAdResumed(videoAd);
    }

    public final void f(@j.N VideoAd videoAd) {
        this.f388421b.onAdSkipped(videoAd);
    }

    public final void g(@j.N VideoAd videoAd) {
        this.f388421b.onAdStarted(videoAd);
    }

    public final void h(@j.N VideoAd videoAd) {
        this.f388421b.onAdStopped(videoAd);
    }

    public final void i(@j.N VideoAd videoAd) {
        this.f388421b.a(videoAd);
    }

    public final void a(@j.N VideoAd videoAd) {
        this.f388421b.onAdCompleted(videoAd);
    }

    public final void a() {
        this.f388420a.a((se1) null);
    }
}
