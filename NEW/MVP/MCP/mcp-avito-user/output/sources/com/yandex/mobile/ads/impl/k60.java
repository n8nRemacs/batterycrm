package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class k60 implements ag1<VideoAd> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final v40 f387062a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final VideoAd f387063b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private a f387064c;

    public static class a implements InstreamAdPlayerListener {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final j60 f387065a = new j60();

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final dg1 f387066b;

        public a(@j.N pf1 pf1Var) {
            this.f387066b = pf1Var;
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdBufferingFinished(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.a();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdBufferingStarted(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.b();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdCompleted(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.d();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdPaused(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.i();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdPrepared(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.h();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdResumed(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.f();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdSkipped(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.g();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdStarted(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.c();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdStopped(@j.N VideoAd videoAd) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.e();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onError(@j.N VideoAd videoAd, @j.N InstreamAdPlayerError instreamAdPlayerError) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            this.f387065a.getClass();
            dg1Var.a(j60.a(instreamAdPlayerError));
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onVolumeChanged(@j.N VideoAd videoAd, float f12) {
            dg1 dg1Var = this.f387066b;
            videoAd.getMediaFile();
            dg1Var.onVolumeChanged(f12);
        }
    }

    public k60(@j.N VideoAd videoAd, @j.N v40 v40Var) {
        this.f387063b = videoAd;
        this.f387062a = v40Var;
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final void a(@j.N ff1<VideoAd> ff1Var) {
        this.f387062a.g(ff1Var.c());
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final void b() {
        this.f387062a.k(this.f387063b);
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final void c() {
        this.f387062a.i(this.f387063b);
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final long d() {
        return this.f387062a.a(this.f387063b);
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final void e() {
        this.f387062a.f(this.f387063b);
    }

    public final void f() {
        this.f387062a.h(this.f387063b);
    }

    public final void g() {
        this.f387062a.j(this.f387063b);
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final long getAdPosition() {
        return this.f387062a.b(this.f387063b);
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final float getVolume() {
        return this.f387062a.c(this.f387063b);
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final boolean isPlayingAd() {
        return this.f387062a.d(this.f387063b);
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final void a() {
        this.f387062a.e(this.f387063b);
    }

    public final void a(float f12) {
        this.f387062a.a(this.f387063b, f12);
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    public final void a(@j.P pf1 pf1Var) {
        a aVar = this.f387064c;
        if (aVar != null) {
            this.f387062a.b(this.f387063b, aVar);
            this.f387064c = null;
        }
        if (pf1Var != null) {
            a aVar2 = new a(pf1Var);
            this.f387064c = aVar2;
            this.f387062a.a(this.f387063b, aVar2);
        }
    }
}
