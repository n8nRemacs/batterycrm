package com.google.common.collect;

import com.google.common.collect.M2;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;

/* compiled from: ForwardingNavigableMap.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class Q0<K, V> extends W0<K, V> implements NavigableMap<K, V> {

    /* compiled from: ForwardingNavigableMap.java */
    public class a extends M2.AbstractC37296d<K, V> {

        /* compiled from: ForwardingNavigableMap.java */
        /* renamed from: com.google.common.collect.Q0$a$a, reason: collision with other inner class name */
        public class C10664a implements Iterator<Map.Entry<K, V>> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        @Override // com.google.common.collect.M2.AbstractC37296d
        public final Iterator<Map.Entry<K, V>> a0() {
            throw null;
        }

        @Override // com.google.common.collect.M2.AbstractC37296d
        public final NavigableMap<K, V> b0() {
            return null;
        }
    }

    /* compiled from: ForwardingNavigableMap.java */
    public class b extends M2.r<K, V> {
    }

    @Override // com.google.common.collect.W0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public abstract NavigableMap<K, V> X();

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> ceilingEntry(@InterfaceC37434x3 K k12) {
        return X().ceilingEntry(k12);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K ceilingKey(@InterfaceC37434x3 K k12) {
        return X().ceilingKey(k12);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> descendingKeySet() {
        return X().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, V> descendingMap() {
        return X().descendingMap();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> firstEntry() {
        return X().firstEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> floorEntry(@InterfaceC37434x3 K k12) {
        return X().floorEntry(k12);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K floorKey(@InterfaceC37434x3 K k12) {
        return X().floorKey(k12);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, V> headMap(@InterfaceC37434x3 K k12, boolean z12) {
        return X().headMap(k12, z12);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> higherEntry(@InterfaceC37434x3 K k12) {
        return X().higherEntry(k12);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K higherKey(@InterfaceC37434x3 K k12) {
        return X().higherKey(k12);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> lastEntry() {
        return X().lastEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> lowerEntry(@InterfaceC37434x3 K k12) {
        return X().lowerEntry(k12);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K lowerKey(@InterfaceC37434x3 K k12) {
        return X().lowerKey(k12);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> navigableKeySet() {
        return X().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> pollFirstEntry() {
        return X().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> pollLastEntry() {
        return X().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, V> subMap(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
        return X().subMap(k12, z12, k13, z13);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, V> tailMap(@InterfaceC37434x3 K k12, boolean z12) {
        return X().tailMap(k12, z12);
    }
}
