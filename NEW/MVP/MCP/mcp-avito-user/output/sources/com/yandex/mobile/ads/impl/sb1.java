package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
final class sb1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final k50 f389856a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final qb1 f389857b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ff1<VideoAd> f389858c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final s60 f389859d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final r60 f389860e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private t50 f389861f;

    public sb1(@j.N k50 k50Var, @j.N qb1 qb1Var, @j.N ff1<VideoAd> ff1Var, @j.N t60 t60Var, @j.N rt0 rt0Var, @j.N k60 k60Var) {
        this.f389856a = k50Var;
        this.f389857b = qb1Var;
        this.f389858c = ff1Var;
        this.f389859d = new s60(t60Var, rt0Var);
        this.f389860e = new r60(t60Var, k60Var);
    }

    public final void a() {
        lu luVarB = this.f389856a.b();
        if (this.f389861f != null || luVarB == null) {
            return;
        }
        t50 t50VarA = this.f389859d.a(this.f389858c);
        this.f389861f = t50VarA;
        this.f389857b.a(luVarB, t50VarA);
    }

    public final void b() {
        lu luVarB = this.f389856a.b();
        t50 t50Var = this.f389861f;
        if (t50Var == null || luVarB == null) {
            return;
        }
        this.f389860e.b(this.f389858c, luVarB, t50Var);
        this.f389861f = null;
        this.f389857b.a(luVarB);
    }

    public final void a(@j.N ff1<VideoAd> ff1Var) {
        lu luVarB = this.f389856a.b();
        t50 t50Var = this.f389861f;
        if (t50Var == null || luVarB == null) {
            return;
        }
        this.f389860e.a(ff1Var, luVarB, t50Var);
    }
}
