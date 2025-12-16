package androidx.constraintlayout.core.motion.utils;

/* compiled from: LinearCurveFit.java */
/* loaded from: classes.dex */
public class k extends b {

    /* renamed from: a, reason: collision with root package name */
    public double[] f43311a;

    /* renamed from: b, reason: collision with root package name */
    public double[][] f43312b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43313c;

    /* renamed from: d, reason: collision with root package name */
    public double[] f43314d;

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final double b(double d12) {
        double[] dArr = this.f43311a;
        int length = dArr.length;
        boolean z12 = this.f43313c;
        double[][] dArr2 = this.f43312b;
        if (z12) {
            double d13 = dArr[0];
            if (d12 <= d13) {
                return (e(d13) * (d12 - d13)) + dArr2[0][0];
            }
            int i12 = length - 1;
            double d14 = dArr[i12];
            if (d12 >= d14) {
                return (e(d14) * (d12 - d14)) + dArr2[i12][0];
            }
        } else {
            if (d12 <= dArr[0]) {
                return dArr2[0][0];
            }
            int i13 = length - 1;
            if (d12 >= dArr[i13]) {
                return dArr2[i13][0];
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            double d15 = dArr[i14];
            if (d12 == d15) {
                return dArr2[i14][0];
            }
            int i15 = i14 + 1;
            double d16 = dArr[i15];
            if (d12 < d16) {
                double d17 = (d12 - d15) / (d16 - d15);
                return (dArr2[i15][0] * d17) + ((1.0d - d17) * dArr2[i14][0]);
            }
            i14 = i15;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void c(double d12, double[] dArr) {
        double[] dArr2 = this.f43311a;
        int length = dArr2.length;
        double[][] dArr3 = this.f43312b;
        int i12 = 0;
        int length2 = dArr3[0].length;
        if (this.f43313c) {
            double d13 = dArr2[0];
            double[] dArr4 = this.f43314d;
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
                double d17 = (d12 - d16) / (d15 - d16);
                while (i12 < length2) {
                    dArr[i12] = (dArr3[i19][i12] * d17) + ((1.0d - d17) * dArr3[i17][i12]);
                    i12++;
                }
                return;
            }
            i17 = i19;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void d(double d12, float[] fArr) {
        double[] dArr = this.f43311a;
        int length = dArr.length;
        double[][] dArr2 = this.f43312b;
        int i12 = 0;
        int length2 = dArr2[0].length;
        if (this.f43313c) {
            double d13 = dArr[0];
            double[] dArr3 = this.f43314d;
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
                double d17 = (d12 - d16) / (d15 - d16);
                while (i12 < length2) {
                    fArr[i12] = (float) ((dArr2[i19][i12] * d17) + ((1.0d - d17) * dArr2[i17][i12]));
                    i12++;
                }
                return;
            }
            i17 = i19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
  0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double e(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.f43311a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r9 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L15
            goto La
        L15:
            r3 = r2
        L16:
            int r4 = r1 + (-1)
            if (r3 >= r4) goto L34
            int r4 = r3 + 1
            r5 = r0[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L32
            r9 = r0[r3]
            double r5 = r5 - r9
            double[][] r9 = r8.f43312b
            r10 = r9[r3]
            r0 = r10[r2]
            r9 = r9[r4]
            r2 = r9[r2]
            double r2 = r2 - r0
            double r2 = r2 / r5
            return r2
        L32:
            r3 = r4
            goto L16
        L34:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.k.e(double):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r5
  0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(double r12, double[] r14) {
        /*
            r11 = this;
            double[] r0 = r11.f43311a
            int r1 = r0.length
            double[][] r2 = r11.f43312b
            r3 = 0
            r4 = r2[r3]
            int r4 = r4.length
            r5 = r0[r3]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 > 0) goto L11
        Lf:
            r12 = r5
            goto L1a
        L11:
            int r5 = r1 + (-1)
            r5 = r0[r5]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto Lf
        L1a:
            r5 = r3
        L1b:
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L3d
            int r6 = r5 + 1
            r7 = r0[r6]
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 > 0) goto L3b
            r12 = r0[r5]
            double r7 = r7 - r12
        L2a:
            if (r3 >= r4) goto L3d
            r12 = r2[r5]
            r0 = r12[r3]
            r12 = r2[r6]
            r9 = r12[r3]
            double r9 = r9 - r0
            double r9 = r9 / r7
            r14[r3] = r9
            int r3 = r3 + 1
            goto L2a
        L3b:
            r5 = r6
            goto L1b
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.k.f(double, double[]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final double[] g() {
        return this.f43311a;
    }
}
