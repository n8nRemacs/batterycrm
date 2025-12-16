package androidx.constraintlayout.core.motion.utils;

/* compiled from: CurveFit.java */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: CurveFit.java */
    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public double f43281a;

        /* renamed from: b, reason: collision with root package name */
        public double[] f43282b;

        @Override // androidx.constraintlayout.core.motion.utils.b
        public final double b(double d12) {
            return this.f43282b[0];
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public final void c(double d12, double[] dArr) {
            double[] dArr2 = this.f43282b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public final void d(double d12, float[] fArr) {
            int i12 = 0;
            while (true) {
                double[] dArr = this.f43282b;
                if (i12 >= dArr.length) {
                    return;
                }
                fArr[i12] = (float) dArr[i12];
                i12++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public final double e(double d12) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public final void f(double d12, double[] dArr) {
            for (int i12 = 0; i12 < this.f43282b.length; i12++) {
                dArr[i12] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public final double[] g() {
            return new double[]{this.f43281a};
        }
    }

    public static b a(int i12, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i12 = 2;
        }
        if (i12 == 0) {
            return new l(dArr, dArr2);
        }
        if (i12 == 2) {
            double d12 = dArr[0];
            double[] dArr3 = dArr2[0];
            a aVar = new a();
            aVar.f43281a = d12;
            aVar.f43282b = dArr3;
            return aVar;
        }
        k kVar = new k();
        kVar.f43313c = true;
        int length = dArr2[0].length;
        kVar.f43314d = new double[length];
        kVar.f43311a = dArr;
        kVar.f43312b = dArr2;
        if (length > 2) {
            double d13 = 0.0d;
            int i13 = 0;
            while (true) {
                double d14 = d13;
                if (i13 >= dArr.length) {
                    break;
                }
                double d15 = dArr2[i13][0];
                if (i13 > 0) {
                    Math.hypot(d15 - d13, d15 - d14);
                }
                i13++;
                d13 = d15;
            }
        }
        return kVar;
    }

    public abstract double b(double d12);

    public abstract void c(double d12, double[] dArr);

    public abstract void d(double d12, float[] fArr);

    public abstract double e(double d12);

    public abstract void f(double d12, double[] dArr);

    public abstract double[] g();
}
