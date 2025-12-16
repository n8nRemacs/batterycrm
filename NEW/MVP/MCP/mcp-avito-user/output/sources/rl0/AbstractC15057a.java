package Rl0;

import Y61.k;
import Y61.l;
import Z41.g;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RawParamsMap.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0006"}, d2 = {"LRl0/a;", "", "K", "V", "", "", "_common_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC15057a<K, V> implements Map<String, Object>, g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f14603b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Object> f14604c;

    public AbstractC15057a(String str, Map<K, ? extends V> map, Map<String, Object> map2) {
        this.f14603b = str;
        this.f14604c = map2;
        for (Map.Entry<K, V> entry : C35755b0.c(map).entrySet()) {
            b(entry.getValue(), entry.getKey().toString());
        }
    }

    public final List a(Object obj, List list) {
        if (obj instanceof Iterable) {
            ArrayList arrayListC = C42745f0.C((Iterable) obj);
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListC.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C42745f0.h(a(next, C42745f0.i0(String.valueOf(i12), list)), arrayList);
                i12 = i13;
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            return Collections.singletonList(new Q(this.f14603b + C42745f0.O(list, "][", "[", "]", null, 56), obj));
        }
        LinkedHashMap linkedHashMapC = C35755b0.c((Map) obj);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : linkedHashMapC.entrySet()) {
            C42745f0.h(a(entry.getValue(), C42745f0.i0(String.valueOf(entry.getKey()), list)), arrayList2);
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Object b(@k Object obj, @k String str) {
        for (Q q12 : a(obj, Collections.singletonList(str.toString()))) {
            this.f14604c.put(q12.f406619b, q12.f406620c);
        }
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f14604c.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f14604c.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(@l Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f14604c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return this.f14604c.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f14604c.get((String) obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f14604c.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f14604c.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        b(obj, str);
        return null;
    }

    @Override // java.util.Map
    public final void putAll(@k Map<? extends String, ? extends Object> map) {
        this.f14604c.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f14604c.remove((String) obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14604c.size();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return this.f14604c.values();
    }

    public /* synthetic */ AbstractC15057a(String str, Map map, Map map2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? P0.c() : map, map2);
    }

    public AbstractC15057a(@k String str, @k Map<K, ? extends V> map) {
        this(str, map, new LinkedHashMap());
    }

    public /* synthetic */ AbstractC15057a(String str, Map map, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? P0.c() : map);
    }
}
