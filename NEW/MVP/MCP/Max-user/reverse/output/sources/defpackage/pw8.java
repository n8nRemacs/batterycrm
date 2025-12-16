package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pw8 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public int m;
    public int n;
    public float o;

    public pw8(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = z7;
        this.l = xz9.m(str2);
        this.o = -3.4028235E38f;
        this.m = -1;
        this.n = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(zxg.f(i, widthAlignment) * widthAlignment, zxg.f(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pw8 j(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            pw8 r0 = new pw8
            r1 = 0
            r2 = 1
            if (r15 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r2
            goto L11
        L10:
            r8 = r1
        L11:
            if (r15 == 0) goto L1d
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L1d
            r9 = r2
            goto L1e
        L1d:
            r9 = r1
        L1e:
            if (r19 != 0) goto L2d
            if (r15 == 0) goto L2b
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L2b
            goto L2d
        L2b:
            r10 = r1
            goto L2e
        L2d:
            r10 = r2
        L2e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L75
            if (r15 == 0) goto L75
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L75
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L75
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L75
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L75
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L75
            java.lang.String r4 = "LENOVO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L69
            goto L75
        L69:
            r11 = r2
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r2 = r13
            goto L80
        L75:
            r11 = r1
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r1 = r12
        L80:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw8.j(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):pw8");
    }

    public final sh4 b(hf6 hf6Var, hf6 hf6Var2) {
        hf6 hf6Var3;
        hf6 hf6Var4;
        int i;
        String str = hf6Var.n;
        gf3 gf3Var = hf6Var.D;
        String str2 = hf6Var2.n;
        gf3 gf3Var2 = hf6Var2.D;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.l) {
            if (hf6Var.z != hf6Var2.z) {
                i2 |= 1024;
            }
            boolean z = (hf6Var.u == hf6Var2.u && hf6Var.v == hf6Var2.v) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!gf3.g(gf3Var) || !gf3.g(gf3Var2)) && !Objects.equals(gf3Var, gf3Var2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !hf6Var.c(hf6Var2)) {
                i2 |= 2;
            }
            int i3 = hf6Var.w;
            if (i3 != -1 && (i = hf6Var.x) != -1 && i3 == hf6Var2.w && i == hf6Var2.x && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new sh4(this.a, hf6Var, hf6Var2, hf6Var.c(hf6Var2) ? 3 : 2, 0);
            }
            hf6Var3 = hf6Var;
            hf6Var4 = hf6Var2;
        } else {
            hf6Var3 = hf6Var;
            hf6Var4 = hf6Var2;
            if (hf6Var3.F != hf6Var4.F) {
                i2 |= 4096;
            }
            if (hf6Var3.G != hf6Var4.G) {
                i2 |= 8192;
            }
            if (hf6Var3.H != hf6Var4.H) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                HashMap map = dx8.a;
                Pair pairB = ed3.b(hf6Var3);
                Pair pairB2 = ed3.b(hf6Var4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new sh4(this.a, hf6Var3, hf6Var4, 3, 0);
                    }
                }
            }
            if (!hf6Var3.c(hf6Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new sh4(this.a, hf6Var3, hf6Var4, 1, 0);
            }
        }
        return new sh4(this.a, hf6Var3, hf6Var4, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1 A[PHI: r2
  0x00c1: PHI (r2v2 android.util.Pair) = (r2v1 android.util.Pair), (r2v1 android.util.Pair), (r2v1 android.util.Pair), (r2v14 android.util.Pair) binds: [B:3:0x0010, B:5:0x0018, B:10:0x002c, B:37:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.hf6 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw8.c(hf6, boolean):boolean");
    }

    public final boolean d(hf6 hf6Var) {
        return (Objects.equals(hf6Var.n, "audio/flac") && hf6Var.H == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(hf6 hf6Var) {
        int i;
        String str = hf6Var.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(dx8.b(hf6Var))) || !c(hf6Var, true) || !d(hf6Var)) {
            return false;
        }
        if (this.l) {
            int i2 = hf6Var.u;
            if (i2 > 0 && (i = hf6Var.v) > 0) {
                return h(i2, i, hf6Var.y);
            }
        } else {
            int i3 = hf6Var.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    i("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    i("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    i("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = hf6Var.F;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    i("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    i("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder sbM = utb.m(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    sbM.append(i5);
                    sbM.append("]");
                    a8i.l("MediaCodecInfo", sbM.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    i("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(hf6 hf6Var) {
        if (this.l) {
            return this.e;
        }
        HashMap map = dx8.a;
        Pair pairB = ed3.b(hf6Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r12, int r13, double r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw8.h(int, int, double):boolean");
    }

    public final void i(String str) {
        StringBuilder sbN = az1.n("NoSupport [", str, "] [");
        sbN.append(this.a);
        sbN.append(", ");
        sbN.append(this.b);
        sbN.append("] [");
        sbN.append(zxg.a);
        sbN.append("]");
        a8i.e("MediaCodecInfo", sbN.toString());
    }

    public final String toString() {
        return this.a;
    }
}
