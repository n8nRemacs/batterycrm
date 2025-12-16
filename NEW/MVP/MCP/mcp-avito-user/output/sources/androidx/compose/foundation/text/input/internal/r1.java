package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* compiled from: ToCharArray.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r1 {
    public static final void a(@Y61.k CharSequence charSequence, @Y61.k char[] cArr, int i12, int i13, int i14) {
        if (charSequence instanceof androidx.compose.foundation.text.input.l) {
            a(((androidx.compose.foundation.text.input.l) charSequence).f31511c, cArr, i12, i13, i14);
            return;
        }
        while (i13 < i14) {
            cArr[i12] = charSequence.charAt(i13);
            i13++;
            i12++;
        }
    }
}
