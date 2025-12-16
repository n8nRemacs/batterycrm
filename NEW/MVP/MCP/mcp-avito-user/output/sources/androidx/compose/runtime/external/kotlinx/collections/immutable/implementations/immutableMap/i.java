package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/i;", "K", "V", "", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, Z41.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g<K, V, Map.Entry<K, V>> f38345b;

    public i(@Y61.k f<K, V> fVar) {
        v[] vVarArr = new v[8];
        for (int i12 = 0; i12 < 8; i12++) {
            vVarArr[i12] = new z(this);
        }
        this.f38345b = new g<>(fVar, vVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38345b.f38333d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f38345b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f38345b.remove();
    }
}
