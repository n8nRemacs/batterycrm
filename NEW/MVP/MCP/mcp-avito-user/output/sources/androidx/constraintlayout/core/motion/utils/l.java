package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* compiled from: MonotonicCurveFit.java */
/* loaded from: classes.dex */
public class l extends b {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f43315a;

    /* renamed from: b, reason: collision with root package name */
    public final double[][] f43316b;

    /* renamed from: c, reason: collision with root package name */
    public final double[][] f43317c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43318d = true;

    /* renamed from: e, reason: collision with root package name */
    public final double[] f43319e;

    public l(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f43319e = new double[length2];
        int i12 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i12, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i13 = 0; i13 < length2; i13++) {
            int i14 = 0;
            while (i14 < i12) {
                int i15 = i14 + 1;
                double d12 = dArr[i15] - dArr[i14];
                double[] dArr5 = dArr3[i14];
                double d13 = (dArr2[i15][i13] - dArr2[i14][i13]) / d12;
                dArr5[i13] = d13;
                if (i14 == 0) {
                    dArr4[i14][i13] = d13;
                } else {
                    dArr4[i14][i13] = (dArr3[i14 - 1][i13] + d13) * 0.5d;
                }
                i14 = i15;
            }
            dArr4[i12][i13] = dArr3[length - 2][i13];
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < length2; i17++) {
                double d14 = dArr3[i16][i17];
                if (d14 == 0.0d) {
                    dArr4[i16][i17] = 0.0d;
                    dArr4[i16 + 1][i17] = 0.0d;
                } else {
                    double d15 = dArr4[i16][i17] / d14;
                    int i18 = i16 + 1;
                    double d16 = dArr4[i18][i17] / d14;
                    double dHypot = Math.hypot(d15, d16);
                    if (dHypot > 9.0d) {
                        double d17 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i16];
                        double[] dArr7 = dArr3[i16];
                        dArr6[i17] = d15 * d17 * dArr7[i17];
                        dArr4[i18][i17] = d17 * d16 * dArr7[i17];
                    }
                }
            }
        }
        this.f43315a = dArr;
        this.f43316b = dArr2;
        this.f43317c = dArr4;
    }

    public static double h(double d12, double d13, double d14, double d15, double d16, double d17) {
        double d18 = d13 * d13;
        double d19 = d13 * 6.0d;
        double d22 = 6.0d * d18 * d14;
        double d23 = 3.0d * d12;
        return (d12 * d16) + (((((d23 * d16) * d18) + (((d23 * d17) * d18) + ((d22 + ((d19 * d15) + (((-6.0d) * d18) * d15))) - (d19 * d14)))) - (((2.0d * d12) * d17) * d13)) - (((4.0d * d12) * d16) * d13));
    }

    public static double i(double d12, double d13, double d14, double d15, double d16, double d17) {
        double d18 = d13 * d13;
        double d19 = d18 * d13;
        double d22 = 3.0d * d18;
        double d23 = d19 * 2.0d * d14;
        double d24 = ((d23 + ((d22 * d15) + (((-2.0d) * d19) * d15))) - (d22 * d14)) + d14;
        double d25 = d12 * d17;
        double d26 = (d25 * d19) + d24;
        double d27 = d12 * d16;
        return (d27 * d13) + ((((d19 * d27) + d26) - (d25 * d18)) - (((2.0d * d12) * d16) * d18));
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final double b(double d12) {
        double d13;
        double d14;
        double dE2;
        double[] dArr = this.f43315a;
        int length = dArr.length;
        boolean z12 = this.f43318d;
        double[][] dArr2 = this.f43316b;
        if (z12) {
            double d15 = dArr[0];
            if (d12 <= d15) {
                d13 = dArr2[0][0];
                d14 = d12 - d15;
                dE2 = e(d15);
            } else {
                int i12 = length - 1;
                double d16 = dArr[i12];
                if (d12 >= d16) {
                    d13 = dArr2[i12][0];
                    d14 = d12 - d16;
                    dE2 = e(d16);
                }
            }
            return (dE2 * d14) + d13;
        }
        if (d12 <= dArr[0]) {
            return dArr2[0][0];
        }
        int i13 = length - 1;
        if (d12 >= dArr[i13]) {
            return dArr2[i13][0];
        }
        int i14 = 0;
        while (i14 < length - 1) {
            double d17 = dArr[i14];
            if (d12 == d17) {
                return dArr2[i14][0];
            }
            int i15 = i14 + 1;
            double d18 = dArr[i15];
            if (d12 < d18) {
                double d19 = d18 - d17;
                double d22 = (d12 - d17) / d19;
                double d23 = dArr2[i14][0];
                double d24 = dArr2[i15][0];
                double[][] dArr3 = this.f43317c;
                return i(d19, d22, d23, d24, dArr3[i14][0], dArr3[i15][0]);
            }
            i14 = i15;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void c(double d12, double[] dArr) {
        double[] dArr2 = this.f43315a;
        int length = dArr2.length;
        double[][] dArr3 = this.f43316b;
        int i12 = 0;
        int length2 = dArr3[0].length;
        if (this.f43318d) {
            double d13 = dArr2[0];
            double[] dArr4 = this.f43319e;
            if (d12 <= d13) {
                f(d13, dArr4);
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = ((d12 - dArr2[0]) * dArr4[i13]) + dArr3[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            double d14 = dArr2[i14];
            if (d12 >= d14) {
                f(d14, dArr4);
                while (i12 < length2) {
                    dArr[i12] = ((d12 - dArr2[i14]) * dArr4[i12]) + dArr3[i14][i12];
                    i12++;
                }
                return;
            }
        } else {
            if (d12 <= dArr2[0]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = dArr3[0][i15];
                }
                return;
            }
            int i16 = length - 1;
            if (d12 >= dArr2[i16]) {
                while (i12 < length2) {
                    dArr[i12] = dArr3[i16][i12];
                    i12++;
                }
                return;
            }
        }
        int i17 = 0;
        while (i17 < length - 1) {
            if (d12 == dArr2[i17]) {
                for (int i18 = 0; i18 < length2; i18++) {
                    dArr[i18] = dArr3[i17][i18];
                }
            }
            int i19 = i17 + 1;
            double d15 = dArr2[i19];
            if (d12 < d15) {
                double d16 = dArr2[i17];
                double d17 = d15 - d16;
                double d18 = (d12 - d16) / d17;
                while (i12 < length2) {
                    double d19 = dArr3[i17][i12];
                    double d22 = dArr3[i19][i12];
                    double[][] dArr5 = this.f43317c;
                    dArr[i12] = i(d17, d18, d19, d22, dArr5[i17][i12], dArr5[i19][i12]);
                    i12++;
                }
                return;
            }
            i17 = i19;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void d(double d12, float[] fArr) {
        double[] dArr = this.f43315a;
        int length = dArr.length;
        double[][] dArr2 = this.f43316b;
        int i12 = 0;
        int length2 = dArr2[0].length;
        if (this.f43318d) {
            double d13 = dArr[0];
            double[] dArr3 = this.f43319e;
            if (d12 <= d13) {
                f(d13, dArr3);
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) (((d12 - dArr[0]) * dArr3[i13]) + dArr2[0][i13]);
                }
                return;
            }
            int i14 = length - 1;
            double d14 = dArr[i14];
            if (d12 >= d14) {
                f(d14, dArr3);
                while (i12 < length2) {
                    fArr[i12] = (float) (((d12 - dArr[i14]) * dArr3[i12]) + dArr2[i14][i12]);
                    i12++;
                }
                return;
            }
        } else {
            if (d12 <= dArr[0]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) dArr2[0][i15];
                }
                return;
            }
            int i16 = length - 1;
            if (d12 >= dArr[i16]) {
                while (i12 < length2) {
                    fArr[i12] = (float) dArr2[i16][i12];
                    i12++;
                }
                return;
            }
        }
        int i17 = 0;
        while (i17 < length - 1) {
            if (d12 == dArr[i17]) {
                for (int i18 = 0; i18 < length2; i18++) {
                    fArr[i18] = (float) dArr2[i17][i18];
                }
            }
            int i19 = i17 + 1;
            double d15 = dArr[i19];
            if (d12 < d15) {
                double d16 = dArr[i17];
                double d17 = d15 - d16;
                double d18 = (d12 - d16) / d17;
                while (i12 < length2) {
                    double d19 = dArr2[i17][i12];
                    double d22 = dArr2[i19][i12];
                    double[][] dArr4 = this.f43317c;
                    fArr[i12] = (float) i(d17, d18, d19, d22, dArr4[i17][i12], dArr4[i19][i12]);
                    i12++;
                }
                return;
            }
            i17 = i19;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final double e(double d12) {
        double[] dArr = this.f43315a;
        int length = dArr.length;
        double d13 = dArr[0];
        if (d12 >= d13) {
            d13 = dArr[length - 1];
            if (d12 < d13) {
                d13 = d12;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            int i13 = i12 + 1;
            double d14 = dArr[i13];
            if (d13 <= d14) {
                double d15 = dArr[i12];
                double d16 = d14 - d15;
                double[][] dArr2 = this.f43316b;
                double d17 = dArr2[i12][0];
                double d18 = dArr2[i13][0];
                double[][] dArr3 = this.f43317c;
                return h(d16, (d13 - d15) / d16, d17, d18, dArr3[i12][0], dArr3[i13][0]) / d16;
            }
            i12 = i13;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void f(double d12, double[] dArr) {
        double[] dArr2 = this.f43315a;
        int length = dArr2.length;
        double[][] dArr3 = this.f43316b;
        int length2 = dArr3[0].length;
        double d13 = dArr2[0];
        if (d12 > d13) {
            d13 = dArr2[length - 1];
            if (d12 < d13) {
                d13 = d12;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            int i13 = i12 + 1;
            double d14 = dArr2[i13];
            if (d13 <= d14) {
                double d15 = dArr2[i12];
                double d16 = d14 - d15;
                double d17 = (d13 - d15) / d16;
                for (int i14 = 0; i14 < length2; i14++) {
                    double d18 = dArr3[i12][i14];
                    double d19 = dArr3[i13][i14];
                    double[][] dArr4 = this.f43317c;
                    dArr[i14] = h(d16, d17, d18, d19, dArr4[i12][i14], dArr4[i13][i14]) / d16;
                }
                return;
            }
            i12 = i13;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final double[] g() {
        return this.f43315a;
    }
}
