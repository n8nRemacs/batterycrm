package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.xc0;

/* loaded from: classes8.dex */
public final class yo implements n90 {

    /* renamed from: a, reason: collision with root package name */
    private final long f392030a;

    /* renamed from: b, reason: collision with root package name */
    private final long f392031b;

    /* renamed from: c, reason: collision with root package name */
    private final float f392032c;

    /* renamed from: d, reason: collision with root package name */
    private long f392033d;

    /* renamed from: e, reason: collision with root package name */
    private long f392034e;

    /* renamed from: f, reason: collision with root package name */
    private long f392035f;

    /* renamed from: g, reason: collision with root package name */
    private long f392036g;

    /* renamed from: h, reason: collision with root package name */
    private long f392037h;

    /* renamed from: i, reason: collision with root package name */
    private long f392038i;

    /* renamed from: j, reason: collision with root package name */
    private float f392039j;

    /* renamed from: k, reason: collision with root package name */
    private float f392040k;

    /* renamed from: l, reason: collision with root package name */
    private float f392041l;

    /* renamed from: m, reason: collision with root package name */
    private long f392042m;

    /* renamed from: n, reason: collision with root package name */
    private long f392043n;

    /* renamed from: o, reason: collision with root package name */
    private long f392044o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f392045a = pc1.a(20L);

        /* renamed from: b, reason: collision with root package name */
        private long f392046b = pc1.a(500L);

        /* renamed from: c, reason: collision with root package name */
        private float f392047c = 0.999f;

        public final yo a() {
            return new yo(this.f392045a, this.f392046b, this.f392047c, 0);
        }
    }

    public /* synthetic */ yo(long j12, long j13, float f12, int i12) {
        this(j12, j13, f12);
    }

    private void b() {
        long j12 = this.f392033d;
        if (j12 != -9223372036854775807L) {
            long j13 = this.f392034e;
            if (j13 != -9223372036854775807L) {
                j12 = j13;
            }
            long j14 = this.f392036g;
            if (j14 != -9223372036854775807L && j12 < j14) {
                j12 = j14;
            }
            long j15 = this.f392037h;
            if (j15 != -9223372036854775807L && j12 > j15) {
                j12 = j15;
            }
        } else {
            j12 = -9223372036854775807L;
        }
        if (this.f392035f == j12) {
            return;
        }
        this.f392035f = j12;
        this.f392038i = j12;
        this.f392043n = -9223372036854775807L;
        this.f392044o = -9223372036854775807L;
        this.f392042m = -9223372036854775807L;
    }

    public final void a(xc0.e eVar) {
        this.f392033d = pc1.a(eVar.f391644a);
        this.f392036g = pc1.a(eVar.f391645b);
        this.f392037h = pc1.a(eVar.f391646c);
        float f12 = eVar.f391647d;
        if (f12 == -3.4028235E38f) {
            f12 = 0.97f;
        }
        this.f392040k = f12;
        float f13 = eVar.f391648e;
        if (f13 == -3.4028235E38f) {
            f13 = 1.03f;
        }
        this.f392039j = f13;
        if (f12 == 1.0f && f13 == 1.0f) {
            this.f392033d = -9223372036854775807L;
        }
        b();
    }

    public final void c() {
        long j12 = this.f392038i;
        if (j12 == -9223372036854775807L) {
            return;
        }
        long j13 = j12 + this.f392031b;
        this.f392038i = j13;
        long j14 = this.f392037h;
        if (j14 != -9223372036854775807L && j13 > j14) {
            this.f392038i = j14;
        }
        this.f392042m = -9223372036854775807L;
    }

    private yo(long j12, long j13, float f12) {
        this.f392030a = j12;
        this.f392031b = j13;
        this.f392032c = f12;
        this.f392033d = -9223372036854775807L;
        this.f392034e = -9223372036854775807L;
        this.f392036g = -9223372036854775807L;
        this.f392037h = -9223372036854775807L;
        this.f392040k = 0.97f;
        this.f392039j = 1.03f;
        this.f392041l = 1.0f;
        this.f392042m = -9223372036854775807L;
        this.f392035f = -9223372036854775807L;
        this.f392038i = -9223372036854775807L;
        this.f392043n = -9223372036854775807L;
        this.f392044o = -9223372036854775807L;
    }

    public final void a(long j12) {
        this.f392034e = j12;
        b();
    }

    public final float a(long j12, long j13) {
        if (this.f392033d == -9223372036854775807L) {
            return 1.0f;
        }
        long j14 = j12 - j13;
        long j15 = this.f392043n;
        if (j15 == -9223372036854775807L) {
            this.f392043n = j14;
            this.f392044o = 0L;
        } else {
            float f12 = this.f392032c;
            long jMax = Math.max(j14, (long) (((1.0f - f12) * j14) + (j15 * f12)));
            this.f392043n = jMax;
            long jAbs = Math.abs(j14 - jMax);
            long j16 = this.f392044o;
            float f13 = this.f392032c;
            this.f392044o = (long) (((1.0f - f13) * jAbs) + (j16 * f13));
        }
        if (this.f392042m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f392042m < 1000) {
            return this.f392041l;
        }
        this.f392042m = SystemClock.elapsedRealtime();
        long j17 = (this.f392044o * 3) + this.f392043n;
        if (this.f392038i > j17) {
            float fA2 = pc1.a(1000L);
            long[] jArr = {j17, this.f392035f, this.f392038i - (((long) ((this.f392041l - 1.0f) * fA2)) + ((long) ((this.f392039j - 1.0f) * fA2)))};
            for (int i12 = 1; i12 < 3; i12++) {
                long j18 = jArr[i12];
                if (j18 > j17) {
                    j17 = j18;
                }
            }
            this.f392038i = j17;
        } else {
            long jMax2 = j12 - ((long) (Math.max(0.0f, this.f392041l - 1.0f) / 1.0E-7f));
            long j19 = this.f392038i;
            int i13 = pc1.f388768a;
            long jMax3 = Math.max(j19, Math.min(jMax2, j17));
            this.f392038i = jMax3;
            long j22 = this.f392037h;
            if (j22 != -9223372036854775807L && jMax3 > j22) {
                this.f392038i = j22;
            }
        }
        long j23 = j12 - this.f392038i;
        if (Math.abs(j23) < this.f392030a) {
            this.f392041l = 1.0f;
        } else {
            float f14 = this.f392040k;
            float f15 = this.f392039j;
            int i14 = pc1.f388768a;
            this.f392041l = Math.max(f14, Math.min((j23 * 1.0E-7f) + 1.0f, f15));
        }
        return this.f392041l;
    }

    public final long a() {
        return this.f392038i;
    }
}
