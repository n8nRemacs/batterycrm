package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyListLayoutInfo.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z {
    public static final int a(@Y61.k Y y12) {
        List<K> listH = y12.h();
        int size = listH.size();
        int size2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            size2 += listH.get(i12).getSize();
        }
        return y12.g() + (size2 / listH.size());
    }
}
