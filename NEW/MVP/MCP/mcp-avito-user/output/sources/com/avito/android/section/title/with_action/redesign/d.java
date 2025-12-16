package com.avito.android.section.title.with_action.redesign;

import Y61.k;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* compiled from: SectionTitleWithActionRedesignItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/title/with_action/redesign/d;", "Landroid/text/style/MetricAffectingSpan;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f264895b;

    public d(int i12) {
        this.f264895b = i12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@k TextPaint textPaint) {
        textPaint.baselineShift += this.f264895b;
    }
}
