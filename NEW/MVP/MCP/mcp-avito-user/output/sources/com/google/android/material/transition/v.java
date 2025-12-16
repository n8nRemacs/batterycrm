package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: ScaleProvider.java */
/* loaded from: classes6.dex */
class v extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f357989c;

    public v(View view, float f12, float f13) {
        this.f357987a = view;
        this.f357988b = f12;
        this.f357989c = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f12 = this.f357988b;
        View view = this.f357987a;
        view.setScaleX(f12);
        view.setScaleY(this.f357989c);
    }
}
