package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class mt0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f388083a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final m2 f388084b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final fh1 f388085c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final m4 f388086d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f388087e = false;

    public mt0(@j.N u6 u6Var, @j.N m2 m2Var, @j.N fh1 fh1Var, @j.N m4 m4Var) {
        this.f388083a = u6Var;
        this.f388084b = m2Var;
        this.f388085c = fh1Var;
        this.f388086d = m4Var;
    }

    public final void a(boolean z12, int i12) {
        st0 st0VarB = this.f388083a.b();
        if (st0VarB == null) {
            return;
        }
        VideoAd videoAdB = st0VarB.b();
        q3 q3VarA = st0VarB.a();
        if (f50.f385172a.equals(this.f388083a.a(videoAdB))) {
            if (z12 && i12 == 2) {
                this.f388085c.c();
                return;
            }
            return;
        }
        if (i12 == 2) {
            this.f388087e = true;
            this.f388086d.onAdBufferingStarted(videoAdB);
        } else if (i12 == 3 && this.f388087e) {
            this.f388087e = false;
            this.f388086d.onAdBufferingFinished(videoAdB);
        } else if (i12 == 4) {
            this.f388084b.a(q3VarA, videoAdB);
        }
    }
}
