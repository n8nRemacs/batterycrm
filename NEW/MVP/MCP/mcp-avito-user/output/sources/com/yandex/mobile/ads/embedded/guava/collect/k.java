package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;
import com.yandex.mobile.ads.embedded.guava.collect.m0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public abstract class k<K, V> extends l implements Map<K, V> {
    public final boolean a(@I41.a Object obj) {
        return x.a(this, obj);
    }

    public abstract Map<K, V> b();

    public final boolean b(@I41.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((m0.a) entrySet()).equals(((Map) obj).entrySet());
    }

    public final int c() {
        return m0.a(entrySet());
    }

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@I41.a Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    @I41.a
    public V get(@I41.a Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    @I41.a
    @InterfaceC19845a
    public final V put(K k12, V v12) {
        return b().put(k12, v12);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    @I41.a
    @InterfaceC19845a
    public final V remove(@I41.a Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return b().values();
    }
}
