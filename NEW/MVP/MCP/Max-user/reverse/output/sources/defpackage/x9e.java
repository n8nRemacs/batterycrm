package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class x9e extends hae {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    public x9e(q7d q7dVar, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(q7dVar, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = list;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public final long c(long j, long j2) {
        long jE = e(j);
        return jE != -1 ? jE : (int) (g((j2 - this.h) + this.i, j) - d(j, j2));
    }

    public final long d(long j, long j2) {
        long jE = e(j);
        long j3 = this.d;
        if (jE == -1) {
            long j4 = this.g;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, g((j2 - this.h) - j4, j));
            }
        }
        return j3;
    }

    public abstract long e(long j);

    public final long f(long j, long j2) {
        long j3 = this.a;
        long j4 = this.d;
        List list = this.f;
        if (list != null) {
            return (((dae) list.get((int) (j - j4))).b * 1000000) / j3;
        }
        long jE = e(j2);
        return (jE == -1 || j != (j4 + jE) - 1) ? (this.e * 1000000) / j3 : j2 - h(j);
    }

    public final long g(long j, long j2) {
        long jE = e(j2);
        long j3 = this.d;
        if (jE != 0) {
            if (this.f != null) {
                long j4 = (jE + j3) - 1;
                long j5 = j3;
                while (j5 <= j4) {
                    long j6 = ((j4 - j5) / 2) + j5;
                    long jH = h(j6);
                    if (jH < j) {
                        j5 = j6 + 1;
                    } else {
                        if (jH <= j) {
                            return j6;
                        }
                        j4 = j6 - 1;
                    }
                }
                return j5 == j3 ? j5 : j4;
            }
            long j7 = (j / ((this.e * 1000000) / this.a)) + j3;
            if (j7 >= j3) {
                return jE == -1 ? j7 : Math.min(j7, (j3 + jE) - 1);
            }
        }
        return j3;
    }

    public final long h(long j) {
        long j2 = this.d;
        List list = this.f;
        return xxg.H(list != null ? ((dae) list.get((int) (j - j2))).a - this.b : (j - j2) * this.e, 1000000L, this.a);
    }

    public abstract q7d i(tmd tmdVar, long j);

    public boolean j() {
        return this.f != null;
    }
}
