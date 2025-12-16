package com.avito.android.util;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* compiled from: TypefaceSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/c6;", "Landroid/text/style/MetricAffectingSpan;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.c6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35769c6 extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Typeface f318854b;

    public C35769c6(@Y61.l Typeface typeface) {
        this.f318854b = typeface;
        if (typeface == null) {
            throw new IllegalArgumentException("typeface is null");
        }
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        int style = typeface != null ? typeface.getStyle() : 0;
        Typeface typeface2 = this.f318854b;
        int i12 = style & (~typeface2.getStyle());
        if ((i12 & 1) != 0) {
            textPaint.setFakeBoldText(true);
        }
        if ((i12 & 2) != 0) {
            textPaint.setTextSkewX(-0.25f);
        }
        textPaint.setTypeface(typeface2);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@Y61.k TextPaint textPaint) {
        a(textPaint);
    }
}
