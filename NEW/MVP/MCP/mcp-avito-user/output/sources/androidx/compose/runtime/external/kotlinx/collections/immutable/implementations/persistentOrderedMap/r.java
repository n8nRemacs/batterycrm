package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PersistentOrderedMapContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/r;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r<K, V> implements Iterator<V>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p<K, V> f38395b;

    public r(@Y61.k c<K, V> cVar) {
        this.f38395b = new p<>(cVar.f38370g, cVar.f38368e);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38395b.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        return this.f38395b.next().f38363a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
