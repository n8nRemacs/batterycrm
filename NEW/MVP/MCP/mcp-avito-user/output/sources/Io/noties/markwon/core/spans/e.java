package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j.N;

/* compiled from: CustomTypefaceSpan.java */
/* loaded from: classes8.dex */
public class e extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@N TextPaint textPaint) {
        textPaint.getTypeface();
        textPaint.setTypeface(null);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@N TextPaint textPaint) {
        textPaint.getTypeface();
        textPaint.setTypeface(null);
    }
}
