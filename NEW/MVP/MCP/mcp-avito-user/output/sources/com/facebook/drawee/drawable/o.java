package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j.k0;
import java.util.Arrays;

/* compiled from: RoundedColorDrawable.java */
/* loaded from: classes10.dex */
public class o extends Drawable implements n {

    /* renamed from: k, reason: collision with root package name */
    public final int f340096k;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f340087b = new float[8];

    /* renamed from: c, reason: collision with root package name */
    @k0
    public final float[] f340088c = new float[8];

    /* renamed from: d, reason: collision with root package name */
    @k0
    public final Paint f340089d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    public boolean f340090e = false;

    /* renamed from: f, reason: collision with root package name */
    public float f340091f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f340092g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f340093h = 0;

    /* renamed from: i, reason: collision with root package name */
    @k0
    public final Path f340094i = new Path();

    /* renamed from: j, reason: collision with root package name */
    @k0
    public final Path f340095j = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final RectF f340097l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public int f340098m = 255;

    public o(int i12) {
        this.f340096k = 0;
        if (this.f340096k != i12) {
            this.f340096k = i12;
            invalidateSelf();
        }
    }

    public final void a() {
        float[] fArr;
        Path path = this.f340094i;
        path.reset();
        Path path2 = this.f340095j;
        path2.reset();
        RectF rectF = this.f340097l;
        rectF.set(getBounds());
        float f12 = this.f340091f / 2.0f;
        rectF.inset(f12, f12);
        boolean z12 = this.f340090e;
        float[] fArr2 = this.f340087b;
        if (z12) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i12 = 0;
            while (true) {
                fArr = this.f340088c;
                if (i12 >= fArr.length) {
                    break;
                }
                fArr[i12] = (fArr2[i12] + this.f340092g) - (this.f340091f / 2.0f);
                i12++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f13 = (-this.f340091f) / 2.0f;
        rectF.inset(f13, f13);
        float f14 = this.f340092g + 0.0f;
        rectF.inset(f14, f14);
        if (this.f340090e) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f15 = -f14;
        rectF.inset(f15, f15);
    }

    @Override // com.facebook.drawee.drawable.n
    public final void b(boolean z12) {
        this.f340090e = z12;
        a();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void c(float f12, int i12) {
        if (this.f340093h != i12) {
            this.f340093h = i12;
            invalidateSelf();
        }
        if (this.f340091f != f12) {
            this.f340091f = f12;
            a();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.n
    public final void d(float f12) {
        if (this.f340092g != f12) {
            this.f340092g = f12;
            a();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f340089d;
        paint.setColor(g.b(this.f340096k, this.f340098m));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(false);
        canvas.drawPath(this.f340094i, paint);
        if (this.f340091f != 0.0f) {
            paint.setColor(g.b(this.f340093h, this.f340098m));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f340091f);
            canvas.drawPath(this.f340095j, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f340098m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iB2 = g.b(this.f340096k, this.f340098m) >>> 24;
        if (iB2 == 255) {
            return -1;
        }
        return iB2 == 0 ? -2 : -3;
    }

    @Override // com.facebook.drawee.drawable.n
    public final void h(float[] fArr) {
        float[] fArr2 = this.f340087b;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            com.facebook.common.internal.o.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        a();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.n
    public final void i() {
        Arrays.fill(this.f340087b, 0.0f);
        a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        if (i12 != this.f340098m) {
            this.f340098m = i12;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.n
    public final void j() {
    }

    @Override // com.facebook.drawee.drawable.n
    public final void l() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
