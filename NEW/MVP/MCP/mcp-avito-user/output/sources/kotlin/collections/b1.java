package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/collections/c1", "kotlin/collections/d1", "kotlin/collections/e1"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes8.dex */
public final class b1 extends e1 {
    @kotlin.X
    @InterfaceC42733c0
    @Y61.k
    public static kotlin.collections.builders.j a(@Y61.k kotlin.collections.builders.j jVar) {
        kotlin.collections.builders.d<E, ?> dVar = jVar.f406711b;
        dVar.b();
        return dVar.f406693j > 0 ? jVar : kotlin.collections.builders.j.f406710c;
    }

    @Y61.k
    public static B0 b() {
        return B0.f406639b;
    }

    @Y61.k
    public static HashSet c(@Y61.k Object... objArr) {
        HashSet hashSet = new HashSet(P0.f(objArr.length));
        C42735a0.d(objArr, hashSet);
        return hashSet;
    }

    @Y61.k
    public static LinkedHashSet d(@Y61.k Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(objArr.length));
        C42735a0.d(objArr, linkedHashSet);
        return linkedHashSet;
    }

    @Y61.k
    public static LinkedHashSet e(@Y61.k Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(set.size()));
        boolean z12 = false;
        for (Object obj2 : set) {
            boolean z13 = true;
            if (!z12 && kotlin.jvm.internal.L.f(obj2, obj)) {
                z12 = true;
                z13 = false;
            }
            if (z13) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    @Y61.k
    public static Set f(@Y61.k Set set, @Y61.k Iterable iterable) {
        LinkedHashSet linkedHashSet;
        Collection<?> collectionS = C42745f0.s(iterable);
        if (collectionS.isEmpty()) {
            return C42745f0.P0(set);
        }
        if (collectionS instanceof Set) {
            linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!collectionS.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
        } else {
            linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionS);
        }
        return linkedHashSet;
    }

    @Y61.k
    public static LinkedHashSet g(@Y61.k Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(objArr.length));
        C42735a0.d(objArr, linkedHashSet);
        return linkedHashSet;
    }

    @Y61.k
    public static LinkedHashSet h(@Y61.k Set set, @Y61.k Iterable iterable) {
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        C42745f0.h(iterable, linkedHashSet);
        return linkedHashSet;
    }

    @Y61.k
    public static LinkedHashSet i(@Y61.k Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    @Y61.k
    public static Set j(Object obj) {
        return Collections.singleton(obj);
    }

    @Y61.k
    public static Set k(@Y61.k Object... objArr) {
        return C42756l.l0(objArr);
    }

    @InterfaceC42733c0
    @Y61.k
    public static LinkedHashSet l(@Y61.k Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    @Y61.k
    public static TreeSet m(@Y61.k Object... objArr) {
        TreeSet treeSet = new TreeSet();
        C42735a0.d(objArr, treeSet);
        return treeSet;
    }
}
