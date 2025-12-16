package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.b;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes6.dex */
class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f356918a;

    public f(g gVar) {
        this.f356918a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        g gVar = this.f356918a;
        gVar.a();
        b.a aVar = gVar.f356931k;
        if (aVar != null) {
            aVar.b(gVar.f356956a);
        }
    }
}
