package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* compiled from: BottomAppBar.java */
/* loaded from: classes6.dex */
class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f355950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f355951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f355952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f355953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f355954e;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i12, boolean z12) {
        this.f355954e = bottomAppBar;
        this.f355951b = actionMenuView;
        this.f355952c = i12;
        this.f355953d = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f355950a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f355950a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f355954e;
        bottomAppBar.getClass();
        bottomAppBar.H(this.f355951b, this.f355952c, this.f355953d, false);
    }
}
