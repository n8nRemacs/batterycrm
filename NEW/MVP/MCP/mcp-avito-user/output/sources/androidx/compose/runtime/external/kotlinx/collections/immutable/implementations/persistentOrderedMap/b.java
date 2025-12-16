package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import Z41.g;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/b;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/b;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b<K, V> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b<K, V> implements Map.Entry<K, V>, g.a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<K, a<V>> f38366d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public a<V> f38367e;

    public b(@Y61.k Map<K, a<V>> map, K k12, @Y61.k a<V> aVar) {
        super(k12, aVar.f38363a);
        this.f38366d = map;
        this.f38367e = aVar;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public final V getValue() {
        return this.f38367e.f38363a;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public final V setValue(V v12) {
        a<V> aVar = this.f38367e;
        a<V> aVar2 = new a<>(v12, aVar.f38364b, aVar.f38365c);
        this.f38367e = aVar2;
        this.f38366d.put(this.f38323b, aVar2);
        return aVar.f38363a;
    }
}
