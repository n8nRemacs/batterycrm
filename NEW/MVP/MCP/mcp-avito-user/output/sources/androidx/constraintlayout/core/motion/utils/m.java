package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: Oscillator.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public float[] f43320a = new float[0];

    /* renamed from: b, reason: collision with root package name */
    public double[] f43321b = new double[0];

    /* renamed from: c, reason: collision with root package name */
    public double[] f43322c;

    /* renamed from: d, reason: collision with root package name */
    public l f43323d;

    /* renamed from: e, reason: collision with root package name */
    public int f43324e;

    public final void a(double d12, float f12) {
        int length = this.f43320a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f43321b, d12);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f43321b = Arrays.copyOf(this.f43321b, length);
        this.f43320a = Arrays.copyOf(this.f43320a, length);
        this.f43322c = new double[length];
        double[] dArr = this.f43321b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f43321b[iBinarySearch] = d12;
        this.f43320a[iBinarySearch] = f12;
    }

    public final double b(double d12) {
        if (d12 < 0.0d) {
            d12 = 0.0d;
        } else if (d12 > 1.0d) {
            d12 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f43321b, d12);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i12 = -iBinarySearch;
        int i13 = i12 - 1;
        float[] fArr = this.f43320a;
        float f12 = fArr[i13];
        int i14 = i12 - 2;
        float f13 = fArr[i14];
        double[] dArr = this.f43321b;
        double d13 = dArr[i13];
        double d14 = dArr[i14];
        double d15 = (f12 - f13) / (d13 - d14);
        return ((((d12 * d12) - (d14 * d14)) * d15) / 2.0d) + ((d12 - d14) * (f13 - (d15 * d14))) + this.f43322c[i14];
    }

    public final double c(double d12, double d13) {
        double dAbs;
        double dB2 = b(d12) + d13;
        switch (this.f43324e) {
            case 1:
                return Math.signum(0.5d - (dB2 % 1.0d));
            case 2:
                dAbs = Math.abs((((dB2 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dB2 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dB2 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d13 + dB2) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dB2 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f43323d.b(dB2 % 1.0d);
            default:
                return Math.sin(6.283185307179586d * dB2);
        }
        return 1.0d - dAbs;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f43321b) + " period=" + Arrays.toString(this.f43320a);
    }
}
