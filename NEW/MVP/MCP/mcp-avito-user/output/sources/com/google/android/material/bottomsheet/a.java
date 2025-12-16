package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import j.N;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes6.dex */
class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f356036a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f356036a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        com.google.android.material.shape.k kVar = this.f356036a.f356003i;
        if (kVar != null) {
            kVar.o(fFloatValue);
        }
    }
}
