package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: ColorUtils.java */
@RestrictTo
/* renamed from: com.google.android.material.color.utilities.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37039c {

    /* renamed from: a, reason: collision with root package name */
    public static final double[] f356336a = {95.047d, 100.0d, 108.883d};

    public static double a(double d12) {
        return d12 > 0.008856451679035631d ? Math.pow(d12, 0.3333333333333333d) : ((d12 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double b(double d12) {
        double d13 = (d12 + 16.0d) / 116.0d;
        double d14 = d13 * d13 * d13;
        if (d14 <= 0.008856451679035631d) {
            d14 = ((d13 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d14 * 100.0d;
    }
}
