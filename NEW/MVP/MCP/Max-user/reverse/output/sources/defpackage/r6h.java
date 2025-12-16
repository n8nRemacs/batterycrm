package defpackage;

import android.animation.Animator;

/* loaded from: classes2.dex */
public final class r6h implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6h b;

    public /* synthetic */ r6h(v6h v6hVar, int i) {
        this.a = i;
        this.b = v6hVar;
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
        switch (this.a) {
            case 0:
                this.b.o.c(false);
                break;
            case 1:
                this.b.o.c(false);
                break;
            default:
                v6h.i(this.b);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.o.c(false);
                break;
            case 1:
                this.b.o.c(false);
                break;
            default:
                v6h.i(this.b);
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
