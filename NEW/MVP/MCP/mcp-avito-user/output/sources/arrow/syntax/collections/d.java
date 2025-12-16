package arrow.syntax.collections;

import Y41.p;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: list.kt */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0005\u001a\u0002H\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "R", "T", "L", "head", "tail", "invoke", "(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 1, 9})
/* loaded from: classes10.dex */
final class d extends N implements p<Object, List<Object>, List<Object>> {
    static {
        new d();
    }

    public d() {
        super(2);
    }

    @Override // Y41.p
    public final List<Object> invoke(Object obj, List<Object> list) {
        return C42745f0.h0(list, Collections.singletonList(obj));
    }
}
