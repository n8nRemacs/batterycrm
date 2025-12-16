package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.snapshots.F;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateMap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/z;", "K", "V", "Landroidx/compose/runtime/snapshots/A;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22180z<K, V> extends A<K, V, K> {
    public C22180z() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        G.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        G.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f38611b.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f38611b.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        F<K, V> f12 = this.f38611b;
        return new T(f12, ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) f12.c().f38624c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f38611b.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z12 = false;
            while (it.hasNext()) {
                if (this.f38611b.remove(it.next()) != null || z12) {
                    z12 = true;
                }
            }
            return z12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@Y61.k Collection<? extends Object> collection) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar;
        int i12;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        Set setP0 = C42745f0.P0(collection);
        F<K, V> f12 = this.f38611b;
        boolean z12 = false;
        do {
            synchronized (G.f38626a) {
                F.a aVar = (F.a) C22176v.h(f12.f38620b);
                hVar = aVar.f38624c;
                i12 = aVar.f38625d;
                G0 g02 = G0.f406611a;
            }
            h.a<K, ? extends V> aVarBuilder = hVar.builder();
            Object it = ((C22179y) f12.f38621c).iterator();
            while (((S) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((Q) it).next();
                if (!setP0.contains(entry.getKey())) {
                    aVarBuilder.remove(entry.getKey());
                    z12 = true;
                }
            }
            G0 g03 = G0.f406611a;
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVarD = aVarBuilder.d();
            if (kotlin.jvm.internal.L.f(hVarD, hVar)) {
                break;
            }
            F.a aVar2 = f12.f38620b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = F.b(f12, (F.a) C22176v.v(aVar2, f12, abstractC22167lJ), i12, hVarD);
            }
            C22176v.m(abstractC22167lJ, f12);
        } while (!zB2);
        return z12;
    }
}
