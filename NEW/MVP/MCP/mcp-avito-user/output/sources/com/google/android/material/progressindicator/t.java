package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.b;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes6.dex */
class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f356970a;

    public t(u uVar) {
        this.f356970a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        u uVar = this.f356970a;
        uVar.a();
        b.a aVar = uVar.f356981k;
        if (aVar != null) {
            aVar.b(uVar.f356956a);
        }
    }
}
