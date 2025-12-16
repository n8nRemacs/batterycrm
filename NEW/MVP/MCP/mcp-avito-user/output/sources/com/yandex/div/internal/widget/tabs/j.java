package com.yandex.div.internal.widget.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;

/* compiled from: BaseIndicatorTabLayout.java */
/* loaded from: classes7.dex */
class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f370495a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseIndicatorTabLayout.d f370496b;

    public j(BaseIndicatorTabLayout.d dVar) {
        this.f370496b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f370495a = true;
        this.f370496b.f370439t = 1.0f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f370495a) {
            return;
        }
        BaseIndicatorTabLayout.d dVar = this.f370496b;
        dVar.f370424e = dVar.f370440u;
        dVar.f370425f = 0.0f;
    }
}
