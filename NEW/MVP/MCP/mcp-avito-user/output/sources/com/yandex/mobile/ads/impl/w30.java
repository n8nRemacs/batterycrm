package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
final class w30 implements a31 {

    /* renamed from: a, reason: collision with root package name */
    private final long f391268a;

    /* renamed from: b, reason: collision with root package name */
    private final la0 f391269b;

    /* renamed from: c, reason: collision with root package name */
    private final la0 f391270c;

    /* renamed from: d, reason: collision with root package name */
    private long f391271d;

    public w30(long j12, long j13, long j14) {
        this.f391271d = j12;
        this.f391268a = j14;
        la0 la0Var = new la0();
        this.f391269b = la0Var;
        la0 la0Var2 = new la0();
        this.f391270c = la0Var2;
        la0Var.a(0L);
        la0Var2.a(j13);
    }

    @Override // com.yandex.mobile.ads.impl.a31
    public final long a(long j12) {
        return this.f391269b.a(pc1.a(this.f391270c, j12));
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f391271d;
    }

    public final void d(long j12) {
        this.f391271d = j12;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        int iA2 = pc1.a(this.f391269b, j12);
        long jA2 = this.f391269b.a(iA2);
        z21 z21Var = new z21(jA2, this.f391270c.a(iA2));
        if (jA2 == j12 || iA2 == this.f391269b.a() - 1) {
            return new x21.a(z21Var, z21Var);
        }
        int i12 = iA2 + 1;
        return new x21.a(z21Var, new z21(this.f391269b.a(i12), this.f391270c.a(i12)));
    }

    public final boolean c(long j12) {
        la0 la0Var = this.f391269b;
        return j12 - la0Var.a(la0Var.a() - 1) < 100000;
    }

    @Override // com.yandex.mobile.ads.impl.a31
    public final long a() {
        return this.f391268a;
    }

    public final void a(long j12, long j13) {
        if (c(j12)) {
            return;
        }
        this.f391269b.a(j12);
        this.f391270c.a(j13);
    }
}
