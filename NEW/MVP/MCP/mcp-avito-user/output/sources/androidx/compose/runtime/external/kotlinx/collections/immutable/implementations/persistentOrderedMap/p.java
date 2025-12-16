package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.P;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PersistentOrderedMapContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/p;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class p<K, V> implements Iterator<a<V>>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Object f38391b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<K, a<V>> f38392c;

    /* renamed from: d, reason: collision with root package name */
    public int f38393d;

    public p(@Y61.k Map map, @Y61.l Object obj) {
        this.f38391b = obj;
        this.f38392c = map;
    }

    @Override // java.util.Iterator
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        a<V> aVar = this.f38392c.get(this.f38391b);
        if (aVar == null) {
            throw new ConcurrentModificationException(androidx.appcompat.app.r.o(this.f38391b, ") has changed after it was added to the persistent map.", new StringBuilder("Hash code of a key (")));
        }
        a<V> aVar2 = aVar;
        this.f38393d++;
        this.f38391b = aVar2.f38365c;
        return aVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38393d < this.f38392c.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
