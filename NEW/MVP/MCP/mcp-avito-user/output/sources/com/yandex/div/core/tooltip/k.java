package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: DivTooltipAnimation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/tooltip/k;", "Landroid/transition/Visibility;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class k extends Visibility {

    /* renamed from: b, reason: collision with root package name */
    public final float f367774b;

    public k(float f12) {
        this.f367774b = f12;
    }

    @Override // android.transition.Visibility
    @Y61.k
    public final Animator onAppear(@Y61.l ViewGroup viewGroup, @Y61.k View view, @Y61.k TransitionValues transitionValues, @Y61.k TransitionValues transitionValues2) {
        Property property = View.SCALE_X;
        float scaleX = view.getScaleX();
        float f12 = this.f367774b;
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, f12, scaleX), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f12, view.getScaleY()));
    }

    @Override // android.transition.Visibility
    @Y61.k
    public final Animator onDisappear(@Y61.l ViewGroup viewGroup, @Y61.k View view, @Y61.k TransitionValues transitionValues, @Y61.k TransitionValues transitionValues2) {
        Property property = View.SCALE_X;
        float scaleX = view.getScaleX();
        float f12 = this.f367774b;
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, scaleX, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), f12));
    }
}
