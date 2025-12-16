package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
public final class i7 {
    public static boolean a(@j.N Context context, @j.N SizeInfo sizeInfo, @j.N SizeInfo sizeInfo2) {
        if (b(context, sizeInfo, sizeInfo2)) {
            int iC2 = rj1.c(context);
            int iB2 = rj1.b(context);
            int iC3 = sizeInfo.c(context);
            int iA2 = sizeInfo.a(context);
            if (iC3 <= iC2 && iA2 <= iB2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(@j.N android.content.Context r5, @j.N com.yandex.mobile.ads.base.SizeInfo r6, @j.N com.yandex.mobile.ads.base.SizeInfo r7) {
        /*
            int r0 = r7.c(r5)
            int r1 = r7.a(r5)
            int r2 = r6.c(r5)
            int r5 = r6.a(r5)
            int r6 = r7.d()
            int r6 = com.yandex.mobile.ads.impl.n6.a(r6)
            r7 = 1
            r3 = 0
            if (r6 == 0) goto L30
            if (r6 == r7) goto L25
            r4 = 2
            if (r6 == r4) goto L36
            r4 = 3
            if (r6 == r4) goto L25
            goto L2e
        L25:
            if (r2 > r0) goto L2e
            if (r0 <= 0) goto L2e
            if (r5 <= r1) goto L36
            if (r1 != 0) goto L2e
            goto L36
        L2e:
            r7 = r3
            goto L36
        L30:
            if (r2 > r0) goto L2e
            if (r0 <= 0) goto L2e
            if (r5 > r1) goto L2e
        L36:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.i7.b(android.content.Context, com.yandex.mobile.ads.base.SizeInfo, com.yandex.mobile.ads.base.SizeInfo):boolean");
    }

    public static boolean a(@j.N Context context, @j.P SizeInfo sizeInfo) {
        int iB2 = rj1.b(context);
        int iC2 = rj1.c(context);
        if (sizeInfo != null) {
            int iC3 = sizeInfo.c(context);
            int iA2 = sizeInfo.a(context);
            if (iC3 <= iB2 && iA2 <= iC2) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(@j.N Context context, @j.P SizeInfo sizeInfo) {
        int iC2 = rj1.c(context);
        int iB2 = rj1.b(context);
        if (sizeInfo != null) {
            int iC3 = sizeInfo.c(context);
            int iA2 = sizeInfo.a(context);
            if (iC3 <= iC2 && iA2 <= iB2) {
                return true;
            }
        }
        return false;
    }
}
