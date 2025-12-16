package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;

/* loaded from: classes8.dex */
public final class cq {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final k11 f384383a = new k11();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final t11 f384384b = new t11();

    @j.N
    public final int a(@j.N Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point pointA = this.f384384b.a(context);
        int i12 = pointA.x;
        int i13 = pointA.y;
        float f12 = displayMetrics.density;
        float f13 = i12;
        float f14 = i13;
        float fMin = Math.min(f13 / f12, f14 / f12);
        float f15 = f12 * 160.0f;
        float f16 = f13 / f15;
        float f17 = f14 / f15;
        double dSqrt = Math.sqrt((f17 * f17) + (f16 * f16));
        if (a(context, dSqrt)) {
            return 3;
        }
        return (dSqrt >= 7.0d || fMin >= 600.0f) ? 2 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(@j.N android.content.Context r3, double r4) {
        /*
            r2 = this;
            r0 = 13
            boolean r0 = com.yandex.mobile.ads.impl.h7.a(r0)
            if (r0 == 0) goto L1a
            java.lang.String r4 = "uimode"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.UiModeManager r3 = (android.app.UiModeManager) r3
            if (r3 == 0) goto L2d
            int r3 = r3.getCurrentModeType()
            r4 = 4
            if (r3 != r4) goto L2d
            goto L2b
        L1a:
            r0 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L2d
            com.yandex.mobile.ads.impl.k11 r4 = r2.f384383a
            r4.getClass()
            boolean r3 = com.yandex.mobile.ads.impl.k11.a(r3)
            if (r3 != 0) goto L2d
        L2b:
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cq.a(android.content.Context, double):boolean");
    }
}
