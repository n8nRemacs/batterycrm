package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import j.InterfaceC42156l;

/* loaded from: classes8.dex */
public final class r81<T extends TextView> implements x9<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ArgbEvaluator f389442a = new ArgbEvaluator();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private ValueAnimator f389443b;

    /* renamed from: c, reason: collision with root package name */
    private final int f389444c;

    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final TextView f389445a;

        public a(@j.N TextView textView) {
            this.f389445a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@j.N ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.f389445a.setTextColor(((Integer) animatedValue).intValue());
            }
        }
    }

    public r81(@InterfaceC42156l int i12) {
        this.f389444c = i12;
    }

    @Override // com.yandex.mobile.ads.impl.x9
    public final void a(@j.N View view) {
        TextView textView = (TextView) view;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f389442a, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f389444c));
        this.f389443b = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(new a(textView));
        this.f389443b.setDuration(500);
        this.f389443b.start();
    }

    @Override // com.yandex.mobile.ads.impl.x9
    public final void cancel() {
        ValueAnimator valueAnimator = this.f389443b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f389443b.cancel();
        }
    }
}
