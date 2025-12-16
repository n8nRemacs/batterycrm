package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class m4 implements InstreamAdPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final s6 f387841a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private InstreamAdPlayerListener f387842b;

    public m4(@j.N s6 s6Var) {
        this.f387841a = s6Var;
    }

    public final void a(@j.P InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f387842b = instreamAdPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingFinished(@j.N VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdBufferingFinished(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingStarted(@j.N VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdBufferingStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdCompleted(@j.N VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPaused(@j.N VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPrepared(@j.N VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdPrepared(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdResumed(@j.N VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdSkipped(@j.N VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStarted(@j.N VideoAd videoAd) {
        this.f387841a.a();
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStopped(@j.N VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onError(@j.N VideoAd videoAd, @j.N InstreamAdPlayerError instreamAdPlayerError) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onError(videoAd, instreamAdPlayerError);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onVolumeChanged(@j.N VideoAd videoAd, float f12) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f387842b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onVolumeChanged(videoAd, f12);
        }
    }
}
