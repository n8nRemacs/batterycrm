package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class f3 implements qf1<VideoAd> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final o2 f385158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ym f385159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private z2 f385160c;

    public f3(@Y61.k o2 o2Var, @Y61.k ym ymVar) {
        this.f385158a = o2Var;
        this.f385159b = ymVar;
    }

    private final boolean l(ff1<VideoAd> ff1Var) {
        z2 z2Var = this.f385160c;
        return kotlin.jvm.internal.L.f(z2Var != null ? z2Var.b() : null, ff1Var);
    }

    public final void a(@Y61.l z2 z2Var) {
        this.f385160c = z2Var;
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void b(@Y61.k ff1<VideoAd> ff1Var) {
        this.f385158a.c(ff1Var.c());
        if (l(ff1Var)) {
            ((e3.a) this.f385159b).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void c(@Y61.k ff1<VideoAd> ff1Var) {
        this.f385158a.i(ff1Var.c());
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void d(@Y61.k ff1<VideoAd> ff1Var) {
        this.f385158a.g(ff1Var.c());
        if (l(ff1Var)) {
            ((e3.a) this.f385159b).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void e(@Y61.k ff1<VideoAd> ff1Var) {
        this.f385158a.d(ff1Var.c());
        if (l(ff1Var)) {
            ((e3.a) this.f385159b).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void f(@Y61.k ff1<VideoAd> ff1Var) {
        this.f385158a.h(ff1Var.c());
        if (l(ff1Var)) {
            ((e3.a) this.f385159b).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void g(@Y61.k ff1<VideoAd> ff1Var) {
        h3 h3VarA;
        l60 l60VarA;
        z2 z2Var = this.f385160c;
        if (z2Var != null && (h3VarA = z2Var.a(ff1Var)) != null && (l60VarA = h3VarA.a()) != null) {
            l60VarA.e();
        }
        this.f385158a.a();
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void h(@Y61.k ff1<VideoAd> ff1Var) {
        this.f385158a.e(ff1Var.c());
        if (l(ff1Var)) {
            ((e3.a) this.f385159b).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void i(@Y61.k ff1<VideoAd> ff1Var) {
        this.f385158a.a(ff1Var.c());
        if (l(ff1Var)) {
            ((e3.a) this.f385159b).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void a(@Y61.k ff1<VideoAd> ff1Var, float f12) {
        this.f385158a.a(ff1Var.c(), f12);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void a(@Y61.k ff1<VideoAd> ff1Var) {
        this.f385158a.f(ff1Var.c());
        if (l(ff1Var)) {
            ((e3.a) this.f385159b).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void a(@Y61.k ff1<VideoAd> ff1Var, @Y61.k cg1 cg1Var) {
        this.f385158a.b(ff1Var.c());
        if (l(ff1Var)) {
            ((e3.a) this.f385159b).a(ff1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void j(@Y61.k ff1<VideoAd> ff1Var) {
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void k(@Y61.k ff1<VideoAd> ff1Var) {
    }
}
