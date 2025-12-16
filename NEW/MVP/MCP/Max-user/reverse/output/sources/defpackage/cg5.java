package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public final class cg5 extends AnimatorListenerAdapter {
    public final /* synthetic */ EnhancedAnimatedVectorDrawable a;

    public cg5(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        this.a = enhancedAnimatedVectorDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        int i = ve3.i(enhancedAnimatedVectorDrawable.animationCallbacks);
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            le leVar = (le) ue3.J(i2, enhancedAnimatedVectorDrawable.animationCallbacks);
            if (leVar != null) {
                leVar.a(enhancedAnimatedVectorDrawable);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        int i = ve3.i(enhancedAnimatedVectorDrawable.animationCallbacks);
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            le leVar = (le) ue3.J(i2, enhancedAnimatedVectorDrawable.animationCallbacks);
            if (leVar != null) {
                leVar.b(enhancedAnimatedVectorDrawable);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }
}
