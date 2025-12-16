package com.avito.android.serp.adapter.slider.sales_slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;

/* compiled from: SalesSlider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/f;", "Landroid/animation/AnimatorListenerAdapter;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SalesSlider f272307a;

    public f(SalesSlider salesSlider) {
        this.f272307a = salesSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        super.onAnimationEnd(animator);
        SalesSlider salesSlider = this.f272307a;
        if (salesSlider.f272293k) {
            return;
        }
        o oVar = salesSlider.f272291i;
        if (oVar != null) {
            oVar.OC();
        }
        salesSlider.f272293k = true;
    }
}
