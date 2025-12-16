package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class vf1 implements VideoAdPlaybackListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private VideoAdPlaybackListener f390867a;

    public final void a(@Y61.l VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f390867a = videoAdPlaybackListener;
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdClicked(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdClicked(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdCompleted(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdError(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdError(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdPaused(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdPrepared(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdPrepared(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdResumed(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdSkipped(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdStarted(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdStopped(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onImpression(@Y61.k VideoAd videoAd) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onImpression(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onVolumeChanged(@Y61.k VideoAd videoAd, float f12) {
        VideoAdPlaybackListener videoAdPlaybackListener = this.f390867a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onVolumeChanged(videoAd, f12);
        }
    }
}
