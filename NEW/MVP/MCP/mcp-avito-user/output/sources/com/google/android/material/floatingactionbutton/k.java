package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes6.dex */
class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f356626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f356627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f356628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f356629d;

    public k(m mVar, boolean z12, j jVar) {
        this.f356629d = mVar;
        this.f356627b = z12;
        this.f356628c = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f356626a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m mVar = this.f356629d;
        mVar.f356665s = 0;
        mVar.f356659m = null;
        if (this.f356626a) {
            return;
        }
        boolean z12 = this.f356627b;
        mVar.f356669w.a(z12 ? 8 : 4, z12);
        j jVar = this.f356628c;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        m mVar = this.f356629d;
        mVar.f356669w.a(0, this.f356627b);
        mVar.f356665s = 1;
        mVar.f356659m = animator;
        this.f356626a = false;
    }
}
