package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ViewTimeCycle.java */
/* loaded from: classes.dex */
public abstract class f extends u {

    /* compiled from: ViewTimeCycle.java */
    public static class a extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setAlpha(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class b extends f {

        /* renamed from: k, reason: collision with root package name */
        public String f43704k;

        /* renamed from: l, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f43705l;

        /* renamed from: m, reason: collision with root package name */
        public SparseArray<float[]> f43706m;

        /* renamed from: n, reason: collision with root package name */
        public float[] f43707n;

        /* renamed from: o, reason: collision with root package name */
        public float[] f43708o;

        public b() {
            throw null;
        }

        @Override // androidx.constraintlayout.core.motion.utils.u
        public final void b(float f12, float f13, float f14, int i12, int i13) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.u
        public final void c(int i12) {
            SparseArray<ConstraintAttribute> sparseArray = this.f43705l;
            int size = sparseArray.size();
            int iC2 = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            int i13 = iC2 + 2;
            this.f43707n = new float[i13];
            this.f43708o = new float[iC2];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i13);
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = sparseArray.keyAt(i14);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i14);
                float[] fArrValueAt = this.f43706m.valueAt(i14);
                dArr[i14] = iKeyAt * 0.01d;
                constraintAttributeValueAt.b(this.f43707n);
                int i15 = 0;
                while (true) {
                    if (i15 < this.f43707n.length) {
                        dArr2[i14][i15] = r10[i15];
                        i15++;
                    }
                }
                double[] dArr3 = dArr2[i14];
                dArr3[iC2] = fArrValueAt[0];
                dArr3[iC2 + 1] = fArrValueAt[1];
            }
            this.f43355a = androidx.constraintlayout.core.motion.utils.b.a(i12, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f43355a.d(f12, this.f43707n);
            float[] fArr = this.f43707n;
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            long j13 = j12 - this.f43363i;
            if (Float.isNaN(this.f43364j)) {
                float fA2 = gVar.a(view, this.f43704k);
                this.f43364j = fA2;
                if (Float.isNaN(fA2)) {
                    this.f43364j = 0.0f;
                }
            }
            float f15 = (float) ((((j13 * 1.0E-9d) * f13) + this.f43364j) % 1.0d);
            this.f43364j = f15;
            this.f43363i = j12;
            float fA3 = a(f15);
            this.f43362h = false;
            int i12 = 0;
            while (true) {
                float[] fArr2 = this.f43708o;
                if (i12 >= fArr2.length) {
                    break;
                }
                boolean z12 = this.f43362h;
                float f16 = this.f43707n[i12];
                this.f43362h = z12 | (((double) f16) != 0.0d);
                fArr2[i12] = (f16 * fA3) + f14;
                i12++;
            }
            androidx.constraintlayout.motion.utils.a.b(this.f43705l.valueAt(0), view, this.f43708o);
            if (f13 != 0.0f) {
                this.f43362h = true;
            }
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class c extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setElevation(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class d extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class e extends f {

        /* renamed from: k, reason: collision with root package name */
        public boolean f43709k = false;

        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(d(f12, j12, view, gVar));
            } else {
                if (this.f43709k) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f43709k = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(d(f12, j12, view, gVar)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* renamed from: androidx.constraintlayout.motion.utils.f$f, reason: collision with other inner class name */
    public static class C1709f extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotation(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class g extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotationX(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class h extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotationY(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class i extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setScaleX(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class j extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setScaleY(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class k extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationX(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class l extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationY(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class m extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public final boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationZ(d(f12, j12, view, gVar));
            return this.f43362h;
        }
    }

    public static f e(long j12, String str) {
        f gVar;
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new C1709f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.f43363i = j12;
        return gVar;
    }

    public final float d(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
        float[] fArr = this.f43361g;
        this.f43355a.d(f12, fArr);
        boolean z12 = true;
        float f13 = fArr[1];
        if (f13 == 0.0f) {
            this.f43362h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f43364j)) {
            float fA2 = gVar.a(view, this.f43360f);
            this.f43364j = fA2;
            if (Float.isNaN(fA2)) {
                this.f43364j = 0.0f;
            }
        }
        float f14 = (float) (((((j12 - this.f43363i) * 1.0E-9d) * f13) + this.f43364j) % 1.0d);
        this.f43364j = f14;
        String str = this.f43360f;
        HashMap<Object, HashMap<String, float[]>> map = gVar.f43290a;
        if (map.containsKey(view)) {
            HashMap<String, float[]> map2 = map.get(view);
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f14;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f14});
                map.put(view, map2);
            }
        } else {
            HashMap<String, float[]> map3 = new HashMap<>();
            map3.put(str, new float[]{f14});
            map.put(view, map3);
        }
        this.f43363i = j12;
        float f15 = fArr[0];
        float fA3 = (a(this.f43364j) * f15) + fArr[2];
        if (f15 == 0.0f && f13 == 0.0f) {
            z12 = false;
        }
        this.f43362h = z12;
        return fA3;
    }

    public abstract boolean f(float f12, long j12, View view, androidx.constraintlayout.core.motion.utils.g gVar);
}
