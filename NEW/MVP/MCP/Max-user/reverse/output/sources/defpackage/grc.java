package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class grc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hrc b;

    public /* synthetic */ grc(hrc hrcVar, int i) {
        this.a = i;
        this.b = hrcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hrc hrcVar = this.b;
                hrcVar.b = fFloatValue;
                hrcVar.invalidate();
                break;
            default:
                hrc hrcVar2 = this.b;
                hrcVar2.a.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                hrcVar2.invalidate();
                break;
        }
    }
}
