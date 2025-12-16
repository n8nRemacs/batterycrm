package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import io.noties.markwon.core.q;
import j.N;

/* compiled from: CodeBlockSpan.java */
/* loaded from: classes8.dex */
public class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401690b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f401691c = i.f401698a;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f401692d = i.f401700c;

    public c(@N q qVar) {
        this.f401690b = qVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, int i18, boolean z12, Layout layout) {
        int width;
        Paint paint2 = this.f401692d;
        paint2.setStyle(Paint.Style.FILL);
        this.f401690b.getClass();
        paint2.setColor(io.noties.markwon.utils.a.a(paint.getColor(), 25));
        if (i13 > 0) {
            width = canvas.getWidth();
        } else {
            i12 -= canvas.getWidth();
            width = i12;
        }
        Rect rect = this.f401691c;
        rect.set(i12, i14, width, i16);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return this.f401690b.f401669e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f401690b.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f401690b.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
