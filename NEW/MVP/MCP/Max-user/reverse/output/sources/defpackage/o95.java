package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import one.me.image.crop.view.ImageCropView;

/* loaded from: classes2.dex */
public final /* synthetic */ class o95 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ o95(View view, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.d = obj2;
        this.o = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.o;
        Object obj2 = this.d;
        Object obj3 = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                r95 r95Var = (r95) view;
                float[] fArr = (float[]) obj3;
                float[] fArr2 = (float[]) obj2;
                float[] fArr3 = (float[]) obj;
                r95Var.getClass();
                Float f = (Float) valueAnimator.getAnimatedValue();
                for (int i2 = 0; i2 < 9; i2++) {
                    fArr[i2] = (f.floatValue() * fArr3[i2]) + ((1.0f - f.floatValue()) * fArr2[i2]);
                }
                r95Var.d.setValues(fArr);
                r95Var.invalidate();
                break;
            default:
                tkb tkbVar = (tkb) view;
                RectF rectF = (RectF) obj3;
                RectF rectF2 = (RectF) obj2;
                RectF rectF3 = (RectF) obj;
                Float f2 = (Float) valueAnimator.getAnimatedValue();
                RectF rectF4 = tkbVar.a;
                rectF.set(rectF4);
                float f3 = rectF2.left;
                rectF4.left = (f2.floatValue() * (rectF3.left - f3)) + f3;
                float f4 = rectF2.top;
                rectF4.top = (f2.floatValue() * (rectF3.top - f4)) + f4;
                float f5 = rectF2.right;
                rectF4.right = (f2.floatValue() * (rectF3.right - f5)) + f5;
                float f6 = rectF2.bottom;
                rectF4.bottom = (f2.floatValue() * (rectF3.bottom - f6)) + f6;
                tkbVar.b();
                ukb ukbVar = tkbVar.L0;
                if (ukbVar != null) {
                    rr6 rr6Var = ((ImageCropView) ukbVar).a;
                    Matrix matrix = rr6Var.C0;
                    matrix.reset();
                    float currentScale = 1.0f / rr6Var.getCurrentScale();
                    matrix.postScale(currentScale, currentScale);
                    RectF rectF5 = rr6Var.D0;
                    rectF5.set(rectF);
                    matrix.mapRect(rectF5);
                    Matrix matrix2 = rr6Var.t0;
                    float fC = mei.c(matrix2, 2);
                    float[] fArr4 = mei.a;
                    matrix2.getValues(fArr4);
                    float[] fArr5 = {fC - rectF.left, fArr4[5] - rectF.top};
                    matrix.mapPoints(fArr5);
                    float fMax = Math.max(rectF4.width() / rectF5.width(), rectF4.height() / rectF5.height()) / rr6Var.getCurrentScale();
                    matrix2.postScale(fMax, fMax, rectF4.centerX(), rectF4.centerY());
                    matrix2.getValues(fArr4);
                    float f7 = -fArr4[2];
                    matrix2.getValues(fArr4);
                    matrix2.postTranslate(f7, -fArr4[5]);
                    matrix.reset();
                    float currentScale2 = rr6Var.getCurrentScale();
                    matrix.postScale(currentScale2, currentScale2);
                    matrix.mapPoints(fArr5);
                    matrix2.postTranslate(rectF4.left + fArr5[0], rectF4.top + fArr5[1]);
                    rr6Var.setImageMatrix(matrix2);
                    rr6Var.B0.set(rectF4);
                    if (rr6Var.getDrawable() != null) {
                        rr6Var.h(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
                    }
                    rr6Var.postInvalidateOnAnimation();
                }
                tkbVar.postInvalidateOnAnimation();
                break;
        }
    }
}
