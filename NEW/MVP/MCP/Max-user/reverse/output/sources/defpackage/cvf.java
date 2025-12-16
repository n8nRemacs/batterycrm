package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class cvf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dvf b;

    public /* synthetic */ cvf(dvf dvfVar, int i) {
        this.a = i;
        this.b = dvfVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
