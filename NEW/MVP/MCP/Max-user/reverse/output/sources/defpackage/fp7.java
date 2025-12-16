package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Arrays;
import one.me.image.crop.view.ImageCropView;

/* loaded from: classes2.dex */
public abstract class fp7 extends ahg {
    public final RectF B0;
    public final Matrix C0;
    public final RectF D0;
    public float E0;
    public float F0;
    public da4 G0;
    public ca4 H0;
    public dp7 I0;
    public ep7 J0;
    public float K0;
    public float L0;

    public fp7(Context context) {
        super(context);
        this.B0 = new RectF();
        this.C0 = new Matrix();
        this.D0 = new RectF();
        this.F0 = 10.0f;
        this.G0 = null;
        this.J0 = null;
    }

    private void setupInitialCropState(da4 da4Var) {
        float[] fArr = da4Var.c;
        Matrix matrix = this.t0;
        matrix.setValues(fArr);
        RectF rectF = da4Var.a;
        Matrix matrix2 = this.C0;
        matrix.invert(matrix2);
        RectF rectF2 = this.D0;
        RectF rectF3 = this.B0;
        rectF2.set(rectF3);
        matrix2.mapRect(rectF2);
        float fMax = Math.max(rectF2.width() / rectF.width(), rectF2.height() / rectF.height());
        matrix.postScale(fMax, fMax, 0.0f, 0.0f);
        matrix.postTranslate(-mei.c(matrix, 2), -mei.c(matrix, 5));
        matrix.mapRect(rectF);
        matrix.postTranslate(rectF3.left - rectF.left, rectF3.top - rectF.top);
        setImageMatrix(matrix);
    }

