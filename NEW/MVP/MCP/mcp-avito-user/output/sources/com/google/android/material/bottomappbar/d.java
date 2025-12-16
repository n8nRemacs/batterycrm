package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BottomAppBar.java */
/* loaded from: classes6.dex */
class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f355949a;

    public d(BottomAppBar bottomAppBar) {
        this.f355949a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i12 = BottomAppBar.f355921j0;
        BottomAppBar bottomAppBar = this.f355949a;
        bottomAppBar.getClass();
        bottomAppBar.f355925a0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i12 = BottomAppBar.f355921j0;
        this.f355949a.getClass();
    }
}
