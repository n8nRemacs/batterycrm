package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class re1 implements qe1 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private qe1 f389523a;

    public final void a(@j.P qe1 qe1Var) {
        this.f389523a = qe1Var;
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdClicked(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onAdClicked(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdCompleted(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdError(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onAdError(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdPaused(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdResumed(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdSkipped(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdStarted(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdStopped(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onVolumeChanged(@j.N VideoAd videoAd, float f12) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.onVolumeChanged(videoAd, f12);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void a(@j.N n40 n40Var) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.a(n40Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void a(@j.N VideoAd videoAd) {
        qe1 qe1Var = this.f389523a;
        if (qe1Var != null) {
            qe1Var.a(videoAd);
        }
    }
}
