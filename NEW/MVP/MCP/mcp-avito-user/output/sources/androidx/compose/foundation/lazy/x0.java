package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LazyListState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/lazy/w0;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/lazy/w0;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class x0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, w0, List<? extends Integer>> {
    static {
        new x0();
    }

    public x0() {
        super(2);
    }

    @Override // Y41.p
    public final List<? extends Integer> invoke(androidx.compose.runtime.saveable.x xVar, w0 w0Var) {
        w0 w0Var2 = w0Var;
        return C42745f0.U(Integer.valueOf(w0Var2.h()), Integer.valueOf(w0Var2.i()));
    }
}
