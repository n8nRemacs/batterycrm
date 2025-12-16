package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import j.N;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357328a;

    public c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f357328a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f357328a;
        baseTransientBottomBar.f357285i.setScaleX(fFloatValue);
        baseTransientBottomBar.f357285i.setScaleY(fFloatValue);
    }
}
