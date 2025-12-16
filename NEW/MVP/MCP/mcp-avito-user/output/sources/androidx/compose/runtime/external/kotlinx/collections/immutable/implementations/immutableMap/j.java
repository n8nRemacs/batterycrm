package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC42748h;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/j;", "K", "V", "", "Lkotlin/collections/h;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j<K, V> extends AbstractC42748h<K> implements Set<K>, Z41.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f<K, V> f38346b;

    public j(@Y61.k f<K, V> fVar) {
        this.f38346b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f38346b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f38346b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC42748h
    /* renamed from: getSize */
    public final int getF395508f() {
        return this.f38346b.getF38339g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @Y61.k
    public final Iterator<K> iterator() {
        v[] vVarArr = new v[8];
        for (int i12 = 0; i12 < 8; i12++) {
            vVarArr[i12] = new x();
        }
        return new k(this.f38346b, vVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f<K, V> fVar = this.f38346b;
        if (!fVar.containsKey(obj)) {
            return false;
        }
        fVar.remove(obj);
        return true;
    }
}
