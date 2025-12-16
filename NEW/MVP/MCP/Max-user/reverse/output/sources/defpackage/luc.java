package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes2.dex */
public final class luc extends MetricAffectingSpan implements LeadingMarginSpan, u6g, ep8, LineHeightSpan.WithDensity {
    public final int X;
    public final kuc a;
    public final String b = luc.class.getName();
    public final Paint c = new Paint();
    public int d;
    public int o;

    public luc(kuc kucVar) {
        this.a = kucVar;
        kucVar.e.setBounds(0, 0, kucVar.g, kucVar.h);
        d(kucVar.c);
        this.X = 10;
    }

    @Override // defpackage.ep8
    public final byte b() {
        return (byte) -1;
    }

    public final void c(Paint paint, Canvas canvas, int i, float f, int i2, float f2, float f3) {
        paint.setColor(this.d);
        float f4 = i;
        kuc kucVar = this.a;
        canvas.drawRect(f4, f, (i2 * kucVar.k) + i, f2, paint);
        paint.setColor(this.o);
        canvas.drawRect(f4 + kucVar.k, f, f3, f2, paint);
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt, null);
    }

    @Override // defpackage.g74
    public final g74 copy() {
        return new luc(this.a);
    }

    public final void d(yt0 yt0Var) {
        kuc kucVar = this.a;
        kucVar.c = yt0Var;
        rt0 rt0Var = yt0Var.a;
        int i = rt0Var.e;
        this.d = i;
        this.o = rt0Var.g;
        kucVar.e.setTint(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c6 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:101:0x01ba, B:103:0x01c6, B:106:0x01d2, B:108:0x01d7), top: B:156:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2 A[Catch: all -> 0x01cf, TryCatch #8 {all -> 0x01cf, blocks: (B:101:0x01ba, B:103:0x01c6, B:106:0x01d2, B:108:0x01d7), top: B:156:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:78:0x0127, B:80:0x0133, B:84:0x0143, B:86:0x0148), top: B:141:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:78:0x0127, B:80:0x0133, B:84:0x0143, B:86:0x0148), top: B:141:0x0127 }] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // android.text.style.LeadingMarginSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawLeadingMargin(android.graphics.Canvas r21, android.graphics.Paint r22, int r23, int r24, int r25, int r26, int r27, java.lang.CharSequence r28, int r29, int r30, boolean r31, android.text.Layout r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luc.drawLeadingMargin(android.graphics.Canvas, android.graphics.Paint, int, int, int, int, int, java.lang.CharSequence, int, int, boolean, android.text.Layout):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luc) && fni.a(this.a, ((luc) obj).a);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        kuc kucVar = this.a;
        return kucVar.k + kucVar.l;
    }

    @Override // defpackage.ep8
    public final int getType() {
        return this.X;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        d(yebVar.a().r());
    }

    public final String toString() {
        return "QuoteSpan(param=" + this.a + ")";
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            kuc kucVar = this.a;
            t5g.c(kucVar.d, kucVar.a, textPaint, null, (t75) kucVar.b.a.getValue(), 4);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        kuc kucVar = this.a;
        t5g.c(kucVar.d, kucVar.a, textPaint, null, (t75) kucVar.b.a.getValue(), 4);
        wsc wscVar = kucVar.f;
        int asInt = wscVar != null ? wscVar.getAsInt() : 0;
        if (asInt > 0) {
            textPaint.setTextScaleX(asInt / (((asInt - kucVar.g) - kucVar.j) - kucVar.m));
        }
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (fontMetricsInt == null || spanned == null) {
            return;
        }
        int iAscent = textPaint != null ? (int) textPaint.ascent() : fontMetricsInt.ascent;
        int iDescent = textPaint != null ? (int) textPaint.descent() : fontMetricsInt.descent;
        fontMetricsInt.ascent = iAscent;
        fontMetricsInt.descent = iDescent;
        int spanStart = spanned.getSpanStart(this);
        kuc kucVar = this.a;
        if (i == spanStart) {
            int i5 = fontMetricsInt.ascent - kucVar.n;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
        }
        if (i2 == spanned.getSpanEnd(this) + 1 || i2 >= ((Spanned) charSequence).length()) {
            int i6 = kucVar.p + kucVar.o + fontMetricsInt.descent;
            fontMetricsInt.descent = i6;
            fontMetricsInt.bottom = i6;
        }
    }
}
