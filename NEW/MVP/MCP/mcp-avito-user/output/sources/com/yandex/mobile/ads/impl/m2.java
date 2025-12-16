package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.a;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f387827a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final h4 f387828b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final m4 f387829c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final xf f387830d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final wt f387831e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final qt0 f387832f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final ot0 f387833g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final j4 f387834h = new j4();

    public m2(@j.N xf xfVar, @j.N t6 t6Var, @j.N nt0 nt0Var, @j.N m4 m4Var) {
        this.f387830d = xfVar;
        this.f387827a = t6Var.b();
        this.f387828b = t6Var.c();
        this.f387831e = nt0Var.c();
        this.f387833g = nt0Var.d();
        this.f387832f = nt0Var.e();
        this.f387829c = m4Var;
    }

    public final void a(@j.N q3 q3Var, @j.N VideoAd videoAd) {
        if (this.f387830d.b()) {
            if (f50.f385172a.equals(this.f387827a.a(videoAd))) {
                com.google.android.exoplayer2.source.ads.a aVarA = this.f387828b.a();
                if (aVarA.d(q3Var.a(), q3Var.b())) {
                    return;
                }
                this.f387827a.a(videoAd, f50.f385176e);
                this.f387828b.a(aVarA.g(q3Var.a(), q3Var.b()));
                return;
            }
            if (this.f387831e.b()) {
                int iA2 = q3Var.a();
                int iB2 = q3Var.b();
                com.google.android.exoplayer2.source.ads.a aVarA2 = this.f387828b.a();
                boolean zD2 = aVarA2.d(iA2, iB2);
                this.f387834h.getClass();
                boolean zA2 = j4.a(aVarA2, iA2, iB2);
                if (!zD2 && !zA2) {
                    this.f387827a.a(videoAd, f50.f385178g);
                    int i12 = iA2 - aVarA2.f346186f;
                    a.b[] bVarArr = aVarA2.f346187g;
                    a.b[] bVarArr2 = (a.b[]) com.google.android.exoplayer2.util.U.J(bVarArr.length, bVarArr);
                    bVarArr2[i12] = bVarArr2[i12].d(3, iB2);
                    this.f387828b.a(new com.google.android.exoplayer2.source.ads.a(aVarA2.f346182b, bVarArr2, aVarA2.f346184d, aVarA2.f346185e, aVarA2.f346186f).f(0L));
                    if (!this.f387833g.c()) {
                        this.f387827a.a((st0) null);
                    }
                }
                this.f387832f.b();
                this.f387829c.onAdCompleted(videoAd);
            }
        }
    }
}
