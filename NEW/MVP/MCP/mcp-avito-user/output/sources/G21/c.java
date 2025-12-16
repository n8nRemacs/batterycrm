package G21;

import Y61.k;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* compiled from: TypefaceSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG21/c;", "Landroid/text/style/MetricAffectingSpan;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Typeface f6268b;

    public c(@k Typeface typeface) {
        this.f6268b = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        textPaint.setTypeface(this.f6268b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@k TextPaint textPaint) {
        textPaint.setTypeface(this.f6268b);
    }
}
