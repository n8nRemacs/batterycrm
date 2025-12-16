package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import androidx.appcompat.app.r;
import io.noties.markwon.core.q;
import io.noties.markwon.core.spans.m;
import j.F;
import j.N;
import j.P;

/* compiled from: AsyncDrawableSpan.java */
/* loaded from: classes8.dex */
public class f extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401908b;

    /* renamed from: c, reason: collision with root package name */
    public final a f401909c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f401910d;

    public f(@N q qVar, @N a aVar, boolean z12) {
        this.f401908b = qVar;
        this.f401909c = aVar;
        this.f401910d = z12;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@N Canvas canvas, CharSequence charSequence, @F int i12, @F int i13, float f12, int i14, int i15, int i16, @N Paint paint) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            io.noties.markwon.core.spans.l[] lVarArr = (io.noties.markwon.core.spans.l[]) spanned.getSpans(0, spanned.length(), io.noties.markwon.core.spans.l.class);
            if (lVarArr != null && lVarArr.length > 0) {
                lVarArr[0].getClass();
                throw null;
            }
            m[] mVarArr = (m[]) spanned.getSpans(0, spanned.length(), m.class);
            if (mVarArr != null && mVarArr.length > 0) {
                mVarArr[0].getClass();
                throw null;
            }
        }
        int width = canvas.getWidth();
        float textSize = paint.getTextSize();
        a aVar = this.f401909c;
        aVar.f401905d = width;
        aVar.f401906e = textSize;
        if (aVar.f401907f) {
            if (aVar.f401905d != 0) {
                aVar.f401907f = false;
                aVar.f401904c.getClass();
                throw null;
            }
            aVar.f401907f = true;
            aVar.setBounds(new Rect(0, 0, 1, 1));
        }
        if (aVar.a()) {
            int i17 = i16 - aVar.getBounds().bottom;
            int iSave = canvas.save();
            try {
                canvas.translate(f12, i17);
                aVar.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float f13 = (int) (r.f(i16, i14, 2, i14) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.f401910d) {
            this.f401908b.getClass();
            paint.setUnderlineText(true);
            if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        canvas.drawText(charSequence, i12, i13, f12, f13, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@N Paint paint, CharSequence charSequence, @F int i12, @F int i13, @P Paint.FontMetricsInt fontMetricsInt) {
        a aVar = this.f401909c;
        if (!aVar.a()) {
            if (this.f401910d) {
                this.f401908b.getClass();
                paint.setUnderlineText(true);
                if (paint instanceof TextPaint) {
                    paint.setColor(((TextPaint) paint).linkColor);
                }
            }
            return (int) (paint.measureText(charSequence, i12, i13) + 0.5f);
        }
        Rect bounds = aVar.getBounds();
        if (fontMetricsInt != null) {
            int i14 = -bounds.bottom;
            fontMetricsInt.ascent = i14;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i14;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
