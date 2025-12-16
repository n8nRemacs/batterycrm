package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37328f;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractSetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37376n<K, V> extends AbstractC37328f<K, V> implements T3<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractC37376n() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC37434x3 Object obj) {
        return get((AbstractC37376n<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC37328f
    public <E> Collection<E> q(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractC37328f
    public Collection<V> s(@InterfaceC37434x3 K k12, Collection<V> collection) {
        return new AbstractC37328f.n(k12, (Set) collection);
    }

    @Override // com.google.common.collect.AbstractC37328f
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract Set<V> k();

    @Override // com.google.common.collect.AbstractC37328f
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set<V> o() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    public Set<V> a(@I41.a Object obj) {
        return (Set) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
    public Set<Map.Entry<K, V>> b() {
        return (Set) super.b();
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public Set<V> get(@InterfaceC37434x3 K k12) {
        return (Set) super.get((AbstractC37376n<K, V>) k12);
    }
}
