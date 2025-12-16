package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import kotlin.Metadata;

/* compiled from: TextFieldBuffer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {
    public static final long a(int i12, int i13, long j12, int i14) {
        int i15;
        int iG2 = v0.g(j12);
        int iF2 = v0.f(j12);
        if (iF2 < i12) {
            return j12;
        }
        if (iG2 <= i12 && i13 <= iF2) {
            i15 = i14 - (i13 - i12);
            if (iG2 == iF2) {
            }
            i12 = iF2 + i15;
            return w0.a(iG2, i12);
        }
        if (iG2 > i12 && iF2 < i13) {
            i12 += i14;
            iG2 = i12;
        } else if (iG2 >= i13) {
            i15 = i14 - (i13 - i12);
        } else if (i12 < iG2) {
            iG2 = i12 + i14;
            i12 = (i14 - (i13 - i12)) + iF2;
        }
        return w0.a(iG2, i12);
        iG2 += i15;
        i12 = iF2 + i15;
        return w0.a(iG2, i12);
    }

    public static final void b(@Y61.k i iVar, int i12, int i13) {
        iVar.g(w0.a(kotlin.ranges.s.g(i12, 0, iVar.f30757d.length()), kotlin.ranges.s.g(i13, 0, iVar.f30757d.length())));
    }
}
