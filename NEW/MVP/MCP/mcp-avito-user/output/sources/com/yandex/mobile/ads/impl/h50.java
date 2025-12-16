package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class h50 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f385904a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final l50 f385905b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final o40 f385906c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final tb1 f385907d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private sb1 f385908e;

    public h50(@j.N Context context, @j.N l50 l50Var, @j.N rt0 rt0Var, @j.N v40 v40Var) {
        this.f385904a = context.getApplicationContext();
        this.f385905b = l50Var;
        o40 o40Var = new o40();
        this.f385906c = o40Var;
        this.f385907d = new tb1(rt0Var, v40Var, o40Var);
    }

    public final void a(@j.P se1 se1Var) {
        this.f385906c.a(se1Var);
    }

    public final void a(@j.N p60 p60Var, @j.N ff1 ff1Var, @j.N ri1 ri1Var, @j.N re1 re1Var, @j.N hs0 hs0Var) {
        a();
        k50 k50VarA = this.f385905b.a();
        if (k50VarA != null) {
            sb1 sb1VarA = this.f385907d.a(this.f385904a, k50VarA, p60Var, ff1Var, ri1Var, hs0Var, re1Var);
            this.f385908e = sb1VarA;
            sb1VarA.a();
        }
    }

    public final void a() {
        sb1 sb1Var = this.f385908e;
        if (sb1Var != null) {
            sb1Var.b();
            this.f385908e = null;
        }
    }

    public final void a(@j.N ff1<VideoAd> ff1Var) {
        sb1 sb1Var = this.f385908e;
        if (sb1Var != null) {
            sb1Var.a(ff1Var);
        }
    }
}
