package com.getkeepsafe.taptargetview;

import android.animation.ValueAnimator;

/* compiled from: FloatValueAnimatorBuilder.java */
/* loaded from: classes4.dex */
class b implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).floatValue();
        throw null;
    }
}
