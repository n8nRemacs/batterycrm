package defpackage;

/* loaded from: classes.dex */
public abstract class k7d {
    public static final j7d a = new j7d();
    public static final t3 b;

    static {
        Integer num = kt7.a;
        b = (num == null || num.intValue() >= 34) ? new v2c() : new qq5();
    }

    public abstract int a(int i);

    public abstract int b();

    public abstract int c(int i);

    public abstract long d();

    public long e(long j) {
        return f(0L, j);
    }

    public long f(long j, long j2) {
        long jD;
        long j3;
        long jA;
        int iB;
        if (j2 <= j) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j) + ", " + Long.valueOf(j2) + ").").toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iB = b();
                } else {
                    jA = (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (b() & 4294967295L);
                }
                jA = iB & 4294967295L;
            } else {
                do {
                    jD = d() >>> 1;
                    j3 = jD % j4;
                } while ((j4 - 1) + (jD - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jD2 = d();
            if (j <= jD2 && jD2 < j2) {
                return jD2;
            }
        }
    }
}
