package w81;

import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.foundation.text.selection.C21030p;

/* compiled from: Jdk8Methods.java */
/* loaded from: classes8.dex */
public final class d {
    public static int a(long j12, long j13) {
        if (j12 < j13) {
            return -1;
        }
        return j12 > j13 ? 1 : 0;
    }

    public static boolean b(Comparable comparable, Object obj) {
        if (obj == null) {
            return comparable == null;
        }
        if (comparable == null) {
            return false;
        }
        return obj.equals(comparable);
    }

    public static long c(long j12, long j13) {
        return j12 >= 0 ? j12 / j13 : ((j12 + 1) / j13) - 1;
    }

    public static int d(int i12, int i13) {
        return ((i12 % i13) + i13) % i13;
    }

    public static int e(int i12, long j12) {
        long j13 = i12;
        return (int) (((j12 % j13) + j13) % j13);
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    public static int g(int i12, int i13) {
        int i14 = i12 + i13;
        if ((i12 ^ i14) >= 0 || (i12 ^ i13) < 0) {
            return i14;
        }
        throw new ArithmeticException(H.j(i12, i13, "Addition overflows an int: ", " + "));
    }

    public static long h(long j12, long j13) {
        long j14 = j12 + j13;
        if ((j12 ^ j14) >= 0 || (j12 ^ j13) < 0) {
            return j14;
        }
        StringBuilder sbQ = H.q(j12, "Addition overflows a long: ", " + ");
        sbQ.append(j13);
        throw new ArithmeticException(sbQ.toString());
    }

    public static long i(int i12, long j12) {
        if (i12 == -1) {
            if (j12 != Long.MIN_VALUE) {
                return -j12;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j12 + " * " + i12);
        }
        if (i12 == 0) {
            return 0L;
        }
        if (i12 == 1) {
            return j12;
        }
        long j13 = i12;
        long j14 = j12 * j13;
        if (j14 / j13 == j12) {
            return j14;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j12 + " * " + i12);
    }

    public static long j(long j12, long j13) {
        if (j13 == 1) {
            return j12;
        }
        if (j12 == 1) {
            return j13;
        }
        if (j12 == 0 || j13 == 0) {
            return 0L;
        }
        long j14 = j12 * j13;
        if (j14 / j13 == j12 && ((j12 != Long.MIN_VALUE || j13 != -1) && (j13 != Long.MIN_VALUE || j12 != -1))) {
            return j14;
        }
        StringBuilder sbQ = H.q(j12, "Multiplication overflows a long: ", " * ");
        sbQ.append(j13);
        throw new ArithmeticException(sbQ.toString());
    }

    public static int k(int i12) {
        int i13 = i12 - 1;
        if ((i12 ^ i13) >= 0 || (i12 ^ 1) >= 0) {
            return i13;
        }
        throw new ArithmeticException(G.e(i12, "Subtraction overflows an int: ", " - 1"));
    }

    public static long l(long j12, long j13) {
        long j14 = j12 - j13;
        if ((j12 ^ j14) >= 0 || (j12 ^ j13) >= 0) {
            return j14;
        }
        StringBuilder sbQ = H.q(j12, "Subtraction overflows a long: ", " - ");
        sbQ.append(j13);
        throw new ArithmeticException(sbQ.toString());
    }

    public static int m(long j12) {
        if (j12 > 2147483647L || j12 < -2147483648L) {
            throw new ArithmeticException(C21030p.a(j12, "Calculation overflows an int: "));
        }
        return (int) j12;
    }
}
