package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ii {
    public static void a(long j12, pr0 pr0Var, x91[] x91VarArr) {
        int i12;
        while (true) {
            if (pr0Var.a() <= 1) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (pr0Var.a() == 0) {
                    i12 = -1;
                    break;
                }
                int iT2 = pr0Var.t();
                i13 += iT2;
                if (iT2 != 255) {
                    i12 = i13;
                    break;
                }
            }
            int i14 = 0;
            while (true) {
                if (pr0Var.a() == 0) {
                    i14 = -1;
                    break;
                }
                int iT3 = pr0Var.t();
                i14 += iT3;
                if (iT3 != 255) {
                    break;
                }
            }
            int iD2 = pr0Var.d() + i14;
            if (i14 == -1 || i14 > pr0Var.a()) {
                ka0.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iD2 = pr0Var.e();
            } else if (i12 == 4 && i14 >= 8) {
                int iT4 = pr0Var.t();
                int iZ2 = pr0Var.z();
                int iH2 = iZ2 == 49 ? pr0Var.h() : 0;
                int iT5 = pr0Var.t();
                if (iZ2 == 47) {
                    pr0Var.f(1);
                }
                boolean z12 = iT4 == 181 && (iZ2 == 49 || iZ2 == 47) && iT5 == 3;
                if (iZ2 == 49) {
                    z12 &= iH2 == 1195456820;
                }
                if (z12) {
                    b(j12, pr0Var, x91VarArr);
                }
            }
            pr0Var.e(iD2);
        }
    }

    public static void b(long j12, pr0 pr0Var, x91[] x91VarArr) {
        int iT2 = pr0Var.t();
        if ((iT2 & 64) != 0) {
            pr0Var.f(1);
            int i12 = (iT2 & 31) * 3;
            int iD2 = pr0Var.d();
            for (x91 x91Var : x91VarArr) {
                pr0Var.e(iD2);
                x91Var.a(i12, pr0Var);
                if (j12 != -9223372036854775807L) {
                    x91Var.a(j12, 1, i12, 0, null);
                }
            }
        }
    }
}
