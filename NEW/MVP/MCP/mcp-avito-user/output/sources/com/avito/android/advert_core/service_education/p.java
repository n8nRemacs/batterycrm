package com.avito.android.advert_core.service_education;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertServiceEducationView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/service_education/p;", "Landroid/animation/AnimatorListenerAdapter;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f84337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f84338b;

    public p(View view, ValueAnimator valueAnimator) {
        this.f84337a = view;
        this.f84338b = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        super.onAnimationEnd(animator);
        this.f84337a.setVisibility(0);
        ValueAnimator valueAnimator = this.f84338b;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeListener(this);
    }
}
