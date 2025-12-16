package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class ih extends h54 {
    public boolean X;
    public boolean Y;
    public Animator Z;
    public long d;
    public boolean o;
    public gh s0;
    public boolean t0;

    public ih() {
        this(0L, 3);
    }

    @Override // defpackage.h54
    public final void a() {
        this.X = true;
        Animator animator = this.Z;
        if (animator != null) {
            animator.end();
            return;
        }
        gh ghVar = this.s0;
        if (ghVar != null) {
            ghVar.a();
        }
    }

    @Override // defpackage.h54
    public boolean d() {
        return this.t0;
    }

    @Override // defpackage.h54
    public final void f(h54 h54Var, c54 c54Var) {
        this.o = true;
        Animator animator = this.Z;
        if (animator != null) {
            animator.cancel();
            return;
        }
        gh ghVar = this.s0;
        if (ghVar != null) {
            ghVar.a();
        }
    }

    @Override // defpackage.h54
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, f54 f54Var) {
        boolean z2 = view2 != null && view2.getParent() == null;
        if (z2) {
            if (z || view == null) {
                viewGroup.addView(view2);
            } else if (view2.getParent() == null) {
                viewGroup.addView(view2, viewGroup.indexOfChild(view));
            }
            if (view2.getWidth() <= 0 && view2.getHeight() <= 0) {
                this.s0 = new gh(this, f54Var, view, view2, viewGroup, z);
                view2.getViewTreeObserver().addOnPreDrawListener(this.s0);
                return;
            }
        }
        m(viewGroup, view, view2, z, z2, f54Var);
    }

    @Override // defpackage.h54
    public final void h(Bundle bundle) {
        this.d = bundle.getLong("AnimatorChangeHandler.duration");
        this.t0 = bundle.getBoolean("AnimatorChangeHandler.removesFromViewOnPush");
    }

    @Override // defpackage.h54
    public final void i(Bundle bundle) {
        bundle.putLong("AnimatorChangeHandler.duration", this.d);
        bundle.putBoolean("AnimatorChangeHandler.removesFromViewOnPush", d());
    }

    public final void k(f54 f54Var, hh hhVar) {
        if (!this.Y) {
            this.Y = true;
            f54Var.d();
        }
        Animator animator = this.Z;
        if (animator != null) {
            if (hhVar != null) {
                animator.removeListener(hhVar);
            }
            this.Z.cancel();
            this.Z = null;
        }
        this.s0 = null;
    }

    public abstract AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2);

    public final void m(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2, f54 f54Var) {
        if (this.o) {
            k(f54Var, null);
            return;
        }
        if (!this.X) {
            AnimatorSet animatorSetL = l(viewGroup, view, view2, z, z2);
            this.Z = animatorSetL;
            long j = this.d;
            if (j > 0) {
                animatorSetL.setDuration(j);
            }
            this.Z.addListener(new hh(this, f54Var, view, view2, viewGroup, z));
            this.Z.start();
            return;
        }
        if (view != null && (!z || d())) {
            viewGroup.removeView(view);
        }
        k(f54Var, null);
        if (!z || view == null) {
            return;
        }
        n(view);
    }

    public abstract void n(View view);

    public /* synthetic */ ih(long j, int i) {
        this((i & 1) != 0 ? -1L : j, true);
    }

    public ih(long j, boolean z) {
        this.d = j;
        this.t0 = z;
    }

    public ih(int i) {
        this(-1L, true);
    }
}
