package defpackage;

import android.animation.Animator;

/* loaded from: classes2.dex */
public final class a6h implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6h b;

    public /* synthetic */ a6h(b6h b6hVar, int i) {
        this.a = i;
        this.b = b6hVar;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b6h b6hVar = this.b;
                b6hVar.H0 = null;
                b6hVar.I0 = false;
                break;
            default:
                this.b.E0 = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
