package defpackage;

/* loaded from: classes.dex */
public final class z6i implements p9e {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public z6i(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.p9e
    public final long a() {
        return this.e;
    }

    @Override // defpackage.p9e
    public final long b(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        fsi.e(jArr);
        double d = (j2 * 256.0d) / this.d;
        int iE = xxg.e(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (iE * j3) / 100;
        long j5 = jArr[iE];
        int i = iE + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iE == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return this.f != null;
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        double d;
        double d2;
        boolean zC = c();
        int i = this.b;
        long j2 = this.a;
        if (!zC) {
            l9e l9eVar = new l9e(0L, j2 + i);
            return new f9e(l9eVar, l9eVar);
        }
        long j3 = xxg.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.f;
            fsi.e(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.d;
        l9e l9eVar2 = new l9e(j3, j2 + xxg.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new f9e(l9eVar2, l9eVar2);
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.c;
    }
}
