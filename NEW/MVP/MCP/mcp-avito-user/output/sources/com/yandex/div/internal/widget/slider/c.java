package com.yandex.div.internal.widget.slider;

import android.animation.ValueAnimator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f370343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f370344b;

    public /* synthetic */ c(d dVar, int i12) {
        this.f370343a = i12;
        this.f370344b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d dVar = this.f370344b;
        switch (this.f370343a) {
            case 0:
                int i12 = d.f370345A;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                dVar.f370361q = ((Float) animatedValue).floatValue();
                dVar.postInvalidateOnAnimation();
                return;
            default:
                int i13 = d.f370345A;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                dVar.f370364t = (Float) animatedValue2;
                dVar.postInvalidateOnAnimation();
                return;
        }
    }
}