    @Override // defpackage.ahg
    public final void a() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.u0 = w7j.b(rectF);
            this.v0 = new float[]{rectF.centerX(), rectF.centerY()};
            this.x0 = true;
        }
        Drawable drawable2 = getDrawable();
        if (drawable2 == null) {
            return;
        }
        float intrinsicWidth2 = drawable2.getIntrinsicWidth();
        float intrinsicHeight2 = drawable2.getIntrinsicHeight();
        if (this.E0 == 0.0f) {
            this.E0 = intrinsicWidth2 / intrinsicHeight2;
        }
        da4 da4Var = this.G0;
        if (da4Var != null) {
            this.E0 = da4Var.b;
        }
        ca4 ca4Var = this.H0;
        if (ca4Var != null) {
            ((ImageCropView) ca4Var).b.setTargetAspectRatio(this.E0);
        }
        h(intrinsicWidth2, intrinsicHeight2);
        Matrix initialMatrix = getInitialMatrix();
        Matrix matrix = this.t0;
        matrix.set(initialMatrix);
        setImageMatrix(matrix);
        da4 da4Var2 = this.G0;
        if (da4Var2 != null) {
            setupInitialCropState(da4Var2);
            this.G0 = null;
        }
    }

    public da4 getCropState() {
        Matrix matrix = this.t0;
        Matrix matrix2 = this.C0;
        matrix.invert(matrix2);
        RectF rectF = this.D0;
        RectF rectF2 = this.B0;
        rectF.set(rectF2);
        float[] fArr = {rectF2.centerX(), rectF2.centerY()};
        matrix2.mapRect(rectF);
        matrix2.mapPoints(fArr);
        float[] fArr2 = new float[9];
        matrix.getValues(fArr2);
        return new da4(rectF, rectF2.width() / rectF2.height(), fArr2);
    }

    public Matrix getInitialMatrix() {
        if (getDrawable() == null) {
            return new Matrix();
        }
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.B0;
        float fWidth = (measuredWidth - rectF.width()) / 2.0f;
        float measuredHeight = (getMeasuredHeight() - rectF.height()) / 2.0f;
        Matrix matrix = new Matrix();
        float f = this.L0;
        matrix.postScale(f, f);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        RectF rectF2 = this.D0;
        rectF2.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        matrix.mapRect(rectF2);
        matrix.postTranslate(fWidth, measuredHeight);
        return matrix;
    }

    public float getMaxScale() {
        return this.K0;
    }

    public float getMinScale() {
        return this.L0;
    }

    public float getTargetAspectRatio() {
        return this.E0;
    }

    public final void h(float f, float f2) {
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        Matrix matrix = this.C0;
        matrix.reset();
        matrix.setRotate(getCurrentAngle());
        float[] fArrB = w7j.b(rectF);
        matrix.mapPoints(fArrB);
        RectF rectFC = w7j.c(fArrB);
        RectF rectF2 = this.B0;
        float fMax = Math.max(Math.abs(rectF2.width() / rectFC.width()), Math.abs(rectF2.height() / rectFC.height()));
        this.L0 = fMax;
        this.K0 = fMax * this.F0;
    }

    public final boolean i(float[] fArr) {
        Matrix matrix = this.C0;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(fArrCopyOf);
        float[] fArrB = w7j.b(this.B0);
        matrix.mapPoints(fArrB);
        return w7j.c(fArrCopyOf).contains(w7j.c(fArrB));
    }

    public final void j(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            float currentScale = f / getCurrentScale();
            if (currentScale != 0.0f) {
                Matrix matrix = this.t0;
                matrix.postScale(currentScale, currentScale, f2, f3);
                setImageMatrix(matrix);
            }
        }
    }

    public void setCropBoundsChangeListener(ca4 ca4Var) {
        this.H0 = ca4Var;
    }

    public void setCropRect(RectF rectF) {
        this.E0 = rectF.width() / rectF.height();
        this.B0.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        if (getDrawable() == null) {
            return;
        }
        h(r5.getIntrinsicWidth(), r5.getIntrinsicHeight());
    }

    public void setImageToWrapCropBounds(boolean z) {
        boolean z2;
        float f;
        float f2;
        float fMax;
        if (this.x0) {
            float[] fArr = this.d;
            if (i(fArr)) {
                return;
            }
            float[] fArr2 = this.o;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float currentScale = getCurrentScale();
            RectF rectF = this.B0;
            float fCenterX = rectF.centerX() - f3;
            float fCenterY = rectF.centerY() - f4;
            Matrix matrix = this.C0;
            matrix.reset();
            matrix.setTranslate(fCenterX, fCenterY);
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            matrix.mapPoints(fArrCopyOf);
            boolean zI = i(fArrCopyOf);
            if (zI) {
                matrix.reset();
                matrix.setRotate(-getCurrentAngle());
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, fArr.length);
                float[] fArrB = w7j.b(rectF);
                matrix.mapPoints(fArrCopyOf2);
                matrix.mapPoints(fArrB);
                RectF rectFC = w7j.c(fArrCopyOf2);
                RectF rectFC2 = w7j.c(fArrB);
                float f5 = rectFC.left - rectFC2.left;
                float f6 = rectFC.top - rectFC2.top;
                float f7 = rectFC.right - rectFC2.right;
                float f8 = rectFC.bottom - rectFC2.bottom;
                if (f5 <= 0.0f) {
                    f5 = 0.0f;
                }
                if (f6 <= 0.0f) {
                    f6 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f7 = 0.0f;
                }
                if (f8 >= 0.0f) {
                    f8 = 0.0f;
                }
                float[] fArr3 = {f5, f6, f7, f8};
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapPoints(fArr3);
                float f9 = -(fArr3[0] + fArr3[2]);
                fCenterY = -(fArr3[1] + fArr3[3]);
                fCenterX = f9;
                f2 = f3;
                z2 = zI;
                fMax = 0.0f;
                f = 0.0f;
            } else {
                RectF rectF2 = new RectF(rectF);
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapRect(rectF2);
                z2 = zI;
                f = 0.0f;
                float fSqrt = (float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d));
                double dPow = Math.pow(fArr[2] - fArr[4], 2.0d);
                float f10 = fArr[3] - fArr[5];
                f2 = f3;
                float[] fArr4 = {fSqrt, (float) Math.sqrt(Math.pow(f10, 2.0d) + dPow)};
                fMax = (Math.max(rectF2.width() / fArr4[0], rectF2.height() / fArr4[1]) * currentScale) - currentScale;
            }
            if (fMax != f) {
                this.L0 = currentScale + fMax;
            }
            if (z) {
                dp7 dp7Var = new dp7(this, f2, f4, fCenterX, fCenterY, currentScale, fMax, z2);
                this.I0 = dp7Var;
                post(dp7Var);
                return;
            }
            float f11 = fMax;
            g(fCenterX, fCenterY);
            if (z2) {
                return;
            }
            j(currentScale + f11, rectF.centerX(), rectF.centerY());
        }
    }

    public void setMaxScaleMultiplier(float f) {
        this.F0 = f;
    }
}
