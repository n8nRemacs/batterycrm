package androidx.constraintlayout.core.motion.utils;

/* compiled from: ArcCurveFit.java */
/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f43259a;

    /* renamed from: b, reason: collision with root package name */
    public final C1701a[] f43260b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f43261c = true;

    /* compiled from: ArcCurveFit.java */
    /* renamed from: androidx.constraintlayout.core.motion.utils.a$a, reason: collision with other inner class name */
    public static class C1701a {

        /* renamed from: s, reason: collision with root package name */
        public static final double[] f43262s = new double[91];

        /* renamed from: a, reason: collision with root package name */
        public double[] f43263a;

        /* renamed from: b, reason: collision with root package name */
        public double f43264b;

        /* renamed from: c, reason: collision with root package name */
        public double f43265c;

        /* renamed from: d, reason: collision with root package name */
        public double f43266d;

        /* renamed from: e, reason: collision with root package name */
        public double f43267e;

        /* renamed from: f, reason: collision with root package name */
        public double f43268f;

        /* renamed from: g, reason: collision with root package name */
        public double f43269g;

        /* renamed from: h, reason: collision with root package name */
        public double f43270h;

        /* renamed from: i, reason: collision with root package name */
        public double f43271i;

        /* renamed from: j, reason: collision with root package name */
        public double f43272j;

        /* renamed from: k, reason: collision with root package name */
        public double f43273k;

        /* renamed from: l, reason: collision with root package name */
        public double f43274l;

        /* renamed from: m, reason: collision with root package name */
        public double f43275m;

        /* renamed from: n, reason: collision with root package name */
        public double f43276n;

        /* renamed from: o, reason: collision with root package name */
        public double f43277o;

        /* renamed from: p, reason: collision with root package name */
        public double f43278p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f43279q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f43280r;

        public final double a() {
            double d12 = this.f43272j * this.f43278p;
            double dHypot = this.f43276n / Math.hypot(d12, (-this.f43273k) * this.f43277o);
            if (this.f43279q) {
                d12 = -d12;
            }
            return d12 * dHypot;
        }

        public final double b() {
            double d12 = this.f43272j * this.f43278p;
            double d13 = (-this.f43273k) * this.f43277o;
            double dHypot = this.f43276n / Math.hypot(d12, d13);
            return this.f43279q ? (-d13) * dHypot : d13 * dHypot;
        }

        public final double c(double d12) {
            double d13 = (d12 - this.f43265c) * this.f43271i;
            double d14 = this.f43268f;
            double d15 = this.f43267e;
            return ((d14 - d15) * d13) + d15;
        }

        public final double d(double d12) {
            double d13 = (d12 - this.f43265c) * this.f43271i;
            double d14 = this.f43270h;
            double d15 = this.f43269g;
            return ((d14 - d15) * d13) + d15;
        }

        public final double e() {
            return (this.f43272j * this.f43277o) + this.f43274l;
        }

        public final double f() {
            return (this.f43273k * this.f43278p) + this.f43275m;
        }

        public final void g(double d12) {
            double d13 = (this.f43279q ? this.f43266d - d12 : d12 - this.f43265c) * this.f43271i;
            double d14 = 0.0d;
            if (d13 > 0.0d) {
                d14 = 1.0d;
                if (d13 < 1.0d) {
                    double[] dArr = this.f43263a;
                    double length = d13 * (dArr.length - 1);
                    int i12 = (int) length;
                    double d15 = dArr[i12];
                    d14 = ((dArr[i12 + 1] - d15) * (length - i12)) + d15;
                }
            }
            double d16 = d14 * 1.5707963267948966d;
            this.f43277o = Math.sin(d16);
            this.f43278p = Math.cos(d16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int[] r30, double[] r31, double[][] r32) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.a.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final double b(double d12) {
        boolean z12 = this.f43261c;
        C1701a[] c1701aArr = this.f43260b;
        if (z12) {
            C1701a c1701a = c1701aArr[0];
            double d13 = c1701a.f43265c;
            if (d12 < d13) {
                double d14 = d12 - d13;
                if (c1701a.f43280r) {
                    return (d14 * c1701aArr[0].f43274l) + c1701a.c(d13);
                }
                c1701a.g(d13);
                return (d14 * c1701aArr[0].a()) + c1701aArr[0].e();
            }
            if (d12 > c1701aArr[c1701aArr.length - 1].f43266d) {
                double d15 = c1701aArr[c1701aArr.length - 1].f43266d;
                double d16 = d12 - d15;
                int length = c1701aArr.length - 1;
                return (d16 * c1701aArr[length].f43274l) + c1701aArr[length].c(d15);
            }
        } else {
            double d17 = c1701aArr[0].f43265c;
            if (d12 < d17) {
                d12 = d17;
            } else if (d12 > c1701aArr[c1701aArr.length - 1].f43266d) {
                d12 = c1701aArr[c1701aArr.length - 1].f43266d;
            }
        }
        for (int i12 = 0; i12 < c1701aArr.length; i12++) {
            C1701a c1701a2 = c1701aArr[i12];
            if (d12 <= c1701a2.f43266d) {
                if (c1701a2.f43280r) {
                    return c1701a2.c(d12);
                }
                c1701a2.g(d12);
                return c1701aArr[i12].e();
            }
        }
        return Double.NaN;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void c(double d12, double[] dArr) {
        boolean z12 = this.f43261c;
        C1701a[] c1701aArr = this.f43260b;
        if (z12) {
            C1701a c1701a = c1701aArr[0];
            double d13 = c1701a.f43265c;
            if (d12 < d13) {
                double d14 = d12 - d13;
                if (c1701a.f43280r) {
                    double dC2 = c1701a.c(d13);
                    C1701a c1701a2 = c1701aArr[0];
                    dArr[0] = (c1701a2.f43274l * d14) + dC2;
                    dArr[1] = (d14 * c1701aArr[0].f43275m) + c1701a2.d(d13);
                    return;
                }
                c1701a.g(d13);
                dArr[0] = (c1701aArr[0].a() * d14) + c1701aArr[0].e();
                dArr[1] = (d14 * c1701aArr[0].b()) + c1701aArr[0].f();
                return;
            }
            if (d12 > c1701aArr[c1701aArr.length - 1].f43266d) {
                double d15 = c1701aArr[c1701aArr.length - 1].f43266d;
                double d16 = d12 - d15;
                int length = c1701aArr.length - 1;
                C1701a c1701a3 = c1701aArr[length];
                if (c1701a3.f43280r) {
                    double dC3 = c1701a3.c(d15);
                    C1701a c1701a4 = c1701aArr[length];
                    dArr[0] = (c1701a4.f43274l * d16) + dC3;
                    dArr[1] = (d16 * c1701aArr[length].f43275m) + c1701a4.d(d15);
                    return;
                }
                c1701a3.g(d12);
                dArr[0] = (c1701aArr[length].a() * d16) + c1701aArr[length].e();
                dArr[1] = (d16 * c1701aArr[length].b()) + c1701aArr[length].f();
                return;
            }
        } else {
            double d17 = c1701aArr[0].f43265c;
            if (d12 < d17) {
                d12 = d17;
            }
            if (d12 > c1701aArr[c1701aArr.length - 1].f43266d) {
                d12 = c1701aArr[c1701aArr.length - 1].f43266d;
            }
        }
        for (int i12 = 0; i12 < c1701aArr.length; i12++) {
            C1701a c1701a5 = c1701aArr[i12];
            if (d12 <= c1701a5.f43266d) {
                if (c1701a5.f43280r) {
                    dArr[0] = c1701a5.c(d12);
                    dArr[1] = c1701aArr[i12].d(d12);
                    return;
                } else {
                    c1701a5.g(d12);
                    dArr[0] = c1701aArr[i12].e();
                    dArr[1] = c1701aArr[i12].f();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void d(double d12, float[] fArr) {
        boolean z12 = this.f43261c;
        C1701a[] c1701aArr = this.f43260b;
        if (z12) {
            C1701a c1701a = c1701aArr[0];
            double d13 = c1701a.f43265c;
            if (d12 < d13) {
                double d14 = d12 - d13;
                if (c1701a.f43280r) {
                    double dC2 = c1701a.c(d13);
                    C1701a c1701a2 = c1701aArr[0];
                    fArr[0] = (float) ((c1701a2.f43274l * d14) + dC2);
                    fArr[1] = (float) ((d14 * c1701aArr[0].f43275m) + c1701a2.d(d13));
                    return;
                }
                c1701a.g(d13);
                fArr[0] = (float) ((c1701aArr[0].a() * d14) + c1701aArr[0].e());
                fArr[1] = (float) ((d14 * c1701aArr[0].b()) + c1701aArr[0].f());
                return;
            }
            if (d12 > c1701aArr[c1701aArr.length - 1].f43266d) {
                double d15 = c1701aArr[c1701aArr.length - 1].f43266d;
                double d16 = d12 - d15;
                int length = c1701aArr.length - 1;
                C1701a c1701a3 = c1701aArr[length];
                if (!c1701a3.f43280r) {
                    c1701a3.g(d12);
                    fArr[0] = (float) c1701aArr[length].e();
                    fArr[1] = (float) c1701aArr[length].f();
                    return;
                } else {
                    double dC3 = c1701a3.c(d15);
                    C1701a c1701a4 = c1701aArr[length];
                    fArr[0] = (float) ((c1701a4.f43274l * d16) + dC3);
                    fArr[1] = (float) ((d16 * c1701aArr[length].f43275m) + c1701a4.d(d15));
                    return;
                }
            }
        } else {
            double d17 = c1701aArr[0].f43265c;
            if (d12 < d17) {
                d12 = d17;
            } else if (d12 > c1701aArr[c1701aArr.length - 1].f43266d) {
                d12 = c1701aArr[c1701aArr.length - 1].f43266d;
            }
        }
        for (int i12 = 0; i12 < c1701aArr.length; i12++) {
            C1701a c1701a5 = c1701aArr[i12];
            if (d12 <= c1701a5.f43266d) {
                if (c1701a5.f43280r) {
                    fArr[0] = (float) c1701a5.c(d12);
                    fArr[1] = (float) c1701aArr[i12].d(d12);
                    return;
                } else {
                    c1701a5.g(d12);
                    fArr[0] = (float) c1701aArr[i12].e();
                    fArr[1] = (float) c1701aArr[i12].f();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final double e(double d12) {
        C1701a[] c1701aArr = this.f43260b;
        double d13 = c1701aArr[0].f43265c;
        if (d12 < d13) {
            d12 = d13;
        }
        if (d12 > c1701aArr[c1701aArr.length - 1].f43266d) {
            d12 = c1701aArr[c1701aArr.length - 1].f43266d;
        }
        for (int i12 = 0; i12 < c1701aArr.length; i12++) {
            C1701a c1701a = c1701aArr[i12];
            if (d12 <= c1701a.f43266d) {
                if (c1701a.f43280r) {
                    return c1701a.f43274l;
                }
                c1701a.g(d12);
                return c1701aArr[i12].a();
            }
        }
        return Double.NaN;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void f(double d12, double[] dArr) {
        C1701a[] c1701aArr = this.f43260b;
        double d13 = c1701aArr[0].f43265c;
        if (d12 < d13) {
            d12 = d13;
        } else if (d12 > c1701aArr[c1701aArr.length - 1].f43266d) {
            d12 = c1701aArr[c1701aArr.length - 1].f43266d;
        }
        for (int i12 = 0; i12 < c1701aArr.length; i12++) {
            C1701a c1701a = c1701aArr[i12];
            if (d12 <= c1701a.f43266d) {
                if (c1701a.f43280r) {
                    dArr[0] = c1701a.f43274l;
                    dArr[1] = c1701a.f43275m;
                    return;
                } else {
                    c1701a.g(d12);
                    dArr[0] = c1701aArr[i12].a();
                    dArr[1] = c1701aArr[i12].b();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final double[] g() {
        return this.f43259a;
    }
}
