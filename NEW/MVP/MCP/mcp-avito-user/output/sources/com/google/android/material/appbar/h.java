package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import j.N;

/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes6.dex */
class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f355821a;

    public h(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f355821a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
        this.f355821a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
