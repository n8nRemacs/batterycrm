package com.avito.android.lib.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.Metadata;

/* compiled from: VerticalCenteredImageSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/y;", "Landroid/text/style/ImageSpan;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y extends ImageSpan {
    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@Y61.k Canvas canvas, @Y61.k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @Y61.k Paint paint) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        canvas.save();
        int i17 = paint.getFontMetricsInt().descent;
        canvas.translate(f12, ((i15 + i17) - ((i17 - r3.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(@Y61.k Paint paint, @Y61.k CharSequence charSequence, int i12, int i13, @Y61.l Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 0;
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i14 = fontMetricsInt2.descent;
            int i15 = fontMetricsInt2.ascent;
            int i16 = ((i14 - i15) / 2) + i15;
            int i17 = (bounds.bottom - bounds.top) / 2;
            int i18 = i16 - i17;
            fontMetricsInt.ascent = i18;
            fontMetricsInt.top = i18;
            int i19 = i16 + i17;
            fontMetricsInt.bottom = i19;
            fontMetricsInt.descent = i19;
        }
        return bounds.right;
    }
}
