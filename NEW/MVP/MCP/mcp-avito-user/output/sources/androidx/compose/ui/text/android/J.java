package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: StaticLayoutFactory.android.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/J;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class J {
    public J(@Y61.k CharSequence charSequence, int i12, int i13, @Y61.k TextPaint textPaint, int i14, @Y61.k TextDirectionHeuristic textDirectionHeuristic, @Y61.k Layout.Alignment alignment, int i15, @Y61.l TextUtils.TruncateAt truncateAt, int i16, float f12, float f13, int i17, boolean z12, boolean z13, int i18, int i19, int i22, int i23, @Y61.l int[] iArr, @Y61.l int[] iArr2) {
        if (i12 < 0 || i12 > i13) {
            C50028a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i13 < 0 || i13 > length) {
            C50028a.a("invalid end value");
        }
        if (i15 < 0) {
            C50028a.a("invalid maxLines value");
        }
        if (i14 < 0) {
            C50028a.a("invalid width value");
        }
        if (i16 < 0) {
            C50028a.a("invalid ellipsizedWidth value");
        }
        if (f12 >= 0.0f) {
            return;
        }
        C50028a.a("invalid lineSpacingMultiplier value");
    }

    public /* synthetic */ J(CharSequence charSequence, int i12, int i13, TextPaint textPaint, int i14, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i15, TextUtils.TruncateAt truncateAt, int i16, float f12, float f13, int i17, boolean z12, boolean z13, int i18, int i19, int i22, int i23, int[] iArr, int[] iArr2, int i24, C42822w c42822w) {
        this(charSequence, (i24 & 2) != 0 ? 0 : i12, i13, textPaint, i14, textDirectionHeuristic, alignment, i15, truncateAt, i16, f12, f13, i17, z12, z13, i18, i19, i22, i23, iArr, iArr2);
    }
}
