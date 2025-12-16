package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class gb1 {
    public static long a(int i12, int i13, pr0 pr0Var) {
        pr0Var.e(i12);
        if (pr0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iH2 = pr0Var.h();
        if ((8388608 & iH2) != 0 || ((2096896 & iH2) >> 8) != i13 || (iH2 & 32) == 0 || pr0Var.t() < 7 || pr0Var.a() < 7 || (pr0Var.t() & 16) != 16) {
            return -9223372036854775807L;
        }
        pr0Var.a(new byte[6], 0, 6);
        return ((255 & r0[4]) >> 7) | ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1);
    }
}
