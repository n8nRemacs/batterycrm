package defpackage;

/* loaded from: classes.dex */
public final class kkh implements h9e {
    public final jkh a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public kkh(jkh jkhVar, int i, long j, long j2) {
        this.a = jkhVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / jkhVar.c;
        this.d = j3;
        this.e = xxg.H(j3 * i, 1000000L, jkhVar.b);
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        jkh jkhVar = this.a;
        int i = this.b;
        long j2 = this.d - 1;
        long j3 = xxg.j((jkhVar.b * j) / (i * 1000000), 0L, j2);
        int i2 = jkhVar.c;
        long j4 = this.c;
        long jH = xxg.H(j3 * i, 1000000L, jkhVar.b);
        l9e l9eVar = new l9e(jH, (i2 * j3) + j4);
        if (jH >= j || j3 == j2) {
            return new f9e(l9eVar, l9eVar);
        }
        long j5 = j3 + 1;
        return new f9e(l9eVar, new l9e(xxg.H(j5 * i, 1000000L, jkhVar.b), (i2 * j5) + j4));
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.e;
    }
}
