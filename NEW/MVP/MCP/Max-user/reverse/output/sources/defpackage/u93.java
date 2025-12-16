package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class u93 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v93 b;

    public /* synthetic */ u93(v93 v93Var, int i) {
        this.a = i;
        this.b = v93Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                v93 v93Var = this.b;
                v93Var.B();
                le leVar = v93Var.u0;
                if (leVar != null) {
                    leVar.a((pj7) v93Var.b);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                v93 v93Var = this.b;
                v93Var.Z = (v93Var.Z + 4) % v93Var.Y.c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
