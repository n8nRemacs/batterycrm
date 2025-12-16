package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public abstract class cqi {
    public static final ObjectAnimator a(View view, Property property, float f, float f2, long j, long j2, int i, int i2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, f2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setRepeatMode(i);
        objectAnimatorOfFloat.setRepeatCount(i2);
        return objectAnimatorOfFloat;
    }

    public static /* synthetic */ ObjectAnimator b(View view, Property property, float f, float f2, long j, long j2, int i) {
        return a(view, property, f, f2, j, (i & 16) != 0 ? 0L : j2, 1, 0);
    }

    public static final x38 e(j48 j48Var) {
        return zpi.a(j48Var.p());
    }

    public static final o98 m(View view, float f, float f2, long j, long j2) {
        o98 o98VarD = ve3.d();
        o98VarD.add(b(view, View.SCALE_X, f, f2, j, j2, 96));
        o98VarD.add(b(view, View.SCALE_Y, f, f2, j, j2, 96));
        return ve3.a(o98VarD);
    }

    public int c(View view, int i) {
        return 0;
    }

    public int d(View view, int i) {
        return 0;
    }

    public int f(int i) {
        return i;
    }

    public int g(View view) {
        return 0;
    }

    public int h(View view) {
        return 0;
    }

    public void i(View view, int i) {
    }

    public void j(int i) {
    }

    public abstract void k(View view, int i, int i2);

    public abstract void l(View view, float f, float f2);

    public abstract boolean n(View view, int i);
}
