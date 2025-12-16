package x0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: FontFeatureSpan.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx0/b;", "Landroid/text/style/MetricAffectingSpan;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f441900b;

    public b(@Y61.k String str) {
        this.f441900b = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f441900b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@Y61.k TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f441900b);
    }
}
