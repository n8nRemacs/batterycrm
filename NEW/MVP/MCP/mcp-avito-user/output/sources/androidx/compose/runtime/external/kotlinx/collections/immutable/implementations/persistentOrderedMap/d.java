package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC42746g;
import kotlin.jvm.internal.L;

/* compiled from: PersistentOrderedMapBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/d;", "K", "V", "Lkotlin/collections/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<K, V> extends AbstractC42746g<K, V> implements h.a<K, V> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public c<K, V> f38371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Object f38372c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Object f38373d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> f38374e;

    public d(@Y61.k c<K, V> cVar) {
        this.f38371b = cVar;
        this.f38372c = cVar.f38368e;
        this.f38373d = cVar.f38369f;
        this.f38374e = cVar.f38370g.builder();
    }

    @Override // kotlin.collections.AbstractC42746g
    @Y61.k
    public final Set<Map.Entry<K, V>> a() {
        return new e(this);
    }

    @Override // kotlin.collections.AbstractC42746g
    @Y61.k
    public final Set<K> b() {
        return new g(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h.a
    @Y61.k
    /* renamed from: build */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> d() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>> dVarD = this.f38374e.d();
        c<K, V> cVar = this.f38371b;
        if (dVarD != cVar.f38370g) {
            cVar = new c<>(this.f38372c, this.f38373d, dVarD);
        }
        this.f38371b = cVar;
        return cVar;
    }

    @Override // kotlin.collections.AbstractC42746g
    @Y61.k
    public final Collection<V> c() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f38374e.clear();
        i0.c cVar = i0.c.f398334a;
        this.f38372c = cVar;
        this.f38373d = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f38374e.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public final V get(Object obj) {
        a<V> aVar = this.f38374e.get(obj);
        if (aVar != null) {
            return aVar.f38363a;
        }
        return null;
    }

    @Override // kotlin.collections.AbstractC42746g
    /* renamed from: getSize */
    public final int getF38339g() {
        return this.f38374e.getF38339g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public final V put(K k12, V v12) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> fVar = this.f38374e;
        a aVar = (a) fVar.get(k12);
        if (aVar != null) {
            V v13 = aVar.f38363a;
            if (v13 == v12) {
                return v12;
            }
            fVar.put(k12, new a(v12, aVar.f38364b, aVar.f38365c));
            return v13;
        }
        if (isEmpty()) {
            this.f38372c = k12;
            this.f38373d = k12;
            i0.c cVar = i0.c.f398334a;
            fVar.put(k12, new a(v12, cVar, cVar));
            return null;
        }
        Object obj = this.f38373d;
        a aVar2 = (a) fVar.get(obj);
        Object obj2 = aVar2.f38365c;
        i0.c cVar2 = i0.c.f398334a;
        fVar.put(obj, new a(aVar2.f38363a, aVar2.f38364b, k12));
        fVar.put(k12, new a(v12, obj, cVar2));
        this.f38373d = k12;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public final V remove(Object obj) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> fVar = this.f38374e;
        a aVar = (a) fVar.remove(obj);
        if (aVar == null) {
            return null;
        }
        Object obj2 = i0.c.f398334a;
        Object obj3 = aVar.f38365c;
        Object obj4 = aVar.f38364b;
        if (obj4 != obj2) {
            a aVar2 = (a) fVar.get(obj4);
            fVar.put(obj4, new a(aVar2.f38363a, aVar2.f38364b, obj3));
        } else {
            this.f38372c = obj3;
        }
        if (obj3 != obj2) {
            a aVar3 = (a) fVar.get(obj3);
            fVar.put(obj3, new a(aVar3.f38363a, obj4, aVar3.f38365c));
        } else {
            this.f38373d = obj4;
        }
        return aVar.f38363a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        a<V> aVar = this.f38374e.get(obj);
        if (aVar == null || !L.f(aVar.f38363a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
