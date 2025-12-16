package androidx.compose.runtime.saveable;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MapSaver.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "list", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class d extends N implements Y41.l<List<? extends Object>, Object> {
    @Override // Y41.l
    public final Object invoke(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list2.size() % 2 != 0) {
            throw new IllegalStateException("non-zero remainder");
        }
        for (int i12 = 0; i12 < list2.size(); i12 += 2) {
            linkedHashMap.put((String) list2.get(i12), list2.get(i12 + 1));
        }
        throw null;
    }
}
