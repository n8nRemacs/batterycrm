package jX0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import androidx.appcompat.app.r;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: BetterImageSpan.java */
/* renamed from: jX0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C42318a extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public int f405625b;

    /* renamed from: c, reason: collision with root package name */
    public int f405626c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f405627d;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f405630g;

    /* renamed from: f, reason: collision with root package name */
    public final Paint.FontMetricsInt f405629f = new Paint.FontMetricsInt();

    /* renamed from: e, reason: collision with root package name */
    public final int f405628e = 2;

    /* compiled from: BetterImageSpan.java */
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: jX0.a$a, reason: collision with other inner class name */
    public @interface InterfaceC11569a {
    }

    public C42318a(Drawable drawable) {
        this.f405630g = drawable;
        Rect bounds = drawable.getBounds();
        this.f405627d = bounds;
        this.f405625b = bounds.width();
        this.f405626c = this.f405627d.height();
    }

    public final int a(Paint.FontMetricsInt fontMetricsInt) {
        int i12 = this.f405628e;
        if (i12 == 0) {
            return fontMetricsInt.descent - this.f405626c;
        }
        if (i12 != 2) {
            return -this.f405626c;
        }
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        return r.f(i13 - i14, this.f405626c, 2, i14);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = this.f405629f;
        paint.getFontMetricsInt(fontMetricsInt);
        canvas.translate(f12, a(fontMetricsInt) + i15);
        this.f405630g.draw(canvas);
        canvas.translate(-f12, -r2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i12, int i13, @P Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = this.f405630g.getBounds();
        this.f405627d = bounds;
        this.f405625b = bounds.width();
        this.f405626c = this.f405627d.height();
        if (fontMetricsInt == null) {
            return this.f405625b;
        }
        int iA2 = a(fontMetricsInt);
        int i14 = this.f405626c + iA2;
        if (iA2 < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = iA2;
        }
        if (iA2 < fontMetricsInt.top) {
            fontMetricsInt.top = iA2;
        }
        if (i14 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i14;
        }
        if (i14 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i14;
        }
        return this.f405625b;
    }
}
