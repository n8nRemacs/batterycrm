package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class rn4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn4 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ un4 e;

    public /* synthetic */ rn4(un4 un4Var, sn4 sn4Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = un4Var;
        this.b = sn4Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                sn4 sn4Var = this.b;
                mid midVar = sn4Var.a;
                un4 un4Var = this.e;
                un4Var.c(midVar);
                un4Var.r.remove(sn4Var.a);
                un4Var.j();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                sn4 sn4Var2 = this.b;
                mid midVar2 = sn4Var2.b;
                un4 un4Var2 = this.e;
                un4Var2.c(midVar2);
                un4Var2.r.remove(sn4Var2.b);
                un4Var2.j();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                mid midVar = this.b.a;
                this.e.getClass();
                break;
            default:
                mid midVar2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
