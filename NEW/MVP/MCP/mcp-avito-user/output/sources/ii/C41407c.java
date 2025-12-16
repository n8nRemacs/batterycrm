package ii;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;

/* compiled from: BeduinSalesStrikeThroughSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii/c;", "Landroid/text/style/ReplacementSpan;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ii.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41407c extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Drawable f398682b;

    public C41407c(@k Drawable drawable) {
        this.f398682b = drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@k Canvas canvas, @k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
        canvas.drawText(charSequence, i12, i13, f12, i15, paint);
        canvas.save();
        Drawable drawable = this.f398682b;
        canvas.translate(f12, (((i16 - i14) / 2) + i14) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@k Paint paint, @l CharSequence charSequence, int i12, int i13, @l Paint.FontMetricsInt fontMetricsInt) {
        int iMeasureText = (int) paint.measureText(charSequence, i12, i13);
        if (fontMetricsInt != null) {
            Drawable drawable = this.f398682b;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = intrinsicWidth == 0 ? 0 : (int) ((iMeasureText * drawable.getIntrinsicHeight()) / intrinsicWidth);
            fontMetricsInt.top = (int) paint.getFontMetrics().top;
            fontMetricsInt.ascent = (int) paint.getFontMetrics().ascent;
            fontMetricsInt.descent = (int) paint.getFontMetrics().descent;
            fontMetricsInt.bottom = (int) paint.getFontMetrics().bottom;
            drawable.setBounds(0, 0, iMeasureText, intrinsicHeight);
        }
        return iMeasureText;
    }
}
