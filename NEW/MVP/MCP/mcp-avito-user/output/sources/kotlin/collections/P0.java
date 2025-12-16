package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.sequences.o0;

@Metadata(d1 = {"kotlin/collections/Q0", "kotlin/collections/R0", "kotlin/collections/S0", "kotlin/collections/T0", "kotlin/collections/U0"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes8.dex */
public final class P0 extends U0 {
    @Y61.k
    public static C42770s0 b(@Y61.k Map map) {
        return new C42770s0(map.entrySet());
    }

    @Y61.k
    public static Map c() {
        return A0.f406637b;
    }

    @InterfaceC42733c0
    public static Object d(@Y61.k Map map, Object obj) {
        if (map instanceof N0) {
            ((N0) map).Y0();
            throw null;
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    @Y61.k
    public static HashMap e(@Y61.k kotlin.Q... qArr) {
        HashMap map = new HashMap(f(qArr.length));
        n(map, qArr);
        return map;
    }

    @kotlin.X
    public static int f(int i12) {
        if (i12 < 0) {
            return i12;
        }
        if (i12 < 3) {
            return i12 + 1;
        }
        if (i12 < 1073741824) {
            return (int) ((i12 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @Y61.k
    public static Map g(@Y61.k kotlin.Q... qArr) {
        if (qArr.length <= 0) {
            return A0.f406637b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f(qArr.length));
        n(linkedHashMap, qArr);
        return linkedHashMap;
    }

    @InterfaceC42733c0
    @Y61.k
    public static Map h(@Y61.k Map map, @Y61.k Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.keySet().removeAll(C42745f0.s(iterable));
        return S0.a(linkedHashMap);
    }

    @InterfaceC42733c0
    @Y61.k
    public static Map i(@Y61.k Map map, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return S0.a(linkedHashMap);
    }

    @Y61.k
    public static LinkedHashMap j(@Y61.k kotlin.Q... qArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f(qArr.length));
        n(linkedHashMap, qArr);
        return linkedHashMap;
    }

    @Y61.k
    public static LinkedHashMap k(@Y61.k Map map, @Y61.k Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @Y61.k
    public static Map l(@Y61.k Map map, @Y61.k kotlin.Q q12) {
        boolean zIsEmpty = map.isEmpty();
        B b12 = q12.f406620c;
        A a12 = q12.f406619b;
        if (zIsEmpty) {
            return Collections.singletonMap(a12, b12);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a12, b12);
        return linkedHashMap;
    }

    public static void m(@Y61.k Map map, @Y61.k Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kotlin.Q q12 = (kotlin.Q) it.next();
            map.put(q12.f406619b, q12.f406620c);
        }
    }

    public static void n(@Y61.k Map map, @Y61.k kotlin.Q[] qArr) {
        for (kotlin.Q q12 : qArr) {
            map.put(q12.f406619b, q12.f406620c);
        }
    }

    @Y61.k
    public static List o(@Y61.k Map map) {
        if (map.size() == 0) {
            return C42784z0.f406748b;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C42784z0.f406748b;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(new kotlin.Q(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new kotlin.Q(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new kotlin.Q(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    @Y61.k
    public static Map p(@Y61.k Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m(linkedHashMap, iterable);
            return S0.a(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return A0.f406637b;
        }
        if (size == 1) {
            kotlin.Q q12 = (kotlin.Q) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            return Collections.singletonMap(q12.f406619b, q12.f406620c);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(f(collection.size()));
        m(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    @InterfaceC42733c0
    @Y61.k
    public static Map q(@Y61.k Map map) {
        int size = map.size();
        if (size == 0) {
            return A0.f406637b;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    @Y61.k
    public static Map r(@Y61.k kotlin.sequences.o0 o0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t(o0Var, linkedHashMap);
        return S0.a(linkedHashMap);
    }

    @Y61.k
    public static Map s(@Y61.k kotlin.Q[] qArr) {
        int length = qArr.length;
        if (length == 0) {
            return A0.f406637b;
        }
        if (length == 1) {
            kotlin.Q q12 = qArr[0];
            return Collections.singletonMap(q12.f406619b, q12.f406620c);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f(qArr.length));
        n(linkedHashMap, qArr);
        return linkedHashMap;
    }

    @Y61.k
    public static void t(@Y61.k kotlin.sequences.o0 o0Var, @Y61.k LinkedHashMap linkedHashMap) {
        o0.a aVar = new o0.a(o0Var);
        while (aVar.f410559b.hasNext()) {
            kotlin.Q q12 = (kotlin.Q) aVar.next();
            linkedHashMap.put(q12.f406619b, q12.f406620c);
        }
    }
}
