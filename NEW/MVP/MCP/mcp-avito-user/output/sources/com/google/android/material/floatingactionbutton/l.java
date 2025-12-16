package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes6.dex */
class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f356630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f356631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f356632c;

    public l(m mVar, boolean z12, j jVar) {
        this.f356632c = mVar;
        this.f356630a = z12;
        this.f356631b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m mVar = this.f356632c;
        mVar.f356665s = 0;
        mVar.f356659m = null;
        j jVar = this.f356631b;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        m mVar = this.f356632c;
        mVar.f356669w.a(0, this.f356630a);
        mVar.f356665s = 2;
        mVar.f356659m = animator;
    }
}
