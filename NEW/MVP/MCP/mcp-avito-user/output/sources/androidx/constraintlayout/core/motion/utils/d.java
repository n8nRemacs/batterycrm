package androidx.constraintlayout.core.motion.utils;

/* compiled from: Easing.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f43283b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f43284c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a, reason: collision with root package name */
    public String f43285a = "identity";

    /* compiled from: Easing.java */
    public static class a extends d {

        /* renamed from: d, reason: collision with root package name */
        public final double f43286d;

        /* renamed from: e, reason: collision with root package name */
        public final double f43287e;

        /* renamed from: f, reason: collision with root package name */
        public final double f43288f;

        /* renamed from: g, reason: collision with root package name */
        public final double f43289g;

        public a(String str) {
            this.f43285a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f43286d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i12 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i12);
            this.f43287e = Double.parseDouble(str.substring(i12, iIndexOf3).trim());
            int i13 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i13);
            this.f43288f = Double.parseDouble(str.substring(i13, iIndexOf4).trim());
            int i14 = iIndexOf4 + 1;
            this.f43289g = Double.parseDouble(str.substring(i14, str.indexOf(41, i14)).trim());
        }

        @Override // androidx.constraintlayout.core.motion.utils.d
        public final double a(double d12) {
            if (d12 <= 0.0d) {
                return 0.0d;
            }
            if (d12 >= 1.0d) {
                return 1.0d;
            }
            double d13 = 0.5d;
            double d14 = 0.5d;
            while (d13 > 0.01d) {
                d13 *= 0.5d;
                d14 = d(d14) < d12 ? d14 + d13 : d14 - d13;
            }
            double d15 = d14 - d13;
            double d16 = d(d15);
            double d17 = d14 + d13;
            double d18 = d(d17);
            double dE2 = e(d15);
            return (((d12 - d16) * (e(d17) - dE2)) / (d18 - d16)) + dE2;
        }

        @Override // androidx.constraintlayout.core.motion.utils.d
        public final double b(double d12) {
            double d13 = 0.5d;
            double d14 = 0.5d;
            while (d13 > 1.0E-4d) {
                d13 *= 0.5d;
                d14 = d(d14) < d12 ? d14 + d13 : d14 - d13;
            }
            double d15 = d14 - d13;
            double d16 = d14 + d13;
            return (e(d16) - e(d15)) / (d(d16) - d(d15));
        }

        public final double d(double d12) {
            double d13 = 1.0d - d12;
            double d14 = 3.0d * d13;
            double d15 = d13 * d14 * d12;
            double d16 = d14 * d12 * d12;
            return (this.f43288f * d16) + (this.f43286d * d15) + (d12 * d12 * d12);
        }

        public final double e(double d12) {
            double d13 = 1.0d - d12;
            double d14 = 3.0d * d13;
            double d15 = d13 * d14 * d12;
            double d16 = d14 * d12 * d12;
            return (this.f43289g * d16) + (this.f43287e * d15) + (d12 * d12 * d12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.constraintlayout.core.motion.utils.d c(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.d.c(java.lang.String):androidx.constraintlayout.core.motion.utils.d");
    }

    public double b(double d12) {
        return 1.0d;
    }

    public final String toString() {
        return this.f43285a;
    }

    public double a(double d12) {
        return d12;
    }
}
