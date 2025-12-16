package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class s65 implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        ThreadLocal[] threadLocalArr = u65.a;
        b = v9j.c(4611686018427387903L);
        c = v9j.c(-4611686018427387903L);
    }

    public /* synthetic */ s65(long j) {
        this.a = j;
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return v9j.c(n7j.e(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return v9j.e((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void c(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strJ = vmf.J(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strJ.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strJ.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strJ, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strJ, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int d(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return fni.c(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final long g(long j) {
        return ((((int) j) & 1) != 1 || j(j)) ? m(j, y65.MILLISECONDS) : j >> 1;
    }

    public static final long h(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j2 * 1000000;
    }

    public static final int i(long j) {
        if (j(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean j(long j) {
        return j == b || j == c;
    }

    public static final long k(long j, long j2) {
        return l(j, o(j2));
    }

    public static final long l(long j, long j2) {
        if (j(j)) {
            if (!j(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (j(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? v9j.c(j3 / 1000000) : v9j.e(j3) : v9j.d(j3);
    }

    public static final long m(long j, y65 y65Var) {
        if (j == b) {
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        return y65Var.a.convert(j >> 1, ((((int) j) & 1) == 0 ? y65.NANOSECONDS : y65.MILLISECONDS).a);
    }

    public static String n(long j) {
        long j2;
        int iM;
        if (j == 0) {
            return "0s";
        }
        if (j == b) {
            return "Infinity";
        }
        if (j == c) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long jO = j < 0 ? o(j) : j;
        long jM = m(jO, y65.DAYS);
        int iM2 = j(jO) ? 0 : (int) (m(jO, y65.HOURS) % 24);
        if (j(jO)) {
            j2 = 0;
            iM = 0;
        } else {
            j2 = 0;
            iM = (int) (m(jO, y65.MINUTES) % 60);
        }
        int iM3 = j(jO) ? 0 : (int) (m(jO, y65.SECONDS) % 60);
        int i2 = i(jO);
        boolean z2 = jM != j2;
        boolean z3 = iM2 != 0;
        boolean z4 = iM != 0;
        boolean z5 = (iM3 == 0 && i2 == 0) ? false : true;
        if (z2) {
            sb.append(jM);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM2);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM);
            sb.append('m');
            i = i4;
        }
        if (z5) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM3 != 0 || z2 || z3 || z4) {
                c(sb, iM3, i2, 9, "s", false);
            } else if (i2 >= 1000000) {
                c(sb, i2 / 1000000, i2 % 1000000, 6, "ms", false);
            } else if (i2 >= 1000) {
                c(sb, i2 / 1000, i2 % 1000, 3, "us", false);
            } else {
                sb.append(i2);
                sb.append("ns");
            }
            i = i5;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long o(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        ThreadLocal[] threadLocalArr = u65.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return d(this.a, ((s65) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s65) {
            return this.a == ((s65) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return n(this.a);
    }
}
