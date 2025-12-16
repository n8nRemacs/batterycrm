package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes6.dex */
class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f356969a;

    public s(u uVar) {
        this.f356969a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        u uVar = this.f356969a;
        uVar.f356978h = (uVar.f356978h + 1) % uVar.f356977g.f356909c.length;
        uVar.f356979i = true;
    }
}
