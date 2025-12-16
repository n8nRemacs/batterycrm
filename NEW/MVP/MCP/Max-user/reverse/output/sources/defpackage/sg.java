package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class sg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sg(gg ggVar, vs1 vs1Var) {
        this.a = 2;
        this.c = ggVar;
        this.b = vs1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lg lgVar = (lg) obj;
                Drawable background = ((vs1) obj2).getBackground();
                if (background != null) {
                    background.setAlpha(lgVar.a);
                    return;
                }
                return;
            case 1:
                in inVar = (in) obj2;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((wq8) obj).j(fFloatValue);
                Drawable drawable = inVar.I0;
                if (drawable instanceof wq8) {
                    ((wq8) drawable).j(fFloatValue);
                }
                Iterator it = inVar.E0.iterator();
                if (it.hasNext()) {
                    throw ctd.h(it);
                }
                return;
            case 2:
                vs1.C((gg) obj, (vs1) obj2);
                return;
            case 3:
                wb3 wb3Var = (wb3) obj2;
                TransitionValues transitionValues = (TransitionValues) obj;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yni.c(wb3Var.a, transitionValues.view);
                if (wb3Var.b) {
                    double d = fFloatValue2;
                    if (d <= 0.5d || transitionValues.view.getClipBounds() == null) {
                        return;
                    }
                    Rect clipBounds = transitionValues.view.getClipBounds();
                    int i2 = clipBounds.top;
                    if (i2 != 0) {
                        clipBounds.top = i2 - ((int) (((d - 0.5d) * transitionValues.view.getClipBounds().top) / 0.5d));
                    }
                    if (clipBounds.bottom < transitionValues.view.getHeight()) {
                        clipBounds.bottom += (int) (((d - 0.5d) * (transitionValues.view.getHeight() - clipBounds.bottom)) / 0.5d);
                    }
                    transitionValues.view.setClipBounds(clipBounds);
                    return;
                }
                return;
            case 4:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                yy7[] yy7VarArr = FakeInAppReviewBottomSheet.L0;
                bbd bbdVar = fakeInAppReviewBottomSheet.C0;
                yy7[] yy7VarArr2 = FakeInAppReviewBottomSheet.L0;
                ((ConstraintLayout) bbdVar.D(fakeInAppReviewBottomSheet, yy7VarArr2[0])).setAlpha(1.0f - valueAnimator2.getAnimatedFraction());
                ((FrameLayout) fakeInAppReviewBottomSheet.D0.D(fakeInAppReviewBottomSheet, yy7VarArr2[1])).setAlpha(valueAnimator2.getAnimatedFraction());
                return;
            case 5:
                yy7[] yy7VarArr3 = MediaKeyboardWidget.B0;
                float fFloatValue3 = ((Float) ((ValueAnimator) obj2).getAnimatedValue()).floatValue();
                for (View view : (View[]) obj) {
                    view.setScaleX(fFloatValue3);
                    view.setScaleY(fFloatValue3);
                }
                return;
            case 6:
                hrc hrcVar = (hrc) obj2;
                RectF rectF = (RectF) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                RectF rectF2 = hrcVar.d;
                RectF rectF3 = hrcVar.t0;
                float f = rectF3.left;
                float fI = utb.i(rectF.left, f, animatedFraction, f);
                float f2 = rectF3.top;
                float fI2 = utb.i(rectF.top, f2, animatedFraction, f2);
                float f3 = rectF3.right;
                float fI3 = utb.i(rectF.right, f3, animatedFraction, f3);
                float f4 = rectF3.bottom;
                rectF2.set(fI, fI2, fI3, utb.i(rectF.bottom, f4, animatedFraction, f4));
                hrcVar.invalidate();
                return;
            default:
                ((View) ((l3i) ((nud) obj2).b).d.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ sg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
