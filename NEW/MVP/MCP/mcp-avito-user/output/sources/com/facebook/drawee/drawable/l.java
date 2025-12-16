package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j.k0;

/* compiled from: OrientedDrawable.java */
/* loaded from: classes10.dex */
public class l extends i {

    /* renamed from: f, reason: collision with root package name */
    @k0
    public final Matrix f340074f;

    /* renamed from: g, reason: collision with root package name */
    public final int f340075g;

    /* renamed from: h, reason: collision with root package name */
    public final int f340076h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f340077i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f340078j;

    public l(BitmapDrawable bitmapDrawable, int i12, int i13) {
        super(bitmapDrawable);
        this.f340077i = new Matrix();
        this.f340078j = new RectF();
        this.f340074f = new Matrix();
        this.f340075g = i12 - (i12 % 90);
        this.f340076h = (i13 < 0 || i13 > 8) ? 0 : i13;
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i12;
        if (this.f340075g <= 0 && ((i12 = this.f340076h) == 0 || i12 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f340074f);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i12 = this.f340076h;
        return (i12 == 5 || i12 == 7 || this.f340075g % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i12 = this.f340076h;
        return (i12 == 5 || i12 == 7 || this.f340075g % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.i, com.facebook.drawee.drawable.u
    public final void k(Matrix matrix) {
        m(matrix);
        Matrix matrix2 = this.f340074f;
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f340069b;
        int i12 = this.f340076h;
        int i13 = this.f340075g;
        if (i13 <= 0 && (i12 == 0 || i12 == 1)) {
            drawable.setBounds(rect);
            return;
        }
        Matrix matrix = this.f340074f;
        if (i12 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i12 == 7) {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i12 == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i12 != 5) {
            matrix.setRotate(i13, rect.centerX(), rect.centerY());
        } else {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.f340077i;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.f340078j;
        rectF.set(rect);
        matrix2.mapRect(rectF);
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
