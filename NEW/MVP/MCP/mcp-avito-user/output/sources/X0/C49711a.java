package x0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BaselineShiftSpan.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx0/a;", "Landroid/text/style/MetricAffectingSpan;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49711a extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f441899b;

    public C49711a(float f12) {
        this.f441899b = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f441899b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@Y61.k TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f441899b);
    }
}
