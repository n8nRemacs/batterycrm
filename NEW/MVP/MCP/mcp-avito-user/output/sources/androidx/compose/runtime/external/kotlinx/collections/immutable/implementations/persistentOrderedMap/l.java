package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC42750i;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentOrderedMapContentViews.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/l;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "", "Lkotlin/collections/i;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l<K, V> extends AbstractC42750i<Map.Entry<? extends K, ? extends V>> implements androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c<K, V> f38387c;

    public l(@Y61.k c<K, V> cVar) {
        this.f38387c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        c<K, V> cVar = this.f38387c;
        V v12 = cVar.get(key);
        if (v12 != null) {
            return v12.equals(entry.getValue());
        }
        if (entry.getValue() == null) {
            return cVar.f38370g.containsKey(entry.getKey());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF395503d() {
        return this.f38387c.getF38330f();
    }

    @Override // kotlin.collections.AbstractC42750i, java.util.Collection, java.lang.Iterable, java.util.Set
    @Y61.k
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new m(this.f38387c);
    }
}
