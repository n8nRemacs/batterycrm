package com.google.android.material.transition.platform;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FadeProvider.java */
/* renamed from: com.google.android.material.transition.platform.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37088d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f357863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f357864d;

    public C37088d(View view, float f12, float f13, float f14) {
        this.f357861a = view;
        this.f357862b = f12;
        this.f357863c = f13;
        this.f357864d = f14;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f357861a.setAlpha(H.d(this.f357862b, this.f357863c, 0.0f, this.f357864d, fFloatValue, false));
    }
}
