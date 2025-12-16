package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class p5f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm7 b;

    public /* synthetic */ p5f(lm7 lm7Var, int i) {
        this.a = i;
        this.b = lm7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j5f j5fVar = (j5f) this.b;
                j5fVar.G0.setTextColor(v4j.c(j5fVar.G0.getCurrentTextColor(), fFloatValue));
                break;
            default:
                ((j5f) this.b).G0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
