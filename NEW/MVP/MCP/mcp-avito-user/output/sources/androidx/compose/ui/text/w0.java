package androidx.compose.ui.text;

import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import y0.C50028a;

/* compiled from: TextRange.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w0 {
    public static final long a(int i12, int i13) {
        if (i12 < 0 || i13 < 0) {
            C50028a.a("start and end cannot be negative. [start: " + i12 + ", end: " + i13 + ']');
        }
        long j12 = (i13 & 4294967295L) | (i12 << 32);
        v0.a aVar = v0.f42734b;
        return j12;
    }

    public static final long b(int i12, long j12) {
        v0.a aVar = v0.f42734b;
        int i13 = (int) (j12 >> 32);
        int i14 = i13 < 0 ? 0 : i13;
        if (i14 > i12) {
            i14 = i12;
        }
        int i15 = (int) (4294967295L & j12);
        int i16 = i15 >= 0 ? i15 : 0;
        if (i16 <= i12) {
            i12 = i16;
        }
        return (i14 == i13 && i12 == i15) ? j12 : a(i14, i12);
    }

    @Y61.k
    public static final String c(long j12, @Y61.k CharSequence charSequence) {
        return charSequence.subSequence(v0.g(j12), v0.f(j12)).toString();
    }
}
