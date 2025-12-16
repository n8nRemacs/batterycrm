package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMultimap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class O0<K, V> extends S0 implements R2<K, V> {
    @Override // com.google.common.collect.R2
    public InterfaceC37338g3<K> Q() {
        return X().Q();
    }

    @Override // com.google.common.collect.R2
    public final boolean R(@I41.a Object obj, @I41.a Object obj2) {
        return X().R(obj, obj2);
    }

    @Override // com.google.common.collect.R2
    public Map<K, Collection<V>> V() {
        return X().V();
    }

    @Override // com.google.common.collect.S0
    /* renamed from: Y */
    public abstract R2<K, V> X();

    @InterfaceC19845a
    public Collection<V> a(@I41.a Object obj) {
        return X().a(obj);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3
    public Collection<Map.Entry<K, V>> b() {
        return X().b();
    }

    @Override // com.google.common.collect.R2
    public void clear() {
        X().clear();
    }

    @Override // com.google.common.collect.R2
    public final boolean containsKey(@I41.a Object obj) {
        return X().containsKey(obj);
    }

    @Override // com.google.common.collect.R2
    public final boolean equals(@I41.a Object obj) {
        return obj == this || X().equals(obj);
    }

    public Collection<V> get(@InterfaceC37434x3 K k12) {
        return X().get(k12);
    }

    @Override // com.google.common.collect.R2
    public final int hashCode() {
        return X().hashCode();
    }

    @Override // com.google.common.collect.R2
    public final boolean isEmpty() {
        return X().isEmpty();
    }

    @Override // com.google.common.collect.R2
    public Set<K> keySet() {
        return X().keySet();
    }

    @Override // com.google.common.collect.R2
    @InterfaceC19845a
    public boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        return X().put(k12, v12);
    }

    @Override // com.google.common.collect.R2
    @InterfaceC19845a
    public boolean remove(@I41.a Object obj, @I41.a Object obj2) {
        return X().remove(obj, obj2);
    }

    @Override // com.google.common.collect.R2
    public final int size() {
        return X().size();
    }

    @Override // com.google.common.collect.R2
    public Collection<V> values() {
        return X().values();
    }
}
