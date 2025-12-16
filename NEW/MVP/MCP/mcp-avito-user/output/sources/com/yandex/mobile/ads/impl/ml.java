package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
public class ml implements x21 {

    /* renamed from: a, reason: collision with root package name */
    private final long f388016a;

    /* renamed from: b, reason: collision with root package name */
    private final long f388017b;

    /* renamed from: c, reason: collision with root package name */
    private final int f388018c;

    /* renamed from: d, reason: collision with root package name */
    private final long f388019d;

    /* renamed from: e, reason: collision with root package name */
    private final int f388020e;

    /* renamed from: f, reason: collision with root package name */
    private final long f388021f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f388022g;

    public ml(int i12, int i13, long j12, long j13, boolean z12) {
        this.f388016a = j12;
        this.f388017b = j13;
        this.f388018c = i13 == -1 ? 1 : i13;
        this.f388020e = i12;
        this.f388022g = z12;
        if (j12 == -1) {
            this.f388019d = -1L;
            this.f388021f = -9223372036854775807L;
        } else {
            this.f388019d = j12 - j13;
            this.f388021f = a(i12, j12, j13);
        }
    }

    private static long a(int i12, long j12, long j13) {
        return (Math.max(0L, j12 - j13) * 8000000) / i12;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return this.f388019d != -1 || this.f388022g;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f388021f;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        long j13 = this.f388019d;
        if (j13 == -1 && !this.f388022g) {
            z21 z21Var = new z21(0L, this.f388017b);
            return new x21.a(z21Var, z21Var);
        }
        long j14 = this.f388018c;
        long jMin = (((this.f388020e * j12) / 8000000) / j14) * j14;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - j14);
        }
        long jMax = this.f388017b + Math.max(jMin, 0L);
        long jC2 = c(jMax);
        z21 z21Var2 = new z21(jC2, jMax);
        if (this.f388019d != -1 && jC2 < j12) {
            long j15 = jMax + this.f388018c;
            if (j15 < this.f388016a) {
                return new x21.a(z21Var2, new z21(c(j15), j15));
            }
        }
        return new x21.a(z21Var2, z21Var2);
    }

    public final long c(long j12) {
        return a(this.f388020e, j12, this.f388017b);
    }
}
