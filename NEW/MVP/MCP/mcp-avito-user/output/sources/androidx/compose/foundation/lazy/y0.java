package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyListState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/lazy/w0;", "invoke", "(Ljava/util/List;)Landroidx/compose/foundation/lazy/w0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class y0 extends kotlin.jvm.internal.N implements Y41.l<List<? extends Integer>, w0> {
    @Override // Y41.l
    public final w0 invoke(List<? extends Integer> list) {
        List<? extends Integer> list2 = list;
        return new w0(list2.get(0).intValue(), list2.get(1).intValue(), null);
    }
}
