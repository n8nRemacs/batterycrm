package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class xs7 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final mid e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ mid o;
    public final /* synthetic */ bt7 p;

    public xs7(bt7 bt7Var, mid midVar, int i, float f, float f2, float f3, float f4, int i2, mid midVar2) {
        this.p = bt7Var;
        this.n = i2;
        this.o = midVar2;
        this.f = i;
        this.e = midVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new wk0(5, this));
        valueAnimatorOfFloat.setTarget(midVar.a);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.w(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        mid midVar = this.o;
        bt7 bt7Var = this.p;
        if (i <= 0) {
            bt7Var.w0.a(bt7Var.B0, midVar);
        } else {
            bt7Var.a.add(midVar.a);
            this.h = true;
            if (i > 0) {
                bt7Var.B0.post(new zn6(bt7Var, this, i));
            }
        }
        View view = bt7Var.G0;
        View view2 = midVar.a;
        if (view == view2) {
            bt7Var.s(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
