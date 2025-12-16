package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class xf1 implements qe1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ VideoAdPlaybackListener f391716a;

    public xf1(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f391716a = videoAdPlaybackListener;
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void a(@Y61.k n40 n40Var) {
        this.f391716a.onAdPrepared(n40Var.a());
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdClicked(@Y61.k VideoAd videoAd) {
        this.f391716a.onAdClicked(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdCompleted(@Y61.k VideoAd videoAd) {
        this.f391716a.onAdCompleted(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdError(@Y61.k VideoAd videoAd) {
        this.f391716a.onAdError(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdPaused(@Y61.k VideoAd videoAd) {
        this.f391716a.onAdPaused(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdResumed(@Y61.k VideoAd videoAd) {
        this.f391716a.onAdResumed(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdSkipped(@Y61.k VideoAd videoAd) {
        this.f391716a.onAdSkipped(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdStarted(@Y61.k VideoAd videoAd) {
        this.f391716a.onAdStarted(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdStopped(@Y61.k VideoAd videoAd) {
        this.f391716a.onAdStopped(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onVolumeChanged(@Y61.k VideoAd videoAd, float f12) {
        this.f391716a.onVolumeChanged(videoAd, f12);
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void a(@Y61.k VideoAd videoAd) {
        this.f391716a.onImpression(videoAd);
    }
}
