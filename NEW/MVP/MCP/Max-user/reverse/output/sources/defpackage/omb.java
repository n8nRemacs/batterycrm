package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes2.dex */
public final class omb implements LineHeightSpan {
    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i2 >= charSequence.length() || charSequence.charAt(i2 - 1) != '\n') {
            return;
        }
        float f = 8;
        fontMetricsInt.bottom = u45.c(f, vw4.d().getDisplayMetrics().density, fontMetricsInt.bottom);
        fontMetricsInt.descent = u45.c(f, vw4.d().getDisplayMetrics().density, fontMetricsInt.descent);
    }
}
