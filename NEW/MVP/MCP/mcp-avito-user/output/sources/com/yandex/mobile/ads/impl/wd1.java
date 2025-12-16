package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oh0;
import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
final class wd1 implements a31 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f391385a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f391386b;

    /* renamed from: c, reason: collision with root package name */
    private final long f391387c;

    /* renamed from: d, reason: collision with root package name */
    private final long f391388d;

    private wd1(long[] jArr, long[] jArr2, long j12, long j13) {
        this.f391385a = jArr;
        this.f391386b = jArr2;
        this.f391387c = j12;
        this.f391388d = j13;
    }

    @j.P
    public static wd1 a(long j12, long j13, oh0.a aVar, pr0 pr0Var) {
        int iT2;
        pr0Var.f(10);
        int iH2 = pr0Var.h();
        if (iH2 <= 0) {
            return null;
        }
        int i12 = aVar.f388544d;
        long jA2 = pc1.a(iH2, (i12 >= 32000 ? 1152 : 576) * 1000000, i12);
        int iZ2 = pr0Var.z();
        int iZ3 = pr0Var.z();
        int iZ4 = pr0Var.z();
        pr0Var.f(2);
        long j14 = j13 + aVar.f388543c;
        long[] jArr = new long[iZ2];
        long[] jArr2 = new long[iZ2];
        int i13 = 0;
        long j15 = j13;
        while (i13 < iZ2) {
            int i14 = iZ3;
            long j16 = j14;
            jArr[i13] = (i13 * jA2) / iZ2;
            jArr2[i13] = Math.max(j15, j16);
            if (iZ4 == 1) {
                iT2 = pr0Var.t();
            } else if (iZ4 == 2) {
                iT2 = pr0Var.z();
            } else if (iZ4 == 3) {
                iT2 = pr0Var.w();
            } else {
                if (iZ4 != 4) {
                    return null;
                }
                iT2 = pr0Var.x();
            }
            j15 += iT2 * i14;
            i13++;
            jArr = jArr;
            iZ3 = i14;
            j14 = j16;
        }
        long[] jArr3 = jArr;
        if (j12 != -1 && j12 != j15) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "VBRI data size mismatch: ", ", ");
            sbQ.append(j15);
            ka0.d("VbriSeeker", sbQ.toString());
        }
        return new wd1(jArr3, jArr2, jA2, j15);
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f391387c;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        int iB2 = pc1.b(this.f391385a, j12, true);
        long[] jArr = this.f391385a;
        long j13 = jArr[iB2];
        long[] jArr2 = this.f391386b;
        z21 z21Var = new z21(j13, jArr2[iB2]);
        if (j13 >= j12 || iB2 == jArr.length - 1) {
            return new x21.a(z21Var, z21Var);
        }
        int i12 = iB2 + 1;
        return new x21.a(z21Var, new z21(jArr[i12], jArr2[i12]));
    }

    @Override // com.yandex.mobile.ads.impl.a31
    public final long a(long j12) {
        return this.f391385a[pc1.b(this.f391386b, j12, true)];
    }

    @Override // com.yandex.mobile.ads.impl.a31
    public final long a() {
        return this.f391388d;
    }
}
