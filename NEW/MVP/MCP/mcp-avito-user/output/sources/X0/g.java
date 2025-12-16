package x0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: LineHeightSpan.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx0/g;", "Landroid/text/style/LineHeightSpan;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f441904b;

    public g(float f12) {
        this.f441904b = f12;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@Y61.k CharSequence charSequence, int i12, int i13, int i14, int i15, @Y61.k Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = iCeil;
        fontMetricsInt.ascent = iCeil - ((int) Math.ceil(this.f441904b));
    }
}
