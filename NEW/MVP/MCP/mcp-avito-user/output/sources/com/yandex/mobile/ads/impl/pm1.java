package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oh0;
import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
final class pm1 implements a31 {

    /* renamed from: a, reason: collision with root package name */
    private final long f388889a;

    /* renamed from: b, reason: collision with root package name */
    private final int f388890b;

    /* renamed from: c, reason: collision with root package name */
    private final long f388891c;

    /* renamed from: d, reason: collision with root package name */
    private final long f388892d;

    /* renamed from: e, reason: collision with root package name */
    private final long f388893e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final long[] f388894f;

    private pm1(long j12, int i12, long j13, long j14, @j.P long[] jArr) {
        this.f388889a = j12;
        this.f388890b = i12;
        this.f388891c = j13;
        this.f388894f = jArr;
        this.f388892d = j14;
        this.f388893e = j14 != -1 ? j12 + j14 : -1L;
    }

    @j.P
    public static pm1 a(long j12, long j13, oh0.a aVar, pr0 pr0Var) {
        int iX2;
        int i12 = aVar.f388547g;
        int i13 = aVar.f388544d;
        int iH2 = pr0Var.h();
        if ((iH2 & 1) != 1 || (iX2 = pr0Var.x()) == 0) {
            return null;
        }
        long jA2 = pc1.a(iX2, i12 * 1000000, i13);
        if ((iH2 & 6) != 6) {
            return new pm1(j13, aVar.f388543c, jA2, -1L, null);
        }
        long jV2 = pr0Var.v();
        long[] jArr = new long[100];
        for (int i14 = 0; i14 < 100; i14++) {
            jArr[i14] = pr0Var.t();
        }
        if (j12 != -1) {
            long j14 = j13 + jV2;
            if (j12 != j14) {
                StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "XING data size mismatch: ", ", ");
                sbQ.append(j14);
                ka0.d("XingSeeker", sbQ.toString());
            }
        }
        return new pm1(j13, aVar.f388543c, jA2, jV2, jArr);
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return this.f388894f != null;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f388891c;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        if (!b()) {
            z21 z21Var = new z21(0L, this.f388889a + this.f388890b);
            return new x21.a(z21Var, z21Var);
        }
        long j13 = this.f388891c;
        int i12 = pc1.f388768a;
        long jMax = Math.max(0L, Math.min(j12, j13));
        double d12 = (jMax * 100.0d) / this.f388891c;
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 100.0d) {
                d13 = 256.0d;
            } else {
                int i13 = (int) d12;
                double d14 = ((long[]) db.b(this.f388894f))[i13];
                d13 = d14 + (((i13 == 99 ? 256.0d : r3[i13 + 1]) - d14) * (d12 - i13));
            }
        }
        z21 z21Var2 = new z21(jMax, this.f388889a + Math.max(this.f388890b, Math.min(Math.round((d13 / 256.0d) * this.f388892d), this.f388892d - 1)));
        return new x21.a(z21Var2, z21Var2);
    }

    @Override // com.yandex.mobile.ads.impl.a31
    public final long a(long j12) {
        long j13 = j12 - this.f388889a;
        if (!b() || j13 <= this.f388890b) {
            return 0L;
        }
        long[] jArr = (long[]) db.b(this.f388894f);
        double d12 = (j13 * 256.0d) / this.f388892d;
        int iB2 = pc1.b(jArr, (long) d12, true);
        long j14 = this.f388891c;
        long j15 = (iB2 * j14) / 100;
        long j16 = jArr[iB2];
        int i12 = iB2 + 1;
        long j17 = (j14 * i12) / 100;
        return Math.round((j16 == (iB2 == 99 ? 256L : jArr[i12]) ? 0.0d : (d12 - j16) / (r0 - j16)) * (j17 - j15)) + j15;
    }

    @Override // com.yandex.mobile.ads.impl.a31
    public final long a() {
        return this.f388893e;
    }
}
