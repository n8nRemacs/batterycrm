package defpackage;

import android.animation.Animator;

/* loaded from: classes2.dex */
public final class gk9 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik9 b;

    public /* synthetic */ gk9(ik9 ik9Var, int i) {
        this.a = i;
        this.b = ik9Var;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.v0.setAlpha(1.0f);
                break;
            case 2:
                this.b.v0.setAlpha(1.0f);
                break;
            case 3:
                this.b.v0.setAlpha(1.0f);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ik9 ik9Var = this.b;
                ik9Var.v0.setAlpha(0.0f);
                ik9Var.v0.setVisibility(0);
                break;
            case 2:
            case 3:
                break;
            default:
                this.b.v0.setVisibility(4);
                break;
        }
    }
}
