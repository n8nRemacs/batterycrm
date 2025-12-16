package com.google.android.material.transition;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FadeProvider.java */
/* renamed from: com.google.android.material.transition.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37083d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f357757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f357758d;

    public C37083d(View view, float f12, float f13, float f14) {
        this.f357755a = view;
        this.f357756b = f12;
        this.f357757c = f13;
        this.f357758d = f14;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f357755a.setAlpha(D.d(this.f357756b, this.f357757c, 0.0f, this.f357758d, fFloatValue, false));
    }
}
