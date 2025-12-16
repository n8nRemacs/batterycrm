package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
final class hl1 implements x21 {

    /* renamed from: a, reason: collision with root package name */
    private final fl1 f386163a;

    /* renamed from: b, reason: collision with root package name */
    private final int f386164b;

    /* renamed from: c, reason: collision with root package name */
    private final long f386165c;

    /* renamed from: d, reason: collision with root package name */
    private final long f386166d;

    /* renamed from: e, reason: collision with root package name */
    private final long f386167e;

    public hl1(fl1 fl1Var, int i12, long j12, long j13) {
        this.f386163a = fl1Var;
        this.f386164b = i12;
        this.f386165c = j12;
        long j14 = (j13 - j12) / fl1Var.f385413d;
        this.f386166d = j14;
        this.f386167e = c(j14);
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f386167e;
    }

    private long c(long j12) {
        return pc1.a(j12 * this.f386164b, 1000000L, this.f386163a.f385412c);
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        long j13 = this.f386166d - 1;
        int i12 = pc1.f388768a;
        long jMax = Math.max(0L, Math.min((this.f386163a.f385412c * j12) / (this.f386164b * 1000000), j13));
        long j14 = (this.f386163a.f385413d * jMax) + this.f386165c;
        long jC2 = c(jMax);
        z21 z21Var = new z21(jC2, j14);
        if (jC2 >= j12 || jMax == this.f386166d - 1) {
            return new x21.a(z21Var, z21Var);
        }
        long j15 = jMax + 1;
        return new x21.a(z21Var, new z21(c(j15), (this.f386163a.f385413d * j15) + this.f386165c));
    }
}
