package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import j.P;
import j.X;

/* compiled from: TypefaceEmojiSpan.java */
@RestrictTo
@X
/* loaded from: classes.dex */
public final class u extends m {

    /* renamed from: f, reason: collision with root package name */
    @P
    public TextPaint f46161f;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(@j.N android.graphics.Canvas r14, @android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r15, @j.F int r16, @j.F int r17, float r18, int r19, int r20, int r21, @j.N android.graphics.Paint r22) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r22
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L4a
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r5 = r16
            r6 = r17
            java.lang.Object[] r1 = r1.getSpans(r5, r6, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L42
            int r3 = r1.length
            r5 = 1
            r6 = 0
            if (r3 != r5) goto L24
            r3 = r1[r6]
            if (r3 != r0) goto L24
            goto L42
        L24:
            android.text.TextPaint r3 = r0.f46161f
            if (r3 != 0) goto L2f
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.f46161f = r3
        L2f:
            r4 = r3
            r4.set(r2)
        L33:
            int r3 = r1.length
            if (r6 >= r3) goto L51
            r3 = r1[r6]
            boolean r5 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r5 != 0) goto L3f
            r3.updateDrawState(r4)
        L3f:
            int r6 = r6 + 1
            goto L33
        L42:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L51
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L51
        L4a:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L51
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
        L51:
            if (r4 == 0) goto L81
            int r1 = r4.bgColor
            if (r1 == 0) goto L81
            short r1 = r0.f46133d
            float r1 = (float) r1
            float r8 = r18 + r1
            r1 = r19
            float r7 = (float) r1
            r1 = r21
            float r9 = (float) r1
            int r1 = r4.getColor()
            android.graphics.Paint$Style r3 = r4.getStyle()
            int r5 = r4.bgColor
            r4.setColor(r5)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            r5 = r14
            r6 = r18
            r10 = r4
            r5.drawRect(r6, r7, r8, r9, r10)
            r4.setStyle(r3)
            r4.setColor(r1)
        L81:
            androidx.emoji2.text.e r1 = androidx.emoji2.text.e.a()
            r1.getClass()
            r1 = r20
            float r10 = (float) r1
            if (r4 == 0) goto L8e
            r2 = r4
        L8e:
            androidx.emoji2.text.t r1 = r0.f46132c
            androidx.emoji2.text.r r3 = r1.f46159b
            android.graphics.Typeface r4 = r3.f46150d
            android.graphics.Typeface r12 = r2.getTypeface()
            r2.setTypeface(r4)
            int r1 = r1.f46158a
            int r7 = r1 * 2
            r8 = 2
            char[] r6 = r3.f46148b
            r5 = r14
            r9 = r18
            r11 = r2
            r5.drawText(r6, r7, r8, r9, r10, r11)
            r2.setTypeface(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.u.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}
