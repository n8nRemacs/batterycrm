package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.g;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes8.dex */
final class t extends u<Object, Object> {
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.u
    public final void e() {
        if (!this.f409408e) {
            for (int i12 = 0; i12 < this.f409406c.size(); i12++) {
                u<K, V>.b bVar = this.f409406c.get(i12);
                if (((g.b) bVar.getKey()).isRepeated()) {
                    bVar.setValue(Collections.unmodifiableList((List) bVar.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : c()) {
                if (((g.b) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.u, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((g.b) obj, obj2);
    }
}
