package androidx.compose.ui.text.android;

import android.text.Layout;
import kotlin.Metadata;

/* compiled from: LayoutCompat.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {
    public static final int a(@Y61.k Layout layout, @j.F int i12, boolean z12) {
        if (i12 <= 0) {
            return 0;
        }
        if (i12 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i12);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i12 || layout.getLineEnd(lineForOffset) == i12) ? lineStart == i12 ? z12 ? lineForOffset - 1 : lineForOffset : z12 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }
}
