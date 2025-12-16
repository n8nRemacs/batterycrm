package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class mkh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rkh b;

    public /* synthetic */ mkh(rkh rkhVar, int i) {
        this.a = i;
        this.b = rkhVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.u0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                this.b.s0.setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                this.b.u0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.b.s0.setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
