package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.q;
import j.N;

/* compiled from: OrderedListItemSpan.java */
/* loaded from: classes8.dex */
public class j implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401701b;

    /* renamed from: c, reason: collision with root package name */
    public final String f401702c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f401703d = i.f401700c;

    /* renamed from: e, reason: collision with root package name */
    public int f401704e;

    public j(@N q qVar, @N String str) {
        this.f401701b = qVar;
        this.f401702c = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, int i18, boolean z12, Layout layout) {
        int i19;
        if (z12 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i17) {
            Paint paint2 = this.f401703d;
            paint2.set(paint);
            q qVar = this.f401701b;
            qVar.getClass();
            paint2.setColor(paint2.getColor());
            int i22 = qVar.f401667c;
            if (i22 != 0) {
                paint2.setStrokeWidth(i22);
            }
            String str = this.f401702c;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i23 = qVar.f401665a;
            if (iMeasureText > i23) {
                this.f401704e = iMeasureText;
                i23 = iMeasureText;
            } else {
                this.f401704e = 0;
            }
            if (i13 > 0) {
                i19 = ((i23 * i13) + i12) - iMeasureText;
            } else {
                i19 = (i23 - iMeasureText) + (i13 * i23) + i12;
            }
            canvas.drawText(str, i19, i15, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return Math.max(this.f401704e, this.f401701b.f401665a);
    }
}
