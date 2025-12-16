package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewOscillator.java */
/* loaded from: classes.dex */
public abstract class c extends androidx.constraintlayout.core.motion.utils.i {

    /* compiled from: ViewOscillator.java */
    public static class a extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setAlpha(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class b extends c {

        /* renamed from: g, reason: collision with root package name */
        public final float[] f43698g = new float[1];

        /* renamed from: h, reason: collision with root package name */
        public ConstraintAttribute f43699h;

        @Override // androidx.constraintlayout.core.motion.utils.i
        public final void c(ConstraintAttribute constraintAttribute) {
            this.f43699h = constraintAttribute;
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            float fA2 = a(f12);
            float[] fArr = this.f43698g;
            fArr[0] = fA2;
            androidx.constraintlayout.motion.utils.a.b(this.f43699h, view, fArr);
        }
    }

    /* compiled from: ViewOscillator.java */
    /* renamed from: androidx.constraintlayout.motion.utils.c$c, reason: collision with other inner class name */
    public static class C1707c extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setElevation(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class e extends c {

        /* renamed from: g, reason: collision with root package name */
        public boolean f43700g = false;

        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f12));
                return;
            }
            if (this.f43700g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f43700g = true;
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

    /* compiled from: ViewOscillator.java */
    public static class f extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setRotation(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class g extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setRotationX(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class h extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setRotationY(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class i extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setScaleX(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class j extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setScaleY(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class k extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setTranslationX(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class l extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setTranslationY(a(f12));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class m extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
            view.setTranslationZ(a(f12));
        }
    }

    public static c g(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        switch (str) {
            case "rotationX":
                return new g();
            case "rotationY":
                return new h();
            case "translationX":
                return new k();
            case "translationY":
                return new l();
            case "translationZ":
                return new m();
            case "progress":
                return new e();
            case "scaleX":
                return new i();
            case "scaleY":
                return new j();
            case "waveVariesBy":
                return new a();
            case "rotation":
                return new f();
            case "elevation":
                return new C1707c();
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void h(View view, float f12);

    /* compiled from: ViewOscillator.java */
    public static class d extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public final void h(View view, float f12) {
        }
    }
}
