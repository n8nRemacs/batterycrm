package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* loaded from: classes.dex */
public final class ow8 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ow8(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = wz9.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(xxg.f(i, widthAlignment) * widthAlignment, xxg.f(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ow8 g(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        /*
            ow8 r0 = new ow8
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L3d
            int r3 = defpackage.xxg.a
            r4 = 19
            if (r3 < r4) goto L3d
            java.lang.String r4 = "adaptive-playback"
            boolean r4 = r11.isFeatureSupported(r4)
            if (r4 == 0) goto L3d
            r4 = 22
            if (r3 > r4) goto L3b
            java.lang.String r3 = defpackage.xxg.d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2a
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r6 = r2
            goto L3e
        L3d:
            r6 = r1
        L3e:
            r3 = 21
            if (r11 == 0) goto L4c
            int r4 = defpackage.xxg.a
            if (r4 < r3) goto L4c
            java.lang.String r4 = "tunneled-playback"
            boolean r4 = r11.isFeatureSupported(r4)
        L4c:
            if (r13 != 0) goto L64
            if (r11 == 0) goto L5d
            int r13 = defpackage.xxg.a
            if (r13 < r3) goto L5d
            java.lang.String r13 = "secure-playback"
            boolean r13 = r11.isFeatureSupported(r13)
            if (r13 == 0) goto L5d
            goto L64
        L5d:
            r7 = r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1 = r8
            goto L6a
        L64:
            r7 = r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r2 = r9
        L6a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow8.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):ow8");
    }

    public final rh4 b(gf6 gf6Var, gf6 gf6Var2) {
        gf6 gf6Var3;
        gf6 gf6Var4;
        int i = !xxg.a(gf6Var.v0, gf6Var2.v0) ? 8 : 0;
        if (this.h) {
            if (gf6Var.D0 != gf6Var2.D0) {
                i |= 1024;
            }
            if (!this.e && (gf6Var.A0 != gf6Var2.A0 || gf6Var.B0 != gf6Var2.B0)) {
                i |= 512;
            }
            if (!xxg.a(gf6Var.H0, gf6Var2.H0)) {
                i |= 2048;
            }
            if (xxg.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !gf6Var.b(gf6Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new rh4(this.a, gf6Var, gf6Var2, gf6Var.b(gf6Var2) ? 3 : 2, 0);
            }
            gf6Var3 = gf6Var;
            gf6Var4 = gf6Var2;
        } else {
            gf6Var3 = gf6Var;
            gf6Var4 = gf6Var2;
            if (gf6Var3.I0 != gf6Var4.I0) {
                i |= 4096;
            }
            if (gf6Var3.J0 != gf6Var4.J0) {
                i |= 8192;
            }
            if (gf6Var3.K0 != gf6Var4.K0) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = cx8.d(gf6Var3);
                Pair pairD2 = cx8.d(gf6Var4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new rh4(this.a, gf6Var3, gf6Var4, 3, 0);
                    }
                }
            }
            if (!gf6Var3.b(gf6Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new rh4(this.a, gf6Var3, gf6Var4, 1, 0);
            }
        }
        return new rh4(this.a, gf6Var3, gf6Var4, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.gf6 r18) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow8.c(gf6):boolean");
    }

    public final boolean d(gf6 gf6Var) {
        if (this.h) {
            return this.e;
        }
        Pair pairD = cx8.d(gf6Var);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean e(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i < i2) {
            String str = this.a;
            if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(xxg.b)) && a(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.rotated, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                String string = sb.toString();
                String str2 = xxg.e;
                int iF = u45.f(u45.f(25, string), str);
                String str3 = this.b;
                StringBuilder sb2 = new StringBuilder(u45.f(u45.f(iF, str3), str2));
                sb2.append("AssumedSupport [");
                sb2.append(string);
                sb2.append("] [");
                sb2.append(str);
                ho7.r(sb2, ", ", str3, "] [", str2);
                sb2.append("]");
                Log.d("MediaCodecInfo", sb2.toString());
                return true;
            }
        }
        StringBuilder sb3 = new StringBuilder(69);
        sb3.append("sizeAndRate.support, ");
        sb3.append(i);
        sb3.append("x");
        sb3.append(i2);
        sb3.append("x");
        sb3.append(d);
        f(sb3.toString());
        return false;
    }

    public final void f(String str) {
        String str2 = xxg.e;
        int iF = u45.f(20, str);
        String str3 = this.a;
        int iF2 = u45.f(iF, str3);
        String str4 = this.b;
        StringBuilder sb = new StringBuilder(u45.f(u45.f(iF2, str4), str2));
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str3);
        ho7.r(sb, ", ", str4, "] [", str2);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    public final String toString() {
        return this.a;
    }
}
