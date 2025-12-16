package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.appcompat.app.r;
import io.noties.markwon.core.q;
import j.N;

/* compiled from: ThematicBreakSpan.java */
/* loaded from: classes8.dex */
public class n implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401705b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f401706c = i.f401698a;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f401707d = i.f401700c;

    public n(@N q qVar) {
        this.f401705b = qVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, int i18, boolean z12, Layout layout) {
        int width;
        int iF2 = r.f(i16, i14, 2, i14);
        Paint paint2 = this.f401707d;
        paint2.set(paint);
        q qVar = this.f401705b;
        qVar.getClass();
        paint2.setColor(io.noties.markwon.utils.a.a(paint2.getColor(), 25));
        paint2.setStyle(Paint.Style.FILL);
        int i19 = qVar.f401671g;
        if (i19 >= 0) {
            paint2.setStrokeWidth(i19);
        }
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i13 > 0) {
            width = canvas.getWidth();
        } else {
            width = i12;
            i12 -= canvas.getWidth();
        }
        int i22 = iF2 - strokeWidth;
        int i23 = iF2 + strokeWidth;
        Rect rect = this.f401706c;
        rect.set(i12, i22, width, i23);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return 0;
    }
}
