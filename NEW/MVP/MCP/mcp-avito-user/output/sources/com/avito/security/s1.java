package com.avito.security;

/* loaded from: classes5.dex */
class s1 extends r1 {
    public static int a(int i12, int i13) {
        return i12 < i13 ? i13 : i12;
    }

    public static int b(int i12, int i13) {
        return i12 > i13 ? i13 : i12;
    }

    public static v0 c(int i12, int i13) {
        return v0.f338625d.a(i12, i13, -1);
    }

    public static x0 d(int i12, int i13) {
        return i13 <= Integer.MIN_VALUE ? x0.f338635f.a() : new x0(i12, i13 - 1);
    }

    public static int a(int i12, int i13, int i14) {
        if (i13 <= i14) {
            return i12 < i13 ? i13 : i12 > i14 ? i14 : i12;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i14 + " is less than minimum " + i13 + '.');
    }
}
