package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ExpandableTransformationBehavior.java */
/* loaded from: classes6.dex */
class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f357738a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f357738a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f357738a.f357721b = null;
    }
}
