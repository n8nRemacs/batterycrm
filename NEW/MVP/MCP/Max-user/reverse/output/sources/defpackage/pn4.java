package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class pn4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ mid b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ un4 e;

    public pn4(un4 un4Var, mid midVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = un4Var;
        this.b = midVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                un4 un4Var = this.e;
                un4Var.m();
                mid midVar = this.b;
                un4Var.c(midVar);
                un4Var.q.remove(midVar);
                un4Var.j();
                break;
            default:
                this.d.setListener(null);
                un4 un4Var2 = this.e;
                mid midVar2 = this.b;
                un4Var2.c(midVar2);
                un4Var2.o.remove(midVar2);
                un4Var2.j();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public pn4(un4 un4Var, mid midVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = un4Var;
        this.b = midVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
