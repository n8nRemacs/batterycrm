package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import j.N;
import j.P;

/* compiled from: ScaleProvider.java */
/* loaded from: classes6.dex */
public final class w implements E {

    /* renamed from: a, reason: collision with root package name */
    public float f357990a = 0.8f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f357991b = true;

    public static ObjectAnimator c(View view, float f12, float f13) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f12, scaleX * f13), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f12 * scaleY, f13 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new v(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.E
    @P
    public final Animator a(@N View view) {
        if (this.f357991b) {
            return c(view, 1.0f, 1.1f);
        }
        return null;
    }

    @Override // com.google.android.material.transition.E
    @P
    public final Animator b(@N View view) {
        return c(view, this.f357990a, 1.0f);
    }
}
