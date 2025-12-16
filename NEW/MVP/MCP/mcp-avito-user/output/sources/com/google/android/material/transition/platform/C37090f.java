package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import j.N;
import j.P;
import j.X;

/* compiled from: FadeProvider.java */
@X
/* renamed from: com.google.android.material.transition.platform.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37090f implements I {

    /* renamed from: a, reason: collision with root package name */
    public float f357867a = 1.0f;

    @Override // com.google.android.material.transition.platform.I
    @P
    public final Animator a(@N View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C37088d(view, alpha, 0.0f, 1.0f));
        valueAnimatorOfFloat.addListener(new C37089e(view, alpha));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.I
    @P
    public final Animator b(@N View view) {
        float alpha = view.getAlpha() != 0.0f ? view.getAlpha() : 1.0f;
        float f12 = this.f357867a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C37088d(view, 0.0f, alpha, f12));
        valueAnimatorOfFloat.addListener(new C37089e(view, alpha));
        return valueAnimatorOfFloat;
    }
}
