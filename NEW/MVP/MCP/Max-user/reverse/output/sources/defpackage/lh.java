package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* loaded from: classes2.dex */
public final class lh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatorSet b;
    public final /* synthetic */ cm6 c;

    public /* synthetic */ lh(AnimatorSet animatorSet, cm6 cm6Var, int i) {
        this.a = i;
        this.b = animatorSet;
        this.c = cm6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.removeListener(this);
                this.c.invoke();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.removeListener(this);
                this.c.invoke();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
