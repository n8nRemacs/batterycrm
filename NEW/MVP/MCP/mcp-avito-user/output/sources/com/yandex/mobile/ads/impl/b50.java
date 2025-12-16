package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class b50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final t41 f383786a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final dv0 f383787b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final d70 f383788c;

    public b50(@Y61.k VideoAd videoAd, @Y61.k b70 b70Var, @Y61.k k60 k60Var, @Y61.k l50 l50Var, @Y61.k qg1 qg1Var) {
        this.f383786a = new t41(l50Var, videoAd);
        this.f383787b = new dv0(l50Var);
        this.f383788c = new d70(k60Var, b70Var, qg1Var);
    }

    public final void a(@Y61.k hg1 hg1Var) {
        hg1Var.a(this.f383786a, this.f383787b, this.f383788c);
    }
}
