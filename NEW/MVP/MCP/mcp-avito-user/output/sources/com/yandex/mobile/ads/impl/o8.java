package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ff1<VideoAd> f388456a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final p8 f388457b;

    public o8(@j.N ff1<VideoAd> ff1Var) {
        this.f388456a = ff1Var;
        this.f388457b = new p8(ff1Var.e());
    }

    @j.N
    public final n8 a() {
        int iA2 = new o61(this.f388457b).a(this.f388456a);
        return n6.a(2, iA2) ? new z51(this.f388456a.d()) : n6.a(3, iA2) ? new js() : new Cdo();
    }
}
