package androidx.core.graphics;

import android.graphics.Color;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import j.N;
import j.X;

/* compiled from: ColorUtils.java */
/* renamed from: androidx.core.graphics.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22767g {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<double[]> f44773a = new ThreadLocal<>();

    /* compiled from: ColorUtils.java */
    @X
    /* renamed from: androidx.core.graphics.g$a */
    public static class a {
    }

    public static void a(@j.F int i12, @j.F int i13, @j.F int i14, @N float[] fArr) {
        float f12;
        float fAbs;
        float f13 = i12 / 255.0f;
        float f14 = i13 / 255.0f;
        float f15 = i14 / 255.0f;
        float fMax = Math.max(f13, Math.max(f14, f15));
        float fMin = Math.min(f13, Math.min(f14, f15));
        float f16 = fMax - fMin;
        float f17 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f12 = 0.0f;
            fAbs = 0.0f;
        } else {
            f12 = fMax == f13 ? ((f14 - f15) / f16) % 6.0f : fMax == f14 ? ((f15 - f13) / f16) + 2.0f : 4.0f + ((f13 - f14) / f16);
            fAbs = f16 / (1.0f - Math.abs((2.0f * f17) - 1.0f));
        }
        float f18 = (f12 * 60.0f) % 360.0f;
        if (f18 < 0.0f) {
            f18 += 360.0f;
        }
        fArr[0] = f18 < 0.0f ? 0.0f : Math.min(f18, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f17 >= 0.0f ? Math.min(f17, 1.0f) : 0.0f;
    }

    @InterfaceC42156l
    public static int b(@InterfaceC42167x double d12, @InterfaceC42167x double d13, @InterfaceC42167x double d14) {
        double d15 = (((-0.4986d) * d14) + (((-1.5372d) * d13) + (3.2406d * d12))) / 100.0d;
        double d16 = ((0.0415d * d14) + ((1.8758d * d13) + ((-0.9689d) * d12))) / 100.0d;
        double d17 = ((1.057d * d14) + (((-0.204d) * d13) + (0.0557d * d12))) / 100.0d;
        double dPow = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        double dPow2 = d16 > 0.0031308d ? (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d : d16 * 12.92d;
        double dPow3 = d17 > 0.0031308d ? (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d : d17 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    @InterfaceC42156l
    public static int c(@InterfaceC42167x float f12, @InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        float f13 = 1.0f - f12;
        return Color.argb((int) ((Color.alpha(i13) * f12) + (Color.alpha(i12) * f13)), (int) ((Color.red(i13) * f12) + (Color.red(i12) * f13)), (int) ((Color.green(i13) * f12) + (Color.green(i12) * f13)), (int) ((Color.blue(i13) * f12) + (Color.blue(i12) * f13)));
    }

    public static double d(@InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        if (Color.alpha(i13) != 255) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.m(i13, new StringBuilder("background can not be translucent: #")));
        }
        if (Color.alpha(i12) < 255) {
            i12 = g(i12, i13);
        }
        double dE2 = e(i12) + 0.05d;
        double dE3 = e(i13) + 0.05d;
        return Math.max(dE2, dE3) / Math.min(dE2, dE3);
    }

    @InterfaceC42167x
    public static double e(@InterfaceC42156l int i12) {
        ThreadLocal<double[]> threadLocal = f44773a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i12);
        int iGreen = Color.green(i12);
        int iBlue = Color.blue(i12);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d12 = iRed / 255.0d;
        double dPow = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        double d13 = iGreen / 255.0d;
        double dPow2 = d13 < 0.04045d ? d13 / 12.92d : Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
        double d14 = iBlue / 255.0d;
        double dPow3 = d14 < 0.04045d ? d14 / 12.92d : Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d15 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d15;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d15 / 100.0d;
    }

    public static int f(float f12, @InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        int i14 = 255;
        if (Color.alpha(i13) != 255) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.m(i13, new StringBuilder("background can not be translucent: #")));
        }
        double d12 = f12;
        if (d(i(i12, 255), i13) < d12) {
            return -1;
        }
        int i15 = 0;
        for (int i16 = 0; i16 <= 10 && i14 - i15 > 1; i16++) {
            int i17 = (i15 + i14) / 2;
            if (d(i(i12, i17), i13) < d12) {
                i15 = i17;
            } else {
                i14 = i17;
            }
        }
        return i14;
    }

    public static int g(@InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        int iAlpha = Color.alpha(i13);
        int iAlpha2 = Color.alpha(i12);
        int i14 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i14, h(Color.red(i12), iAlpha2, Color.red(i13), iAlpha, i14), h(Color.green(i12), iAlpha2, Color.green(i13), iAlpha, i14), h(Color.blue(i12), iAlpha2, Color.blue(i13), iAlpha, i14));
    }

    public static int h(int i12, int i13, int i14, int i15, int i16) {
        if (i16 == 0) {
            return 0;
        }
        return androidx.compose.foundation.H.b(255, i13, i14 * i15, (i12 * 255) * i13) / (i16 * 255);
    }

    @InterfaceC42156l
    public static int i(@InterfaceC42156l int i12, @j.F int i13) {
        if (i13 < 0 || i13 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i12 & 16777215) | (i13 << 24);
    }
}
