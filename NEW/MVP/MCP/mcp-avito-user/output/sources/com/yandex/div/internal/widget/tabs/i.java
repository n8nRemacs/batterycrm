package com.yandex.div.internal.widget.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;

/* compiled from: BaseIndicatorTabLayout.java */
/* loaded from: classes7.dex */
class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f370493a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseIndicatorTabLayout.d f370494b;

    public i(BaseIndicatorTabLayout.d dVar) {
        this.f370494b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f370493a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f370493a) {
            return;
        }
        BaseIndicatorTabLayout.d dVar = this.f370494b;
        dVar.f370424e = dVar.f370440u;
        dVar.f370425f = 0.0f;
    }
}
