package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class utc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float o;

    public /* synthetic */ utc(View view, float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.X = view;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.o = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ytc.c((ytc) this.X, this.b, this.c, this.d, this.o, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                b6h b6hVar = (b6h) this.X;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = this.c;
                float f2 = this.b;
                b6hVar.G0 = utb.i(f, f2, animatedFraction, f2);
                float f3 = this.o;
                float f4 = this.d;
                float fI = utb.i(f3, f4, animatedFraction, f4);
                b6hVar.F0 = fI;
                b6hVar.u0.setStrokeWidth(fI);
                b6hVar.d.setStrokeWidth(b6hVar.F0);
                b6hVar.invalidate();
                break;
        }
    }
}
