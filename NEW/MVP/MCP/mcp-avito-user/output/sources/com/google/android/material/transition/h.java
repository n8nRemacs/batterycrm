package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FadeThroughProvider.java */
/* loaded from: classes6.dex */
class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357768b;

    public h(View view, float f12) {
        this.f357767a = view;
        this.f357768b = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f357767a.setAlpha(this.f357768b);
    }
}
