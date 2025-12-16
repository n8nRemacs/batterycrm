package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.motion.utils.b f43355a;

    /* renamed from: e, reason: collision with root package name */
    public int f43359e;

    /* renamed from: f, reason: collision with root package name */
    public String f43360f;

    /* renamed from: i, reason: collision with root package name */
    public long f43363i;

    /* renamed from: b, reason: collision with root package name */
    public int f43356b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f43357c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    public final float[][] f43358d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    public final float[] f43361g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    public boolean f43362h = false;

    /* renamed from: j, reason: collision with root package name */
    public float f43364j = Float.NaN;

    /* compiled from: TimeCycleSplineSet.java */
    public static class a extends u {
    }

    /* compiled from: TimeCycleSplineSet.java */
    public static class b extends u {
    }

    /* compiled from: TimeCycleSplineSet.java */
    public static class c {
    }

    public final float a(float f12) {
        float fAbs;
        switch (this.f43356b) {
            case 1:
                return Math.signum(f12 * 6.2831855f);
            case 2:
                fAbs = Math.abs(f12);
                break;
            case 3:
                return (((f12 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f12 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f12 * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f12 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f12 * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public void b(float f12, float f13, float f14, int i12, int i13) {
        int i14 = this.f43359e;
        this.f43357c[i14] = i12;
        float[] fArr = this.f43358d[i14];
        fArr[0] = f12;
        fArr[1] = f13;
        fArr[2] = f14;
        this.f43356b = Math.max(this.f43356b, i13);
        this.f43359e++;
    }

    public void c(int i12) {
        float[][] fArr;
        int i13 = this.f43359e;
        if (i13 == 0) {
            System.err.println("Error no points added to " + this.f43360f);
            return;
        }
        int[] iArr = this.f43357c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i13 - 1;
        iArr2[1] = 0;
        int i14 = 2;
        while (true) {
            fArr = this.f43358d;
            if (i14 <= 0) {
                break;
            }
            int i15 = i14 - 1;
            int i16 = iArr2[i15];
            int i17 = i14 - 2;
            int i18 = iArr2[i17];
            if (i16 < i18) {
                int i19 = iArr[i18];
                int i22 = i16;
                int i23 = i22;
                while (i22 < i18) {
                    int i24 = iArr[i22];
                    if (i24 <= i19) {
                        int i25 = iArr[i23];
                        iArr[i23] = i24;
                        iArr[i22] = i25;
                        float[] fArr2 = fArr[i23];
                        fArr[i23] = fArr[i22];
                        fArr[i22] = fArr2;
                        i23++;
                    }
                    i22++;
                }
                int i26 = iArr[i23];
                iArr[i23] = iArr[i18];
                iArr[i18] = i26;
                float[] fArr3 = fArr[i23];
                fArr[i23] = fArr[i18];
                fArr[i18] = fArr3;
                iArr2[i17] = i23 - 1;
                iArr2[i15] = i16;
                int i27 = i14 + 1;
                iArr2[i14] = i18;
                i14 += 2;
                iArr2[i27] = i23 + 1;
            } else {
                i14 = i17;
            }
        }
        int i28 = 0;
        for (int i29 = 1; i29 < iArr.length; i29++) {
            if (iArr[i29] != iArr[i29 - 1]) {
                i28++;
            }
        }
        if (i28 == 0) {
            i28 = 1;
        }
        double[] dArr = new double[i28];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i28, 3);
        int i32 = 0;
        for (int i33 = 0; i33 < this.f43359e; i33++) {
            if (i33 <= 0 || iArr[i33] != iArr[i33 - 1]) {
                dArr[i32] = iArr[i33] * 0.01d;
                double[] dArr3 = dArr2[i32];
                float[] fArr4 = fArr[i33];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i32++;
            }
        }
        this.f43355a = androidx.constraintlayout.core.motion.utils.b.a(i12, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f43360f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i12 = 0; i12 < this.f43359e; i12++) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(string, "[");
            sbZ.append(this.f43357c[i12]);
            sbZ.append(" , ");
            sbZ.append(decimalFormat.format(this.f43358d[i12]));
            sbZ.append("] ");
            string = sbZ.toString();
        }
        return string;
    }
}
