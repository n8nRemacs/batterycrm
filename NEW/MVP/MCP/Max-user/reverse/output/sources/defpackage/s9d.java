package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;

/* loaded from: classes2.dex */
public final class s9d extends Visibility {
    public static final PathInterpolator b = new PathInterpolator(0.9f, 0.0f, 0.66f, 1.0f);
    public final d9d a;

    public s9d(d9d d9dVar) {
        this.a = d9dVar;
    }

    public final AnimatorSet a(View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        addListener(new p9d(view, m8f.r, f2));
        view.setScaleX(f);
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        addListener(new p9d(view, m8f.s, f2));
        view.setScaleY(f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(b);
        addListener(new r9d(view, f));
        valueAnimatorOfFloat.addUpdateListener(new dg(view, 5));
        animatorSet.playTogether(duration, duration2, valueAnimatorOfFloat);
        animatorSet.addListener(new q9d(z, this, view));
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, true);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, false);
    }
}
