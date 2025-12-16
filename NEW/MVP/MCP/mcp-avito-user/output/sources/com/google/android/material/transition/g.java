package com.google.android.material.transition;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FadeThroughProvider.java */
/* loaded from: classes6.dex */
class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f357764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f357765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f357766e;

    public g(View view, float f12, float f13, float f14, float f15) {
        this.f357762a = view;
        this.f357763b = f12;
        this.f357764c = f13;
        this.f357765d = f14;
        this.f357766e = f15;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f357762a.setAlpha(D.d(this.f357763b, this.f357764c, this.f357765d, this.f357766e, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
