package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FadeThroughProvider.java */
/* renamed from: com.google.android.material.transition.platform.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37092h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357874b;

    public C37092h(View view, float f12) {
        this.f357873a = view;
        this.f357874b = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f357873a.setAlpha(this.f357874b);
    }
}
