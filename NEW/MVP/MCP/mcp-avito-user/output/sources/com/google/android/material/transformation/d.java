package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.g;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes6.dex */
class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f357742a;

    public d(g gVar) {
        this.f357742a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g gVar = this.f357742a;
        g.e revealInfo = gVar.getRevealInfo();
        revealInfo.f356317c = Float.MAX_VALUE;
        gVar.setRevealInfo(revealInfo);
    }
}
