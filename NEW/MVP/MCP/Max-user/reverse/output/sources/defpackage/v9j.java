package defpackage;

import android.os.RemoteException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class v9j {
    public static final long a(String str) {
        y65 y65Var;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = s65.d;
        char cCharAt2 = str.charAt(0);
        int i2 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = i2 > 0 && vmf.V(str, '-');
        if (length <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException();
        }
        int i3 = i2 + 1;
        if (i3 == length) {
            throw new IllegalArgumentException();
        }
        y65 y65Var2 = null;
        long jL = 0;
        boolean z2 = false;
        while (i3 < length) {
            if (str.charAt(i3) != 'T') {
                int i4 = i3;
                while (i4 < str.length() && (('0' <= (cCharAt = str.charAt(i4)) && cCharAt < ':') || vmf.t("+-.", cCharAt))) {
                    i4++;
                }
                String strSubstring = str.substring(i3, i4);
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i3;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i5 = length2 + 1;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        y65Var = y65.HOURS;
                    } else if (cCharAt3 == 'M') {
                        y65Var = y65.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        y65Var = y65.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    y65Var = y65.DAYS;
                }
                if (y65Var2 != null && y65Var2.compareTo(y65Var) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iC = vmf.C(strSubstring, '.', 0, 6);
                jL = (y65Var != y65.SECONDS || iC <= 0) ? s65.l(jL, i(f(strSubstring), y65Var)) : s65.l(s65.l(jL, i(f(strSubstring.substring(0, iC)), y65Var)), g(Double.parseDouble(strSubstring.substring(iC)), y65Var));
                y65Var2 = y65Var;
                i3 = i5;
            } else {
                if (z2 || (i3 = i3 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z2 = true;
            }
        }
        return z ? s65.o(jL) : jL;
    }

    public static void b(ya7 ya7Var) {
        if (ya7Var != null) {
            try {
                ya7Var.onDisconnected();
            } catch (RemoteException unused) {
            }
        }
    }

    public static final long c(long j) {
        long j2 = (j << 1) + 1;
        int i = s65.d;
        ThreadLocal[] threadLocalArr = u65.a;
        return j2;
    }

    public static final long d(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? c(n7j.e(j, -4611686018427387903L, 4611686018427387903L)) : e(j * 1000000);
    }

    public static final long e(long j) {
        long j2 = j << 1;
        int i = s65.d;
        ThreadLocal[] threadLocalArr = u65.a;
        return j2;
    }

    public static final long f(String str) {
        int length = str.length();
        int i = (length <= 0 || !vmf.t("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            Iterable to7Var = new to7(i, vmf.y(str), 1);
            if (!(to7Var instanceof Collection) || !((Collection) to7Var).isEmpty()) {
                Iterator it = to7Var.iterator();
                while (((so7) it).c) {
                    char cCharAt = str.charAt(((so7) it).nextInt());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        return dnf.r(str, "+", false) ? Long.parseLong(vmf.u(1, str)) : Long.parseLong(str);
    }

    public static final long g(double d, y65 y65Var) {
        double dA = w9j.a(d, y65Var, y65.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jE = kti.e(dA);
        return (-4611686018426999999L > jE || jE >= 4611686018427000000L) ? d(kti.e(w9j.a(d, y65Var, y65.MILLISECONDS))) : e(jE);
    }

    public static final long h(int i, y65 y65Var) {
        if (y65Var.compareTo(y65.SECONDS) > 0) {
            return i(i, y65Var);
        }
        return e(y65.NANOSECONDS.a.convert(i, y65Var.a));
    }

    public static final long i(long j, y65 y65Var) {
        y65 y65Var2 = y65.NANOSECONDS;
        TimeUnit timeUnit = y65Var.a;
        TimeUnit timeUnit2 = y65Var.a;
        long jConvert = timeUnit.convert(4611686018426999999L, y65Var2.a);
        return ((-jConvert) > j || j > jConvert) ? c(n7j.e(y65.MILLISECONDS.a.convert(j, timeUnit2), -4611686018427387903L, 4611686018427387903L)) : e(y65Var2.a.convert(j, timeUnit2));
    }
}
