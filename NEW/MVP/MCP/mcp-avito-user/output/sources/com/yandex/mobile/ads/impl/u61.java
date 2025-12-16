package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class u61 implements zb0 {

    /* renamed from: b, reason: collision with root package name */
    private final hj f390458b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f390459c;

    /* renamed from: d, reason: collision with root package name */
    private long f390460d;

    /* renamed from: e, reason: collision with root package name */
    private long f390461e;

    /* renamed from: f, reason: collision with root package name */
    private ct0 f390462f = ct0.f384452d;

    public u61(c81 c81Var) {
        this.f390458b = c81Var;
    }

    public final void a() {
        if (this.f390459c) {
            return;
        }
        this.f390461e = this.f390458b.c();
        this.f390459c = true;
    }

    public final void b() {
        if (this.f390459c) {
            a(o());
            this.f390459c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final ct0 getPlaybackParameters() {
        return this.f390462f;
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final long o() {
        long j12 = this.f390460d;
        if (!this.f390459c) {
            return j12;
        }
        long jC2 = this.f390458b.c() - this.f390461e;
        ct0 ct0Var = this.f390462f;
        return j12 + (ct0Var.f384453a == 1.0f ? pc1.a(jC2) : ct0Var.a(jC2));
    }

    public final void a(long j12) {
        this.f390460d = j12;
        if (this.f390459c) {
            this.f390461e = this.f390458b.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final void a(ct0 ct0Var) {
        if (this.f390459c) {
            a(o());
        }
        this.f390462f = ct0Var;
    }
}
