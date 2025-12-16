package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ptd extends Drawable implements mtd {
    public final int t0;
    public final float[] a = new float[8];
    public final float[] b = new float[8];
    public final Paint c = new Paint(1);
    public boolean d = false;
    public float o = 0.0f;
    public float X = 0.0f;
    public int Y = 0;
    public final Path Z = new Path();
    public final Path s0 = new Path();
    public final RectF u0 = new RectF();
    public int v0 = 255;

    public ptd(int i) {
        this.t0 = 0;
        if (this.t0 != i) {
            this.t0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.mtd
    public final void a(int i, float f) {
        if (this.Y != i) {
            this.Y = i;
            invalidateSelf();
        }
        if (this.o != f) {
            this.o = f;
            d();
            invalidateSelf();
        }
    }

    @Override // defpackage.mtd
    public final void b(boolean z) {
        this.d = z;
        d();
        invalidateSelf();
    }

    @Override // defpackage.mtd
    public final void c() {
        Arrays.fill(this.a, 0.0f);
        d();
        invalidateSelf();
    }

    public final void d() {
        float[] fArr;
        Path path = this.Z;
        path.reset();
        Path path2 = this.s0;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.u0;
        rectF.set(bounds);
        float f = this.o / 2.0f;
        rectF.inset(f, f);
        boolean z = this.d;
        float[] fArr2 = this.a;
        if (z) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.b;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.X) - (this.o / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = (-this.o) / 2.0f;
        rectF.inset(f2, f2);
        float f3 = this.X + 0.0f;
        rectF.inset(f3, f3);
        if (this.d) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iC = mee.c(this.t0, this.v0);
        Paint paint = this.c;
        paint.setColor(iC);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(false);
        canvas.drawPath(this.Z, paint);
        if (this.o != 0.0f) {
            paint.setColor(mee.c(this.Y, this.v0));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.o);
            canvas.drawPath(this.s0, paint);
        }
    }

    @Override // defpackage.mtd
    public final void f() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iC = mee.c(this.t0, this.v0) >>> 24;
        if (iC != 0) {
            return iC != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // defpackage.mtd
    public final void h(float f) {
        if (this.X != f) {
            this.X = f;
            d();
            invalidateSelf();
        }
    }

    @Override // defpackage.mtd
    public final void i() {
    }

    @Override // defpackage.mtd
    public final void k() {
    }

    @Override // defpackage.mtd
    public final void m(float[] fArr) {
        float[] fArr2 = this.a;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            l5j.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        d();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.v0) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
