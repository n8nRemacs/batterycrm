package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class qyd extends ch6 {
    public Float X;
    public int Y;
    public int Z;
    public syd o;
    public Matrix s0;
    public final Matrix t0;

    public qyd(Drawable drawable, syd sydVar) {
        super(drawable);
        this.t0 = new Matrix();
        this.o = sydVar;
    }

    @Override // defpackage.ch6, defpackage.ygg
    public final void d(Matrix matrix) {
        n(matrix);
        q();
        Matrix matrix2 = this.s0;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        q();
        if (this.s0 == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.s0);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.ch6
    public final Drawable o(Drawable drawable) {
        Drawable drawableO = super.o(drawable);
        p();
        return drawableO;
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        p();
    }

    public final void p() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.Z = 0;
            this.Y = 0;
            this.s0 = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.Y = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.Z = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.s0 = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.s0 = null;
        } else {
            if (this.o == tyd.i) {
                drawable.setBounds(bounds);
                this.s0 = null;
                return;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            Matrix matrix = this.t0;
            matrix.reset();
            this.o.a(matrix, bounds, intrinsicWidth, intrinsicHeight, 0.5f, 0.5f);
            this.s0 = matrix;
        }
    }

    public final void q() {
        boolean z;
        syd sydVar = this.o;
        if (sydVar instanceof ryd) {
            Float fValueOf = Float.valueOf(((ryd) sydVar).h);
            z = !fValueOf.equals(this.X);
            this.X = fValueOf;
        } else {
            z = false;
        }
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        if (this.Y == drawable.getIntrinsicWidth() && this.Z == drawable.getIntrinsicHeight() && !z) {
            return;
        }
        p();
    }
}
