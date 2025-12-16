package x0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.android.L;
import androidx.compose.ui.text.android.O;
import kotlin.Metadata;

/* compiled from: IndentationFixSpan.android.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx0/c;", "Landroid/text/style/LeadingMarginSpan;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(@Y61.l Canvas canvas, @Y61.l Paint paint, int i12, int i13, int i14, int i15, int i16, @Y61.l CharSequence charSequence, int i17, int i18, boolean z12, @Y61.l Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i17)) != layout.getLineCount() - 1) {
            return;
        }
        L l12 = O.f42001a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fB2 = d.b(layout, lineForOffset, paint) + d.a(layout, lineForOffset, paint);
            if (fB2 == 0.0f) {
                return;
            }
            canvas.translate(fB2, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return 0;
    }
}
