package defpackage;

/* loaded from: classes.dex */
public final class a7i implements q9e {
    public final long X;
    public final long[] Y;
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long o;

    public a7i(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.o = j3;
        this.Y = jArr;
        this.X = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.q9e
    public final long a() {
        return this.X;
    }

    @Override // defpackage.q9e
    public final long b(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.Y;
        hsi.h(jArr);
        double d = (j2 * 256.0d) / this.o;
        int iE = zxg.e(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (iE * j3) / 100;
        long j5 = jArr[iE];
        int i = iE + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iE == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return this.Y != null;
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        double d;
        double d2;
        boolean zC = c();
        int i = this.b;
        long j2 = this.a;
        if (!zC) {
            m9e m9eVar = new m9e(0L, j2 + i);
            return new g9e(m9eVar, m9eVar);
        }
        long j3 = zxg.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.Y;
            hsi.h(jArr);
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
        long j4 = this.o;
        m9e m9eVar2 = new m9e(j3, j2 + zxg.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new g9e(m9eVar2, m9eVar2);
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.c;
    }

    @Override // defpackage.q9e
    public final long g() {
        return this.a + this.b;
    }

    @Override // defpackage.q9e
    public final int h() {
        return this.d;
    }
}
