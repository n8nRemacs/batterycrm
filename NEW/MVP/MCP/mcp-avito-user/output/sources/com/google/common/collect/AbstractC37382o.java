package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: AbstractSortedKeySortedSetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37382o<K, V> extends r<K, V> {
    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
    public final Set<K> e() {
        return n();
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> V() {
        return (SortedMap) super.V();
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }
}
