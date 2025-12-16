package kotlin.comparisons;

import java.util.Comparator;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/comparisons/k", "kotlin/comparisons/l", "kotlin/comparisons/m"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes8.dex */
public final class a extends m {
    @Y61.k
    public static androidx.camera.core.internal.compat.workaround.e a(@Y61.k Y41.l... lVarArr) {
        if (lVarArr.length > 0) {
            return new androidx.camera.core.internal.compat.workaround.e(lVarArr, 2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int b(@Y61.l Comparable comparable, @Y61.l Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    @InterfaceC42733c0
    public static int c(int i12, @Y61.k int... iArr) {
        for (int i13 : iArr) {
            i12 = Math.max(i12, i13);
        }
        return i12;
    }

    @Y61.k
    public static Comparator d() {
        return n.f406749b;
    }
}
