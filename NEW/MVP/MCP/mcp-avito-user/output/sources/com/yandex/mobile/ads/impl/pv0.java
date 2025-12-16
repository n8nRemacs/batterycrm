package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ov0;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class pv0 {
    @j.P
    public static ov0 a(int i12, byte[] bArr) {
        ArrayList<ov0.a> arrayListA;
        int iH2;
        pr0 pr0Var = new pr0(bArr);
        try {
            pr0Var.f(4);
            iH2 = pr0Var.h();
            pr0Var.e(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (iH2 == 1886547818) {
            pr0Var.f(8);
            int iD2 = pr0Var.d();
            int iE2 = pr0Var.e();
            while (iD2 < iE2) {
                int iH3 = pr0Var.h() + iD2;
                if (iH3 > iD2 && iH3 <= iE2) {
                    int iH4 = pr0Var.h();
                    if (iH4 != 2037673328 && iH4 != 1836279920) {
                        pr0Var.e(iH3);
                        iD2 = iH3;
                    }
                    pr0Var.d(iH3);
                    arrayListA = a(pr0Var);
                    break;
                }
                break;
            }
            arrayListA = null;
        } else {
            arrayListA = a(pr0Var);
        }
        if (arrayListA == null) {
            return null;
        }
        int size = arrayListA.size();
        if (size == 1) {
            ov0.a aVar = arrayListA.get(0);
            return new ov0(aVar, aVar, i12);
        }
        if (size != 2) {
            return null;
        }
        return new ov0(arrayListA.get(0), arrayListA.get(1), i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd A[SYNTHETIC] */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.ov0.a> a(com.yandex.mobile.ads.impl.pr0 r28) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pv0.a(com.yandex.mobile.ads.impl.pr0):java.util.ArrayList");
    }
}
