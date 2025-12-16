package defpackage;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class ff5 {
    public static final ns a = new ns();

    public static int a(int i, int i2) {
        if (i % 10 != 1) {
            return Math.round(i / i2) * i2;
        }
        return (int) (Math.floor(i / i2) * i2);
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int iMax = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                iMax = Math.max(iMax, codecProfileLevel.level);
            }
        }
        return iMax;
    }

    public static int c(MediaCodecInfo mediaCodecInfo, String str, int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities();
        audioCapabilities.getClass();
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        if (supportedSampleRates != null) {
            int length = supportedSampleRates.length;
            while (i2 < length) {
                int i4 = supportedSampleRates[i2];
                if (Math.abs(i4 - i) < Math.abs(i3 - i)) {
                    i3 = i4;
                }
                i2++;
            }
            return i3;
        }
        Range<Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
        int length2 = supportedSampleRateRanges.length;
        while (i2 < length2) {
            int iIntValue = ((Integer) supportedSampleRateRanges[i2].clamp(Integer.valueOf(i))).intValue();
            if (Math.abs(iIntValue - i) < Math.abs(i3 - i)) {
                i3 = iIntValue;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zjd d(int r5, java.lang.String r6) {
        /*
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.getClass()
            int r3 = r6.hashCode()
            r4 = -1
            switch(r3) {
                case -1851077871: goto L42;
                case -1662735862: goto L37;
                case -1662541442: goto L2e;
                case 1331836730: goto L23;
                case 1599127257: goto L18;
                default: goto L16;
            }
        L16:
            r0 = r4
            goto L4c
        L18:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L21
            goto L16
        L21:
            r0 = 4
            goto L4c
        L23:
            java.lang.String r0 = "video/avc"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2c
            goto L16
        L2c:
            r0 = 3
            goto L4c
        L2e:
            java.lang.String r3 = "video/hevc"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L4c
            goto L16
        L37:
            java.lang.String r0 = "video/av01"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L40
            goto L16
        L40:
            r0 = 1
            goto L4c
        L42:
            java.lang.String r0 = "video/dolby-vision"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4b
            goto L16
        L4b:
            r0 = 0
        L4c:
            r6 = 6
            r3 = 7
            switch(r0) {
                case 0: goto L8a;
                case 1: goto L7c;
                case 2: goto L6e;
                case 3: goto L61;
                case 4: goto L52;
                default: goto L51;
            }
        L51:
            goto L97
        L52:
            if (r5 == r3) goto L56
            if (r5 != r6) goto L97
        L56:
            r5 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            zjd r5 = defpackage.wg7.n(r2, r5)
            return r5
        L61:
            if (r5 != r3) goto L97
            r5 = 16
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            zjd r5 = defpackage.wg7.m(r5)
            return r5
        L6e:
            if (r5 != r3) goto L75
            zjd r5 = defpackage.wg7.m(r1)
            return r5
        L75:
            if (r5 != r6) goto L97
            zjd r5 = defpackage.wg7.m(r2)
            return r5
        L7c:
            if (r5 != r3) goto L83
            zjd r5 = defpackage.wg7.m(r1)
            return r5
        L83:
            if (r5 != r6) goto L97
            zjd r5 = defpackage.wg7.m(r2)
            return r5
        L8a:
            if (r5 != r3) goto L97
            r5 = 256(0x100, float:3.59E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            zjd r5 = defpackage.wg7.m(r5)
            return r5
        L97:
            t76 r5 = defpackage.wg7.b
            zjd r5 = defpackage.zjd.o
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff5.d(int, java.lang.String):zjd");
    }

    public static synchronized wg7 e(String str) {
        ns nsVar;
        String strG;
        List list;
        j();
        nsVar = a;
        strG = dsi.g(str);
        Collection collectionD = (Collection) nsVar.d.get(strG);
        if (collectionD == null) {
            collectionD = nsVar.d();
        }
        list = (List) collectionD;
        return wg7.j(list instanceof RandomAccess ? new w2(nsVar, strG, list, null) : new a3(nsVar, strG, list, (a3) null));
    }

    public static zjd f(String str, gf3 gf3Var) {
        if (Build.VERSION.SDK_INT < 33 || gf3Var == null) {
            t76 t76Var = wg7.b;
            return zjd.o;
        }
        wg7 wg7VarE = e(str);
        u4j.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        for (int i2 = 0; i2 < wg7VarE.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) wg7VarE.get(i2);
            if (!mediaCodecInfo.isAlias() && h(mediaCodecInfo, str, gf3Var)) {
                int i3 = i + 1;
                int iH = mg7.h(objArrCopyOf.length, i3);
                if (iH > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
                }
                objArrCopyOf[i] = mediaCodecInfo;
                i = i3;
            }
        }
        return wg7.h(i, objArrCopyOf);
    }

    public static Size g(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int iA = a(i, widthAlignment);
        int iA2 = a(i2, heightAlignment);
        if (i(mediaCodecInfo, str, iA, iA2)) {
            return new Size(iA, iA2);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int iA3 = a(Math.round(i * f), widthAlignment);
            int iA4 = a(Math.round(i2 * f), heightAlignment);
            if (i(mediaCodecInfo, str, iA3, iA4)) {
                return new Size(iA3, iA4);
            }
        }
        int iIntValue = ((Integer) videoCapabilities.getSupportedHeightsFor(((Integer) videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i))).intValue()).clamp(Integer.valueOf(i2))).intValue();
        if (iIntValue != i2) {
            i = a((int) Math.round((i * iIntValue) / i2), widthAlignment);
            i2 = a(iIntValue, heightAlignment);
        }
        if (i(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, gf3 gf3Var) {
        if (str.equals("video/dolby-vision") || mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hdr-editing") || (gf3Var.c == 7 && Build.VERSION.SDK_INT >= 35 && mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hlg-editing"))) {
            zjd zjdVarD = d(gf3Var.c, str);
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                if (zjdVarD.contains(Integer.valueOf(codecProfileLevel.profile))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        if (videoCapabilities.isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static synchronized void j() {
        if (a.o == 0) {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        a.f(dsi.g(str), mediaCodecInfo);
                    }
                }
            }
        }
    }
}
