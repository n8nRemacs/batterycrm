package shark.internal;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.P0;
import shark.internal.C;

/* compiled from: Comparisons.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2", "shark/internal/DominatorTree$$special$$inlined$sortBy$1"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class D<T> implements Comparator<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        ((C.a) P0.d(null, Long.valueOf(((Number) t12).longValue()))).getClass();
        ((C.a) P0.d(null, Long.valueOf(((Number) t13).longValue()))).getClass();
        return kotlin.comparisons.a.b(0, 0);
    }
}
