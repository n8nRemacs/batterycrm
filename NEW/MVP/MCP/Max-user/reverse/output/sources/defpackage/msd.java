package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import one.me.android.root.RootController;

/* loaded from: classes.dex */
public final /* synthetic */ class msd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ msd(View view, float f) {
        this.a = 0;
        this.c = f;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        float fFloatValue = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                View view = (View) obj;
                yy7[] yy7VarArr = RootController.s0;
                Object animatedValue = valueAnimator.getAnimatedValue("topMarginProp");
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f != null) {
                    fFloatValue = f.floatValue();
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = (int) fFloatValue;
                view.setLayoutParams(marginLayoutParams);
                break;
            case 1:
                View view2 = (View) obj;
                view2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (fFloatValue == 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (valueAnimator.getAnimatedFraction() >= fFloatValue) {
                    view2.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            default:
                ea4 ea4Var = (ea4) obj;
                float fAbs = Math.abs((ea4Var.p - fFloatValue) - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ea4Var.p += fAbs;
                Matrix matrix = ea4Var.k;
                RectF rectF = ea4Var.g;
                matrix.postRotate(fAbs, rectF.centerX(), rectF.centerY());
                ea4Var.j.set(matrix);
                w7i w7iVar = ea4Var.b;
                if (w7iVar != null) {
                    w7iVar.a(matrix);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ msd(Object obj, float f, int i) {
        this.a = i;
        this.b = obj;
        this.c = f;
    }
}
