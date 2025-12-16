package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357329a;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f357329a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f357329a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f357329a;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.f357286j;
        int i12 = baseTransientBottomBar.f357279c;
        int i13 = baseTransientBottomBar.f357277a;
        int i14 = i12 - i13;
        snackbarContentLayout.f357321b.setAlpha(0.0f);
        long j12 = i13;
        ViewPropertyAnimator duration = snackbarContentLayout.f357321b.animate().alpha(1.0f).setDuration(j12);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f357323d;
        long j13 = i14;
        duration.setInterpolator(timeInterpolator).setStartDelay(j13).start();
        if (snackbarContentLayout.f357322c.getVisibility() == 0) {
            snackbarContentLayout.f357322c.setAlpha(0.0f);
            snackbarContentLayout.f357322c.animate().alpha(1.0f).setDuration(j12).setInterpolator(timeInterpolator).setStartDelay(j13).start();
        }
    }
}
