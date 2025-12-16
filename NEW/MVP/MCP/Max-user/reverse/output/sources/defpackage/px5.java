package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class px5 extends Drawable {
    public final Paint a;
    public lx5 b;
    public lx5 c;
    public float d;
    public float e;
    public float f;
    public final float g;
    public final nx5 h;
    public final ox5 i;
    public long j;

    public px5() {
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.a = paint;
        lx5 lx5Var = lx5.a;
        this.b = lx5Var;
        this.c = lx5Var;
        this.d = 1.0f;
        this.g = 1.0f;
        this.h = new nx5(this);
        this.i = new ox5(this);
    }

    public final mx5 a() {
        lx5 lx5Var = this.b;
        lx5 lx5Var2 = this.c;
        int iOrdinal = lx5Var.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = lx5Var2.ordinal();
            if (iOrdinal2 == 0) {
                return mx5.a;
            }
            if (iOrdinal2 == 1) {
                return mx5.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal3 = lx5Var2.ordinal();
        if (iOrdinal3 == 0) {
            return mx5.c;
        }
        if (iOrdinal3 == 1) {
            return mx5.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        return this.f > 0.01f || this.e > 0.01f;
    }

    public final void c(int i, int i2, int i3) {
        nx5 nx5Var = this.h;
        nx5Var.c = hbj.c(nx5Var.c, i, 0.0f, 2);
        nx5Var.d = hbj.c(nx5Var.d, i2, 0.0f, 2);
        nx5Var.b = hbj.c(nx5Var.b, i3, 0.0f, 2);
    }

    public final void d(int i, int i2) {
        nx5 nx5Var = this.h;
        long j = nx5Var.f;
        int i3 = (int) (j >> 32);
        ox5 ox5Var = this.i;
        if (i3 != i || ((int) (j >> 32)) != i2 || ox5Var.j != i2) {
            invalidateSelf();
        }
        nx5Var.f = bhi.a(i, i2);
        ox5Var.j = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (b()) {
            nx5 nx5Var = this.h;
            px5 px5Var = nx5Var.k;
            Paint paint = px5Var.a;
            if (nx5Var.h >= 0.01f) {
                float f = nx5Var.i;
                if (f < 0.99f) {
                    float interpolation = nx5Var.g.getInterpolation(f);
                    float fA = hbj.a(interpolation, nx5Var.d);
                    float fA2 = hbj.a(interpolation, nx5Var.c) / 2;
                    float fA3 = hbj.a(interpolation, nx5Var.a);
                    float fA4 = hbj.a(interpolation, nx5Var.b);
                    long j = nx5Var.f;
                    paint.setColor(v4j.c(rf3.c((int) (j >> 32), interpolation, (int) (j & 4294967295L)), nx5Var.h * px5Var.e * px5Var.d));
                    paint.setStrokeWidth(nx5Var.e);
                    canvas.drawLine(fA3, fA4, fA3, fA4 - fA, paint);
                    float f2 = fA4 - fA2;
                    canvas.drawLine(fA3, fA4, fA3 - fA2, f2, paint);
                    canvas.drawLine(fA3, fA4, fA3 + fA2, f2, paint);
                }
            }
            ox5 ox5Var = this.i;
            px5 px5Var2 = ox5Var.m;
            if (ox5Var.i < 0.01f) {
                return;
            }
            float f3 = ox5Var.c;
            float f4 = ox5Var.d;
            float f5 = ((ox5Var.f * 360.0f) + 90.0f) % 360.0f;
            float fB = n7j.b(ox5Var.g * 360.0f, 3.0f, 360.0f);
            Paint paint2 = px5Var2.a;
            paint2.setColor(v4j.c(ox5Var.j, ox5Var.i * px5Var2.e * px5Var2.d));
            paint2.setStrokeWidth(ox5Var.e);
            canvas.drawArc(0.0f, 0.0f, f3, f4, f5, fB, false, paint2);
            float f6 = ox5Var.k;
            if (f6 > 0.01f) {
                float interpolation2 = ox5Var.l.getInterpolation(f6);
                float f7 = (interpolation2 * 1.5707964f) - 0.7853982f;
                float f8 = 2;
                float f9 = f3 / f8;
                float f10 = f4 / f8;
                float f11 = ox5Var.a;
                float f12 = ox5Var.b;
                float f13 = (f9 * f11) - f12;
                float f14 = (f11 * f10) - f12;
                double d = f7;
                float fCos = (float) Math.cos(d);
                float fSin = (float) Math.sin(d);
                double d2 = f7 + 1.5707964f;
                float fCos2 = (float) Math.cos(d2);
                float fSin2 = (float) Math.sin(d2);
                paint2.setColor(v4j.c(paint2.getColor(), ox5Var.i * interpolation2 * px5Var2.e * px5Var2.d));
                float f15 = fCos * f13;
                float f16 = fSin * f14;
                canvas.drawLine(f9 - f15, f10 - f16, f9 + f15, f10 + f16, paint2);
                float f17 = f13 * fCos2;
                float f18 = f14 * fSin2;
                canvas.drawLine(f9 - f17, f10 - f18, f9 + f17, f10 + f18, paint2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int iAbs = Math.abs(i3 - i);
        int iAbs2 = Math.abs(i4 - i2);
        float f = iAbs;
        float f2 = f / 2.0f;
        long jA = m26.a(f2, f2);
        nx5 nx5Var = this.h;
        nx5Var.a = jA;
        float f3 = iAbs2;
        nx5Var.b = hbj.c(nx5Var.b, 0.0f, f3, 1);
        ox5 ox5Var = this.i;
        ox5Var.c = f;
        ox5Var.d = f3;
        super.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final String toString() {
        return yxg.h("(%s(%s), %.1f -> %.1f, %s, %s)", this.b, a(), Float.valueOf(this.e), Float.valueOf(this.f), this.h.toString(), this.i.toString());
    }
}
