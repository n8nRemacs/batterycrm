package com.google.android.exoplayer2.extractor.ts;

/* compiled from: TsUtil.java */
/* loaded from: classes6.dex */
public final class E {
    public static long a(com.google.android.exoplayer2.util.F f12, int i12, int i13) {
        f12.B(i12);
        if (f12.a() < 5) {
            return -9223372036854775807L;
        }
        int iD2 = f12.d();
        if ((8388608 & iD2) != 0 || ((2096896 & iD2) >> 8) != i13 || (iD2 & 32) == 0 || f12.r() < 7 || f12.a() < 7 || (f12.r() & 16) != 16) {
            return -9223372036854775807L;
        }
        f12.c(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
