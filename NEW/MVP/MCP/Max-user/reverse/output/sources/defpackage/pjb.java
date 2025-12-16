package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class pjb extends ch6 {
    public final int X;
    public final int Y;
    public final Matrix Z;
    public final Matrix o;
    public final RectF s0;

    public pjb(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.o = new Matrix();
        this.X = i - (i % 90);
        this.Y = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.Z = new Matrix();
        this.s0 = new RectF();
    }

    @Override // defpackage.ch6, defpackage.ygg
    public final void d(Matrix matrix) {
        n(matrix);
        Matrix matrix2 = this.o;
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.X <= 0 && ((i = this.Y) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.o);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.Y;
        return (i == 5 || i == 7 || this.X % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.Y;
        return (i == 5 || i == 7 || this.X % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        int i = this.Y;
        int i2 = this.X;
        if (i2 <= 0 && (i == 0 || i == 1)) {
            drawable.setBounds(rect);
            return;
        }
        Matrix matrix = this.o;
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i != 5) {
            matrix.setRotate(i2, rect.centerX(), rect.centerY());
        } else {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.Z;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.s0;
        rectF.set(rect);
        matrix2.mapRect(rectF);
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
