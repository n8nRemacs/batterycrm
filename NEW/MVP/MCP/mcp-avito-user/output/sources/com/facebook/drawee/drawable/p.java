package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j.N;
import j.P;
import j.X;
import j.k0;
import java.util.Arrays;

/* compiled from: RoundedDrawable.java */
/* loaded from: classes10.dex */
public abstract class p extends Drawable implements n, t {

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f340099b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f340100c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f340101d = false;

    /* renamed from: e, reason: collision with root package name */
    public float f340102e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public final Path f340103f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public boolean f340104g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f340105h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Path f340106i = new Path();

    /* renamed from: j, reason: collision with root package name */
    public final float[] f340107j = new float[8];

    /* renamed from: k, reason: collision with root package name */
    @k0
    public final float[] f340108k = new float[8];

    /* renamed from: l, reason: collision with root package name */
    @k0
    public final RectF f340109l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    @k0
    public final RectF f340110m = new RectF();

    /* renamed from: n, reason: collision with root package name */
    @k0
    public final RectF f340111n = new RectF();

    /* renamed from: o, reason: collision with root package name */
    @k0
    public final RectF f340112o = new RectF();

    /* renamed from: p, reason: collision with root package name */
    @k0
    public final Matrix f340113p = new Matrix();

    /* renamed from: q, reason: collision with root package name */
    @k0
    public final Matrix f340114q = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    @k0
    public final Matrix f340115r = new Matrix();

    /* renamed from: s, reason: collision with root package name */
    @k0
    public final Matrix f340116s = new Matrix();

    /* renamed from: t, reason: collision with root package name */
    @k0
    public final Matrix f340117t = new Matrix();

    /* renamed from: u, reason: collision with root package name */
    @k0
    public final Matrix f340118u = new Matrix();

    /* renamed from: v, reason: collision with root package name */
    public float f340119v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public boolean f340120w = true;

    /* renamed from: x, reason: collision with root package name */
    @P
    public Drawable f340121x;

    public p(Drawable drawable) {
        this.f340099b = drawable;
    }

    public final void a() {
        float[] fArr;
        if (this.f340120w) {
            Path path = this.f340106i;
            path.reset();
            RectF rectF = this.f340109l;
            float f12 = this.f340102e / 2.0f;
            rectF.inset(f12, f12);
            boolean z12 = this.f340100c;
            float[] fArr2 = this.f340107j;
            if (z12) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i12 = 0;
                while (true) {
                    fArr = this.f340108k;
                    if (i12 >= fArr.length) {
                        break;
                    }
                    fArr[i12] = (fArr2[i12] + this.f340119v) - (this.f340102e / 2.0f);
                    i12++;
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f13 = (-this.f340102e) / 2.0f;
            rectF.inset(f13, f13);
            Path path2 = this.f340103f;
            path2.reset();
            float f14 = this.f340119v + 0.0f;
            rectF.inset(f14, f14);
            if (this.f340100c) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f15 = -f14;
            rectF.inset(f15, f15);
            path2.setFillType(Path.FillType.WINDING);
            this.f340120w = false;
        }
    }

    @Override // com.facebook.drawee.drawable.n
    public final void b(boolean z12) {
        this.f340100c = z12;
        this.f340120w = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void c(float f12, int i12) {
        if (this.f340105h == i12 && this.f340102e == f12) {
            return;
        }
        this.f340105h = i12;
        this.f340102e = f12;
        this.f340120w = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.f340099b.clearColorFilter();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void d(float f12) {
        if (this.f340119v != f12) {
            this.f340119v = f12;
            this.f340120w = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        com.facebook.imagepipeline.systrace.b.a();
        this.f340099b.draw(canvas);
        com.facebook.imagepipeline.systrace.b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.drawable.t
    public final void e(@P u uVar) {
        this.f340121x = (Drawable) uVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, com.facebook.drawee.drawable.u] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable, com.facebook.drawee.drawable.u] */
    public final void f() {
        ?? r02 = this.f340121x;
        Matrix matrix = this.f340115r;
        RectF rectF = this.f340109l;
        if (r02 != 0) {
            r02.k(matrix);
            this.f340121x.f(rectF);
        } else {
            matrix.reset();
            rectF.set(getBounds());
        }
        RectF rectF2 = this.f340111n;
        Drawable drawable = this.f340099b;
        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF3 = this.f340112o;
        rectF3.set(drawable.getBounds());
        Matrix matrix2 = this.f340113p;
        matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
        Matrix matrix3 = this.f340116s;
        boolean zEquals = matrix.equals(matrix3);
        Matrix matrix4 = this.f340114q;
        if (!zEquals || !matrix2.equals(matrix4)) {
            this.f340104g = true;
            matrix.invert(this.f340117t);
            Matrix matrix5 = this.f340118u;
            matrix5.set(matrix);
            matrix5.preConcat(matrix2);
            matrix3.set(matrix);
            matrix4.set(matrix2);
        }
        RectF rectF4 = this.f340110m;
        if (rectF.equals(rectF4)) {
            return;
        }
        this.f340120w = true;
        rectF4.set(rectF);
    }

    @Override // android.graphics.drawable.Drawable
    @X
    public final int getAlpha() {
        return this.f340099b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @P
    @X
    public final ColorFilter getColorFilter() {
        return this.f340099b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f340099b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f340099b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f340099b.getOpacity();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void h(float[] fArr) {
        float[] fArr2 = this.f340107j;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.f340101d = false;
        } else {
            com.facebook.common.internal.o.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.f340101d = false;
            for (int i12 = 0; i12 < 8; i12++) {
                this.f340101d |= fArr[i12] > 0.0f;
            }
        }
        this.f340120w = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void i() {
        Arrays.fill(this.f340107j, 0.0f);
        this.f340101d = false;
        this.f340120w = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f340099b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i12) {
        this.f340099b.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i12, @N PorterDuff.Mode mode) {
        this.f340099b.setColorFilter(i12, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        this.f340099b.setColorFilter(colorFilter);
    }

    @Override // com.facebook.drawee.drawable.n
    public final void j() {
    }

    @Override // com.facebook.drawee.drawable.n
    public final void l() {
    }
}
