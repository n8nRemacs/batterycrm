package com.google.common.collect;

import com.google.common.collect.M2;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: AbstractNavigableMap.java */
@XY0.c
@InterfaceC37329f0
/* renamed from: com.google.common.collect.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37358k<K, V> extends M2.n<K, V> implements NavigableMap<K, V> {

    /* compiled from: AbstractNavigableMap.java */
    /* renamed from: com.google.common.collect.k$b */
    public final class b extends M2.AbstractC37296d<K, V> {
        public b(a aVar) {
        }

        @Override // com.google.common.collect.M2.AbstractC37296d
        public final Iterator<Map.Entry<K, V>> a0() {
            return AbstractC37358k.this.b();
        }

        @Override // com.google.common.collect.M2.AbstractC37296d
        public final NavigableMap<K, V> b0() {
            return AbstractC37358k.this;
        }
    }

    public abstract Iterator<Map.Entry<K, V>> b();

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> ceilingEntry(@InterfaceC37434x3 K k12) {
        return tailMap(k12, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K ceilingKey(@InterfaceC37434x3 K k12) {
        return (K) M2.g(ceilingEntry(k12));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap<K, V> descendingMap() {
        return new b(null);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> firstEntry() {
        return (Map.Entry) C37325e2.h(a(), null);
    }

    @Override // java.util.SortedMap
    @InterfaceC37434x3
    public final K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> floorEntry(@InterfaceC37434x3 K k12) {
        return headMap(k12, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K floorKey(@InterfaceC37434x3 K k12) {
        return (K) M2.g(floorEntry(k12));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap<K, V> headMap(@InterfaceC37434x3 K k12) {
        return headMap(k12, false);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> higherEntry(@InterfaceC37434x3 K k12) {
        return tailMap(k12, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K higherKey(@InterfaceC37434x3 K k12) {
        return (K) M2.g(higherEntry(k12));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> lastEntry() {
        return (Map.Entry) C37325e2.h(b(), null);
    }

    @Override // java.util.SortedMap
    @InterfaceC37434x3
    public final K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> lowerEntry(@InterfaceC37434x3 K k12) {
        return headMap(k12, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K lowerKey(@InterfaceC37434x3 K k12) {
        return (K) M2.g(lowerEntry(k12));
    }

    public NavigableSet<K> navigableKeySet() {
        return new M2.r(this);
    }

    @I41.a
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) C37325e2.j(a());
    }

    @I41.a
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) C37325e2.j(b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap<K, V> subMap(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
        return subMap(k12, true, k13, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap<K, V> tailMap(@InterfaceC37434x3 K k12) {
        return tailMap(k12, true);
    }
}
