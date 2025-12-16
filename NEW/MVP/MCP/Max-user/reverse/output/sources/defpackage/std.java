package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class std extends Drawable implements mtd, xgg {
    public ygg G0;
    public final Drawable a;
    public boolean b = false;
    public boolean c = false;
    public float d = 0.0f;
    public final Path o = new Path();
    public boolean X = true;
    public int Y = 0;
    public final Path Z = new Path();
    public final float[] s0 = new float[8];
    public final float[] t0 = new float[8];
    public final RectF u0 = new RectF();
    public final RectF v0 = new RectF();
    public final RectF w0 = new RectF();
    public final RectF x0 = new RectF();
    public final Matrix y0 = new Matrix();
    public final Matrix z0 = new Matrix();
    public final Matrix A0 = new Matrix();
    public final Matrix B0 = new Matrix();
    public final Matrix C0 = new Matrix();
    public final Matrix D0 = new Matrix();
    public float E0 = 0.0f;
    public boolean F0 = true;

    public std(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.mtd
    public final void a(int i, float f) {
        if (this.Y == i && this.d == f) {
            return;
        }
        this.Y = i;
        this.d = f;
        this.F0 = true;
        invalidateSelf();
    }

    @Override // defpackage.mtd
    public final void b(boolean z) {
        this.b = z;
        this.F0 = true;
        invalidateSelf();
    }

    @Override // defpackage.mtd
    public final void c() {
        Arrays.fill(this.s0, 0.0f);
        this.c = false;
        this.F0 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.a.clearColorFilter();
    }

    public final void d() {
        float[] fArr;
        if (this.F0) {
            Path path = this.Z;
            path.reset();
            float f = this.d / 2.0f;
            RectF rectF = this.u0;
            rectF.inset(f, f);
            boolean z = this.b;
            float[] fArr2 = this.s0;
            if (z) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.t0;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (fArr2[i] + this.E0) - (this.d / 2.0f);
                    i++;
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = (-this.d) / 2.0f;
            rectF.inset(f2, f2);
            Path path2 = this.o;
            path2.reset();
            float f3 = this.E0 + 0.0f;
            rectF.inset(f3, f3);
            if (this.b) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.F0 = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ml6.i();
        this.a.draw(canvas);
        ml6.i();
    }

    public void e() {
        ygg yggVar = this.G0;
        Matrix matrix = this.A0;
        RectF rectF = this.u0;
        if (yggVar != null) {
            yggVar.d(matrix);
            this.G0.g(rectF);
        } else {
            matrix.reset();
            rectF.set(getBounds());
        }
        Drawable drawable = this.a;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF2 = this.w0;
        rectF2.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        Rect bounds = drawable.getBounds();
        RectF rectF3 = this.x0;
        rectF3.set(bounds);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix2 = this.y0;
        matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
        Matrix matrix3 = this.B0;
        boolean zEquals = matrix.equals(matrix3);
        Matrix matrix4 = this.z0;
        if (!zEquals || !matrix2.equals(matrix4)) {
            this.X = true;
            matrix.invert(this.C0);
            Matrix matrix5 = this.D0;
            matrix5.set(matrix);
            matrix5.preConcat(matrix2);
            matrix3.set(matrix);
            matrix4.set(matrix2);
        }
        RectF rectF4 = this.v0;
        if (rectF.equals(rectF4)) {
            return;
        }
        this.F0 = true;
        rectF4.set(rectF);
    }

    public void f() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // defpackage.mtd
    public final void h(float f) {
        if (this.E0 != f) {
            this.E0 = f;
            this.F0 = true;
            invalidateSelf();
        }
    }

    @Override // defpackage.mtd
    public final void i() {
    }

    @Override // defpackage.mtd
    public final void k() {
    }

    @Override // defpackage.xgg
    public final void l(ygg yggVar) {
        this.G0 = yggVar;
    }

    @Override // defpackage.mtd
    public final void m(float[] fArr) {
        float[] fArr2 = this.s0;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.c = false;
        } else {
            l5j.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.c = false;
            for (int i = 0; i < 8; i++) {
                this.c |= fArr[i] > 0.0f;
            }
        }
        this.F0 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
