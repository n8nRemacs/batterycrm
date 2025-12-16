package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okio.b0;

/* compiled from: SegmentedByteString.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes7.dex */
public final class k {
    public static final int a(@Y61.k b0 b0Var, int i12) {
        int i13;
        int i14 = i12 + 1;
        int length = b0Var.f420063g.length - 1;
        int i15 = 0;
        while (true) {
            if (i15 <= length) {
                i13 = (i15 + length) >>> 1;
                int i16 = b0Var.f420064h[i13];
                if (i16 >= i14) {
                    if (i16 <= i14) {
                        break;
                    }
                    length = i13 - 1;
                } else {
                    i15 = i13 + 1;
                }
            } else {
                i13 = (-i15) - 1;
                break;
            }
        }
        return i13 >= 0 ? i13 : ~i13;
    }
}
