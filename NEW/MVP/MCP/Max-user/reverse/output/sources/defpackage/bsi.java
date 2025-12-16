package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class bsi {
    public static final void a(c54 c54Var) {
        oc3 oc3Var = new oc3(c54Var);
        if (c54Var.getRouter() != null) {
            c54Var.getRouter().a(oc3Var);
        } else {
            c54Var.addLifecycleListener(new q9(c54Var, 17, oc3Var));
        }
    }

    public static final void b(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(wy1.g("toIndex (", i, ") is greater than size (", i2, ")."));
        }
    }

    public static final long c(long j) {
        if (j < 0) {
            int i = s65.d;
            return s65.c;
        }
        int i2 = s65.d;
        return s65.b;
    }

    public static final long d(long j, long j2, y65 y65Var) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return v9j.i(j3, y65Var);
        }
        y65 y65Var2 = y65.MILLISECONDS;
        if (y65Var.compareTo(y65Var2) >= 0) {
            return s65.o(c(j3));
        }
        long jConvert = y65Var.a.convert(1L, y65Var2.a);
        long j4 = (j / jConvert) - (j2 / jConvert);
        long j5 = (j % jConvert) - (j2 % jConvert);
        int i = s65.d;
        return s65.l(v9j.i(j4, y65Var2), v9j.i(j5, y65Var));
    }

    public static final long e(long j, long j2, y65 y65Var) {
        if (((j2 - 1) | 1) != BuildConfig.MAX_TIME_TO_UPLOAD) {
            return (1 | (j - 1)) == BuildConfig.MAX_TIME_TO_UPLOAD ? c(j) : d(j, j2, y65Var);
        }
        if (j != j2) {
            return s65.o(c(j2));
        }
        int i = s65.d;
        return 0L;
    }
}
