package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42750i;

/* compiled from: PersistentOrderedMapContentViews.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/n;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "Lkotlin/collections/i;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n<K, V> extends AbstractC42750i<K> implements androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c<K, V> f38389c;

    public n(@Y61.k c<K, V> cVar) {
        this.f38389c = cVar;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f38389c.f38370g.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF406660f() {
        return this.f38389c.getF38330f();
    }

    @Override // kotlin.collections.AbstractC42750i, java.util.Collection, java.lang.Iterable, java.util.Set
    @Y61.k
    public final Iterator<K> iterator() {
        return new o(this.f38389c);
    }
}
