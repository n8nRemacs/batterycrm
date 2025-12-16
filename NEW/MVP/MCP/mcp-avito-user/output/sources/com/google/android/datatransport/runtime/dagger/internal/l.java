package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: MapFactory.java */
/* loaded from: classes10.dex */
public final class l<K, V> extends com.google.android.datatransport.runtime.dagger.internal.a<K, V, V> {

    /* compiled from: MapFactory.java */
    public static final class b<K, V> extends a.AbstractC10564a<K, V, V> {
        public b(int i12, a aVar) {
            super(i12);
        }
    }

    static {
        Map mapEmptyMap = Collections.emptyMap();
        if (mapEmptyMap == null) {
            throw new NullPointerException("instance cannot be null");
        }
        new j(mapEmptyMap);
    }

    public l() {
        throw null;
    }

    public l(Map map, a aVar) {
        super(map);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Map<K, Provider<V>> map = this.f343129a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry<K, Provider<V>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
