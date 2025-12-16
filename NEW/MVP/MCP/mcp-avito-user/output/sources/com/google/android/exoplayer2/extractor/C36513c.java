package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.F;

/* compiled from: CeaUtil.java */
/* renamed from: com.google.android.exoplayer2.extractor.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36513c {
    public static void a(long j12, F f12, A[] aArr) {
        int i12;
        while (true) {
            if (f12.a() <= 1) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (f12.a() == 0) {
                    i12 = -1;
                    break;
                }
                int iR2 = f12.r();
                i13 += iR2;
                if (iR2 != 255) {
                    i12 = i13;
                    break;
                }
            }
            int i14 = 0;
            while (true) {
                if (f12.a() == 0) {
                    i14 = -1;
                    break;
                }
                int iR3 = f12.r();
                i14 += iR3;
                if (iR3 != 255) {
                    break;
                }
            }
            int i15 = f12.f348071b + i14;
            if (i14 == -1 || i14 > f12.a()) {
                i15 = f12.f348072c;
            } else if (i12 == 4 && i14 >= 8) {
                int iR4 = f12.r();
                int iW2 = f12.w();
                int iD2 = iW2 == 49 ? f12.d() : 0;
                int iR5 = f12.r();
                if (iW2 == 47) {
                    f12.C(1);
                }
                boolean z12 = iR4 == 181 && (iW2 == 49 || iW2 == 47) && iR5 == 3;
                if (iW2 == 49) {
                    z12 &= iD2 == 1195456820;
                }
                if (z12) {
                    b(j12, f12, aArr);
                }
            }
            f12.B(i15);
        }
    }

    public static void b(long j12, F f12, A[] aArr) {
        int iR2 = f12.r();
        if ((iR2 & 64) != 0) {
            f12.C(1);
            int i12 = (iR2 & 31) * 3;
            int i13 = f12.f348071b;
            for (A a12 : aArr) {
                f12.B(i13);
                a12.c(i12, f12);
                if (j12 != -9223372036854775807L) {
                    a12.f(j12, 1, i12, 0, null);
                }
            }
        }
    }
}
