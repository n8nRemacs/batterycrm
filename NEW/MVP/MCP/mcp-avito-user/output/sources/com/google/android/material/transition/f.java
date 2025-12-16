package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import j.N;
import j.P;

/* compiled from: FadeProvider.java */
/* loaded from: classes6.dex */
public final class f implements E {

    /* renamed from: a, reason: collision with root package name */
    public float f357761a = 1.0f;

    @Override // com.google.android.material.transition.E
    @P
    public final Animator a(@N View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C37083d(view, alpha, 0.0f, 1.0f));
        valueAnimatorOfFloat.addListener(new C37084e(view, alpha));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.E
    @P
    public final Animator b(@N View view) {
        float alpha = view.getAlpha() != 0.0f ? view.getAlpha() : 1.0f;
        float f12 = this.f357761a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C37083d(view, 0.0f, alpha, f12));
        valueAnimatorOfFloat.addListener(new C37084e(view, alpha));
        return valueAnimatorOfFloat;
    }
}
