package e11;

import android.animation.Animator;

/* loaded from: classes7.dex */
public class c2 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f394558a;

    public c2(b2 b2Var) {
        this.f394558a = b2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b2 b2Var = this.f394558a;
        if (b2Var.f394543e.isEnabled()) {
            b2Var.f394543e.setVisibility(8);
        }
        if (b2Var.f394546h.isEnabled()) {
            b2Var.f394546h.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
