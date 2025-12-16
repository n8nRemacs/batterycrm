package com.avito.android.serp.adapter.slider.sales_slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SalesSlider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/g;", "Landroid/animation/AnimatorListenerAdapter;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f272308a;

    public g(Y41.a<G0> aVar) {
        this.f272308a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        super.onAnimationEnd(animator);
        this.f272308a.invoke();
    }
}
