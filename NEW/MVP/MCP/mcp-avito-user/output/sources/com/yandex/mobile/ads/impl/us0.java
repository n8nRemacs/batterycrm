package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class us0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final m2 f390623a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final f4 f390624b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final u3 f390625c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final xf f390626d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ot0 f390627e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final wt f390628f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final ki1 f390629g;

    /* renamed from: h, reason: collision with root package name */
    private int f390630h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f390631i = -1;

    public us0(@j.N xf xfVar, @j.N nt0 nt0Var, @j.N t6 t6Var, @j.N fh1 fh1Var, @j.N xu xuVar, @j.N m2 m2Var) {
        this.f390626d = xfVar;
        ot0 ot0VarD = nt0Var.d();
        this.f390627e = ot0VarD;
        this.f390628f = nt0Var.c();
        this.f390625c = t6Var.a();
        this.f390623a = m2Var;
        this.f390629g = new ki1(ot0VarD, fh1Var);
        this.f390624b = new f4(t6Var, xuVar, fh1Var);
    }

    public final void a() {
        com.google.android.exoplayer2.d0 d0VarA = this.f390628f.a();
        if (!this.f390626d.b() || d0VarA == null) {
            return;
        }
        this.f390629g.a(d0VarA);
        boolean zC2 = this.f390627e.c();
        boolean zIsPlayingAd = d0VarA.isPlayingAd();
        int currentAdGroupIndex = d0VarA.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = d0VarA.getCurrentAdIndexInAdGroup();
        this.f390627e.a(zIsPlayingAd);
        int i12 = zIsPlayingAd ? currentAdGroupIndex : this.f390630h;
        int i13 = this.f390631i;
        this.f390631i = currentAdIndexInAdGroup;
        this.f390630h = currentAdGroupIndex;
        q3 q3Var = new q3(i12, i13);
        VideoAd videoAdA = this.f390625c.a(q3Var);
        boolean z12 = zC2 && (currentAdIndexInAdGroup == -1 || i13 < currentAdIndexInAdGroup);
        if (videoAdA != null && z12) {
            this.f390623a.a(q3Var, videoAdA);
        }
        this.f390624b.a(d0VarA, zC2);
    }
}
