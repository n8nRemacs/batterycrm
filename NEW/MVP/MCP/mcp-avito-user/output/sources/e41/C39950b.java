package e41;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j.N;

/* compiled from: SuperScriptSpan.java */
/* renamed from: e41.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39950b extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@N TextPaint textPaint) {
        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
    }
}
