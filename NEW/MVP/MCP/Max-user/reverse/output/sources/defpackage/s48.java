package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s48 extends n2 {
    public static final r72 t0 = new r72(Float.class, "animationFraction", 8);
    public final b58 X;
    public int Y;
    public boolean Z;
    public ObjectAnimator d;
    public final yq5 o;
    public float s0;

    public s48(b58 b58Var) {
        super(3);
        this.Y = 1;
        this.X = b58Var;
        this.o = new yq5();
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
    }

    @Override // defpackage.n2
    public final void f0() {
    }

    @Override // defpackage.n2
    public final void h0() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, t0, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new s6(6, this));
        }
        j0();
        this.d.start();
    }

    @Override // defpackage.n2
    public final void i0() {
    }

    public final void j0() {
        this.Z = true;
        this.Y = 1;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            p45 p45Var = (p45) it.next();
            b58 b58Var = this.X;
            p45Var.c = b58Var.c[0];
            p45Var.d = b58Var.g / 2;
        }
    }
}
