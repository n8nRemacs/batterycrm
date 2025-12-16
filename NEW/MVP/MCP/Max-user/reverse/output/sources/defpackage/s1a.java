package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class s1a implements p9e {
    public final long[] a;
    public final long[] b;
    public final long c;

    public s1a(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? xxg.B(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int iE = xxg.e(jArr, j, true);
        long j2 = jArr[iE];
        long j3 = jArr2[iE];
        int i = iE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.p9e
    public final long a() {
        return -1L;
    }

    @Override // defpackage.p9e
    public final long b(long j) {
        return xxg.B(((Long) d(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        Pair pairD = d(xxg.K(xxg.j(j, 0L, this.c)), this.b, this.a);
        l9e l9eVar = new l9e(xxg.B(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new f9e(l9eVar, l9eVar);
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.c;
    }
}
