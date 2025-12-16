package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: A, reason: collision with root package name */
    public m[] f43997A;

    /* renamed from: b, reason: collision with root package name */
    public final View f44006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44007c;

    /* renamed from: j, reason: collision with root package name */
    public androidx.constraintlayout.core.motion.utils.b[] f44014j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.constraintlayout.core.motion.utils.a f44015k;

    /* renamed from: o, reason: collision with root package name */
    public int[] f44019o;

    /* renamed from: p, reason: collision with root package name */
    public double[] f44020p;

    /* renamed from: q, reason: collision with root package name */
    public double[] f44021q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f44022r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f44023s;

    /* renamed from: x, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.motion.utils.f> f44028x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.motion.utils.d> f44029y;

    /* renamed from: z, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.motion.utils.c> f44030z;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f44005a = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public boolean f44008d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f44009e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final v f44010f = new v();

    /* renamed from: g, reason: collision with root package name */
    public final v f44011g = new v();

    /* renamed from: h, reason: collision with root package name */
    public final n f44012h = new n();

    /* renamed from: i, reason: collision with root package name */
    public final n f44013i = new n();

    /* renamed from: l, reason: collision with root package name */
    public float f44016l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f44017m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f44018n = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f44024t = new float[4];

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList<v> f44025u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    public final float[] f44026v = new float[1];

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<AbstractC22740f> f44027w = new ArrayList<>();

    /* renamed from: B, reason: collision with root package name */
    public int f43998B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f43999C = -1;

    /* renamed from: D, reason: collision with root package name */
    public View f44000D = null;

    /* renamed from: E, reason: collision with root package name */
    public int f44001E = -1;

    /* renamed from: F, reason: collision with root package name */
    public float f44002F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    public Interpolator f44003G = null;

    /* renamed from: H, reason: collision with root package name */
    public boolean f44004H = false;

    public p(View view) {
        this.f44006b = view;
        this.f44007c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).getClass();
        }
    }

    public static void j(int i12, int i13, int i14, Rect rect, Rect rect2) {
        if (i12 == 1) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i14 - ((rect.height() + i15) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i12 == 2) {
            int i16 = rect.left + rect.right;
            rect2.left = i13 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i16 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i12 == 3) {
            int i17 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i17 / 2);
            rect2.top = i14 - ((rect.height() + i17) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i12 != 4) {
            return;
        }
        int i18 = rect.left + rect.right;
        rect2.left = i13 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i18 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float[] fArr, float f12) {
        float f13 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f14 = this.f44018n;
            if (f14 != 1.0d) {
                float f15 = this.f44017m;
                if (f12 < f15) {
                    f12 = 0.0f;
                }
                if (f12 > f15 && f12 < 1.0d) {
                    f12 = Math.min((f12 - f15) * f14, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.d dVar = this.f44010f.f44036b;
        Iterator<v> it = this.f44025u.iterator();
        float f16 = Float.NaN;
        while (it.hasNext()) {
            v next = it.next();
            androidx.constraintlayout.core.motion.utils.d dVar2 = next.f44036b;
            if (dVar2 != null) {
                float f17 = next.f44038d;
                if (f17 < f12) {
                    dVar = dVar2;
                    f13 = f17;
                } else if (Float.isNaN(f16)) {
                    f16 = next.f44038d;
                }
            }
        }
        if (dVar != null) {
            float f18 = (Float.isNaN(f16) ? 1.0f : f16) - f13;
            double d12 = (f12 - f13) / f18;
            f12 = (((float) dVar.a(d12)) * f18) + f13;
            if (fArr != null) {
                fArr[0] = (float) dVar.b(d12);
            }
        }
        return f12;
    }

    public final void b(double d12, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f44014j[0].c(d12, dArr);
        this.f44014j[0].f(d12, dArr2);
        float f12 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f44019o;
        v vVar = this.f44010f;
        float f13 = vVar.f44040f;
        float f14 = vVar.f44041g;
        float f15 = vVar.f44042h;
        float f16 = vVar.f44043i;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f22 = (float) dArr[i12];
            float f23 = (float) dArr2[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f13 = f22;
                f12 = f23;
            } else if (i13 == 2) {
                f14 = f22;
                f19 = f23;
            } else if (i13 == 3) {
                f15 = f22;
                f17 = f23;
            } else if (i13 == 4) {
                f16 = f22;
                f18 = f23;
            }
        }
        float f24 = 2.0f;
        float f25 = (f17 / 2.0f) + f12;
        float f26 = (f18 / 2.0f) + f19;
        p pVar = vVar.f44048n;
        if (pVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            pVar.b(d12, fArr3, fArr4);
            float f27 = fArr3[0];
            float f28 = fArr3[1];
            float f29 = fArr4[0];
            float f32 = fArr4[1];
            double d13 = f13;
            double d14 = f14;
            float fB2 = (float) (androidx.appcompat.app.r.b(d14, d13, f27) - (f15 / 2.0f));
            float fCos = (float) ((f28 - (Math.cos(d14) * d13)) - (f16 / 2.0f));
            double d15 = f12;
            double d16 = f19;
            float fCos2 = (float) ((Math.cos(d14) * d16) + androidx.appcompat.app.r.b(d14, d15, f29));
            float fB3 = (float) androidx.appcompat.app.r.b(d14, d16, f32 - (Math.cos(d14) * d15));
            f13 = fB2;
            f14 = fCos;
            f25 = fCos2;
            f26 = fB3;
            f24 = 2.0f;
        }
        fArr[0] = (f15 / f24) + f13 + 0.0f;
        fArr[1] = (f16 / f24) + f14 + 0.0f;
        fArr2[0] = f25;
        fArr2[1] = f26;
    }

    public final void c() {
        float f12 = this.f44011g.f44040f;
    }

    public final float d() {
        return this.f44011g.f44041g;
    }

    public final float e() {
        char c12;
        float fHypot;
        float[] fArr = new float[2];
        float f12 = 1.0f / 99;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f13 = 0.0f;
        int i12 = 0;
        while (i12 < 100) {
            float f14 = i12 * f12;
            double dA2 = f14;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f44010f.f44036b;
            Iterator<v> it = this.f44025u.iterator();
            float f15 = Float.NaN;
            float f16 = 0.0f;
            while (it.hasNext()) {
                v next = it.next();
                androidx.constraintlayout.core.motion.utils.d dVar2 = next.f44036b;
                if (dVar2 != null) {
                    float f17 = next.f44038d;
                    if (f17 < f14) {
                        dVar = dVar2;
                        f16 = f17;
                    } else if (Float.isNaN(f15)) {
                        f15 = next.f44038d;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                dA2 = (((float) dVar.a((f14 - f16) / r17)) * (f15 - f16)) + f16;
            }
            this.f44014j[0].c(dA2, this.f44020p);
            float f18 = f13;
            int i13 = i12;
            this.f44010f.c(dA2, this.f44019o, this.f44020p, fArr, 0);
            if (i13 > 0) {
                c12 = 0;
                fHypot = (float) (Math.hypot(d13 - fArr[1], d12 - fArr[0]) + f18);
            } else {
                c12 = 0;
                fHypot = f18;
            }
            d12 = fArr[c12];
            i12 = i13 + 1;
            f13 = fHypot;
            d13 = fArr[1];
        }
        return f13;
    }

    public final void f() {
        float f12 = this.f44010f.f44040f;
    }

    public final float g() {
        return this.f44010f.f44041g;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(float r34, long r35, android.view.View r37, androidx.constraintlayout.core.motion.utils.g r38) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.p.h(float, long, android.view.View, androidx.constraintlayout.core.motion.utils.g):boolean");
    }

    public final void i(v vVar) {
        vVar.d((int) this.f44006b.getX(), (int) this.f44006b.getY(), this.f44006b.getWidth(), this.f44006b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06dc A[PHI: r0 r27 r35 r38 r39 r40 r41 r42
  0x06dc: PHI (r0v160 java.lang.Object) = 
  (r0v100 java.lang.Object)
  (r0v102 java.lang.Object)
  (r0v104 java.lang.Object)
  (r0v109 java.lang.Object)
  (r0v111 java.lang.Object)
  (r0v161 java.lang.Object)
 binds: [B:296:0x07ac, B:292:0x07a0, B:288:0x0792, B:271:0x0759, B:267:0x074b, B:240:0x06da] A[DONT_GENERATE, DONT_INLINE]
  0x06dc: PHI (r27v9 java.lang.Object) = 
  (r27v3 java.lang.Object)
  (r27v3 java.lang.Object)
  (r27v3 java.lang.Object)
  (r27v3 java.lang.Object)
  (r27v3 java.lang.Object)
  (r27v10 java.lang.Object)
 binds: [B:296:0x07ac, B:292:0x07a0, B:288:0x0792, B:271:0x0759, B:267:0x074b, B:240:0x06da] A[DONT_GENERATE, DONT_INLINE]
  0x06dc: PHI (r35v10 java.lang.String) = 
  (r35v4 java.lang.String)
  (r35v4 java.lang.String)
  (r35v4 java.lang.String)
  (r35v4 java.lang.String)
  (r35v4 java.lang.String)
  (r35v11 java.lang.String)
 binds: [B:296:0x07ac, B:292:0x07a0, B:288:0x0792, B:271:0x0759, B:267:0x074b, B:240:0x06da] A[DONT_GENERATE, DONT_INLINE]
  0x06dc: PHI (r38v10 java.lang.String) = 
  (r38v4 java.lang.String)
  (r38v4 java.lang.String)
  (r38v4 java.lang.String)
  (r38v4 java.lang.String)
  (r38v4 java.lang.String)
  (r38v11 java.lang.String)
 binds: [B:296:0x07ac, B:292:0x07a0, B:288:0x0792, B:271:0x0759, B:267:0x074b, B:240:0x06da] A[DONT_GENERATE, DONT_INLINE]
  0x06dc: PHI (r39v10 java.lang.String) = 
  (r39v4 java.lang.String)
  (r39v4 java.lang.String)
  (r39v4 java.lang.String)
  (r39v4 java.lang.String)
  (r39v4 java.lang.String)
  (r39v11 java.lang.String)
 binds: [B:296:0x07ac, B:292:0x07a0, B:288:0x0792, B:271:0x0759, B:267:0x074b, B:240:0x06da] A[DONT_GENERATE, DONT_INLINE]
  0x06dc: PHI (r40v10 java.lang.String) = 
  (r40v4 java.lang.String)
  (r40v4 java.lang.String)
  (r40v4 java.lang.String)
  (r40v4 java.lang.String)
  (r40v4 java.lang.String)
  (r40v11 java.lang.String)
 binds: [B:296:0x07ac, B:292:0x07a0, B:288:0x0792, B:271:0x0759, B:267:0x074b, B:240:0x06da] A[DONT_GENERATE, DONT_INLINE]
  0x06dc: PHI (r41v10 java.lang.String) = 
  (r41v4 java.lang.String)
  (r41v4 java.lang.String)
  (r41v4 java.lang.String)
  (r41v4 java.lang.String)
  (r41v4 java.lang.String)
  (r41v11 java.lang.String)
 binds: [B:296:0x07ac, B:292:0x07a0, B:288:0x0792, B:271:0x0759, B:267:0x074b, B:240:0x06da] A[DONT_GENERATE, DONT_INLINE]
  0x06dc: PHI (r42v10 java.lang.String) = 
  (r42v4 java.lang.String)
  (r42v4 java.lang.String)
  (r42v4 java.lang.String)
  (r42v4 java.lang.String)
  (r42v4 java.lang.String)
  (r42v11 java.lang.String)
 binds: [B:296:0x07ac, B:292:0x07a0, B:288:0x0792, B:271:0x0759, B:267:0x074b, B:240:0x06da] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r50, int r51, long r52) {
        /*
            Method dump skipped, instructions count: 3512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.p.k(int, int, long):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        v vVar = this.f44010f;
        sb2.append(vVar.f44040f);
        sb2.append(" y: ");
        sb2.append(vVar.f44041g);
        sb2.append(" end: x: ");
        v vVar2 = this.f44011g;
        sb2.append(vVar2.f44040f);
        sb2.append(" y: ");
        sb2.append(vVar2.f44041g);
        return sb2.toString();
    }
}
