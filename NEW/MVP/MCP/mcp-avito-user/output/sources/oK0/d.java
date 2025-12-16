package OK0;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import androidx.appcompat.app.r;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Re23StrikethroughSpan.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOK0/d;", "Landroid/text/style/ReplacementSpan;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Drawable f12199b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f12200c = new LinkedHashMap();

    public d(@k Drawable drawable) {
        this.f12199b = drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@k Canvas canvas, @k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
        canvas.drawText(charSequence, i12, i13, f12, i15, paint);
        canvas.save();
        LinkedHashMap linkedHashMap = this.f12200c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append(i13);
        Rect rect = (Rect) linkedHashMap.get(sb2.toString());
        Drawable drawable = this.f12199b;
        if (rect != null) {
            drawable.setBounds(rect);
        }
        canvas.translate(f12, r.f(i16, i14, 2, i14) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@k Paint paint, @k CharSequence charSequence, int i12, int i13, @l Paint.FontMetricsInt fontMetricsInt) {
        int iMeasureText = (int) paint.measureText(charSequence, i12, i13);
        int i14 = i13 - 1;
        char cCharAt = charSequence.charAt(i14);
        if (fontMetricsInt != null) {
            fontMetricsInt.top = (int) paint.getFontMetrics().top;
            fontMetricsInt.ascent = (int) paint.getFontMetrics().ascent;
            fontMetricsInt.descent = (int) paint.getFontMetrics().descent;
            fontMetricsInt.bottom = (int) paint.getFontMetrics().bottom;
            int i15 = fontMetricsInt.descent - fontMetricsInt.ascent;
            LinkedHashMap linkedHashMap = this.f12200c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            if (cCharAt == '\n') {
                i13 = i14;
            }
            sb2.append(i13);
            linkedHashMap.put(sb2.toString(), new Rect(0, 0, iMeasureText, i15));
        }
        return iMeasureText;
    }
}
