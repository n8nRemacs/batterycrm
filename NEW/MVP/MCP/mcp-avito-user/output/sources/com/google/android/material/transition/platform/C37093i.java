package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import j.N;
import j.P;
import j.X;

/* compiled from: FadeThroughProvider.java */
@X
/* renamed from: com.google.android.material.transition.platform.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37093i implements I {
    @Override // com.google.android.material.transition.platform.I
    @P
    public final Animator a(@N View view) {
        float alpha = view.getAlpha() != 0.0f ? view.getAlpha() : 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C37091g(view, alpha, 0.0f, 0.0f, 0.35f));
        valueAnimatorOfFloat.addListener(new C37092h(view, alpha));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.I
    @P
    public final Animator b(@N View view) {
        float alpha = view.getAlpha() != 0.0f ? view.getAlpha() : 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C37091g(view, 0.0f, alpha, 0.35f, 1.0f));
        valueAnimatorOfFloat.addListener(new C37092h(view, alpha));
        return valueAnimatorOfFloat;
    }
}
