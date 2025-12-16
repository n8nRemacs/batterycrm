package com.avito.android.lib.design.zoom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import uW0.C48986a;

/* compiled from: AnimatedZoomableController.java */
/* loaded from: classes14.dex */
class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f181309a;

    public c(d dVar) {
        this.f181309a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        d dVar = this.f181309a;
        dVar.getClass();
        C48986a.d(d.class, "setTransformAnimated: animation cancelled");
        dVar.f181302l = false;
        dVar.f181312a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f181309a;
        dVar.getClass();
        C48986a.d(d.class, "setTransformAnimated: animation finished");
        dVar.f181302l = false;
        dVar.f181312a.b();
    }
}
