package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public b f43291a;

    /* renamed from: b, reason: collision with root package name */
    public String f43292b;

    /* renamed from: c, reason: collision with root package name */
    public int f43293c = 0;

    /* renamed from: d, reason: collision with root package name */
    public String f43294d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f43295e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<f> f43296f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    public static class a extends i {
    }

    /* compiled from: KeyCycleOscillator.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public m f43297a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f43298b;

        /* renamed from: c, reason: collision with root package name */
        public double[] f43299c;

        /* renamed from: d, reason: collision with root package name */
        public float[] f43300d;

        /* renamed from: e, reason: collision with root package name */
        public float[] f43301e;

        /* renamed from: f, reason: collision with root package name */
        public float[] f43302f;

        /* renamed from: g, reason: collision with root package name */
        public androidx.constraintlayout.core.motion.utils.b f43303g;

        /* renamed from: h, reason: collision with root package name */
        public double[] f43304h;

        /* renamed from: i, reason: collision with root package name */
        public double[] f43305i;
    }

    /* compiled from: KeyCycleOscillator.java */
    public static class c {
    }

    /* compiled from: KeyCycleOscillator.java */
    public static class d {
    }

    /* compiled from: KeyCycleOscillator.java */
    public static class e extends i {
    }

    /* compiled from: KeyCycleOscillator.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f43306a;

        /* renamed from: b, reason: collision with root package name */
        public final float f43307b;

        /* renamed from: c, reason: collision with root package name */
        public final float f43308c;

        /* renamed from: d, reason: collision with root package name */
        public final float f43309d;

        /* renamed from: e, reason: collision with root package name */
        public final float f43310e;

        public f(float f12, float f13, float f14, float f15, int i12) {
            this.f43306a = i12;
            this.f43307b = f15;
            this.f43308c = f13;
            this.f43309d = f12;
            this.f43310e = f14;
        }
    }

    public final float a(float f12) {
        b bVar = this.f43291a;
        androidx.constraintlayout.core.motion.utils.b bVar2 = bVar.f43303g;
        if (bVar2 != null) {
            bVar2.c(f12, bVar.f43304h);
        } else {
            double[] dArr = bVar.f43304h;
            dArr[0] = bVar.f43301e[0];
            dArr[1] = bVar.f43302f[0];
            dArr[2] = bVar.f43298b[0];
        }
        double[] dArr2 = bVar.f43304h;
        return (float) ((bVar.f43297a.c(f12, dArr2[1]) * bVar.f43304h[2]) + dArr2[0]);
    }

    public final float b(float f12) {
        double dSin;
        double d12;
        double dSignum;
        b bVar = this.f43291a;
        androidx.constraintlayout.core.motion.utils.b bVar2 = bVar.f43303g;
        double d13 = 0.0d;
        if (bVar2 != null) {
            double d14 = f12;
            bVar2.f(d14, bVar.f43305i);
            bVar.f43303g.c(d14, bVar.f43304h);
        } else {
            double[] dArr = bVar.f43305i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d15 = f12;
        double d16 = bVar.f43304h[1];
        m mVar = bVar.f43297a;
        double dC2 = mVar.c(d15, d16);
        double d17 = bVar.f43304h[1];
        double d18 = bVar.f43305i[1];
        double dB2 = mVar.b(d15) + d17;
        if (d15 <= 0.0d) {
            d15 = 1.0E-5d;
        } else if (d15 >= 1.0d) {
            d15 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(mVar.f43321b, d15);
        if (iBinarySearch <= 0) {
            if (iBinarySearch != 0) {
                int i12 = -iBinarySearch;
                int i13 = i12 - 1;
                float[] fArr = mVar.f43320a;
                float f13 = fArr[i13];
                int i14 = i12 - 2;
                float f14 = fArr[i14];
                double d19 = f13 - f14;
                double[] dArr2 = mVar.f43321b;
                double d22 = dArr2[i13];
                double d23 = dArr2[i14];
                double d24 = d19 / (d22 - d23);
                d13 = (f14 - (d24 * d23)) + (d15 * d24);
            } else {
                d13 = 0.0d;
            }
        }
        double d25 = d13 + d18;
        switch (mVar.f43324e) {
            case 1:
                dSin = 0.0d;
                break;
            case 2:
                d12 = d25 * 4.0d;
                dSignum = Math.signum((((dB2 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                dSin = d12 * dSignum;
                break;
            case 3:
                dSin = d25 * 2.0d;
                break;
            case 4:
                dSin = (-d25) * 2.0d;
                break;
            case 5:
                dSin = Math.sin(6.283185307179586d * dB2) * (-6.283185307179586d) * d25;
                break;
            case 6:
                d12 = d25 * 4.0d;
                dSignum = (((dB2 * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                dSin = d12 * dSignum;
                break;
            case 7:
                dSin = mVar.f43323d.e(dB2 % 1.0d);
                break;
            default:
                d12 = d25 * 6.283185307179586d;
                dSignum = Math.cos(6.283185307179586d * dB2);
                dSin = d12 * dSignum;
                break;
        }
        double[] dArr3 = bVar.f43305i;
        return (float) ((dSin * bVar.f43304h[2]) + (dC2 * dArr3[2]) + dArr3[0]);
    }

    public final void d(int i12, int i13, String str, int i14, float f12, float f13, float f14, float f15) {
        this.f43296f.add(new f(f12, f13, f14, f15, i12));
        if (i14 != -1) {
            this.f43295e = i14;
        }
        this.f43293c = i13;
        this.f43294d = str;
    }

    public final void e(int i12, int i13, String str, int i14, float f12, float f13, float f14, float f15, ConstraintAttribute constraintAttribute) {
        this.f43296f.add(new f(f12, f13, f14, f15, i12));
        if (i14 != -1) {
            this.f43295e = i14;
        }
        this.f43293c = i13;
        c(constraintAttribute);
        this.f43294d = str;
    }

    public final void f() {
        int i12;
        ArrayList<f> arrayList = this.f43296f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new h());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        int i13 = this.f43293c;
        String str = this.f43294d;
        b bVar = new b();
        m mVar = new m();
        bVar.f43297a = mVar;
        mVar.f43324e = i13;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i14 = 0;
            while (iIndexOf2 != -1) {
                dArr3[i14] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                int i15 = iIndexOf2 + 1;
                i14++;
                iIndexOf = i15;
                iIndexOf2 = str.indexOf(44, i15);
            }
            dArr3[i14] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i14 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d12 = 1.0d / length2;
            char c12 = 0;
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr5 = new double[length];
            int i16 = 0;
            while (i16 < dArrCopyOf.length) {
                double d13 = dArrCopyOf[i16];
                int i17 = i16 + length2;
                dArr4[i17][c12] = d13;
                double[][] dArr6 = dArr4;
                double d14 = i16 * d12;
                dArr5[i17] = d14;
                if (i16 > 0) {
                    int i18 = (length2 * 2) + i16;
                    dArr6[i18][c12] = d13 + 1.0d;
                    dArr5[i18] = d14 + 1.0d;
                    int i19 = i16 - 1;
                    dArr6[i19][c12] = (d13 - 1.0d) - d12;
                    dArr5[i19] = (d14 - 1.0d) - d12;
                }
                i16++;
                dArr4 = dArr6;
                c12 = 0;
            }
            mVar.f43323d = new l(dArr5, dArr4);
        }
        bVar.f43298b = new float[size];
        bVar.f43299c = new double[size];
        bVar.f43300d = new float[size];
        bVar.f43301e = new float[size];
        bVar.f43302f = new float[size];
        float[] fArr = new float[size];
        this.f43291a = bVar;
        Iterator<f> it = arrayList.iterator();
        int i22 = 0;
        while (it.hasNext()) {
            f next = it.next();
            float f12 = next.f43309d;
            dArr[i22] = f12 * 0.01d;
            double[] dArr7 = dArr2[i22];
            float f13 = next.f43307b;
            dArr7[0] = f13;
            float f14 = next.f43308c;
            dArr7[1] = f14;
            float f15 = next.f43310e;
            dArr7[2] = f15;
            b bVar2 = this.f43291a;
            bVar2.f43299c[i22] = next.f43306a / 100.0d;
            bVar2.f43300d[i22] = f12;
            bVar2.f43301e[i22] = f14;
            bVar2.f43302f[i22] = f15;
            bVar2.f43298b[i22] = f13;
            i22++;
        }
        b bVar3 = this.f43291a;
        double[] dArr8 = bVar3.f43299c;
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr8.length, 3);
        float[] fArr2 = bVar3.f43298b;
        bVar3.f43304h = new double[fArr2.length + 2];
        bVar3.f43305i = new double[fArr2.length + 2];
        double d15 = dArr8[0];
        float[] fArr3 = bVar3.f43300d;
        m mVar2 = bVar3.f43297a;
        if (d15 > 0.0d) {
            mVar2.a(0.0d, fArr3[0]);
        }
        int length3 = dArr8.length - 1;
        if (dArr8[length3] < 1.0d) {
            mVar2.a(1.0d, fArr3[length3]);
        }
        for (int i23 = 0; i23 < dArr9.length; i23++) {
            double[] dArr10 = dArr9[i23];
            dArr10[0] = bVar3.f43301e[i23];
            dArr10[1] = bVar3.f43302f[i23];
            dArr10[2] = fArr2[i23];
            mVar2.a(dArr8[i23], fArr3[i23]);
        }
        int i24 = 0;
        double d16 = 0.0d;
        while (true) {
            if (i24 >= mVar2.f43320a.length) {
                break;
            }
            d16 += r9[i24];
            i24++;
        }
        int i25 = 1;
        double d17 = 0.0d;
        while (true) {
            float[] fArr4 = mVar2.f43320a;
            if (i25 >= fArr4.length) {
                break;
            }
            int i26 = i25 - 1;
            float f16 = (fArr4[i26] + fArr4[i25]) / 2.0f;
            double[] dArr11 = mVar2.f43321b;
            d17 = ((dArr11[i25] - dArr11[i26]) * f16) + d17;
            i25++;
        }
        int i27 = 0;
        while (true) {
            float[] fArr5 = mVar2.f43320a;
            if (i27 >= fArr5.length) {
                break;
            }
            fArr5[i27] = (float) ((d16 / d17) * fArr5[i27]);
            i27++;
        }
        mVar2.f43322c[0] = 0.0d;
        int i28 = 1;
        while (true) {
            float[] fArr6 = mVar2.f43320a;
            if (i28 >= fArr6.length) {
                break;
            }
            int i29 = i28 - 1;
            float f17 = (fArr6[i29] + fArr6[i28]) / 2.0f;
            double[] dArr12 = mVar2.f43321b;
            double d18 = dArr12[i28] - dArr12[i29];
            double[] dArr13 = mVar2.f43322c;
            dArr13[i28] = (d18 * f17) + dArr13[i29];
            i28++;
        }
        if (dArr8.length > 1) {
            i12 = 0;
            bVar3.f43303g = androidx.constraintlayout.core.motion.utils.b.a(0, dArr8, dArr9);
        } else {
            i12 = 0;
            bVar3.f43303g = null;
        }
        androidx.constraintlayout.core.motion.utils.b.a(i12, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f43292b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<f> it = this.f43296f.iterator();
        while (it.hasNext()) {
            f next = it.next();
            StringBuilder sbZ = androidx.appcompat.app.r.z(string, "[");
            sbZ.append(next.f43306a);
            sbZ.append(" , ");
            sbZ.append(decimalFormat.format(next.f43307b));
            sbZ.append("] ");
            string = sbZ.toString();
        }
        return string;
    }

    public void c(ConstraintAttribute constraintAttribute) {
    }
}
