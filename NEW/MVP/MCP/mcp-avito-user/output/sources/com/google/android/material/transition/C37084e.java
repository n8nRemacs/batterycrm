package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FadeProvider.java */
/* renamed from: com.google.android.material.transition.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37084e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357760b;

    public C37084e(View view, float f12) {
        this.f357759a = view;
        this.f357760b = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f357759a.setAlpha(this.f357760b);
    }
}
