package G21;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImagePlaceholderSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG21/a;", "Landroid/text/style/ReplacementSpan;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f6264b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6265c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6266d;

    public /* synthetic */ a(int i12, int i13, float f12, int i14, C42822w c42822w) {
        this((i14 & 4) != 0 ? 0.0f : f12, i12, i13);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@k Paint paint, @k CharSequence charSequence, int i12, int i13, @l Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            if (i12 == 0 && Build.VERSION.SDK_INT < 28) {
                fontMetricsInt.top = 0;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.bottom = 0;
                fontMetricsInt.descent = 0;
                fontMetricsInt.leading = 0;
            }
            float f12 = this.f6265c;
            float f13 = this.f6266d;
            int i14 = -((int) Math.ceil(f12 - f13));
            fontMetricsInt.ascent = Math.min(i14, fontMetricsInt.ascent);
            fontMetricsInt.top = Math.min(i14, fontMetricsInt.top);
            int iCeil = (int) Math.ceil(f13);
            fontMetricsInt.descent = Math.max(iCeil, fontMetricsInt.descent);
            fontMetricsInt.bottom = Math.max(iCeil, fontMetricsInt.bottom);
            fontMetricsInt.leading = fontMetricsInt.descent - fontMetricsInt.ascent;
        }
        return this.f6264b;
    }

    public a(float f12, int i12, int i13) {
        this.f6264b = i12;
        this.f6265c = i13;
        this.f6266d = f12;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@k Canvas canvas, @k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
    }
}
