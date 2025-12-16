package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import io.noties.markwon.core.q;
import j.F;
import j.N;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: HeadingSpan.java */
/* loaded from: classes8.dex */
public class g extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401694b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f401695c = i.f401698a;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f401696d = i.f401700c;

    /* renamed from: e, reason: collision with root package name */
    public final int f401697e;

    public g(@N q qVar, @F int i12) {
        this.f401694b = qVar;
        this.f401697e = i12;
    }

    public final void a(TextPaint textPaint) {
        this.f401694b.getClass();
        textPaint.setFakeBoldText(true);
        float[] fArr = q.f401664h;
        int i12 = this.f401697e;
        if (6 >= i12) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i12 - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i12 + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, int i18, boolean z12, Layout layout) {
        int width;
        int i19 = this.f401697e;
        if ((i19 == 1 || i19 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i18) {
            Paint paint2 = this.f401696d;
            paint2.set(paint);
            q qVar = this.f401694b;
            qVar.getClass();
            paint2.setColor(io.noties.markwon.utils.a.a(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i22 = qVar.f401670f;
            if (i22 >= 0) {
                paint2.setStrokeWidth(i22);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i23 = (int) ((i16 - strokeWidth) + 0.5f);
                if (i13 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i12;
                    i12 -= canvas.getWidth();
                }
                Rect rect = this.f401695c;
                rect.set(i12, i23, width, i16);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
