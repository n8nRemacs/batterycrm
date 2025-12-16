package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.M2;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class M0<K, V> extends S0 implements Map<K, V> {

    /* compiled from: ForwardingMap.java */
    public abstract class a extends M2.f<K, V> {
        @Override // com.google.common.collect.M2.f
        public final Map<K, V> e() {
            return null;
        }
    }

    /* compiled from: ForwardingMap.java */
    public class b extends M2.o<K, V> {
    }

    /* compiled from: ForwardingMap.java */
    public class c extends M2.D<K, V> {
    }

    @Override // com.google.common.collect.S0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract Map<K, V> X();

    public final boolean Z(@I41.a Object obj) {
        return C37325e2.d(new E2(entrySet().iterator()), obj);
    }

    @Override // java.util.Map
    public void clear() {
        X().clear();
    }

    public boolean containsKey(@I41.a Object obj) {
        return X().containsKey(obj);
    }

    public boolean containsValue(@I41.a Object obj) {
        return X().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return X().entrySet();
    }

    public boolean equals(@I41.a Object obj) {
        return obj == this || X().equals(obj);
    }

    @I41.a
    public V get(@I41.a Object obj) {
        return X().get(obj);
    }

    public int hashCode() {
        return X().hashCode();
    }

    public boolean isEmpty() {
        return X().isEmpty();
    }

    public Set<K> keySet() {
        return X().keySet();
    }

    @Override // java.util.Map
    @I41.a
    @InterfaceC19845a
    public V put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        return X().put(k12, v12);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        X().putAll(map);
    }

    @Override // java.util.Map
    @I41.a
    @InterfaceC19845a
    public V remove(@I41.a Object obj) {
        return X().remove(obj);
    }

    public int size() {
        return X().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return X().values();
    }
}
