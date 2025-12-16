package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class r00 extends Drawable {
    public static Paint r;
    public Drawable a;
    public boolean b;
    public int c = kti.d(56 * vw4.d().getDisplayMetrics().density);
    public boolean d = true;
    public boolean e = true;
    public int f;
    public final float g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public final RectF m;
    public ValueAnimator n;
    public long o;
    public final Paint p;
    public Integer q;

    public r00() {
        float f = vw4.d().getDisplayMetrics().density * 2.0f;
        this.g = f;
        this.i = 270;
        this.m = new RectF();
        if (r == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            r = paint;
        }
        Paint paint2 = r;
        paint2.setStrokeWidth(f);
        this.p = paint2;
    }

    public final boolean a() {
        return (this.f != 0 && this.j == this.h && this.i == 270) ? false : true;
    }

    public final void b(int i) {
        this.p.setColor(i);
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146 A[PHI: r6
  0x0146: PHI (r6v13 boolean) = (r6v12 boolean), (r6v14 boolean) binds: [B:42:0x010e, B:58:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r00.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.f == 0 && i != 0) {
            this.j = i;
            this.h = i;
        }
        float f = i / 10000.0f;
        if (f == -0.1f) {
            this.d = false;
        } else if (f == -0.2f) {
            this.d = true;
        } else {
            if (i == 0) {
                this.o = System.currentTimeMillis() + 150;
            }
            if (a() || i < this.f || i == 10000) {
                this.f = i;
                ValueAnimator valueAnimator = this.n;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            } else {
                ValueAnimator valueAnimator2 = this.n;
                if (valueAnimator2 == null) {
                    ValueAnimator valueAnimator3 = new ValueAnimator();
                    valueAnimator3.addUpdateListener(new q00(0, this));
                    valueAnimator3.setDuration(200L);
                    this.n = valueAnimator3;
                } else {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator4 = this.n;
                if (valueAnimator4 != null) {
                    valueAnimator4.setIntValues(this.f, i);
                }
                ValueAnimator valueAnimator5 = this.n;
                if (valueAnimator5 != null) {
                    valueAnimator5.start();
                }
            }
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        if (this.b || rect.width() <= 0 || rect.width() >= kti.d(56 * vw4.d().getDisplayMetrics().density)) {
            return;
        }
        this.c = rect.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        }
        b(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.b || getBounds().width() <= 0 || getBounds().width() >= kti.d(56 * vw4.d().getDisplayMetrics().density)) {
            return;
        }
        this.c = getBounds().width();
    }
}
