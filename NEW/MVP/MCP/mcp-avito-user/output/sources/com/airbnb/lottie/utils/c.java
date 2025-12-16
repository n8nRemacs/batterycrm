package com.airbnb.lottie.utils;

import androidx.appcompat.app.r;

/* compiled from: GammaEvaluator.java */
/* loaded from: classes10.dex */
public class c {
    public static float a(float f12) {
        return f12 <= 0.04045f ? f12 / 12.92f : (float) Math.pow((f12 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f12) {
        return f12 <= 0.0031308f ? f12 * 12.92f : (float) ((Math.pow(f12, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(float f12, int i12, int i13) {
        if (i12 == i13 || f12 <= 0.0f) {
            return i12;
        }
        if (f12 >= 1.0f) {
            return i13;
        }
        float f13 = ((i12 >> 24) & 255) / 255.0f;
        float f14 = ((i13 >> 24) & 255) / 255.0f;
        float fA2 = a(((i12 >> 16) & 255) / 255.0f);
        float fA3 = a(((i12 >> 8) & 255) / 255.0f);
        float fA4 = a((i12 & 255) / 255.0f);
        float fA5 = a(((i13 >> 16) & 255) / 255.0f);
        float fA6 = a(((i13 >> 8) & 255) / 255.0f);
        float fA7 = a((i13 & 255) / 255.0f);
        float fC2 = r.c(f14, f13, f12, f13);
        float fC3 = r.c(fA5, fA2, f12, fA2);
        float fC4 = r.c(fA6, fA3, f12, fA3);
        float fC5 = r.c(fA7, fA4, f12, fA4);
        float fB2 = b(fC3) * 255.0f;
        float fB3 = b(fC4) * 255.0f;
        return Math.round(b(fC5) * 255.0f) | (Math.round(fB2) << 16) | (Math.round(fC2 * 255.0f) << 24) | (Math.round(fB3) << 8);
    }
}
