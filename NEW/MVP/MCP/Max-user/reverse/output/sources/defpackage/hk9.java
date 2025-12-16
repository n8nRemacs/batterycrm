package defpackage;

import android.animation.Animator;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class hk9 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik9 b;
    public final /* synthetic */ k18 c;

    public /* synthetic */ hk9(ik9 ik9Var, k18 k18Var, int i) {
        this.a = i;
        this.b = ik9Var;
        this.c = k18Var;
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
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ik9 ik9Var = this.b;
                ImageView imageView = ik9Var.v0;
                imageView.setAlpha(0.0f);
                imageView.setVisibility(0);
                ik9Var.b.setTranslationX(0.0f);
                k18 k18Var = this.c;
                if (k18Var.e()) {
                    ((wbf) k18Var.getValue()).setTranslationX(0.0f);
                    break;
                }
                break;
            default:
                ik9 ik9Var2 = this.b;
                ik9Var2.d.setTranslationX(0.0f);
                ik9Var2.b.setTranslationX(0.0f);
                k18 k18Var2 = this.c;
                if (k18Var2.e()) {
                    ((wbf) k18Var2.getValue()).setTranslationX(0.0f);
                }
                ik9Var2.v0.setVisibility(0);
                break;
        }
    }
}
