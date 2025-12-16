package com.google.android.material.internal;

import android.animation.ValueAnimator;
import androidx.annotation.RestrictTo;

/* compiled from: FadeThroughUpdateListener.java */
@RestrictTo
/* renamed from: com.google.android.material.internal.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37071l implements ValueAnimator.AnimatorUpdateListener {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@j.N ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (fFloatValue <= 0.5f) {
            (objArr3 == true ? 1 : 0)[0] = 1.0f - (fFloatValue * 2.0f);
            (objArr2 == true ? 1 : 0)[1] = 0;
            throw null;
        }
        objArr[0] = 0;
        (objArr4 == true ? 1 : 0)[1] = (fFloatValue * 2.0f) - 1.0f;
        throw null;
    }
}
