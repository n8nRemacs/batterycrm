package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class jt implements InstreamAdPlayer {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f386967a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final m4 f386968b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final o4 f386969c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final n4 f386970d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ot0 f386971e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final qt0 f386972f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final jv0 f386973g;

    public jt(@j.N u6 u6Var, @j.N nt0 nt0Var, @j.N bv0 bv0Var, @j.N o4 o4Var, @j.N n4 n4Var, @j.N m4 m4Var) {
        this.f386967a = u6Var;
        this.f386971e = nt0Var.d();
        this.f386972f = nt0Var.e();
        this.f386973g = bv0Var;
        this.f386969c = o4Var;
        this.f386970d = n4Var;
        this.f386968b = m4Var;
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final long getAdDuration(@j.N VideoAd videoAd) {
        return this.f386973g.a().a();
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final long getAdPosition(@j.N VideoAd videoAd) {
        return this.f386973g.a().b();
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final float getVolume(@j.N VideoAd videoAd) {
        Float fA2 = this.f386972f.a();
        if (fA2 != null) {
            return fA2.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final boolean isPlayingAd(@j.N VideoAd videoAd) {
        return this.f386967a.a(videoAd) != f50.f385172a && this.f386971e.c();
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void pauseAd(@j.N VideoAd videoAd) {
        try {
            this.f386970d.c(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void playAd(@j.N VideoAd videoAd) {
        try {
            this.f386970d.d(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void prepareAd(@j.N VideoAd videoAd) {
        try {
            this.f386969c.a(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void resumeAd(@j.N VideoAd videoAd) {
        try {
            this.f386970d.e(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void setInstreamAdPlayerListener(@j.P InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f386968b.a(instreamAdPlayerListener);
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void setVolume(@j.N VideoAd videoAd, float f12) {
        this.f386972f.a(f12);
        this.f386968b.onVolumeChanged(videoAd, f12);
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void skipAd(@j.N VideoAd videoAd) {
        try {
            this.f386970d.f(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void stopAd(@j.N VideoAd videoAd) {
        try {
            this.f386970d.g(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void releaseAd(@j.N VideoAd videoAd) {
    }
}
