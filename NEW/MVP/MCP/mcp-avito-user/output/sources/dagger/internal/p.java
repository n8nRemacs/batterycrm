package dagger.internal;

import dagger.internal.AbstractC39696a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MapFactory.java */
/* loaded from: classes8.dex */
public final class p<K, V> extends AbstractC39696a<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    public static final l f393950b = l.a(Collections.emptyMap());

    /* compiled from: MapFactory.java */
    public static final class b<K, V> extends AbstractC39696a.AbstractC11030a<K, V, V> {
        public b(int i12, a aVar) {
            super(i12);
        }

        public final p<K, V> b() {
            return new p<>(this.f393943a, null);
        }
    }

    public p() {
        throw null;
    }

    public p(Map map, a aVar) {
        super(map);
    }

    public static <K, V> b<K, V> a(int i12) {
        return new b<>(i12, null);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Map<K, u<V>> map = this.f393942a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry<K, u<V>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
