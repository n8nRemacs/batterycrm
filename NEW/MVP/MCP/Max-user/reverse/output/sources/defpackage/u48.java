package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u48 extends n2 {
    public static final int[] v0 = {533, 567, 850, 750};
    public static final int[] w0 = {1267, 1000, 333, 0};
    public static final r72 x0 = new r72(Float.class, "animationFraction", 9);
    public final Interpolator[] X;
    public final b58 Y;
    public int Z;
    public ObjectAnimator d;
    public ObjectAnimator o;
    public boolean s0;
    public float t0;
    public le u0;

    public u48(Context context, b58 b58Var) {
        super(2);
        this.Z = 0;
        this.u0 = null;
        this.Y = b58Var;
        this.X = new Interpolator[]{AnimationUtils.loadInterpolator(context, nuc.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, nuc.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, nuc.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, nuc.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.n2
    public final void B() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.n2
    public final void V() {
        j0();
    }

    @Override // defpackage.n2
    public final void e0(pk0 pk0Var) {
        this.u0 = pk0Var;
    }

    @Override // defpackage.n2
    public final void f0() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        B();
        if (((pj7) this.b).isVisible()) {
            this.o.setFloatValues(this.t0, 1.0f);
            this.o.setDuration((long) ((1.0f - this.t0) * 1800.0f));
            this.o.start();
        }
    }

    @Override // defpackage.n2
    public final void h0() {
        ObjectAnimator objectAnimator = this.d;
        r72 r72Var = x0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, r72Var, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new t48(this, 0));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, r72Var, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.o.setInterpolator(null);
            this.o.addListener(new t48(this, 1));
        }
        j0();
        this.d.start();
    }

    @Override // defpackage.n2
    public final void i0() {
        this.u0 = null;
    }

    public final void j0() {
        this.Z = 0;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((p45) it.next()).c = this.Y.c[0];
        }
    }
}
