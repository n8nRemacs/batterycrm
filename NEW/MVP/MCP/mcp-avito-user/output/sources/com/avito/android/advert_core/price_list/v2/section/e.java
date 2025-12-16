package com.avito.android.advert_core.price_list.v2.section;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import kotlin.Metadata;

/* compiled from: AdvertPriceListSectionItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/v2/section/e;", "Landroid/animation/AnimatorListenerAdapter;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f84167a;

    public e(ValueAnimator valueAnimator) {
        this.f84167a = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        super.onAnimationEnd(animator);
        ValueAnimator valueAnimator = this.f84167a;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeListener(this);
    }
}
