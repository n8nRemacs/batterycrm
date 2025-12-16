package defpackage;

import android.animation.ValueAnimator;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class v52 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v52(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x52 x52Var = (x52) this.d;
                float f = x52Var.d;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                Float[] fArr = x52Var.o;
                int i = this.b;
                boolean z = fArr[i] != null;
                if (z) {
                    fArr[i] = Float.valueOf(((f - 1.0f) * animatedFraction) + 1.0f);
                }
                int i2 = this.c;
                boolean z2 = fArr[i2] != null;
                if (z2) {
                    fArr[i2] = Float.valueOf(f - ((f - 1.0f) * animatedFraction));
                }
                if (z || z2) {
                    x52Var.a.invoke();
                    break;
                }
            default:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.d;
                Integer numEvaluate = mediaBarWidget.X.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(this.b), Integer.valueOf(this.c));
                mediaBarWidget.L0.setAlpha(numEvaluate.intValue());
                mediaBarWidget.B0.setAlpha(numEvaluate.intValue());
                break;
        }
    }
}
