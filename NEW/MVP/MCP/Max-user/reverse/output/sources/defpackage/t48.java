package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class t48 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u48 b;

    public /* synthetic */ t48(u48 u48Var, int i) {
        this.a = i;
        this.b = u48Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                u48 u48Var = this.b;
                u48Var.B();
                le leVar = u48Var.u0;
                if (leVar != null) {
                    leVar.a((pj7) u48Var.b);
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
                u48 u48Var = this.b;
                u48Var.Z = (u48Var.Z + 1) % u48Var.Y.c.length;
                u48Var.s0 = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
