package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.z50;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class m60 implements qf1<VideoAd>, z50.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final qf1<VideoAd> f387869a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final AtomicInteger f387870b = new AtomicInteger(2);

    public m60(@Y61.k qf1<VideoAd> qf1Var) {
        this.f387869a = qf1Var;
    }

    private final void l(ff1<VideoAd> ff1Var) {
        if (this.f387870b.decrementAndGet() == 0) {
            this.f387869a.e(ff1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void a(@Y61.k ff1<VideoAd> ff1Var, float f12) {
        this.f387869a.a(ff1Var, f12);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void b(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.b(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void c(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.c(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void d(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.d(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void e(@Y61.k ff1<VideoAd> ff1Var) {
        l(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void f(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.f(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void g(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.g(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void h(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.h(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void i(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.i(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void j(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.j(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void k(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.k(ff1Var);
    }

    public final void m(@Y61.k ff1<VideoAd> ff1Var) {
        l(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void a(@Y61.k ff1<VideoAd> ff1Var) {
        this.f387869a.a(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void a(@Y61.k ff1<VideoAd> ff1Var, @Y61.k cg1 cg1Var) {
        this.f387869a.a(ff1Var, cg1Var);
    }

    public final void a() {
        this.f387870b.set(2);
    }
}
