package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.d;
import j.N;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
class v implements Comparable<v> {

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f44035s = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.core.motion.utils.d f44036b;

    /* renamed from: d, reason: collision with root package name */
    public float f44038d;

    /* renamed from: e, reason: collision with root package name */
    public float f44039e;

    /* renamed from: f, reason: collision with root package name */
    public float f44040f;

    /* renamed from: g, reason: collision with root package name */
    public float f44041g;

    /* renamed from: h, reason: collision with root package name */
    public float f44042h;

    /* renamed from: i, reason: collision with root package name */
    public float f44043i;

    /* renamed from: c, reason: collision with root package name */
    public int f44037c = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f44044j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public int f44045k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f44046l = -1;

    /* renamed from: m, reason: collision with root package name */
    public float f44047m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public p f44048n = null;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f44049o = new LinkedHashMap<>();

    /* renamed from: p, reason: collision with root package name */
    public int f44050p = 0;

    /* renamed from: q, reason: collision with root package name */
    public double[] f44051q = new double[18];

    /* renamed from: r, reason: collision with root package name */
    public double[] f44052r = new double[18];

    public static boolean b(float f12, float f13) {
        return (Float.isNaN(f12) || Float.isNaN(f13)) ? Float.isNaN(f12) != Float.isNaN(f13) : Math.abs(f12 - f13) > 1.0E-6f;
    }

    public static void e(float f12, float f13, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f18 = (float) dArr[i12];
            double d12 = dArr2[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f14 = f18;
            } else if (i13 == 2) {
                f16 = f18;
            } else if (i13 == 3) {
                f15 = f18;
            } else if (i13 == 4) {
                f17 = f18;
            }
        }
        float f19 = f14 - ((0.0f * f15) / 2.0f);
        float f22 = f16 - ((0.0f * f17) / 2.0f);
        fArr[0] = (((f15 * 1.0f) + f19) * f12) + ((1.0f - f12) * f19) + 0.0f;
        fArr[1] = (((f17 * 1.0f) + f22) * f13) + ((1.0f - f13) * f22) + 0.0f;
    }

    public final void a(d.a aVar) {
        int iOrdinal;
        this.f44036b = androidx.constraintlayout.core.motion.utils.d.c(aVar.f44268d.f44358d);
        d.c cVar = aVar.f44268d;
        this.f44045k = cVar.f44359e;
        this.f44046l = cVar.f44356b;
        this.f44044j = cVar.f44362h;
        this.f44037c = cVar.f44360f;
        float f12 = aVar.f44267c.f44372e;
        this.f44047m = aVar.f44269e.f44288C;
        for (String str : aVar.f44271g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f44271g.get(str);
            if (constraintAttribute != null && (iOrdinal = constraintAttribute.f44137c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f44049o.put(str, constraintAttribute);
            }
        }
    }

    public final void c(double d12, int[] iArr, double[] dArr, float[] fArr, int i12) {
        float fB2 = this.f44040f;
        float fCos = this.f44041g;
        float f12 = this.f44042h;
        float f13 = this.f44043i;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            float f14 = (float) dArr[i13];
            int i14 = iArr[i13];
            if (i14 == 1) {
                fB2 = f14;
            } else if (i14 == 2) {
                fCos = f14;
            } else if (i14 == 3) {
                f12 = f14;
            } else if (i14 == 4) {
                f13 = f14;
            }
        }
        p pVar = this.f44048n;
        if (pVar != null) {
            float[] fArr2 = new float[2];
            pVar.b(d12, fArr2, new float[2]);
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            double d13 = f15;
            double d14 = fB2;
            double d15 = fCos;
            fB2 = (float) (androidx.appcompat.app.r.b(d15, d14, d13) - (f12 / 2.0f));
            fCos = (float) ((f16 - (Math.cos(d15) * d14)) - (f13 / 2.0f));
        }
        fArr[i12] = (f12 / 2.0f) + fB2 + 0.0f;
        fArr[i12 + 1] = (f13 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@N v vVar) {
        return Float.compare(this.f44039e, vVar.f44039e);
    }

    public final void d(float f12, float f13, float f14, float f15) {
        this.f44040f = f12;
        this.f44041g = f13;
        this.f44042h = f14;
        this.f44043i = f15;
    }

    public final void f(p pVar, v vVar) {
        double d12 = (((this.f44042h / 2.0f) + this.f44040f) - vVar.f44040f) - (vVar.f44042h / 2.0f);
        double d13 = (((this.f44043i / 2.0f) + this.f44041g) - vVar.f44041g) - (vVar.f44043i / 2.0f);
        this.f44048n = pVar;
        this.f44040f = (float) Math.hypot(d13, d12);
        if (Float.isNaN(this.f44047m)) {
            this.f44041g = (float) (Math.atan2(d13, d12) + 1.5707963267948966d);
        } else {
            this.f44041g = (float) Math.toRadians(this.f44047m);
        }
    }
}
