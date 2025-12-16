package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewSpline.java */
/* loaded from: classes.dex */
public abstract class d extends p {

    /* compiled from: ViewSpline.java */
    public static class a extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setAlpha(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class b extends d {

        /* renamed from: f, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f43701f;

        /* renamed from: g, reason: collision with root package name */
        public float[] f43702g;

        public b() {
            throw null;
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public final void b(float f12, int i12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public final void c(int i12) {
            SparseArray<ConstraintAttribute> sparseArray = this.f43701f;
            int size = sparseArray.size();
            int iC2 = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.f43702g = new float[iC2];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC2);
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = sparseArray.keyAt(i13);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i13);
                dArr[i13] = iKeyAt * 0.01d;
                constraintAttributeValueAt.b(this.f43702g);
                int i14 = 0;
                while (true) {
                    if (i14 < this.f43702g.length) {
                        dArr2[i13][i14] = r7[i14];
                        i14++;
                    }
                }
            }
            this.f43327a = androidx.constraintlayout.core.motion.utils.b.a(i12, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f43327a.d(f12, this.f43702g);
            androidx.constraintlayout.motion.utils.a.b(this.f43701f.valueAt(0), view, this.f43702g);
        }
    }

    /* compiled from: ViewSpline.java */
    public static class c extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setElevation(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class e extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setPivotX(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class f extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setPivotY(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class g extends d {

        /* renamed from: f, reason: collision with root package name */
        public boolean f43703f = false;

        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f12));
                return;
            }
            if (this.f43703f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f43703f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f12)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* compiled from: ViewSpline.java */
    public static class h extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setRotation(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class i extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setRotationX(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class j extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setRotationY(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class k extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setScaleX(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class l extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setScaleY(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class m extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setTranslationX(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class n extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setTranslationY(a(f12));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class o extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
            view.setTranslationZ(a(f12));
        }
    }

    public static d d(String str) {
        switch (str) {
        }
        return new a();
    }

    public abstract void e(View view, float f12);

    /* compiled from: ViewSpline.java */
    /* renamed from: androidx.constraintlayout.motion.utils.d$d, reason: collision with other inner class name */
    public static class C1708d extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public final void e(View view, float f12) {
        }
    }
}
