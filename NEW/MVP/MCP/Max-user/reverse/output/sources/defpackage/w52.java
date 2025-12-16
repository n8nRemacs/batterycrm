package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import one.me.android.root.RootController;

/* loaded from: classes2.dex */
public final class w52 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w52(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                super.onAnimationCancel(animator);
                this.b = true;
                ((x52) obj).c.invoke();
                break;
            case 1:
                this.b = true;
                break;
            case 2:
                boolean z = this.b;
                yy7[] yy7VarArr = RootController.s0;
                ((RootController) obj).D0(z);
                break;
            default:
                super.onAnimationCancel(animator);
                this.b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((x52) obj).c(false);
                    break;
                }
                break;
            case 1:
                br5 br5Var = (br5) obj;
                if (!this.b) {
                    if (((Float) br5Var.J0.getAnimatedValue()).floatValue() != 0.0f) {
                        br5Var.K0 = 2;
                        br5Var.C0.invalidate();
                        break;
                    } else {
                        br5Var.K0 = 0;
                        br5Var.m(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            case 2:
                boolean z = this.b;
                yy7[] yy7VarArr = RootController.s0;
                ((RootController) obj).D0(z);
                break;
            default:
                super.onAnimationEnd(animator);
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                }
                this.b = false;
                break;
        }
    }

    public w52(RootController rootController, boolean z) {
        this.a = 2;
        this.c = rootController;
        this.b = z;
    }

    public w52(br5 br5Var) {
        this.a = 1;
        this.c = br5Var;
        this.b = false;
    }
}
