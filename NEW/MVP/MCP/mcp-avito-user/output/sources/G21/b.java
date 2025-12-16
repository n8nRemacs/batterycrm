package G21;

import Y61.k;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* compiled from: LetterSpacingSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG21/b;", "Landroid/text/style/MetricAffectingSpan;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f6267b;

    public b(float f12) {
        this.f6267b = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f6267b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@k TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f6267b);
    }
}
