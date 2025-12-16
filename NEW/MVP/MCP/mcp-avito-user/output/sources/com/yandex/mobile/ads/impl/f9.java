package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class f9 extends ImageSpan {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private WeakReference<Drawable> f385224a;

    /* renamed from: b, reason: collision with root package name */
    private final int f385225b;

    public f9(@j.N Drawable drawable) {
        super(drawable);
        this.f385225b = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@j.N Canvas canvas, @j.P CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @j.N Paint paint) {
        if (this.f385225b != -1) {
            super.draw(canvas, charSequence, i12, i13, f12, i14, i15, i16, paint);
            return;
        }
        WeakReference<Drawable> weakReference = this.f385224a;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f385224a = new WeakReference<>(drawable);
        }
        canvas.save();
        canvas.translate(f12, Math.round(((i14 + i16) / 2.0f) - (drawable.getBounds().height() / 2.0f)));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(@j.N Paint paint, @j.P CharSequence charSequence, int i12, int i13, @j.P Paint.FontMetricsInt fontMetricsInt) {
        WeakReference<Drawable> weakReference = this.f385224a;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f385224a = new WeakReference<>(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
