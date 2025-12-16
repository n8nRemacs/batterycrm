package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public abstract class ahg extends AppCompatImageView {
    public float A0;
    public final float[] d;
    public final float[] o;
    public final float[] s0;
    public final Matrix t0;
    public float[] u0;
    public float[] v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public String z0;

    public ahg(Context context) {
        super(context, null, 0);
        this.d = new float[8];
        this.o = new float[2];
        this.s0 = new float[9];
        this.t0 = new Matrix();
        this.w0 = false;
        this.x0 = false;
        this.y0 = 0;
        rr6 rr6Var = (rr6) this;
        rr6Var.setScaleType(ImageView.ScaleType.MATRIX);
        rr6Var.O0 = new GestureDetector(rr6Var.getContext(), new kx0(8, rr6Var), null, true);
        rr6Var.M0 = new ScaleGestureDetector(rr6Var.getContext(), new qr6(rr6Var));
        h08 h08Var = new h08(18, rr6Var);
        xsd xsdVar = new xsd();
        xsdVar.i = h08Var;
        xsdVar.e = -1;
        xsdVar.f = -1;
        rr6Var.N0 = xsdVar;
    }

    public abstract void a();

    public final void g(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        Matrix matrix = this.t0;
        matrix.postTranslate(f, f2);
        setImageMatrix(matrix);
    }

    public float getCurrentAngle() {
        Matrix matrix = this.t0;
        double dC = mei.c(matrix, 1);
        matrix.getValues(mei.a);
        return (float) (-(Math.atan2(dC, r0[0]) * 57.29577951308232d));
    }

    public float[] getCurrentImageCorners() {
        return this.d;
    }

    public Matrix getCurrentImageMatrix() {
        return this.t0;
    }

    public float[] getCurrentMatrixValues() {
        Matrix matrix = this.t0;
        float[] fArr = this.s0;
        matrix.getValues(fArr);
        return fArr;
    }

    public float getCurrentScale() {
        return mei.b(this.t0);
    }

    public String getImageOutputPath() {
        return this.z0;
    }

    public float[] getInitialImageCorners() {
        return this.u0;
    }

    public int getMaxBitmapSize() {
        if (this.y0 <= 0) {
            this.y0 = gvi.a(getContext());
        }
        return this.y0;
    }

    public float getMinOverlaySize() {
        if (this.A0 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return getCurrentScale() * this.A0;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof vq5)) {
            return null;
        }
        return ((vq5) getDrawable()).b;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.w0 && !this.x0)) {
            getPaddingLeft();
            getPaddingTop();
            getWidth();
            getPaddingRight();
            getHeight();
            getPaddingBottom();
            a();
        }
    }

    public void setCurrentMatrixValues(float[] fArr) {
        Matrix matrix = this.t0;
        matrix.setValues(fArr);
        setImageMatrix(matrix);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new vq5(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.t0;
        matrix2.set(matrix);
        try {
            matrix2.mapPoints(this.d, this.u0);
            matrix2.mapPoints(this.o, this.v0);
        } catch (Exception e) {
            Log.e("TransformImageView", "Can't updateCurrentImagePoints", e);
        }
    }

    public void setMaxBitmapSize(int i) {
        this.y0 = i;
    }

    public void setMinImageSize(float f) {
        this.A0 = f;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(zgg zggVar) {
    }
}
