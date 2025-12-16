package fV;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotAlignedDrawableSpan.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfV/f;", "Landroid/text/style/ReplacementSpan;", "_design-modules_icons_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends ReplacementSpan {
    @Override // android.text.style.ReplacementSpan
    public final void draw(@k Canvas canvas, @k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
        int iSave = canvas.save();
        canvas.translate(f12, i14 + ((i15 + paint.getFontMetricsInt().ascent) - i14));
        try {
            throw null;
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@k Paint paint, @k CharSequence charSequence, int i12, int i13, @l Paint.FontMetricsInt fontMetricsInt) {
        int i14 = paint.getFontMetricsInt().descent;
        int i15 = paint.getFontMetricsInt().ascent;
        throw null;
    }
}
