package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: ViewingConditions.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class P {
    static {
        double[] dArr = C37039c.f356336a;
        double dB2 = (C37039c.b(50.0d) * 63.66197723675813d) / 100.0d;
        double dMax = Math.max(0.1d, 50.0d);
        double[][] dArr2 = C37038b.f356335a;
        double d12 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d13 = dArr3[0] * d12;
        double d14 = dArr[1];
        double d15 = (dArr3[1] * d14) + d13;
        double d16 = dArr[2];
        double d17 = (dArr3[2] * d16) + d15;
        double[] dArr4 = dArr2[1];
        double d18 = (dArr4[2] * d16) + (dArr4[1] * d14) + (dArr4[0] * d12);
        double[] dArr5 = dArr2[2];
        double d19 = (d16 * dArr5[2]) + (d14 * dArr5[1]) + (d12 * dArr5[0]);
        double dExp = (1.0d - (Math.exp(((-dB2) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (dExp < 0.0d) {
            dExp = 0.0d;
        } else if (dExp > 1.0d) {
            dExp = 1.0d;
        }
        double[] dArr6 = {(((100.0d / d17) * dExp) + 1.0d) - dExp, (((100.0d / d18) * dExp) + 1.0d) - dExp, (((100.0d / d19) * dExp) + 1.0d) - dExp};
        double d22 = 5.0d * dB2;
        double d23 = 1.0d / (d22 + 1.0d);
        double d24 = d23 * d23 * d23 * d23;
        double d25 = 1.0d - d24;
        double dCbrt = (Math.cbrt(d22) * 0.1d * d25 * d25) + (d24 * dB2);
        double dB3 = C37039c.b(dMax) / dArr[1];
        Math.sqrt(dB3);
        Math.pow(dB3, 0.2d);
        Math.pow(((dArr6[0] * dCbrt) * d17) / 100.0d, 0.42d);
        Math.pow(((dArr6[1] * dCbrt) * d18) / 100.0d, 0.42d);
        Math.pow(((dArr6[2] * dCbrt) * d19) / 100.0d, 0.42d);
        Math.pow(dCbrt, 0.25d);
    }

    public P(double d12, double d13, double d14, double d15, double d16, double d17, double[] dArr, double d18, double d19, double d22) {
    }
}
