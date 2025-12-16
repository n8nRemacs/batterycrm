package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class it0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f386686a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final m4 f386687b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final t7 f386688c = new t7();

    public it0(@j.N u6 u6Var, @j.N m4 m4Var) {
        this.f386686a = u6Var;
        this.f386687b = m4Var;
    }

    public final void a(@j.P Exception exc) {
        InstreamAdPlayerError instreamAdPlayerError;
        st0 st0VarB = this.f386686a.b();
        if (st0VarB == null) {
            return;
        }
        VideoAd videoAdB = st0VarB.b();
        if (f50.f385172a.equals(this.f386686a.a(videoAdB))) {
            return;
        }
        if (exc != null) {
            this.f386688c.getClass();
            instreamAdPlayerError = t7.c(exc);
        } else {
            instreamAdPlayerError = new InstreamAdPlayerError(InstreamAdPlayerError.Reason.UNKNOWN, new op());
        }
        this.f386687b.onError(videoAdB, instreamAdPlayerError);
    }
}
