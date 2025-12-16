package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357332b;

    public f(BaseTransientBottomBar baseTransientBottomBar, int i12) {
        this.f357332b = baseTransientBottomBar;
        this.f357331a = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f357332b.d(this.f357331a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f357332b;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.f357286j;
        snackbarContentLayout.f357321b.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.f357321b.animate().alpha(0.0f);
        long j12 = baseTransientBottomBar.f357278b;
        ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j12);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f357323d;
        long j13 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j13).start();
        if (snackbarContentLayout.f357322c.getVisibility() == 0) {
            snackbarContentLayout.f357322c.setAlpha(1.0f);
            snackbarContentLayout.f357322c.animate().alpha(0.0f).setDuration(j12).setInterpolator(timeInterpolator).setStartDelay(j13).start();
        }
    }
}
