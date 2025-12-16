package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class lkh implements i9e {
    public final jkh a;
    public final int b;
    public final long c;
    public final long d;
    public final long o;

    public lkh(jkh jkhVar, int i, long j, long j2) {
        this.a = jkhVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / jkhVar.c;
        this.d = j3;
        this.o = d(j3);
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return true;
    }

    public final long d(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        String str = zxg.a;
        return zxg.e0(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        jkh jkhVar = this.a;
        long j2 = this.d;
        long j3 = zxg.j((jkhVar.b * j) / (this.b * 1000000), 0L, j2 - 1);
        long j4 = this.c;
        long jD = d(j3);
        m9e m9eVar = new m9e(jD, (jkhVar.c * j3) + j4);
        if (jD >= j || j3 == j2 - 1) {
            return new g9e(m9eVar, m9eVar);
        }
        long j5 = j3 + 1;
        return new g9e(m9eVar, new m9e(d(j5), (jkhVar.c * j5) + j4));
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.o;
    }
}
