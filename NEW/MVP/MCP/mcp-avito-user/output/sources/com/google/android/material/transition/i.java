package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import j.N;
import j.P;

/* compiled from: FadeThroughProvider.java */
/* loaded from: classes6.dex */
public final class i implements E {
    @Override // com.google.android.material.transition.E
    @P
    public final Animator a(@N View view) {
        float alpha = view.getAlpha() != 0.0f ? view.getAlpha() : 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new g(view, alpha, 0.0f, 0.0f, 0.35f));
        valueAnimatorOfFloat.addListener(new h(view, alpha));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.E
    @P
    public final Animator b(@N View view) {
        float alpha = view.getAlpha() != 0.0f ? view.getAlpha() : 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new g(view, 0.0f, alpha, 0.35f, 1.0f));
        valueAnimatorOfFloat.addListener(new h(view, alpha));
        return valueAnimatorOfFloat;
    }
}
