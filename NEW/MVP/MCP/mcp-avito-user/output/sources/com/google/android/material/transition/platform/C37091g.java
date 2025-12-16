package com.google.android.material.transition.platform;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FadeThroughProvider.java */
/* renamed from: com.google.android.material.transition.platform.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37091g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f357870c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f357871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f357872e;

    public C37091g(View view, float f12, float f13, float f14, float f15) {
        this.f357868a = view;
        this.f357869b = f12;
        this.f357870c = f13;
        this.f357871d = f14;
        this.f357872e = f15;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f357868a.setAlpha(H.d(this.f357869b, this.f357870c, this.f357871d, this.f357872e, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
