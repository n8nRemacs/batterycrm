package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
final class qn0 implements hx, xn0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private sn0 f389252a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wj f389253b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final Long f389254c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final gv0 f389255d;

    public qn0(@j.N AdResponse adResponse, @j.N sn0 sn0Var, @j.N wj wjVar, @j.N f91 f91Var) {
        this.f389252a = sn0Var;
        this.f389253b = wjVar;
        this.f389254c = adResponse.t();
        this.f389255d = f91Var.c();
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void a(long j12, long j13) {
        long jA2 = this.f389255d.a() + j13;
        Long l12 = this.f389254c;
        if (l12 == null || jA2 < l12.longValue()) {
            return;
        }
        this.f389253b.a();
        this.f389252a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void b() {
        this.f389253b.a();
        this.f389252a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void invalidate() {
        this.f389252a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void start() {
        this.f389252a.a(this);
        if (this.f389254c == null || this.f389255d.a() < this.f389254c.longValue()) {
            return;
        }
        this.f389253b.a();
        this.f389252a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void a() {
        this.f389253b.a();
        this.f389252a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void resume() {
    }
}
