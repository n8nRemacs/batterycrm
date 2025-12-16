package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class y5h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6h b;

    public /* synthetic */ y5h(b6h b6hVar, int i) {
        this.a = i;
        this.b = b6hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.setProgressForced(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6h b6hVar = this.b;
                b6hVar.A0 = fFloatValue;
                b6hVar.invalidate();
                break;
        }
    }
}
