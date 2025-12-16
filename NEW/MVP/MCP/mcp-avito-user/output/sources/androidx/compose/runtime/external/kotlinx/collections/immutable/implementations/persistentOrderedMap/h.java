package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/h;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h<K, V> implements Iterator<K>, Z41.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i<K, V> f38378b;

    public h(@Y61.k d<K, V> dVar) {
        this.f38378b = new i<>(dVar.f38372c, dVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38378b.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        i<K, V> iVar = this.f38378b;
        iVar.next();
        return (K) iVar.f38381d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f38378b.remove();
    }
}
