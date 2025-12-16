package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class m8f {
    public static final o75 p = new o75(2);
    public static final o75 q = new o75(3);
    public static final o75 r = new o75(4);
    public static final o75 s = new o75(5);
    public static final o75 t = new o75(6);
    public static final o75 u = new o75(7);
    public static final o75 v = new o75(8);
    public static final o75 w = new o75(0);
    public static final o75 x = new o75(1);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final yr0 e;
    public boolean f;
    public final float g;
    public final float h;
    public long i;
    public final float j;
    public final ArrayList k;
    public final ArrayList l;
    public n8f m;
    public float n;
    public boolean o;

    public m8f(Object obj, yr0 yr0Var) {
        this(obj, yr0Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static kg d() {
        ThreadLocal threadLocal = kg.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new kg(new xt4(3)));
        }
        return (kg) threadLocal.get();
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        if (this.m == null) {
            this.m = new n8f(f);
        }
        this.m.i = f;
        g();
    }

    public final void b() {
        if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f) {
            c(true);
        }
        float f = this.n;
        if (f != Float.MAX_VALUE) {
            n8f n8fVar = this.m;
            if (n8fVar == null) {
                this.m = new n8f(f);
            } else {
                n8fVar.i = f;
            }
            this.n = Float.MAX_VALUE;
        }
    }

    public final void c(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f = false;
        kg kgVarD = d();
        kgVarD.a.remove(this);
        ArrayList arrayList2 = kgVarD.b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            kgVarD.f = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                of ofVar = (of) arrayList.get(i);
                qf qfVar = ofVar.a;
                OneMeButton oneMeButton = ofVar.b;
                qfVar.o = null;
                oneMeButton.setClickable(true);
                qfVar.c = false;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f) {
        ArrayList arrayList;
        this.e.c(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((r75) arrayList.get(i)).g(this.b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f() {
        if (this.m.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.o = true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [ig, java.lang.Object] */
    public final void g() {
        n8f n8fVar = this.m;
        if (n8fVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) n8fVar.i;
        if (d > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        n8fVar.d = dAbs;
        n8fVar.e = dAbs * 62.5d;
        if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.b(this.d);
        }
        float f = this.b;
        if (f > this.g || f < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        kg kgVarD = d();
        ArrayList arrayList = kgVarD.b;
        if (arrayList.size() == 0) {
            ((Choreographer) kgVarD.e.b).postFrameCallback(new jg(0, kgVarD.d));
            if (Build.VERSION.SDK_INT >= 33) {
                kgVarD.g = ValueAnimator.getDurationScale();
                if (kgVarD.h == null) {
                    i5i i5iVar = new i5i();
                    i5iVar.b = kgVarD;
                    kgVarD.h = i5iVar;
                }
                final i5i i5iVar2 = kgVarD.h;
                if (((ig) i5iVar2.a) == null) {
                    ?? r2 = new ValueAnimator.DurationScaleChangeListener() { // from class: ig
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((kg) i5iVar2.b).g = f2;
                        }
                    };
                    i5iVar2.a = r2;
                    ValueAnimator.registerDurationScaleChangeListener(r2);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public m8f(Object obj, yr0 yr0Var, float f) {
        this(obj, yr0Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
        this.m = new n8f(f);
    }

    public m8f(r26 r26Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new p75(r26Var);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public m8f(Object obj, yr0 yr0Var, int i) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = yr0Var;
        if (yr0Var != t && yr0Var != u && yr0Var != v) {
            if (yr0Var == x) {
                this.j = 0.00390625f;
                return;
            } else if (yr0Var != r && yr0Var != s) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.002f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
