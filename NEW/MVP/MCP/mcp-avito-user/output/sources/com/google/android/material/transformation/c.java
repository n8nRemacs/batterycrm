package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.g;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes6.dex */
class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f357740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Drawable f357741b;

    public c(g gVar, Drawable drawable) {
        this.f357740a = gVar;
        this.f357741b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f357740a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f357740a.setCircularRevealOverlayDrawable(this.f357741b);
    }
}
