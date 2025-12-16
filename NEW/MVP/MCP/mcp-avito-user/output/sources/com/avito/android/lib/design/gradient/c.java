package com.avito.android.lib.design.gradient;

import kotlin.Metadata;

/* compiled from: GradientPoints.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Q<android.graphics.PointF, android.graphics.PointF> a(int r5, int r6, int r7) {
        /*
            r0 = 360(0x168, float:5.04E-43)
            int r5 = r5 % r0
            double r1 = (double) r5
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            float r6 = (float) r6
            r2 = 2
            float r2 = (float) r2
            float r6 = r6 / r2
            float r7 = (float) r7
            float r7 = r7 / r2
            r2 = 0
            if (r5 == 0) goto L41
            r3 = 90
            if (r5 == r3) goto L3e
            r3 = 180(0xb4, float:2.52E-43)
            if (r5 == r3) goto L41
            r3 = 270(0x10e, float:3.78E-43)
            if (r5 == r3) goto L3e
            double r1 = (double) r1
            double r3 = java.lang.Math.tan(r1)
            float r3 = (float) r3
            float r3 = java.lang.Math.abs(r3)
            float r3 = r6 / r3
            float r3 = kotlin.ranges.s.c(r3, r7)
            int r4 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r4 != 0) goto L3f
            double r1 = java.lang.Math.tan(r1)
            float r1 = (float) r1
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r7
            r2 = r1
            goto L42
        L3e:
            r3 = r2
        L3f:
            r2 = r6
            goto L42
        L41:
            r3 = r7
        L42:
            r1 = 91
            if (r5 < 0) goto L5e
            if (r5 >= r1) goto L5e
            kotlin.Q r5 = new kotlin.Q
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r6 - r2
            float r4 = r7 + r3
            r0.<init>(r1, r4)
            android.graphics.PointF r1 = new android.graphics.PointF
            float r6 = r6 + r2
            float r7 = r7 - r3
            r1.<init>(r6, r7)
            r5.<init>(r0, r1)
            goto Laf
        L5e:
            r4 = 181(0xb5, float:2.54E-43)
            if (r1 > r5) goto L7a
            if (r5 >= r4) goto L7a
            kotlin.Q r5 = new kotlin.Q
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r6 - r2
            float r4 = r7 - r3
            r0.<init>(r1, r4)
            android.graphics.PointF r1 = new android.graphics.PointF
            float r6 = r6 + r2
            float r7 = r7 + r3
            r1.<init>(r6, r7)
            r5.<init>(r0, r1)
            goto Laf
        L7a:
            r1 = 271(0x10f, float:3.8E-43)
            if (r4 > r5) goto L96
            if (r5 >= r1) goto L96
            kotlin.Q r5 = new kotlin.Q
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r6 + r2
            float r4 = r7 - r3
            r0.<init>(r1, r4)
            android.graphics.PointF r1 = new android.graphics.PointF
            float r6 = r6 - r2
            float r7 = r7 + r3
            r1.<init>(r6, r7)
            r5.<init>(r0, r1)
            goto Laf
        L96:
            if (r1 > r5) goto Lb0
            if (r5 >= r0) goto Lb0
            kotlin.Q r5 = new kotlin.Q
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r6 + r2
            float r4 = r7 + r3
            r0.<init>(r1, r4)
            android.graphics.PointF r1 = new android.graphics.PointF
            float r6 = r6 - r2
            float r7 = r7 - r3
            r1.<init>(r6, r7)
            r5.<init>(r0, r1)
        Laf:
            return r5
        Lb0:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Impossible to get here"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.gradient.c.a(int, int, int):kotlin.Q");
    }
}
