package androidx.media3.common.text;

import android.text.SpannableStringBuilder;
import androidx.media3.common.util.J;

/* compiled from: SpanUtil.java */
@J
/* loaded from: classes.dex */
public final class f {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i12, int i13) {
        for (Object obj2 : spannableStringBuilder.getSpans(i12, i13, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i12 && spannableStringBuilder.getSpanEnd(obj2) == i13 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i12, i13, 33);
    }
}
