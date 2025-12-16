package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractC22062a;
import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentOrderedMapBuilderContentViews.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/e;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/a;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e<K, V> extends AbstractC22062a<Map.Entry<K, V>, K, V> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d<K, V> f38375b;

    public e(@Y61.k d<K, V> dVar) {
        this.f38375b = dVar;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractC22062a
    public final boolean a(@Y61.k Map.Entry<? extends K, ? extends V> entry) {
        K key = entry.getKey();
        d<K, V> dVar = this.f38375b;
        V v12 = dVar.get(key);
        if (v12 != null) {
            return v12.equals(entry.getValue());
        }
        if (entry.getValue() == null) {
            if (dVar.f38374e.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractC22062a
    public final boolean b(@Y61.k Map.Entry<? extends K, ? extends V> entry) {
        return this.f38375b.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f38375b.clear();
    }

    @Override // kotlin.collections.AbstractC42748h
    /* renamed from: getSize */
    public final int getF395508f() {
        return this.f38375b.f38374e.getF38339g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @Y61.k
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new f(this.f38375b);
    }
}
