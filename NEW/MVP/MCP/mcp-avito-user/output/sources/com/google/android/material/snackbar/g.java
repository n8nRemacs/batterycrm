package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import j.N;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357333a;

    public g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f357333a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        androidx.interpolator.view.animation.b bVar = BaseTransientBottomBar.f357274x;
        this.f357333a.f357285i.setTranslationY(iIntValue);
    }
}
