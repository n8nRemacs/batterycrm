package com.google.common.base;

import aZ0.InterfaceC19845a;

/* compiled from: Preconditions.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public final class M {
    public static String a(int i12, int i13, String str) {
        if (i12 < 0) {
            return d0.b("%s (%s) must not be negative", str, Integer.valueOf(i12));
        }
        if (i13 >= 0) {
            return d0.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i12), Integer.valueOf(i13));
        }
        throw new IllegalArgumentException(AK.c.g(i13, "negative size: "));
    }

    public static void b(int i12, int i13, String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(d0.b(str, Integer.valueOf(i12), Integer.valueOf(i13)));
        }
    }

    public static void c(int i12, String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(d0.b(str, Integer.valueOf(i12)));
        }
    }

    public static void d(@I41.a String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(String str, boolean z12, long j12) {
        if (!z12) {
            throw new IllegalArgumentException(d0.b(str, Long.valueOf(j12)));
        }
    }

    public static void f(String str, boolean z12, @I41.a Object obj) {
        if (!z12) {
            throw new IllegalArgumentException(d0.b(str, obj));
        }
    }

    public static void g(boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(boolean z12, String str, @I41.a Object obj, @I41.a Object obj2) {
        if (!z12) {
            throw new IllegalArgumentException(d0.b(str, obj, obj2));
        }
    }

    @InterfaceC19845a
    public static void i(int i12, int i13) {
        String strB;
        if (i12 < 0 || i12 >= i13) {
            if (i12 < 0) {
                strB = d0.b("%s (%s) must not be negative", "index", Integer.valueOf(i12));
            } else {
                if (i13 < 0) {
                    throw new IllegalArgumentException(AK.c.g(i13, "negative size: "));
                }
                strB = d0.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i12), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    @InterfaceC19845a
    public static void j(@I41.a Object obj, @I41.a String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    @InterfaceC19845a
    public static void k(int i12, int i13) {
        if (i12 < 0 || i12 > i13) {
            throw new IndexOutOfBoundsException(a(i12, i13, "index"));
        }
    }

    public static void l(int i12, int i13, int i14) {
        if (i12 < 0 || i13 < i12 || i13 > i14) {
            throw new IndexOutOfBoundsException((i12 < 0 || i12 > i14) ? a(i12, i14, "start index") : (i13 < 0 || i13 > i14) ? a(i13, i14, "end index") : d0.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i13), Integer.valueOf(i12)));
        }
    }

    public static void m(int i12, String str, boolean z12) {
        if (!z12) {
            throw new IllegalStateException(d0.b(str, Integer.valueOf(i12)));
        }
    }

    public static void n(@I41.a String str, boolean z12) {
        if (!z12) {
            throw new IllegalStateException(str);
        }
    }

    public static void o(String str, boolean z12, long j12) {
        if (!z12) {
            throw new IllegalStateException(d0.b(str, Long.valueOf(j12)));
        }
    }

    public static void p(String str, boolean z12, @I41.a Object obj) {
        if (!z12) {
            throw new IllegalStateException(d0.b(str, obj));
        }
    }

    public static void q(boolean z12) {
        if (!z12) {
            throw new IllegalStateException();
        }
    }
}
