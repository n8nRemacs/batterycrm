package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class t1a implements q9e {
    public final long[] a;
    public final long[] b;
    public final long c;

    public t1a(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? zxg.U(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int iE = zxg.e(jArr, j, true);
        long j2 = jArr[iE];
        long j3 = jArr2[iE];
        int i = iE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.q9e
    public final long a() {
        return -1L;
    }

    @Override // defpackage.q9e
    public final long b(long j) {
        return zxg.U(((Long) d(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        Pair pairD = d(zxg.m0(zxg.j(j, 0L, this.c)), this.b, this.a);
        m9e m9eVar = new m9e(zxg.U(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new g9e(m9eVar, m9eVar);
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.c;
    }

    @Override // defpackage.q9e
    public final long g() {
        return 0L;
    }

    @Override // defpackage.q9e
    public final int h() {
        return -2147483647;
    }
}
