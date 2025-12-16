package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes6.dex */
class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f356961a;

    public q(r rVar) {
        this.f356961a = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        r rVar = this.f356961a;
        rVar.f356966g = (rVar.f356966g + 1) % rVar.f356965f.f356909c.length;
        rVar.f356967h = true;
    }
}
