package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42742e;

/* compiled from: PersistentOrderedMapBuilderContentViews.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/j;", "K", "V", "", "Lkotlin/collections/e;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j<K, V> extends AbstractC42742e<V> implements Collection<V>, Z41.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d<K, V> f38385b;

    public j(@Y61.k d<K, V> dVar) {
        this.f38385b = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f38385b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f38385b.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC42742e
    public final int getSize() {
        return this.f38385b.f38374e.getF38339g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<V> iterator() {
        return new k(this.f38385b);
    }
}
