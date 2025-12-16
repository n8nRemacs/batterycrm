package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: StringHelpers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N1 {
    public static final int a(int i12, @Y61.k CharSequence charSequence) {
        int length = charSequence.length();
        while (i12 < length) {
            if (charSequence.charAt(i12) == '\n') {
                return i12;
            }
            i12++;
        }
        return charSequence.length();
    }

    public static final int b(int i12, @Y61.k CharSequence charSequence) {
        while (i12 > 0) {
            if (charSequence.charAt(i12 - 1) == '\n') {
                return i12;
            }
            i12--;
        }
        return 0;
    }
}
