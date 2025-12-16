package OK0;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import kotlin.Metadata;

/* compiled from: ListItemSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOK0/c;", "Landroid/text/style/LeadingMarginSpan;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f12196b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SpannableStringBuilder f12197c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12198d;

    public c(int i12, @k SpannableStringBuilder spannableStringBuilder, int i13) {
        this.f12196b = i12;
        this.f12197c = spannableStringBuilder;
        this.f12198d = i13;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(@k Canvas canvas, @k Paint paint, int i12, int i13, int i14, int i15, int i16, @l CharSequence charSequence, int i17, int i18, boolean z12, @k Layout layout) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int lineTop = layout.getLineTop(layout.getLineForOffset(spanned.getSpanStart(this)));
            if (spanned.getSpanStart(this) == i17) {
                int i19 = this.f12196b * this.f12198d;
                TextPaint textPaint = paint instanceof TextPaint ? (TextPaint) paint : null;
                if (textPaint != null) {
                    canvas.save();
                    canvas.translate(i19, lineTop);
                    SpannableStringBuilder spannableStringBuilder = this.f12197c;
                    StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, canvas.getWidth()).setIncludePad(false).build().draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return (this.f12198d + 1) * this.f12196b;
    }
}
