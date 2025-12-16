package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: MatrixDrawable.java */
/* loaded from: classes10.dex */
public class k extends i {

    /* renamed from: f, reason: collision with root package name */
    public int f340072f;

    /* renamed from: g, reason: collision with root package name */
    public int f340073g;

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f340072f != this.f340069b.getIntrinsicWidth() || this.f340073g != this.f340069b.getIntrinsicHeight()) {
            o();
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.i, com.facebook.drawee.drawable.u
    public final void k(Matrix matrix) {
        m(matrix);
    }

    @Override // com.facebook.drawee.drawable.i
    public final Drawable n(@I41.h Drawable drawable) {
        Drawable drawableN = super.n(drawable);
        o();
        return drawableN;
    }

    public final void o() {
        Drawable drawable = this.f340069b;
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f340072f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f340073g = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        o();
    }
}
