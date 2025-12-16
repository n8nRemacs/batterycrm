package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.s;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;

/* compiled from: ScaleTypeDrawable.java */
@Nullsafe
/* loaded from: classes10.dex */
public class r extends i {

    /* renamed from: f, reason: collision with root package name */
    @k0
    public s.c f340122f;

    /* renamed from: g, reason: collision with root package name */
    @k0
    @I41.h
    public Object f340123g;

    /* renamed from: h, reason: collision with root package name */
    @k0
    @I41.h
    public PointF f340124h;

    /* renamed from: i, reason: collision with root package name */
    @k0
    public int f340125i;

    /* renamed from: j, reason: collision with root package name */
    @k0
    public int f340126j;

    /* renamed from: k, reason: collision with root package name */
    @k0
    @I41.h
    public Matrix f340127k;

    /* renamed from: l, reason: collision with root package name */
    public final Matrix f340128l;

    public r(@I41.h Drawable drawable, s.a aVar) {
        super(drawable);
        this.f340124h = null;
        this.f340125i = 0;
        this.f340126j = 0;
        this.f340128l = new Matrix();
        this.f340122f = aVar;
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        p();
        if (this.f340127k == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f340127k);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.i, com.facebook.drawee.drawable.u
    public final void k(Matrix matrix) {
        m(matrix);
        p();
        Matrix matrix2 = this.f340127k;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // com.facebook.drawee.drawable.i
    @I41.h
    public final Drawable n(@I41.h Drawable drawable) {
        Drawable drawableN = super.n(drawable);
        o();
        return drawableN;
    }

    @k0
    public final void o() {
        Drawable drawable = this.f340069b;
        if (drawable == null) {
            this.f340126j = 0;
            this.f340125i = 0;
            this.f340127k = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f340125i = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f340126j = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.f340127k = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.f340127k = null;
        } else {
            if (this.f340122f == s.c.f340129a) {
                drawable.setBounds(bounds);
                this.f340127k = null;
                return;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            s.c cVar = this.f340122f;
            Matrix matrix = this.f340128l;
            PointF pointF = this.f340124h;
            cVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.f340127k = matrix;
        }
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        o();
    }

    public final void p() {
        boolean z12;
        s.c cVar = this.f340122f;
        if (cVar instanceof s.o) {
            Float state = ((s.o) cVar).getState();
            z12 = !state.equals(this.f340123g);
            this.f340123g = state;
        } else {
            z12 = false;
        }
        Drawable drawable = this.f340069b;
        if (drawable == null) {
            return;
        }
        if (this.f340125i == drawable.getIntrinsicWidth() && this.f340126j == drawable.getIntrinsicHeight() && !z12) {
            return;
        }
        o();
    }

    public final void q(@I41.h PointF pointF) {
        if (com.facebook.common.internal.n.a(this.f340124h, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f340124h = null;
        } else {
            if (this.f340124h == null) {
                this.f340124h = new PointF();
            }
            this.f340124h.set(pointF);
        }
        o();
        invalidateSelf();
    }

    public final void r(s.c cVar) {
        if (com.facebook.common.internal.n.a(this.f340122f, cVar)) {
            return;
        }
        this.f340122f = cVar;
        this.f340123g = null;
        o();
        invalidateSelf();
    }
}
