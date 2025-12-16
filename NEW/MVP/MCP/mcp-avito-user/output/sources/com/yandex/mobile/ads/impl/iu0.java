package com.yandex.mobile.ads.impl;

import aZ0.InterfaceC19845a;

/* loaded from: classes8.dex */
public final class iu0 {
    public static void a(boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException();
        }
    }

    @InterfaceC19845a
    public static void b(int i12, int i13) {
        if (i12 < 0 || i12 > i13) {
            throw new IndexOutOfBoundsException(a(i12, i13, "index"));
        }
    }

    public static void a(@I41.a String str, boolean z12) {
        if (!z12) {
            throw new IllegalStateException(str);
        }
    }

    @InterfaceC19845a
    public static <T> T a(@I41.a T t12) {
        t12.getClass();
        return t12;
    }

    @InterfaceC19845a
    public static void a(int i12, int i13) {
        String strA;
        if (i12 < 0 || i12 >= i13) {
            if (i12 < 0) {
                strA = p71.a("%s (%s) must not be negative", "index", Integer.valueOf(i12));
            } else if (i13 >= 0) {
                strA = p71.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i12), Integer.valueOf(i13));
            } else {
                throw new IllegalArgumentException(ba.a("negative size: ", i13));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    private static String a(int i12, int i13, String str) {
        if (i12 < 0) {
            return p71.a("%s (%s) must not be negative", str, Integer.valueOf(i12));
        }
        if (i13 >= 0) {
            return p71.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i12), Integer.valueOf(i13));
        }
        throw new IllegalArgumentException(ba.a("negative size: ", i13));
    }

    public static void a(int i12, int i13, int i14) {
        String strA;
        if (i12 < 0 || i13 < i12 || i13 > i14) {
            if (i12 < 0 || i12 > i14) {
                strA = a(i12, i14, "start index");
            } else if (i13 >= 0 && i13 <= i14) {
                strA = p71.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i13), Integer.valueOf(i12));
            } else {
                strA = a(i13, i14, "end index");
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }
}
