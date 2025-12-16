package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.a;

/* loaded from: classes8.dex */
public final class fh1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h4 f385326a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final eh1 f385327b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final wh1 f385328c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f385329d;

    public fh1(@j.N h4 h4Var, @j.N hh1 hh1Var, @j.N hu0 hu0Var, @j.N wh1 wh1Var) {
        this.f385326a = h4Var;
        this.f385328c = wh1Var;
        this.f385327b = new eh1(hu0Var, hh1Var);
    }

    public final void a() {
        if (this.f385329d) {
            return;
        }
        this.f385329d = true;
        com.google.android.exoplayer2.source.ads.a aVarA = this.f385326a.a();
        for (int i12 = 0; i12 < aVarA.f346183c; i12++) {
            a.b bVarA = aVarA.a(i12);
            if (bVarA.f346189b != Long.MIN_VALUE) {
                if (bVarA.f346190c < 0) {
                    aVarA = aVarA.e(i12, 1);
                }
                aVarA = aVarA.h(i12);
                this.f385326a.a(aVarA);
            }
        }
        this.f385328c.onVideoCompleted();
    }

    public final boolean b() {
        return this.f385329d;
    }

    public final void c() {
        if (this.f385327b.a()) {
            a();
        }
    }
}
