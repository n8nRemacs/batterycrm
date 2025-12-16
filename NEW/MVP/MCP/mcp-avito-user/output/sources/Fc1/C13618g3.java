package Fc1;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.g3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13618g3 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k android.net.Uri.Builder r7, @Y61.k java.lang.String[] r8) throws java.util.MissingResourceException {
        /*
            int r0 = r8.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L8f
            r2 = r8[r1]
            int r3 = r2.hashCode()
            switch(r3) {
                case -1613589672: goto L75;
                case -1559661965: goto L69;
                case -1335157162: goto L35;
                case -856156354: goto L29;
                case 3556: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L7d
        Lf:
            java.lang.String r3 = "os"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L18
            goto L7d
        L18:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "android"
            r3.<init>(r4)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L88
        L29:
            java.lang.String r3 = "deviceVendor"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L32
            goto L7d
        L32:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            goto L88
        L35:
            java.lang.String r3 = "device"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L7d
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r4 = r3.heightPixels
            float r4 = (float) r4
            float r5 = r3.ydpi
            float r4 = r4 / r5
            int r5 = r3.widthPixels
            float r5 = (float) r5
            float r3 = r3.xdpi
            float r5 = r5 / r3
            float r5 = r5 * r5
            double r5 = (double) r5
            double r3 = (double) r4
            double r3 = r3 * r3
            double r3 = r3 + r5
            double r3 = java.lang.Math.sqrt(r3)
            r5 = 4619342137793917747(0x401b333333333333, double:6.8)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L66
            java.lang.String r3 = "tablet"
            goto L88
        L66:
            java.lang.String r3 = "mobile"
            goto L88
        L69:
            java.lang.String r3 = "deviceModel"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L72
            goto L7d
        L72:
            java.lang.String r3 = android.os.Build.PRODUCT
            goto L88
        L75:
            java.lang.String r3 = "language"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L80
        L7d:
            java.lang.String r3 = "nodata"
            goto L88
        L80:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.getISO3Language()
        L88:
            r7.appendQueryParameter(r2, r3)
            int r1 = r1 + 1
            goto L2
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13618g3.a(android.net.Uri$Builder, java.lang.String[]):void");
    }
}
