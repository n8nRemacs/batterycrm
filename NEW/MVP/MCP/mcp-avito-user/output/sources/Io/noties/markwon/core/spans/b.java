package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.q;
import j.F;
import j.N;

/* compiled from: BulletListItemSpan.java */
/* loaded from: classes8.dex */
public class b implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401685b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f401686c = i.f401700c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f401687d = i.f401699b;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f401688e = i.f401698a;

    /* renamed from: f, reason: collision with root package name */
    public final int f401689f;

    public b(@N q qVar, @F int i12) {
        this.f401685b = qVar;
        this.f401689f = i12;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, int i18, boolean z12, Layout layout) {
        Rect rect = this.f401688e;
        if (z12 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i17) {
            Paint paint2 = this.f401686c;
            paint2.set(paint);
            q qVar = this.f401685b;
            qVar.getClass();
            int i19 = qVar.f401665a;
            paint2.setColor(paint2.getColor());
            int i22 = qVar.f401667c;
            if (i22 != 0) {
                paint2.setStrokeWidth(i22);
            }
            int iSave = canvas.save();
            try {
                int iMin = Math.min(i19, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i23 = qVar.f401668d;
                if (i23 != 0 && i23 <= iMin) {
                    iMin = i23;
                }
                int i24 = (i19 - iMin) / 2;
                if (i13 <= 0) {
                    i12 -= i19;
                }
                int i25 = i12 + i24;
                int i26 = i25 + iMin;
                int iDescent = (i15 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin / 2);
                int i27 = iMin + iDescent;
                int i28 = this.f401689f;
                if (i28 == 0 || i28 == 1) {
                    RectF rectF = this.f401687d;
                    rectF.set(i25, iDescent, i26, i27);
                    paint2.setStyle(i28 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i25, iDescent, i26, i27);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return this.f401685b.f401665a;
    }
}
