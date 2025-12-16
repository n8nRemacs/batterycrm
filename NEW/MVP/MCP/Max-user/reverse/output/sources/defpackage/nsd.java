package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.android.root.RootController;

/* loaded from: classes.dex */
public final class nsd extends AnimatorListenerAdapter {
    public final /* synthetic */ jn1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ RootController c;

    public nsd(jn1 jn1Var, boolean z, RootController rootController) {
        this.a = jn1Var;
        this.b = z;
        this.c = rootController;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        yy7[] yy7VarArr = RootController.s0;
        this.c.D0(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yy7[] yy7VarArr = RootController.s0;
        this.c.D0(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        boolean z = this.b;
        jn1 jn1Var = this.a;
        if (jn1Var != null) {
            jn1Var.c(z);
        }
        yy7[] yy7VarArr = RootController.s0;
        RootController rootController = this.c;
        rootController.I0().setTranslationY(0.0f);
        rootController.K0(z);
    }
}
