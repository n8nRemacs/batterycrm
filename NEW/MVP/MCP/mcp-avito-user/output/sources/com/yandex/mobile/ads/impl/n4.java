package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.C36585a;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f388154a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final u3 f388155b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final m4 f388156c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ot0 f388157d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ht0 f388158e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final l4 f388159f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final h60 f388160g = h60.a();

    public n4(@j.N t6 t6Var, @j.N nt0 nt0Var, @j.N m4 m4Var) {
        this.f388154a = t6Var.b();
        this.f388155b = t6Var.a();
        this.f388157d = nt0Var.d();
        this.f388158e = nt0Var.b();
        this.f388156c = m4Var;
        this.f388159f = new l4(t6Var, nt0Var);
    }

    public final void c(@j.N VideoAd videoAd) {
        if (f50.f385174c.equals(this.f388154a.a(videoAd))) {
            this.f388154a.a(videoAd, f50.f385175d);
            st0 st0VarB = this.f388154a.b();
            C36585a.d(videoAd.equals(st0VarB != null ? st0VarB.b() : null));
            this.f388157d.a(false);
            this.f388158e.a();
            this.f388156c.onAdPaused(videoAd);
        }
    }

    public final void d(@j.N VideoAd videoAd) {
        f50 f50VarA = this.f388154a.a(videoAd);
        if (f50.f385172a.equals(f50VarA) || f50.f385173b.equals(f50VarA)) {
            this.f388154a.a(videoAd, f50.f385174c);
            q3 q3VarA = this.f388155b.a(videoAd);
            q3VarA.getClass();
            this.f388154a.a(new st0(q3VarA, videoAd));
            this.f388156c.onAdStarted(videoAd);
            return;
        }
        if (f50.f385175d.equals(f50VarA)) {
            st0 st0VarB = this.f388154a.b();
            C36585a.d(videoAd.equals(st0VarB != null ? st0VarB.b() : null));
            this.f388154a.a(videoAd, f50.f385174c);
            this.f388156c.onAdResumed(videoAd);
        }
    }

    public final void e(@j.N VideoAd videoAd) {
        if (f50.f385175d.equals(this.f388154a.a(videoAd))) {
            this.f388154a.a(videoAd, f50.f385174c);
            st0 st0VarB = this.f388154a.b();
            C36585a.d(videoAd.equals(st0VarB != null ? st0VarB.b() : null));
            this.f388157d.a(true);
            this.f388158e.b();
            this.f388156c.onAdResumed(videoAd);
        }
    }

    public final void f(@j.N VideoAd videoAd) {
        int i12 = this.f388160g.d() ? 2 : 1;
        Z0 z02 = new Z0(this, videoAd, 1);
        f50 f50VarA = this.f388154a.a(videoAd);
        f50 f50Var = f50.f385172a;
        if (f50Var.equals(f50VarA)) {
            q3 q3VarA = this.f388155b.a(videoAd);
            if (q3VarA != null) {
                this.f388159f.a(q3VarA, i12, z02);
                return;
            }
            return;
        }
        this.f388154a.a(videoAd, f50Var);
        st0 st0VarB = this.f388154a.b();
        if (st0VarB != null) {
            this.f388159f.a(st0VarB.a(), i12, z02);
        }
    }

    public final void g(@j.N VideoAd videoAd) {
        Z0 z02 = new Z0(this, videoAd, 0);
        f50 f50VarA = this.f388154a.a(videoAd);
        f50 f50Var = f50.f385172a;
        if (f50Var.equals(f50VarA)) {
            q3 q3VarA = this.f388155b.a(videoAd);
            if (q3VarA != null) {
                this.f388159f.a(q3VarA, 1, z02);
                return;
            }
            return;
        }
        this.f388154a.a(videoAd, f50Var);
        st0 st0VarB = this.f388154a.b();
        if (st0VarB != null) {
            this.f388159f.a(st0VarB.a(), 1, z02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(VideoAd videoAd) {
        this.f388156c.onAdSkipped(videoAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(VideoAd videoAd) {
        this.f388156c.onAdStopped(videoAd);
    }
}
