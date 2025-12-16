package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
final class tb1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final rb1 f390149a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final t60 f390150b = new t60();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final rt0 f390151c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final v40 f390152d;

    public tb1(@j.N rt0 rt0Var, @j.N v40 v40Var, @j.N o40 o40Var) {
        this.f390151c = rt0Var;
        this.f390152d = v40Var;
        this.f390149a = new rb1(o40Var);
    }

    @j.N
    public final sb1 a(@j.N Context context, @j.N k50 k50Var, @j.N p60 p60Var, @j.N ff1 ff1Var, @j.N ri1 ri1Var, @j.N hs0 hs0Var, @j.N re1 re1Var) {
        k60 k60Var = new k60((VideoAd) ff1Var.c(), this.f390152d);
        return new sb1(k50Var, this.f390149a.a(context, p60Var, ff1Var, k60Var, ri1Var, hs0Var, re1Var), ff1Var, this.f390150b, this.f390151c, k60Var);
    }
}
