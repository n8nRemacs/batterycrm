package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import j.N;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357327a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f357327a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
        this.f357327a.f357285i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
