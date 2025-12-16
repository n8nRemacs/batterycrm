package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v93 extends n2 {
    public static final int[] v0 = {0, 1350, 2700, 4050};
    public static final int[] w0 = {667, 2017, 3367, 4717};
    public static final int[] x0 = {1000, 2350, 3700, 5050};
    public static final r72 y0 = new r72(Float.class, "animationFraction", 5);
    public static final r72 z0 = new r72(Float.class, "completeEndFraction", 6);
    public final yq5 X;
    public final z93 Y;
    public int Z;
    public ObjectAnimator d;
    public ObjectAnimator o;
    public float s0;
    public float t0;
    public le u0;

    public v93(z93 z93Var) {
        super(1);
        this.Z = 0;
        this.u0 = null;
        this.Y = z93Var;
        this.X = new yq5();
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
        this.Z = 0;
        ((p45) ((ArrayList) this.c).get(0)).c = this.Y.c[0];
        this.t0 = 0.0f;
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
        if (((pj7) this.b).isVisible()) {
            this.o.start();
        } else {
            B();
        }
    }

    @Override // defpackage.n2
    public final void h0() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, y0, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new u93(this, 0));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, z0, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.o.setInterpolator(this.X);
            this.o.addListener(new u93(this, 1));
        }
        this.Z = 0;
        ((p45) ((ArrayList) this.c).get(0)).c = this.Y.c[0];
        this.t0 = 0.0f;
        this.d.start();
    }

    @Override // defpackage.n2
    public final void i0() {
        this.u0 = null;
    }
}
