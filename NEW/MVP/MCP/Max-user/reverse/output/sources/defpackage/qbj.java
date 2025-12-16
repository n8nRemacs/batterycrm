package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class qbj {
    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, w3g w3gVar) {
        int i6 = Build.VERSION.SDK_INT;
        StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(f, 1.0f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i5).setTextDirection(w3gVar == y3g.a ? TextDirectionHeuristics.LTR : w3gVar == y3g.b ? TextDirectionHeuristics.RTL : w3gVar == y3g.c ? TextDirectionHeuristics.FIRSTSTRONG_LTR : w3gVar == y3g.d ? TextDirectionHeuristics.FIRSTSTRONG_RTL : w3gVar == y3g.e ? TextDirectionHeuristics.ANYRTL_LTR : w3gVar == x3g.c ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR).setBreakStrategy(0).setHyphenationFrequency(0).setIndents(null, null);
        indents.setJustificationMode(0);
        if (i6 >= 28) {
            indents.setUseLineSpacingFromFallbacks(false);
        }
        return indents.build();
    }
}
