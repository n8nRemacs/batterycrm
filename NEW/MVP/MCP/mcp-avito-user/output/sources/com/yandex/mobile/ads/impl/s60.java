package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class s60 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final t60 f389795a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xo f389796b;

    public s60(@j.N t60 t60Var, @j.N rt0 rt0Var) {
        this.f389795a = t60Var;
        this.f389796b = new xo(rt0Var);
    }

    @j.N
    public final t50 a(@j.N ff1<VideoAd> ff1Var) {
        t50 t50VarA = this.f389795a.a(ff1Var);
        return t50VarA == null ? this.f389796b.a() : t50VarA;
    }
}
