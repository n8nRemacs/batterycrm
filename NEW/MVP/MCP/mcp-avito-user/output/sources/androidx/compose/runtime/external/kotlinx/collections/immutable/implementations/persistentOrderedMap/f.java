package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/f;", "K", "V", "", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<K, V> implements Iterator<Map.Entry<K, V>>, Z41.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i<K, V> f38376b;

    public f(@Y61.k d<K, V> dVar) {
        this.f38376b = new i<>(dVar.f38372c, dVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38376b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        i<K, V> iVar = this.f38376b;
        return new b(iVar.f38380c.f38374e, iVar.f38381d, iVar.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f38376b.remove();
    }
}
