package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FadeProvider.java */
/* renamed from: com.google.android.material.transition.platform.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37089e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357866b;

    public C37089e(View view, float f12) {
        this.f357865a = view;
        this.f357866b = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f357865a.setAlpha(this.f357866b);
    }
}
