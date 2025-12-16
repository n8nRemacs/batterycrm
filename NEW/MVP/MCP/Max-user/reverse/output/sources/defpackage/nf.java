package defpackage;

import android.animation.ValueAnimator;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final /* synthetic */ class nf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nf(Object obj, Object obj2, float f, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                OneMeButton oneMeButton = (OneMeButton) this.c;
                OneMeButton oneMeButton2 = (OneMeButton) this.d;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oneMeButton.setTranslationY(fFloatValue);
                oneMeButton2.setTranslationY((-this.b) + fFloatValue);
                break;
            case 1:
                o6c.d((o6c) this.c, (sm6) this.d, this.b, valueAnimator);
                break;
            default:
                fvf fvfVar = (fvf) this.c;
                sm6 sm6Var = (sm6) this.d;
                fvfVar.m().offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - fvfVar.h());
                sm6Var.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(this.b));
                break;
        }
    }
}
