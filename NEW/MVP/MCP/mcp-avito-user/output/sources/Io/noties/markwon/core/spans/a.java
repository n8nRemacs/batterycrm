package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.q;
import j.N;

/* compiled from: BlockQuoteSpan.java */
/* loaded from: classes8.dex */
public class a implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401682b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f401683c = i.f401698a;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f401684d = i.f401700c;

    public a(@N q qVar) {
        this.f401682b = qVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, int i18, boolean z12, Layout layout) {
        q qVar = this.f401682b;
        int i19 = qVar.f401666b;
        if (i19 == 0) {
            i19 = (int) ((qVar.f401665a * 0.25f) + 0.5f);
        }
        Paint paint2 = this.f401684d;
        paint2.set(paint);
        qVar.getClass();
        int iA2 = io.noties.markwon.utils.a.a(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iA2);
        int i22 = i13 * i19;
        int i23 = i12 + i22;
        int i24 = i22 + i23;
        int iMin = Math.min(i23, i24);
        int iMax = Math.max(i23, i24);
        Rect rect = this.f401683c;
        rect.set(iMin, i14, iMax, i16);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return this.f401682b.f401665a;
    }
}
