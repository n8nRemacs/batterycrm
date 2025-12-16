package io.noties.markwon.core.spans;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* compiled from: LastLineSpacingSpan.java */
/* loaded from: classes8.dex */
public class h implements LineHeightSpan {
    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i12, int i13, int i14, int i15, Paint.FontMetricsInt fontMetricsInt) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(this);
        if (spanEnd == i13 || spanEnd == i13 - 1) {
            fontMetricsInt.descent = fontMetricsInt.descent;
            fontMetricsInt.bottom = fontMetricsInt.bottom;
        }
    }
}
