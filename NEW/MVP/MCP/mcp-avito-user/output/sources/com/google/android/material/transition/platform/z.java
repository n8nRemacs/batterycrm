package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: ScaleProvider.java */
/* loaded from: classes6.dex */
class z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f357973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f357974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f357975c;

    public z(View view, float f12, float f13) {
        this.f357973a = view;
        this.f357974b = f12;
        this.f357975c = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f12 = this.f357974b;
        View view = this.f357973a;
        view.setScaleX(f12);
        view.setScaleY(this.f357975c);
    }
}
