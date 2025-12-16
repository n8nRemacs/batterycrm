package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f357446b;

    public /* synthetic */ c(q qVar, int i12) {
        this.f357445a = i12;
        this.f357446b = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f357445a) {
            case 0:
                g gVar = (g) this.f357446b;
                gVar.getClass();
                gVar.f357517d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                g gVar2 = (g) this.f357446b;
                gVar2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = gVar2.f357517d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            default:
                n nVar = (n) this.f357446b;
                nVar.getClass();
                nVar.f357517d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
