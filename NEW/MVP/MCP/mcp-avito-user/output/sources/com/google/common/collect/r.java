package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37328f;
import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: AbstractSortedSetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
abstract class r<K, V> extends AbstractC37376n<K, V> implements InterfaceC37363k4<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC37434x3 Object obj) {
        return get((r<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f
    public final Collection o() {
        SortedSet<V> sortedSetK = k();
        return sortedSetK instanceof NavigableSet ? W3.j((NavigableSet) sortedSetK) : Collections.unmodifiableSortedSet(sortedSetK);
    }

    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f
    public final Collection q(Collection collection) {
        return collection instanceof NavigableSet ? W3.j((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f
    public final Collection<V> s(@InterfaceC37434x3 K k12, Collection<V> collection) {
        return collection instanceof NavigableSet ? new AbstractC37328f.m(k12, (NavigableSet) collection, null) : new AbstractC37328f.o(k12, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.AbstractC37376n
    /* renamed from: v */
    public final Set o() {
        SortedSet<V> sortedSetK = k();
        return sortedSetK instanceof NavigableSet ? W3.j((NavigableSet) sortedSetK) : Collections.unmodifiableSortedSet(sortedSetK);
    }

    @Override // com.google.common.collect.AbstractC37376n
    /* renamed from: w */
    public abstract SortedSet<V> k();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public /* bridge */ /* synthetic */ Set get(@InterfaceC37434x3 Object obj) {
        return get((r<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    public SortedSet<V> a(@I41.a Object obj) {
        return (SortedSet) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public SortedSet<V> get(@InterfaceC37434x3 K k12) {
        return (SortedSet) super.get((r<K, V>) k12);
    }
}
