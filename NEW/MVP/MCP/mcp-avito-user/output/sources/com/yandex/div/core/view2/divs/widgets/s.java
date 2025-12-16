package com.yandex.div.core.view2.divs.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DivStateLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/s;", "Landroid/animation/AnimatorListenerAdapter;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f368993a;

    public s(t tVar) {
        this.f368993a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        Y41.a<G0> swipeOutCallback = this.f368993a.getSwipeOutCallback();
        if (swipeOutCallback == null) {
            return;
        }
        swipeOutCallback.invoke();
    }
}
