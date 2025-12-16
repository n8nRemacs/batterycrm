package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class yb5 extends ReplacementSpan implements j7f {
    public final Drawable X;
    public int a;
    public int b;
    public Rect c;
    public final Paint.FontMetricsInt d = new Paint.FontMetricsInt();
    public final int o = 2;

    public yb5(Drawable drawable) {
        this.X = drawable;
        Rect bounds = drawable.getBounds();
        this.c = bounds;
        this.a = bounds.width();
        this.b = this.c.height();
    }

    public final int a(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = this.X.getBounds();
        this.c = bounds;
        this.a = bounds.width();
        int iHeight = this.c.height();
        this.b = iHeight;
        if (fontMetricsInt == null) {
            return this.a;
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int i3 = fontMetricsInt2.ascent;
        fontMetricsInt.ascent = i3;
        int i4 = fontMetricsInt2.descent;
        fontMetricsInt.descent = i4;
        fontMetricsInt.leading = fontMetricsInt2.leading;
        int i5 = this.o;
        if (i5 == 0) {
            int i6 = i4 - iHeight;
            if (i3 > i6) {
                fontMetricsInt.ascent = i6;
            }
        } else if (i5 != 2) {
            int i7 = -iHeight;
            if (i3 > i7) {
                fontMetricsInt.ascent = i7;
            }
        } else {
            int i8 = i4 - i3;
            if (i8 < iHeight) {
                int i9 = i3 - ((iHeight - i8) / 2);
                fontMetricsInt.ascent = i9;
                fontMetricsInt.descent = i9 + iHeight;
            }
        }
        fontMetricsInt.top = Math.min(fontMetricsInt2.top, fontMetricsInt.ascent);
        fontMetricsInt.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt.descent);
        return this.a;
    }

    @Override // defpackage.j7f
    public final Drawable b() {
        return this.X;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint.FontMetricsInt fontMetricsInt = this.d;
        paint.getFontMetricsInt(fontMetricsInt);
        int i7 = this.b;
        int i8 = this.o;
        if (i8 == 0) {
            i6 = fontMetricsInt.descent - i7;
        } else if (i8 != 2) {
            i6 = -i7;
        } else {
            int i9 = fontMetricsInt.descent;
            int i10 = fontMetricsInt.ascent;
            i6 = i10 + (((i9 - i10) - i7) / 2);
        }
        canvas.translate(f, i4 + i6);
        this.X.draw(canvas);
        canvas.translate(-f, -r7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb5)) {
            return false;
        }
        yb5 yb5Var = (yb5) obj;
        return this.o == yb5Var.o && Objects.equals(this.c, yb5Var.c) && Objects.equals(this.X, yb5Var.X);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = this.X;
        if (drawable instanceof o8f) {
            o8f o8fVar = (o8f) drawable;
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = fontMetricsInt;
            }
            Paint paint2 = o8f.d;
            p8f p8fVar = o8fVar.a;
            if (fontMetricsInt2 != null) {
                int iAbs = Math.abs(fontMetricsInt2.ascent) + Math.abs(fontMetricsInt2.descent);
                if (iAbs > 0 && p8fVar.b != iAbs) {
                    p8fVar.b = iAbs;
                    int i3 = o8fVar.a.b;
                    o8fVar.setBounds(0, 0, i3, i3);
                    o8fVar.a();
                    o8fVar.invalidateSelf();
                }
            }
        }
        return a(paint, charSequence, i, i2, fontMetricsInt);
    }

    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(this.o), this.X);
    }
}
