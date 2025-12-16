package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class l60 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ad1<VideoAd> f387390a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final k60 f387391b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ff1<VideoAd> f387392c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final w20 f387393d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final z50 f387394e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final m60 f387395f;

    public l60(@j.N Context context, @j.N v40 v40Var, @j.N l50 l50Var, @j.N p60 p60Var, @j.N ff1 ff1Var, @j.N qg1 qg1Var, @j.N ti1 ti1Var, @j.N w20 w20Var, @j.N qf1 qf1Var) {
        this.f387393d = w20Var;
        this.f387392c = ff1Var;
        this.f387394e = new z50(new q20(context), new a4());
        m60 m60Var = new m60(qf1Var);
        this.f387395f = m60Var;
        VideoAd videoAd = (VideoAd) ff1Var.c();
        b70 b70Var = new b70(l50Var);
        k60 k60Var = new k60(videoAd, v40Var);
        this.f387391b = k60Var;
        hg1 hg1Var = new hg1();
        new b50(videoAd, b70Var, k60Var, l50Var, qg1Var).a(hg1Var);
        ad1<VideoAd> ad1Var = new ad1<>(context, k60Var, b70Var, ff1Var, new a70(p60Var, ff1Var, qg1Var, b70Var), qg1Var, ti1Var, hg1Var, m60Var);
        this.f387390a = ad1Var;
        q40 q40Var = new q40(videoAd);
        k40 k40Var = new k40(p60Var);
        ad1Var.a(q40Var);
        ad1Var.a(k40Var);
    }

    public final void a() {
        this.f387390a.a();
        this.f387394e.getClass();
    }

    public final void b() {
        this.f387390a.b();
    }

    public final void c() {
        this.f387390a.c();
    }

    public final void d() {
        this.f387390a.d();
        this.f387394e.a(this.f387392c, this.f387393d, this.f387395f);
    }

    public final void e() {
        this.f387391b.f();
        this.f387395f.a();
    }

    public final void f() {
        this.f387390a.e();
    }

    public final void g() {
        this.f387390a.f();
        this.f387395f.a();
    }
}
