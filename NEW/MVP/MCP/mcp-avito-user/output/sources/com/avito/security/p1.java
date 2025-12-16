package com.avito.security;

/* loaded from: classes5.dex */
public final class p1 {
    private static final int a(int i12, int i13) {
        int i14 = i12 % i13;
        return i14 >= 0 ? i14 : i14 + i13;
    }

    public static final int b(int i12, int i13, int i14) {
        if (i14 > 0) {
            return i12 >= i13 ? i13 : i13 - a(i13, i12, i14);
        }
        if (i14 < 0) {
            return i12 <= i13 ? i13 : i13 + a(i12, i13, -i14);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int a(int i12, int i13, int i14) {
        return a(a(i12, i14) - a(i13, i14), i14);
    }
}
