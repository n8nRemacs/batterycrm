package io.noties.markwon.core.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import io.noties.markwon.core.q;
import j.N;

/* compiled from: CodeSpan.java */
/* loaded from: classes8.dex */
public class d extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401693b;

    public d(@N q qVar) {
        this.f401693b = qVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        q qVar = this.f401693b;
        qVar.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        qVar.getClass();
        textPaint.bgColor = io.noties.markwon.utils.a.a(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f401693b.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
